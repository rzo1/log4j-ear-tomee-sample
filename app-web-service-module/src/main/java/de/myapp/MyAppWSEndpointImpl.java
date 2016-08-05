package de.myapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Path;

@Stateless
@Path(MyAppWSEndpoint.API_PATH)
public class MyAppWSEndpointImpl implements MyAppWSEndpoint {

    private static final Logger logger = LoggerFactory.getLogger(MyAppWSEndpointImpl.class);

    @Inject
    private SimpleDemoService demoService;

    @PostConstruct
    public void init() {
        logger.info("Hello, i am up for now...");
    }

    @Override
    public DemoResponse isAlive() {
        if (logger.isDebugEnabled()) {
            logger.debug("Received GET request...");
        }
        demoService.process("Some text, I want to process everytime I get called.");
        return new DemoResponse();
    }
}
