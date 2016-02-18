package com.yurasavchuk.simplehtmlparser.datacontroller;

/**
 * Created by android on 18.02.16.
 */
public class StartupLiteModel {

    private String name;
    private String description;
    private String url;

    public StartupLiteModel(String name, String description, String url) {
        this.name = name;
        this.description = description;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }
}
