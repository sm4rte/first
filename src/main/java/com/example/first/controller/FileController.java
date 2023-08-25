package com.example.first.controller;

import com.example.first.service.FileServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
public class FileController {


    private final FileServiceImpl fileService;

    @GetMapping("/greeting")
    public String sayHello() {
        return "Hello Spring!";
    }

    @PostMapping("/uploadFile")
    public ResponseEntity<String> fileUpload(@RequestParam("file") MultipartFile multipartFile) {
        fileService.fileUpload(multipartFile);
        return ResponseEntity.status(HttpStatus.CREATED).body("File is uploaded successfully!");







        /*File file = new File(Objects.requireNonNull(multipartFile.getOriginalFilename()));
        String name = file.getName();
        String pathString = file.getAbsolutePath();
        String subStr = name.substring(0, 15);
        LocalDateTime dateTime = LocalDateTime.parse(subStr, DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss"));


        FileStorage fileStorage1 = new FileStorage();
        fileStorage1.setFileName(name);
        fileStorage1.setFilePath(pathString);
        fileStorage1.setDateTime(dateTime);
        fileRepository.save(fileStorage1);*/


       /* System.out.println("My subString is: " + subStr);
        System.out.println(dateTime);
        System.out.println(name);
        System.out.println("Path: " + pathString);
        return "File " + name + " is upload successfully!";*//*
        //Timestamp ts = Timestamp.from(Instant.from(dateTime));
        String string = "insert into file(file_name, datetime,file_path)" +
                " values (" + name + ", " + dateTime + ", " + pathString + ");";
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection("spring.datasource.url=jdbc:postgresql://localhost:5432/new");
        //com.example.first.File file1 = new com.example.first.File();
        PreparedStatement ps = connection.prepareStatement(string);
        ps.executeQuery();*/
    }
}
