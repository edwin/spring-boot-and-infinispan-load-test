package com.edw.controller;

import com.edw.bean.GenMdSidMappingEntity;
import com.edw.helper.CacheHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * <pre>
 *  com.edw.controller.IndexController
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 22 Feb 2025 16:12
 */
@RestController
public class IndexController {

    private CacheHelper cacheHelper;
    private List<Long> list = new ArrayList();

    @Autowired
    public IndexController(CacheHelper cacheHelper) {
        this.cacheHelper = cacheHelper;

        for (int i = 0; i < 10000; i++) {
            list.add(new Random().nextLong());
        }
    }

    @GetMapping(path = "/")
    public Map index() {
        return new HashMap() {{
            put("hello", "world");
        }};
    }

    @GetMapping(path = "/generate-data")
    public Map generateData() {

        for (Long mappingId : list) {
            cacheHelper.save(new GenMdSidMappingEntity(UUID.randomUUID().toString(), new Date(), "approvedBy" , new Date(), "checkedBy", new Date(), "modifiedBy",
                    new Date(), "createdBy", new Random().nextLong(), 'c', new Random().nextLong(), "tradingId", "sidCode",
                    new Random().nextLong(), mappingId));
        }

        return new HashMap() {{
            put("status", "success");
        }};
    }

    @GetMapping(path = "/generate-get")
    public Map generateGet() {

        for (Long mappingId : list) {
            System.out.println(cacheHelper.get(mappingId));
        }

        return new HashMap() {{
            put("status", "success");
        }};
    }
}
