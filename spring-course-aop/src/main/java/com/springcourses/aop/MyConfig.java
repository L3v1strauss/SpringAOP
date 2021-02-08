package com.springcourses.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.springcourses.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
