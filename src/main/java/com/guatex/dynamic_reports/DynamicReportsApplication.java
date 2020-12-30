package com.guatex.dynamic_reports;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guatex.dynamic_reports.ctrls.QuerysCtrls;

@SpringBootApplication
@RestController
@RequestMapping("/dynamic_reports")
public class DynamicReportsApplication {

    public static void main(String[] args) {
	SpringApplication.run(DynamicReportsApplication.class, args);
    }

    @PostMapping("/execQuery")
    public String execQuery(@RequestBody String query) {
	return new QuerysCtrls().RealizarConsulta(query);
    }
}
