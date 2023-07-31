package org.spring;

import org.springframework.stereotype.Component;

@Component()
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "classical music song";
    }
}
