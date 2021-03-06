/*
 *This controls the access and process of video orders 
 * made by an active account logged in to a web session
 */
package com.team33.controllers;

import com.team33.services.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.mvc.AbstractController;

/**
 * This is the controller for the order feature
 *
 * @author Samual
 */
@Controller
//NoClassDefFound portler error fixed with the requestmapping
@RequestMapping(value = "/orderVideoView.htm")
public class OrderController{

    @Autowired
    private OrderServiceImpl orderServiceImpl;
    @Autowired
    private String commandName;
    @Autowired
    private Class commandClass;
  

    /**
     *
     * @param orderServiceImpl
     */
    public void setOrderServiceImpl(OrderServiceImpl orderServiceImpl) {
        this.orderServiceImpl = orderServiceImpl;
    }
    
    /**
     *
     * @return
     */
    public OrderServiceImpl getOrderServiceImpl(){
        return this.orderServiceImpl;
    }
    
    /**
     *
     * @param commandName
     */
    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    /**
     *
     * @param commandClass
     */
    public void setCommandClass(Class commandClass) {
        this.commandClass = commandClass;
    } 
    //The get orders method should be invoked here
    /**
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String order() {
        return "orderVideoView";
    }
}
