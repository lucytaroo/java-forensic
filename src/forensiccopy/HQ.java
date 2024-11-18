/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forensiccopy;

public class HQ {
    private String username = "hq";
    private String userpass = "123";
    private String useremail;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }
    
 
    public boolean login(String hqUsername, String hqPassword)
    {
        username = "hq";
        userpass = "123";
        
        return username.equals(hqUsername) && userpass.equals(hqPassword);
    }
}
