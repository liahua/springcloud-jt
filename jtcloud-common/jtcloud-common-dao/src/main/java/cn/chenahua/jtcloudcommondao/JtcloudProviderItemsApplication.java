package cn.chenahua.jtcloudcommondao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class JtcloudProviderItemsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JtcloudProviderItemsApplication.class, args);
    }

}

