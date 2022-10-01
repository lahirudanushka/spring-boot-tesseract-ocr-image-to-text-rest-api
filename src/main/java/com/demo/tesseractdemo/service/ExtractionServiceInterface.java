package com.demo.tesseractdemo.service;

import net.sourceforge.tess4j.TesseractException;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ExtractionServiceInterface {
    String extract(MultipartFile file) throws IOException, TesseractException;
}
