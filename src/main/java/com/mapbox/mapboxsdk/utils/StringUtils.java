package com.mapbox.mapboxsdk.utils;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import java.text.Normalizer;

@Keep
public class StringUtils {
    StringUtils() {
    }

    @Keep
    @NonNull
    static String unaccent(@NonNull String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("(\\p{InCombiningDiacriticalMarks}|\\p{InCombiningDiacriticalMarksForSymbols}|\\p{InCombiningDiacriticalMarksSupplement})+", "");
    }
}
