package com.atos.file.domain;

import lombok.Data;

/**
 * @author bn
 * @Description 本地文件类
 * @create 2024-07-18 14:38
 */
@Data
public class LocalFile {

    /**
     * 文件名
     */
    private String name;
    /**
     * 文件地址
     */
    private String path;
    /**
     * 文件大小
     */
    private long size;
    /**
     * 占用空间大小
     */
    private long space;
    /**
     * 文件类型
     */
    private String type;
    /**
     * 文件后缀
     */
    private String suffix;
    /**
     * 创建时间
     */
    private String creationTime;
    /**
     * 修改时间
     */
    private String lastModifiedTime;
    /**
     * 访问时间
     */
    private String lastVisitTime;
    /**
     * 是否是文件夹
     */
    private boolean isDirectory;
    /**
     * 是否是普通文件
     */
    private boolean isRegularFile;
    /**
     * 是否是快捷方式(链接)
     */
    private boolean isSymbolicLink;
    /**
     * 是否可读
     */
    private boolean isReadable;
    /**
     * 是否可写
     */
    private boolean isWritable;
    /**
     * 是否可执行
     */
    private boolean isExecutable;
    /**
     * 判断文件是否存在
     */
    private boolean exists;

}
