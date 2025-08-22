package pr.templatespringboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/index")
    public ResponseEntity<String> index() {
        return ResponseEntity.ok("Hello, World!");
    }
}
