package com.example.springmvc.DTO;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class ClubDTO {

    private Long id;
    private String title;
    private String photoURL;
    private String content;
    private LocalDate createdOn;
    private LocalDate updatedOn;

}
