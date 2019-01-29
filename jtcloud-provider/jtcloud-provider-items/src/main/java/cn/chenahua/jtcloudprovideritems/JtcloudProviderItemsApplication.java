package cn.chenahua.jtcloudprovideritems;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication(scanBasePackages = {"cn.chenahua"})
@MapperScan({"cn.chenahua.**.mapper"})
@EnableEurekaClient
public class JtcloudProviderItemsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JtcloudProviderItemsApplication.class, args);
    }

}

