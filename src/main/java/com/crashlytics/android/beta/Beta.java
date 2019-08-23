package com.crashlytics.android.beta;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.i;
import io.fabric.sdk.android.services.b.n;
import io.fabric.sdk.android.services.b.s;
import java.util.Collections;
import java.util.Map;

public class Beta extends i<Boolean> implements n {
    public String getIdentifier() {
        return "com.crashlytics.sdk.android:beta";
    }

    public String getVersion() {
        return "1.2.10.27";
    }

    /* access modifiers changed from: protected */
    public Boolean doInBackground() {
        return Boolean.TRUE;
    }

    public Map<s.a, String> getDeviceIdentifiers() {
        return Collections.emptyMap();
    }

    public static Beta getInstance() {
        return (Beta) c.a(Beta.class);
    }
}
