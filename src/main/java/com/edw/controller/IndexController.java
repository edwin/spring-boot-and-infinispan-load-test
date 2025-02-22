package com.edw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

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

    @GetMapping(path = "/")
    public Map index() {
        return new HashMap() {{
            put("hello", "world");
        }};
    }
}
