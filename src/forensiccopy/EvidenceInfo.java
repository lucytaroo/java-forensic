/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forensiccopy;

abstract public class EvidenceInfo {
    protected String EvidenceType;
    
    public EvidenceInfo()
    {
        this.EvidenceType="";
        
    }

    public String getEvidenceType() {
        return EvidenceType;
    }

    public void setEvidenceType(String EvidenceType) {
        this.EvidenceType = EvidenceType;
    }

    abstract void EvidenceOutput();
    
}
