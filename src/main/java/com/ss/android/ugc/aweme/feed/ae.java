package com.ss.android.ugc.aweme.feed;

import a.i;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.feed.h.g;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.u.b.a;
import com.ss.android.ugc.aweme.utils.da;
import com.ss.android.ugc.aweme.utils.db;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class ae {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44985a;

    /* renamed from: b  reason: collision with root package name */
    public static JSONObject f44986b;

    /* renamed from: c  reason: collision with root package name */
    private long f44987c;

    /* renamed from: d  reason: collision with root package name */
    private Fragment f44988d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f44989e = db.a().a(da.FEED_REQ);

    public final void a(int i, String str, String str2, g gVar) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, str2, gVar}, this, f44985a, false, 40147, new Class[]{Integer.TYPE, String.class, String.class, g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, str2, gVar}, this, f44985a, false, 40147, new Class[]{Integer.TYPE, String.class, String.class, g.class}, Void.TYPE);
        }
    }

    public ae(Fragment fragment) {
        this.f44988d = fragment;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(String str) throws Exception {
        long j = aq.f3149b;
        long j2 = 0;
        aq.f3149b = 0;
        t a2 = new t().a("is_first", String.valueOf(this.f44989e ? 1 : 0)).a("feed_tab", z.e()).a("request_method", str);
        if (j > 0) {
            j2 = SystemClock.elapsedRealtime() - j;
        }
        JSONObject a3 = a2.a("duration", Long.toString(j2)).a();
        r.onEvent(MobClick.obtain().setEventName("feed_request").setLabelName("perf_monitor").setJsonObject(a3));
        r.a("feed_request", a3);
        a.a("feed_request", a3);
        return null;
    }

    public final void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f44985a, false, 40148, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f44985a, false, 40148, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        this.f44987c = SystemClock.elapsedRealtime();
        i.a((Callable<TResult>) new af<TResult>(this, str), (Executor) h.e());
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x018f A[Catch:{ JSONException -> 0x0197 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0192 A[Catch:{ JSONException -> 0x0197 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r20, java.lang.String r21, java.lang.String r22, com.ss.android.ugc.aweme.feed.h.g r23, java.lang.Exception r24) {
        /*
            r19 = this;
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r23
            r12 = r24
            r13 = 5
            java.lang.Object[] r1 = new java.lang.Object[r13]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r14 = 0
            r1[r14] = r2
            r15 = 1
            r1[r15] = r10
            r16 = 2
            r1[r16] = r22
            r17 = 3
            r1[r17] = r11
            r18 = 4
            r1[r18] = r12
            com.meituan.robust.ChangeQuickRedirect r3 = f44985a
            java.lang.Class[] r6 = new java.lang.Class[r13]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r14] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r15] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r16] = r2
            java.lang.Class<com.ss.android.ugc.aweme.feed.h.g> r2 = com.ss.android.ugc.aweme.feed.h.g.class
            r6[r17] = r2
            java.lang.Class<java.lang.Exception> r2 = java.lang.Exception.class
            r6[r18] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 40146(0x9cd2, float:5.6257E-41)
            r2 = r19
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x007d
            java.lang.Object[] r1 = new java.lang.Object[r13]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r1[r14] = r2
            r1[r15] = r10
            r1[r16] = r22
            r1[r17] = r11
            r1[r18] = r12
            com.meituan.robust.ChangeQuickRedirect r3 = f44985a
            r4 = 0
            r5 = 40146(0x9cd2, float:5.6257E-41)
            java.lang.Class[] r6 = new java.lang.Class[r13]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r14] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r15] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r16] = r0
            java.lang.Class<com.ss.android.ugc.aweme.feed.h.g> r0 = com.ss.android.ugc.aweme.feed.h.g.class
            r6[r17] = r0
            java.lang.Class<java.lang.Exception> r0 = java.lang.Exception.class
            r6[r18] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x007d:
            r1 = -1
            if (r9 != r15) goto L_0x00da
            if (r11 == 0) goto L_0x00da
            java.util.List r0 = r23.getItems()
            boolean r0 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00da
            java.util.List r0 = r23.getItems()     // Catch:{ Exception -> 0x00d3 }
            java.lang.Object r0 = r0.get(r14)     // Catch:{ Exception -> 0x00d3 }
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0     // Catch:{ Exception -> 0x00d3 }
            if (r0 == 0) goto L_0x00da
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()     // Catch:{ Exception -> 0x00d3 }
            if (r0 == 0) goto L_0x00da
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r2 = r0.getPlayAddr()     // Catch:{ Exception -> 0x00d3 }
            if (r2 == 0) goto L_0x00da
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r2 = r0.getPlayAddr()     // Catch:{ Exception -> 0x00d3 }
            java.util.List r2 = r2.getUrlList()     // Catch:{ Exception -> 0x00d3 }
            int r2 = r2.size()     // Catch:{ Exception -> 0x00d3 }
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r0.getCover()     // Catch:{ Exception -> 0x00d1 }
            if (r3 == 0) goto L_0x00d8
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r0.getCover()     // Catch:{ Exception -> 0x00d1 }
            java.util.List r3 = r3.getUrlList()     // Catch:{ Exception -> 0x00d1 }
            boolean r3 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r3)     // Catch:{ Exception -> 0x00d1 }
            if (r3 != 0) goto L_0x00d8
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getCover()     // Catch:{ Exception -> 0x00d1 }
            java.util.List r0 = r0.getUrlList()     // Catch:{ Exception -> 0x00d1 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x00d1 }
            goto L_0x00dc
        L_0x00d1:
            r0 = move-exception
            goto L_0x00d5
        L_0x00d3:
            r0 = move-exception
            r2 = -1
        L_0x00d5:
            com.ss.android.ugc.aweme.framework.a.a.a((java.lang.Exception) r0)
        L_0x00d8:
            r0 = -1
            goto L_0x00dc
        L_0x00da:
            r0 = -1
            r2 = -1
        L_0x00dc:
            if (r11 == 0) goto L_0x00e7
            com.ss.android.ugc.aweme.feed.model.FeedItemList r3 = r11.f45486c
            if (r3 == 0) goto L_0x00e7
            com.ss.android.ugc.aweme.feed.model.FeedItemList r3 = r11.f45486c
            int r3 = r3.blockCode
            goto L_0x00e8
        L_0x00e7:
            r3 = 0
        L_0x00e8:
            boolean r4 = com.ss.android.ugc.aweme.feed.cache.a.d()
            com.ss.android.ugc.aweme.common.t r5 = new com.ss.android.ugc.aweme.common.t
            r5.<init>()
            java.lang.String r6 = "is_success"
            java.lang.String r7 = java.lang.String.valueOf(r20)
            com.ss.android.ugc.aweme.common.t r5 = r5.a(r6, r7)
            java.lang.String r6 = "duration"
            long r16 = android.os.SystemClock.elapsedRealtime()
            long r14 = r8.f44987c
            long r16 = r16 - r14
            java.lang.String r7 = java.lang.String.valueOf(r16)
            com.ss.android.ugc.aweme.common.t r5 = r5.a(r6, r7)
            java.lang.String r6 = "is_first"
            if (r4 == 0) goto L_0x0112
            goto L_0x0119
        L_0x0112:
            boolean r1 = r8.f44989e
            if (r1 == 0) goto L_0x0118
            r1 = 1
            goto L_0x0119
        L_0x0118:
            r1 = 0
        L_0x0119:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            com.ss.android.ugc.aweme.common.t r1 = r5.a(r6, r1)
            java.lang.String r5 = "request_method"
            com.ss.android.ugc.aweme.common.t r1 = r1.a(r5, r10)
            java.lang.String r5 = "feed_tab"
            java.lang.String r6 = com.ss.android.ugc.aweme.feed.z.e()
            com.ss.android.ugc.aweme.common.t r1 = r1.a(r5, r6)
            java.lang.String r5 = "video_num"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            com.ss.android.ugc.aweme.common.t r1 = r1.a(r5, r2)
            java.lang.String r2 = "image_num"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.aweme.common.t r0 = r1.a(r2, r0)
            java.lang.String r1 = "blockCode"
            java.lang.String r2 = java.lang.String.valueOf(r3)
            com.ss.android.ugc.aweme.common.t r0 = r0.a(r1, r2)
            java.lang.String r1 = "err_code"
            r2 = 1
            if (r9 != r2) goto L_0x0157
            java.lang.String r2 = "-1"
            goto L_0x0163
        L_0x0157:
            android.content.Context r2 = com.ss.android.common.applog.GlobalContext.getContext()
            int r2 = com.ss.android.ugc.aweme.net.a.i.a((android.content.Context) r2, (java.lang.Throwable) r12)
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L_0x0163:
            com.ss.android.ugc.aweme.common.t r0 = r0.a(r1, r2)
            java.lang.String r1 = "is_from_feed_cache"
            java.lang.String r2 = java.lang.String.valueOf(r4)
            com.ss.android.ugc.aweme.common.t r0 = r0.a(r1, r2)
            org.json.JSONObject r0 = r0.a()
            com.ss.android.ugc.aweme.common.MobClick r1 = com.ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r2 = "feed_request_response"
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setEventName(r2)
            java.lang.String r2 = "perf_monitor"
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setLabelName(r2)
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setJsonObject(r0)
            java.lang.String r2 = "network_status"
            org.json.JSONObject r3 = f44986b     // Catch:{ JSONException -> 0x0197 }
            if (r3 == 0) goto L_0x0192
            org.json.JSONObject r3 = f44986b     // Catch:{ JSONException -> 0x0197 }
            goto L_0x0194
        L_0x0192:
            java.lang.String r3 = ""
        L_0x0194:
            r0.put(r2, r3)     // Catch:{ JSONException -> 0x0197 }
        L_0x0197:
            com.ss.android.ugc.aweme.common.r.onEvent(r1)
            java.lang.String r1 = "feed_request_response"
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r1, (org.json.JSONObject) r0)
            com.ss.android.ugc.aweme.feed.z.b()
            java.lang.String r1 = "feed_request_response"
            com.ss.android.ugc.aweme.u.b.a.a(r1, r0)
            if (r4 != 0) goto L_0x01ac
            r1 = 0
            r8.f44989e = r1
        L_0x01ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ae.a(int, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.feed.h.g, java.lang.Exception):void");
    }
}
