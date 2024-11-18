/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forensiccopy;

public class EvidenceDetail extends EvidenceInfo{
    private int EvidenceTotal;
    private String EvidenceLocation;
    
    public EvidenceDetail()
    {
        this.EvidenceTotal=0;
        this.EvidenceLocation="";
    }

    public int getEvidenceTotal() {
        return EvidenceTotal;
    }

    public void setEvidenceTotal(int EvidenceTotal) {
        this.EvidenceTotal = EvidenceTotal;
    }

    public String getEvidenceLocation() {
        return EvidenceLocation;
    }

    public void setEvidenceLocation(String EvidenceLocation) {
        this.EvidenceLocation = EvidenceLocation;
    }
    
    @Override
    public void EvidenceOutput()
    {
        System.out.println("Evidence Total: " + getEvidenceTotal());
        System.out.println("Evidence Location: " + getEvidenceLocation());
    }
}
