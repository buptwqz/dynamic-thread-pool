package cn.wqz;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Author: Qizheng Wang
 * Email:  879680229@qq.com
 * Date:   2025/3/2 上午10:12
 * GitHub: https://github.com/buptwqz
 * Description:
 **/
@SpringBootApplication
@Configurable
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
