package cn.chenahua.jtcloudproviderapiuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class JtcloudProviderItemsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JtcloudProviderItemsApplication.class, args);
    }

}

