package com.ss.android.ugc.awemepushapi;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import org.json.JSONObject;

public interface IPushApi {
    Dialog buildNotificationDialog(Activity activity, String str, String str2, Intent intent, int i);

    String getApiUrlPrefix();

    boolean getConfirmPush(Context context);

    boolean getNotifyEnabled(Context context);

    String iPrefix();

    void init(Context context, b bVar, boolean z, e eVar, g gVar);

    boolean isSswoAct(Activity activity);

    void notifyAllowNetwork(Context context, boolean z);

    void notifyLoc(Context context, String str);

    void onEvent(Context context, String str, long j, long j2, JSONObject... jSONObjectArr);

    void onLastActivityDestroy(Context context);

    void registerHttpMonitorServer(Context context, a aVar);

    void registerScreenOnRecevier(Context context);

    void setConfirmPush(Context context, boolean z);

    void setNotifyEnabled(Context context, Boolean bool, int i);

    void setNotifyEnabled(Context context, boolean z);

    void setPushRepeatCheckCallback(d dVar);

    void setType(Context context, int i);

    void trackClickPush(Context context, long j, boolean z, String str, JSONObject jSONObject);

    void trackPush(Context context, int i, Object obj);

    boolean tryUpdateAppSetting(Context context, JSONObject jSONObject, int i);
}
