package com.example.demo.controller;


import com.example.demo.dto.StudentDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/Student")
    public StudentDTO getStudent(){
        return new StudentDTO(178,"ali","hali44@gmail.com");
    }
}
