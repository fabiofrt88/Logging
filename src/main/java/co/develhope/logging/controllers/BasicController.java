package co.develhope.logging.controllers;

import co.develhope.logging.services.BasicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BasicController {

    @Autowired
    BasicService basicService;

    Logger logger = LoggerFactory.getLogger(BasicController.class);

    @GetMapping("/")
    public void getWelcome(){
        logger.info("WELCOME logging");
    }

    @GetMapping("/exp")
    public void getExp(){
        logger.debug("This is the Power " + basicService.getPower());
    }

    @GetMapping("/get-errors")
    public void getErrors(){
        logger.debug("This is the ERROR logging");
    }
}