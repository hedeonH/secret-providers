package org.mentoring.link.generator.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "link")
//todo find annotation for custom _class field
@Data
public class LinkDocument {

    @Id
    private String id;

    String message;
}
