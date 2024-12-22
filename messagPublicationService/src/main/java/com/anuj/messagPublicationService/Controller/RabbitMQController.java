package com.anuj.messagPublicationService.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
public class RabbitMQController {

    @GetMapping
    public ResponseEntity<String> sendMessage(String message)
    {
        return new ResponseEntity<String>("Message publish sucessfully", HttpStatus.OK);
    }
}
