package com.ss.android.ugc.aweme.longvideo.b;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.facebook.d.a.b;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.aweme.video.e.c;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.aweme.video.preload.d;
import com.toutiao.proxyserver.Proxy;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/utils/VideoPlayMonitorUtils;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53899a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f53900b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0007J\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0007J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0003JF\u0010\u0019\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/utils/VideoPlayMonitorUtils$Companion;", "", "()V", "onPlayFailedMonitor", "", "error", "Lcom/ss/android/ugc/aweme/video/MediaError;", "video", "Lcom/ss/android/ugc/aweme/feed/model/Video;", "rateServiceName", "", "rateStatus", "", "logType", "logServiceName", "recodeVideoPlay", "recordFirstFrameTime", "duration", "", "serviceName", "recordPreloadTimeInfo", "model", "Lcom/ss/android/ugc/aweme/feed/model/VideoUrlModel;", "jsonObject", "Lorg/json/JSONObject;", "reportBlock", "groupId", "blockDurationThisTime", "endType", "requestId", "playerManager", "Lcom/ss/android/ugc/aweme/video/PlayerManager;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53901a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.longvideo.b.g$a$a  reason: collision with other inner class name */
        static final class C0624a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53902a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e f53903b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Video f53904c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f53905d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ int f53906e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ String f53907f;
            final /* synthetic */ String g;

            C0624a(e eVar, Video video, String str, int i, String str2, String str3) {
                this.f53903b = eVar;
                this.f53904c = video;
                this.f53905d = str;
                this.f53906e = i;
                this.f53907f = str2;
                this.g = str3;
            }

            /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
            /* JADX WARNING: Removed duplicated region for block: B:56:? A[ExcHandler: JSONException (unused org.json.JSONException), SYNTHETIC, Splitter:B:37:0x014a] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r9 = this;
                    r0 = 0
                    java.lang.Object[] r1 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r3 = f53902a
                    java.lang.Class[] r6 = new java.lang.Class[r0]
                    java.lang.Class r7 = java.lang.Void.TYPE
                    r4 = 0
                    r5 = 56781(0xddcd, float:7.9567E-41)
                    r2 = r9
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                    if (r1 == 0) goto L_0x0025
                    java.lang.Object[] r2 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r4 = f53902a
                    r5 = 0
                    r6 = 56781(0xddcd, float:7.9567E-41)
                    java.lang.Class[] r7 = new java.lang.Class[r0]
                    java.lang.Class r8 = java.lang.Void.TYPE
                    r3 = r9
                    com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                    return
                L_0x0025:
                    org.json.JSONObject r1 = new org.json.JSONObject
                    r1.<init>()
                    java.lang.String r2 = "sourceId"
                    com.ss.android.ugc.aweme.video.e r3 = r9.f53903b     // Catch:{  }
                    java.lang.String r3 = r3.f76049b     // Catch:{  }
                    r1.put(r2, r3)     // Catch:{  }
                    java.lang.String r2 = "errorCode"
                    com.ss.android.ugc.aweme.video.e r3 = r9.f53903b     // Catch:{  }
                    int r3 = r3.f76051d     // Catch:{  }
                    r1.put(r2, r3)     // Catch:{  }
                    java.lang.String r2 = "errorExtra"
                    com.ss.android.ugc.aweme.video.e r3 = r9.f53903b     // Catch:{  }
                    int r3 = r3.f76052e     // Catch:{  }
                    r1.put(r2, r3)     // Catch:{  }
                    java.lang.String r2 = "netWorkQuality"
                    com.facebook.d.a.b r3 = com.facebook.d.a.b.a()     // Catch:{  }
                    java.lang.String r4 = "ConnectionClassManager.getInstance()"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)     // Catch:{  }
                    com.facebook.d.a.c r3 = r3.b()     // Catch:{  }
                    java.lang.String r3 = r3.toString()     // Catch:{  }
                    r1.put(r2, r3)     // Catch:{  }
                    java.lang.String r2 = "netWorkSpeed"
                    com.facebook.d.a.b r3 = com.facebook.d.a.b.a()     // Catch:{  }
                    java.lang.String r4 = "ConnectionClassManager.getInstance()"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)     // Catch:{  }
                    double r3 = r3.c()     // Catch:{  }
                    int r3 = (int) r3     // Catch:{  }
                    r1.put(r2, r3)     // Catch:{  }
                    java.lang.String r2 = "playUrl"
                    com.ss.android.ugc.aweme.feed.model.Video r3 = r9.f53904c     // Catch:{  }
                    com.ss.android.ugc.aweme.feed.model.VideoUrlModel r3 = r3.getProperPlayAddr()     // Catch:{  }
                    java.lang.String r3 = com.alibaba.fastjson.JSON.toJSONString(r3)     // Catch:{  }
                    r1.put(r2, r3)     // Catch:{  }
                    java.lang.String r2 = "playUrlIsLowBr"
                    com.ss.android.ugc.aweme.feed.model.Video r3 = r9.f53904c     // Catch:{  }
                    boolean r3 = r3.isLowBr()     // Catch:{  }
                    r1.put(r2, r3)     // Catch:{  }
                    com.ss.android.ugc.aweme.video.e.c.a((org.json.JSONObject) r1)     // Catch:{  }
                    com.ss.android.ugc.aweme.video.e r2 = r9.f53903b     // Catch:{  }
                    java.lang.Object r2 = r2.f76053f     // Catch:{  }
                    if (r2 == 0) goto L_0x009e
                    java.lang.String r2 = "extraInfo"
                    com.ss.android.ugc.aweme.video.e r3 = r9.f53903b     // Catch:{  }
                    java.lang.Object r3 = r3.f76053f     // Catch:{  }
                    java.lang.String r3 = r3.toString()     // Catch:{  }
                    r1.put(r2, r3)     // Catch:{  }
                L_0x009e:
                    java.io.File r2 = com.ss.android.ugc.aweme.video.b.c()     // Catch:{  }
                    java.lang.String r3 = "cache"
                    java.io.File r2 = com.ss.android.ugc.aweme.video.b.a((java.io.File) r2, (java.lang.String) r3)     // Catch:{  }
                    java.lang.String r3 = ""
                    com.ss.android.ugc.aweme.feed.model.Video r4 = r9.f53904c     // Catch:{  }
                    com.ss.android.ugc.aweme.feed.model.VideoUrlModel r4 = r4.getProperPlayAddr()     // Catch:{  }
                    if (r4 == 0) goto L_0x00bb
                    java.lang.String r3 = r4.getBitRatedRatioUri()     // Catch:{  }
                    java.lang.String r4 = "urlModel.bitRatedRatioUri"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)     // Catch:{  }
                L_0x00bb:
                    r4 = r3
                    java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{  }
                    boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{  }
                    if (r4 == 0) goto L_0x00c7
                    java.lang.String r3 = ""
                    goto L_0x00cb
                L_0x00c7:
                    java.lang.String r3 = com.toutiao.proxyserver.f.a.a(r3)     // Catch:{  }
                L_0x00cb:
                    java.lang.String r4 = "file"
                    if (r2 != 0) goto L_0x00d2
                    java.lang.String r2 = ""
                    goto L_0x00fa
                L_0x00d2:
                    com.ss.android.ugc.aweme.shortvideo.helper.c r5 = new com.ss.android.ugc.aweme.shortvideo.helper.c     // Catch:{  }
                    java.lang.String r6 = "file"
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{  }
                    r7.<init>()     // Catch:{  }
                    java.lang.String r2 = r2.getPath()     // Catch:{  }
                    r7.append(r2)     // Catch:{  }
                    java.lang.String r2 = "/"
                    r7.append(r2)     // Catch:{  }
                    r7.append(r3)     // Catch:{  }
                    java.lang.String r2 = r7.toString()     // Catch:{  }
                    r5.<init>(r6, r2)     // Catch:{  }
                    java.lang.String r2 = r5.toString()     // Catch:{  }
                    java.lang.String r3 = "FileInfo(\"file\",\n       …  + \"/\" + md5).toString()"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)     // Catch:{  }
                L_0x00fa:
                    r1.put(r4, r2)     // Catch:{  }
                    java.lang.String r2 = "play_sdcard_writable"
                    boolean r3 = com.ss.android.ugc.aweme.video.b.h()     // Catch:{  }
                    r1.put(r2, r3)     // Catch:{  }
                    java.lang.String r2 = "play_network_available"
                    com.ss.android.ugc.aweme.base.utils.m r3 = com.ss.android.ugc.aweme.base.utils.m.a()     // Catch:{  }
                    java.lang.String r4 = "NetworkStateManager.getInstance()"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)     // Catch:{  }
                    boolean r3 = r3.c()     // Catch:{  }
                    r1.put(r2, r3)     // Catch:{  }
                    java.lang.String r2 = "play_free_space"
                    long r3 = com.ss.android.ugc.aweme.utils.bm.a()     // Catch:{ Exception -> 0x012a }
                    r1.put(r2, r3)     // Catch:{ Exception -> 0x012a }
                    java.lang.String r2 = "play_all_space"
                    long r3 = com.ss.android.ugc.aweme.utils.bm.b()     // Catch:{ Exception -> 0x012a }
                    r1.put(r2, r3)     // Catch:{ Exception -> 0x012a }
                L_0x012a:
                    java.lang.String r2 = "play_diskcache"
                    com.toutiao.proxyserver.g r3 = com.toutiao.proxyserver.Proxy.f()     // Catch:{  }
                    r4 = 1
                    if (r3 != 0) goto L_0x0135
                    r3 = 0
                    goto L_0x0136
                L_0x0135:
                    r3 = 1
                L_0x0136:
                    r1.put(r2, r3)     // Catch:{  }
                    java.lang.String r2 = "play_diskLruCache"
                    com.toutiao.proxyserver.h r3 = com.toutiao.proxyserver.Proxy.e()     // Catch:{  }
                    if (r3 != 0) goto L_0x0142
                    goto L_0x0143
                L_0x0142:
                    r0 = 1
                L_0x0143:
                    r1.put(r2, r0)     // Catch:{  }
                    java.lang.Class<com.toutiao.proxyserver.q> r0 = com.toutiao.proxyserver.q.class
                    java.lang.String r2 = "f"
                    java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ JSONException -> 0x0197, JSONException -> 0x0197 }
                    if (r0 == 0) goto L_0x0198
                    r0.setAccessible(r4)     // Catch:{ JSONException -> 0x0197, JSONException -> 0x0197 }
                    r2 = 0
                    java.lang.Object r0 = r0.get(r2)     // Catch:{ JSONException -> 0x0197, JSONException -> 0x0197 }
                    if (r0 == 0) goto L_0x018f
                    com.toutiao.proxyserver.q r0 = (com.toutiao.proxyserver.q) r0     // Catch:{ JSONException -> 0x0197, JSONException -> 0x0197 }
                    if (r0 == 0) goto L_0x0198
                    java.lang.Class<com.toutiao.proxyserver.q> r3 = com.toutiao.proxyserver.q.class
                    java.lang.String r5 = "d"
                    java.lang.reflect.Field r3 = r3.getDeclaredField(r5)     // Catch:{ JSONException -> 0x0197, JSONException -> 0x0197 }
                    if (r3 == 0) goto L_0x0198
                    r3.setAccessible(r4)     // Catch:{ JSONException -> 0x0197, JSONException -> 0x0197 }
                    java.lang.Object r0 = r3.get(r0)     // Catch:{ JSONException -> 0x0197, JSONException -> 0x0197 }
                    if (r0 == 0) goto L_0x0187
                    java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0     // Catch:{ JSONException -> 0x0197, JSONException -> 0x0197 }
                    java.lang.String r3 = "proxyserver_state"
                    if (r0 == 0) goto L_0x017f
                    int r0 = r0.intValue()     // Catch:{ JSONException -> 0x0197, JSONException -> 0x0197 }
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x0197, JSONException -> 0x0197 }
                L_0x017f:
                    int r0 = r2.intValue()     // Catch:{ JSONException -> 0x0197, JSONException -> 0x0197 }
                    r1.put(r3, r0)     // Catch:{ JSONException -> 0x0197, JSONException -> 0x0197 }
                    goto L_0x0198
                L_0x0187:
                    kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ JSONException -> 0x0197, JSONException -> 0x0197 }
                    java.lang.String r2 = "null cannot be cast to non-null type java.util.concurrent.atomic.AtomicInteger"
                    r0.<init>(r2)     // Catch:{ JSONException -> 0x0197, JSONException -> 0x0197 }
                    throw r0     // Catch:{ JSONException -> 0x0197, JSONException -> 0x0197 }
                L_0x018f:
                    kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ JSONException -> 0x0197, JSONException -> 0x0197 }
                    java.lang.String r2 = "null cannot be cast to non-null type com.toutiao.proxyserver.ProxyServer"
                    r0.<init>(r2)     // Catch:{ JSONException -> 0x0197, JSONException -> 0x0197 }
                    throw r0     // Catch:{ JSONException -> 0x0197, JSONException -> 0x0197 }
                L_0x0197:
                L_0x0198:
                    com.ss.android.ugc.aweme.base.utils.m r0 = com.ss.android.ugc.aweme.base.utils.m.a()
                    java.lang.String r2 = "NetworkStateManager.getInstance()"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
                    boolean r0 = r0.c()
                    if (r0 == 0) goto L_0x01b6
                    java.lang.String r0 = r9.f53905d
                    int r2 = r9.f53906e
                    com.ss.android.ugc.aweme.app.d.c r3 = com.ss.android.ugc.aweme.app.d.c.a(r1)
                    org.json.JSONObject r3 = r3.b()
                    com.ss.android.ugc.aweme.app.n.a((java.lang.String) r0, (int) r2, (org.json.JSONObject) r3)
                L_0x01b6:
                    java.lang.String r0 = r9.f53907f
                    java.lang.String r2 = r9.g
                    com.ss.android.ugc.aweme.app.d.c r1 = com.ss.android.ugc.aweme.app.d.c.a(r1)
                    org.json.JSONObject r1 = r1.b()
                    com.ss.android.ugc.aweme.app.n.a(r0, r2, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.longvideo.b.g.a.C0624a.run():void");
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        public final void a(long j, @NotNull String str) {
            long j2 = j;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{new Long(j2), str2}, this, f53901a, false, 56780, new Class[]{Long.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{new Long(j2), str2}, this, f53901a, false, 56780, new Class[]{Long.TYPE, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str2, "serviceName");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j2);
            n.a(str2, jSONObject);
        }

        @JvmStatic
        public final void a(@Nullable Video video, @NotNull String str) {
            String str2;
            String str3;
            String str4 = str;
            if (PatchProxy.isSupport(new Object[]{video, str4}, this, f53901a, false, 56777, new Class[]{Video.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{video, str4}, this, f53901a, false, 56777, new Class[]{Video.class, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str4, "rateServiceName");
            if (video != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    b a2 = b.a();
                    Intrinsics.checkExpressionValueIsNotNull(a2, "ConnectionClassManager.getInstance()");
                    jSONObject.put("netWorkQuality", a2.b().toString());
                    b a3 = b.a();
                    Intrinsics.checkExpressionValueIsNotNull(a3, "ConnectionClassManager.getInstance()");
                    jSONObject.put("netWorkSpeed", (int) a3.c());
                    jSONObject.put("playUrl", JSON.toJSONString(video.getProperPlayAddr()));
                    c.a(jSONObject);
                    File a4 = com.ss.android.ugc.aweme.video.b.a(com.ss.android.ugc.aweme.video.b.c(), "cache");
                    if (a4 == null) {
                        str2 = "";
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(a4.getPath());
                        sb.append("/");
                        if (com.ss.android.g.a.a()) {
                            str3 = video.getPlayAddr().getBitRatedRatioUri();
                        } else {
                            str3 = video.getProperPlayAddr().getUri();
                        }
                        sb.append(com.toutiao.proxyserver.f.a.a(str3));
                        str2 = new com.ss.android.ugc.aweme.shortvideo.helper.c("file", sb.toString()).toString();
                        Intrinsics.checkExpressionValueIsNotNull(str2, "FileInfo(\"file\",\n       …r().getUri())).toString()");
                    }
                    jSONObject.put("file", str2);
                } catch (Exception unused) {
                }
                n.a(str4, 0, jSONObject);
            }
        }

        @JvmStatic
        public final void a(@Nullable e eVar, @Nullable Video video, @NotNull String str, int i, @NotNull String str2, @NotNull String str3) {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            if (PatchProxy.isSupport(new Object[]{eVar, video, str4, Integer.valueOf(i), str5, str6}, this, f53901a, false, 56776, new Class[]{e.class, Video.class, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
                Object[] objArr = {eVar, video, str4, Integer.valueOf(i), str5, str6};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f53901a, false, 56776, new Class[]{e.class, Video.class, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str4, "rateServiceName");
            Intrinsics.checkParameterIsNotNull(str5, "logType");
            Intrinsics.checkParameterIsNotNull(str6, "logServiceName");
            if (eVar != null && video != null && video.getPlayAddr() != null) {
                C0624a aVar = new C0624a(eVar, video, str, i, str2, str3);
                com.ss.android.b.a.a.a.a(aVar);
            }
        }

        @JvmStatic
        public final void a(@Nullable Video video, @NotNull String str, long j, @NotNull String str2, @Nullable String str3, @NotNull String str4, @Nullable o oVar) {
            int i;
            String str5 = str;
            long j2 = j;
            String str6 = str2;
            String str7 = str3;
            String str8 = str4;
            if (PatchProxy.isSupport(new Object[]{video, str5, new Long(j2), str6, str7, str8, oVar}, this, f53901a, false, 56778, new Class[]{Video.class, String.class, Long.TYPE, String.class, String.class, String.class, o.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{video, str5, new Long(j2), str6, str7, str8, oVar}, this, f53901a, false, 56778, new Class[]{Video.class, String.class, Long.TYPE, String.class, String.class, String.class, o.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str5, "groupId");
            Intrinsics.checkParameterIsNotNull(str6, "endType");
            Intrinsics.checkParameterIsNotNull(str8, "logType");
            if (video != null) {
                VideoUrlModel playAddr = video.getPlayAddr();
                if (playAddr != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("request_id", str7);
                        jSONObject.put("duration", j2);
                        jSONObject.put("end_type", str6);
                        if (oVar == null) {
                            o b2 = o.b();
                            Intrinsics.checkExpressionValueIsNotNull(b2, "PlayerManager.inst()");
                            jSONObject.put("player_type", b2.m().toString());
                        } else {
                            jSONObject.put("player_type", oVar.m().toString());
                        }
                        VideoBitRateABManager a2 = VideoBitRateABManager.a();
                        Intrinsics.checkExpressionValueIsNotNull(a2, "VideoBitRateABManager.getInstance()");
                        if (a2.c()) {
                            Integer a3 = com.ss.android.ugc.aweme.feed.k.b.a(playAddr);
                            int b3 = com.ss.android.ugc.aweme.feed.k.b.b(playAddr);
                            if (a3 == null) {
                                List<BitRate> bitRate = video.getBitRate();
                                if (bitRate != null) {
                                    Iterator<BitRate> it2 = bitRate.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        BitRate next = it2.next();
                                        if (!(next == null || next.getPlayAddr() == null)) {
                                            UrlModel playAddr2 = next.getPlayAddr();
                                            Intrinsics.checkExpressionValueIsNotNull(playAddr2, "temp.playAddr");
                                            if (!TextUtils.isEmpty(playAddr2.getUri()) && playAddr.getUri() != null) {
                                                String uri = playAddr.getUri();
                                                Intrinsics.checkExpressionValueIsNotNull(uri, "model.uri");
                                                UrlModel playAddr3 = next.getPlayAddr();
                                                Intrinsics.checkExpressionValueIsNotNull(playAddr3, "temp.playAddr");
                                                String uri2 = playAddr3.getUri();
                                                Intrinsics.checkExpressionValueIsNotNull(uri2, "temp.playAddr.uri");
                                                if (StringsKt.startsWith$default(uri, uri2, false, 2, null)) {
                                                    a3 = Integer.valueOf(next.getBitRate());
                                                    b3 = next.getQualityType();
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (a3 != null) {
                                i = a3.intValue();
                            } else {
                                i = -1;
                            }
                            jSONObject.put("video_bitrate", i);
                            jSONObject.put("video_quality", b3);
                            List<BitRate> bitRate2 = playAddr.getBitRate();
                            if (bitRate2 != null && !bitRate2.isEmpty()) {
                                jSONObject.put("bitrate_set", new JSONArray(new GsonBuilder().setExclusionStrategies(new BitRate.ExcludeStrategy()).create().toJson((Object) bitRate2)));
                            }
                        }
                        jSONObject.put("strategy_status", "-1");
                        jSONObject.put("internet_speed", com.ss.android.ugc.c.b.e());
                        jSONObject.put("group_id", str5);
                    } catch (Exception e2) {
                        com.ss.android.ugc.aweme.framework.a.a.a(e2);
                        jSONObject = new JSONObject();
                    }
                    a aVar = this;
                    if (PatchProxy.isSupport(new Object[]{playAddr, jSONObject}, aVar, f53901a, false, 56779, new Class[]{VideoUrlModel.class, JSONObject.class}, Void.TYPE)) {
                        a aVar2 = aVar;
                        PatchProxy.accessDispatch(new Object[]{playAddr, jSONObject}, aVar2, f53901a, false, 56779, new Class[]{VideoUrlModel.class, JSONObject.class}, Void.TYPE);
                    } else {
                        d j3 = com.ss.android.ugc.aweme.video.preload.g.f().j(playAddr);
                        if (j3 != null) {
                            try {
                                jSONObject.put("video_cache_read_time", (double) ((((float) j3.f76205a) * 1.0f) / ((float) j3.f76207c)));
                                jSONObject.put("video_cache_read_size", (double) ((((float) j3.f76206b) * 1.0f) / ((float) j3.f76207c)));
                                jSONObject.put("video_cache_read_cnt", j3.f76207c);
                                jSONObject.put("video_cache_use_ttnet", Proxy.k);
                            } catch (Exception unused) {
                            }
                        }
                    }
                    n.a(str8, jSONObject);
                }
            }
        }
    }
}
