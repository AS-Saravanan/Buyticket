package com.ferry.ticket.buyticket;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class TicketController {
    @RequestMapping("/ticket")
    //Ticket endpoint
    public String hello(){
        return "Hi there, you can buy ticket!!";
    }
}
