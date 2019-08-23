package com.mapbox.mapboxsdk.style.types;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import java.util.Arrays;

@Keep
public class FormattedSection {
    private double fontScale;
    private String[] fontStack;
    private String text;

    public double getFontScale() {
        return this.fontScale;
    }

    @Nullable
    public String[] getFontStack() {
        return this.fontStack;
    }

    @NonNull
    public String getText() {
        return this.text;
    }

    public int hashCode() {
        int i;
        if (this.text != null) {
            i = this.text.hashCode();
        } else {
            i = 0;
        }
        long doubleToLongBits = Double.doubleToLongBits(this.fontScale);
        return (((i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + Arrays.hashCode(this.fontStack);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FormattedSection formattedSection = (FormattedSection) obj;
        if (Double.compare(formattedSection.fontScale, this.fontScale) != 0 || (this.text == null ? formattedSection.text != null : !this.text.equals(formattedSection.text)) || !Arrays.equals(this.fontStack, formattedSection.fontStack)) {
            return false;
        }
        return true;
    }

    @VisibleForTesting(otherwise = 4)
    public FormattedSection(@NonNull String str, double d2) {
        this.text = str;
        this.fontScale = d2;
    }

    @VisibleForTesting(otherwise = 4)
    public FormattedSection(@NonNull String str, double d2, @Nullable String[] strArr) {
        this.text = str;
        this.fontScale = d2;
        this.fontStack = strArr;
    }
}
