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
public class SCAN {
    
    void scan (int arr[],int head,String mov_direction)
    {
        //arrange array5
        
        int n=arr.length;//number of items in array
        int temp;//instant value
       
       
        //loop on array to arrange it
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
      
        
        /////done
        
        
        
        //adding the head postion,so must know where is the head postion in the array
        
        int arr2[] = new int[n+1];
        int index = 0;//index of head in the array
        
        
        
        
        
        for(int i=1;i<=n;i++)
        {
            if(head>arr[i])
            {
                arr2[i]=arr[i];
            }
            else 
            {
                arr2[i]=head;
                index=i;
                break;
            }
        }
        //arr[1,2,3,4,6]     head=5
        
        for(int i=index;i<n;i++)
        {
            arr2[i+1]=arr[i];
        }
        
        
        
        
        
        
        
        //now we must know the direct of moving
        //as output will be diffrent
        
        if("left".equals(mov_direction))
        {
            for(int i=index-1;i>0;i--)
            {
                System.out.println(arr2[i]);
               
            }
            for(int j=index+1;j<=n;j++)
            {
                System.out.println(arr2[j]);
                
            }
        }
        else if("right".equals(mov_direction))
        {
            for(int i=index+1;i<=n;i++)
            {
                System.out.println(arr2[i]);
               
            }
            for(int j=index-1;j>=1;j--)
            {
                System.out.println(arr2[j]);
              
            }
        }
        
        
        
        
        
        
        
        
        System.out.println();
        
        
        int value = 0;//keep the value of the headmovment    p2-p1
        
        
        System.out.print("the number of head movment is   ");
       
        
            if("left".equals(mov_direction))
                {
             for(int j=index-1;j>0;j--)
            {
               value=value+( arr2[j]-arr2[j-1] );    
            }
            value=value+(arr2[index+1]-arr2[0]);
            for(int k=index+1;k<n;k++)
            {
                value=value+(arr2[k]-arr2[k-1]);
        
            }
        
               }
        
            
            else if("right".equals(mov_direction)) 
            {
                for(int k=index+1;k<=n;k++)
                {
                    value=value+arr2[k]-arr2[k-1];
                }
        
                value=value+arr2[n]-arr2[index-1];
                 for(int j=index-1;j>1;j--)
            {
               value=value+( arr2[j]-arr2[j-1] );    
            }
        
            }
        
            else
           {
               System.out.println("wrong answer");
            }
           
        
        System.out.println(value);
        
        
        
        

      
    }

    
}
