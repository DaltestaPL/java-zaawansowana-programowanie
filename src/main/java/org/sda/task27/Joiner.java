package org.sda.task27;

public class Joiner {

    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public <E> String join(E...elements) {
        StringBuilder builder = new StringBuilder();
        for (E element : elements) {
            builder.append(element.toString());
            builder.append(separator);
        }
        var length = builder.toString().length();
        return builder.substring(0, length - separator.length());
    }
}
