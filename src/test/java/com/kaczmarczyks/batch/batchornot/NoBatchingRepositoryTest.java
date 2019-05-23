package com.kaczmarczyks.batch.batchornot;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class NoBatchingRepositoryTest extends BaseRepositoryTest {

    @Test
    @Transactional
    @Repeat(5)
    public void save_with_flush_and_no_clear_test() {
        long runningTime = save(entityManager, true, false);
        log.info("save_with_flush_and_no_clear_test took \t{} ms", runningTime);
    }

    @Test
    @Transactional
    @Repeat(5)
    public void save_with_flush_and_clear_test() {
        long runningTime = save(entityManager, true, true);
        log.info("save_with_flush_and_clear_test took \t\t{} ms", runningTime);
    }

    @Test
    @Repeat(5)
    public void save_non_transactional_test() {
        long runningTime = save(null, false, false);
        log.info("save_non_transactional_test took \t\t\t{} ms", runningTime);
    }

    @Test
    @Transactional
    @Repeat(5)
    public void save_with_no_flush_nor_clear_test() {
        long runningTime = save(entityManager, false, false);
        log.info("save_with_no_flush_nor_clear_test took \t{} ms", runningTime);
    }

}
