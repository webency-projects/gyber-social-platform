package security;

import java.security.Key;
import java.security.MessageDigest;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.crypto.Cipher;

import org.springframework.stereotype.Component;
import dao.User;

@Component
public class UserDataSecurity {
    private MessageDigest objectProvidingOneWayEncryption;
    private Cipher objectProvidingTwoWayEncryption;
    private Key encDecKey;
    



    private User userToChip;



    public UserDataSecurity(){}

    public UserDataSecurity(User user){
        this.userToChip = user;
    }



    @PostConstruct
    public void initSecurityComponents() {
        try{
            this.objectProvidingOneWayEncryption = MessageDigest.getInstance("SHA-512");
            this.objectProvidingTwoWayEncryption = Cipher.getInstance("AES/CBC/PKCS5Padding");


        }catch(Exception e){
            e.printStackTrace();
        }

    }


    @PreDestroy
    public void destroySecurityComponents() {
    }

    public boolean encryptUserData(User user){
        return false;
    }


    // Пока метод не продуман так как не знаем 
    // какие данные шифровать а какие расшифровывать 
    public boolean decryptUserData(){
        return false;
    }


    // public int hashAES256(){
    //     return 0;
    // }
}
