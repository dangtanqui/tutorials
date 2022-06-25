package com.tanqui.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FooService {

//    @Autowired
    private FooFormatter fooFormatter;

//    @Autowired(required = false)
//    private FooDAO dataAccessor;

    @Autowired
    public FooService(FooFormatter fooFormatter) {
        this.fooFormatter = fooFormatter;
    }

//    @Autowired
//    public void setFooFormatter(FooFormatter fooFormatter) {
//        this.fooFormatter = fooFormatter;
//    }

    public String doStuff() {
        return fooFormatter.format();
    }
}
