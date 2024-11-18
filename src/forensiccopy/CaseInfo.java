/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forensiccopy;

public class CaseInfo {
    private String caseID;
    private String Date;
    private String CrimeType;
    private String Location;
    
    
    public CaseInfo()
    {
        this.caseID="123";
        this.Date="123";
        this.CrimeType="123";
        this.Location="123";
        
    }

    public String getCaseID() {
        return caseID;
    }

    public void setCaseID(String caseID) {
        this.caseID = caseID;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getCrimeType() {
        return CrimeType;
    }

    public void setCrimeType(String CrimeType) {
        this.CrimeType = CrimeType;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }
    
    
}
