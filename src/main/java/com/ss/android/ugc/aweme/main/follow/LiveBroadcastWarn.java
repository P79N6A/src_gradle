package com.ss.android.ugc.aweme.main.follow;

import a.i;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.f.f;
import com.ss.android.ugc.aweme.feed.y;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.story.live.b;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.ArrayList;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class LiveBroadcastWarn implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3552a;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f3553e;

    /* renamed from: b  reason: collision with root package name */
    public View f3554b;

    /* renamed from: c  reason: collision with root package name */
    public long f3555c = 2500;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3556d;

    /* renamed from: f  reason: collision with root package name */
    public Bitmap f3557f;
    private Context g;
    private a h = a.NO;
    private final long i = 60000;
    private final long j = 5000;
    private int k = -1;

    enum a {
        NO,
        DEFAULT_SHOW,
        IMAGE_SHOW,
        FORCE_DEFAULT_SHOW,
        FORCE_IMAGE_SHOW;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    private String d() {
        if (PatchProxy.isSupport(new Object[0], this, f3552a, false, 58011, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f3552a, false, 58011, new Class[0], String.class);
        }
        try {
            return g.b().bA().getBubbleUrl();
        } catch (com.bytedance.ies.a unused) {
            return "";
        }
    }

    private String e() {
        if (PatchProxy.isSupport(new Object[0], this, f3552a, false, 58012, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f3552a, false, 58012, new Class[0], String.class);
        }
        try {
            return g.b().bA().getActivityBubbleUrl();
        } catch (com.bytedance.ies.a unused) {
            return "";
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3552a, false, 58017, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3552a, false, 58017, new Class[0], Void.TYPE);
            return;
        }
        bg.d(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f3552a, false, 58016, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3552a, false, 58016, new Class[0], Void.TYPE);
            return;
        }
        b(null);
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f3552a, false, 58010, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3552a, false, 58010, new Class[0], Void.TYPE);
            return;
        }
        if (this.h == a.DEFAULT_SHOW || this.h == a.IMAGE_SHOW) {
            y.e();
            y.f();
        } else {
            y.i();
            y.j();
        }
        y.h();
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f3552a, false, 58013, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3552a, false, 58013, new Class[0], Void.TYPE);
            return;
        }
        Context context = this.g;
        if (context != null) {
            this.f3554b.setVisibility(0);
            this.f3554b.setLayerType(2, null);
            Animation loadAnimation = AnimationUtils.loadAnimation(context, C0906R.anim.f4405cn);
            loadAnimation.setRepeatMode(2);
            loadAnimation.setRepeatCount(-1);
            loadAnimation.setAnimationListener(new Animation.AnimationListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54740a;

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    if (PatchProxy.isSupport(new Object[]{animation}, this, f54740a, false, 58026, new Class[]{Animation.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animation}, this, f54740a, false, 58026, new Class[]{Animation.class}, Void.TYPE);
                        return;
                    }
                    LiveBroadcastWarn.this.f3554b.setLayerType(0, null);
                }
            });
            this.f3554b.startAnimation(loadAnimation);
        }
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f3552a, false, 58015, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3552a, false, 58015, new Class[0], Void.TYPE);
            return;
        }
        if ((this.f3554b != null && this.f3556d) || (this.f3554b != null && this.f3554b.getVisibility() == 0)) {
            this.f3554b.setVisibility(8);
            this.f3554b.setBackground(null);
            this.f3554b.clearAnimation();
            this.f3556d = false;
            f3553e = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3552a, false, 58006, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3552a, false, 58006, new Class[0], Void.TYPE);
            return;
        }
        this.f3554b.setBackgroundResource(2130838812);
        a();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3552a, false, 58005, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3552a, false, 58005, new Class[0], Void.TYPE);
            return;
        }
        if (!f3553e) {
            f();
            b.a();
            c();
            f3553e = true;
            i.a(5000).a((a.g<TResult, TContinuationResult>) new c<TResult,TContinuationResult>(this), i.f1052b);
        }
    }

    public final Object b(i<Void> iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f3552a, false, 58014, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f3552a, false, 58014, new Class[]{i.class}, Object.class);
        }
        g();
        return null;
    }

    @Subscribe(a = ThreadMode.MAIN)
    public void onBubbleGuideDismissEvent(com.ss.android.ugc.aweme.main.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3552a, false, 58019, new Class[]{com.ss.android.ugc.aweme.main.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3552a, false, 58019, new Class[]{com.ss.android.ugc.aweme.main.a.a.class}, Void.TYPE);
            return;
        }
        g();
    }

    @Subscribe(a = ThreadMode.MAIN)
    public void onCommentDialogEvent(f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, f3552a, false, 58018, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, f3552a, false, 58018, new Class[]{f.class}, Void.TYPE);
            return;
        }
        if (fVar2.f45302a == 1) {
            g();
        }
    }

    @Subscribe(a = ThreadMode.MAIN)
    public void onLiveTakeBubbleDismissEvent(f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f3552a, false, 58020, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, f3552a, false, 58020, new Class[]{f.class}, Void.TYPE);
            return;
        }
        g();
    }

    private void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f3552a, false, 58003, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f3552a, false, 58003, new Class[]{String.class}, Void.TYPE);
        } else if (str2 == null || TextUtils.equals(str2, "")) {
            b();
        } else {
            UrlModel urlModel = new UrlModel();
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            urlModel.setUrlList(arrayList);
            c.a(urlModel, -1, -1, (com.ss.android.ugc.aweme.base.b.a.b<Bitmap>) new com.ss.android.ugc.aweme.base.b.a.b<Bitmap>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54738a;

                public final /* synthetic */ void accept(Object obj) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (PatchProxy.isSupport(new Object[]{bitmap}, this, f54738a, false, 58024, new Class[]{Bitmap.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bitmap}, this, f54738a, false, 58024, new Class[]{Bitmap.class}, Void.TYPE);
                        return;
                    }
                    LiveBroadcastWarn.this.f3557f = bitmap;
                    i.a(0).a((a.g<TResult, TContinuationResult>) new d<TResult,TContinuationResult>(LiveBroadcastWarn.this), i.f1052b);
                }

                static final /* synthetic */ Object a(LiveBroadcastWarn liveBroadcastWarn, i iVar) throws Exception {
                    if (PatchProxy.isSupport(new Object[]{iVar}, liveBroadcastWarn, LiveBroadcastWarn.f3552a, false, 58004, new Class[]{i.class}, Object.class)) {
                        return PatchProxy.accessDispatch(new Object[]{iVar}, liveBroadcastWarn, LiveBroadcastWarn.f3552a, false, 58004, new Class[]{i.class}, Object.class);
                    }
                    if (liveBroadcastWarn.f3557f != null) {
                        liveBroadcastWarn.f3554b.setBackground(new BitmapDrawable(liveBroadcastWarn.f3557f));
                        liveBroadcastWarn.a();
                    } else {
                        liveBroadcastWarn.b();
                    }
                    return null;
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x024f, code lost:
        if ((java.lang.System.currentTimeMillis() - com.ss.android.ugc.aweme.feed.y.g()) > (((long) com.ss.android.ugc.aweme.global.config.settings.g.b().bA().getTriggerIntervalMinute().intValue()) * 60000)) goto L_0x0251;
     */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0346 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x034f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0358 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0361 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(a.i<java.lang.Void> r21) {
        /*
            r20 = this;
            r7 = r20
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r21
            com.meituan.robust.ChangeQuickRedirect r2 = f3552a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<a.i> r1 = a.i.class
            r5[r10] = r1
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r3 = 0
            r4 = 58002(0xe292, float:8.1278E-41)
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0039
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r21
            com.meituan.robust.ChangeQuickRedirect r2 = f3552a
            r3 = 0
            r4 = 58002(0xe292, float:8.1278E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<a.i> r1 = a.i.class
            r5[r10] = r1
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r1 = r20
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Object r0 = (java.lang.Object) r0
            return r0
        L_0x0039:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f3552a
            r3 = 0
            r4 = 58009(0xe299, float:8.1288E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0066
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f3552a
            r3 = 0
            r4 = 58009(0xe299, float:8.1288E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r20
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0089
        L_0x0066:
            boolean r0 = com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isInTeenagerModeNewVersion()
            if (r0 != 0) goto L_0x0088
            boolean r0 = com.ss.android.ugc.aweme.main.cb.f54699d
            if (r0 != 0) goto L_0x0088
            com.ss.android.ugc.aweme.app.i r0 = com.ss.android.ugc.aweme.app.i.a()
            android.content.Context r0 = r0.getContext()
            java.lang.Class<com.ss.android.ugc.aweme.main.bm> r1 = com.ss.android.ugc.aweme.main.bm.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.base.sharedpref.c.a(r0, r1)
            com.ss.android.ugc.aweme.main.bm r0 = (com.ss.android.ugc.aweme.main.bm) r0
            boolean r0 = r0.f((boolean) r9)
            if (r0 != 0) goto L_0x0088
            r0 = 1
            goto L_0x0089
        L_0x0088:
            r0 = 0
        L_0x0089:
            if (r0 != 0) goto L_0x0091
            com.ss.android.ugc.aweme.main.follow.LiveBroadcastWarn$a r0 = com.ss.android.ugc.aweme.main.follow.LiveBroadcastWarn.a.NO
            r7.h = r0
            goto L_0x036c
        L_0x0091:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f3552a
            r3 = 0
            r4 = 58007(0xe297, float:8.1285E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00b8
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f3552a
            r3 = 0
            r4 = 58007(0xe297, float:8.1285E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x036c
        L_0x00b8:
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r0 = com.ss.android.ugc.aweme.global.config.settings.g.b()     // Catch:{ a -> 0x0340 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.NewAnchorShowBubbleSettings r0 = r0.bA()     // Catch:{ a -> 0x0340 }
            java.lang.Boolean r0 = r0.getForceTrigger()     // Catch:{ a -> 0x0340 }
            boolean r8 = r0.booleanValue()     // Catch:{ a -> 0x0340 }
            r11 = 60000(0xea60, double:2.9644E-319)
            if (r8 == 0) goto L_0x0257
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ a -> 0x0340 }
            r1 = 0
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.feed.y.f47065a     // Catch:{ a -> 0x0340 }
            r3 = 1
            r4 = 40095(0x9c9f, float:5.6185E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]     // Catch:{ a -> 0x0340 }
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch:{ a -> 0x0340 }
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ a -> 0x0340 }
            if (r0 == 0) goto L_0x00fb
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ a -> 0x0340 }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.feed.y.f47065a     // Catch:{ a -> 0x0340 }
            r16 = 1
            r17 = 40095(0x9c9f, float:5.6185E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]     // Catch:{ a -> 0x0340 }
            java.lang.Class r19 = java.lang.Boolean.TYPE     // Catch:{ a -> 0x0340 }
            r18 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ a -> 0x0340 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ a -> 0x0340 }
            boolean r0 = r0.booleanValue()     // Catch:{ a -> 0x0340 }
            goto L_0x0105
        L_0x00fb:
            com.ss.android.ugc.aweme.base.sharedpref.f r0 = com.ss.android.ugc.aweme.base.sharedpref.e.d()     // Catch:{ a -> 0x0340 }
            java.lang.String r1 = "live_bubble_force_last_state"
            boolean r0 = r0.a((java.lang.String) r1, (boolean) r10)     // Catch:{ a -> 0x0340 }
        L_0x0105:
            if (r0 != 0) goto L_0x0196
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ a -> 0x0340 }
            com.meituan.robust.ChangeQuickRedirect r2 = f3552a     // Catch:{ a -> 0x0340 }
            r3 = 0
            r4 = 58008(0xe298, float:8.1287E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]     // Catch:{ a -> 0x0340 }
            java.lang.Class r6 = java.lang.Void.TYPE     // Catch:{ a -> 0x0340 }
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ a -> 0x0340 }
            if (r0 == 0) goto L_0x012d
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ a -> 0x0340 }
            com.meituan.robust.ChangeQuickRedirect r2 = f3552a     // Catch:{ a -> 0x0340 }
            r3 = 0
            r4 = 58008(0xe298, float:8.1287E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]     // Catch:{ a -> 0x0340 }
            java.lang.Class r6 = java.lang.Void.TYPE     // Catch:{ a -> 0x0340 }
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ a -> 0x0340 }
            goto L_0x0193
        L_0x012d:
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ a -> 0x0340 }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.feed.y.f47065a     // Catch:{ a -> 0x0340 }
            r16 = 1
            r17 = 40091(0x9c9b, float:5.618E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]     // Catch:{ a -> 0x0340 }
            java.lang.Class r19 = java.lang.Void.TYPE     // Catch:{ a -> 0x0340 }
            r18 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ a -> 0x0340 }
            if (r0 == 0) goto L_0x0157
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ a -> 0x0340 }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.feed.y.f47065a     // Catch:{ a -> 0x0340 }
            r16 = 1
            r17 = 40091(0x9c9b, float:5.618E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]     // Catch:{ a -> 0x0340 }
            java.lang.Class r19 = java.lang.Void.TYPE     // Catch:{ a -> 0x0340 }
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ a -> 0x0340 }
            goto L_0x0160
        L_0x0157:
            com.ss.android.ugc.aweme.base.sharedpref.f r0 = com.ss.android.ugc.aweme.base.sharedpref.e.d()     // Catch:{ a -> 0x0340 }
            java.lang.String r1 = "live_bubble_force_display_times_today"
            r0.b((java.lang.String) r1, (int) r10)     // Catch:{ a -> 0x0340 }
        L_0x0160:
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ a -> 0x0340 }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.feed.y.f47065a     // Catch:{ a -> 0x0340 }
            r16 = 1
            r17 = 40094(0x9c9e, float:5.6184E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]     // Catch:{ a -> 0x0340 }
            java.lang.Class r19 = java.lang.Void.TYPE     // Catch:{ a -> 0x0340 }
            r18 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ a -> 0x0340 }
            if (r0 == 0) goto L_0x018a
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ a -> 0x0340 }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.feed.y.f47065a     // Catch:{ a -> 0x0340 }
            r16 = 1
            r17 = 40094(0x9c9e, float:5.6184E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]     // Catch:{ a -> 0x0340 }
            java.lang.Class r19 = java.lang.Void.TYPE     // Catch:{ a -> 0x0340 }
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ a -> 0x0340 }
            goto L_0x0193
        L_0x018a:
            com.ss.android.ugc.aweme.base.sharedpref.f r0 = com.ss.android.ugc.aweme.base.sharedpref.e.d()     // Catch:{ a -> 0x0340 }
            java.lang.String r1 = "live_bubble_force_display_times_totally"
            r0.b((java.lang.String) r1, (int) r10)     // Catch:{ a -> 0x0340 }
        L_0x0193:
            com.ss.android.ugc.aweme.feed.y.d(r9)     // Catch:{ a -> 0x0340 }
        L_0x0196:
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r0 = com.ss.android.ugc.aweme.global.config.settings.g.b()     // Catch:{ a -> 0x0340 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.NewAnchorShowBubbleSettings r0 = r0.bA()     // Catch:{ a -> 0x0340 }
            java.lang.Integer r0 = r0.getDailyTriggerTimes()     // Catch:{ a -> 0x0340 }
            int r0 = r0.intValue()     // Catch:{ a -> 0x0340 }
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ a -> 0x0340 }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.feed.y.f47065a     // Catch:{ a -> 0x0340 }
            r16 = 1
            r17 = 40089(0x9c99, float:5.6177E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]     // Catch:{ a -> 0x0340 }
            java.lang.Class r19 = java.lang.Integer.TYPE     // Catch:{ a -> 0x0340 }
            r18 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ a -> 0x0340 }
            if (r1 == 0) goto L_0x01d7
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ a -> 0x0340 }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.feed.y.f47065a     // Catch:{ a -> 0x0340 }
            r16 = 1
            r17 = 40089(0x9c99, float:5.6177E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]     // Catch:{ a -> 0x0340 }
            java.lang.Class r19 = java.lang.Integer.TYPE     // Catch:{ a -> 0x0340 }
            r18 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ a -> 0x0340 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ a -> 0x0340 }
            int r1 = r1.intValue()     // Catch:{ a -> 0x0340 }
            goto L_0x01e1
        L_0x01d7:
            com.ss.android.ugc.aweme.base.sharedpref.f r1 = com.ss.android.ugc.aweme.base.sharedpref.e.d()     // Catch:{ a -> 0x0340 }
            java.lang.String r2 = "live_bubble_force_display_times_today"
            int r1 = r1.a((java.lang.String) r2, (int) r10)     // Catch:{ a -> 0x0340 }
        L_0x01e1:
            if (r0 <= r1) goto L_0x0254
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r0 = com.ss.android.ugc.aweme.global.config.settings.g.b()     // Catch:{ a -> 0x0340 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.NewAnchorShowBubbleSettings r0 = r0.bA()     // Catch:{ a -> 0x0340 }
            java.lang.Integer r0 = r0.getLifecycleTriggerTimes()     // Catch:{ a -> 0x0340 }
            int r0 = r0.intValue()     // Catch:{ a -> 0x0340 }
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ a -> 0x0340 }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.feed.y.f47065a     // Catch:{ a -> 0x0340 }
            r16 = 1
            r17 = 40092(0x9c9c, float:5.6181E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]     // Catch:{ a -> 0x0340 }
            java.lang.Class r19 = java.lang.Integer.TYPE     // Catch:{ a -> 0x0340 }
            r18 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ a -> 0x0340 }
            if (r1 == 0) goto L_0x0224
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ a -> 0x0340 }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.feed.y.f47065a     // Catch:{ a -> 0x0340 }
            r16 = 1
            r17 = 40092(0x9c9c, float:5.6181E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]     // Catch:{ a -> 0x0340 }
            java.lang.Class r19 = java.lang.Integer.TYPE     // Catch:{ a -> 0x0340 }
            r18 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ a -> 0x0340 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ a -> 0x0340 }
            int r1 = r1.intValue()     // Catch:{ a -> 0x0340 }
            goto L_0x022e
        L_0x0224:
            com.ss.android.ugc.aweme.base.sharedpref.f r1 = com.ss.android.ugc.aweme.base.sharedpref.e.d()     // Catch:{ a -> 0x0340 }
            java.lang.String r2 = "live_bubble_force_display_times_totally"
            int r1 = r1.a((java.lang.String) r2, (int) r10)     // Catch:{ a -> 0x0340 }
        L_0x022e:
            if (r0 <= r1) goto L_0x0254
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ a -> 0x0340 }
            long r2 = com.ss.android.ugc.aweme.feed.y.g()     // Catch:{ a -> 0x0340 }
            r4 = 0
            long r0 = r0 - r2
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r2 = com.ss.android.ugc.aweme.global.config.settings.g.b()     // Catch:{ a -> 0x0340 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.NewAnchorShowBubbleSettings r2 = r2.bA()     // Catch:{ a -> 0x0340 }
            java.lang.Integer r2 = r2.getTriggerIntervalMinute()     // Catch:{ a -> 0x0340 }
            int r2 = r2.intValue()     // Catch:{ a -> 0x0340 }
            long r2 = (long) r2     // Catch:{ a -> 0x0340 }
            long r2 = r2 * r11
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0254
        L_0x0251:
            r0 = 1
            goto L_0x0329
        L_0x0254:
            r0 = 0
            goto L_0x0329
        L_0x0257:
            com.ss.android.ugc.aweme.feed.y.d(r10)     // Catch:{ a -> 0x0340 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r0 = com.ss.android.ugc.aweme.global.config.settings.g.b()     // Catch:{ a -> 0x0340 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.NewAnchorShowBubbleSettings r0 = r0.bA()     // Catch:{ a -> 0x0340 }
            java.lang.Boolean r0 = r0.getNewAnchorShowBubble()     // Catch:{ a -> 0x0340 }
            boolean r0 = r0.booleanValue()     // Catch:{ a -> 0x0340 }
            if (r0 == 0) goto L_0x0254
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r0 = com.ss.android.ugc.aweme.global.config.settings.g.b()     // Catch:{ a -> 0x0340 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.NewAnchorShowBubbleSettings r0 = r0.bA()     // Catch:{ a -> 0x0340 }
            java.lang.Integer r0 = r0.getDailyTriggerTimes()     // Catch:{ a -> 0x0340 }
            int r0 = r0.intValue()     // Catch:{ a -> 0x0340 }
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ a -> 0x0340 }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.feed.y.f47065a     // Catch:{ a -> 0x0340 }
            r16 = 1
            r17 = 40083(0x9c93, float:5.6168E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]     // Catch:{ a -> 0x0340 }
            java.lang.Class r19 = java.lang.Integer.TYPE     // Catch:{ a -> 0x0340 }
            r18 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ a -> 0x0340 }
            if (r1 == 0) goto L_0x02ad
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ a -> 0x0340 }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.feed.y.f47065a     // Catch:{ a -> 0x0340 }
            r16 = 1
            r17 = 40083(0x9c93, float:5.6168E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]     // Catch:{ a -> 0x0340 }
            java.lang.Class r19 = java.lang.Integer.TYPE     // Catch:{ a -> 0x0340 }
            r18 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ a -> 0x0340 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ a -> 0x0340 }
            int r1 = r1.intValue()     // Catch:{ a -> 0x0340 }
            goto L_0x02b7
        L_0x02ad:
            com.ss.android.ugc.aweme.base.sharedpref.f r1 = com.ss.android.ugc.aweme.base.sharedpref.e.d()     // Catch:{ a -> 0x0340 }
            java.lang.String r2 = "live_bubble_display_times_today"
            int r1 = r1.a((java.lang.String) r2, (int) r10)     // Catch:{ a -> 0x0340 }
        L_0x02b7:
            if (r0 <= r1) goto L_0x0254
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r0 = com.ss.android.ugc.aweme.global.config.settings.g.b()     // Catch:{ a -> 0x0340 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.NewAnchorShowBubbleSettings r0 = r0.bA()     // Catch:{ a -> 0x0340 }
            java.lang.Integer r0 = r0.getLifecycleTriggerTimes()     // Catch:{ a -> 0x0340 }
            int r0 = r0.intValue()     // Catch:{ a -> 0x0340 }
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ a -> 0x0340 }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.feed.y.f47065a     // Catch:{ a -> 0x0340 }
            r16 = 1
            r17 = 40085(0x9c95, float:5.6171E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]     // Catch:{ a -> 0x0340 }
            java.lang.Class r19 = java.lang.Integer.TYPE     // Catch:{ a -> 0x0340 }
            r18 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ a -> 0x0340 }
            if (r1 == 0) goto L_0x02fa
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ a -> 0x0340 }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.feed.y.f47065a     // Catch:{ a -> 0x0340 }
            r16 = 1
            r17 = 40085(0x9c95, float:5.6171E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]     // Catch:{ a -> 0x0340 }
            java.lang.Class r19 = java.lang.Integer.TYPE     // Catch:{ a -> 0x0340 }
            r18 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ a -> 0x0340 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ a -> 0x0340 }
            int r1 = r1.intValue()     // Catch:{ a -> 0x0340 }
            goto L_0x0304
        L_0x02fa:
            com.ss.android.ugc.aweme.base.sharedpref.f r1 = com.ss.android.ugc.aweme.base.sharedpref.e.d()     // Catch:{ a -> 0x0340 }
            java.lang.String r2 = "live_bubble_display_times_totally"
            int r1 = r1.a((java.lang.String) r2, (int) r10)     // Catch:{ a -> 0x0340 }
        L_0x0304:
            if (r0 <= r1) goto L_0x0254
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ a -> 0x0340 }
            long r2 = com.ss.android.ugc.aweme.feed.y.g()     // Catch:{ a -> 0x0340 }
            r4 = 0
            long r0 = r0 - r2
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r2 = com.ss.android.ugc.aweme.global.config.settings.g.b()     // Catch:{ a -> 0x0340 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.NewAnchorShowBubbleSettings r2 = r2.bA()     // Catch:{ a -> 0x0340 }
            java.lang.Integer r2 = r2.getTriggerIntervalMinute()     // Catch:{ a -> 0x0340 }
            int r2 = r2.intValue()     // Catch:{ a -> 0x0340 }
            long r2 = (long) r2     // Catch:{ a -> 0x0340 }
            long r2 = r2 * r11
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0254
            goto L_0x0251
        L_0x0329:
            java.lang.String r1 = r20.d()     // Catch:{ a -> 0x0340 }
            java.lang.String r2 = ""
            boolean r1 = android.text.TextUtils.equals(r1, r2)     // Catch:{ a -> 0x0340 }
            r1 = r1 ^ r9
            java.lang.String r2 = r20.e()     // Catch:{ a -> 0x0340 }
            java.lang.String r3 = ""
            boolean r2 = android.text.TextUtils.equals(r2, r3)     // Catch:{ a -> 0x0340 }
            r2 = r2 ^ r9
            goto L_0x0344
        L_0x0340:
            r0 = 0
            r1 = 0
            r2 = 0
            r8 = 0
        L_0x0344:
            if (r8 == 0) goto L_0x034d
            if (r2 != 0) goto L_0x034d
            com.ss.android.ugc.aweme.main.follow.LiveBroadcastWarn$a r0 = com.ss.android.ugc.aweme.main.follow.LiveBroadcastWarn.a.FORCE_DEFAULT_SHOW
            r7.h = r0
            goto L_0x036c
        L_0x034d:
            if (r8 == 0) goto L_0x0356
            if (r2 == 0) goto L_0x0356
            com.ss.android.ugc.aweme.main.follow.LiveBroadcastWarn$a r0 = com.ss.android.ugc.aweme.main.follow.LiveBroadcastWarn.a.FORCE_IMAGE_SHOW
            r7.h = r0
            goto L_0x036c
        L_0x0356:
            if (r0 == 0) goto L_0x035f
            if (r1 != 0) goto L_0x035f
            com.ss.android.ugc.aweme.main.follow.LiveBroadcastWarn$a r0 = com.ss.android.ugc.aweme.main.follow.LiveBroadcastWarn.a.DEFAULT_SHOW
            r7.h = r0
            goto L_0x036c
        L_0x035f:
            if (r0 == 0) goto L_0x0368
            if (r1 == 0) goto L_0x0368
            com.ss.android.ugc.aweme.main.follow.LiveBroadcastWarn$a r0 = com.ss.android.ugc.aweme.main.follow.LiveBroadcastWarn.a.IMAGE_SHOW
            r7.h = r0
            goto L_0x036c
        L_0x0368:
            com.ss.android.ugc.aweme.main.follow.LiveBroadcastWarn$a r0 = com.ss.android.ugc.aweme.main.follow.LiveBroadcastWarn.a.NO
            r7.h = r0
        L_0x036c:
            int[] r0 = com.ss.android.ugc.aweme.main.follow.LiveBroadcastWarn.AnonymousClass4.f54742a
            com.ss.android.ugc.aweme.main.follow.LiveBroadcastWarn$a r1 = r7.h
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 0
            switch(r0) {
                case 1: goto L_0x038f;
                case 2: goto L_0x038b;
                case 3: goto L_0x038b;
                case 4: goto L_0x0383;
                case 5: goto L_0x037b;
                default: goto L_0x037a;
            }
        L_0x037a:
            return r1
        L_0x037b:
            java.lang.String r0 = r20.e()
            r7.a((java.lang.String) r0)
            goto L_0x038e
        L_0x0383:
            java.lang.String r0 = r20.d()
            r7.a((java.lang.String) r0)
            goto L_0x038e
        L_0x038b:
            r20.b()
        L_0x038e:
            return r1
        L_0x038f:
            r7.f3556d = r10
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.follow.LiveBroadcastWarn.a(a.i):java.lang.Object");
    }

    public LiveBroadcastWarn(Fragment fragment, View view) {
        this.f3554b = view;
        this.f3554b.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54736a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f54736a, false, 58023, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f54736a, false, 58023, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
            }
        });
        this.g = fragment.getContext();
        bg.c(this);
    }
}
