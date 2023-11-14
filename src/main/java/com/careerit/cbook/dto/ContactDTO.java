package com.careerit.cbook.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ContactDTO {
        private UUID id;
        private String name;
        private String email;
        private String mobile;
        private LocalDate dob;
        private boolean deleted;
}
