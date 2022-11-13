package hosemall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HoseMallApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(HoseMallApplication.class);
    }

//    외부 톰캣 사용 시 오버라이딩
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(HoseMallApplication.class);
//    }
}
