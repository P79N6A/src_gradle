package com.crashlytics.android.answers;

import io.fabric.sdk.android.i;
import io.fabric.sdk.android.services.b.a;
import io.fabric.sdk.android.services.b.v;
import io.fabric.sdk.android.services.c.f;
import io.fabric.sdk.android.services.d.c;
import io.fabric.sdk.android.services.d.d;
import io.fabric.sdk.android.services.d.e;
import java.io.File;
import java.util.List;

public class SessionAnalyticsFilesSender extends a implements f {
    private final String apiKey;

    public boolean send(List<File> list) {
        d a2 = getHttpRequest().a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", this.kit.getVersion()).a("X-CRASHLYTICS-API-KEY", this.apiKey);
        int i = 0;
        for (File next : list) {
            a2.a("session_analytics_file_" + i, next.getName(), "application/vnd.crashlytics.android.events", next);
            i++;
        }
        StringBuilder sb = new StringBuilder("Sending ");
        sb.append(list.size());
        sb.append(" analytics files to ");
        sb.append(this.url);
        int b2 = a2.b();
        new StringBuilder("Response code for analytics file send is ").append(b2);
        if (v.a(b2) == 0) {
            return true;
        }
        return false;
    }

    public SessionAnalyticsFilesSender(i iVar, String str, String str2, e eVar, String str3) {
        super(iVar, str, str2, eVar, c.POST);
        this.apiKey = str3;
    }
}
