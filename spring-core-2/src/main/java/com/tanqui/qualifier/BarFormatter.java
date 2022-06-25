package com.tanqui.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("barFormatter")
//@Component("barFormatter")
public class BarFormatter implements Formatter {

    @Override
    public String format() {
        return "bar";
    }
}
