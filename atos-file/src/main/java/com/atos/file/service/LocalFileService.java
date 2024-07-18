package com.atos.file.service;

import com.atos.file.domain.LocalFile;

import java.util.List;

/**
 * @author bn
 * @Description 本地文件操作
 * @create 2024-07-18 14:37
 */
public interface LocalFileService {

    /**
     * 文件查询
     */
    List<LocalFile> getLocalFiles(String msg);


}
