package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.services.b.k;
import io.fabric.sdk.android.services.c.b;
import io.fabric.sdk.android.services.c.c;
import java.io.IOException;
import java.util.UUID;

public class SessionAnalyticsFilesManager extends b<SessionEvent> {
    private io.fabric.sdk.android.services.f.b analyticsSettingsData;

    public int getMaxByteSizePerFile() {
        if (this.analyticsSettingsData == null) {
            return super.getMaxByteSizePerFile();
        }
        return this.analyticsSettingsData.f83299c;
    }

    public int getMaxFilesToKeep() {
        if (this.analyticsSettingsData == null) {
            return super.getMaxFilesToKeep();
        }
        return this.analyticsSettingsData.f83301e;
    }

    public String generateUniqueRollOverFileName() {
        UUID randomUUID = UUID.randomUUID();
        return "sa" + "_" + randomUUID.toString() + "_" + this.currentTimeProvider.a() + ".tap";
    }

    /* access modifiers changed from: package-private */
    public void setAnalyticsSettingsData(io.fabric.sdk.android.services.f.b bVar) {
        this.analyticsSettingsData = bVar;
    }

    SessionAnalyticsFilesManager(Context context, SessionEventTransform sessionEventTransform, k kVar, c cVar) throws IOException {
        super(context, sessionEventTransform, kVar, cVar, 100);
    }
}
