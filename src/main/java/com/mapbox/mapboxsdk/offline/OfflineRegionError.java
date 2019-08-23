package com.mapbox.mapboxsdk.offline;

import android.support.annotation.Keep;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class OfflineRegionError {

    /* renamed from: a  reason: collision with root package name */
    public final String f26761a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26762b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorReason {
    }

    @Keep
    private OfflineRegionError(String str, String str2) {
        this.f26761a = str;
        this.f26762b = str2;
    }
}
