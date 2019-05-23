package com.kaczmarczyks.batch.batchornot;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

class BaseRepositoryTest {

    private static final long SAVE_REPETITONS = 100000;

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    private TestRepository repository;

    long save(EntityManager entityManager, boolean shouldFlush, boolean shouldClear) {
        long startTime = System.currentTimeMillis();
        long i = 0;
        while (i++ < SAVE_REPETITONS) {
            repository.save(new TestEntity());
            if (shouldFlush && i % 1000 == 0) {
                entityManager.flush();
                if (shouldClear) {
                    entityManager.clear();
                }
            }

        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }


}
