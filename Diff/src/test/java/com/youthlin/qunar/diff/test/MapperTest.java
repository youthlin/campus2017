package com.youthlin.qunar.diff.test;

import com.youthlin.qunar.diff.model.Different;
import com.youthlin.qunar.diff.service.DifferentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by youthlin.chen on 2016-11-17 017.
 * Test
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class MapperTest {
    private static final Logger log = LoggerFactory.getLogger(MapperTest.class);
    @Resource
    private DifferentService differentService;

    @Test
    public void testPage() {
        List<Different> differences = differentService.findByPageAndUserId(1, 1);
        log.debug("count = {}，differences = {}", differences.size(), differences);
    }
}
