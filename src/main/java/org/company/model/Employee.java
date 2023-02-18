package org.company.model;

import lombok.*;
import org.company.model.enums.Position;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Employee {

    private Long id;

    private String name;

    private String surname;

    private Position position;
}
