package com.atos.file.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author bn
 * @Description 文件操作服务层
 * @create 2024-06-26 10:19
 */
public interface FileService {


    /**
     * 文件上传
     * @param file
     * @return
     */
    String upload(MultipartFile file);

    /**
     * 文件下载
     * @param fileName
     * @return
     */
    byte[] download(String fileName);

    /**
     * 文件删除
     * @param fileName
     * @return
     */
    boolean delete(String fileName);
}
