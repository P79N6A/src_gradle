package com.ss.android.ugc.aweme.setting.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.antiaddic.lock.b;
import com.ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.SetTimeLockActivity;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.ex;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\fH\u0014J\u0012\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007J\b\u0010\u0018\u001a\u00020\fH\u0014J\b\u0010\u0019\u001a\u00020\fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/setting/ui/DigitalWellbeingActivity;", "Lcom/ss/android/ugc/aweme/base/activity/AmeBaseActivity;", "()V", "mParentModeSetting", "Lcom/bytedance/ies/dmt/ui/common/views/CommonItemView;", "mTeenagerModeSetting", "mTimeLockSetting", "mTitle", "Lcom/bytedance/ies/dmt/ui/titlebar/ButtonTitleBar;", "getLayout", "", "initSettingItem", "", "initTitle", "initView", "isRegisterEventBus", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onEvent", "setting", "Lcom/ss/android/ugc/aweme/antiaddic/lock/entity/TimeLockUserSetting;", "onResume", "setStatusBarColor", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DigitalWellbeingActivity extends AmeBaseActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3853a;

    /* renamed from: b  reason: collision with root package name */
    private ButtonTitleBar f3854b;

    /* renamed from: c  reason: collision with root package name */
    private CommonItemView f3855c;

    /* renamed from: d  reason: collision with root package name */
    private CommonItemView f3856d;

    /* renamed from: e  reason: collision with root package name */
    private CommonItemView f3857e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64134a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DigitalWellbeingActivity f64135b;

        a(DigitalWellbeingActivity digitalWellbeingActivity) {
            this.f64135b = digitalWellbeingActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f64134a, false, 72462, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f64134a, false, 72462, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            r.a("enter_time_lock", (Map) com.ss.android.ugc.aweme.app.d.d.a().f34114b);
            SetTimeLockActivity.a(this.f64135b, 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64136a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DigitalWellbeingActivity f64137b;

        b(DigitalWellbeingActivity digitalWellbeingActivity) {
            this.f64137b = digitalWellbeingActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f64136a, false, 72463, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f64136a, false, 72463, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            r.a("enter_teen_mode", (Map) com.ss.android.ugc.aweme.app.d.d.a().f34114b);
            SetTimeLockActivity.a(this.f64137b, 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64138a;

        /* renamed from: b  reason: collision with root package name */
        public static final c f64139b = new c();

        c() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x008f, code lost:
            if (r1 == null) goto L_0x0091;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r18) {
            /*
                r17 = this;
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r18
                com.meituan.robust.ChangeQuickRedirect r4 = f64138a
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<android.view.View> r3 = android.view.View.class
                r7[r9] = r3
                java.lang.Class r8 = java.lang.Void.TYPE
                r5 = 0
                r6 = 72464(0x11b10, float:1.01544E-40)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x0034
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r18
                com.meituan.robust.ChangeQuickRedirect r12 = f64138a
                r13 = 0
                r14 = 72464(0x11b10, float:1.01544E-40)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<android.view.View> r0 = android.view.View.class
                r15[r9] = r0
                java.lang.Class r16 = java.lang.Void.TYPE
                r11 = r17
                com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                return
            L_0x0034:
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r18)
                java.lang.String r0 = "enter_kid_platform"
                r2 = 0
                com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r2)
                com.ss.android.ugc.aweme.ag.h r0 = com.ss.android.ugc.aweme.ag.h.a()
                com.ss.android.ugc.aweme.antiaddic.lock.b r3 = com.ss.android.ugc.aweme.antiaddic.lock.b.f33436b
                java.lang.Object[] r10 = new java.lang.Object[r9]
                com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.antiaddic.lock.b.f33435a
                r13 = 0
                r14 = 21737(0x54e9, float:3.046E-41)
                java.lang.Class[] r15 = new java.lang.Class[r9]
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                r11 = r3
                boolean r4 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
                if (r4 == 0) goto L_0x0068
                java.lang.Object[] r10 = new java.lang.Object[r9]
                com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.antiaddic.lock.b.f33435a
                r13 = 0
                r14 = 21737(0x54e9, float:3.046E-41)
                java.lang.Class[] r15 = new java.lang.Class[r9]
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                r11 = r3
                java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                java.lang.String r1 = (java.lang.String) r1
                goto L_0x0095
            L_0x0068:
                com.ss.android.ugc.aweme.app.SharePrefCache r4 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
                java.lang.String r5 = "SharePrefCache.inst()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
                com.ss.android.ugc.aweme.app.an r4 = r4.getGuardianParentScheme()
                java.lang.String r5 = "SharePrefCache.inst().guardianParentScheme"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
                java.lang.Object r4 = r4.c()
                java.lang.String r4 = (java.lang.String) r4
                if (r4 == 0) goto L_0x0091
                r5 = r4
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                boolean r5 = android.text.TextUtils.isEmpty(r5)
                r1 = r1 ^ r5
                if (r1 == 0) goto L_0x008e
                r1 = r4
                goto L_0x008f
            L_0x008e:
                r1 = r2
            L_0x008f:
                if (r1 != 0) goto L_0x0095
            L_0x0091:
                java.lang.String r1 = r3.e()
            L_0x0095:
                r0.a((java.lang.String) r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.ui.DigitalWellbeingActivity.c.onClick(android.view.View):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/setting/ui/DigitalWellbeingActivity$initTitle$1", "Lcom/bytedance/ies/dmt/ui/titlebar/listener/OnTitleBarClickListener;", "onBackClick", "", "view", "Landroid/view/View;", "onEndBtnClick", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64140a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DigitalWellbeingActivity f64141b;

        public final void b(@Nullable View view) {
        }

        d(DigitalWellbeingActivity digitalWellbeingActivity) {
            this.f64141b = digitalWellbeingActivity;
        }

        public final void a(@Nullable View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f64140a, false, 72465, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f64140a, false, 72465, new Class[]{View.class}, Void.TYPE);
                return;
            }
            this.f64141b.onBackPressed();
        }
    }

    public final int a() {
        return C0906R.layout.b3;
    }

    public final boolean isRegisterEventBus() {
        return true;
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3853a, false, 72461, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3853a, false, 72461, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DigitalWellbeingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3853a, false, 72456, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3853a, false, 72456, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public final void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f3853a, false, 72457, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3853a, false, 72457, new Class[0], Void.TYPE);
        } else if (com.ss.android.g.a.b()) {
            ImmersionBar.with((Activity) this).statusBarColor((int) C0906R.color.w1).statusBarDarkFont(true).init();
        } else {
            ImmersionBar.with((Activity) this).statusBarColor((int) C0906R.color.yx).init();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0085, code lost:
        if (((java.lang.Boolean) r2).booleanValue() != false) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f3853a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 72458(0x11b0a, float:1.01535E-40)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f3853a
            r5 = 0
            r6 = 72458(0x11b0a, float:1.01535E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            java.lang.String r1 = "com.ss.android.ugc.aweme.setting.ui.DigitalWellbeingActivity"
            java.lang.String r2 = "onResume"
            r3 = 1
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r1, r2, r3)
            super.onResume()
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r1 = r9.f3855c
            if (r1 != 0) goto L_0x0039
            java.lang.String r2 = "mTimeLockSetting"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0039:
            boolean r2 = com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isTimeLockOn()
            r3 = 2131561512(0x7f0d0c28, float:1.8748427E38)
            r4 = 2131560252(0x7f0d073c, float:1.8745871E38)
            if (r2 == 0) goto L_0x0049
            r2 = 2131560252(0x7f0d073c, float:1.8745871E38)
            goto L_0x004c
        L_0x0049:
            r2 = 2131561512(0x7f0d0c28, float:1.8748427E38)
        L_0x004c:
            java.lang.String r2 = r9.getString(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setRightText(r2)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r1 = r9.f3856d
            if (r1 != 0) goto L_0x005e
            java.lang.String r2 = "mTeenagerModeSetting"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x005e:
            boolean r2 = com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isContentFilterOn()
            if (r2 != 0) goto L_0x0087
            com.ss.android.ugc.aweme.app.x r2 = com.ss.android.ugc.aweme.app.x.a()
            java.lang.String r5 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r5)
            com.ss.android.ugc.aweme.app.an r2 = r2.l()
            java.lang.String r5 = "CommonSharePrefCache.inst().isForceMinor"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r5)
            java.lang.Object r2 = r2.c()
            java.lang.String r5 = "CommonSharePrefCache.inst().isForceMinor.cache"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r5)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x008a
        L_0x0087:
            r3 = 2131560252(0x7f0d073c, float:1.8745871E38)
        L_0x008a:
            java.lang.String r2 = r9.getString(r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setRightText(r2)
            java.lang.String r1 = "com.ss.android.ugc.aweme.setting.ui.DigitalWellbeingActivity"
            java.lang.String r2 = "onResume"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.ui.DigitalWellbeingActivity.onResume():void");
    }

    @Subscribe(a = ThreadMode.MAIN)
    public final void onEvent(@Nullable TimeLockUserSetting timeLockUserSetting) {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[]{timeLockUserSetting}, this, f3853a, false, 72455, new Class[]{TimeLockUserSetting.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{timeLockUserSetting}, this, f3853a, false, 72455, new Class[]{TimeLockUserSetting.class}, Void.TYPE);
            return;
        }
        int i3 = C0906R.string.bin;
        if (timeLockUserSetting != null && !timeLockUserSetting.isNotifyParentModeOnly()) {
            CommonItemView commonItemView = this.f3855c;
            if (commonItemView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTimeLockSetting");
            }
            if (timeLockUserSetting.isTimeLockOn()) {
                i = C0906R.string.alj;
            } else {
                i = C0906R.string.bin;
            }
            commonItemView.setRightText(getString(i));
            CommonItemView commonItemView2 = this.f3856d;
            if (commonItemView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTeenagerModeSetting");
            }
            if (!timeLockUserSetting.isContentFilterOn()) {
                x a2 = x.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "CommonSharePrefCache.inst()");
                an<Boolean> l = a2.l();
                Intrinsics.checkExpressionValueIsNotNull(l, "CommonSharePrefCache.inst().isForceMinor");
                Object c2 = l.c();
                Intrinsics.checkExpressionValueIsNotNull(c2, "CommonSharePrefCache.inst().isForceMinor.cache");
                if (!((Boolean) c2).booleanValue()) {
                    i2 = C0906R.string.bin;
                    commonItemView2.setRightText(getString(i2));
                }
            }
            i2 = C0906R.string.alj;
            commonItemView2.setRightText(getString(i2));
        }
        CommonItemView commonItemView3 = this.f3857e;
        if (commonItemView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mParentModeSetting");
        }
        if (com.ss.android.ugc.aweme.antiaddic.lock.b.f33436b.b() == b.a.PARENT) {
            i3 = C0906R.string.alj;
        }
        commonItemView3.setRightText(getString(i3));
    }

    public final void onCreate(@Nullable Bundle bundle) {
        String str;
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3853a, false, 72451, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3853a, false, 72451, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DigitalWellbeingActivity", "onCreate", true);
        super.onCreate(bundle);
        if (PatchProxy.isSupport(new Object[0], this, f3853a, false, 72452, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3853a, false, 72452, new Class[0], Void.TYPE);
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f3853a, false, 72453, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3853a, false, 72453, new Class[0], Void.TYPE);
            } else {
                View findViewById = findViewById(C0906R.id.d3v);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.title_layout)");
                this.f3854b = (ButtonTitleBar) findViewById;
                ButtonTitleBar buttonTitleBar = this.f3854b;
                if (buttonTitleBar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTitle");
                }
                buttonTitleBar.setTitle((int) C0906R.string.c5u);
                ButtonTitleBar buttonTitleBar2 = this.f3854b;
                if (buttonTitleBar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTitle");
                }
                buttonTitleBar2.setOnTitleBarClickListener(new d(this));
            }
            if (PatchProxy.isSupport(new Object[0], this, f3853a, false, 72454, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3853a, false, 72454, new Class[0], Void.TYPE);
            } else {
                x a2 = x.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "CommonSharePrefCache.inst()");
                an<Boolean> n = a2.n();
                Intrinsics.checkExpressionValueIsNotNull(n, "CommonSharePrefCache.ins….hadEnterDigitalWellbeing");
                n.a(Boolean.TRUE);
                View findViewById2 = findViewById(C0906R.id.a57);
                Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.digital_wellbeing_time_lock)");
                this.f3855c = (CommonItemView) findViewById2;
                CommonItemView commonItemView = this.f3855c;
                if (commonItemView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTimeLockSetting");
                }
                commonItemView.setLeftText(getString(C0906R.string.a5m));
                CommonItemView commonItemView2 = this.f3855c;
                if (commonItemView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTimeLockSetting");
                }
                if (TimeLockRuler.isTimeLockOn()) {
                    str = getString(C0906R.string.alj);
                } else {
                    str = getString(C0906R.string.bin);
                }
                commonItemView2.setRightText(str);
                CommonItemView commonItemView3 = this.f3855c;
                if (commonItemView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTimeLockSetting");
                }
                commonItemView3.setOnClickListener(new a(this));
                View findViewById3 = findViewById(C0906R.id.a56);
                Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.digital_wellbeing_teenager_mode)");
                this.f3856d = (CommonItemView) findViewById3;
                CommonItemView commonItemView4 = this.f3856d;
                if (commonItemView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTeenagerModeSetting");
                }
                commonItemView4.setLeftText(getString(C0906R.string.a5l));
                CommonItemView commonItemView5 = this.f3856d;
                if (commonItemView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTeenagerModeSetting");
                }
                if (TimeLockRuler.isContentFilterOn()) {
                    str2 = getString(C0906R.string.alj);
                } else {
                    str2 = getString(C0906R.string.bin);
                }
                commonItemView5.setRightText(str2);
                CommonItemView commonItemView6 = this.f3856d;
                if (commonItemView6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTeenagerModeSetting");
                }
                commonItemView6.setOnClickListener(new b(this));
                View findViewById4 = findViewById(C0906R.id.a55);
                Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.digital_wellbeing_parent_mode)");
                this.f3857e = (CommonItemView) findViewById4;
                if (com.ss.android.ugc.aweme.antiaddic.lock.b.f33436b.b() != b.a.CLOSE && !ex.b()) {
                    x a3 = x.a();
                    Intrinsics.checkExpressionValueIsNotNull(a3, "CommonSharePrefCache.inst()");
                    an<Boolean> l = a3.l();
                    Intrinsics.checkExpressionValueIsNotNull(l, "CommonSharePrefCache.inst().isForceMinor");
                    Object c2 = l.c();
                    Intrinsics.checkExpressionValueIsNotNull(c2, "CommonSharePrefCache.inst().isForceMinor.cache");
                    if (!((Boolean) c2).booleanValue()) {
                        CommonItemView commonItemView7 = this.f3857e;
                        if (commonItemView7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mParentModeSetting");
                        }
                        commonItemView7.setVisibility(0);
                        CommonItemView commonItemView8 = this.f3857e;
                        if (commonItemView8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mParentModeSetting");
                        }
                        commonItemView8.setLeftText(getString(C0906R.string.a5k));
                        CommonItemView commonItemView9 = this.f3857e;
                        if (commonItemView9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mParentModeSetting");
                        }
                        if (com.ss.android.ugc.aweme.antiaddic.lock.b.f33436b.b() != b.a.NONE) {
                            str3 = getString(C0906R.string.alj);
                        } else {
                            str3 = getString(C0906R.string.bin);
                        }
                        commonItemView9.setRightText(str3);
                        CommonItemView commonItemView10 = this.f3857e;
                        if (commonItemView10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mParentModeSetting");
                        }
                        commonItemView10.setOnClickListener(c.f64139b);
                    }
                }
                CommonItemView commonItemView11 = this.f3857e;
                if (commonItemView11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mParentModeSetting");
                }
                commonItemView11.setVisibility(8);
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DigitalWellbeingActivity", "onCreate", false);
    }
}
