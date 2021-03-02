package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("bflxjDZfYsGQ620RzqTSL4GqeZ8oflYmTlsiVYAJ")
                .clientKey("DUEZ75FnI2SzSbww7UAqIstMh6SdomLuZCHqmnYS")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
