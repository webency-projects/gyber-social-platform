package security;

import java.security.MessageDigest;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import dao.Message;
import dao.User;
@Component
public class UserDataSecurity {
    /*
     *  Надо  использовать аннотаций @PostConstruct и @PreDestroy
     *  так как мы используем конфигурацию с помощюю  аннотаций  
     */
    // @Bean(initMethod = "init", destroyMethod = "destroy")     


    private MessageDigest messageDigest;
    private User userToChip;



    public UserDataSecurity(){}

    public UserDataSecurity(User user){
        this.userToChip = user;
    }



    @PostConstruct
    public void initSecurityComponents() {
    }


    @PreDestroy
    public void destroySecurityComponents() {
    }

    public boolean secureUserData(User user){
        return false;
    }


    // Пока метод не продуман так как не знаем 
    // какие данные шифровать а какие расшифровывать 
    public boolean unsecureData(){
        return false;
    }


    // public int hashAES256(){
    //     return 0;
    // }
}
