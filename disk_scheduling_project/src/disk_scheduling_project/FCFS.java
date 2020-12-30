/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disk_scheduling_project;

/**
 *
 * @author Alaa fadel
 */
public class FCFS {
    
    static int Size = 8; 
  
public static void FCFS(int Array[], int TheHead) 
{ 
    int CountOfSeek= 0,Thedistance, SeekTime; 
  
    for (int i = 0; i < Array.length; i++)  
    { 
        SeekTime = Array[i]; 
        Thedistance = Math.abs(SeekTime - TheHead);  
        CountOfSeek += Thedistance; 
  //the new head is equal right now to the seektime
        TheHead = SeekTime; 
    } 
  
    System.out.println("The Total Numbers of " +  "Seek operations = " + CountOfSeek); 
  
    System.out.println("Here Is The Seek Sequence"); 
  
    for (int i = 0; i < Array.length; i++) 
    { 
        System.out.println(Array[i]); 
    } 
} 
    
}
