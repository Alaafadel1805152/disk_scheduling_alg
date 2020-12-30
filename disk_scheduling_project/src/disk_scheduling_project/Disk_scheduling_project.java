/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disk_scheduling_project;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alaa fadel
 */
public class Disk_scheduling_project {

    /**
     * @param args the command line arguments
     */
    public static int TheInitial , cylinders ;
	public static String direction , algo ;
        
        
        public static void main(String[] args) {
        // TODO code application logic here
        
        
            System.out.println("1-FCFS");
            System.out.println("2-SCAN");
            System.out.println("3-SSTF");
            System.out.println("4-CSCAN");
            System.out.println("5-LOOK");
            System.out.println("6-CLOOK");
        System.out.println("enter the number of algorthm you want to run");
        Scanner sc = new Scanner(System.in);
     int ALG = sc.nextInt();
        
     switch (ALG)
     {
         /////////////////////////////////////////////////////////////////////////////////////////////////
    
    case 1:
     System.out.println("Please enter the number of disks"); 
      Scanner myObj= new Scanner(System.in);
      int NoOfDisks = myObj.nextInt()
              ;
    int [] disks=new int[NoOfDisks];
    System.out.println("Please enter the values");
    for(int i=0;i<disks.length;i++){
        disks[i]=myObj.nextInt();
    }
    System.out.println("Please enter the head"); 
    int head=myObj.nextInt();
    FCFS Object=new FCFS();
    Object.FCFS(disks, head);
    

break;




///////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
  case 2:
    int[] arr =new int[6];//array it self
      int arr_num;//amount of the array
      String direction2;
      
      
      Scanner s=new Scanner(System.in);
      
        System.out.println("enter the amount of requests");
        
        arr_num=s.nextInt();
        
        System.out.println("enter the values in the array");
        
        for(int i=1;i<=arr_num;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        
        System.out.println("enter the value of head");
        int head2 = s.nextInt();
        
        
        System.out.println("enter the direction of movment (left-right)");
        
         direction2 = sc.next();
         
         
         
        SCAN myobj=new SCAN();
 
        myobj.scan(arr, head2, direction2);
    
    break;
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    case 3:
    int[] arr2 =new int[6];//array it self
      int arr_num2=0;//amount of the array
       
      Scanner scs=new Scanner(System.in);
      
        System.out.println("enter the amount of requests");
        
        arr_num2=scs.nextInt();
        
        System.out.println("enter the values in the array");
        
        for(int i=1;i<=arr_num2;i++)
        {
            arr2[i]=scs.nextInt();
        }
        
        
        System.out.println("enter the value of head");
        int head3 = scs.nextInt();
        
        SSTF myobj2=new SSTF();
        myobj2.ssft(arr2, head3);
        break;
        
        
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        case 4:
        
        int[] arr4 =new int[6];//array it self
      int arr_num4;//amount of the array
      
      //C-CSCAN_code algorthm go in right direction only to get requests
      
      
      Scanner scc=new Scanner(System.in);
      
        System.out.println("enter the amount of requests-the max is 5 only if you want to increase it update the array to avoid errors -_-");
        
        arr_num4=scc.nextInt();
        
        System.out.println("enter the values in the array");
        
        for(int i=1;i<=arr_num4;i++)
        {
            arr4[i]=scc.nextInt();
        }
        
        
        System.out.println("enter the value of head");
        int head4 = scc.nextInt();
        
        
       /* System.out.println("enter the direction of movment (left-right)");
        
         direction = sc.next();*///no direction in C-SAN
         
         
         
        CSCAN myobj4=new CSCAN();
        myobj4.cscan(arr4,head4);
        break;
        
        
        
         /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        case 5:
        Scanner in = new Scanner(System.in);
		ArrayList<Integer> queue = new ArrayList<Integer>() ;
		
		          System.out.println("enter the values , when done enter -1");
                          int x=in.nextInt();
                          while(x!=-1){
                              queue.add(x);
                               x=in.nextInt();
    }
                               while ( true ){
			
			System.out.println("\n*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=\n");
		
			System.out.print( "Initial head = " );
			
			TheInitial = in.nextInt();
			

				System.out.print( "The direction you want = " );
				direction = in.next() ;
				System.out.println("Number of head movements = " + LOOK.LOOK (TheInitial ,  direction , queue ) ) ;
                         }
                   
                   break;
                   
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         
          case 6:
			
                                Scanner inn = new Scanner(System.in);
		ArrayList<Integer> queue2 = new ArrayList<Integer>() ;
		
		          System.out.println("enter the values , when done enter -1");
                          int x2=inn.nextInt();
                          while(x2!=-1){
                              queue2.add(x2);
                               x2=inn.nextInt();
    }
                               while ( true ){
			
			System.out.println("\n*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=\n");
		
			System.out.print( "Initial head = " );
			
			TheInitial = inn.nextInt();
			
				
				System.out.print( "The direction you want = " );
				direction = inn.next() ;
				System.out.println("Number of head movements = " + CLOOK.cLook (TheInitial , direction , queue2 ) ) ;
			
			
                            }
                               break;
                            
                            
        
                        
                        
                        
                        
                        
                        
                        
                               
        
        
  default:
    System.out.println("enter a valid number");
                        
        
        
        
     }
}