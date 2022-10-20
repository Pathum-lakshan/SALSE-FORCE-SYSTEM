package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ALE IS TER
 * 10/16/2022
 * 9:30 AM
 * Spring-Boot-Demo-Test
 * com.example.demo.dto
 * UserDTO
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {
    private int id;
    private String name;
    private String address;
}
