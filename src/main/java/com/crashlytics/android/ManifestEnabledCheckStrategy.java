package com.crashlytics.android;

import android.content.Context;
import com.crashlytics.android.CrashlyticsInitProvider;
import io.fabric.sdk.android.services.b.l;

public class ManifestEnabledCheckStrategy implements CrashlyticsInitProvider.EnabledCheckStrategy {
    ManifestEnabledCheckStrategy() {
    }

    public boolean isCrashlyticsEnabled(Context context) {
        return l.a(context).f83181c;
    }
}
