package com.crashlytics.android.answers;

import android.annotation.SuppressLint;
import android.content.Context;
import io.fabric.sdk.android.services.e.c;
import io.fabric.sdk.android.services.e.d;

public class AnswersPreferenceManager {
    private final c prefStore;

    @SuppressLint({"CommitPrefEdits"})
    public boolean hasAnalyticsLaunched() {
        return this.prefStore.a().getBoolean("analytics_launched", false);
    }

    @SuppressLint({"CommitPrefEdits"})
    public void setAnalyticsLaunched() {
        this.prefStore.a(this.prefStore.b().putBoolean("analytics_launched", true));
    }

    AnswersPreferenceManager(c cVar) {
        this.prefStore = cVar;
    }

    public static AnswersPreferenceManager build(Context context) {
        return new AnswersPreferenceManager(new d(context, "settings"));
    }
}
