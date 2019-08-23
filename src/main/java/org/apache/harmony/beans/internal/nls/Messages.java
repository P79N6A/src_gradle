package org.apache.harmony.beans.internal.nls;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Messages {
    private static ResourceBundle bundle;

    public static String getString(String str) {
        if (bundle == null) {
            return str;
        }
        try {
            return bundle.getString(str);
        } catch (MissingResourceException unused) {
            return "Missing message: " + str;
        }
    }
}
