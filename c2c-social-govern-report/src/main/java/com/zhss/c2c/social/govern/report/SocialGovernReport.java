package com.zhss.c2c.social.govern.report;

import com.zhss.c2c.social.govern.report.db.DruidDataSourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(DruidDataSourceConfig.class)
public class SocialGovernReport {

    public static void main(String[] args) {
        SpringApplication.run(SocialGovernReport.class, args);
    }

}
