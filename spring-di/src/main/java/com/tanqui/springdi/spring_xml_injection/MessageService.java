package com.tanqui.springdi.spring_xml_injection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageService implements IService {

    private String message;

    @Override
    public String serve() {
        return message;
    }
}
