package com.BMS_backend.BookYourShow.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDto {
    private String userName;
    private String mobileNo;

    List<String> seats;
}
