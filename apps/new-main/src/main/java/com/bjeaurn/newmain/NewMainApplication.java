package com.bjeaurn.newmain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.bjeaurn")
public class NewMainApplication {

  public static void main(String[] args) {
    SpringApplication.run(NewMainApplication.class, args);
  }
}
