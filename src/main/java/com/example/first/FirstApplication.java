package com.example.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;

@SpringBootApplication
public class FirstApplication {

    public static void main(String[] args) throws ParseException {
        SpringApplication.run(FirstApplication.class, args);





        /* *//*String subStr = "15062022";
        LocalDate date = LocalDate.parse(subStr,DateTimeFormatter.ofPattern("ddMMyyyy"));*//*

        String subStr = "2015-05-05 10:15:30";
        String str = "15062022_110228";
        LocalDateTime dateTime = LocalDateTime.parse(str,DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss"));
        *//*String subStr = "15062022";
        LocalDate date = LocalDate.parse(subStr,DateTimeFormatter.ofPattern("ddMMyyyy"));*//*

         *//* String dateInString = "19590709";
        LocalDate date = LocalDate.parse(dateInString, DateTimeFormatter.BASIC_ISO_DATE);*//*
        System.out.println(dateTime);
        //String datePattern = "ddMMyyyy";



        *//*SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);
        Date date = simpleDateFormat.parse("13032013");
        System.out.println(date);*//*
        //DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(datePattern);*/
    }

}
