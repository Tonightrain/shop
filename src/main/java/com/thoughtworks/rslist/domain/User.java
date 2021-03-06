package com.thoughtworks.rslist.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Size(max = 8)
    @NotNull
    private String name;

    @NotNull
    private String gender;

    @Max(100)
    @Min(18)
    @NotNull
    private Integer age;

    @Email
    private String email;

    @Pattern(regexp = "1\\d{10}")
    private String phone;
    @Builder.Default
    private int voteNum =10;

    public User(String name, String gender, int age, String email, String phone,int voteNum){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.voteNum = voteNum;

    }
}

