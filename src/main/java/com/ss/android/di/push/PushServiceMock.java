package com.ss.android.di.push;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.awemepushapi.IPushApi;
import com.ss.android.ugc.awemepushapi.a;
import com.ss.android.ugc.awemepushapi.b;
import com.ss.android.ugc.awemepushapi.d;
import com.ss.android.ugc.awemepushapi.e;
import com.ss.android.ugc.awemepushapi.g;
import org.json.JSONObject;

public class PushServiceMock implements IPushApi {
    public Dialog buildNotificationDialog(Activity activity, String str, String str2, Intent intent, int i) {
        return null;
    }

    public String getApiUrlPrefix() {
        return null;
    }

    public boolean getConfirmPush(Context context) {
        return false;
    }

    public boolean getNotifyEnabled(Context context) {
        return false;
    }

    public String iPrefix() {
        return null;
    }

    public void init(Context context, b bVar, boolean z, e eVar, g gVar) {
    }

    public boolean isSswoAct(Activity activity) {
        return false;
    }

    public void notifyAllowNetwork(Context context, boolean z) {
    }

    public void notifyLoc(Context context, String str) {
    }

    public void onEvent(Context context, String str, long j, long j2, JSONObject... jSONObjectArr) {
    }

    public void onLastActivityDestroy(Context context) {
    }

    public void registerHttpMonitorServer(Context context, a aVar) {
    }

    public void registerScreenOnRecevier(Context context) {
    }

    public void setConfirmPush(Context context, boolean z) {
    }

    public void setNotifyEnabled(Context context, Boolean bool, int i) {
    }

    public void setNotifyEnabled(Context context, boolean z) {
    }

    public void setPushRepeatCheckCallback(d dVar) {
    }

    public void setType(Context context, int i) {
    }

    public void trackClickPush(Context context, long j, boolean z, String str, JSONObject jSONObject) {
    }

    public void trackPush(Context context, int i, Object obj) {
    }

    public boolean tryUpdateAppSetting(Context context, JSONObject jSONObject, int i) {
        return false;
    }
}
