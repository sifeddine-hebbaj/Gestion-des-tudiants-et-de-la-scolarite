package com.idld.resultatservice.Dtos;


import lombok.*;

@Builder
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResultDetails {

        private long studentId;
        private long courseId;
        private double grade;
        private CourseDto course;

        private StudentDto student;

}
