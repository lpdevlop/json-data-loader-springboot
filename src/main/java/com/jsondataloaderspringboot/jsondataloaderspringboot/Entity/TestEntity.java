package com.jsondataloaderspringboot.jsondataloaderspringboot.Entity;


import com.jsondataloaderspringboot.jsondataloaderspringboot.dto.TestDTO;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor

public class TestEntity {

    private String name;

    private Integer id;

    public TestEntity(TestDTO testDTO) {
    }
}
