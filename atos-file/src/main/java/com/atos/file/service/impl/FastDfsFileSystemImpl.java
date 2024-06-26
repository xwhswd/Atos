package com.atos.file.service.impl;

import com.atos.file.service.FileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author bn
 * @Description FastFds文件操作实体类
 * @create 2024-06-26 10:26
 */
@Service
public class FastDfsFileSystemImpl implements FileService {
    @Override
    public String upload(MultipartFile file) {
        return null;
    }

    @Override
    public byte[] download(String fileName) {
        return new byte[0];
    }

    @Override
    public boolean delete(String fileName) {
        return false;
    }
}
