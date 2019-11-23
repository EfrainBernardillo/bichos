package com.example.myapplication.mobil;

import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Users {
    public String username;
    public String password;

    public static Boolean passwordisValid(String Users, String password) {
        for (Users i: getUsers()) {
            if (i.username.equals(Users))  {
                if (i.password.equals(password)){
                    return true;
                }
            }
        }
        return false;
    }

    public static List<Users> getUsers(){
        List<Users> list = new ArrayList<Users>();
        Users o = new Users();
        o.username = "bichito";
        o.password = "123456";
        list.add(o);

        Users t = new Users();
        t.username = "efrain";
        t.password = "123456";
        list.add(t);
        return list;
    }
}
