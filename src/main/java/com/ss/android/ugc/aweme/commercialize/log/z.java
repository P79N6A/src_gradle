package com.ss.android.ugc.aweme.commercialize.log;

import a.i;
import android.annotation.SuppressLint;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.utils.p;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001$B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010\u0011\u001a\u00020\u000eH\u0007Jh\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00042U\b\u0004\u0010\u0014\u001aO\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0019\u0012\u001b\u0012\u0019\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00130\u0015H\bJ\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u001dH\u0007J\"\u0010\u001e\u001a\u0002H\u001f\"\u0004\b\u0000\u0010\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001f0!H\b¢\u0006\u0002\u0010\"J.\u0010#\u001a\u00020\u0013*\u0004\u0018\u00010\u001d2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000e2\u000e\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\u00048GX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000¨\u0006%²\u0006\u0012\u0010&\u001a\n '*\u0004\u0018\u00010\u00040\u0004X\u0002"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/log/RawURLGetter;", "", "()V", "AD_USER_AGENT_KEY", "", "RUN_SAFE_STATUS_OK", "", "adUserAgent", "getAdUserAgent", "()Ljava/lang/String;", "adUserAgent$delegate", "Lkotlin/Lazy;", "tlsSkipHttps", "Ljava/lang/ThreadLocal;", "", "get", "url", "shouldSkipHttps", "submit", "", "callback", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "status", "success", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "Lcom/ss/android/ugc/aweme/commercialize/log/RawURLGetter$TrackUrlCallback;", "underSkip", "R", "f", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "runSafely", "TrackUrlCallback", "main_douyinCnRelease", "newUa", "kotlin.jvm.PlatformType"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"ApplySharedPref"})
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39361a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f39362b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(z.class), "adUserAgent", "getAdUserAgent()Ljava/lang/String;")), Reflection.property0(new PropertyReference0Impl(Reflection.getOrCreateKotlinClass(z.class), "newUa", "<v#0>"))};

    /* renamed from: c  reason: collision with root package name */
    public static final ThreadLocal<Boolean> f39363c = new ThreadLocal<>();

    /* renamed from: d  reason: collision with root package name */
    public static final z f39364d = new z();
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private static final Lazy f39365e = LazyKt.lazy(b.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/log/RawURLGetter$TrackUrlCallback;", "", "onTrackUrlFinished", "", "status", "", "success", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void a(int i, boolean z, @Nullable Exception exc);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<String> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
        static final class a extends Lambda implements Function0<String> {
            public static final a INSTANCE = new a();
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
                super(0);
            }

            public final String invoke() {
                boolean z = false;
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31851, new Class[0], String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31851, new Class[0], String.class);
                }
                String a2 = p.a(GlobalContext.getContext(), (WebView) null);
                CharSequence charSequence = a2;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                }
                if (z) {
                    a2 = System.getProperty("http.agent");
                    if (a2 == null) {
                        return "";
                    }
                }
                return a2;
            }
        }

        b() {
            super(0);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String invoke() {
            /*
                r9 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class<java.lang.String> r7 = java.lang.String.class
                r4 = 0
                r5 = 31849(0x7c69, float:4.463E-41)
                r2 = r9
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0026
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
                r5 = 0
                r6 = 31849(0x7c69, float:4.463E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class<java.lang.String> r8 = java.lang.String.class
                r3 = r9
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                java.lang.String r0 = (java.lang.String) r0
                return r0
            L_0x0026:
                com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
                java.lang.String r2 = "SharePrefCache.inst()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                android.content.SharedPreferences r1 = r1.getSharePref()
                java.lang.String r2 = "ad_user_agent_sp"
                r3 = 0
                java.lang.String r2 = r1.getString(r2, r3)
                com.ss.android.ugc.aweme.commercialize.log.z$b$a r3 = com.ss.android.ugc.aweme.commercialize.log.z.b.a.INSTANCE
                kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
                kotlin.Lazy r3 = kotlin.LazyKt.lazy(r3)
                kotlin.reflect.KProperty[] r4 = com.ss.android.ugc.aweme.commercialize.log.z.f39362b
                r5 = 1
                r4 = r4[r5]
                r6 = r2
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                if (r6 == 0) goto L_0x0052
                int r6 = r6.length()
                if (r6 != 0) goto L_0x0053
            L_0x0052:
                r0 = 1
            L_0x0053:
                if (r0 == 0) goto L_0x0070
                java.lang.Object r0 = r3.getValue()
                r2 = r0
                java.lang.String r2 = (java.lang.String) r2
                android.content.SharedPreferences$Editor r0 = r1.edit()
                java.lang.String r1 = "ad_user_agent_sp"
                java.lang.Object r3 = r3.getValue()
                java.lang.String r3 = (java.lang.String) r3
                android.content.SharedPreferences$Editor r0 = r0.putString(r1, r3)
                r0.apply()
                goto L_0x0084
            L_0x0070:
                com.ss.android.ugc.aweme.lego.a r0 = com.ss.android.ugc.aweme.lego.a.i
                com.ss.android.ugc.aweme.lego.a$f r0 = r0.a()
                com.ss.android.ugc.aweme.commercialize.log.RawURLGetter$adUserAgent$2$1 r5 = new com.ss.android.ugc.aweme.commercialize.log.RawURLGetter$adUserAgent$2$1
                r5.<init>(r1, r3, r4)
                com.ss.android.ugc.aweme.lego.LegoTask r5 = (com.ss.android.ugc.aweme.lego.LegoTask) r5
                com.ss.android.ugc.aweme.lego.a$f r0 = r0.a(r5)
                r0.a()
            L_0x0084:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.log.z.b.invoke():java.lang.String");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    static final class c<V> implements Callable<Unit> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39366a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f39367b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f39368c;

        c(String str, a aVar) {
            this.f39367b = str;
            this.f39368c = aVar;
        }

        public final /* synthetic */ Object call() {
            boolean z;
            List list;
            z zVar;
            if (PatchProxy.isSupport(new Object[0], this, f39366a, false, 31853, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39366a, false, 31853, new Class[0], Void.TYPE);
            } else {
                String a2 = z.a();
                if (a2.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    list = null;
                } else {
                    list = CollectionsKt.mutableListOf(new com.ss.android.http.a.b.a("User-Agent", a2));
                }
                try {
                    zVar = z.f39364d;
                    z.f39363c.set(Boolean.TRUE);
                    com.ss.android.common.http.a.a().a(0, 0, this.f39367b, list, false, false, null, false);
                    z.f39363c.remove();
                    z.f39364d.a(this.f39368c, 200, true, null);
                } catch (com.ss.android.http.a.a.b e2) {
                    z.f39364d.a(this.f39368c, e2.getStatusCode(), false, e2);
                } catch (com.bytedance.frameworks.baselib.network.http.cronet.a.a e3) {
                    z.f39364d.a(this.f39368c, e3.getStatusCode(), false, e3);
                } catch (Exception e4) {
                    z.f39364d.a(this.f39368c, 0, false, e4);
                } catch (Throwable th) {
                    z.f39363c.remove();
                    throw th;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @JvmStatic
    @NotNull
    public static final String a() {
        return (String) (PatchProxy.isSupport(new Object[0], null, f39361a, true, 31842, new Class[0], String.class) ? PatchProxy.accessDispatch(new Object[0], null, f39361a, true, 31842, new Class[0], String.class) : f39365e.getValue());
    }

    private z() {
    }

    @JvmStatic
    @Nullable
    public static final String a(@Nullable String str) throws com.ss.android.http.a.a.b, NullPointerException, Exception {
        boolean z;
        List mutableListOf;
        if (PatchProxy.isSupport(new Object[]{str}, null, f39361a, true, 31845, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, f39361a, true, 31845, new Class[]{String.class}, String.class);
        } else if (str != null) {
            String a2 = a();
            if (a2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                mutableListOf = null;
            } else {
                mutableListOf = CollectionsKt.mutableListOf(new com.ss.android.http.a.b.a("User-Agent", a2));
            }
            List list = mutableListOf;
            z zVar = f39364d;
            f39363c.set(Boolean.TRUE);
            try {
                return com.ss.android.common.http.a.a().a(0, 0, str, list, false, false, null, false);
            } finally {
                f39363c.remove();
            }
        } else {
            throw new NullPointerException("url is null");
        }
    }

    @JvmStatic
    public static final void a(@NotNull String str, @Nullable a aVar) {
        String str2 = str;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str2, aVar2}, null, f39361a, true, 31844, new Class[]{String.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, aVar2}, null, f39361a, true, 31844, new Class[]{String.class, a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, PushConstants.WEB_URL);
        i.a((Callable<TResult>) new c<TResult>(str2, aVar2), (Executor) h.c());
    }

    public final void a(@Nullable a aVar, int i, boolean z, Exception exc) {
        if (PatchProxy.isSupport(new Object[]{aVar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), exc}, this, f39361a, false, 31848, new Class[]{a.class, Integer.TYPE, Boolean.TYPE, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, Integer.valueOf(i), Byte.valueOf(z), exc}, this, f39361a, false, 31848, new Class[]{a.class, Integer.TYPE, Boolean.TYPE, Exception.class}, Void.TYPE);
        } else if (aVar != null) {
            try {
                aVar.a(i, z, exc);
            } catch (Exception unused) {
            }
        }
    }
}
