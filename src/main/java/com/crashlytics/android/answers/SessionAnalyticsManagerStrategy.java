package com.crashlytics.android.answers;

import com.crashlytics.android.answers.SessionEvent;
import io.fabric.sdk.android.services.c.e;
import io.fabric.sdk.android.services.f.b;

public interface SessionAnalyticsManagerStrategy extends e {
    void deleteAllEvents();

    void processEvent(SessionEvent.Builder builder);

    void sendEvents();

    void setAnalyticsSettingsData(b bVar, String str);
}
