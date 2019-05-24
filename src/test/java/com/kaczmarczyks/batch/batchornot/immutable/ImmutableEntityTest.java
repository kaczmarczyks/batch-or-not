package com.kaczmarczyks.batch.batchornot.immutable;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

import static com.kaczmarczyks.batch.batchornot.immutable.ImmutableEntity.FIND_ALL;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ImmutableEntityTest {


    @PersistenceContext
    EntityManager entityManager;

    @Test
    @Transactional
    public void testThat_updatingImmutableEntityIsIgnored() {

        //given
        ImmutableEntity immutableEntity = new ImmutableEntity(null, "original value");

        entityManager.persist(immutableEntity);

        TypedQuery<ImmutableEntity> query = entityManager.createNamedQuery(FIND_ALL, ImmutableEntity.class);
        List<ImmutableEntity> resultList = query.getResultList();
        ImmutableEntity originalSavedEntity = resultList.get(0);

        //when
        String newValue = "modified value";
        ImmutableEntity toBeMutated = new ImmutableEntity(originalSavedEntity.getId(), newValue);
        entityManager.merge(toBeMutated);
        ImmutableEntity mutetedEntity = query.getResultList().get(0);

        //then
        assertThat(mutetedEntity.getId()).isEqualTo(originalSavedEntity.getId());
        assertThat(mutetedEntity.getProperty1()).isNotEqualTo("modifiedValue")
                .as("hibernate ignores update on immutable entities");

    }

}