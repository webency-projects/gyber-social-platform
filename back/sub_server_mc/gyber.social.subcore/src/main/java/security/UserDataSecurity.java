package security;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component
public class UserDataSecurity {
    @Bean(initMethod = "init", destroyMethod = "destroy")

    public void init() {
    }

    public void destroy() {
    }

    public int hashSHA1(){
        return 0;
    }
    public int hashSHA256(){
        return 0;
    }
    public int hashAES256(){
        return 0;
    }
}
