package com.example.test_oracle;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {
  @Autowired
  private TestRepo testRepo;

  @GetMapping("/aa")
  public String testName() {
    return "gg";
  }

  @GetMapping("/test")
  public List<Test> getMethodName() {
    return testRepo.findAll();
  }

  @GetMapping("/go")
  public ResponseEntity<Void> getGo() {
    Test test = new Test(1L, "goo");
    testRepo.save(test);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
