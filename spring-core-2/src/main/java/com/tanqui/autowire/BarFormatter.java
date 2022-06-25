package com.tanqui.autowire;

import org.springframework.stereotype.Component;

@FormatterType("Bar")
@Component
//@Component("barFormatter")

public class BarFormatter implements Formatter{

    @Override
    public String format() {
        return "bar";
    }
}
