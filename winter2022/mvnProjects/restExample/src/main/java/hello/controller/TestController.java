package hello.controller;

import hello.dto.Student;
import hello.dto.StudentCreate;
import hello.service.StudentGenerator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @version 0.0.1
 */
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@Slf4j
public class TestController {

    @GetMapping("/ping")
    public String ping() {
        log.info("run endpoint PING ...");
        return "hello";
    }

}
