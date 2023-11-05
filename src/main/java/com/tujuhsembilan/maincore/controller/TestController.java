package com.tujuhsembilan.maincore.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin (origins = "http://localhost:3000")
@RequestMapping("/test")
public class TestController {
    
  @GetMapping
  public ResponseEntity<Object> test() {
    return ResponseEntity.ok("Hello World");
  }
}
