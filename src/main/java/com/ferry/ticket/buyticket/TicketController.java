package com.ferry.ticket.buyticket;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class TicketController {
    // @RequestMapping("path", method=RequestMethod.GET)
    // public String requestMethodName(@RequestParam String param) {
    //     return new String();
    // }
    @RequestMapping("/ticket")
    public String hello(){
        return "Hi there, you can buy ticket!!";
    }
}
