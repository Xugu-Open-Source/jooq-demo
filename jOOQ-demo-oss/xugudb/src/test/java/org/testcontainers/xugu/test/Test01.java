package org.testcontainers.xugu.test;

import org.jooq.Record2;
import org.jooq.Result;
import org.junit.Test;
import org.testcontainers.utils.XuguAbstractDemo;


/**
 * @Classname Test01
 * @Description TODO
 * @Date 2024/9/9 10:01
 * @Created by admin
 */
public class Test01 extends XuguAbstractDemo {

    @Test
    public void fetchDual() {
        title("A simple SELECT 1 FROM DUAL (if needed)");
        println(ctx.selectOne().fetch());

        // Turn on debug logging to see contents
    }

}
