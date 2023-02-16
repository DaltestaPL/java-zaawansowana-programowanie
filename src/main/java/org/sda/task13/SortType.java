package org.sda.task13;

public enum SortType {
    ASC("rosnaco"),
    DESC("malejaco");

    private final String type;
    SortType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
