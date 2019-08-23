package com.mapbox.mapboxsdk.style.types;

import android.support.annotation.Keep;
import android.support.annotation.VisibleForTesting;
import java.util.Arrays;

@Keep
public class Formatted {
    private final FormattedSection[] formattedSections;

    public FormattedSection[] getFormattedSections() {
        return this.formattedSections;
    }

    public int hashCode() {
        return Arrays.hashCode(this.formattedSections);
    }

    @VisibleForTesting(otherwise = 4)
    public Formatted(FormattedSection[] formattedSectionArr) {
        this.formattedSections = formattedSectionArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.formattedSections, ((Formatted) obj).formattedSections);
    }
}
