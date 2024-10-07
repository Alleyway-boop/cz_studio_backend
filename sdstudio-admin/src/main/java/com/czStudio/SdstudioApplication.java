package com.czStudio;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * @author czStudio
 */

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@MapperScan("com.czStudio.**.mapper")
public class SdstudioApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(SdstudioApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  工作室综合服务平台启动成功   ლ(´ڡ`ლ)ﾞ ");
    }
}
