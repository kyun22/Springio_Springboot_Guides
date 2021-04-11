package com.example.gsconsumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)  //Jackson JSON processing library to indicate that any properties not bound in the type should be ignored.
public class Value {
    private Long id;
    private String quote;

    public Value() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "Value{" +
                "id='" + id + '\'' +
                ", quote=" + quote + "}";
    }
}
