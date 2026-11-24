package com.bxom.pl41gateway.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.function.HandlerFunction;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

@Component
public class TestingHandler implements HandlerFunction<ServerResponse> {
    private static final Logger log = LoggerFactory.getLogger(TestingHandler.class);

    /**
     * Handle the given request.
     *
     * @param request the request to handle
     * @return the response
     */
    @Override
    public ServerResponse handle(ServerRequest request) throws Exception {
        log.info("HELLO WORLD !!!");
        return ServerResponse.status(HttpStatus.OK).body("HELLO WORLD !!!");
    }
}
