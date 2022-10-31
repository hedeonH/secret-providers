package provider.controller;

import org.springframework.web.bind.annotation.*;
import provider.service.MessageService;

@RestController
@RequestMapping("/api")
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping
    public String secureMessage(@RequestBody String message) {
      return   messageService.secureMessage(message);
    }

    @GetMapping("/{id}")
    public String getSecretMessage(@PathVariable String id){
        return messageService.getSecretMessage(id);
    }
}
