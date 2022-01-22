package com.sidnikhin.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@Configuration
@ComponentScan("com.sidnikhin.spring.aop")
@EnableAspectJAutoProxy

public class MyConfig {
}
