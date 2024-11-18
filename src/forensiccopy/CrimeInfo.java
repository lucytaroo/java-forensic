/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forensiccopy;

public class CrimeInfo {
    String Name;
    int Age;
    String Gender;
    private CaseInfo caseinfo;
    private EvidenceInfo Evi;
    
    public CrimeInfo(CaseInfo caseinfo)
    {
        this.caseinfo=caseinfo;
    }
    

    public CrimeInfo()
    {
        this.Name="";
        this.Age=0;
        this.Gender="";
         
    }
    
    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public CaseInfo getCaseinfo() {
        return caseinfo;
    }

    public void setCaseinfo(CaseInfo caseinfo) {
        this.caseinfo = caseinfo;
    }

    public EvidenceInfo getEvi() {
        return Evi;
    }

    public void setEvi(EvidenceInfo Evi) {
        this.Evi = Evi;
    }
    
    
    
}
