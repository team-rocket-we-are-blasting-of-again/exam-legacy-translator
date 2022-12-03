package com.teamrocket.legacytranslator.service;

import com.teamrocket.legacytranslator.dto.TemplateDTO;
import org.springframework.stereotype.Service;

@Service
public class TemplateService {
    public TemplateDTO hello(String who) {
        return new TemplateDTO(99, "Hello, " + who + "!");
    }
}
