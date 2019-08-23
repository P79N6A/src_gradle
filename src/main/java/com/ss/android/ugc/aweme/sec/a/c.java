package com.ss.android.ugc.aweme.sec.a;

import a.i;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.sec.g;
import com.ss.sys.ck.SCCheckUtils;
import java.lang.ref.SoftReference;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001$B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0013\u001a\u00020\u000eJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aJ\u001e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006%"}, d2 = {"Lcom/ss/android/ugc/aweme/sec/captcha/SecCaptcha;", "", "context", "Landroid/content/Context;", "params", "Lcom/ss/android/ugc/aweme/sec/captcha/CaptchaParams;", "(Landroid/content/Context;Lcom/ss/android/ugc/aweme/sec/captcha/CaptchaParams;)V", "getContext", "()Landroid/content/Context;", "contextRef", "Ljava/lang/ref/SoftReference;", "getParams", "()Lcom/ss/android/ugc/aweme/sec/captcha/CaptchaParams;", "ssChecker", "Lcom/ss/sys/ck/SCCheckUtils;", "getSsChecker", "()Lcom/ss/sys/ck/SCCheckUtils;", "ssChecker$delegate", "Lkotlin/Lazy;", "initSCCheckUtil", "isCaptchaUrl", "", "url", "", "needVerifyImage", "errorCode", "", "popCaptcha", "", "activity", "Landroid/app/Activity;", "listener", "Lcom/ss/android/ugc/aweme/sec/SecCaptchaListener;", "updateDeviceIdAndInstallId", "deviceId", "iid", "Companion", "network_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63741a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f63742b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(c.class), "ssChecker", "getSsChecker()Lcom/ss/sys/ck/SCCheckUtils;"))};

    /* renamed from: f  reason: collision with root package name */
    public static final a f63743f = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    final SoftReference<Context> f63744c = new SoftReference<>(this.f63745d);
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final Context f63745d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final a f63746e;
    private final Lazy g = LazyKt.lazy(new C0690c(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/sec/captcha/SecCaptcha$Companion;", "", "()V", "ERROR_CODE_LOGIN", "", "ERROR_CODE_LOGINB", "ERROR_CODE_VERIFY_A", "ERROR_CODE_VERIFY_B", "network_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    static final class b<V> implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63747a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f63748b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f63749c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Activity f63750d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f63751e;

        b(c cVar, int i, Activity activity, b bVar) {
            this.f63748b = cVar;
            this.f63749c = i;
            this.f63750d = activity;
            this.f63751e = bVar;
        }

        public final /* synthetic */ Object call() {
            if (PatchProxy.isSupport(new Object[0], this, f63747a, false, 71140, new Class[0], Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[0], this, f63747a, false, 71140, new Class[0], Void.class);
            }
            this.f63748b.f63746e.i = this.f63749c;
            this.f63748b.a().popupCheckCode(this.f63750d, this.f63748b.f63746e.h, this.f63748b.f63746e.i, this.f63751e);
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/sys/ck/SCCheckUtils;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.sec.a.c$c  reason: collision with other inner class name */
    static final class C0690c extends Lambda implements Function0<SCCheckUtils> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0690c(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @NotNull
        public final SCCheckUtils invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71141, new Class[0], SCCheckUtils.class)) {
                return (SCCheckUtils) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71141, new Class[0], SCCheckUtils.class);
            }
            c cVar = this.this$0;
            if (PatchProxy.isSupport(new Object[0], cVar, c.f63741a, false, 71136, new Class[0], SCCheckUtils.class)) {
                return (SCCheckUtils) PatchProxy.accessDispatch(new Object[0], cVar, c.f63741a, false, 71136, new Class[0], SCCheckUtils.class);
            }
            a aVar = cVar.f63746e;
            long currentTimeMillis = System.currentTimeMillis();
            SCCheckUtils instance = SCCheckUtils.getInstance(cVar.f63744c.get(), aVar.f63732b, aVar.f63733c, aVar.f63734d, aVar.f63735e, aVar.f63736f, aVar.g);
            long currentTimeMillis2 = System.currentTimeMillis();
            com.ss.android.ugc.aweme.sec.c.c cVar2 = com.ss.android.ugc.aweme.sec.c.c.f63761b;
            cVar2.a("SecCaptcha", "initSCCheckUtil getInstance = " + (currentTimeMillis2 - currentTimeMillis));
            Intrinsics.checkExpressionValueIsNotNull(instance, "checker");
            return instance;
        }
    }

    public final SCCheckUtils a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f63741a, false, 71135, new Class[0], SCCheckUtils.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f63741a, false, 71135, new Class[0], SCCheckUtils.class);
        } else {
            value = this.g.getValue();
        }
        return (SCCheckUtils) value;
    }

    public c(@NotNull Context context, @NotNull a aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        this.f63745d = context;
        this.f63746e = aVar;
    }

    public final void a(@NotNull String str, @NotNull String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f63741a, false, 71139, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f63741a, false, 71139, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str3, "deviceId");
        Intrinsics.checkParameterIsNotNull(str4, "iid");
        this.f63746e.b(str3);
        this.f63746e.a(str4);
        a().updateHttpParams(this.f63746e.f63732b, this.f63746e.f63733c, this.f63746e.f63734d, this.f63746e.f63735e, this.f63746e.f63736f, this.f63746e.g);
    }

    public final void a(int i, @NotNull Activity activity, @NotNull g gVar) {
        Activity activity2 = activity;
        g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), activity2, gVar2}, this, f63741a, false, 71138, new Class[]{Integer.TYPE, Activity.class, g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), activity2, gVar2}, this, f63741a, false, 71138, new Class[]{Integer.TYPE, Activity.class, g.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(gVar2, "listener");
        b a2 = new b(activity2, gVar2).a(a());
        if (TextUtils.isEmpty(this.f63746e.f63735e) && AppLog.getInstallId() != null) {
            a aVar = this.f63746e;
            String installId = AppLog.getInstallId();
            Intrinsics.checkExpressionValueIsNotNull(installId, "AppLog.getInstallId()");
            aVar.a(installId);
            a(this.f63746e.f63736f, this.f63746e.f63735e);
        }
        int i2 = i;
        i.a((Callable<TResult>) new b<TResult>(this, i, activity2, a2), i.f1052b);
    }
}
