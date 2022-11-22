package dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Repository;

import security.UserDataSecurity;

@Repository
public class UserDao {
    

    private User user;
    private UserDataSecurity security;
    


    @PostConstruct
    public void initUserDaoData(){

    }


    @PreDestroy
    public void destroyUserDaoData(){

    }


    public boolean create(){
        return false;
    }

    public boolean read(){
        return false;
    }


    public boolean update(){
        return false;
    }

    public boolean delete(){
        return false;
    }

}
