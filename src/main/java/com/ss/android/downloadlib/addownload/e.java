package com.ss.android.downloadlib.addownload;

import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.ss.android.download.api.b.b;
import com.ss.android.download.api.b.c;
import com.ss.android.downloadlib.c.l;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class e implements l.a {

    /* renamed from: a  reason: collision with root package name */
    static String f28776a = "e";

    /* renamed from: d  reason: collision with root package name */
    private static volatile e f28777d;

    /* renamed from: b  reason: collision with root package name */
    Map<Long, Pair<c, b>> f28778b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    l f28779c = new l(Looper.getMainLooper(), this);

    /* renamed from: e  reason: collision with root package name */
    private ConcurrentHashMap<Long, Runnable> f28780e = new ConcurrentHashMap<>();

    public static long b() {
        return k.g().optLong(DownloadConstants.f28719e, 1200);
    }

    public static e a() {
        if (f28777d == null) {
            synchronized (e.class) {
                if (f28777d == null) {
                    f28777d = new e();
                }
            }
        }
        return f28777d;
    }

    public final void a(Message message) {
        boolean z;
        String str;
        if (k.i() != null) {
            z = k.i().a();
        } else {
            z = false;
        }
        String str2 = f28776a;
        com.ss.android.downloadlib.c.c.a(str2, "handleMsg isAppInBackground:" + z, null);
        if (message != null && this.f28778b != null && !this.f28778b.isEmpty()) {
            String str3 = f28776a;
            com.ss.android.downloadlib.c.c.a(str3, "handleMsg msg.what:" + message.what, null);
            long j = 0;
            if (message.obj != null && (message.obj instanceof Long)) {
                j = ((Long) message.obj).longValue();
            }
            Pair pair = this.f28778b.get(Long.valueOf(j));
            if (pair != null) {
                c cVar = (c) pair.first;
                b bVar = (b) pair.second;
                if (bVar == null) {
                    str = "";
                } else {
                    str = bVar.A();
                }
                if (cVar != null) {
                    this.f28778b.remove(Long.valueOf(j));
                    int i = message.what;
                    if (i != 7) {
                        switch (i) {
                            case 4:
                                if (z) {
                                    a(true, cVar, str, 2);
                                    return;
                                }
                                return;
                            case 5:
                                if (z) {
                                    a(true, cVar, str, 1);
                                    return;
                                }
                                return;
                        }
                    } else {
                        Runnable runnable = this.f28780e.get(Long.valueOf(j));
                        this.f28780e.remove(Long.valueOf(j));
                        if (z) {
                            a(true, cVar, str, 1);
                            if (bVar != null && bVar.w()) {
                                String l = bVar.l();
                                if (TextUtils.isEmpty(l)) {
                                    l = "click";
                                }
                                j.a(l, 1, cVar, bVar);
                            }
                            return;
                        }
                        if (runnable != null) {
                            com.ss.android.downloadlib.c.c.a(f28776a, "handleMsg post currentRunnable", null);
                            this.f28779c.post(runnable);
                        }
                        a(false, cVar, str, 1);
                    }
                }
            }
        }
    }

    public static void a(boolean z, c cVar, String str, long j) {
        String str2;
        JSONObject jSONObject;
        if (cVar != null && cVar.v() != null) {
            JSONObject jSONObject2 = null;
            try {
                if (cVar.t() == null) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = new JSONObject(cVar.t().toString());
                }
                jSONObject2 = jSONObject;
                jSONObject2.putOpt("click_type", Long.valueOf(j));
            } catch (JSONException unused) {
            }
            JSONObject jSONObject3 = jSONObject2;
            if (z) {
                str2 = "quickapp_success";
            } else {
                str2 = "quickapp_fail";
            }
            String str3 = str2;
            if (TextUtils.isEmpty(str)) {
                str = "embeded_ad";
            }
            j.a(str, str3, cVar.o(), cVar.b(), cVar.p(), cVar.c(), jSONObject3, 2);
        }
    }
}
