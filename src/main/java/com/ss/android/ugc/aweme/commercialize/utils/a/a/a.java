package com.ss.android.ugc.aweme.commercialize.utils.a.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.i;
import com.ss.android.ugc.aweme.app.f;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002JV\u0010\u000e\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u00042\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007JH\u0010\u0017\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/router/web/AdWebPage;", "", "()V", "handleOpenVastApp", "", "url", "", "uri", "Landroid/net/Uri;", "schema", "context", "Landroid/content/Context;", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "openAdWebUrl", "webUrl", "title", "hideNavBar", "params", "", "useOrdinaryWeb", "data", "Lcom/ss/android/ugc/aweme/commercialize/utils/router/web/AdWebPage$AdWebUrlData;", "openFeedAdWebUrl", "withLog", "appAdFrom", "", "AdWebUrlData", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39629a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f39630b = new a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BA\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003JH\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\tHÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012¨\u0006("}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/router/web/AdWebPage$AdWebUrlData;", "", "creativeId", "", "logExtra", "", "downloadUrl", "adType", "adSystemOrigin", "", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getAdSystemOrigin", "()I", "setAdSystemOrigin", "(I)V", "getAdType", "()Ljava/lang/String;", "setAdType", "(Ljava/lang/String;)V", "getCreativeId", "()Ljava/lang/Long;", "setCreativeId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getDownloadUrl", "setDownloadUrl", "getLogExtra", "setLogExtra", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/ss/android/ugc/aweme/commercialize/utils/router/web/AdWebPage$AdWebUrlData;", "equals", "", "other", "hashCode", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a.a$a  reason: collision with other inner class name */
    public static final class C0516a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39631a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public Long f39632b;
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        public String f39633c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public String f39634d;
        @Nullable

        /* renamed from: e  reason: collision with root package name */
        public String f39635e;

        /* renamed from: f  reason: collision with root package name */
        public int f39636f;

        @JvmOverloads
        public C0516a() {
            this(null, null, null, null, 0, 31);
        }

        @JvmOverloads
        public C0516a(@Nullable Long l, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            this(l, str, str2, str3, 0, 16);
        }

        public final boolean equals(@Nullable Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, f39631a, false, 32709, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f39631a, false, 32709, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            }
            if (this != obj) {
                if (obj instanceof C0516a) {
                    C0516a aVar = (C0516a) obj;
                    if (Intrinsics.areEqual((Object) this.f39632b, (Object) aVar.f39632b) && Intrinsics.areEqual((Object) this.f39633c, (Object) aVar.f39633c) && Intrinsics.areEqual((Object) this.f39634d, (Object) aVar.f39634d) && Intrinsics.areEqual((Object) this.f39635e, (Object) aVar.f39635e)) {
                        if (this.f39636f == aVar.f39636f) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            if (PatchProxy.isSupport(new Object[0], this, f39631a, false, 32708, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f39631a, false, 32708, new Class[0], Integer.TYPE)).intValue();
            }
            Long l = this.f39632b;
            int hashCode = (l != null ? l.hashCode() : 0) * 31;
            String str = this.f39633c;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f39634d;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f39635e;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return ((hashCode3 + i) * 31) + this.f39636f;
        }

        @NotNull
        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, f39631a, false, 32707, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f39631a, false, 32707, new Class[0], String.class);
            }
            return "AdWebUrlData(creativeId=" + this.f39632b + ", logExtra=" + this.f39633c + ", downloadUrl=" + this.f39634d + ", adType=" + this.f39635e + ", adSystemOrigin=" + this.f39636f + ")";
        }

        @JvmOverloads
        private C0516a(@Nullable Long l, @Nullable String str, @Nullable String str2, @Nullable String str3, int i) {
            this.f39632b = l;
            this.f39633c = str;
            this.f39634d = str2;
            this.f39635e = str3;
            this.f39636f = i;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C0516a(java.lang.Long r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, int r12) {
            /*
                r6 = this;
                r11 = r12 & 1
                if (r11 == 0) goto L_0x000a
                r0 = 0
                java.lang.Long r7 = java.lang.Long.valueOf(r0)
            L_0x000a:
                r1 = r7
                r7 = r12 & 2
                r11 = 0
                if (r7 == 0) goto L_0x0012
                r2 = r11
                goto L_0x0013
            L_0x0012:
                r2 = r8
            L_0x0013:
                r7 = r12 & 4
                if (r7 == 0) goto L_0x0019
                r3 = r11
                goto L_0x001a
            L_0x0019:
                r3 = r9
            L_0x001a:
                r7 = r12 & 8
                if (r7 == 0) goto L_0x0020
                r4 = r11
                goto L_0x0021
            L_0x0020:
                r4 = r10
            L_0x0021:
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.a.a.a.C0516a.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, int, int):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "success", "", "sendLog"}, k = 3, mv = {1, 1, 15})
    static final class b implements g.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39637a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f39638b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Aweme f39639c;

        b(Context context, Aweme aweme) {
            this.f39638b = context;
            this.f39639c = aweme;
        }

        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f39637a, false, 32710, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f39637a, false, 32710, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else if (z) {
                com.ss.android.ugc.aweme.commercialize.log.g.g(this.f39638b, this.f39639c);
            } else {
                com.ss.android.ugc.aweme.commercialize.log.g.h(this.f39638b, this.f39639c);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "success", "", "sendLog"}, k = 3, mv = {1, 1, 15})
    static final class c implements g.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39640a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f39641b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Aweme f39642c;

        c(Context context, Aweme aweme) {
            this.f39641b = context;
            this.f39642c = aweme;
        }

        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f39640a, false, 32711, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f39640a, false, 32711, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else if (z) {
                com.ss.android.ugc.aweme.commercialize.log.g.g(this.f39641b, this.f39642c);
            } else {
                com.ss.android.ugc.aweme.commercialize.log.g.h(this.f39641b, this.f39642c);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "success", "", "sendLog"}, k = 3, mv = {1, 1, 15})
    static final class d implements g.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39643a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f39644b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Aweme f39645c;

        d(Context context, Aweme aweme) {
            this.f39644b = context;
            this.f39645c = aweme;
        }

        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f39643a, false, 32712, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f39643a, false, 32712, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else if (z) {
                com.ss.android.ugc.aweme.commercialize.log.g.g(this.f39644b, this.f39645c);
            } else {
                com.ss.android.ugc.aweme.commercialize.log.g.h(this.f39644b, this.f39645c);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "success", "", "sendLog"}, k = 3, mv = {1, 1, 15})
    static final class e implements g.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39646a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f39647b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Aweme f39648c;

        e(Context context, Aweme aweme) {
            this.f39647b = context;
            this.f39648c = aweme;
        }

        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f39646a, false, 32713, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f39646a, false, 32713, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else if (z) {
                com.ss.android.ugc.aweme.commercialize.log.g.g(this.f39647b, this.f39648c);
            } else {
                com.ss.android.ugc.aweme.commercialize.log.g.h(this.f39647b, this.f39648c);
            }
        }
    }

    private a() {
    }

    private final boolean a(String str, Uri uri, String str2, Context context, Aweme aweme) {
        String str3 = str;
        Uri uri2 = uri;
        String str4 = str2;
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{str3, uri2, str4, context2, aweme2}, this, f39629a, false, 32705, new Class[]{String.class, Uri.class, String.class, Context.class, Aweme.class}, Boolean.TYPE)) {
            Object[] objArr = {str3, uri2, str4, context2, aweme2};
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, f39629a, false, 32705, new Class[]{String.class, Uri.class, String.class, Context.class, Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (Intrinsics.areEqual((Object) uri.getScheme(), (Object) "market")) {
            if (!com.ss.android.ugc.aweme.commercialize.utils.a.b.a(context)) {
                com.ss.android.ugc.aweme.commercialize.log.g.f(context, aweme);
                com.ss.android.ugc.aweme.commercialize.log.g.i(context, aweme);
            } else if (com.ss.android.ugc.aweme.commercialize.utils.a.b.a(context2, uri2)) {
                com.ss.android.ugc.aweme.commercialize.log.g.f(context, aweme);
                g.a((g.a) new b(context2, aweme2));
            }
            return true;
        } else if (com.ss.android.ugc.aweme.commercialize.utils.a.b.a(uri)) {
            if (!com.ss.android.ugc.aweme.commercialize.utils.a.b.a(context)) {
                return false;
            }
            if (com.ss.android.ugc.aweme.commercialize.utils.a.b.b(context2, uri2)) {
                com.ss.android.ugc.aweme.commercialize.log.g.f(context, aweme);
                g.a((g.a) new c(context2, aweme2));
            }
            return true;
        } else if (g.a(uri)) {
            if (!com.ss.android.ugc.aweme.commercialize.utils.a.a.a(context2, uri2)) {
                return false;
            }
            if (com.ss.android.ugc.aweme.commercialize.utils.a.a.a(context2, uri2, aweme2)) {
                com.ss.android.ugc.aweme.commercialize.log.g.f(context, aweme);
                g.a((g.a) new d(context2, aweme2));
            }
            return true;
        } else if (com.ss.android.ugc.aweme.commercialize.utils.a.a.b(context2, uri2)) {
            if (com.ss.android.ugc.aweme.commercialize.utils.a.a.b(context2, uri2, aweme2)) {
                com.ss.android.ugc.aweme.commercialize.log.g.f(context, aweme);
                g.a((g.a) new e(context2, aweme2));
            }
            return true;
        } else {
            if (!(!Intrinsics.areEqual((Object) com.ss.android.ugc.aweme.app.e.f34152b, (Object) str4)) || !(!Intrinsics.areEqual((Object) com.ss.android.ugc.aweme.app.e.f34154d, (Object) str4))) {
                f.f34171e.a(context2, str3, null);
            } else {
                com.ss.android.ugc.aweme.commercialize.log.g.f(context, aweme);
                com.ss.android.ugc.aweme.commercialize.log.g.i(context, aweme);
            }
            return true;
        }
    }

    @JvmStatic
    public static final boolean a(@Nullable Context context, @Nullable String str, @Nullable String str2, boolean z, @Nullable Map<String, String> map, boolean z2, @Nullable C0516a aVar) {
        String str3;
        Context context2 = context;
        String str4 = str;
        String str5 = str2;
        C0516a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context2, str4, str5, Byte.valueOf(z ? (byte) 1 : 0), map, Byte.valueOf(z2 ? (byte) 1 : 0), aVar2}, null, f39629a, true, 32703, new Class[]{Context.class, String.class, String.class, Boolean.TYPE, Map.class, Boolean.TYPE, C0516a.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str4, str5, Byte.valueOf(z), map, Byte.valueOf(z2), aVar2}, null, f39629a, true, 32703, new Class[]{Context.class, String.class, String.class, Boolean.TYPE, Map.class, Boolean.TYPE, C0516a.class}, Boolean.TYPE)).booleanValue();
        } else if (context2 == null || TextUtils.isEmpty(str4)) {
            return false;
        } else {
            if (map != null && (!map.isEmpty())) {
                i iVar = new i(str4);
                for (Map.Entry next : map.entrySet()) {
                    iVar.a((String) next.getKey(), (String) next.getValue());
                }
                str4 = iVar.a();
            }
            Intent intent = new Intent(context2, CrossPlatformActivity.class);
            intent.setData(Uri.parse(str4));
            Uri data = intent.getData();
            if (data != null) {
                str3 = data.getQueryParameter("launch_mode");
            } else {
                str3 = null;
            }
            if (!TextUtils.equals(str3, "standard")) {
                intent.setFlags(268435456);
            }
            if (!TextUtils.isEmpty(str5)) {
                intent.putExtra(PushConstants.TITLE, str5);
            } else {
                intent.putExtra(PushConstants.TITLE, " ");
                intent.putExtra("bundle_user_webview_title", true);
            }
            intent.putExtra("hide_nav_bar", z);
            intent.putExtra("bundle_forbidden_jump", true);
            intent.putExtra("use_ordinary_web", z2);
            if (aVar2 != null) {
                if (!TextUtils.isEmpty(aVar2.f39633c)) {
                    intent.putExtra("bundle_download_app_log_extra", aVar2.f39633c);
                }
                Long l = aVar2.f39632b;
                if (l == null || l.longValue() != 0) {
                    intent.putExtra("ad_id", aVar2.f39632b);
                    intent.putExtra("ad_type", aVar2.f39635e);
                    intent.putExtra("ad_system_origin", aVar2.f39636f);
                }
                if (!TextUtils.isEmpty(aVar2.f39634d)) {
                    intent.putExtra("bundle_download_url", aVar2.f39634d);
                }
            }
            return g.a(context2, intent);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02af, code lost:
        if (r3 == null) goto L_0x02b1;
     */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean a(@org.jetbrains.annotations.Nullable android.content.Context r20, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.feed.model.Aweme r21, @org.jetbrains.annotations.Nullable java.lang.String r22, @org.jetbrains.annotations.Nullable java.lang.String r23, boolean r24, boolean r25, int r26) {
        /*
            r6 = r20
            r7 = r21
            r9 = r26
            r1 = 7
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r17 = 0
            r10[r17] = r6
            r5 = 1
            r10[r5] = r7
            r2 = 2
            r10[r2] = r22
            r3 = 3
            r10[r3] = r23
            java.lang.Byte r4 = java.lang.Byte.valueOf(r24)
            r18 = 4
            r10[r18] = r4
            java.lang.Byte r4 = java.lang.Byte.valueOf(r25)
            r15 = 5
            r10[r15] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r26)
            r19 = 6
            r10[r19] = r4
            com.meituan.robust.ChangeQuickRedirect r12 = f39629a
            java.lang.Class[] r4 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r11 = android.content.Context.class
            r4[r17] = r11
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r11 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r4[r5] = r11
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            r4[r2] = r11
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            r4[r3] = r11
            java.lang.Class r11 = java.lang.Boolean.TYPE
            r4[r18] = r11
            java.lang.Class r11 = java.lang.Boolean.TYPE
            r4[r15] = r11
            java.lang.Class r11 = java.lang.Integer.TYPE
            r4[r19] = r11
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = 0
            r13 = 1
            r14 = 32704(0x7fc0, float:4.5828E-41)
            r15 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r4 == 0) goto L_0x00b6
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r17] = r6
            r4[r5] = r7
            r4[r2] = r22
            r4[r3] = r23
            java.lang.Byte r0 = java.lang.Byte.valueOf(r24)
            r4[r18] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r25)
            r10 = 5
            r4[r10] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r26)
            r4[r19] = r0
            r0 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = f39629a
            r7 = 1
            r8 = 32704(0x7fc0, float:4.5828E-41)
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r9 = android.content.Context.class
            r1[r17] = r9
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r9 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r1[r5] = r9
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r1[r2] = r5
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r3] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r1[r18] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r1[r10] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r19] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r20 = r4
            r21 = r0
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r1
            r26 = r2
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r20, r21, r22, r23, r24, r25, r26)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x00b6:
            r10 = 5
            if (r6 != 0) goto L_0x00ba
            return r17
        L_0x00ba:
            if (r7 != 0) goto L_0x00bd
            return r17
        L_0x00bd:
            boolean r1 = r21.isAd()
            if (r1 != 0) goto L_0x00c4
            return r17
        L_0x00c4:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r11 = r21.getAwemeRawAd()
            if (r22 != 0) goto L_0x00d5
            if (r11 != 0) goto L_0x00cf
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00cf:
            java.lang.String r0 = r11.getWebUrl()
            r12 = 1
            goto L_0x00d8
        L_0x00d5:
            r0 = r22
            r12 = 0
        L_0x00d8:
            if (r0 != 0) goto L_0x00de
            java.lang.String r0 = com.ss.android.ugc.aweme.commercialize.utils.am.i(r21)
        L_0x00de:
            r13 = r0
            if (r13 != 0) goto L_0x00e2
            return r17
        L_0x00e2:
            android.net.Uri r2 = android.net.Uri.parse(r13)
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.am.e(r21)
            if (r0 != 0) goto L_0x00f5
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.am.f(r21)
            if (r0 == 0) goto L_0x00f3
            goto L_0x00f5
        L_0x00f3:
            r14 = 1
            goto L_0x0112
        L_0x00f5:
            com.ss.android.ugc.aweme.commercialize.utils.a.a.a r0 = f39630b
            java.lang.String r1 = "uri"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r1)
            java.lang.String r3 = r2.getScheme()
            if (r3 != 0) goto L_0x0105
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0105:
            r1 = r13
            r4 = r20
            r14 = 1
            r5 = r21
            boolean r0 = r0.a(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0112
            return r14
        L_0x0112:
            if (r23 != 0) goto L_0x011e
            if (r11 != 0) goto L_0x0119
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0119:
            java.lang.String r0 = r11.getWebTitle()
            goto L_0x0120
        L_0x011e:
            r0 = r23
        L_0x0120:
            if (r11 != 0) goto L_0x0125
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0125:
            java.lang.Long r1 = r11.getCreativeId()
            java.lang.Long r2 = r11.getGroupId()
            java.lang.String r3 = r11.getLogExtra()
            java.lang.String r4 = r11.getDownloadUrl()
            java.lang.String r5 = ""
            org.json.JSONObject r5 = com.ss.android.ugc.aweme.commercialize.log.g.f(r6, r7, r5)
            java.lang.String r8 = r11.getPackageName()
            java.lang.String r15 = r11.getQuickAppUrl()
            r16 = r13
            java.lang.CharSequence r16 = (java.lang.CharSequence) r16
            boolean r16 = android.text.TextUtils.isEmpty(r16)
            if (r16 == 0) goto L_0x014e
            return r17
        L_0x014e:
            if (r25 == 0) goto L_0x0153
            com.ss.android.ugc.aweme.commercialize.log.g.j(r20, r21)
        L_0x0153:
            android.content.Intent r10 = new android.content.Intent
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity> r14 = com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.class
            r10.<init>(r6, r14)
            android.net.Uri r13 = android.net.Uri.parse(r13)
            r10.setData(r13)
            r13 = r0
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 == 0) goto L_0x0172
            boolean r13 = com.ss.android.g.a.a()
            if (r13 == 0) goto L_0x0172
            java.lang.String r0 = " "
        L_0x0172:
            java.lang.String r13 = "title"
            r10.putExtra(r13, r0)
            java.lang.String r0 = "show_report"
            boolean r13 = r11.isReportEnable()
            r10.putExtra(r0, r13)
            r0 = r3
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x018e
            java.lang.String r0 = "bundle_download_app_log_extra"
            r10.putExtra(r0, r3)
        L_0x018e:
            java.lang.String r0 = "bundle_app_ad_from"
            r10.putExtra(r0, r9)
            r13 = 0
            if (r1 != 0) goto L_0x0198
            goto L_0x01a0
        L_0x0198:
            long r16 = r1.longValue()
            int r0 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x01cd
        L_0x01a0:
            java.lang.String r0 = "ad_id"
            java.lang.String r3 = "creativeId"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            long r13 = r1.longValue()
            r10.putExtra(r0, r13)
            java.lang.String r0 = "ad_type"
            java.lang.String r3 = r11.getType()
            r10.putExtra(r0, r3)
            java.lang.String r0 = "ad_system_origin"
            int r3 = r11.getSystemOrigin()
            r10.putExtra(r0, r3)
            java.lang.String r0 = "bundle_download_app_extra"
            long r13 = r1.longValue()
            java.lang.String r3 = java.lang.String.valueOf(r13)
            r10.putExtra(r0, r3)
        L_0x01cd:
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            java.lang.String r3 = "SharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
            com.ss.android.ugc.aweme.app.an r0 = r0.getJsActlogUrl()
            java.lang.String r3 = "SharePrefCache.inst().jsActlogUrl"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
            java.lang.Object r0 = r0.c()
            java.lang.String r0 = (java.lang.String) r0
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x01f3
            java.lang.String r3 = "ad_js_url"
            r10.putExtra(r3, r0)
        L_0x01f3:
            java.lang.String r0 = "bundle_disable_download_dialog"
            boolean r3 = r11.isDisableDownloadDialog()
            r10.putExtra(r0, r3)
            r0 = r4
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02a7
            java.lang.String r0 = "bundle_is_from_app_ad"
            r3 = 1
            r10.putExtra(r0, r3)
            java.lang.String r0 = "bundle_download_url"
            r10.putExtra(r0, r4)
            java.lang.String r0 = "aweme_package_name"
            r10.putExtra(r0, r8)
            java.lang.String r0 = "bundle_ad_quick_app_url"
            r10.putExtra(r0, r15)
            java.lang.String r0 = "bundle_download_app_name"
            java.lang.String r4 = r11.getAppName()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != r3) goto L_0x022d
            java.lang.String r3 = r11.getWebTitle()
            goto L_0x0233
        L_0x022d:
            if (r4 != 0) goto L_0x02a1
            java.lang.String r3 = r11.getAppName()
        L_0x0233:
            r10.putExtra(r0, r3)
            java.lang.String r0 = "bundle_download_mode"
            int r3 = r11.getDownloadMode()
            r10.putExtra(r0, r3)
            java.lang.String r0 = "bundle_link_mode"
            int r3 = r11.getLinkMode()
            r10.putExtra(r0, r3)
            java.lang.String r0 = "bundle_support_multiple_download"
            boolean r3 = r11.isSupportMultiple()
            r10.putExtra(r0, r3)
            java.lang.String r0 = "bundle_web_url"
            java.lang.String r3 = r11.getWebUrl()
            r10.putExtra(r0, r3)
            java.lang.String r0 = "bundle_web_title"
            java.lang.String r3 = r11.getWebTitle()
            r10.putExtra(r0, r3)
            java.lang.String r13 = r11.getOpenUrl()
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.c.b((java.lang.String) r13)
            if (r0 == 0) goto L_0x029b
            java.lang.String r0 = "snssdk1128://adx"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r0 = r0.buildUpon()
            r3 = 5
            if (r9 != r3) goto L_0x0281
            java.lang.String r3 = "tag"
            java.lang.String r4 = "result_ad"
            r0.appendQueryParameter(r3, r4)
        L_0x0281:
            java.lang.String r3 = "openUrl"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r13, r3)
            java.lang.String r14 = "__back_url__"
            java.lang.String r15 = r0.toString()
            java.lang.String r0 = "backUrlBuilder.toString()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r15, r0)
            r16 = 0
            r17 = 4
            r18 = 0
            java.lang.String r13 = kotlin.text.StringsKt.replace$default((java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (boolean) r16, (int) r17, (java.lang.Object) r18)
        L_0x029b:
            java.lang.String r0 = "bundle_open_url"
            r10.putExtra(r0, r13)
            goto L_0x02a7
        L_0x02a1:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02a7:
            java.lang.String r0 = "aweme_json_extra"
            if (r5 == 0) goto L_0x02b1
            java.lang.String r3 = r5.toString()
            if (r3 != 0) goto L_0x02b3
        L_0x02b1:
            java.lang.String r3 = ""
        L_0x02b3:
            r10.putExtra(r0, r3)
            if (r2 == 0) goto L_0x02d0
            long r3 = r2.longValue()
            r13 = 0
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x02d2
            java.lang.String r0 = "aweme_group_id"
            long r2 = r2.longValue()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r10.putExtra(r0, r2)
            goto L_0x02d2
        L_0x02d0:
            r13 = 0
        L_0x02d2:
            long r2 = r1.longValue()
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x02e7
            java.lang.String r0 = "aweme_creative_id"
            long r1 = r1.longValue()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r10.putExtra(r0, r1)
        L_0x02e7:
            r0 = r8
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02f5
            java.lang.String r0 = "aweme_package_name"
            r10.putExtra(r0, r8)
        L_0x02f5:
            boolean r0 = r11.isUseDefaultColor()
            if (r0 == 0) goto L_0x030c
            java.lang.String r0 = "bundle_webview_background"
            android.content.res.Resources r1 = r20.getResources()
            r2 = 2131624964(0x7f0e0404, float:1.8877123E38)
            int r1 = r1.getColor(r2)
            r10.putExtra(r0, r1)
            goto L_0x0312
        L_0x030c:
            java.lang.String r0 = "bundle_webview_background"
            r1 = -1
            r10.putExtra(r0, r1)
        L_0x0312:
            java.lang.String r0 = "aweme_id"
            java.lang.String r1 = r21.getAid()
            r10.putExtra(r0, r1)
            java.lang.String r0 = "owner_id"
            java.lang.String r1 = r21.getAuthorUid()
            r10.putExtra(r0, r1)
            java.lang.String r0 = "bundle_forbidden_jump"
            r1 = 1
            r10.putExtra(r0, r1)
            java.lang.String r0 = "use_ordinary_web"
            r1 = r24
            r10.putExtra(r0, r1)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r10.addFlags(r0)
            com.ss.android.ugc.aweme.commercialize.feed.b.c r0 = r11.getPreloadData()
            if (r0 == 0) goto L_0x0345
            java.lang.String r1 = "preload_site_id"
            java.lang.String r0 = r0.getSiteId()
            r10.putExtra(r1, r0)
        L_0x0345:
            int r0 = r11.getPreloadWeb()
            java.lang.String r1 = "preload_web_status"
            r10.putExtra(r1, r0)
            java.lang.String r0 = "preload_is_web_url"
            r10.putExtra(r0, r12)
            java.lang.String r0 = "web_type"
            int r1 = r11.getWebType()
            r10.putExtra(r0, r1)
            com.ss.android.ugc.aweme.commercialize.utils.y.a(r21)
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.g.a((android.content.Context) r6, (android.content.Intent) r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.a.a.a.a(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, boolean, boolean, int):boolean");
    }
}
