package com.facebook.react.util;

import com.facebook.react.ReactRootView;
import java.io.InputStream;
import java.util.Properties;

public class RNVersionUtils {
    private static String propertyVersion = "";

    public static String getVersion() {
        if (propertyVersion != "") {
            return propertyVersion;
        }
        Properties properties = new Properties();
        try {
            InputStream resourceAsStream = ReactRootView.class.getClassLoader().getResourceAsStream("version.properties");
            if (resourceAsStream == null) {
                return "Can't get version";
            }
            properties.load(resourceAsStream);
            propertyVersion = properties.getProperty("version");
            return propertyVersion;
        } catch (Exception unused) {
        }
    }
}
