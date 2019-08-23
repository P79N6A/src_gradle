package com.amap.api.mapcore2d;

import android.content.Context;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class fz {

    /* renamed from: b  reason: collision with root package name */
    private static fz f6205b;

    /* renamed from: a  reason: collision with root package name */
    ep f6206a;

    /* renamed from: c  reason: collision with root package name */
    private Context f6207c;

    /* renamed from: d  reason: collision with root package name */
    private int f6208d;

    /* renamed from: e  reason: collision with root package name */
    private int f6209e = gc.f6224e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6210f;

    private fz(Context context) {
        this.f6207c = context;
        this.f6206a = ep.a();
    }

    public static fz a(Context context) {
        if (f6205b == null) {
            f6205b = new fz(context);
        }
        return f6205b;
    }

    public final ex a(ga gaVar) throws Throwable {
        if (gf.a(gf.c(this.f6207c)) == -1) {
            return null;
        }
        long b2 = gf.b();
        ex a2 = this.f6206a.a(gaVar, this.f6210f);
        this.f6208d = Long.valueOf(gf.b() - b2).intValue();
        return a2;
    }

    public final ga a(Context context, byte[] bArr, String str) {
        try {
            HashMap hashMap = new HashMap();
            ga gaVar = new ga(context, gc.b());
            try {
                hashMap.put("Content-Type", "application/octet-stream");
                hashMap.put("Accept-Encoding", "gzip");
                hashMap.put("gzipped", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                hashMap.put("Connection", "Keep-Alive");
                hashMap.put("User-Agent", "AMAP_Location_SDK_Android 3.4.0");
                hashMap.put("KEY", cp.f(context));
                hashMap.put("enginever", "4.7");
                String a2 = cs.a();
                String a3 = cs.a(context, a2, "key=" + cp.f(context));
                hashMap.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, a2);
                hashMap.put("scode", a3);
                hashMap.put("encr", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                gaVar.b((Map<String, String>) hashMap);
                gaVar.o();
                gaVar.a(String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s&loc_channel=%s", new Object[]{"3.4.0", "loc", 3}));
                gaVar.n();
                gaVar.b(str);
                gaVar.b(gf.a(bArr));
                gaVar.a(cw.a(context));
                HashMap hashMap2 = new HashMap();
                hashMap2.put("output", "bin");
                hashMap2.put("policy", "3103");
                gaVar.a((Map<String, String>) hashMap2);
                gaVar.a(this.f6209e);
                gaVar.b(this.f6209e);
                if (!this.f6210f) {
                    return gaVar;
                }
                gaVar.b(gaVar.g().replace("http", "https"));
                return gaVar;
            } catch (Throwable unused) {
                return gaVar;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public final void a(long j, boolean z) {
        try {
            this.f6210f = z;
            this.f6209e = Long.valueOf(j).intValue();
        } catch (Throwable th) {
            gc.a(th, "netmanager", "setOption");
        }
    }
}
