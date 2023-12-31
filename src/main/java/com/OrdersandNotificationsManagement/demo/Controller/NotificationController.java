package com.OrdersandNotificationsManagement.demo.Controller;


import com.OrdersandNotificationsManagement.demo.Model.*;
import com.OrdersandNotificationsManagement.demo.Model.Channel.EmailChannel;
import com.OrdersandNotificationsManagement.demo.Model.Template.OrderPlacementTemplateEnglish;
import com.OrdersandNotificationsManagement.demo.Repos.NotificationQueue;
import com.OrdersandNotificationsManagement.demo.Service.NotificationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/notification")
public class NotificationController {
    private final NotificationService notificationService = new NotificationService();
    /**
     * Sends all notifications in the system.
     *
     * @return A Response object indicating the result of the send operation.
     * @see NotificationService#sendAllNotifications()
     */
    @GetMapping("/send")
    public Response sendAllNotifications()   //http://localhost:8080/notification/send
    {
        return notificationService.sendAllNotifications();
    }
    /**
     * Retrieves a list of all notifications in the system.
     *
     * @return A List of Notification objects representing all notifications in the system.
     * @see NotificationService#viewAllNotifications()
     */
    @GetMapping("/view") //http://localhost:8080/notification/view
    public List<Notification> viewAllNotifications() {
        return notificationService.viewAllNotifications();
    }
}
