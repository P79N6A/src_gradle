package com.ss.android.ugc.aweme.main.e;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.antiaddic.lock.entity.TeenageModeSetting;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.d.c;
import com.ss.android.ugc.aweme.fe.method.BroadcastMethod;
import com.ss.android.ugc.aweme.feed.f.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.bm;
import com.ss.android.ugc.aweme.utils.bg;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0019H\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/main/guidemanager/TeenagerDialog;", "Lcom/ss/android/ugc/aweme/main/dialogmanager/IHomeDialog;", "()V", "hasCome", "", "mAntiAddictiveChecked", "mCheckMinor", "mCheckPass", "mIsLogin", "mPushSettingDone", "mToutiaoSettingDone", "shouldShow", "checkForceMinor", "", "doAntiProcess", "getLevel", "", "onBroadCastEvent", "event", "Lcom/ss/android/ugc/aweme/fe/method/BroadcastMethod$JsBroadCastEvent;", "onPushSettingDone", "Lcom/ss/android/ugc/aweme/antiaddic/event/TeenModePushSettingDoneEvent;", "onToutiaoSettingDoneEvent", "Lcom/ss/android/ugc/aweme/antiaddic/event/TeenModeToutiaoSettingDoneEvent;", "onVideoPageChangeEvent", "Lcom/ss/android/ugc/aweme/feed/event/OnVideoPageChangeEvent;", "activity", "Landroid/app/Activity;", "show", "dismisListener", "Lcom/ss/android/ugc/aweme/main/dialogmanager/IHomeDialog$DialogDismissListener;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d implements com.ss.android.ugc.aweme.main.dialogmanager.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3546a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f3547b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3548c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3549d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3550e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3551f;
    private boolean g;
    private boolean h;
    private boolean i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54727a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f54728b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WeakReference f54729c;

        a(d dVar, WeakReference weakReference) {
            this.f54728b = dVar;
            this.f54729c = weakReference;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f54727a, false, 58132, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f54727a, false, 58132, new Class[0], Void.TYPE);
                return;
            }
            Activity activity = (Activity) this.f54729c.get();
            if (activity != null) {
                d dVar = this.f54728b;
                if (activity == null) {
                    Intrinsics.throwNpe();
                }
                dVar.a(activity);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54730a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WeakReference f54731b;

        b(WeakReference weakReference) {
            this.f54731b = weakReference;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f54730a, false, 58133, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f54730a, false, 58133, new Class[0], Void.TYPE);
                return;
            }
            Activity activity = (Activity) this.f54731b.get();
            if (activity != null) {
                if (activity == null) {
                    Intrinsics.throwNpe();
                }
                if (!activity.isFinishing()) {
                    c.b((Context) activity);
                }
            }
        }
    }

    public final int a() {
        return 250;
    }

    public d() {
        bg.c(this);
        IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
        this.f3550e = a2.isLogin();
    }

    private final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3546a, false, 58126, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3546a, false, 58126, new Class[0], Void.TYPE);
        } else if (this.g && this.f3548c) {
            bg.d(this);
            this.h = true;
        }
    }

    private final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f3546a, false, 58130, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3546a, false, 58130, new Class[0], Void.TYPE);
        } else if (!this.f3547b || !this.f3549d || this.f3551f) {
            IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
            if (!a2.isLogin()) {
                this.g = true;
                b();
            }
        } else {
            this.f3551f = true;
            IAccountUserService a3 = com.ss.android.ugc.aweme.account.d.a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "AccountUserProxyService.get()");
            if (!a3.isLogin() || !com.ss.android.ugc.aweme.antiaddic.lock.c.f33443d.d() || TimeLockRuler.isContentFilterOn() || TimeLockRuler.isTimeLockOn() || TimeLockRuler.isParentalPlatformOn()) {
                IAccountUserService a4 = com.ss.android.ugc.aweme.account.d.a();
                Intrinsics.checkExpressionValueIsNotNull(a4, "AccountUserProxyService.get()");
                if (a4.isLogin() && TimeLockRuler.isContentFilterOn() && !com.ss.android.ugc.aweme.antiaddic.lock.c.f33443d.d()) {
                    x a5 = x.a();
                    Intrinsics.checkExpressionValueIsNotNull(a5, "CommonSharePrefCache.inst()");
                    an<Boolean> l = a5.l();
                    Intrinsics.checkExpressionValueIsNotNull(l, "CommonSharePrefCache.inst().isForceMinor");
                    Object c2 = l.c();
                    Intrinsics.checkExpressionValueIsNotNull(c2, "CommonSharePrefCache.inst().isForceMinor.cache");
                    if (((Boolean) c2).booleanValue()) {
                        x a6 = x.a();
                        Intrinsics.checkExpressionValueIsNotNull(a6, "CommonSharePrefCache.inst()");
                        an<Boolean> l2 = a6.l();
                        Intrinsics.checkExpressionValueIsNotNull(l2, "CommonSharePrefCache.inst().isForceMinor");
                        l2.a(Boolean.FALSE);
                        com.bytedance.ies.dmt.ui.d.a.a(com.ss.android.ugc.aweme.base.utils.d.a(), (int) C0906R.string.bzz).a();
                        com.ss.android.ugc.aweme.antiaddic.lock.d.a();
                        return;
                    }
                }
                if (!this.f3550e) {
                    IAccountUserService a7 = com.ss.android.ugc.aweme.account.d.a();
                    Intrinsics.checkExpressionValueIsNotNull(a7, "AccountUserProxyService.get()");
                    if (a7.isLogin()) {
                        IAccountUserService a8 = com.ss.android.ugc.aweme.account.d.a();
                        Intrinsics.checkExpressionValueIsNotNull(a8, "AccountUserProxyService.get()");
                        this.f3550e = a8.isLogin();
                        return;
                    }
                }
                this.g = true;
                b();
                return;
            }
            x a9 = x.a();
            Intrinsics.checkExpressionValueIsNotNull(a9, "CommonSharePrefCache.inst()");
            a9.l().a(Boolean.TRUE);
            x a10 = x.a();
            Intrinsics.checkExpressionValueIsNotNull(a10, "CommonSharePrefCache.inst()");
            a10.m().a(Boolean.TRUE);
            com.ss.android.ugc.aweme.antiaddic.lock.d.a();
            com.bytedance.ies.dmt.ui.d.a.a(com.ss.android.ugc.aweme.base.utils.d.a(), (int) C0906R.string.c00).a();
        }
    }

    @Subscribe(a = ThreadMode.MAIN, b = true)
    public final void onPushSettingDone(@NotNull com.ss.android.ugc.aweme.antiaddic.b.b bVar) {
        com.ss.android.ugc.aweme.antiaddic.b.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f3546a, false, 58129, new Class[]{com.ss.android.ugc.aweme.antiaddic.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f3546a, false, 58129, new Class[]{com.ss.android.ugc.aweme.antiaddic.b.b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar2, "event");
        this.f3549d = true;
        c();
    }

    @Subscribe(a = ThreadMode.MAIN, b = true)
    public final void onToutiaoSettingDoneEvent(@NotNull com.ss.android.ugc.aweme.antiaddic.b.c cVar) {
        com.ss.android.ugc.aweme.antiaddic.b.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f3546a, false, 58128, new Class[]{com.ss.android.ugc.aweme.antiaddic.b.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f3546a, false, 58128, new Class[]{com.ss.android.ugc.aweme.antiaddic.b.c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cVar2, "event");
        this.f3547b = true;
        c();
    }

    @Subscribe
    public final void onVideoPageChangeEvent(@NotNull ac acVar) {
        if (PatchProxy.isSupport(new Object[]{acVar}, this, f3546a, false, 58131, new Class[]{ac.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{acVar}, this, f3546a, false, 58131, new Class[]{ac.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(acVar, "event");
        if (acVar.f45277a != null) {
            Aweme aweme = acVar.f45277a;
            Intrinsics.checkExpressionValueIsNotNull(aweme, "event.mAweme");
            if (aweme.getAuthor() != null && !((bm) com.ss.android.ugc.aweme.base.sharedpref.c.a(com.ss.android.ugc.aweme.base.utils.d.a(), bm.class)).p(true) && !this.f3548c && !com.ss.android.ugc.aweme.commercialize.utils.c.Q(acVar.f45277a)) {
                this.f3548c = true;
                b();
            }
        }
    }

    public final boolean a(@NotNull Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f3546a, false, 58124, new Class[]{Activity.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity}, this, f3546a, false, 58124, new Class[]{Activity.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
        if (!this.h && !this.i) {
            this.i = true;
            new Handler().postDelayed(new a(this, new WeakReference(activity)), TimeUnit.SECONDS.toMillis(3));
        }
        Context context = activity;
        if (com.ss.android.ugc.aweme.setting.e.a.f63954b.b(context) || com.ss.android.ugc.aweme.setting.e.a.f63954b.a(context) || (!com.ss.android.ugc.aweme.setting.e.a.f63954b.b(context) && !com.ss.android.ugc.aweme.setting.e.a.f63954b.a(context) && c.a(context))) {
            return true;
        }
        return false;
    }

    @Subscribe(a = ThreadMode.MAIN)
    public final void onBroadCastEvent(@NotNull BroadcastMethod.a aVar) {
        JSONObject jSONObject;
        BroadcastMethod.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f3546a, false, 58127, new Class[]{BroadcastMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f3546a, false, 58127, new Class[]{BroadcastMethod.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "event");
        com.ss.android.ugc.aweme.setting.e.a aVar3 = com.ss.android.ugc.aweme.setting.e.a.f63954b;
        if (PatchProxy.isSupport(new Object[]{aVar2}, aVar3, com.ss.android.ugc.aweme.setting.e.a.f63953a, false, 72887, new Class[]{BroadcastMethod.a.class}, Void.TYPE)) {
            com.ss.android.ugc.aweme.setting.e.a aVar4 = aVar3;
            PatchProxy.accessDispatch(new Object[]{aVar2}, aVar4, com.ss.android.ugc.aweme.setting.e.a.f63953a, false, 72887, new Class[]{BroadcastMethod.a.class}, Void.TYPE);
            return;
        }
        if (aVar2 != null) {
            jSONObject = aVar2.f44432b;
        } else {
            jSONObject = null;
        }
        if (jSONObject != null) {
            String string = aVar2.f44432b.getString("eventName");
            try {
                if (TextUtils.equals("reset_teen_protection", string)) {
                    x a2 = x.a();
                    Intrinsics.checkExpressionValueIsNotNull(a2, "CommonSharePrefCache.inst()");
                    an<Boolean> l = a2.l();
                    Intrinsics.checkExpressionValueIsNotNull(l, "CommonSharePrefCache.inst().isForceMinor");
                    Object c2 = l.c();
                    Intrinsics.checkExpressionValueIsNotNull(c2, "CommonSharePrefCache.inst().isForceMinor.cache");
                    if (((Boolean) c2).booleanValue()) {
                        x a3 = x.a();
                        Intrinsics.checkExpressionValueIsNotNull(a3, "CommonSharePrefCache.inst()");
                        an<Boolean> l2 = a3.l();
                        Intrinsics.checkExpressionValueIsNotNull(l2, "CommonSharePrefCache.inst().isForceMinor");
                        l2.a(Boolean.FALSE);
                    }
                    String string2 = aVar2.f44432b.getJSONObject("data").getString("type");
                    String string3 = aVar2.f44432b.getJSONObject("data").getString("enter_from");
                    if (TextUtils.equals(string2, "reset")) {
                        TimeLockRuler.removeUserSettingWithoutNotify();
                        com.ss.android.ugc.aweme.antiaddic.lock.c.f33443d.g();
                        if (com.ss.android.ugc.aweme.antiaddic.lock.d.c()) {
                            com.ss.android.ugc.aweme.antiaddic.lock.d.a(false);
                        }
                    } else if (TextUtils.equals(string2, "appeal")) {
                        com.ss.android.ugc.aweme.antiaddic.lock.c cVar = com.ss.android.ugc.aweme.antiaddic.lock.c.f33443d;
                        if (PatchProxy.isSupport(new Object[]{(byte) 0}, cVar, com.ss.android.ugc.aweme.antiaddic.lock.c.f33440a, false, 21770, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                            com.ss.android.ugc.aweme.antiaddic.lock.c cVar2 = cVar;
                            PatchProxy.accessDispatch(new Object[]{(byte) 0}, cVar2, com.ss.android.ugc.aweme.antiaddic.lock.c.f33440a, false, 21770, new Class[]{Boolean.TYPE}, Void.TYPE);
                        } else if (cVar.e()) {
                            TeenageModeSetting teenageModeSetting = com.ss.android.ugc.aweme.antiaddic.lock.c.f33441b;
                            if (teenageModeSetting != null) {
                                teenageModeSetting.setMinor(false);
                            }
                            cVar.a(com.ss.android.ugc.aweme.antiaddic.lock.c.f33441b);
                        }
                    }
                    if (TextUtils.equals(string3, "teen_mode")) {
                        com.bytedance.ies.dmt.ui.d.a.a(com.ss.android.ugc.aweme.base.utils.d.a(), (int) C0906R.string.bzz).a();
                    }
                }
                if (TextUtils.equals("reset_teen_protection", string)) {
                    com.ss.android.ugc.aweme.account.d.a().updateMinor(false);
                    com.ss.android.ugc.aweme.antiaddic.lock.d.a();
                }
            } catch (Exception unused) {
                if (TextUtils.equals("reset_teen_protection", string)) {
                    com.ss.android.ugc.aweme.account.d.a().updateMinor(false);
                    com.ss.android.ugc.aweme.antiaddic.lock.d.a();
                }
            } catch (Throwable th) {
                if (TextUtils.equals("reset_teen_protection", string)) {
                    com.ss.android.ugc.aweme.account.d.a().updateMinor(false);
                    com.ss.android.ugc.aweme.antiaddic.lock.d.a();
                }
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01e8, code lost:
        if (((java.lang.Boolean) r3).booleanValue() != false) goto L_0x02c9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.NotNull android.app.Activity r20, @org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.main.dialogmanager.b.a r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f3546a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.app.Activity> r4 = android.app.Activity.class
            r8[r10] = r4
            java.lang.Class<com.ss.android.ugc.aweme.main.dialogmanager.b$a> r4 = com.ss.android.ugc.aweme.main.dialogmanager.b.a.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 58125(0xe30d, float:8.145E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0047
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f3546a
            r15 = 0
            r16 = 58125(0xe30d, float:8.145E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r0[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.main.dialogmanager.b$a> r1 = com.ss.android.ugc.aweme.main.dialogmanager.b.a.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0047:
            java.lang.String r2 = "activity"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
            java.lang.String r2 = "dismisListener"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.setting.e.a r1 = com.ss.android.ugc.aweme.setting.e.a.f63954b
            r2 = r0
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object[] r3 = new java.lang.Object[r11]
            r3[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.setting.e.a.f63953a
            r6 = 0
            r7 = 72882(0x11cb2, float:1.0213E-40)
            java.lang.Class[] r8 = new java.lang.Class[r11]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r4 = r1
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x008d
            java.lang.Object[] r3 = new java.lang.Object[r11]
            r3[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.setting.e.a.f63953a
            r6 = 0
            r7 = 72882(0x11cb2, float:1.0213E-40)
            java.lang.Class[] r8 = new java.lang.Class[r11]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r4 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L_0x0093
        L_0x008d:
            java.lang.String r1 = "context"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r1)
            r1 = 0
        L_0x0093:
            if (r1 != 0) goto L_0x02f2
            com.ss.android.ugc.aweme.setting.e.a r1 = com.ss.android.ugc.aweme.setting.e.a.f63954b
            java.lang.Object[] r3 = new java.lang.Object[r11]
            r3[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.setting.e.a.f63953a
            r6 = 0
            r7 = 72884(0x11cb4, float:1.02132E-40)
            java.lang.Class[] r8 = new java.lang.Class[r11]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r4 = r1
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x00cf
            java.lang.Object[] r3 = new java.lang.Object[r11]
            r3[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.setting.e.a.f63953a
            r6 = 0
            r7 = 72884(0x11cb4, float:1.02132E-40)
            java.lang.Class[] r8 = new java.lang.Class[r11]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r4 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r10 = r1.booleanValue()
            goto L_0x02c9
        L_0x00cf:
            java.lang.String r3 = "context"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r3)
            com.ss.android.ugc.aweme.app.x r3 = com.ss.android.ugc.aweme.app.x.a()
            java.lang.String r4 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            com.ss.android.ugc.aweme.app.an r3 = r3.q()
            java.lang.String r4 = "CommonSharePrefCache.ins….teensModeDialogShowTimes"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            java.lang.Object r3 = r3.c()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            com.ss.android.ugc.aweme.app.x r4 = com.ss.android.ugc.aweme.app.x.a()
            java.lang.String r5 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            com.ss.android.ugc.aweme.app.an r4 = r4.s()
            java.lang.String r5 = "CommonSharePrefCache.inst().teensModeAlertCount"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            java.lang.Object r4 = r4.c()
            java.lang.String r5 = "CommonSharePrefCache.ins…teensModeAlertCount.cache"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            int r3 = kotlin.jvm.internal.Intrinsics.compare((int) r3, (int) r4)
            if (r3 < 0) goto L_0x0119
            goto L_0x02c9
        L_0x0119:
            boolean r3 = com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isContentFilterOn()
            if (r3 != 0) goto L_0x02c9
            boolean r3 = com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isTimeLockOn()
            if (r3 != 0) goto L_0x02c9
            com.ss.android.ugc.aweme.antiaddic.lock.b r3 = com.ss.android.ugc.aweme.antiaddic.lock.b.f33436b
            com.ss.android.ugc.aweme.antiaddic.lock.b$a r3 = r3.b()
            com.ss.android.ugc.aweme.antiaddic.lock.b$a r4 = com.ss.android.ugc.aweme.antiaddic.lock.b.a.CHILD
            if (r3 == r4) goto L_0x02c9
            com.ss.android.ugc.aweme.antiaddic.lock.b r3 = com.ss.android.ugc.aweme.antiaddic.lock.b.f33436b
            com.ss.android.ugc.aweme.antiaddic.lock.b$a r3 = r3.b()
            com.ss.android.ugc.aweme.antiaddic.lock.b$a r4 = com.ss.android.ugc.aweme.antiaddic.lock.b.a.PARENT
            if (r3 != r4) goto L_0x013b
            goto L_0x02c9
        L_0x013b:
            com.ss.android.ugc.aweme.app.x r3 = com.ss.android.ugc.aweme.app.x.a()
            java.lang.String r4 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            com.ss.android.ugc.aweme.app.an r3 = r3.t()
            java.lang.String r4 = "CommonSharePrefCache.ins…teensModeMatchAlertSwitch"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            java.lang.Object r3 = r3.c()
            java.lang.String r4 = "CommonSharePrefCache.ins…odeMatchAlertSwitch.cache"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x01ec
            com.ss.android.ugc.aweme.app.x r3 = com.ss.android.ugc.aweme.app.x.a()
            java.lang.String r4 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            com.ss.android.ugc.aweme.app.an r3 = r3.C()
            java.lang.String r4 = "CommonSharePrefCache.inst().hasOpenTeenMode"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            java.lang.Object r3 = r3.c()
            java.lang.String r4 = "CommonSharePrefCache.inst().hasOpenTeenMode.cache"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x02c9
            com.ss.android.ugc.aweme.app.x r3 = com.ss.android.ugc.aweme.app.x.a()
            java.lang.String r4 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            com.ss.android.ugc.aweme.app.an r3 = r3.p()
            java.lang.String r4 = "CommonSharePrefCache.inst().hadOpenTimeLock"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            java.lang.Object r3 = r3.c()
            java.lang.String r4 = "CommonSharePrefCache.inst().hadOpenTimeLock.cache"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x02c9
            com.ss.android.ugc.aweme.app.x r3 = com.ss.android.ugc.aweme.app.x.a()
            java.lang.String r4 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            com.ss.android.ugc.aweme.app.an r3 = r3.o()
            java.lang.String r4 = "CommonSharePrefCache.inst().hadOpenParentCare"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            java.lang.Object r3 = r3.c()
            java.lang.String r4 = "CommonSharePrefCache.ins…).hadOpenParentCare.cache"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x02c9
            com.ss.android.ugc.aweme.app.x r3 = com.ss.android.ugc.aweme.app.x.a()
            java.lang.String r4 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            com.ss.android.ugc.aweme.app.an r3 = r3.n()
            java.lang.String r4 = "CommonSharePrefCache.ins….hadEnterDigitalWellbeing"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            java.lang.Object r3 = r3.c()
            java.lang.String r4 = "CommonSharePrefCache.ins…terDigitalWellbeing.cache"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x01ec
            goto L_0x02c9
        L_0x01ec:
            com.ss.android.ugc.aweme.app.x r3 = com.ss.android.ugc.aweme.app.x.a()
            java.lang.String r4 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            com.ss.android.ugc.aweme.app.an r3 = r3.r()
            java.lang.String r4 = "CommonSharePrefCache.ins…nsModeDialogLastShownTime"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            java.lang.Object r3 = r3.c()
            java.lang.String r4 = "CommonSharePrefCache.ins…DialogLastShownTime.cache"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            java.lang.Number r3 = (java.lang.Number) r3
            long r4 = r3.longValue()
            long r6 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.setting.AbTestManager r3 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r8 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r8)
            int r3 = r3.u()
            int r8 = r3 + 1
            r3 = r1
            boolean r1 = r3.a(r4, r6, r8)
            if (r1 != 0) goto L_0x0229
            goto L_0x02c9
        L_0x0229:
            com.ss.android.ugc.aweme.app.x r1 = com.ss.android.ugc.aweme.app.x.a()
            java.lang.String r3 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            com.ss.android.ugc.aweme.app.an r1 = r1.q()
            java.lang.String r3 = "CommonSharePrefCache.ins….teensModeDialogShowTimes"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            com.ss.android.ugc.aweme.app.x r3 = com.ss.android.ugc.aweme.app.x.a()
            java.lang.String r4 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            com.ss.android.ugc.aweme.app.an r3 = r3.q()
            java.lang.String r4 = "CommonSharePrefCache.ins….teensModeDialogShowTimes"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            java.lang.Object r3 = r3.c()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            int r3 = r3 + r11
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.a(r3)
            com.ss.android.ugc.aweme.app.x r1 = com.ss.android.ugc.aweme.app.x.a()
            java.lang.String r3 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            com.ss.android.ugc.aweme.app.an r1 = r1.r()
            java.lang.String r3 = "CommonSharePrefCache.ins…nsModeDialogLastShownTime"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.a(r3)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r2)
            r3 = 2131689890(0x7f0f01a2, float:1.9008808E38)
            r4 = 0
            android.view.View r1 = r1.inflate(r3, r4)
            r3 = 2131167960(0x7f070ad8, float:1.7950208E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            java.lang.String r4 = "teen_mode_alert"
            com.ss.android.ugc.aweme.app.d.d r5 = new com.ss.android.ugc.aweme.app.d.d
            r5.<init>()
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r4, (java.util.Map) r5)
            com.bytedance.ies.dmt.ui.b.a$a r4 = new com.bytedance.ies.dmt.ui.b.a$a
            r4.<init>(r2)
            r5 = 2130840136(0x7f020a48, float:1.7285302E38)
            com.bytedance.ies.dmt.ui.b.a$a r4 = r4.c(r5)
            com.bytedance.ies.dmt.ui.b.a$a r1 = r4.a((android.view.View) r1)
            r4 = 2131560336(0x7f0d0790, float:1.8746041E38)
            com.ss.android.ugc.aweme.setting.e.a$d r5 = com.ss.android.ugc.aweme.setting.e.a.d.f63969b
            android.content.DialogInterface$OnClickListener r5 = (android.content.DialogInterface.OnClickListener) r5
            com.bytedance.ies.dmt.ui.b.a$a r1 = r1.a((int) r4, (android.content.DialogInterface.OnClickListener) r5)
            com.bytedance.ies.dmt.ui.b.a r1 = r1.a()
            com.ss.android.ugc.aweme.setting.e.a$c r4 = new com.ss.android.ugc.aweme.setting.e.a$c
            r4.<init>(r1, r3, r2)
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r1 = 1000(0x3e8, float:1.401E-42)
            com.ss.android.b.a.a.a.a(r4, r1)
            r10 = 1
        L_0x02c9:
            if (r10 != 0) goto L_0x02f2
            boolean r1 = com.ss.android.ugc.aweme.main.cb.a()
            if (r1 == 0) goto L_0x02da
            com.ss.android.ugc.aweme.main.cb r0 = new com.ss.android.ugc.aweme.main.cb
            r0.<init>(r2)
            r0.show()
            return
        L_0x02da:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            com.ss.android.ugc.aweme.main.e.d$b r0 = new com.ss.android.ugc.aweme.main.e.d$b
            r0.<init>(r1)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r2 = 3
            long r1 = r1.toMillis(r2)
            int r1 = (int) r1
            com.ss.android.b.a.a.a.a(r0, r1)
        L_0x02f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.e.d.a(android.app.Activity, com.ss.android.ugc.aweme.main.dialogmanager.b$a):void");
    }
}
