package com.jsphotel.jspnotification.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notify")
public class NotificationController {

    @PostMapping("/email")
    public ResponseEntity<String> hotelBooking(){
        System.out.println("Notification has been sent through E-Mail ");
        return ResponseEntity.ok("Notification sent Successfully");
    }


}
