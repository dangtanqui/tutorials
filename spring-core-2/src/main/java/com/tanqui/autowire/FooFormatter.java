package com.tanqui.autowire;

import org.springframework.stereotype.Component;

@Component("fooFormatter")
public class FooFormatter {

    public String format() {
        return "foo";
    }
}
