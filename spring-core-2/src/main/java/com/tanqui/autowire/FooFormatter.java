package com.tanqui.autowire;

import org.springframework.stereotype.Component;

@FormatterType("Foo")
@Component
//@Component("fooFormatter")

public class FooFormatter implements Formatter {

    @Override
    public String format() {
        return "foo";
    }
}
