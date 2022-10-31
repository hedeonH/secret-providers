package org.mentoring.link.generator.repository;

import org.mentoring.link.generator.document.LinkDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkRepository extends MongoRepository<LinkDocument, String> {
}
