package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse modes
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("0NyWiQgR4Mudf24KnFScWRFWb8RTVQ3k1zKsinfg")
                .clientKey("PFYzzYR2AfJ8Czd9qJGfqvRvLN1Dos9SovSkoBbR")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
