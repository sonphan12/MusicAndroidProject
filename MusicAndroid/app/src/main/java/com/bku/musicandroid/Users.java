package  com.bku.musicandroid;

import java.util.Date;

/**
 * Created by Administrator on 3/21/2018.
 */

public class Users {

    public String dateOfBirth;
    public String fullName;
    public String userName;
    public String email;
    public String avatarURL;

    public Users(String newUserName, String newEmail, String newFullName,String newAvatarURL,String newDateOfBirth) {
        this.userName=newUserName;
        this.email=newEmail;
        this.fullName=newFullName;
        this.avatarURL=newAvatarURL;
        this.dateOfBirth=newDateOfBirth;
    }

    public Users(){

    }

    public String getUserName(){return userName;}

    public String getEmail(){return email;}

    public String getFullName(){return fullName;}

    public String getAvatarURL(){return avatarURL;}

    public String getDateOfBirth(){return dateOfBirth;}




}

