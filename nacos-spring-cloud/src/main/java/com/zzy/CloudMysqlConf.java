package com.zzy;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * <p></p>
 * Created by @author zhezhiyong@163.com on 2018/12/21.
 */
@Data
@ConfigurationProperties(prefix = "kmcloud")
@Component

public class CloudMysqlConf {
    private String url;
    private String username;
    private String password;
}
