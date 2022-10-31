package org.mentoring.link.generator.service;

import org.mentoring.link.generator.document.LinkDocument;
import org.mentoring.link.generator.repository.LinkRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.UUID;

@Service
public class LinkService {

    private final LinkRepository linkRepository;

    private final EncDecryptionService encDecryptionService;

    public LinkService(LinkRepository linkRepository, EncDecryptionService encDecryptionService) {
        this.linkRepository = linkRepository;
        this.encDecryptionService = encDecryptionService;
    }

    @PostMapping
    public String create(String message) {
        var document = new LinkDocument();
        document.setId(UUID.randomUUID().toString());
        document.setMessage(encDecryptionService.encrypt(message));
        return linkRepository.save(document).getId();
    }

    @GetMapping
    public String getRecordAndDeleteRecord(String id) {
        var linkDocument = linkRepository.findById(id).orElseThrow();
        var message = encDecryptionService.decrypt(linkDocument.getMessage());
        linkRepository.delete(linkDocument);
        return message;
    }
}
