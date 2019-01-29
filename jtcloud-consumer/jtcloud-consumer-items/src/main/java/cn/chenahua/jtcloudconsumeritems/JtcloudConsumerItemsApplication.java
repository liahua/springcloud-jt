package cn.chenahua.jtcloudconsumeritems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableFeignClients(basePackages = "cn.chenahua.jtcloudproviderapiuser.service")
public class JtcloudConsumerItemsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JtcloudConsumerItemsApplication.class, args);
    }

}

