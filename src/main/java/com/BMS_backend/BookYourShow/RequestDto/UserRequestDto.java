package com.BMS_backend.BookYourShow.RequestDto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class UserRequestDto {
    private String name;
    @Column(unique = true)
    private String mobile;
}
