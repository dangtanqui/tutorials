package com.tanqui.springdi.spring_xml_injection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IndexApp {

    private IService service;

    public String getServiceValue() {
        return service.serve();
    }
}
