package com.xkcoding.task.xxl.job.task;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import static com.xxl.job.core.biz.model.ReturnT.SUCCESS;

@Slf4j
@Component
public class DemoTask2 {

    @XxlJob("jobDemo")
    public ReturnT<String> jobDemo(String string) throws Exception {
        log.info("XXL-JOB,HELLO WORLD");
//        log.info("任务参数是: "+  string);
        // 获取参数
        String param = XxlJobHelper.getJobParam();
        String[] methodParams = param.split(",");

        log.info("执行日期...[{}]", methodParams[0]);
        log.info("执行标识...[{}]", methodParams[1]);
        log.info("表名称 ...[{}]", methodParams[2]);
        log.info("管理机构...[{}]", methodParams[3]);
        log.info("执行场景...[{}]", methodParams[4]);

//        for (int i = 0; i < 10; i++) {
//            System.out.println("excuting......");
//            Thread.sleep(2000);
//        }
        return SUCCESS;
    }
}
