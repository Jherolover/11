package com.elite.App;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//引入配置文件
//@ImportResource("classpath:spring/spring-util.xml")
//@ComponentScan("com.elite.App.controller")
@MapperScan("com.elite.App.mapper")
//开启事务管理
@EnableTransactionManagement
@EnableJpaRepositories
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
