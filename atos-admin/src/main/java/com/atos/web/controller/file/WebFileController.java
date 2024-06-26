package com.atos.web.controller.file;

import com.atos.common.core.domain.AjaxResult;
import com.atos.file.service.FileService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author bn
 * @Description 网络文件操作控制层
 * @create 2024-06-26 15:15
 */
@RestController
public class WebFileController {

    //文件操作
    @Resource
    private FileService fileService;

    //文件上传(不落库)
    public AjaxResult uploadFile(){
        return null;
    }


    //文件上传(落库)
    public AjaxResult uploadFileToSql(){
        return null;
    }

    //文件查询
    public AjaxResult getFileList(){
        return null;
    }



    //文件重命名
    public AjaxResult renameFile(){
        return null;
    }
}
