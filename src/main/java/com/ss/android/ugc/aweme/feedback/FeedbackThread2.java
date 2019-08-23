package com.ss.android.ugc.aweme.feedback;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.MaxLength;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.QueryMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.http.d;
import com.ss.android.newmedia.a;
import com.ss.android.newmedia.e;
import com.ss.android.ugc.aweme.feedback.a.a.b;
import com.ss.android.ugc.aweme.feedback.d;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.CommonApi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class FeedbackThread2 extends ThreadPlus {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47087a;

    /* renamed from: d  reason: collision with root package name */
    private static final String f47088d = (a.i + "/feedback/2/list/");

    /* renamed from: e  reason: collision with root package name */
    private static final String f47089e = (a.i + "/feedback/3/list/");

    /* renamed from: f  reason: collision with root package name */
    private static final String f47090f = (a.i + "/feedback/1/post_message/");
    private static final String g = (a.g + "/2/data/upload_image/");

    /* renamed from: b  reason: collision with root package name */
    d[] f47091b = new d[1];

    /* renamed from: c  reason: collision with root package name */
    boolean f47092c;
    private final Handler h;
    private final Context i;
    private b j;
    private o k;
    private n l;
    private boolean m = true;

    public interface FeedbackApi {
        @FormUrlEncoded
        @POST("/feedback/2/post_message/")
        Call<String> doPost(@MaxLength int i, @FieldMap Map<String, String> map, @QueryMap Map<String, String> map2);
    }

    private int a() {
        if (PatchProxy.isSupport(new Object[0], this, f47087a, false, 43803, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f47087a, false, 43803, new Class[0], Integer.TYPE)).intValue();
        }
        return a(0, this.j.a(true), false);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(39:45|46|(1:48)|49|(5:51|(2:53|(5:55|(1:57)(1:58)|59|123|(1:125))(1:60))|120|123|(0))|61|(1:63)|64|(1:66)|67|(1:69)|70|(1:72)|73|(1:75)|76|(1:78)|79|(1:81)|82|(1:84)|85|(1:87)|88|(1:90)|91|(1:93)|94|(1:96)|97|98|99|100|(1:102)|103|(1:107)|108|(4:110|(4:112|(1:114)(1:115)|116|(1:118))(1:119)|123|(0))|120) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x03be */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x03c6 A[Catch:{ Throwable -> 0x04d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0446 A[Catch:{ Throwable -> 0x04d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x04dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r21 = this;
            r8 = r21
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f47087a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 43796(0xab14, float:6.1371E-41)
            r2 = r21
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0029
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f47087a
            r4 = 0
            r5 = 43796(0xab14, float:6.1371E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0029:
            android.content.Context r1 = r8.i
            com.ss.android.ugc.aweme.feedback.b r1 = com.ss.android.ugc.aweme.feedback.b.a((android.content.Context) r1)
            r8.j = r1
            boolean r1 = r8.m
            r9 = 10
            r10 = 18
            r11 = 11
            r12 = 1
            if (r1 == 0) goto L_0x01b6
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f47087a
            r4 = 0
            r5 = 43807(0xab1f, float:6.1387E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r21
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0063
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f47087a
            r4 = 0
            r5 = 43807(0xab1f, float:6.1387E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x04e9
        L_0x0063:
            com.ss.android.ugc.aweme.feedback.o r1 = r8.k
            int r1 = r1.f47209e
            r2 = 2
            if (r1 != r2) goto L_0x0089
            int r0 = r21.a()
            com.ss.android.ugc.aweme.feedback.o r1 = r8.k
            com.ss.android.ugc.aweme.feedback.b r12 = r8.j
            r13 = 0
            com.ss.android.ugc.aweme.feedback.o r2 = r8.k
            long r2 = r2.f47206b
            com.ss.android.ugc.aweme.feedback.o r4 = r8.k
            int r4 = r4.f47207c
            java.lang.String r18 = " DESC"
            r15 = r2
            r17 = r4
            java.util.List r2 = r12.a(r13, r15, r17, r18)
            r1.g = r2
            goto L_0x019f
        L_0x0089:
            com.ss.android.ugc.aweme.feedback.o r1 = r8.k
            int r1 = r1.f47209e
            r2 = 3
            if (r1 != r2) goto L_0x00b5
            int r0 = r21.a()
            com.ss.android.ugc.aweme.feedback.o r1 = r8.k
            com.ss.android.ugc.aweme.feedback.b r12 = r8.j
            r13 = 0
            com.ss.android.ugc.aweme.feedback.o r2 = r8.k
            long r2 = r2.f47206b
            r17 = -1
            java.lang.String r18 = " DESC"
            r15 = r2
            java.util.List r2 = r12.a(r13, r15, r17, r18)
            r1.g = r2
            com.ss.android.ugc.aweme.feedback.o r1 = r8.k
            com.ss.android.ugc.aweme.feedback.b r2 = r8.j
            java.util.List r2 = r2.b()
            r1.h = r2
            goto L_0x019f
        L_0x00b5:
            com.ss.android.ugc.aweme.feedback.o r1 = r8.k
            int r1 = r1.f47209e
            r2 = 5
            if (r1 != r2) goto L_0x00da
            com.ss.android.ugc.aweme.feedback.o r1 = r8.k
            com.ss.android.ugc.aweme.feedback.b r12 = r8.j
            r13 = 0
            r15 = 0
            r17 = -1
            r18 = 0
            java.util.List r2 = r12.a(r13, r15, r17, r18)
            r1.g = r2
            com.ss.android.ugc.aweme.feedback.o r1 = r8.k
            com.ss.android.ugc.aweme.feedback.b r2 = r8.j
            java.util.List r2 = r2.b()
            r1.h = r2
            goto L_0x019f
        L_0x00da:
            com.ss.android.ugc.aweme.feedback.o r1 = r8.k
            int r1 = r1.f47209e
            r2 = 4
            if (r1 != r2) goto L_0x0142
            int r1 = r21.a()
            if (r1 != 0) goto L_0x0140
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f47087a
            r4 = 0
            r5 = 43804(0xab1c, float:6.1382E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Integer.TYPE
            r2 = r21
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0114
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f47087a
            r4 = 0
            r5 = 43804(0xab1c, float:6.1382E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Integer.TYPE
            r2 = r21
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x0123
        L_0x0114:
            com.ss.android.ugc.aweme.feedback.b r1 = r8.j
            long r2 = r1.a((boolean) r0)
            r4 = 0
            r6 = 0
            r1 = r21
            int r0 = r1.a((long) r2, (long) r4, (boolean) r6)
        L_0x0123:
            com.ss.android.ugc.aweme.feedback.o r1 = r8.k
            com.ss.android.ugc.aweme.feedback.b r12 = r8.j
            r13 = 0
            r15 = 0
            r17 = -1
            r18 = 0
            java.util.List r2 = r12.a(r13, r15, r17, r18)
            r1.g = r2
            com.ss.android.ugc.aweme.feedback.o r1 = r8.k
            com.ss.android.ugc.aweme.feedback.b r2 = r8.j
            java.util.List r2 = r2.b()
            r1.h = r2
            goto L_0x019f
        L_0x0140:
            r0 = r1
            goto L_0x019f
        L_0x0142:
            com.ss.android.ugc.aweme.feedback.o r1 = r8.k
            int r1 = r1.f47209e
            if (r1 != r12) goto L_0x019d
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f47087a
            r4 = 0
            r5 = 43802(0xab1a, float:6.138E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Integer.TYPE
            r2 = r21
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0175
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f47087a
            r4 = 0
            r5 = 43802(0xab1a, float:6.138E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Integer.TYPE
            r2 = r21
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x0180
        L_0x0175:
            r2 = 0
            r4 = 0
            r6 = 1
            r1 = r21
            int r0 = r1.a((long) r2, (long) r4, (boolean) r6)
        L_0x0180:
            com.ss.android.ugc.aweme.feedback.o r1 = r8.k
            com.ss.android.ugc.aweme.feedback.b r12 = r8.j
            r13 = 0
            r15 = 0
            r17 = -1
            r18 = 0
            java.util.List r2 = r12.a(r13, r15, r17, r18)
            r1.g = r2
            com.ss.android.ugc.aweme.feedback.o r1 = r8.k
            com.ss.android.ugc.aweme.feedback.b r2 = r8.j
            java.util.List r2 = r2.b()
            r1.h = r2
            goto L_0x019f
        L_0x019d:
            r0 = 18
        L_0x019f:
            if (r0 != 0) goto L_0x01a2
            goto L_0x01a4
        L_0x01a2:
            r9 = 11
        L_0x01a4:
            android.os.Handler r1 = r8.h
            android.os.Message r1 = r1.obtainMessage(r9)
            com.ss.android.ugc.aweme.feedback.o r2 = r8.k
            r1.obj = r2
            r1.arg1 = r0
            android.os.Handler r0 = r8.h
            r0.sendMessage(r1)
            return
        L_0x01b6:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f47087a
            r4 = 0
            r5 = 43798(0xab16, float:6.1374E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r21
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x01dc
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f47087a
            r4 = 0
            r5 = 43798(0xab16, float:6.1374E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x01dc:
            java.lang.String r1 = ""
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            com.ss.android.ugc.aweme.feedback.n r4 = r8.l     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r4 = r4.f47204f     // Catch:{ Throwable -> 0x04d1 }
            if (r4 != 0) goto L_0x01ee
            com.ss.android.ugc.aweme.feedback.n r4 = r8.l     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r5 = ""
            r4.f47204f = r5     // Catch:{ Throwable -> 0x04d1 }
        L_0x01ee:
            java.io.File r4 = new java.io.File     // Catch:{ Throwable -> 0x04d1 }
            com.ss.android.ugc.aweme.feedback.n r5 = r8.l     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r5 = r5.f47204f     // Catch:{ Throwable -> 0x04d1 }
            r4.<init>(r5)     // Catch:{ Throwable -> 0x04d1 }
            boolean r4 = r4.exists()     // Catch:{ Throwable -> 0x04d1 }
            r13 = -1024(0xfffffffffffffc00, float:NaN)
            if (r4 == 0) goto L_0x02ab
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ Throwable -> 0x04d1 }
            r1.<init>()     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r2 = "watermark"
            java.lang.String r3 = "0"
            r1.put(r2, r3)     // Catch:{ Throwable -> 0x04d1 }
            r14 = 20480(0x5000, float:2.8699E-41)
            java.lang.String r15 = g     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r16 = "image"
            com.ss.android.ugc.aweme.feedback.n r2 = r8.l     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r2 = r2.f47204f     // Catch:{ Throwable -> 0x04d1 }
            com.ss.android.common.http.d[] r3 = r8.f47091b     // Catch:{ Throwable -> 0x04d1 }
            r17 = r2
            r18 = r1
            r19 = r3
            java.lang.String r1 = com.ss.android.common.util.NetworkUtils.postFile(r14, r15, r16, r17, r18, r19)     // Catch:{ Throwable -> 0x04d1 }
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x04d1 }
            if (r2 != 0) goto L_0x04ce
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ Throwable -> 0x04d1 }
            r14.<init>(r1)     // Catch:{ Throwable -> 0x04d1 }
            boolean r1 = com.ss.android.newmedia.thread.a.a(r14)     // Catch:{ Throwable -> 0x04d1 }
            if (r1 != 0) goto L_0x028b
            java.lang.Object[] r1 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x04d1 }
            r1[r0] = r14     // Catch:{ Throwable -> 0x04d1 }
            com.meituan.robust.ChangeQuickRedirect r3 = f47087a     // Catch:{ Throwable -> 0x04d1 }
            r4 = 0
            r5 = 43800(0xab18, float:6.1377E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]     // Catch:{ Throwable -> 0x04d1 }
            java.lang.Class<org.json.JSONObject> r2 = org.json.JSONObject.class
            r6[r0] = r2     // Catch:{ Throwable -> 0x04d1 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x04d1 }
            r2 = r21
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x04d1 }
            if (r1 == 0) goto L_0x0264
            java.lang.Object[] r1 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x04d1 }
            r1[r0] = r14     // Catch:{ Throwable -> 0x04d1 }
            com.meituan.robust.ChangeQuickRedirect r3 = f47087a     // Catch:{ Throwable -> 0x04d1 }
            r4 = 0
            r5 = 43800(0xab18, float:6.1377E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]     // Catch:{ Throwable -> 0x04d1 }
            java.lang.Class<org.json.JSONObject> r2 = org.json.JSONObject.class
            r6[r0] = r2     // Catch:{ Throwable -> 0x04d1 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x04d1 }
            r2 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x04d1 }
            goto L_0x0287
        L_0x0264:
            java.lang.String r0 = "feedback_uploadimage_error_rate"
            com.ss.android.ugc.aweme.app.d.c r1 = com.ss.android.ugc.aweme.app.d.c.a()     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r2 = "errorCode"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)     // Catch:{ Throwable -> 0x04d1 }
            com.ss.android.ugc.aweme.app.d.c r1 = r1.a((java.lang.String) r2, (java.lang.Integer) r3)     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r2 = "errorDesc"
            java.lang.String r3 = "data"
            java.lang.String r3 = r14.optString(r3)     // Catch:{ Throwable -> 0x04d1 }
            com.ss.android.ugc.aweme.app.d.c r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ Throwable -> 0x04d1 }
            org.json.JSONObject r1 = r1.b()     // Catch:{ Throwable -> 0x04d1 }
            com.ss.android.ugc.aweme.app.n.a((java.lang.String) r0, (org.json.JSONObject) r1)     // Catch:{ Throwable -> 0x04d1 }
        L_0x0287:
            r0 = 16
            goto L_0x04d8
        L_0x028b:
            java.lang.String r1 = "data"
            org.json.JSONObject r1 = r14.optJSONObject(r1)     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r2 = "web_uri"
            java.lang.String r3 = ""
            java.lang.String r2 = r1.optString(r2, r3)     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r3 = "width"
            java.lang.String r3 = r1.optString(r3)     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r4 = "height"
            java.lang.String r1 = r1.optString(r4)     // Catch:{ Throwable -> 0x04d1 }
            r20 = r3
            r3 = r1
            r1 = r2
            r2 = r20
        L_0x02ab:
            java.lang.String r4 = ""
            com.ss.android.ugc.aweme.framework.services.ServiceManager r5 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch:{ Throwable -> 0x04d1 }
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r6 = com.ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r5 = r5.getService(r6)     // Catch:{ Throwable -> 0x04d1 }
            com.ss.android.ugc.aweme.services.IAVService r5 = (com.ss.android.ugc.aweme.services.IAVService) r5     // Catch:{ Throwable -> 0x04d1 }
            com.ss.android.ugc.aweme.services.settings.IAVSettingsService r5 = r5.avSettingsService()     // Catch:{ Throwable -> 0x04d1 }
            boolean r5 = r5.enableFeedbackLog()     // Catch:{ Throwable -> 0x04d1 }
            if (r5 == 0) goto L_0x02c7
            java.lang.String r4 = com.ss.android.ugc.aweme.feedback.g.a()     // Catch:{ Throwable -> 0x04d1 }
        L_0x02c7:
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ Throwable -> 0x04d1 }
            r5.<init>()     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r6 = "appkey"
            java.lang.String r7 = "aweme-android"
            r5.put(r6, r7)     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r6 = "content"
            com.ss.android.ugc.aweme.feedback.n r7 = r8.l     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r7 = r7.f47199a     // Catch:{ Throwable -> 0x04d1 }
            r5.put(r6, r7)     // Catch:{ Throwable -> 0x04d1 }
            com.ss.android.ugc.aweme.feedback.n r6 = r8.l     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r6 = r6.f47200b     // Catch:{ Throwable -> 0x04d1 }
            boolean r6 = com.bytedance.common.utility.StringUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x04d1 }
            if (r6 != 0) goto L_0x02ef
            java.lang.String r6 = "contact"
            com.ss.android.ugc.aweme.feedback.n r7 = r8.l     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r7 = r7.f47200b     // Catch:{ Throwable -> 0x04d1 }
            r5.put(r6, r7)     // Catch:{ Throwable -> 0x04d1 }
        L_0x02ef:
            com.ss.android.ugc.aweme.feedback.n r6 = r8.l     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r6 = r6.f47201c     // Catch:{ Throwable -> 0x04d1 }
            boolean r6 = com.bytedance.common.utility.StringUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x04d1 }
            if (r6 != 0) goto L_0x0302
            java.lang.String r6 = "report_type"
            com.ss.android.ugc.aweme.feedback.n r7 = r8.l     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r7 = r7.f47201c     // Catch:{ Throwable -> 0x04d1 }
            r5.put(r6, r7)     // Catch:{ Throwable -> 0x04d1 }
        L_0x0302:
            com.ss.android.ugc.aweme.feedback.n r6 = r8.l     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r6 = r6.f47202d     // Catch:{ Throwable -> 0x04d1 }
            boolean r6 = com.bytedance.common.utility.StringUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x04d1 }
            if (r6 != 0) goto L_0x0315
            java.lang.String r6 = "report_content"
            com.ss.android.ugc.aweme.feedback.n r7 = r8.l     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r7 = r7.f47202d     // Catch:{ Throwable -> 0x04d1 }
            r5.put(r6, r7)     // Catch:{ Throwable -> 0x04d1 }
        L_0x0315:
            com.ss.android.ugc.aweme.feedback.n r6 = r8.l     // Catch:{ Throwable -> 0x04d1 }
            long r6 = r6.f47203e     // Catch:{ Throwable -> 0x04d1 }
            r14 = 0
            int r16 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x032c
            java.lang.String r6 = "user_id"
            com.ss.android.ugc.aweme.feedback.n r7 = r8.l     // Catch:{ Throwable -> 0x04d1 }
            long r14 = r7.f47203e     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r7 = java.lang.String.valueOf(r14)     // Catch:{ Throwable -> 0x04d1 }
            r5.put(r6, r7)     // Catch:{ Throwable -> 0x04d1 }
        L_0x032c:
            boolean r6 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x04d1 }
            if (r6 != 0) goto L_0x0337
            java.lang.String r6 = "image_uri"
            r5.put(r6, r1)     // Catch:{ Throwable -> 0x04d1 }
        L_0x0337:
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x04d1 }
            if (r1 != 0) goto L_0x0342
            java.lang.String r1 = "aweme_infra_log"
            r5.put(r1, r4)     // Catch:{ Throwable -> 0x04d1 }
        L_0x0342:
            java.lang.String r1 = "device"
            java.lang.String r4 = android.os.Build.MODEL     // Catch:{ Throwable -> 0x04d1 }
            r5.put(r1, r4)     // Catch:{ Throwable -> 0x04d1 }
            com.ss.android.ugc.aweme.feedback.n r1 = r8.l     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r1 = r1.g     // Catch:{ Throwable -> 0x04d1 }
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x04d1 }
            if (r1 != 0) goto L_0x035c
            java.lang.String r1 = "feedback_id"
            com.ss.android.ugc.aweme.feedback.n r4 = r8.l     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r4 = r4.g     // Catch:{ Throwable -> 0x04d1 }
            r5.put(r1, r4)     // Catch:{ Throwable -> 0x04d1 }
        L_0x035c:
            com.ss.android.ugc.aweme.feedback.n r1 = r8.l     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r1 = r1.h     // Catch:{ Throwable -> 0x04d1 }
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x04d1 }
            if (r1 != 0) goto L_0x036f
            java.lang.String r1 = "fantasy_log"
            com.ss.android.ugc.aweme.feedback.n r4 = r8.l     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r4 = r4.h     // Catch:{ Throwable -> 0x04d1 }
            r5.put(r1, r4)     // Catch:{ Throwable -> 0x04d1 }
        L_0x036f:
            com.ss.android.ugc.aweme.feedback.n r1 = r8.l     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r1 = r1.i     // Catch:{ Throwable -> 0x04d1 }
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x04d1 }
            if (r1 != 0) goto L_0x0382
            java.lang.String r1 = "aweme_login_log"
            com.ss.android.ugc.aweme.feedback.n r4 = r8.l     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r4 = r4.i     // Catch:{ Throwable -> 0x04d1 }
            r5.put(r1, r4)     // Catch:{ Throwable -> 0x04d1 }
        L_0x0382:
            com.ss.android.ugc.aweme.feedback.n r1 = r8.l     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r1 = r1.j     // Catch:{ Throwable -> 0x04d1 }
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x04d1 }
            if (r1 != 0) goto L_0x0395
            java.lang.String r1 = "last_uid"
            com.ss.android.ugc.aweme.feedback.n r4 = r8.l     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r4 = r4.j     // Catch:{ Throwable -> 0x04d1 }
            r5.put(r1, r4)     // Catch:{ Throwable -> 0x04d1 }
        L_0x0395:
            com.ss.android.ugc.aweme.feedback.n r1 = r8.l     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r1 = r1.k     // Catch:{ Throwable -> 0x04d1 }
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x04d1 }
            if (r1 != 0) goto L_0x03a8
            java.lang.String r1 = "description"
            com.ss.android.ugc.aweme.feedback.n r4 = r8.l     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r4 = r4.k     // Catch:{ Throwable -> 0x04d1 }
            r5.put(r1, r4)     // Catch:{ Throwable -> 0x04d1 }
        L_0x03a8:
            android.content.Context r1 = r8.i     // Catch:{ Exception -> 0x03be }
            java.lang.String r1 = com.ss.android.common.applog.AppLog.getVersion(r1)     // Catch:{ Exception -> 0x03be }
            java.lang.String r4 = "app_version"
            r5.put(r4, r1)     // Catch:{ Exception -> 0x03be }
            java.lang.String r1 = "sig_hash"
            android.content.Context r4 = r8.i     // Catch:{ Exception -> 0x03be }
            java.lang.String r4 = com.ss.android.common.applog.AppLog.getSigHash(r4)     // Catch:{ Exception -> 0x03be }
            r5.put(r1, r4)     // Catch:{ Exception -> 0x03be }
        L_0x03be:
            android.content.Context r1 = r8.i     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r1 = com.ss.android.common.util.NetworkUtils.getNetworkAccessType((android.content.Context) r1)     // Catch:{ Throwable -> 0x04d1 }
            if (r1 == 0) goto L_0x03cb
            java.lang.String r4 = "network_type"
            r5.put(r4, r1)     // Catch:{ Throwable -> 0x04d1 }
        L_0x03cb:
            java.lang.String r1 = com.ss.android.newmedia.p.c()     // Catch:{ Throwable -> 0x04d1 }
            if (r1 == 0) goto L_0x03de
            int r4 = r1.length()     // Catch:{ Throwable -> 0x04d1 }
            r6 = 30
            if (r4 >= r6) goto L_0x03de
            java.lang.String r4 = "rom"
            r5.put(r4, r1)     // Catch:{ Throwable -> 0x04d1 }
        L_0x03de:
            r8.a(r5)     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r1 = "image_width"
            r5.put(r1, r2)     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r1 = "image_height"
            r5.put(r1, r3)     // Catch:{ Throwable -> 0x04d1 }
            com.ss.android.common.applog.NetUtil.putCommonParams(r5, r12)     // Catch:{ Throwable -> 0x04d1 }
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch:{ Throwable -> 0x04d1 }
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IRetrofitService> r2 = com.ss.android.ugc.aweme.framework.services.IRetrofitService.class
            java.lang.Object r1 = r1.getService(r2)     // Catch:{ Throwable -> 0x04d1 }
            com.ss.android.ugc.aweme.framework.services.IRetrofitService r1 = (com.ss.android.ugc.aweme.framework.services.IRetrofitService) r1     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r2 = com.ss.android.newmedia.a.i     // Catch:{ Throwable -> 0x04d1 }
            com.ss.android.ugc.aweme.framework.services.IRetrofit r1 = r1.createNewRetrofit(r2)     // Catch:{ Throwable -> 0x04d1 }
            java.lang.Class<com.ss.android.ugc.aweme.feedback.FeedbackThread2$FeedbackApi> r2 = com.ss.android.ugc.aweme.feedback.FeedbackThread2.FeedbackApi.class
            java.lang.Object r1 = r1.create(r2)     // Catch:{ Throwable -> 0x04d1 }
            com.ss.android.ugc.aweme.feedback.FeedbackThread2$FeedbackApi r1 = (com.ss.android.ugc.aweme.feedback.FeedbackThread2.FeedbackApi) r1     // Catch:{ Throwable -> 0x04d1 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Throwable -> 0x04d1 }
            r2.<init>()     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r3 = "app_name"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r6 = "aweme-"
            r4.<init>(r6)     // Catch:{ Throwable -> 0x04d1 }
            com.ss.android.ugc.aweme.framework.services.ServiceManager r6 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch:{ Throwable -> 0x04d1 }
            java.lang.Class<com.ss.android.ugc.aweme.language.I18nManagerService> r7 = com.ss.android.ugc.aweme.language.I18nManagerService.class
            java.lang.Object r6 = r6.getService(r7)     // Catch:{ Throwable -> 0x04d1 }
            com.ss.android.ugc.aweme.language.I18nManagerService r6 = (com.ss.android.ugc.aweme.language.I18nManagerService) r6     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r6 = r6.getRegion()     // Catch:{ Throwable -> 0x04d1 }
            r4.append(r6)     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x04d1 }
            r2.put(r3, r4)     // Catch:{ Throwable -> 0x04d1 }
            r3 = 12040(0x2f08, float:1.6872E-41)
            com.bytedance.retrofit2.Call r1 = r1.doPost(r3, r5, r2)     // Catch:{ Throwable -> 0x04d1 }
            com.bytedance.retrofit2.SsResponse r1 = r1.execute()     // Catch:{ Throwable -> 0x04d1 }
            java.lang.Object r1 = r1.body()     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x04d1 }
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x04d1 }
            if (r2 != 0) goto L_0x04ce
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ Throwable -> 0x04d1 }
            r14.<init>(r1)     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r1 = "message"
            java.lang.String r1 = r14.optString(r1)     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r2 = "success"
            boolean r1 = r2.equals(r1)     // Catch:{ Throwable -> 0x04d1 }
            if (r1 != 0) goto L_0x04cb
            java.lang.String r1 = "data"
            org.json.JSONObject r9 = r14.optJSONObject(r1)     // Catch:{ Throwable -> 0x04d1 }
            java.lang.Object[] r1 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x04d1 }
            r1[r0] = r14     // Catch:{ Throwable -> 0x04d1 }
            com.meituan.robust.ChangeQuickRedirect r3 = f47087a     // Catch:{ Throwable -> 0x04d1 }
            r4 = 0
            r5 = 43799(0xab17, float:6.1375E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]     // Catch:{ Throwable -> 0x04d1 }
            java.lang.Class<org.json.JSONObject> r2 = org.json.JSONObject.class
            r6[r0] = r2     // Catch:{ Throwable -> 0x04d1 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x04d1 }
            r2 = r21
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x04d1 }
            if (r1 == 0) goto L_0x0491
            java.lang.Object[] r1 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x04d1 }
            r1[r0] = r14     // Catch:{ Throwable -> 0x04d1 }
            com.meituan.robust.ChangeQuickRedirect r3 = f47087a     // Catch:{ Throwable -> 0x04d1 }
            r4 = 0
            r5 = 43799(0xab17, float:6.1375E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]     // Catch:{ Throwable -> 0x04d1 }
            java.lang.Class<org.json.JSONObject> r2 = org.json.JSONObject.class
            r6[r0] = r2     // Catch:{ Throwable -> 0x04d1 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x04d1 }
            r2 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x04d1 }
            goto L_0x04ba
        L_0x0491:
            java.lang.String r0 = "err_code"
            int r0 = r14.optInt(r0, r13)     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r1 = "message"
            java.lang.String r1 = r14.optString(r1)     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r2 = "feedback_error_rate"
            com.ss.android.ugc.aweme.app.d.c r3 = com.ss.android.ugc.aweme.app.d.c.a()     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r4 = "errorCode"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Throwable -> 0x04d1 }
            com.ss.android.ugc.aweme.app.d.c r0 = r3.a((java.lang.String) r4, (java.lang.Integer) r0)     // Catch:{ Throwable -> 0x04d1 }
            java.lang.String r3 = "errorDesc"
            com.ss.android.ugc.aweme.app.d.c r0 = r0.a((java.lang.String) r3, (java.lang.String) r1)     // Catch:{ Throwable -> 0x04d1 }
            org.json.JSONObject r0 = r0.b()     // Catch:{ Throwable -> 0x04d1 }
            com.ss.android.ugc.aweme.app.n.a((java.lang.String) r2, (org.json.JSONObject) r0)     // Catch:{ Throwable -> 0x04d1 }
        L_0x04ba:
            java.lang.String r0 = "session_expired"
            java.lang.String r1 = "name"
            java.lang.String r1 = r9.optString(r1)     // Catch:{ Throwable -> 0x04d1 }
            boolean r0 = r0.equals(r1)     // Catch:{ Throwable -> 0x04d1 }
            if (r0 == 0) goto L_0x04ce
            r0 = 105(0x69, float:1.47E-43)
            goto L_0x04d8
        L_0x04cb:
            r11 = 10
            goto L_0x04d8
        L_0x04ce:
            r0 = 18
            goto L_0x04d8
        L_0x04d1:
            r0 = move-exception
            android.content.Context r1 = r8.i
            int r0 = com.ss.android.newmedia.e.a((android.content.Context) r1, (java.lang.Throwable) r0)
        L_0x04d8:
            boolean r1 = r8.f47092c
            if (r1 != 0) goto L_0x04e9
            android.os.Handler r1 = r8.h
            android.os.Message r1 = r1.obtainMessage(r11)
            r1.arg1 = r0
            android.os.Handler r0 = r8.h
            r0.sendMessage(r1)
        L_0x04e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feedback.FeedbackThread2.run():void");
    }

    private void a(Map<String, String> map) {
        Map map2;
        Map<String, String> map3 = map;
        if (PatchProxy.isSupport(new Object[]{map3}, this, f47087a, false, 43801, new Class[]{Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map3}, this, f47087a, false, 43801, new Class[]{Map.class}, Void.TYPE);
        } else if (b.a.a().b()) {
            b a2 = b.a.a();
            if (PatchProxy.isSupport(new Object[0], a2, b.f47125a, false, 43867, new Class[0], Map.class)) {
                map2 = (Map) PatchProxy.accessDispatch(new Object[0], a2, b.f47125a, false, 43867, new Class[0], Map.class);
            } else {
                map2 = new LinkedHashMap();
                for (com.ss.android.ugc.aweme.feedback.a.a.a.a next : b.f47127c) {
                    String c2 = next.c();
                    if (!TextUtils.isEmpty(c2)) {
                        map2.put(next.a(), c2);
                    }
                }
            }
            for (Map.Entry entry : map2.entrySet()) {
                map3.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    public FeedbackThread2(Handler handler, Context context, o oVar) {
        this.h = handler;
        this.i = context.getApplicationContext();
        this.k = oVar;
    }

    public FeedbackThread2(WeakHandler weakHandler, Context context, n nVar) {
        this.h = weakHandler;
        this.i = context.getApplicationContext();
        this.l = nVar;
        this.m = false;
    }

    private int a(long j2, long j3, boolean z) {
        int a2;
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{new Long(j4), new Long(j5), Byte.valueOf(z ? (byte) 1 : 0)}, this, f47087a, false, 43805, new Class[]{Long.TYPE, Long.TYPE, Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j4), new Long(j5), Byte.valueOf(z)}, this, f47087a, false, 43805, new Class[]{Long.TYPE, Long.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long j6 = j4;
        long j7 = -1;
        while (true) {
            o oVar = new o(j6, j3, 50);
            a2 = a((List<d>) arrayList, (List<d>) arrayList2, oVar);
            if (a2 != 0 || arrayList.size() <= 0) {
                break;
            }
            j6 = ((d) arrayList.get(arrayList.size() - 1)).f47146c;
            if (j7 == j6 || j5 >= j6 || !oVar.f47210f) {
                break;
            }
            j7 = j6;
        }
        if (z && a2 == 0) {
            this.j.a();
        }
        this.j.a((List<d>) arrayList);
        this.j.a((List<d>) arrayList2);
        return a2;
    }

    private int a(List<d> list, List<d> list2, o oVar) {
        boolean z;
        List<d> list3 = list;
        List<d> list4 = list2;
        o oVar2 = oVar;
        if (PatchProxy.isSupport(new Object[]{list3, list4, oVar2}, this, f47087a, false, 43806, new Class[]{List.class, List.class, o.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{list3, list4, oVar2}, this, f47087a, false, 43806, new Class[]{List.class, List.class, o.class}, Integer.TYPE)).intValue();
        }
        try {
            StringBuffer stringBuffer = new StringBuffer(f47089e);
            stringBuffer.append("?appkey=aweme-android");
            if (oVar2.f47207c > 0) {
                stringBuffer.append("&count=" + oVar2.f47207c);
            }
            long j2 = 0;
            if (oVar2.f47206b > 0) {
                stringBuffer.append("&min_id=" + oVar2.f47206b);
            }
            if (oVar2.f47205a > 0) {
                stringBuffer.append("&max_id=" + oVar2.f47205a);
            }
            String str = (String) ((CommonApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(a.i).create(CommonApi.class)).doGet(stringBuffer.toString(), 307200).execute().body();
            com.ss.android.ugc.aweme.app.api.a.b(str, stringBuffer.toString());
            if (StringUtils.isEmpty(str)) {
                return 18;
            }
            JSONObject jSONObject = new JSONObject(str);
            if ("success".equals(jSONObject.optString("message"))) {
                JSONArray optJSONArray = jSONObject.optJSONArray("data");
                int length = optJSONArray.length();
                if (jSONObject.isNull("has_more")) {
                    if (length >= oVar2.f47207c) {
                        z = true;
                    } else {
                        z = false;
                    }
                    oVar2.f47210f = z;
                } else {
                    oVar2.f47210f = jSONObject.optBoolean("has_more", false);
                }
                int i2 = 0;
                while (i2 < length) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    long optLong = optJSONObject.optLong("id", -1);
                    if (optLong > j2) {
                        d dVar = new d(optLong);
                        dVar.a(optJSONObject);
                        list3.add(dVar);
                        if (dVar.n != null && dVar.n.size() > 0) {
                            for (d.a next : dVar.n) {
                                long j3 = dVar.f47145b;
                                d dVar2 = new d(j3, dVar.f47146c, dVar.f47147d);
                                dVar2.f47148e = dVar.f47148e;
                                dVar2.h = dVar.h;
                                dVar2.k = dVar.k;
                                dVar2.g = next.f47152c;
                                dVar2.i = next.f47150a;
                                dVar2.j = next.f47151b;
                                dVar2.o = true;
                                list3.add(dVar2);
                            }
                        }
                    }
                    i2++;
                    j2 = 0;
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("default_item");
                if (optJSONObject2 != null) {
                    d dVar3 = new d(optJSONObject2.optLong("id", 0));
                    dVar3.a(optJSONObject2);
                    dVar3.k = 2;
                    list4.add(dVar3);
                }
                return 0;
            } else if ("session_expired".equals(jSONObject.optJSONObject("data").optString("name"))) {
                return 105;
            } else {
                return 18;
            }
        } catch (Throwable th) {
            return e.a(this.i, th);
        }
    }
}
