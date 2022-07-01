package com.tanqui.springdi2.constructor_injection.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Engine {

    private String type;
    private int volume;
}
