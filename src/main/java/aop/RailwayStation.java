package aop;

/** 
 * RailwayStation 实现 TicketService 
 * Created by louis on 2016/4/14. 
 */  
public class RailwayStation implements TicketService {  
  
    public void sellTicket(){  
        System.out.println("售票............");  
    }  
  
    public void inquire() {  
        System.out.println("问询.............");  
    }  
  
    public void withdraw() {  
        System.out.println("退票.............");  
    }  
} 