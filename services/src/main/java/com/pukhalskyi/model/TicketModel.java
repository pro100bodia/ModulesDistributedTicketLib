package com.pukhalskyi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TicketModel {
    private Long id;
    private String title;
    private String description;
    private LocalDateTime createdAt;

}
