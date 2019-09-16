package com.taxi;

public class Taxi {
	
	  	char initialPoint;
	    int departureTime;
	    int earnings;
	    public Taxi()
	    {
	        initialPoint='A';
	    }
	    public void departureTime(int pickTime,char pick,char drop)
	    {
	        this.departureTime=(pickTime+(Math.abs(pick-drop)));
	    }
	    public int calculateEarnings(char pick,char drop)
	    {
	    	 int array[][]= { { 0, 10, 15, 20 }, 
	    			 		{ 10, 0, 35, 25 }, 
	    			 		{ 15, 35, 0, 30 }, 
	    			 		{ 20, 25, 30, 0 } }; 
	  	   	int l=Math.abs(pick-65);
	  	   	int m=Math.abs(drop-65);
	  	   	int dist=array[l][m];
	        System.out.println(dist);
	        if(dist==0){
	        int amount=((dist-10)*10)+100;
	        this.earnings=earnings+amount;
	        	return dist;
	        }
	        else {
	        	int amount=((dist-5)*10)+100;
		        this.earnings=earnings+amount;
		        	return dist;
	        }
	    }

}
