package com.ss.android.ugc.aweme.sec;

import a.g;
import a.i;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.geckoclient.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.app.application.l;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.sec.a.c;
import com.ss.sys.ces.out.ISdk;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0003J8\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u000bH\u0007J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\bH\u0007J\b\u0010#\u001a\u00020\u0017H\u0007J\u0010\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u001dH\u0007J \u0010&\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0007J\u0010\u0010\u000e\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\bH\u0007J\u0006\u0010,\u001a\u00020\u0017J\u0010\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\bH\u0007J\u0018\u0010/\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\b2\u0006\u00100\u001a\u00020\bH\u0007J\u0010\u00101\u001a\u00020\u00172\u0006\u00100\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0002@\u0002X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ss/android/ugc/aweme/sec/DmtSec;", "", "()V", "DELAY_INIT_TIME", "", "captcha", "Lcom/ss/android/ugc/aweme/sec/captcha/SecCaptcha;", "currentDid", "", "currentIid", "initSuccess", "", "needUpdateDid", "needUpdateIid", "report", "Lcom/ss/android/ugc/aweme/sec/report/DataReport;", "reportArray", "Ljava/util/ArrayList;", "secInstance", "Lcom/ss/sys/ces/out/ISdk;", "targetDid", "targetIid", "finishInitAndProcessPending", "", "init", "context", "Landroid/content/Context;", "language", "aid", "", "appName", "channel", "openImageVerify", "isCaptchaUrl", "url", "loadSo", "needVerifyImage", "errorCode", "popCaptcha", "activity", "Landroid/app/Activity;", "listener", "Lcom/ss/android/ugc/aweme/sec/SecCaptchaListener;", "scene", "setParams", "updateDeviceId", "deviceId", "updateDeviceIdAndInstallId", "iid", "updateInstallId", "network_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63719a;

    /* renamed from: b  reason: collision with root package name */
    static boolean f63720b;

    /* renamed from: c  reason: collision with root package name */
    public static ISdk f63721c;
    @SuppressLint({"CI_StaticFieldLeak"})

    /* renamed from: d  reason: collision with root package name */
    static c f63722d;

    /* renamed from: e  reason: collision with root package name */
    public static com.ss.android.ugc.aweme.sec.b.a f63723e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f63724f = new a();
    private static ArrayList<String> g = new ArrayList<>();
    private static String h;
    private static String i;
    private static String j;
    private static String k;
    private static boolean l;
    private static boolean m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lbolts/Task;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.sec.a$a  reason: collision with other inner class name */
    public static final class C0689a<TTaskResult, TContinuationResult> implements g<Void, Unit> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63725a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f63726b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f63727c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f63728d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f63729e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f63730f;
        final /* synthetic */ Context g;

        public C0689a(boolean z, String str, int i, String str2, String str3, Context context) {
            this.f63726b = z;
            this.f63727c = str;
            this.f63728d = i;
            this.f63729e = str2;
            this.f63730f = str3;
            this.g = context;
        }

        public final /* synthetic */ Object then(i iVar) {
            String str;
            String str2;
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f63725a, false, 71088, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f63725a, false, 71088, new Class[]{i.class}, Void.TYPE);
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                String a2 = l.a();
                long currentTimeMillis2 = System.currentTimeMillis();
                com.ss.android.ugc.aweme.sec.c.c cVar = com.ss.android.ugc.aweme.sec.c.c.f63761b;
                cVar.a("SecCaptcha", "initSCCheckUtil getSessionTime = " + (currentTimeMillis2 - currentTimeMillis));
                long currentTimeMillis3 = System.currentTimeMillis();
                a aVar = a.f63724f;
                ISdk iSdk = a.f63721c;
                if (iSdk != null) {
                    iSdk.setSession(a2);
                }
                long currentTimeMillis4 = System.currentTimeMillis();
                com.ss.android.ugc.aweme.sec.c.c cVar2 = com.ss.android.ugc.aweme.sec.c.c.f63761b;
                cVar2.a("DmtSec", "init setSessionTime = " + (currentTimeMillis4 - currentTimeMillis3));
                if (AppLog.getServerDeviceId() != null) {
                    str = AppLog.getServerDeviceId();
                } else {
                    str = "";
                }
                String str3 = str;
                if (AppLog.getInstallId() != null) {
                    str2 = AppLog.getInstallId();
                } else {
                    str2 = "";
                }
                String str4 = str2;
                if (this.f63726b) {
                    String str5 = this.f63727c;
                    int i = this.f63728d;
                    String str6 = this.f63729e;
                    Intrinsics.checkExpressionValueIsNotNull(str4, "iid");
                    Intrinsics.checkExpressionValueIsNotNull(str3, "did");
                    String str7 = this.f63730f;
                    Intrinsics.checkExpressionValueIsNotNull(a2, "sessionId");
                    com.ss.android.ugc.aweme.sec.a.a aVar2 = new com.ss.android.ugc.aweme.sec.a.a(str5, i, str6, str4, str3, str7, a2, 0, SearchJediMixFeedAdapter.f42517f);
                    long currentTimeMillis5 = System.currentTimeMillis();
                    a aVar3 = a.f63724f;
                    Context applicationContext = this.g.getApplicationContext();
                    Intrinsics.checkExpressionValueIsNotNull(applicationContext, "context.applicationContext");
                    a.f63722d = new c(applicationContext, aVar2);
                    long currentTimeMillis6 = System.currentTimeMillis();
                    com.ss.android.ugc.aweme.sec.c.c cVar3 = com.ss.android.ugc.aweme.sec.c.c.f63761b;
                    cVar3.a("DmtSec", "init createSecCaptchaTime = " + (currentTimeMillis6 - currentTimeMillis5));
                }
                a aVar4 = a.f63724f;
                a.f63720b = true;
                a.a();
            }
            return Unit.INSTANCE;
        }
    }

    private a() {
    }

    static {
        try {
            n.a(GlobalContext.getContext(), "cms");
        } catch (Exception unused) {
        }
    }

    @JvmStatic
    public static final void a() {
        if (PatchProxy.isSupport(new Object[0], null, f63719a, true, 71080, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f63719a, true, 71080, new Class[0], Void.TYPE);
            return;
        }
        if (l || m) {
            String str = h;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("currentDid");
            }
            String str2 = i;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("currentIid");
            }
            if (l) {
                str = j;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("targetDid");
                }
                l = false;
            }
            if (m) {
                str2 = k;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("targetIid");
                }
                m = false;
            }
            a(str, str2);
        }
        synchronized (f63724f) {
            ArrayList<String> arrayList = g;
            if (!(!g.isEmpty())) {
                arrayList = null;
            }
            if (arrayList != null) {
                Iterator<String> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String next = it2.next();
                    Intrinsics.checkExpressionValueIsNotNull(next, "report");
                    a(next);
                }
            }
        }
    }

    @JvmStatic
    public static final boolean b(@NotNull String str) {
        boolean z;
        String str2 = str;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f63719a, true, 71085, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f63719a, true, 71085, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, PushConstants.WEB_URL);
        if (f63720b) {
            c cVar = f63722d;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("captcha");
            }
            if (PatchProxy.isSupport(new Object[]{str2}, cVar, c.f63741a, false, 71137, new Class[]{String.class}, Boolean.TYPE)) {
                c cVar2 = cVar;
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, cVar2, c.f63741a, false, 71137, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            } else {
                Intrinsics.checkParameterIsNotNull(str2, PushConstants.WEB_URL);
                com.ss.android.ugc.aweme.sec.c.a aVar = com.ss.android.ugc.aweme.sec.c.a.f63757b;
                if (PatchProxy.isSupport(new Object[]{str2}, aVar, com.ss.android.ugc.aweme.sec.c.a.f63756a, false, 71143, new Class[]{String.class}, Boolean.TYPE)) {
                    com.ss.android.ugc.aweme.sec.c.a aVar2 = aVar;
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, aVar2, com.ss.android.ugc.aweme.sec.c.a.f63756a, false, 71143, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
                } else {
                    Intrinsics.checkParameterIsNotNull(str2, PushConstants.WEB_URL);
                    CharSequence charSequence = str2;
                    if (charSequence.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z || (!StringsKt.contains$default(charSequence, (CharSequence) "/passport/", false, 2, (Object) null) && !StringsKt.contains$default(charSequence, (CharSequence) "/login/", false, 2, (Object) null))) {
                        return false;
                    }
                }
            }
        } else {
            z2 = false;
        }
        return z2;
    }

    @JvmStatic
    public static final synchronized void a(@NotNull String str) {
        String str2 = str;
        synchronized (a.class) {
            if (PatchProxy.isSupport(new Object[]{str2}, null, f63719a, true, 71084, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2}, null, f63719a, true, 71084, new Class[]{String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str2, "scene");
            com.ss.android.ugc.aweme.sec.c.c cVar = com.ss.android.ugc.aweme.sec.c.c.f63761b;
            cVar.a("DmtSec", "report .... scene = " + str2 + ", initSuccess = " + f63720b);
            if (f63720b) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!str2.equals("cold_start")) {
                    com.ss.android.ugc.aweme.sec.b.a aVar = f63723e;
                    if (aVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("report");
                    }
                    if (PatchProxy.isSupport(new Object[]{str2}, aVar, com.ss.android.ugc.aweme.sec.b.a.f63752a, false, 71142, new Class[]{String.class}, Void.TYPE)) {
                        com.ss.android.ugc.aweme.sec.b.a aVar2 = aVar;
                        PatchProxy.accessDispatch(new Object[]{str2}, aVar2, com.ss.android.ugc.aweme.sec.b.a.f63752a, false, 71142, new Class[]{String.class}, Void.TYPE);
                    } else {
                        Intrinsics.checkParameterIsNotNull(str2, "scene");
                        com.ss.android.ugc.aweme.sec.c.c cVar2 = com.ss.android.ugc.aweme.sec.c.c.f63761b;
                        cVar2.a("DataReport", "report .... scene = " + str2);
                        ISdk iSdk = aVar.f63753b;
                        if (iSdk != null) {
                            iSdk.reportNow(str2);
                        }
                    }
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                com.ss.android.ugc.aweme.sec.c.c cVar3 = com.ss.android.ugc.aweme.sec.c.c.f63761b;
                cVar3.a("DmtSec", "report time = " + (currentTimeMillis2 - currentTimeMillis));
                return;
            }
            g.add(str2);
        }
    }

    @JvmStatic
    public static final void a(@NotNull String str, @NotNull String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f63719a, true, 71083, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f63719a, true, 71083, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str3, "deviceId");
        Intrinsics.checkParameterIsNotNull(str4, "iid");
        if (f63720b) {
            h = str3;
            i = str4;
            long currentTimeMillis = System.currentTimeMillis();
            ISdk iSdk = f63721c;
            if (iSdk != null) {
                iSdk.setParams(str3, str4);
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            com.ss.android.ugc.aweme.sec.c.c cVar = com.ss.android.ugc.aweme.sec.c.c.f63761b;
            cVar.a("DmtSec", "updateDeviceIdAndInstallId setParamsTime = " + (currentTimeMillis2 - currentTimeMillis) + ", deviceId = " + str3 + ", iid = " + str4);
            c cVar2 = f63722d;
            if (cVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("captcha");
            }
            cVar2.a(str3, str4);
            return;
        }
        k = str4;
        j = str3;
        m = true;
        l = true;
    }

    @JvmStatic
    public static final void a(int i2, @NotNull Activity activity, @NotNull g gVar) {
        Activity activity2 = activity;
        g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), activity2, gVar2}, null, f63719a, true, 71087, new Class[]{Integer.TYPE, Activity.class, g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), activity2, gVar2}, null, f63719a, true, 71087, new Class[]{Integer.TYPE, Activity.class, g.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(gVar2, "listener");
        if (f63720b) {
            long currentTimeMillis = System.currentTimeMillis();
            c cVar = f63722d;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("captcha");
            }
            cVar.a(i2, activity2, gVar2);
            long currentTimeMillis2 = System.currentTimeMillis();
            com.ss.android.ugc.aweme.sec.c.c cVar2 = com.ss.android.ugc.aweme.sec.c.c.f63761b;
            cVar2.a("DmtSec", "popCaptcha time = " + (currentTimeMillis2 - currentTimeMillis));
        }
    }
}
