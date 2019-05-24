package com.kaczmarczyks.batch.batchornot.immutable;

import lombok.Getter;
import org.hibernate.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import static com.kaczmarczyks.batch.batchornot.immutable.ImmutableEntity.FIND_ALL;

@Entity
@NamedQuery(name = FIND_ALL, query = "select ie from ImmutableEntity ie")
@Immutable
@Getter
public class ImmutableEntity {

    public static final String FIND_ALL = "findAll";
    @Id
    @GeneratedValue
    private Long id;
    private String property1;

    ImmutableEntity(Long id, String property1) {
        this.id = id;
        this.property1 = property1;

    }

    ImmutableEntity() {
    }

}
