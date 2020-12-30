/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disk_scheduling_project;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Alaa fadel
 */
public class CLOOK {
    


    public static int cLook ( int initial ,  String direction , ArrayList<Integer> queue ){
		
		int res = 0 ;
		
		ArrayList<Integer> moves = new ArrayList<Integer>() ;
		ArrayList<Integer> Queue = new ArrayList<Integer>() ;
		
		Queue.addAll(queue);

		Queue.add( initial );
		
		Collections.sort(Queue, new Comparator<Integer>(){
			
	        public int compare(Integer x, Integer y) {
	        	
	        	return x - y ;
	        }
	    });
		
		int idx = Queue.indexOf ( initial ) ;
		
		if ( direction.equals("right") ){
			
			for ( int i=idx ; i<Queue.size() ; i ++ ){
				
				moves.add(Queue.get(i) );
			}
			
			for ( int i=0 ; i<idx ; i ++ ){
				
				moves.add(Queue.get(i) );
			}
		}
		
		else if ( direction.equals("left") ){
			
			for ( int i=idx ; i>=0 ; i -- ){
				
				moves.add(Queue.get(i) );
			}
			
			for ( int i=Queue.size()-1 ; i>idx ; i -- ){
				
				moves.add(Queue.get(i) );
			}
		}
		
		System.out.println( moves.toString() );
		
		for ( int i=0; i<moves.size()-1; i++ ){
			
			res += Math.abs( moves.get(i) - moves.get( i + 1 ) ) ;
		}
		
		return res ;
	}
    
}
