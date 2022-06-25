package com.tanqui.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FooService {

    @Autowired
//    @Qualifier("fooFormatter")
//    @FormatterType("Foo")
//    private Formatter formatter;
    private Formatter fooFormatter;
//    private FooFormatter fooFormatter;

//    @Autowired(required = false)
//    private FooDAO dataAccessor;

//    @Autowired
//    public FooService(@FormatterType("Foo") Formatter formatter) {
//        this.formatter = formatter;
//    }

//    @Autowired
//    public FooService(FooFormatter fooFormatter) {
//        this.fooFormatter = fooFormatter;
//    }

//    @Autowired

//    public void setFormatter(@FormatterType("Foo") Formatter formatter) {
//        this.formatter = formatter;
//    }

//    public void setFooFormatter(FooFormatter fooFormatter) {
//        this.fooFormatter = fooFormatter;
//    }

    public String doStuff() {
        return fooFormatter.format();
    }
}
