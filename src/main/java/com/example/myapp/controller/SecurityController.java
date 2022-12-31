package com.example.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
/**
 * SecurityController
 */
public class SecurityController {

  @GetMapping("/")
  public String success() {
    return "success";
  }
}
