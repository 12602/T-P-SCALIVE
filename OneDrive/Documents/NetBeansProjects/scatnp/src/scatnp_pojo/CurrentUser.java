/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scatnp_pojo;

/**
 *
 * @author LENOVO
 */
public class CurrentUser {

    public static String getUserid() {
        return Userid;
    }

    public static void setUserid(String Userid) {
        CurrentUser.Userid = Userid;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        CurrentUser.id = id;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        CurrentUser.name = name;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        CurrentUser.password = password;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        CurrentUser.type = type;
    }
    public static String  Userid;
    public static String id;
    public static String name;
    public static String password;
    public static String type;
    
}
