package com.bjeaurn.newmain;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bjeaurn.library.librarydemo.*;

@RestController
public class HelloController {

  private final HelloService helloService;

  public HelloController(HelloService helloService) {
      this.helloService = helloService;
  }

  @GetMapping("/")
  public String greeting() {
    return helloService.message();
  }
}
