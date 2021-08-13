package com.example.tkddlab1_ps16752.ASM.DAO;

public interface ILoginDAO{

    Boolean insertData(String username, String password);
    Boolean checkusername(String username);
    Boolean checkusernamepassword(String username, String password);

}
