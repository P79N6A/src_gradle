package com.ss.android.ugc.aweme.player.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.video.preload.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0004\u0014\u0015\u0016\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000f\u001a\u00020\n2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0011H\u0002J\u0006\u0010\u0012\u001a\u00020\u0013R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/player/etdata/VideoPlayEndEvent;", "", "()V", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "isH265", "", "networkLibType", "", "pageType", "", "Ljava/lang/Integer;", "requests", "", "Lcom/ss/android/ugc/aweme/video/preload/RequestInfo;", "getHitCodeFromHeader", "headers", "", "post", "", "Builder", "CDNRequestRecord", "Companion", "VideoStopPlayInfo", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59061a = null;
    @NotNull
    public static final String g = g;
    @NotNull
    public static final String h = h;
    public static final C0661c i = new C0661c((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public Aweme f59062b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f59063c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f59064d;

    /* renamed from: e  reason: collision with root package name */
    public String f59065e;

    /* renamed from: f  reason: collision with root package name */
    public List<e> f59066f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/player/etdata/VideoPlayEndEvent$Builder;", "", "()V", "mEndEvent", "Lcom/ss/android/ugc/aweme/player/etdata/VideoPlayEndEvent;", "build", "setAweme", "iaweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "setIsH265", "isH265", "", "setNetworkLibType", "networkLibType", "", "setPageType", "pageType", "", "setRequests", "requests", "", "Lcom/ss/android/ugc/aweme/video/preload/RequestInfo;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f59067a;

        /* renamed from: b  reason: collision with root package name */
        public c f59068b = new c();

        @NotNull
        public final a a(boolean z) {
            this.f59068b.f59064d = z;
            return this;
        }

        @NotNull
        public final a a(@NotNull Aweme aweme) {
            if (PatchProxy.isSupport(new Object[]{aweme}, this, f59067a, false, 64205, new Class[]{Aweme.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{aweme}, this, f59067a, false, 64205, new Class[]{Aweme.class}, a.class);
            }
            Intrinsics.checkParameterIsNotNull(aweme, "iaweme");
            this.f59068b.f59062b = aweme;
            return this;
        }

        @NotNull
        public final a a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f59067a, false, 64206, new Class[]{Integer.TYPE}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f59067a, false, 64206, new Class[]{Integer.TYPE}, a.class);
            }
            this.f59068b.f59063c = Integer.valueOf(i);
            return this;
        }

        @NotNull
        public final a a(@NotNull String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f59067a, false, 64207, new Class[]{String.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str}, this, f59067a, false, 64207, new Class[]{String.class}, a.class);
            }
            Intrinsics.checkParameterIsNotNull(str, "networkLibType");
            this.f59068b.f59065e = str;
            return this;
        }

        @NotNull
        public final a a(@NotNull List<e> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, f59067a, false, 64204, new Class[]{List.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{list}, this, f59067a, false, 64204, new Class[]{List.class}, a.class);
            }
            Intrinsics.checkParameterIsNotNull(list, "requests");
            this.f59068b.f59066f = list;
            return this;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001b\u001a\u00020\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/player/etdata/VideoPlayEndEvent$CDNRequestRecord;", "", "()V", "cdnIP", "", "getCdnIP", "()Ljava/lang/String;", "setCdnIP", "(Ljava/lang/String;)V", "cdnName", "getCdnName", "setCdnName", "duration", "", "getDuration", "()J", "setDuration", "(J)V", "hitCode", "", "getHitCode", "()I", "setHitCode", "(I)V", "size", "getSize", "setSize", "getJSONObject", "Lorg/json/JSONObject;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f59069a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public String f59070b;
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        public String f59071c;

        /* renamed from: d  reason: collision with root package name */
        public int f59072d;

        /* renamed from: e  reason: collision with root package name */
        public long f59073e;

        /* renamed from: f  reason: collision with root package name */
        public long f59074f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/player/etdata/VideoPlayEndEvent$Companion;", "", "()V", "X_CACHE", "", "getX_CACHE", "()Ljava/lang/String;", "X_M_CACHE", "getX_M_CACHE", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.player.a.c$c  reason: collision with other inner class name */
    public static final class C0661c {
        private C0661c() {
        }

        public /* synthetic */ C0661c(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR.\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR\u001a\u0010 \u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001a\"\u0004\b'\u0010\u001cR\u001a\u0010(\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010\u000e¨\u0006/"}, d2 = {"Lcom/ss/android/ugc/aweme/player/etdata/VideoPlayEndEvent$VideoStopPlayInfo;", "", "()V", "access", "Lcom/ss/android/common/util/NetworkUtils$NetworkType;", "getAccess", "()Lcom/ss/android/common/util/NetworkUtils$NetworkType;", "setAccess", "(Lcom/ss/android/common/util/NetworkUtils$NetworkType;)V", "bitrate", "", "getBitrate", "()I", "setBitrate", "(I)V", "cdnRequestRecords", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/player/etdata/VideoPlayEndEvent$CDNRequestRecord;", "Lkotlin/collections/ArrayList;", "getCdnRequestRecords", "()Ljava/util/ArrayList;", "setCdnRequestRecords", "(Ljava/util/ArrayList;)V", "groupId", "", "getGroupId", "()Ljava/lang/String;", "setGroupId", "(Ljava/lang/String;)V", "internetSpeed", "getInternetSpeed", "setInternetSpeed", "isH265", "", "()Z", "setH265", "(Z)V", "networkLibType", "getNetworkLibType", "setNetworkLibType", "quality", "getQuality", "setQuality", "putJsonObject", "", "jsonObject", "Lorg/json/JSONObject;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f59075a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public String f59076b;
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<b> f59077c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public String f59078d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f59079e;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        public NetworkUtils.h f59080f = NetworkUtils.h.NONE;
        public int g;
        public int h;
        public int i;

        public final void a(@NotNull NetworkUtils.h hVar) {
            NetworkUtils.h hVar2 = hVar;
            if (PatchProxy.isSupport(new Object[]{hVar2}, this, f59075a, false, 64209, new Class[]{NetworkUtils.h.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hVar2}, this, f59075a, false, 64209, new Class[]{NetworkUtils.h.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(hVar2, "<set-?>");
            this.f59080f = hVar2;
        }

        public final void a(@NotNull JSONObject jSONObject) {
            JSONObject jSONObject2;
            JSONObject jSONObject3 = jSONObject;
            if (PatchProxy.isSupport(new Object[]{jSONObject3}, this, f59075a, false, 64210, new Class[]{JSONObject.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{jSONObject3}, this, f59075a, false, 64210, new Class[]{JSONObject.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(jSONObject3, "jsonObject");
            jSONObject3.put("network_lib_type", this.f59076b);
            if (this.f59077c != null) {
                JSONArray jSONArray = new JSONArray();
                ArrayList<b> arrayList = this.f59077c;
                if (arrayList == null) {
                    Intrinsics.throwNpe();
                }
                Iterator<b> it2 = arrayList.iterator();
                Intrinsics.checkExpressionValueIsNotNull(it2, "cdnRequestRecords!!.iterator()");
                while (it2.hasNext()) {
                    b next = it2.next();
                    if (PatchProxy.isSupport(new Object[0], next, b.f59069a, false, 64208, new Class[0], JSONObject.class)) {
                        jSONObject2 = (JSONObject) PatchProxy.accessDispatch(new Object[0], next, b.f59069a, false, 64208, new Class[0], JSONObject.class);
                    } else {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("cdn_ip", next.f59070b);
                        jSONObject4.put("cdn_name", next.f59071c);
                        jSONObject4.put("cdn_hit_code", next.f59072d);
                        jSONObject4.put("cdn_response_duration", next.f59073e);
                        jSONObject4.put("cdn_cache_size", next.f59074f);
                        jSONObject2 = jSONObject4;
                    }
                    jSONArray.put(jSONObject2);
                }
                jSONObject3.put("cdn_request_records", jSONArray);
            }
            jSONObject3.put("group_id", this.f59078d);
            jSONObject3.put("is_h265", this.f59079e ? 1 : 0);
            jSONObject3.put("access", this.f59080f);
            jSONObject3.put("internet_speed", this.g);
            jSONObject3.put("video_bitrate", this.h);
            jSONObject3.put("video_quality", this.i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e2 A[Catch:{ Throwable -> 0x014e }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7 A[Catch:{ Throwable -> 0x014e }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ee A[Catch:{ Throwable -> 0x014e }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f3 A[Catch:{ Throwable -> 0x014e }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f6 A[Catch:{ Throwable -> 0x014e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f59061a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 64202(0xfaca, float:8.9966E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f59061a
            r5 = 0
            r6 = 64202(0xfaca, float:8.9966E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            com.ss.android.ugc.aweme.player.a.c$d r1 = new com.ss.android.ugc.aweme.player.a.c$d     // Catch:{ Throwable -> 0x014e }
            r1.<init>()     // Catch:{ Throwable -> 0x014e }
            com.ss.android.ugc.aweme.feed.a r2 = com.ss.android.ugc.aweme.feed.a.a()     // Catch:{ Throwable -> 0x014e }
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r9.f59062b     // Catch:{ Throwable -> 0x014e }
            java.lang.Integer r4 = r9.f59063c     // Catch:{ Throwable -> 0x014e }
            if (r4 == 0) goto L_0x0039
            int r4 = r4.intValue()     // Catch:{ Throwable -> 0x014e }
            goto L_0x003a
        L_0x0039:
            r4 = 0
        L_0x003a:
            org.json.JSONObject r2 = r2.b((com.ss.android.ugc.aweme.feed.model.Aweme) r3, (int) r4)     // Catch:{ Throwable -> 0x014e }
            java.lang.String r3 = "AwemeManager.inst().getR…ect(aweme, pageType ?: 0)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)     // Catch:{ Throwable -> 0x014e }
            java.lang.String r3 = r9.f59065e     // Catch:{ Throwable -> 0x014e }
            r1.f59076b = r3     // Catch:{ Throwable -> 0x014e }
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r9.f59062b     // Catch:{ Throwable -> 0x014e }
            java.lang.String r3 = com.ss.android.ugc.aweme.u.aa.m(r3)     // Catch:{ Throwable -> 0x014e }
            r1.f59078d = r3     // Catch:{ Throwable -> 0x014e }
            boolean r3 = r9.f59064d     // Catch:{ Throwable -> 0x014e }
            r1.f59079e = r3     // Catch:{ Throwable -> 0x014e }
            android.content.Context r3 = com.ss.android.ugc.aweme.base.utils.d.a()     // Catch:{ Throwable -> 0x014e }
            com.ss.android.common.util.NetworkUtils$h r3 = com.ss.android.common.util.NetworkUtils.getNetworkType(r3)     // Catch:{ Throwable -> 0x014e }
            java.lang.String r4 = "NetworkUtils.getNetworkT…ionUtils.getAppContext())"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)     // Catch:{ Throwable -> 0x014e }
            r1.a((com.ss.android.common.util.NetworkUtils.h) r3)     // Catch:{ Throwable -> 0x014e }
            int r3 = com.ss.android.ugc.c.b.e()     // Catch:{ Throwable -> 0x014e }
            r1.g = r3     // Catch:{ Throwable -> 0x014e }
            java.util.List<com.ss.android.ugc.aweme.video.preload.e> r3 = r9.f59066f     // Catch:{ Throwable -> 0x014e }
            r4 = 0
            if (r3 == 0) goto L_0x00cc
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Throwable -> 0x014e }
            r3.<init>()     // Catch:{ Throwable -> 0x014e }
            r1.f59077c = r3     // Catch:{ Throwable -> 0x014e }
            java.util.List<com.ss.android.ugc.aweme.video.preload.e> r3 = r9.f59066f     // Catch:{ Throwable -> 0x014e }
            if (r3 != 0) goto L_0x007c
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ Throwable -> 0x014e }
        L_0x007c:
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Throwable -> 0x014e }
        L_0x0080:
            boolean r5 = r3.hasNext()     // Catch:{ Throwable -> 0x014e }
            if (r5 == 0) goto L_0x00cc
            java.lang.Object r5 = r3.next()     // Catch:{ Throwable -> 0x014e }
            com.ss.android.ugc.aweme.video.preload.e r5 = (com.ss.android.ugc.aweme.video.preload.e) r5     // Catch:{ Throwable -> 0x014e }
            com.ss.android.ugc.aweme.player.a.c$b r6 = new com.ss.android.ugc.aweme.player.a.c$b     // Catch:{ Throwable -> 0x014e }
            r6.<init>()     // Catch:{ Throwable -> 0x014e }
            java.lang.String r7 = r5.h     // Catch:{ Throwable -> 0x014e }
            r6.f59070b = r7     // Catch:{ Throwable -> 0x014e }
            java.lang.String r7 = r5.f76213f     // Catch:{ Throwable -> 0x014e }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Throwable -> 0x014e }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x014e }
            if (r7 != 0) goto L_0x00a6
            java.lang.String r7 = r5.f76213f     // Catch:{ Throwable -> 0x014e }
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ Throwable -> 0x014e }
            goto L_0x00a7
        L_0x00a6:
            r7 = r4
        L_0x00a7:
            if (r7 == 0) goto L_0x00ae
            java.lang.String r7 = r7.getHost()     // Catch:{ Throwable -> 0x014e }
            goto L_0x00af
        L_0x00ae:
            r7 = r4
        L_0x00af:
            r6.f59071c = r7     // Catch:{ Throwable -> 0x014e }
            long r7 = r5.j     // Catch:{ Throwable -> 0x014e }
            r6.f59073e = r7     // Catch:{ Throwable -> 0x014e }
            long r7 = r5.k     // Catch:{ Throwable -> 0x014e }
            r6.f59074f = r7     // Catch:{ Throwable -> 0x014e }
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.l     // Catch:{ Throwable -> 0x014e }
            int r5 = r9.a(r5)     // Catch:{ Throwable -> 0x014e }
            r6.f59072d = r5     // Catch:{ Throwable -> 0x014e }
            java.util.ArrayList<com.ss.android.ugc.aweme.player.a.c$b> r5 = r1.f59077c     // Catch:{ Throwable -> 0x014e }
            if (r5 != 0) goto L_0x00c8
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ Throwable -> 0x014e }
        L_0x00c8:
            r5.add(r6)     // Catch:{ Throwable -> 0x014e }
            goto L_0x0080
        L_0x00cc:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r9.f59062b     // Catch:{ Throwable -> 0x014e }
            if (r3 == 0) goto L_0x00db
            com.ss.android.ugc.aweme.feed.model.Video r3 = r3.getVideo()     // Catch:{ Throwable -> 0x014e }
            if (r3 == 0) goto L_0x00db
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r3 = r3.getPlayAddr()     // Catch:{ Throwable -> 0x014e }
            goto L_0x00dc
        L_0x00db:
            r3 = r4
        L_0x00dc:
            com.ss.android.ugc.playerkit.session.a r5 = com.ss.android.ugc.playerkit.session.a.a()     // Catch:{ Throwable -> 0x014e }
            if (r3 == 0) goto L_0x00e7
            java.lang.String r6 = r3.getUri()     // Catch:{ Throwable -> 0x014e }
            goto L_0x00e8
        L_0x00e7:
            r6 = r4
        L_0x00e8:
            com.ss.android.ugc.playerkit.session.Session r5 = r5.b(r6)     // Catch:{ Throwable -> 0x014e }
            if (r3 == 0) goto L_0x00f3
            java.util.List r6 = r3.getBitRate()     // Catch:{ Throwable -> 0x014e }
            goto L_0x00f4
        L_0x00f3:
            r6 = r4
        L_0x00f4:
            if (r5 == 0) goto L_0x0135
            java.lang.String r7 = r5.sourceId     // Catch:{ Throwable -> 0x014e }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Throwable -> 0x014e }
            if (r3 == 0) goto L_0x0100
            java.lang.String r4 = r3.getSourceId()     // Catch:{ Throwable -> 0x014e }
        L_0x0100:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ Throwable -> 0x014e }
            boolean r3 = android.text.TextUtils.equals(r7, r4)     // Catch:{ Throwable -> 0x014e }
            if (r3 == 0) goto L_0x0135
            int r3 = r5.bitrate     // Catch:{ Throwable -> 0x014e }
            r1.h = r3     // Catch:{ Throwable -> 0x014e }
            if (r6 == 0) goto L_0x0135
            r3 = r6
            java.util.Collection r3 = (java.util.Collection) r3     // Catch:{ Throwable -> 0x014e }
            int r3 = r3.size()     // Catch:{ Throwable -> 0x014e }
        L_0x0115:
            if (r0 >= r3) goto L_0x0135
            java.lang.Object r4 = r6.get(r0)     // Catch:{ Throwable -> 0x014e }
            com.ss.android.ugc.aweme.feed.model.BitRate r4 = (com.ss.android.ugc.aweme.feed.model.BitRate) r4     // Catch:{ Throwable -> 0x014e }
            int r4 = r4.getBitRate()     // Catch:{ Throwable -> 0x014e }
            int r7 = r5.bitrate     // Catch:{ Throwable -> 0x014e }
            if (r4 != r7) goto L_0x0132
            java.lang.Object r0 = r6.get(r0)     // Catch:{ Throwable -> 0x014e }
            com.ss.android.ugc.aweme.feed.model.BitRate r0 = (com.ss.android.ugc.aweme.feed.model.BitRate) r0     // Catch:{ Throwable -> 0x014e }
            int r0 = r0.getQualityType()     // Catch:{ Throwable -> 0x014e }
            r1.i = r0     // Catch:{ Throwable -> 0x014e }
            goto L_0x0135
        L_0x0132:
            int r0 = r0 + 1
            goto L_0x0115
        L_0x0135:
            r1.a((org.json.JSONObject) r2)     // Catch:{ Throwable -> 0x014e }
            com.ss.android.ugc.aweme.player.a r0 = com.ss.android.ugc.aweme.player.a.f59055b     // Catch:{ Throwable -> 0x014e }
            java.lang.String r1 = "play_end_event"
            java.lang.String r3 = r2.toString()     // Catch:{ Throwable -> 0x014e }
            java.lang.String r4 = "jsonObject.toString()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)     // Catch:{ Throwable -> 0x014e }
            r0.a(r1, r3)     // Catch:{ Throwable -> 0x014e }
            java.lang.String r0 = "video_play_end"
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (org.json.JSONObject) r2)     // Catch:{ Throwable -> 0x014e }
            return
        L_0x014e:
            r0 = move-exception
            java.lang.String r1 = "VideoStopPlayEvent report fail."
            com.bytedance.article.common.monitor.stack.ExceptionMonitor.ensureNotReachHere((java.lang.Throwable) r0, (java.lang.String) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.player.a.c.a():void");
    }

    private final int a(Map<String, String> map) {
        Map<String, String> map2 = map;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{map2}, this, f59061a, false, 64203, new Class[]{Map.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{map2}, this, f59061a, false, 64203, new Class[]{Map.class}, Integer.TYPE)).intValue();
        }
        if (map2 != null) {
            if (map2.containsKey(g)) {
                i2 = d.f59082b.a(map2.get(g));
            } else if (map2.containsKey(h)) {
                i2 = d.f59082b.a(map2.get(h));
            }
        }
        return i2;
    }
}
