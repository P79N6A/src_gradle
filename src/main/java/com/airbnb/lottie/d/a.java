package com.airbnb.lottie.d;

import com.airbnb.lottie.d;

public enum a {
    Json(".json"),
    Zip(".zip");
    
    public final String extension;

    public final String toString() {
        return this.extension;
    }

    public final String tempExtension() {
        return ".temp" + this.extension;
    }

    public static a forFile(String str) {
        for (a aVar : values()) {
            if (str.endsWith(aVar.extension)) {
                return aVar;
            }
        }
        d.a("Unable to find correct extension for " + str);
        return Json;
    }

    private a(String str) {
        this.extension = str;
    }
}
