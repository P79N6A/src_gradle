package com.ss.android.pushmanager;

import android.content.Context;
import android.content.Intent;
import com.ss.android.pushmanager.a.a;
import org.json.JSONObject;

public interface IMessageAppAdapter {
    void checkPushConfiguration(String str, Context context);

    String handleMySelfPushIntent(Intent intent);

    void initOnApplication(Context context, c cVar);

    void initOnApplication(Context context, c cVar, String str);

    @Deprecated
    void initPushSetting(Context context);

    void setDebuggable(boolean z);

    void setIExtraMessageDepend(b bVar);

    void setMonitorEnable(boolean z);

    void setMonitorImpl(a aVar);

    void trackClickPush(Context context, long j, boolean z, String str, JSONObject jSONObject);

    void trackPush(Context context, int i, Object obj);
}
