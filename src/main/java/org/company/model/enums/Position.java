package org.company.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Position {

    DEVELOPER("Developer"),
    SCRUM_MASTER("Scrum Master"),
    PRODUCT_OWNER("Product Owner");

    private String value;
}
