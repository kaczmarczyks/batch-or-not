package com.kaczmarczyks.batch.batchornot;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@SpringBootTest()
@ActiveProfiles("batching")
@RunWith(SpringRunner.class)
@Slf4j
public class BatchingRepositoryTest extends BaseRepositoryTest {

    @Test
    @Transactional
    @Repeat(5)
    public void batchingsave_with_flush_and_no_clear_test() {
        long runningTime = save(entityManager, true, false);
        log.info("batching_save_with_flush_and_no_clear_test took \t{} ms", runningTime);
    }

    @Test
    @Transactional
    @Repeat(5)
    public void batching_save_with_flush_and_clear_test() {
        long runningTime = save(entityManager, true, true);
        log.info("batching_save_with_flush_and_clear_test took \t\t{} ms", runningTime);
    }

    @Test
    @Transactional
    @Repeat(5)
    public void batching_save_with_no_flush_nor_clear_test() {
        long runningTime = save(entityManager, false, false);
        log.info("batching_save_with_no_flush_nor_clear_test took \t{} ms", runningTime);
    }



}
