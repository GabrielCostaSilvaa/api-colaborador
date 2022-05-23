package com.apicolaborador.demo.domain.enumeration;

public enum status {
    SUCCESS(1),  
    WARNING(2),  
    ERROR(3);    

    private final int value;

    status(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }
}
