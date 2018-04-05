package com.greenfoxacademy.hellobeanworld;

import com.greenfoxacademy.hellobeanworld.colors.Blue;
import com.greenfoxacademy.hellobeanworld.colors.Green;
import com.greenfoxacademy.hellobeanworld.colors.MyColor;
import com.greenfoxacademy.hellobeanworld.colors.Red;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloBeanWorldApplication implements CommandLineRunner {
  @Autowired
  Printer printer;
  @Autowired
  MyColor myColor;


  public static void main(String[] args) {
    SpringApplication.run(HelloBeanWorldApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("Hello");
    myColor.printColor();

  }
}
