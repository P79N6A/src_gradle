package com.ss.android.newmedia.thread;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Url;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.newmedia.e;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.q.c;
import org.json.JSONObject;

public final class GetSettingThread extends a {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f30362e;
    private static final String j = (com.ss.android.newmedia.a.h + "/service/settings/v2/");
    final Context g;
    final Handler h;
    final boolean i;

    interface GetSettingThreadApi {
        @GET
        Call<String> getResponse(@Url String str);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f30363a;

        /* renamed from: b  reason: collision with root package name */
        public JSONObject f30364b;

        /* renamed from: c  reason: collision with root package name */
        public JSONObject f30365c;
    }

    private int c() {
        if (PatchProxy.isSupport(new Object[0], this, f30362e, false, 18867, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f30362e, false, 18867, new Class[0], Integer.TYPE)).intValue();
        }
        try {
            SharedPreferences a2 = c.a(k.a(), "app_setting", 0);
            if (a2 != null) {
                return a2.getInt("has_local_cache", 0);
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f30362e, false, 18866, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30362e, false, 18866, new Class[0], Void.TYPE);
            return;
        }
        int i2 = 17;
        try {
            if (!NetworkUtils.isNetworkAvailable(this.g)) {
                i2 = 12;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                sb.append("?app=1");
                sb.append("&has_local_cache=");
                sb.append(c());
                if (this.i) {
                    sb.append("&default=1");
                }
                String str = (String) ((GetSettingThreadApi) m.a("https://aweme.snssdk.com", null).create(GetSettingThreadApi.class)).getResponse(sb.toString()).execute().body();
                if (!StringUtils.isEmpty(str)) {
                    JSONObject jSONObject = new JSONObject(str);
                    if (a(jSONObject)) {
                        JSONObject optJSONObject = jSONObject.optJSONObject("data");
                        a aVar = new a();
                        aVar.f30363a = this.i;
                        aVar.f30364b = optJSONObject.optJSONObject("default");
                        aVar.f30365c = optJSONObject.optJSONObject(PushConstants.EXTRA_APPLICATION_PENDING_INTENT);
                        Message obtainMessage = this.h.obtainMessage(10008);
                        obtainMessage.obj = aVar;
                        this.h.sendMessage(obtainMessage);
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            i2 = e.a(this.g, th);
        }
        Message obtainMessage2 = this.h.obtainMessage(10009);
        obtainMessage2.arg1 = i2;
        this.h.sendMessage(obtainMessage2);
    }

    public GetSettingThread(Context context, Handler handler, boolean z) {
        this.g = context;
        this.h = handler;
        this.i = z;
    }
}
