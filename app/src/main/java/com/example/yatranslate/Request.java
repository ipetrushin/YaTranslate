package com.example.yatranslate;

public class Request {
    String text;
    String lang;

    public Request(String text, String lang) {
        this.text = text;
        this.lang = lang;
    }

    String format = "plain";

    // TODO: указать свой ключ https://translate.yandex.ru/developers/keys
    String key = "YOUR_KEY_HERE";

    public byte[] toByteArray() {
        // TODO: добавить URL-кодирование текста (использовать класс URLEncoder)
        // TODO: реализовать многострочный перевод
        // формируем данные веб-формы
        String data = "format="+format+"&key="+key+"&text="+text+"&lang="+lang;
        return data.getBytes();
    }
}
