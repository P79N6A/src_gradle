package com.ss.android.ugc.aweme.setting.e;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.ui.ai;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.setting.ui.DigitalWellbeingActivity;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/setting/utils/AntiAddictiveUtils;", "", "()V", "DAY", "", "DELAY_TIME", "isDayDiffOverX", "", "last", "", "now", "x", "onBroadCastEvent", "", "event", "Lcom/ss/android/ugc/aweme/fe/method/BroadcastMethod$JsBroadCastEvent;", "shouldShowTeenModeGuideDialog", "context", "Landroid/content/Context;", "shouldShowTeensModeUpdateGuide", "showForceTeensModeOpenedDialog", "showTeenModeGuideDialog", "showTeensModeUpdateGuide", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63953a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f63954b = new a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.setting.e.a$a  reason: collision with other inner class name */
    public static final class C0695a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63955a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.dmt.ui.b.a f63956b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DmtTextView f63957c;

        public C0695a(com.bytedance.ies.dmt.ui.b.a aVar, DmtTextView dmtTextView) {
            this.f63956b = aVar;
            this.f63957c = dmtTextView;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f63955a, false, 72888, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f63955a, false, 72888, new Class[0], Void.TYPE);
                return;
            }
            final Dialog b2 = this.f63956b.b();
            b2.setCanceledOnTouchOutside(false);
            this.f63957c.setOnTouchListener(new ai() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f63958a;

                public final void b(@NotNull View view, @NotNull MotionEvent motionEvent) {
                    View view2 = view;
                    MotionEvent motionEvent2 = motionEvent;
                    if (PatchProxy.isSupport(new Object[]{view2, motionEvent2}, this, f63958a, false, 72889, new Class[]{View.class, MotionEvent.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view2, motionEvent2}, this, f63958a, false, 72889, new Class[]{View.class, MotionEvent.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(view2, "view");
                    Intrinsics.checkParameterIsNotNull(motionEvent2, "event");
                    b.a(b2);
                    com.ss.android.ugc.aweme.antiaddic.lock.d.a("teen_mode", "appeal");
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 15})
    public static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final b f63960a = new b();

        b() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63961a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.dmt.ui.b.a f63962b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ LinearLayout f63963c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f63964d;

        public c(com.bytedance.ies.dmt.ui.b.a aVar, LinearLayout linearLayout, Context context) {
            this.f63962b = aVar;
            this.f63963c = linearLayout;
            this.f63964d = context;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f63961a, false, 72891, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f63961a, false, 72891, new Class[0], Void.TYPE);
                return;
            }
            final Dialog b2 = this.f63962b.b();
            this.f63963c.setOnClickListener(new View.OnClickListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f63965a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ c f63966b;

                {
                    this.f63966b = r1;
                }

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f63965a, false, 72892, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f63965a, false, 72892, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    r.a("teen_mode_alert_click", (Map) new com.ss.android.ugc.aweme.app.d.d().f34114b);
                    IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
                    Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
                    if (!a2.isLogin()) {
                        Context context = this.f63966b.f63964d;
                        if (context != null) {
                            e.a((Activity) (MainActivity) context, "", "teen_mode_alert");
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainActivity");
                    }
                    r.a("enter_wellbeing", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_from", "teen_mode_alert").f34114b);
                    c.a(b2);
                    this.f63966b.f63964d.startActivity(new Intent(this.f63966b.f63964d, DigitalWellbeingActivity.class));
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 15})
    public static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63968a;

        /* renamed from: b  reason: collision with root package name */
        public static final d f63969b = new d();

        d() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f63968a, false, 72894, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f63968a, false, 72894, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            r.a("teen_mode_alert_cancel", (Map) new com.ss.android.ugc.aweme.app.d.d().f34114b);
        }
    }

    public final boolean a(@NotNull Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f63953a, false, 72881, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, this, f63953a, false, 72881, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        return false;
    }

    private a() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0155, code lost:
        if (((java.lang.Boolean) r0).booleanValue() != false) goto L_0x0157;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(@org.jetbrains.annotations.NotNull android.content.Context r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f63953a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r5 = 0
            r6 = 72883(0x11cb3, float:1.02131E-40)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003d
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f63953a
            r13 = 0
            r14 = 72883(0x11cb3, float:1.02131E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003d:
            java.lang.String r2 = "context"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
            com.ss.android.ugc.aweme.app.x r0 = com.ss.android.ugc.aweme.app.x.a()
            java.lang.String r2 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            com.ss.android.ugc.aweme.app.an r0 = r0.q()
            java.lang.String r2 = "CommonSharePrefCache.ins….teensModeDialogShowTimes"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            java.lang.Object r0 = r0.c()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            com.ss.android.ugc.aweme.app.x r2 = com.ss.android.ugc.aweme.app.x.a()
            java.lang.String r3 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            com.ss.android.ugc.aweme.app.an r2 = r2.s()
            java.lang.String r3 = "CommonSharePrefCache.inst().teensModeAlertCount"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.Object r2 = r2.c()
            java.lang.String r3 = "CommonSharePrefCache.ins…teensModeAlertCount.cache"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r0 = kotlin.jvm.internal.Intrinsics.compare((int) r0, (int) r2)
            if (r0 < 0) goto L_0x0086
            return r9
        L_0x0086:
            boolean r0 = com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isContentFilterOn()
            if (r0 != 0) goto L_0x0196
            boolean r0 = com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isTimeLockOn()
            if (r0 != 0) goto L_0x0196
            com.ss.android.ugc.aweme.antiaddic.lock.b r0 = com.ss.android.ugc.aweme.antiaddic.lock.b.f33436b
            com.ss.android.ugc.aweme.antiaddic.lock.b$a r0 = r0.b()
            com.ss.android.ugc.aweme.antiaddic.lock.b$a r2 = com.ss.android.ugc.aweme.antiaddic.lock.b.a.CHILD
            if (r0 == r2) goto L_0x0196
            com.ss.android.ugc.aweme.antiaddic.lock.b r0 = com.ss.android.ugc.aweme.antiaddic.lock.b.f33436b
            com.ss.android.ugc.aweme.antiaddic.lock.b$a r0 = r0.b()
            com.ss.android.ugc.aweme.antiaddic.lock.b$a r2 = com.ss.android.ugc.aweme.antiaddic.lock.b.a.PARENT
            if (r0 != r2) goto L_0x00a8
            goto L_0x0196
        L_0x00a8:
            com.ss.android.ugc.aweme.app.x r0 = com.ss.android.ugc.aweme.app.x.a()
            java.lang.String r2 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            com.ss.android.ugc.aweme.app.an r0 = r0.t()
            java.lang.String r2 = "CommonSharePrefCache.ins…teensModeMatchAlertSwitch"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            java.lang.Object r0 = r0.c()
            java.lang.String r2 = "CommonSharePrefCache.ins…odeMatchAlertSwitch.cache"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0158
            com.ss.android.ugc.aweme.app.x r0 = com.ss.android.ugc.aweme.app.x.a()
            java.lang.String r2 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            com.ss.android.ugc.aweme.app.an r0 = r0.C()
            java.lang.String r2 = "CommonSharePrefCache.inst().hasOpenTeenMode"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            java.lang.Object r0 = r0.c()
            java.lang.String r2 = "CommonSharePrefCache.inst().hasOpenTeenMode.cache"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0157
            com.ss.android.ugc.aweme.app.x r0 = com.ss.android.ugc.aweme.app.x.a()
            java.lang.String r2 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            com.ss.android.ugc.aweme.app.an r0 = r0.p()
            java.lang.String r2 = "CommonSharePrefCache.inst().hadOpenTimeLock"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            java.lang.Object r0 = r0.c()
            java.lang.String r2 = "CommonSharePrefCache.inst().hadOpenTimeLock.cache"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0157
            com.ss.android.ugc.aweme.app.x r0 = com.ss.android.ugc.aweme.app.x.a()
            java.lang.String r2 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            com.ss.android.ugc.aweme.app.an r0 = r0.o()
            java.lang.String r2 = "CommonSharePrefCache.inst().hadOpenParentCare"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            java.lang.Object r0 = r0.c()
            java.lang.String r2 = "CommonSharePrefCache.ins…).hadOpenParentCare.cache"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0157
            com.ss.android.ugc.aweme.app.x r0 = com.ss.android.ugc.aweme.app.x.a()
            java.lang.String r2 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            com.ss.android.ugc.aweme.app.an r0 = r0.n()
            java.lang.String r2 = "CommonSharePrefCache.ins….hadEnterDigitalWellbeing"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            java.lang.Object r0 = r0.c()
            java.lang.String r2 = "CommonSharePrefCache.ins…terDigitalWellbeing.cache"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0158
        L_0x0157:
            return r9
        L_0x0158:
            com.ss.android.ugc.aweme.app.x r0 = com.ss.android.ugc.aweme.app.x.a()
            java.lang.String r2 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            com.ss.android.ugc.aweme.app.an r0 = r0.r()
            java.lang.String r2 = "CommonSharePrefCache.ins…nsModeDialogLastShownTime"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            java.lang.Object r0 = r0.c()
            java.lang.String r2 = "CommonSharePrefCache.ins…DialogLastShownTime.cache"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            java.lang.Number r0 = (java.lang.Number) r0
            long r3 = r0.longValue()
            long r5 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r2 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            int r0 = r0.u()
            int r7 = r0 + 1
            r2 = r17
            boolean r0 = r2.a(r3, r5, r7)
            if (r0 != 0) goto L_0x0195
            return r9
        L_0x0195:
            return r1
        L_0x0196:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.e.a.b(android.content.Context):boolean");
    }

    public final boolean a(long j, long j2, int i) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), Integer.valueOf(i)}, this, f63953a, false, 72886, new Class[]{Long.TYPE, Long.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4), Integer.valueOf(i)}, this, f63953a, false, 72886, new Class[]{Long.TYPE, Long.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j3);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(j4);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Intrinsics.checkExpressionValueIsNotNull(instance, "lastCalendar");
        Date parse = simpleDateFormat.parse(simpleDateFormat.format(instance.getTime()));
        Intrinsics.checkExpressionValueIsNotNull(instance2, "currentCalendar");
        Date parse2 = simpleDateFormat.parse(simpleDateFormat.format(instance2.getTime()));
        Intrinsics.checkExpressionValueIsNotNull(parse2, "dayNow");
        long time = parse2.getTime();
        Intrinsics.checkExpressionValueIsNotNull(parse, "dayLast");
        if (time - parse.getTime() < ((long) (com.ss.android.ugc.aweme.main.guide.a.f54802d * i))) {
            return false;
        }
        return true;
    }
}
