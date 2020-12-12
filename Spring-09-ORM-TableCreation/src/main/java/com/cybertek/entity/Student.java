package com.cybertek.entity;

import com.cybertek.enums.Gender;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autogenerates the id
    private Long id;

    @Column(name = "studentFirstName")
    private String firstName; // in the db first_name

    @Column(name = "studentLastName")
    private String lastName;

    @Column(name = "studentEmailAddress")
    private String email;

    @Transient //to hide the column in the table
    private String city;

    //before java 8
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Temporal(TemporalType.TIME)
    private Date birthTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDateTime;

    //after java 8
    @Column(columnDefinition = "Date")
    private LocalDate localDate;
    @Column(columnDefinition = "Time")
    private LocalTime localTime;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime localDateTime;

    //by default it will be as int(0 or 1 so we need add @@Enumerated(EnumType.STRING) to parse
    @Enumerated(EnumType.STRING)
    private Gender gender;

}
