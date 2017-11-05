package com.company.task12.classes_task2;

public enum ClothingSize {
    XXS(38) {
        public String getDescription() {
            return "Детский размер";
        }
    },
    XS(40), S(42), M(44), L(48);

    ClothingSize(int euroSize) {
        this.euroSize = euroSize;
    }

    int euroSize;

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }

}
