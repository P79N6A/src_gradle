package com.ss.android.ugc.aweme.longvideonew;

import android.app.Activity;
import android.os.Build;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.u.ao;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0014J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\u0012\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0012H\u0014J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0012H\u0014J\b\u0010 \u001a\u00020\u0012H\u0014J\u0012\u0010!\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010#\u001a\u00020\u0012H\u0002J\b\u0010$\u001a\u00020\u0012H\u0014J\b\u0010%\u001a\u00020\u0012H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideonew/LongVideoActivity;", "Lcom/ss/android/ugc/aweme/base/activity/AmeSSActivity;", "()V", "mActivityOnKeyDownListeners", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/base/activity/ActivityOnKeyDownListener;", "mAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "mAwemeId", "", "mEventType", "mLongVideoPlayFragment", "Lcom/ss/android/ugc/aweme/longvideonew/LongVideoPlayFragment;", "mPageType", "", "mStayTime", "", "finish", "", "getStatusBarColor", "initParams", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onKeyDown", "", "keyCode", "event", "Landroid/view/KeyEvent;", "onPause", "onResume", "registerActivityOnKeyDownListener", "listener", "setFullScreen", "setStatusBarColor", "setTransparent", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class LongVideoActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53993a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f53994b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private LongVideoPlayFragment f53995c;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<com.ss.android.ugc.aweme.base.activity.a> f53996d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private long f53997e;

    /* renamed from: f  reason: collision with root package name */
    private String f53998f = "";
    private int g;
    private String h = "";
    private Aweme i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J(\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideonew/LongVideoActivity$Companion;", "", "()V", "BUSINESS_TYPE", "", "EXTRA_AWEME_ID", "EXTRA_EVENT_TYPE", "EXTRA_PAGE_TYPE", "checkNetWork", "", "context", "Landroid/content/Context;", "mobLongVideoEntrance", "", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "eventType", "pageType", "", "startActivity", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53999a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f53993a, false, 56833, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f53993a, false, 56833, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.longvideonew.LongVideoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f53993a, false, 56825, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53993a, false, 56825, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        overridePendingTransition(0, C0906R.anim.cj);
    }

    public final int getStatusBarColor() {
        if (!PatchProxy.isSupport(new Object[0], this, f53993a, false, 56822, new Class[0], Integer.TYPE)) {
            return getResources().getColor(C0906R.color.a7l);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f53993a, false, 56822, new Class[0], Integer.TYPE)).intValue();
    }

    public final void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f53993a, false, 56827, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53993a, false, 56827, new Class[0], Void.TYPE);
            return;
        }
        LongVideoPlayFragment longVideoPlayFragment = this.f53995c;
        if (longVideoPlayFragment != null) {
            longVideoPlayFragment.a();
        }
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f53993a, false, 56826, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53993a, false, 56826, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.f53996d.clear();
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f53993a, false, 56819, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53993a, false, 56819, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.longvideonew.LongVideoActivity", "onResume", true);
        super.onResume();
        this.f53997e = SystemClock.elapsedRealtime();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.longvideonew.LongVideoActivity", "onResume", false);
    }

    public final void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f53993a, false, 56820, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53993a, false, 56820, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        new ao("long_video_stay_time").a(String.valueOf(SystemClock.elapsedRealtime() - this.f53997e)).b(this.f53998f).f(this.i).e();
    }

    public final void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f53993a, false, 56821, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53993a, false, 56821, new Class[0], Void.TYPE);
            return;
        }
        Activity activity = this;
        if (com.ss.android.ugc.aweme.app.a.a.a(activity)) {
            if (PatchProxy.isSupport(new Object[0], this, f53993a, false, 56824, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53993a, false, 56824, new Class[0], Void.TYPE);
            } else {
                if (Build.VERSION.SDK_INT >= 21) {
                    Window window = getWindow();
                    Intrinsics.checkExpressionValueIsNotNull(window, "window");
                    window.setStatusBarColor(getStatusBarColor());
                } else if (Build.VERSION.SDK_INT >= 19) {
                    StatusBarUtils.setColor(activity, getStatusBarColor());
                }
                v.b(activity);
            }
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f53993a, false, 56823, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53993a, false, 56823, new Class[0], Void.TYPE);
            } else if (Build.VERSION.SDK_INT >= 21) {
                getWindow().setFlags(1024, 1024);
            } else {
                Window window2 = getWindow();
                Intrinsics.checkExpressionValueIsNotNull(window2, "window");
                View decorView = window2.getDecorView();
                Intrinsics.checkExpressionValueIsNotNull(decorView, "decorView");
                decorView.setSystemUiVisibility(1284);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d6, code lost:
        if (r7.i == null) goto L_0x00d8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r19) {
        /*
            r18 = this;
            r7 = r18
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r19
            com.meituan.robust.ChangeQuickRedirect r2 = f53993a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 56817(0xddf1, float:7.9618E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r19
            com.meituan.robust.ChangeQuickRedirect r2 = f53993a
            r3 = 0
            r4 = 56817(0xddf1, float:7.9618E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0036:
            java.lang.String r0 = "com.ss.android.ugc.aweme.longvideonew.LongVideoActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r9)
            super.onCreate(r19)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x0051
            android.view.Window r0 = r18.getWindow()
            if (r0 == 0) goto L_0x0051
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setNavigationBarColor(r1)
        L_0x0051:
            android.view.Window r0 = r18.getWindow()
            if (r0 == 0) goto L_0x005c
            r1 = 128(0x80, float:1.794E-43)
            r0.addFlags(r1)
        L_0x005c:
            r0 = 2130968695(0x7f040077, float:1.754605E38)
            r7.superOverridePendingTransition(r0, r10)
            r0 = 2131689587(0x7f0f0073, float:1.9008194E38)
            r7.setContentView((int) r0)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f53993a
            r3 = 0
            r4 = 56818(0xddf2, float:7.9619E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x008e
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f53993a
            r3 = 0
            r4 = 56818(0xddf2, float:7.9619E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00ee
        L_0x008e:
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r1 = "extra_aweme_id"
            java.lang.String r0 = r0.getStringExtra(r1)
            if (r0 != 0) goto L_0x009c
            java.lang.String r0 = ""
        L_0x009c:
            r7.h = r0
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r1 = "extra_event_type"
            java.lang.String r0 = r0.getStringExtra(r1)
            if (r0 != 0) goto L_0x00ac
            java.lang.String r0 = ""
        L_0x00ac:
            r7.f53998f = r0
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r1 = "extra_page_type"
            int r0 = r0.getIntExtra(r1, r10)
            r7.g = r0
            java.lang.String r0 = r7.f53998f
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = "homepage_hot"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x00d8
            com.ss.android.ugc.aweme.commercialize.feed.j r0 = com.ss.android.ugc.aweme.commercialize.feed.j.a()
            java.lang.String r1 = r7.h
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.a((java.lang.String) r1)
            r7.i = r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.i
            if (r0 != 0) goto L_0x00e4
        L_0x00d8:
            com.ss.android.ugc.aweme.feed.a r0 = com.ss.android.ugc.aweme.feed.a.a()
            java.lang.String r1 = r7.h
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.b((java.lang.String) r1)
            r7.i = r0
        L_0x00e4:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.i
            if (r0 != 0) goto L_0x00ee
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = com.ss.android.ugc.aweme.longvideo.e.a()
            r7.i = r0
        L_0x00ee:
            com.ss.android.ugc.aweme.longvideo.b.a$a r0 = com.ss.android.ugc.aweme.longvideo.b.a.f53877b
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.i
            java.lang.String r2 = r7.f53998f
            int r3 = r7.g
            r4 = 5
            java.lang.Object[] r11 = new java.lang.Object[r4]
            r11[r10] = r7
            r11[r9] = r1
            r5 = 2
            r11[r5] = r2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r8 = 3
            r11[r8] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r15 = 4
            r11[r15] = r6
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.longvideo.b.a.C0621a.f53878a
            r14 = 0
            r6 = 56738(0xdda2, float:7.9507E-41)
            java.lang.Class[] r12 = new java.lang.Class[r4]
            java.lang.Class<com.ss.android.ugc.aweme.longvideonew.LongVideoActivity> r16 = com.ss.android.ugc.aweme.longvideonew.LongVideoActivity.class
            r12[r10] = r16
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r16 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r12[r9] = r16
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r12[r5] = r16
            java.lang.Class r16 = java.lang.Integer.TYPE
            r12[r8] = r16
            java.lang.Class r16 = java.lang.Integer.TYPE
            r12[r15] = r16
            java.lang.Class<com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel> r17 = com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel.class
            r16 = r12
            r12 = r0
            r15 = r6
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r6 == 0) goto L_0x0173
            java.lang.Object[] r11 = new java.lang.Object[r4]
            r11[r10] = r7
            r11[r9] = r1
            r11[r5] = r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r11[r8] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r6 = 4
            r11[r6] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.longvideo.b.a.C0621a.f53878a
            r14 = 0
            r15 = 56738(0xdda2, float:7.9507E-41)
            java.lang.Class[] r1 = new java.lang.Class[r4]
            java.lang.Class<com.ss.android.ugc.aweme.longvideonew.LongVideoActivity> r2 = com.ss.android.ugc.aweme.longvideonew.LongVideoActivity.class
            r1[r10] = r2
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r1[r9] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r5] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r8] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r6] = r2
            java.lang.Class<com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel> r17 = com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel.class
            r12 = r0
            r16 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r0 = (com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel) r0
            goto L_0x019b
        L_0x0173:
            r6 = 4
            java.lang.String r0 = "longVideoPlayActivity"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r7, r0)
            java.lang.String r0 = "eventType"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            r0 = r7
            android.support.v4.app.FragmentActivity r0 = (android.support.v4.app.FragmentActivity) r0
            android.arch.lifecycle.ViewModelProvider r0 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r0)
            java.lang.Class<com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel> r4 = com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel.class
            android.arch.lifecycle.ViewModel r0 = r0.get(r4)
            java.lang.String r4 = "ViewModelProviders.of(lo…MobViewModel::class.java)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r4)
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r0 = (com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel) r0
            r0.f53992b = r1
            com.ss.android.ugc.aweme.longvideo.f r1 = new com.ss.android.ugc.aweme.longvideo.f
            r1.<init>(r2, r3, r9)
            r0.f53991a = r1
        L_0x019b:
            com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment$a r0 = com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment.r
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.i
            java.lang.String r2 = r7.f53998f
            int r3 = r7.g
            java.lang.String r4 = "long_video_player_activity"
            java.lang.Object[] r11 = new java.lang.Object[r6]
            r11[r10] = r1
            r11[r9] = r2
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            r11[r5] = r12
            r11[r8] = r4
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment.a.f54006a
            r14 = 0
            r15 = 56857(0xde19, float:7.9674E-41)
            java.lang.Class[] r12 = new java.lang.Class[r6]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r16 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r12[r10] = r16
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r12[r9] = r16
            java.lang.Class r16 = java.lang.Integer.TYPE
            r12[r5] = r16
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r12[r8] = r16
            java.lang.Class<com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment> r17 = com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment.class
            r16 = r12
            r12 = r0
            boolean r11 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r11 == 0) goto L_0x0208
            java.lang.Object[] r11 = new java.lang.Object[r6]
            r11[r10] = r1
            r11[r9] = r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r11[r5] = r1
            r11[r8] = r4
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment.a.f54006a
            r14 = 0
            r15 = 56857(0xde19, float:7.9674E-41)
            java.lang.Class[] r1 = new java.lang.Class[r6]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r1[r10] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r9] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r5] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r8] = r2
            java.lang.Class<com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment> r17 = com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment.class
            r12 = r0
            r16 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment r0 = (com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment) r0
            goto L_0x0231
        L_0x0208:
            java.lang.String r0 = "eventType"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            java.lang.String r0 = "businessType"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r5 = "extra_event_type"
            r0.putString(r5, r2)
            java.lang.String r2 = "extra_page_type"
            r0.putInt(r2, r3)
            java.lang.String r2 = "extra_business_type"
            r0.putString(r2, r4)
            com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment r2 = new com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment
            r2.<init>()
            r2.setArguments(r0)
            r2.f54001b = r1
            r0 = r2
        L_0x0231:
            r7.f53995c = r0
            com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment r0 = r7.f53995c
            r8 = r0
            com.ss.android.ugc.aweme.base.activity.a r8 = (com.ss.android.ugc.aweme.base.activity.a) r8
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f53993a
            r3 = 0
            r4 = 56828(0xddfc, float:7.9633E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.base.activity.a> r1 = com.ss.android.ugc.aweme.base.activity.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x026a
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f53993a
            r3 = 0
            r4 = 56828(0xddfc, float:7.9633E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.base.activity.a> r1 = com.ss.android.ugc.aweme.base.activity.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0271
        L_0x026a:
            if (r8 == 0) goto L_0x0271
            java.util.ArrayList<com.ss.android.ugc.aweme.base.activity.a> r0 = r7.f53996d
            r0.add(r8)
        L_0x0271:
            com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment r0 = r7.f53995c
            if (r0 == 0) goto L_0x0289
            android.support.v4.app.FragmentManager r1 = r18.getSupportFragmentManager()
            android.support.v4.app.FragmentTransaction r1 = r1.beginTransaction()
            r2 = 2131166894(0x7f0706ae, float:1.7948046E38)
            android.support.v4.app.Fragment r0 = (android.support.v4.app.Fragment) r0
            android.support.v4.app.FragmentTransaction r0 = r1.add((int) r2, (android.support.v4.app.Fragment) r0)
            r0.commit()
        L_0x0289:
            java.lang.String r0 = "com.ss.android.ugc.aweme.longvideonew.LongVideoActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.longvideonew.LongVideoActivity.onCreate(android.os.Bundle):void");
    }

    public final boolean onKeyDown(int i2, @Nullable KeyEvent keyEvent) {
        KeyEvent keyEvent2 = keyEvent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), keyEvent2}, this, f53993a, false, 56829, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), keyEvent2}, this, f53993a, false, 56829, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!isViewValid()) {
            return false;
        } else {
            Iterator<com.ss.android.ugc.aweme.base.activity.a> it2 = this.f53996d.iterator();
            while (it2.hasNext()) {
                if (it2.next().a(i2, keyEvent2)) {
                    return true;
                }
            }
            int i3 = i2;
            return super.onKeyDown(i2, keyEvent);
        }
    }
}
