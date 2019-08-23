package com.crashlytics.android.answers;

import android.content.Context;
import android.os.Looper;
import io.fabric.sdk.android.services.b.w;
import io.fabric.sdk.android.services.c.g;
import io.fabric.sdk.android.services.e.a;
import java.io.IOException;

public class AnswersFilesManagerProvider {
    final Context context;
    final a fileStore;

    public SessionAnalyticsFilesManager getAnalyticsFilesManager() throws IOException {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return new SessionAnalyticsFilesManager(this.context, new SessionEventTransform(), new w(), new g(this.context, this.fileStore.a(), "session_analytics.tap", "session_analytics_to_send"));
        }
        throw new IllegalStateException("AnswersFilesManagerProvider cannot be called on the main thread");
    }

    public AnswersFilesManagerProvider(Context context2, a aVar) {
        this.context = context2;
        this.fileStore = aVar;
    }
}
