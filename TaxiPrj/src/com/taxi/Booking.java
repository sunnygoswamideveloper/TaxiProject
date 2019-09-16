package com.taxi;

public class Booking {

 	int customerId;                                                                           
 	char pickupPoint;                                                                         
 	char dropPoint;                                                                           
 	int pickupTime;                                                                           
 	int dropTime;                                                                             
 	int earnings;                                                                             
 	int taxino;                                                                               
 	Taxi[] t;  
 	Taxi a1=new Taxi();
 	
                                                                                             
                                                                                             
   Booking(int id, char pick, char drop, int PickTime) {                                     
	   customerId=id;                                                                             
	   pickupPoint=pick;                                                                      
	   dropPoint=drop;                                                                        
	   pickupTime=PickTime;                                                                   
   }                                                                                         
                                                                                             
   public void dropTime()                                                                    
   {                                                                                         
       this.dropTime=(pickupTime+(Math.abs(pickupPoint-dropPoint)));                         
   }                                                                                         
   public void calculateEarnings()                                                           
   {      
	  int dist=a1.calculateEarnings(pickupPoint, dropPoint);
       if(dist==0) {                                        
    	   this.earnings=((dist-10)*10)+100;                                                      
       } 
       else {
    	   this.earnings=((dist-5)*10)+100;
       }
   }                                                                                         
                                                                                             
                                                                                             
                                                                                             
                                                                                             
  public int isAvailable(Taxi[] t)                                                           
  {                                                                                          
      int j,min=6,temp=-1;                                                                   
      for(j=0;j<4;j++)                                                                       
      {                                                                                      
         if(Math.abs(pickupPoint-t[j].initialPoint)<=min  && t[j].departureTime<=pickupTime)  
         {                                                                                   
               if(temp==-1 || Math.abs(pickupPoint-t[j].initialPoint)<min )                  
                temp=j;                                                                      
            if(Math.abs(pickupPoint-t[j].initialPoint)==min && t[j].earnings!=0)             
            {                                                                                
                if(t[temp].earnings>t[j].earnings)                                           
                temp=j;                                                                      
            }                                                                                
            min= Math.abs(pickupPoint-t[j].initialPoint);                                    
                                                                                             
         }                                                                                   
      }                                                                                      
      if(min!=6){                                                                            
          t[temp].departureTime(pickupTime,pickupPoint,dropPoint);                           
          t[temp].initialPoint=dropPoint;                                                    
          taxino=temp;          
          return temp;}                                                                      
      return -1;                                                                             
  }                                                                                          
                                                                                             
}































