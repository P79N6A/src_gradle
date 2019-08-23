package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.services.b.i;
import io.fabric.sdk.android.services.b.s;
import java.util.Map;
import java.util.UUID;

public class SessionMetadataCollector {
    private final Context context;
    private final s idManager;
    private final String versionCode;
    private final String versionName;

    public SessionEventMetadata getMetadata() {
        Map<s.a, String> e2 = this.idManager.e();
        String h = i.h(this.context);
        s sVar = this.idManager;
        SessionEventMetadata sessionEventMetadata = new SessionEventMetadata(this.idManager.f83194b, UUID.randomUUID().toString(), this.idManager.a(), this.idManager.g(), e2.get(s.a.FONT_TOKEN), h, sVar.b() + "/" + sVar.c(), this.idManager.d(), this.versionCode, this.versionName);
        return sessionEventMetadata;
    }

    public SessionMetadataCollector(Context context2, s sVar, String str, String str2) {
        this.context = context2;
        this.idManager = sVar;
        this.versionCode = str;
        this.versionName = str2;
    }
}
