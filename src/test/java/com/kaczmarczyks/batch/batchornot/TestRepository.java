package com.kaczmarczyks.batch.batchornot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface TestRepository extends JpaRepository<TestEntity, Long> {


}
