package com.ss.android.ugc.aweme.app;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.bytedance.ttnet.utils.f;
import com.facebook.d.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.app.d.c;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

public class n extends com.ss.android.ugc.aweme.base.n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2666a;

    /* renamed from: b  reason: collision with root package name */
    public static final NetworkUtils.g f2667b = new NetworkUtils.g() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34209a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f34210b;

        public final boolean a() {
            if (!PatchProxy.isSupport(new Object[0], this, f34209a, false, 22323, new Class[0], Boolean.TYPE)) {
                return n.a();
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34209a, false, 22323, new Class[0], Boolean.TYPE)).booleanValue();
        }

        public final void a(long j, long j2, String str, String str2, NetworkUtils.f fVar) {
            long j3 = j;
            long j4 = j2;
            if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), str, str2, fVar}, this, f34209a, false, 22324, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, NetworkUtils.f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4), str, str2, fVar}, this, f34209a, false, 22324, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, NetworkUtils.f.class}, Void.TYPE);
                return;
            }
            try {
                ExecutorService executorService = n.f2760e;
                final NetworkUtils.f fVar2 = fVar;
                final String str3 = str;
                final long j5 = j;
                final long j6 = j2;
                final String str4 = str2;
                AnonymousClass1 r0 = new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f34211a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f34211a, false, 22326, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f34211a, false, 22326, new Class[0], Void.TYPE);
                            return;
                        }
                        String[] strArr = new String[1];
                        if (StringUtils.isEmpty(strArr[0]) && fVar2 != null) {
                            strArr[0] = fVar2.f28330a;
                        }
                        String str = null;
                        if (!TextUtils.isEmpty(str3)) {
                            str = Uri.parse(str3).getQueryParameter("retry_type");
                        }
                        if (!AnonymousClass2.this.f34210b && !TextUtils.isEmpty(str3) && str3.contains("aweme/v1/feed/?type=0")) {
                            AnonymousClass2.this.f34210b = true;
                        }
                        n.a(j5, j6, str3, strArr[0], str4, 200, c.a().a("retry_type", str).a("First_Request", String.valueOf(AnonymousClass2.this.f34210b)).b());
                    }
                };
                executorService.submit(r0);
            } catch (Exception unused) {
            }
        }

        public final void a(long j, long j2, String str, String str2, NetworkUtils.f fVar, Throwable th) {
            long j3 = j;
            long j4 = j2;
            if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), str, str2, fVar, th}, this, f34209a, false, 22325, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, NetworkUtils.f.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4), str, str2, fVar, th}, this, f34209a, false, 22325, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, NetworkUtils.f.class, Throwable.class}, Void.TYPE);
                return;
            }
            try {
                ExecutorService executorService = n.f2760e;
                final String str3 = str;
                final Throwable th2 = th;
                final NetworkUtils.f fVar2 = fVar;
                final String str4 = str2;
                final long j5 = j;
                final long j6 = j2;
                AnonymousClass2 r0 = new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f34217a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f34217a, false, 22327, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f34217a, false, 22327, new Class[0], Void.TYPE);
                            return;
                        }
                        String str = null;
                        if (!TextUtils.isEmpty(str3)) {
                            str = Uri.parse(str3).getQueryParameter("retry_type");
                            if (TextUtils.equals("no_retry", str)) {
                                return;
                            }
                        }
                        String[] strArr = new String[1];
                        int a2 = ak.a(th2, strArr);
                        if (StringUtils.isEmpty(strArr[0]) && fVar2 != null) {
                            strArr[0] = fVar2.f28330a;
                        }
                        if (!AnonymousClass2.this.f34210b && !TextUtils.isEmpty(str3) && str3.contains("aweme/v1/feed/?type=0")) {
                            AnonymousClass2.this.f34210b = true;
                        }
                        c a3 = c.a().a("First_Request", String.valueOf(AnonymousClass2.this.f34210b));
                        c a4 = a3.a("traceCode", str4).a("errorDesc", f.a(th2)).a("netWorkQuality", b.a().b().toString());
                        int i = a2;
                        JSONObject b2 = a4.a("netWorkSpeeds", ((int) b.a().c())).a("responseCode", String.valueOf(str4)).a("retryType", str).b();
                        n.b(j5, j6, str3, strArr[0], str4, i, b2);
                        n.a(j5, j6, str3, strArr[0], str4, i, b2);
                    }
                };
                executorService.submit(r0);
            } catch (Exception unused) {
            }
        }
    };

    public static void a(String str, String str2, JSONObject jSONObject) {
        JSONObject jSONObject2;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, jSONObject}, null, f2666a, true, 22319, new Class[]{String.class, String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, jSONObject}, null, f2666a, true, 22319, new Class[]{String.class, String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        if (jSONObject == null) {
            jSONObject2 = new JSONObject();
        } else {
            jSONObject2 = jSONObject;
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject2.put("service", str4);
            }
        } catch (JSONException unused) {
        }
        MonitorUtils.monitorCommonLog(str3, jSONObject2);
    }
}
