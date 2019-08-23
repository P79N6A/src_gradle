package com.ss.android.pushmanager.thirdparty;

import android.app.Service;
import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Pair;
import com.meituan.robust.PatchProxy;
import com.ss.android.pushmanager.f;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.DataFormatException;
import org.json.JSONObject;

public interface IPushDepend {
    public static final String SEND_PUSH_TOKEN_URL;

    void executeAsyncTask(AsyncTask asyncTask);

    JSONObject getMessage(byte[] bArr, boolean z) throws DataFormatException, IOException;

    Boolean getProviderBoolean(Context context, String str, Boolean bool);

    int getProviderInt(Context context, String str, int i);

    long getProviderLong(Context context, String str, long j);

    String getProviderString(Context context, String str, String str2);

    Pair<String, String> getPushConfig(int i);

    String getToken(Context context, int i);

    List<String> getWakeupBlacklistPkg(Context context);

    void hackJobHandler(Service service);

    boolean isAllowPushService(int i);

    void logEvent(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject);

    void loggerD(String str, String str2);

    boolean loggerDebug();

    void onClickNotPassThroughNotification(Context context, int i, String str, int i2, String str2);

    void onNotificationArrived(Context context, JSONObject jSONObject);

    void saveMapToProvider(Context context, Map<String, ?> map);

    void sendMonitor(Context context, String str, JSONObject jSONObject);

    void sendToken(Context context, ISendTokenCallBack iSendTokenCallBack);

    void setAdapter(IPushDepend iPushDepend);

    void tryHookInit(Context context);

    static {
        String str;
        if (PatchProxy.isSupport(new Object[0], null, f.f2537a, true, 18938, new Class[0], String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[0], null, f.f2537a, true, 18938, new Class[0], String.class);
        } else if (f.k == null || TextUtils.isEmpty(f.k.a())) {
            str = f.f2541e;
        } else {
            str = f.a(f.k.a(), "/service/1/update_token/");
        }
        SEND_PUSH_TOKEN_URL = str;
    }
}
