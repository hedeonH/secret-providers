package org.mentoring.link.generator.controller;

import org.mentoring.link.generator.service.LinkService;
import org.springframework.web.bind.annotation.*;

@RestController
public class LinkController {

    private final LinkService linkService;

    public LinkController(LinkService linkService) {
        this.linkService = linkService;
    }

    @PostMapping
    public String createRecord(@RequestBody String message) {
        return linkService.create(message);
    }

    @GetMapping
    public String getRecordAndDeleteRecord(@RequestParam String id) {
        return linkService.getRecordAndDeleteRecord(id);
    }
}
