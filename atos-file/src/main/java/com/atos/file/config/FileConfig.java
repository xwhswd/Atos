package com.atos.file.config;

import com.atos.file.constants.SwitchConstants;
import com.atos.file.service.FileService;
import com.atos.file.service.impl.FastDfsFileSystemImpl;
import com.atos.file.service.impl.MinioFileServiceImpl;
import com.atos.file.service.impl.OssFileSystemImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author bn
 * @Description 根据参数
 * @create 2024-06-26 10:04
 */
@RefreshScope  //通过refreshScope动态更新配置
@Configuration
public class FileConfig {
    @Bean
    @ConditionalOnProperty(prefix = "file", name = "systemType", havingValue = SwitchConstants.FAST_DFS, matchIfMissing = true)
    public FileService fastDfsFileService() {
        return new FastDfsFileSystemImpl();
    }

    @Bean
    @ConditionalOnProperty(prefix = "file", name = "systemType", havingValue = SwitchConstants.MINIO, matchIfMissing = true)
    public FileService minioFileService() {
        return new MinioFileServiceImpl();
    }

    @Bean
    @ConditionalOnProperty(prefix = "file", name = "systemType", havingValue = SwitchConstants.ALI_OSS, matchIfMissing = true)
    public FileService ossFileService() {
        return new OssFileSystemImpl();
    }
}
