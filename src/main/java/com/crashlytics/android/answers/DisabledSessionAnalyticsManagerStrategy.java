package com.crashlytics.android.answers;

import com.crashlytics.android.answers.SessionEvent;
import io.fabric.sdk.android.services.f.b;
import java.io.IOException;

public class DisabledSessionAnalyticsManagerStrategy implements SessionAnalyticsManagerStrategy {
    public void cancelTimeBasedFileRollOver() {
    }

    public void deleteAllEvents() {
    }

    public void processEvent(SessionEvent.Builder builder) {
    }

    public boolean rollFileOver() throws IOException {
        return false;
    }

    public void scheduleTimeBasedRollOverIfNeeded() {
    }

    public void sendEvents() {
    }

    public void setAnalyticsSettingsData(b bVar, String str) {
    }

    DisabledSessionAnalyticsManagerStrategy() {
    }
}
