/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forensiccopy;

import java.util.Scanner;

public class PoliceInfo extends CrimeInfo{
    Scanner scan = new Scanner(System.in);
    String StationLocation;
    public PoliceInfo()
    {
        super();
        this.StationLocation="";
       
    }
    
    public PoliceInfo(String StationLocation)
    {
        this.StationLocation=StationLocation;
    }

    public String getStationLocation() {
        return StationLocation;
    }

    public void setStationLocation(String StationLocation) {
        this.StationLocation = StationLocation;
    }
    
}
