package com.vivo.push;

import android.content.Context;
import com.vivo.push.util.VivoPushException;
import java.util.ArrayList;
import java.util.List;

public class PushClient {
    private static final Object SLOCK = new Object();
    private static volatile PushClient sPushClient;

    public String getVersion() {
        return "2.3.1";
    }

    public void checkManifest() throws VivoPushException {
        p.a().b();
    }

    public void initialize() {
        p.a().i();
    }

    public String getAlias() {
        return p.a().l();
    }

    public String getRegId() {
        return p.a().f();
    }

    public List<String> getTopics() {
        return p.a().c();
    }

    public boolean isSupport() {
        return p.a().d();
    }

    public void setSystemModel(boolean z) {
        p.a().a(z);
    }

    public void turnOffPush(IPushActionListener iPushActionListener) {
        p.a().b(iPushActionListener);
    }

    public void turnOnPush(IPushActionListener iPushActionListener) {
        p.a().a(iPushActionListener);
    }

    private PushClient(Context context) {
        p.a().a(context);
    }

    private void checkParam(String str) {
        if (str == null) {
            throw new IllegalArgumentException("PushManager String param should not be ".concat(String.valueOf(str)));
        }
    }

    public static PushClient getInstance(Context context) {
        if (sPushClient == null) {
            synchronized (SLOCK) {
                if (sPushClient == null) {
                    sPushClient = new PushClient(context.getApplicationContext());
                }
            }
        }
        return sPushClient;
    }

    public void bindAlias(String str, IPushActionListener iPushActionListener) {
        checkParam(str);
        p.a().a(str, iPushActionListener);
    }

    public void unBindAlias(String str, IPushActionListener iPushActionListener) {
        checkParam(str);
        p.a().b(str, iPushActionListener);
    }

    public void delTopic(String str, IPushActionListener iPushActionListener) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(str);
        p.a().b(arrayList, iPushActionListener);
    }

    public void setTopic(String str, IPushActionListener iPushActionListener) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(str);
        p.a().a(arrayList, iPushActionListener);
    }
}
