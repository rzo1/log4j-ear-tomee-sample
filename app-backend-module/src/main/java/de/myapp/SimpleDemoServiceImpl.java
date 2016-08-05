package de.myapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleDemoServiceImpl implements SimpleDemoService {

    private static final Logger logger = LoggerFactory.getLogger(SimpleDemoServiceImpl.class);

    public void process(String text) {
        //do some operations and finally log something...
        logger.info("##### Received text: {}", text);
    }
}
