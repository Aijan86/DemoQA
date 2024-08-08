package com.demoqa.entities;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder

public class PracticeFormEntity {
        private String firstName;
        private String lastName;
        private String userMail;
        private String mobileNumber;
        private String date;
        private String subjects;
        private String picture;
        private String address;
        private String state;
        private String city;


}
