package com.example.yatranslate;

import java.util.Arrays;

public class Response {
    int code;
    String lang;
    String[] text;

    @Override
    public String toString() {
        // TODO: вывести текст без []
        return "text=" + Arrays.toString(text);
    }
}
