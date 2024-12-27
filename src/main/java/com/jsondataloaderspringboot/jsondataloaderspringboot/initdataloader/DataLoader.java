package com.jsondataloaderspringboot.jsondataloaderspringboot.initdataloader;

import com.jsondataloaderspringboot.jsondataloaderspringboot.Database.TestDao;
import com.jsondataloaderspringboot.jsondataloaderspringboot.Entity.TestEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@RequiredArgsConstructor
@Slf4j
public class DataLoader implements ApplicationRunner {

    private final Configurations configurations;
    private final TestDao testDao;

    @Value("${data.load.enabled:true}")
    private Boolean dataInsertEnabled;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if(Boolean.FALSE.equals(dataInsertEnabled)) {
            log.info("......Data Insert Disabled........");
        } else {
            try {

                List<TestEntity> roles = configurations.getPlaceholderModel().getTestDTOs().stream().map(TestEntity::new).toList();
                testDao.save(roles);
                log.info("Initial Data Insert Success");
            } catch (Exception e) {
                log.error("Error during data insert: {}", e.getMessage());
            }
        }
    }
}

