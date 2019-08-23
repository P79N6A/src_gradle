package com.crashlytics.android.answers;

import android.content.Context;

public class FirebaseAnalyticsApiAdapter {
    private final Context context;
    private EventLogger eventLogger;
    private final FirebaseAnalyticsEventMapper eventMapper;

    public EventLogger getFirebaseAnalytics() {
        if (this.eventLogger == null) {
            this.eventLogger = AppMeasurementEventLogger.getEventLogger(this.context);
        }
        return this.eventLogger;
    }

    public FirebaseAnalyticsApiAdapter(Context context2) {
        this(context2, new FirebaseAnalyticsEventMapper());
    }

    public void processEvent(SessionEvent sessionEvent) {
        EventLogger firebaseAnalytics = getFirebaseAnalytics();
        if (firebaseAnalytics != null) {
            FirebaseAnalyticsEvent mapEvent = this.eventMapper.mapEvent(sessionEvent);
            if (mapEvent == null) {
                new StringBuilder("Fabric event was not mappable to Firebase event: ").append(sessionEvent);
                return;
            }
            firebaseAnalytics.logEvent(mapEvent.getEventName(), mapEvent.getEventParams());
            if ("levelEnd".equals(sessionEvent.predefinedType)) {
                firebaseAnalytics.logEvent("post_score", mapEvent.getEventParams());
            }
        }
    }

    public FirebaseAnalyticsApiAdapter(Context context2, FirebaseAnalyticsEventMapper firebaseAnalyticsEventMapper) {
        this.context = context2;
        this.eventMapper = firebaseAnalyticsEventMapper;
    }
}
