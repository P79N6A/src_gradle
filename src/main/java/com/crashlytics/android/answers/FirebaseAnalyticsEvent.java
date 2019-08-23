package com.crashlytics.android.answers;

import android.os.Bundle;

public class FirebaseAnalyticsEvent {
    private final String eventName;
    private final Bundle eventParams;

    public String getEventName() {
        return this.eventName;
    }

    public Bundle getEventParams() {
        return this.eventParams;
    }

    FirebaseAnalyticsEvent(String str, Bundle bundle) {
        this.eventName = str;
        this.eventParams = bundle;
    }
}
