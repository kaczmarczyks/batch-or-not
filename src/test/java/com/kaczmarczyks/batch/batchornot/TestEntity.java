package com.kaczmarczyks.batch.batchornot;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class TestEntity {

    @Id
    @GeneratedValue
    private Long Id;
    private String property1;
    private String property2;
    private String property3;
    private String property4;
    private String property5;
    private String property6;
    private String property7;
    private String property8;


    TestEntity() {
        property1 = "Simple";
        property2 = "Entity";
        property3 = "To";
        property4 = "Test";
        property5 = "Some";
        property6 = "Hibernate";
        property7 = "Batching";
        property8 = "!";
    }

}
