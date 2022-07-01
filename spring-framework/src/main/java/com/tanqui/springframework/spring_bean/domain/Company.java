package com.tanqui.springframework.spring_bean.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Company {

    private Address address;
}
