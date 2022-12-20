package com.example.demo.controller;

import com.example.demo.service.firstService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor /* Lombok의 기능으로 final이 붙거나 @NotNull이 붙은 필드의 생성자를 자동 생성해주는 Lombok 어노테이션 */
public class firstController {
    private final firstService firstService;

    @GetMapping("/first")
    public Map<String, Object> firstController(){

        return firstService.getFirstData();
    }

}
