package com.example.first.service;

import com.example.first.FileRepository;
import com.example.first.FileStorage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class FileServiceImpl implements FileService{

    private final FileRepository fileRepository;

    @Override
    public void fileUpload(MultipartFile multipartFile) {
        File file = new File(Objects.requireNonNull(multipartFile.getOriginalFilename()));
        String name = file.getName();
        String pathString = file.getAbsolutePath();
        String subStr = name.substring(0, 15);
        String pattern = "ddMMyyyy_HHmmss";
        LocalDateTime dateTime = LocalDateTime.parse(subStr, DateTimeFormatter.ofPattern(pattern));

        FileStorage fileStorage1 = new FileStorage();
        fileStorage1.setFileName(name);
        fileStorage1.setFilePath(pathString);
        fileStorage1.setDateTime(dateTime);
        fileRepository.save(fileStorage1);
    }
}
