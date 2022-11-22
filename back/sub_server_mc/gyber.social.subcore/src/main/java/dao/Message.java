package dao;

/*
 * Этот класс допишешь , здесь нужны поля которые будут содержать следующие 
 * данные : 
 * 
 * основной текст сообщения , время отправки сообщения , 
 * зашифрованные данные пользователя адрессата сообщения , 
 * статус сообщения доставленно оно или нет , данные отправителя 
 * в частично  зашифрованом виде , . Это основное , далее 
 * напишешь Gyber и спросишь какие параметры еще надо указать в 
 * сообщений и реализуешь их средствами Java 
 * 
 */

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

public class Message {
    private long id;
    private long senderId;
    private long receiverId;
    private String message;
    private ArrayList<File> attachments;    //Списиок файлов для отправки, если есть
    private Date sentAt;

    public Message(long senderId, long receiverId, String message) {
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.message = message;
    }

    public Message(long senderId, long receiverId, String message, ArrayList<File> attachments) {
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.message = message;
        this.attachments = attachments;
    }

    public long getId() {
        return id;
    }

    public long getSenderId() {
        return senderId;
    }

    public void setSenderId(long senderId) {
        this.senderId = senderId;
    }

    public long getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(long receiverId) {
        this.receiverId = receiverId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArrayList<File> getAttachments() {
        return attachments;
    }

    public void setAttachments(ArrayList<File> attachments) {
        this.attachments = attachments;
    }

    public Date getSentAt() {
        return sentAt;
    }

    public void setSentAt(Date sentAt) {
        this.sentAt = sentAt;
    }
}
