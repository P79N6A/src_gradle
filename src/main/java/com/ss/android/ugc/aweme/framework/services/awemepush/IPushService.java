package com.ss.android.ugc.aweme.framework.services.awemepush;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import org.json.JSONObject;

public interface IPushService {
    boolean getConfirmPush(Context context);

    boolean getNotifyEnabled(Context context);

    void handleMsg(Context context, Message message);

    void init(Context context);

    void loadData(Context context);

    void notifyAllowNetwork(Context context, boolean z);

    void onAccountRefresh(boolean z, int i, Context context);

    void onActivityPaused(Activity activity);

    void onActivityResumed(Activity activity);

    void onEvent(Context context, String str, long j, long j2, JSONObject... jSONObjectArr);

    void saveData(Context context);

    void setConfirmPush(Context context, boolean z);

    void setNotifyEnabled(Context context, Boolean bool, int i);

    void trackClickPush(Context context, long j, boolean z, String str, JSONObject jSONObject);

    void trackPush(Context context, int i, Object obj);

    boolean tryUpdateAppSetting(Context context, JSONObject jSONObject, int i);
}
