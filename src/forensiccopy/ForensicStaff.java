/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forensiccopy;

public class ForensicStaff {
    private String username = "forensicstaff";
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
    
 
    public boolean login(String StaffUsername, String StaffPassword)
    {
        username = "forensic";
        userpass = "123";
        
        return username.equals(StaffUsername) && userpass.equals(StaffPassword);
    }
}
