package com.ss.android.newmedia.thread;

import android.content.Context;
import android.net.Uri;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.MaxLength;
import com.bytedance.retrofit2.http.Url;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.AppContext;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.newmedia.BaseAppData;
import com.ss.android.newmedia.a;
import com.ss.android.ugc.aweme.app.api.m;
import java.io.IOException;
import java.net.SocketTimeoutException;
import org.json.JSONObject;

public final class AppActionThread extends a {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f30361e;
    static final String g = (a.i + "/service/1/app_alert_action/");
    private final String h;
    private final boolean i = false;
    private final long j;
    private final int k;
    private final Context l;

    interface AppActionThreadGetApi {
        @GET
        Call<String> getResponse(@Url String str, @MaxLength int i);
    }

    public final void run() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f30361e, false, 18865, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30361e, false, 18865, new Class[0], Void.TYPE);
            return;
        }
        try {
            StringBuilder sb = new StringBuilder(g);
            sb.append("?rule_id=");
            sb.append(this.j);
            if (!StringUtils.isEmpty(this.h)) {
                sb.append("&lang=");
                sb.append(Uri.encode(this.h));
            }
            if (this.i) {
                sb.append("&alert_type=1");
            } else {
                sb.append("&action=");
                sb.append(this.k);
            }
            String sb2 = sb.toString();
            while (i2 < 4) {
                try {
                    if (!NetworkUtils.isNetworkAvailable(this.l)) {
                        Thread.sleep(3000);
                    }
                    String str = (String) ((AppActionThreadGetApi) m.a("https://aweme.snssdk.com", null).create(AppActionThreadGetApi.class)).getResponse(sb2, 10240).execute().body();
                    if (str != null) {
                        if (str.length() != 0) {
                            JSONObject jSONObject = new JSONObject(str);
                            com.ss.android.ugc.aweme.app.api.a.a(jSONObject, str, sb2);
                            if (a(jSONObject)) {
                                return;
                            }
                            return;
                        }
                    }
                    return;
                } catch (IOException | SocketTimeoutException unused) {
                    i2++;
                } catch (Throwable unused2) {
                    return;
                }
            }
        } catch (Exception unused3) {
        }
    }

    public AppActionThread(Context context, boolean z, long j2, int i2) {
        super(true);
        AppContext c2 = BaseAppData.a().c();
        this.h = context.getResources().getConfiguration().locale.getLanguage();
        this.j = j2;
        this.k = i2;
        this.l = c2.getContext();
    }
}
