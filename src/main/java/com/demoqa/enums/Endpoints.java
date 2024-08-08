package com.demoqa.enums;

import lombok.Getter;


@Getter
public enum Endpoints {

    ALERT("/alerts"),
    FRAMES("/frames");


    public final String endpoint;

    Endpoints(String endpoint) {
        this.endpoint=endpoint;
    }
}
