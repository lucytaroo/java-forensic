/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forensiccopy;

import java.util.Scanner;

public class ForensicCopy {

    public static void main(String[] args) {
        frame1 f1 = new frame1();
        f1.setVisible(true);
        
        Scanner scan = new Scanner(System.in);
        
        ForensicStaff forensicStaff = new ForensicStaff();
        HQ hq = new HQ();

        System.out.println("Enter amount of Case: ");
        int y = scan.nextInt();
        scan.nextLine(); //avoid skipped next Input
        
        CaseInfo[] C = new CaseInfo[y];  
        EvidenceInfo[] Ev = new EvidenceInfo[y];   //abstraction
        CrimeInfo[] Ci2 = new CrimeInfo[y]; 
        CriminalAgg[] Ca = new CriminalAgg[y];
        CrimeInfo[] Cri2 = new CriminalInfo[y];    
        CrimeInfo[] Vi2 = new VictimInfo[y];             
        CrimeInfo[] Pi2 = new PoliceInfo[y];     
        CrimeInfo[] Fs2 = new ForensicStaffInfo[y];     
        
        int i = 0;
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("");
            System.out.println("Welcome to Forensic System");
            System.out.println("1. Forensic Staff");
            System.out.println("2. HQ");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            scan.nextLine(); // Consume the newline character
            
            switch (choice) {
                case 1:
                    System.out.println("-------------------------------------------------");
                    System.out.print("Enter Staff username: ");
                    String StaffUsername = scan.nextLine();
                    System.out.print("Enter Staff password: ");
                    String StaffPassword = scan.nextLine();
                    if (forensicStaff.login(StaffUsername, StaffPassword)) {
                        
                        System.out.println("");
                        System.out.println("Staff logged in successfully.");
                        System.out.println("");
                        boolean StaffLoggedIn = true;

                        while (StaffLoggedIn) {
                            System.out.println("Forensic Staff Tasks:");
                            System.out.println("1. New Case");
                            System.out.println("2. View Case");
                            System.out.println("3. Back");
                            System.out.print("Enter your choice: ");
                            int StaffChoice = scan.nextInt();
                            scan.nextLine(); // Consume the newline character
                            
                            switch (StaffChoice) {
                                case 1:
                                    
                                    System.out.println("");
                                    System.out.println("--------------New Case--------------");
                                    System.out.println("--------------Case Info--------------");
        
                                    C[i]=new CaseInfo();
        
                                    System.out.println("Case ID: ");
                                    C[i].setCaseID(scan.nextLine()); 
                                    System.out.println("Date: ");
                                    C[i].setDate(scan.nextLine()); 
                                    System.out.println("Crime Type: ");
                                    C[i].setCrimeType(scan.nextLine());
                                    System.out.println("Location: ");
                                    C[i].setLocation(scan.nextLine()); 
                                    System.out.println("");
       
                                    System.out.println("-------------Criminal Info--------------");
        
                                    Ca[i] = new CriminalAgg();
                                    Cri2[i]=new CriminalInfo(Ca[i]);
        
                                    System.out.println("Criminal Name: ");
                                    Cri2[i].setName(scan.nextLine()); 
                                    System.out.println("Criminal Age: ");
                                    Cri2[i].setAge(scan.nextInt()); 
                                    scan.nextLine(); //avoid skipped next Input
                                    System.out.println("Criminal Gender: ");
                                    Cri2[i].setGender(scan.nextLine()); 
                                    System.out.println("Criminal From: ");
                                    Ca[i].setFrom(scan.nextLine()); 
        
                                    System.out.println("-------------Victim Info--------------");
                                    Vi2[i]=new VictimInfo();
                                    System.out.println("Victim Name: ");
                                    Vi2[i].setName(scan.nextLine());
                                    System.out.println("Victim Age: ");
                                    Vi2[i].setAge(scan.nextInt());
                                    scan.nextLine(); //avoid skipped next Input
                                    System.out.println("Victim Gender: ");
                                    Vi2[i].setGender(scan.nextLine());

                                    //((VictimInfo)Ci2[i]).setGender(scan.nextLine());

        
                                    System.out.println("-------------Police Info--------------");
                                    Pi2[i]=new PoliceInfo();
                                    System.out.println("Police Name: ");
                                    Pi2[i].setName(scan.nextLine());
                                    System.out.println("Police Age: ");
                                    Pi2[i].setAge(scan.nextInt());
                                    scan.nextLine(); //avoid skipped next Input
                                    System.out.println("Police Gender: ");
                                    Pi2[i].setGender(scan.nextLine());
                                    System.out.println("Police Station Location: " );
                                    ((PoliceInfo)Pi2[i]).setStationLocation(scan.nextLine());


                                    System.out.println("-------------Forensic Staff Info--------------");
                                    Fs2[i]=new ForensicStaffInfo();
                                    System.out.println("Staff Name: ");
                                    Fs2[i].setName(scan.nextLine());
                                    System.out.println("Staff Age: ");
                                    Fs2[i].setAge(scan.nextInt());
                                    scan.nextLine(); //avoid skipped next Input
                                    System.out.println("Staff Gender: ");
                                    Fs2[i].setGender(scan.nextLine());

                                    //Fs.FsInfo();
                                    
                                    System.out.println("-------------Evidence Info--------------");
                                    Ev[i]=new EvidenceDetail();
                                    System.out.println("Evidence Type: ");
                                    Ev[i].setEvidenceType(scan.nextLine());
                                    System.out.println("Evidence Location: ");
                                    ((EvidenceDetail)Ev[i]).setEvidenceLocation(scan.nextLine());
                                    System.out.println("Evidence Total: ");
                                    ((EvidenceDetail)Ev[i]).setEvidenceTotal(scan.nextInt());
                                    scan.nextLine(); //avoid skipped next Input
                                    System.out.println("");
                                    System.out.println("");
                                    i++;
                                    break;
                                case 2:
                                    for(int j=0;j<i;j++)
                                    {
                                        System.out.println("");
                                        System.out.println("----------------REPORT OUTPUT["+ (j+1) + "]-----------------");
                                        System.out.println("-----------------Case Info--------------------");
                                        System.out.println("Case ID: " + C[j].getCaseID()); 
                                        System.out.println("Date: " + C[j].getDate()); 
                                        System.out.println("Crime Type: " + C[j].getCrimeType());
                                        System.out.println("Location: " + C[j].getLocation());
                                        System.out.println("");
                                        System.out.println("Criminal Name: " + Cri2[j].getName());
                                        System.out.println("Criminal Age: " + Cri2[j].getAge());
                                        System.out.println("Criminal Gender: " + Cri2[j].getGender());
                                        System.out.println("Criminal From: " + Ca[j].getFrom());
                                        System.out.println("");
                                        System.out.println("Victim Name: " + Vi2[j].getName());
                                        System.out.println("Victim Age: " + Vi2[j].getAge());
                                        System.out.println("Victim Gender: " + Vi2[j].getGender());
                                        System.out.println("");
                                        System.out.println("Police Name: " + Pi2[j].getName());
                                        System.out.println("Police Age: " + Pi2[j].getAge());
                                        System.out.println("Police Gender: " + Pi2[j].getGender());
                                        System.out.println("Police Station Location: " + ((PoliceInfo)Pi2[j]).getStationLocation());
                                        System.out.println("");
                                        System.out.println("Staff Name: " + Fs2[j].getName());
                                        System.out.println("Staff Age: " + Fs2[j].getAge());
                                        System.out.println("Staff Gender: " + Fs2[j].getGender());
                                        System.out.println("");                                 
                                        System.out.println("Evidence Type: " + Ev[j].getEvidenceType());
                                        Ev[j].EvidenceOutput();
                                        }
                                    break;
                                case 3:
                                    StaffLoggedIn = false;
                                    break;
                                default:
                                    System.out.println("Invalid choice. Please try again.");
                                    break;
                            }
                        }
                            }else {
                        System.out.println("");
                        System.out.println("Invalid Staff username or password.");
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("");
                    System.out.print("Enter HQ username: ");
                    String hqUsername = scan.nextLine();
                    System.out.print("Enter HQ password: ");
                    String hqPassword = scan.nextLine();
                    if (hq.login(hqUsername, hqPassword)) {
                        System.out.println("");
                        System.out.println("HQ logged in successfully.");
                        System.out.println("");
                        boolean hqLoggedIn = true;
                        while (hqLoggedIn) {
                            System.out.println("HQ Tasks:");
                            System.out.println("1. View Cases");
                            System.out.println("2. Back");
                            System.out.print("Enter your choice: ");
                            int hqChoice = scan.nextInt();
                            scan.nextLine(); // Consume the newline character

                            switch (hqChoice) {
                                case 1:
                                    System.out.println("Enter Case Type: A - Arson M - Murder K - Kidnap");
                                    String ct = scan.next();
                                    //String cc = ct.substring(0,1);
                                    
                                    for(int k=0;k<i;k++)
                                    {
                                        //String cc = C[i].getCaseID().substring(0,1);
                                        if(C[k].getCaseID().substring(0,1).equals(ct) )
                                        {
                                            System.out.println("----------------REPORT OUTPUT-----------------");
                                            System.out.println("-----------------Case Info--------------------");
                                            System.out.println("Case ID: " + C[k].getCaseID()); 
                                            System.out.println("Date: " + C[k].getDate()); 
                                            System.out.println("Crime Type: " + C[k].getCrimeType());
                                            System.out.println("Location: " + C[k].getLocation());
                                            System.out.println("");
                                            System.out.println("Criminal Name: " + Cri2[k].getName());
                                            System.out.println("Criminal Age: " + Cri2[k].getAge());
                                            System.out.println("Criminal Gender: " + Cri2[k].getGender());
                                            System.out.println("Criminal From: " + Ca[k].getFrom());
                                            System.out.println("");
                                            System.out.println("Victim Name: " + Vi2[k].getName());
                                            System.out.println("Victim Age: " + Vi2[k].getAge());
                                            System.out.println("Victim Gender: " + Vi2[k].getGender());
                                            System.out.println("");
                                            System.out.println("Police Name: " + Pi2[k].getName());
                                            System.out.println("Police Age: " + Pi2[k].getAge());
                                            System.out.println("Police Gender: " + Pi2[k].getGender());
                                            System.out.println("Police Station Location: " + ((PoliceInfo)Pi2[k]).getStationLocation());
                                            System.out.println("");
                                            System.out.println("Staff Name: " + Fs2[k].getName());
                                            System.out.println("Staff Age: " + Fs2[k].getAge());
                                            System.out.println("Staff Gender: " + Fs2[k].getGender());
                                            System.out.println("");
                                            System.out.println("Evidence Type: " + Ev[k].getEvidenceType());
                                            
                                            Ev[k].EvidenceOutput();
                                        }
                                        else
                                        {
                                            System.out.println("");
                                        }
                                    }
                                    
                                    break;
                                case 2:
                                    hqLoggedIn = false;
                                    break;
                                default:
                                    System.out.println("Invalid choice. Please try again.");
                                    break;
                            }
                        }
                    } else {
                        System.out.println("Invalid HQ username or password.");
                    }
                    break;
                case 3:
                    System.out.println("----------------------THANK YOU ------------------------");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
                      
    }   
      
}
