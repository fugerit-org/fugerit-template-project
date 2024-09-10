package org.fugerit.java.template;

import io.micronaut.http.annotation.*;

@Controller("/fugerit-micronaut4-template")
public class FugeritMicronaut4TemplateController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}