package com.demo.tesseractdemo.controller;

import com.demo.tesseractdemo.service.ExtractionServiceInterface;
import net.sourceforge.tess4j.TesseractException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class FileScannerController {

    @Autowired
    private ExtractionServiceInterface extractionServiceInterface;

    @PostMapping("/extract-text")
    ResponseEntity<String> scanFile(@RequestParam("file") MultipartFile file) throws TesseractException, IOException {
        String text = extractionServiceInterface.extract(file);
        return ResponseEntity.ok().body(text);
    }
}
