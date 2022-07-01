package com.tanqui.springframework.inversion_of_control_and_dependency_injection;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ItemImpl1 implements Item {

    private String name;

    @Override
    public void display() {
        System.out.println(name);
    }
}
