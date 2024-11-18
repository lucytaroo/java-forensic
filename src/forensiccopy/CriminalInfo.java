/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forensiccopy;

import java.util.Scanner;

public class CriminalInfo extends CrimeInfo {
    Scanner scan = new Scanner(System.in);
    protected CriminalAgg CAgg;
    
    public CriminalInfo(CriminalAgg CAgg)
    {
        super();
        this.CAgg = CAgg;
    }

}
