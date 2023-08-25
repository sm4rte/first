package com.example.first.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
    void fileUpload(MultipartFile multipartFile);
}
