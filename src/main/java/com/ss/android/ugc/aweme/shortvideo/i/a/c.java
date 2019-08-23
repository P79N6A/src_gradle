package com.ss.android.ugc.aweme.shortvideo.i.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.traffic.a;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

public class c extends b {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f68188c;

    /* renamed from: a  reason: collision with root package name */
    private String f68189a;

    /* renamed from: b  reason: collision with root package name */
    private String f68190b;

    /* renamed from: d  reason: collision with root package name */
    private long f68191d;

    public void onDownloadStart(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f68188c, false, 78312, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f68188c, false, 78312, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f68191d = System.currentTimeMillis();
    }

    public void onDownloadSuccess(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f68188c, false, 78313, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f68188c, false, 78313, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (NetworkUtils.isNetworkAvailable(k.a())) {
            n.a("aweme_download_error_rate", 0, new com.ss.android.ugc.aweme.app.d.c().a("duration", Long.valueOf(System.currentTimeMillis() - this.f68191d)).a("from", this.f68190b).b());
            File file = new File(str);
            if (file.exists()) {
                a.y.c(file.length());
            }
        }
    }

    public void onError(com.ss.android.ugc.a.c cVar) {
        com.ss.android.ugc.a.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f68188c, false, 78314, new Class[]{com.ss.android.ugc.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f68188c, false, 78314, new Class[]{com.ss.android.ugc.a.c.class}, Void.TYPE);
            return;
        }
        if (NetworkUtils.isNetworkAvailable(k.a())) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(PushConstants.WEB_URL, this.f68189a);
                jSONObject.put("from", this.f68190b);
            } catch (JSONException unused) {
            }
            n.a("aweme_download_error_rate", 1, jSONObject);
        }
        com.ss.android.ugc.aweme.app.d.a.a("aweme_movie_download_log", "", cVar2.f31520b, cVar2.f31519a, this.f68189a, this.f68190b);
    }

    public c(String str, String str2) {
        this.f68189a = str;
        this.f68190b = str2;
    }
}
