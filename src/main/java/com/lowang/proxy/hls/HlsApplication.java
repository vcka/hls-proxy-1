package com.lowang.proxy.hls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class HlsApplication {

  public static void main(String[] args) {
    SpringApplication.run(HlsApplication.class, args);
  }
}
