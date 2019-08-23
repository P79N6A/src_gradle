package com.ss.android.ugc.aweme.story.detail.view;

import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.FragmentActivity;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.api.model.f;
import com.ss.android.ugc.aweme.story.base.StorySSActivity;
import com.ss.android.ugc.aweme.story.base.utils.b;
import com.ss.android.ugc.aweme.story.base.utils.c;
import com.ss.android.ugc.aweme.story.base.utils.i;
import com.ss.android.ugc.aweme.story.detail.controller.AutoPlayController;
import com.ss.android.ugc.aweme.story.detail.controller.StoryDetailMobController;
import com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment;
import com.ss.android.ugc.aweme.story.feed.model.LifeFeedModel;
import com.ss.android.ugc.aweme.story.feed.viewmodel.StoryChange;
import com.ss.android.ugc.aweme.story.friends.a.g;
import com.ss.android.ugc.aweme.story.metrics.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StoryDetailActivity extends StorySSActivity {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f72443c;

    /* renamed from: d  reason: collision with root package name */
    public f f72444d;

    /* renamed from: e  reason: collision with root package name */
    public UserStory f72445e;

    /* renamed from: f  reason: collision with root package name */
    public List<a> f72446f = new ArrayList();
    public StoryFeedJediFragment g;
    public boolean h;
    public View i;
    public boolean j;
    public boolean k;
    public int[] l;
    public boolean m = false;
    boolean n = true;
    private AutoPlayController o;
    private StoryDetailMobController p;
    private FrameLayout q;
    private TransitionSet r;
    private Transition.TransitionListener s;
    private boolean t;
    private com.ss.android.ugc.aweme.story.detail.a.a u;
    private long v = 0;

    public interface a {
        boolean a(int i, KeyEvent keyEvent);
    }

    private boolean g() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f72443c, false, 83198, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f72443c, false, 83198, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f72444d == null) {
            return false;
        } else {
            if (this.f72444d.hasTransition && g.a()) {
                z = true;
            }
            return z;
        }
    }

    public final f b() {
        if (!PatchProxy.isSupport(new Object[0], this, f72443c, false, 83188, new Class[0], f.class)) {
            return (f) getIntent().getSerializableExtra("extra_story_detail_params");
        }
        return (f) PatchProxy.accessDispatch(new Object[0], this, f72443c, false, 83188, new Class[0], f.class);
    }

    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f72443c, false, 83193, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f72443c, false, 83193, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!g()) {
            return true;
        } else {
            return this.j;
        }
    }

    public int getStatusBarColor() {
        if (!PatchProxy.isSupport(new Object[0], this, f72443c, false, 83184, new Class[0], Integer.TYPE)) {
            return getResources().getColor(C0906R.color.a7l);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f72443c, false, 83184, new Class[0], Integer.TYPE)).intValue();
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f72443c, false, 83194, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72443c, false, 83194, new Class[0], Void.TYPE);
            return;
        }
        supportFinishAfterTransition();
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f72443c, false, 83182, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72443c, false, 83182, new Class[0], Void.TYPE);
            return;
        }
        a();
    }

    public void supportStartPostponedEnterTransition() {
        if (PatchProxy.isSupport(new Object[0], this, f72443c, false, 83200, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72443c, false, 83200, new Class[0], Void.TYPE);
            return;
        }
        if (g() && !this.k) {
            super.supportStartPostponedEnterTransition();
        }
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f72443c, false, 83185, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72443c, false, 83185, new Class[0], Void.TYPE);
        } else if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setFlags(1024, 1024);
        } else {
            getWindow().getDecorView().setSystemUiVisibility(1284);
        }
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f72443c, false, 83186, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72443c, false, 83186, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(getStatusBarColor());
        } else if (Build.VERSION.SDK_INT >= 19) {
            StatusBarUtils.setColor(this, getStatusBarColor());
        }
        i.a((Activity) this);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f72443c, false, 83183, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72443c, false, 83183, new Class[0], Void.TYPE);
        } else if (b.a().b()) {
            f();
        } else if (c.a(this, getWindow().getDecorView())) {
            f();
        } else {
            e();
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f72443c, false, 83191, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72443c, false, 83191, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        long currentTimeMillis = System.currentTimeMillis() - this.v;
        if (currentTimeMillis > 100) {
            l lVar = new l();
            lVar.f73206b = this.f72444d.eventType;
            lVar.f73207c = currentTimeMillis;
            lVar.post();
            this.v = 0;
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f72443c, false, 83190, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72443c, false, 83190, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.detail.view.StoryDetailActivity", "onResume", true);
        super.onResume();
        this.v = System.currentTimeMillis();
        setStatusBarColor();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.detail.view.StoryDetailActivity", "onResume", false);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f72443c, false, 83196, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72443c, false, 83196, new Class[0], Void.TYPE);
            return;
        }
        this.n = false;
        if (!(this.g == null || this.g.i() == null)) {
            this.g.i().r();
        }
        if (this.f72444d != null) {
            com.ss.android.ugc.aweme.story.detail.f.a().a(com.ss.android.ugc.aweme.story.feed.c.g.a(StoryChange.c(this)), this.f72444d.tabType);
        }
        this.p.a();
        com.ss.android.ugc.aweme.story.detail.b.a aVar = new com.ss.android.ugc.aweme.story.detail.b.a();
        aVar.f72377a = (com.ss.android.ugc.aweme.story.feed.model.a) LifeFeedModel.a((FragmentActivity) this).d();
        aVar.f72378b = this.f72444d.detailType;
        aVar.f72379c = this.f72444d.tabType;
        aVar.f72380d = this.f72444d;
        com.ss.android.ugc.aweme.story.base.a.a.a().a("KEY_LIFE_FEED").setValue(aVar);
        com.ss.android.ugc.aweme.story.detail.f.a().a(aVar.f72377a);
        Intent intent = new Intent();
        intent.putExtra("extra_story_detail_params", this.f72444d);
        setResult(-1, intent);
        com.ss.android.ugc.aweme.story.player.c.d().f73264d = 0;
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f72443c, false, 83203, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72443c, false, 83203, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        LifeFeedModel a2 = LifeFeedModel.a((FragmentActivity) this);
        if (PatchProxy.isSupport(new Object[0], a2, LifeFeedModel.f72661d, false, 83605, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a2, LifeFeedModel.f72661d, false, 83605, new Class[0], Void.TYPE);
        } else {
            a2.f72662e.dispose();
        }
        com.ss.android.ugc.aweme.story.feed.viewmodel.b a3 = com.ss.android.ugc.aweme.story.feed.viewmodel.b.a();
        if (PatchProxy.isSupport(new Object[]{this}, a3, com.ss.android.ugc.aweme.story.feed.viewmodel.b.f73002a, false, 84402, new Class[]{LifecycleOwner.class}, Void.TYPE)) {
            com.ss.android.ugc.aweme.story.feed.viewmodel.b bVar = a3;
            PatchProxy.accessDispatch(new Object[]{this}, bVar, com.ss.android.ugc.aweme.story.feed.viewmodel.b.f73002a, false, 84402, new Class[]{LifecycleOwner.class}, Void.TYPE);
        } else {
            Iterator<String> it2 = a3.f73004b.iterator();
            while (it2.hasNext()) {
                com.ss.android.ugc.aweme.story.base.a.a a4 = com.ss.android.ugc.aweme.story.base.a.a.a();
                com.ss.android.ugc.aweme.arch.widgets.base.b<String> a5 = a4.a("story_message" + it2.next(), String.class);
                a5.removeObservers(this);
                a5.setValue("");
            }
        }
        if (!(this.r == null || this.s == null)) {
            this.r.removeListener(this.s);
        }
        this.f72445e = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void supportFinishAfterTransition() {
        /*
            r20 = this;
            r7 = r20
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f72443c
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 83195(0x144fb, float:1.16581E-40)
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0029
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f72443c
            r3 = 0
            r4 = 83195(0x144fb, float:1.16581E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0029:
            r20.d()
            boolean r0 = r20.g()
            if (r0 == 0) goto L_0x0036
            super.supportFinishAfterTransition()
            return
        L_0x0036:
            boolean r0 = r7.t
            if (r0 == 0) goto L_0x0103
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f72443c
            r3 = 0
            r4 = 83202(0x14502, float:1.16591E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0061
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f72443c
            r3 = 0
            r4 = 83202(0x14502, float:1.16591E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0106
        L_0x0061:
            int[] r0 = r7.l
            r1 = 2
            if (r0 == 0) goto L_0x006b
            int[] r0 = r7.l
            int r0 = r0.length
            if (r0 == r1) goto L_0x006e
        L_0x006b:
            r20.finish()
        L_0x006e:
            com.ss.android.ugc.aweme.story.detail.a.a r0 = r7.u
            android.view.View r2 = r7.i
            android.widget.FrameLayout r3 = r7.q
            int[] r4 = r7.l
            com.ss.android.ugc.aweme.story.detail.view.StoryDetailActivity$3 r5 = new com.ss.android.ugc.aweme.story.detail.view.StoryDetailActivity$3
            r5.<init>()
            r6 = 5
            java.lang.Object[] r9 = new java.lang.Object[r6]
            r9[r8] = r2
            r16 = 1
            r9[r16] = r3
            r9[r1] = r4
            r17 = 250(0xfa, float:3.5E-43)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r17)
            r18 = 3
            r9[r18] = r10
            r19 = 4
            r9[r19] = r5
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.story.detail.a.a.f72351a
            r12 = 0
            r13 = 83135(0x144bf, float:1.16497E-40)
            java.lang.Class[] r14 = new java.lang.Class[r6]
            java.lang.Class<android.view.View> r10 = android.view.View.class
            r14[r8] = r10
            java.lang.Class<android.view.View> r10 = android.view.View.class
            r14[r16] = r10
            java.lang.Class<int[]> r10 = int[].class
            r14[r1] = r10
            java.lang.Class r10 = java.lang.Integer.TYPE
            r14[r18] = r10
            java.lang.Class<android.animation.Animator$AnimatorListener> r10 = android.animation.Animator.AnimatorListener.class
            r14[r19] = r10
            java.lang.Class r15 = java.lang.Void.TYPE
            r10 = r0
            boolean r9 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r9 == 0) goto L_0x00ec
            java.lang.Object[] r9 = new java.lang.Object[r6]
            r9[r8] = r2
            r9[r16] = r3
            r9[r1] = r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            r9[r18] = r2
            r9[r19] = r5
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.story.detail.a.a.f72351a
            r12 = 0
            r13 = 83135(0x144bf, float:1.16497E-40)
            java.lang.Class[] r14 = new java.lang.Class[r6]
            java.lang.Class<android.view.View> r2 = android.view.View.class
            r14[r8] = r2
            java.lang.Class<android.view.View> r2 = android.view.View.class
            r14[r16] = r2
            java.lang.Class<int[]> r2 = int[].class
            r14[r1] = r2
            java.lang.Class r1 = java.lang.Integer.TYPE
            r14[r18] = r1
            java.lang.Class<android.animation.Animator$AnimatorListener> r1 = android.animation.Animator.AnimatorListener.class
            r14[r19] = r1
            java.lang.Class r15 = java.lang.Void.TYPE
            r10 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0106
        L_0x00ec:
            boolean r1 = r0.a()
            if (r1 != 0) goto L_0x0102
            com.ss.android.ugc.aweme.story.detail.a.c r1 = new com.ss.android.ugc.aweme.story.detail.a.c
            r14 = 250(0xfa, float:3.5E-43)
            r9 = r1
            r10 = r0
            r11 = r3
            r12 = r4
            r13 = r2
            r15 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r3.post(r1)
        L_0x0102:
            return
        L_0x0103:
            r20.finish()
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.detail.view.StoryDetailActivity.supportFinishAfterTransition():void");
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f72443c, false, 83181, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f72443c, false, 83181, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.detail.view.StoryDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r23) {
        /*
            r22 = this;
            r7 = r22
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r23
            com.meituan.robust.ChangeQuickRedirect r2 = f72443c
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 83178(0x144ea, float:1.16557E-40)
            r1 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r23
            com.meituan.robust.ChangeQuickRedirect r2 = f72443c
            r3 = 0
            r4 = 83178(0x144ea, float:1.16557E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0036:
            java.lang.String r0 = "com.ss.android.ugc.aweme.story.detail.view.StoryDetailActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r9)
            super.onCreate(r23)
            r0 = 2131691022(0x7f0f060e, float:1.9011104E38)
            r7.setContentView((int) r0)
            android.view.Window r0 = r22.getWindow()
            r1 = 32
            r0.setSoftInputMode(r1)
            r0 = 2131165620(0x7f0701b4, float:1.7945462E38)
            android.view.View r0 = r7.findViewById(r0)
            r7.i = r0
            r8 = 2131166114(0x7f0703a2, float:1.7946464E38)
            android.view.View r0 = r7.findViewById(r8)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r7.q = r0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f72443c
            r3 = 0
            r4 = 83187(0x144f3, float:1.1657E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0089
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f72443c
            r3 = 0
            r4 = 83187(0x144f3, float:1.1657E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00c2
        L_0x0089:
            com.ss.android.ugc.aweme.story.api.model.f r0 = r22.b()
            r7.f72444d = r0
            android.content.Intent r0 = r22.getIntent()
            java.lang.String r1 = "open_with_avatar"
            boolean r0 = r0.getBooleanExtra(r1, r10)
            r7.t = r0
            android.content.Intent r0 = r22.getIntent()
            java.lang.String r1 = "avatar_location"
            int[] r0 = r0.getIntArrayExtra(r1)
            r7.l = r0
            android.content.Intent r0 = r22.getIntent()
            java.lang.String r1 = "transition_has_avatar"
            boolean r0 = r0.getBooleanExtra(r1, r10)
            r7.m = r0
            boolean r0 = r7.t
            if (r0 == 0) goto L_0x00bb
            com.ss.android.ugc.aweme.story.api.model.f r0 = r7.f72444d
            r0.hasTransition = r10
        L_0x00bb:
            com.ss.android.ugc.aweme.story.detail.a.a r0 = new com.ss.android.ugc.aweme.story.detail.a.a
            r0.<init>(r7)
            r7.u = r0
        L_0x00c2:
            boolean r0 = r22.g()
            r11 = 200(0xc8, double:9.9E-322)
            r13 = 4
            if (r0 == 0) goto L_0x013b
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f72443c
            r3 = 0
            r4 = 83199(0x144ff, float:1.16587E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00f1
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f72443c
            r3 = 0
            r4 = 83199(0x144ff, float:1.16587E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0136
        L_0x00f1:
            boolean r0 = r22.g()
            if (r0 == 0) goto L_0x0136
            android.transition.TransitionSet r0 = new android.transition.TransitionSet
            r0.<init>()
            r7.r = r0
            android.transition.TransitionSet r0 = r7.r
            com.facebook.drawee.drawable.ScalingUtils$ScaleType r1 = com.facebook.drawee.drawable.ScalingUtils.ScaleType.CENTER_CROP
            android.transition.TransitionSet r1 = com.facebook.drawee.view.b.a(r1, r1)
            android.transition.TransitionSet r1 = r1.setDuration(r11)
            r0.addTransition(r1)
            android.transition.TransitionSet r0 = r7.r
            com.bytedance.ies.dmt.ui.c.c r1 = new com.bytedance.ies.dmt.ui.c.c
            r1.<init>()
            r0.setInterpolator(r1)
            com.ss.android.ugc.aweme.story.detail.view.StoryDetailActivity$1 r0 = new com.ss.android.ugc.aweme.story.detail.view.StoryDetailActivity$1
            r0.<init>()
            r7.s = r0
            android.transition.TransitionSet r0 = r7.r
            android.transition.Transition$TransitionListener r1 = r7.s
            r0.addListener(r1)
            android.view.Window r0 = r22.getWindow()
            android.transition.TransitionSet r1 = r7.r
            r0.setSharedElementEnterTransition(r1)
            com.ss.android.ugc.aweme.story.detail.view.StoryDetailActivity$2 r0 = new com.ss.android.ugc.aweme.story.detail.view.StoryDetailActivity$2
            r0.<init>()
            r7.setEnterSharedElementCallback(r0)
        L_0x0136:
            r22.supportPostponeEnterTransition()
            goto L_0x0202
        L_0x013b:
            boolean r0 = r7.t
            if (r0 == 0) goto L_0x0202
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f72443c
            r3 = 0
            r4 = 83201(0x14501, float:1.1659E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0166
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f72443c
            r3 = 0
            r4 = 83201(0x14501, float:1.1659E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0202
        L_0x0166:
            int[] r0 = r7.l
            if (r0 == 0) goto L_0x0202
            int[] r0 = r7.l
            int r0 = r0.length
            r1 = 2
            if (r0 == r1) goto L_0x0172
            goto L_0x0202
        L_0x0172:
            com.ss.android.ugc.aweme.story.detail.a.a r0 = r7.u
            android.view.View r2 = r7.i
            android.widget.FrameLayout r3 = r7.q
            int[] r4 = r7.l
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r14[r10] = r2
            r14[r9] = r3
            r14[r1] = r4
            r5 = 250(0xfa, float:3.5E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r21 = 3
            r14[r21] = r6
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.story.detail.a.a.f72351a
            r17 = 0
            r18 = 83134(0x144be, float:1.16496E-40)
            java.lang.Class[] r6 = new java.lang.Class[r13]
            java.lang.Class<android.view.View> r15 = android.view.View.class
            r6[r10] = r15
            java.lang.Class<android.view.View> r15 = android.view.View.class
            r6[r9] = r15
            java.lang.Class<int[]> r15 = int[].class
            r6[r1] = r15
            java.lang.Class r15 = java.lang.Integer.TYPE
            r6[r21] = r15
            java.lang.Class r20 = java.lang.Void.TYPE
            r15 = r0
            r19 = r6
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
            if (r6 == 0) goto L_0x01e0
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r14[r10] = r2
            r14[r9] = r3
            r14[r1] = r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r14[r21] = r2
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.story.detail.a.a.f72351a
            r17 = 0
            r18 = 83134(0x144be, float:1.16496E-40)
            java.lang.Class[] r2 = new java.lang.Class[r13]
            java.lang.Class<android.view.View> r3 = android.view.View.class
            r2[r10] = r3
            java.lang.Class<android.view.View> r3 = android.view.View.class
            r2[r9] = r3
            java.lang.Class<int[]> r3 = int[].class
            r2[r1] = r3
            java.lang.Class r1 = java.lang.Integer.TYPE
            r2[r21] = r1
            java.lang.Class r20 = java.lang.Void.TYPE
            r15 = r0
            r19 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0202
        L_0x01e0:
            boolean r1 = r0.a()
            if (r1 != 0) goto L_0x0202
            r1 = 0
            r2.setAlpha(r1)
            r3.setScaleX(r1)
            r3.setScaleY(r1)
            com.ss.android.ugc.aweme.story.detail.a.b r1 = new com.ss.android.ugc.aweme.story.detail.a.b
            r19 = 250(0xfa, float:3.5E-43)
            r14 = r1
            r15 = r0
            r16 = r3
            r17 = r4
            r18 = r2
            r14.<init>(r15, r16, r17, r18, r19)
            r3.postDelayed(r1, r11)
        L_0x0202:
            android.support.v4.app.FragmentManager r0 = r22.getSupportFragmentManager()
            java.lang.String r1 = "tag_story_feed"
            android.support.v4.app.Fragment r1 = r0.findFragmentByTag(r1)
            com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment r1 = (com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment) r1
            r7.g = r1
            com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment r1 = r7.g
            if (r1 != 0) goto L_0x0271
            java.lang.Object[] r14 = new java.lang.Object[r10]
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment.f4120c
            r17 = 1
            r18 = 83299(0x14563, float:1.16727E-40)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment> r20 = com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment.class
            r19 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
            if (r1 == 0) goto L_0x0241
            java.lang.Object[] r14 = new java.lang.Object[r10]
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment.f4120c
            r17 = 1
            r18 = 83299(0x14563, float:1.16727E-40)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment> r20 = com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment.class
            r19 = r1
        L_0x023a:
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment r1 = (com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment) r1
            goto L_0x026f
        L_0x0241:
            com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment$c r1 = com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment.f4122f
            java.lang.Object[] r14 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment.c.f72544a
            r17 = 0
            r18 = 83303(0x14567, float:1.16732E-40)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment> r20 = com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment.class
            r15 = r1
            r19 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
            if (r2 == 0) goto L_0x026a
            java.lang.Object[] r14 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment.c.f72544a
            r17 = 0
            r18 = 83303(0x14567, float:1.16732E-40)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment> r20 = com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment.class
            r15 = r1
            r19 = r2
            goto L_0x023a
        L_0x026a:
            com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment r1 = new com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment
            r1.<init>()
        L_0x026f:
            r7.g = r1
        L_0x0271:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "extra_story_detail_params"
            com.ss.android.ugc.aweme.story.api.model.f r3 = r7.f72444d
            r1.putSerializable(r2, r3)
            com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment r2 = r7.g
            r2.setArguments(r1)
            android.support.v4.app.FragmentTransaction r0 = r0.beginTransaction()
            com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment r1 = r7.g
            java.lang.String r2 = "tag_story_feed"
            r0.replace(r8, r1, r2)
            r0.commitAllowingStateLoss()
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f72443c
            r3 = 0
            r4 = 83179(0x144eb, float:1.16559E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x02b6
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f72443c
            r3 = 0
            r4 = 83179(0x144eb, float:1.16559E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0305
        L_0x02b6:
            com.ss.android.ugc.aweme.story.detail.controller.StoryDetailMobController r0 = new com.ss.android.ugc.aweme.story.detail.controller.StoryDetailMobController
            com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment r1 = r7.g
            r0.<init>(r7, r1)
            r7.p = r0
            com.ss.android.ugc.aweme.story.detail.controller.StoryDetailMobController r0 = r7.p
            com.ss.android.ugc.aweme.story.api.model.f r1 = r7.f72444d
            r0.f72406b = r1
            com.ss.android.ugc.aweme.story.api.model.f r0 = r7.f72444d
            int r0 = r0.detailType
            if (r0 != r13) goto L_0x02df
            com.ss.android.ugc.aweme.story.detail.controller.StoryFeedController r0 = new com.ss.android.ugc.aweme.story.detail.controller.StoryFeedController
            com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment r1 = r7.g
            r0.<init>(r7, r1)
            com.ss.android.ugc.aweme.story.api.model.f r1 = r7.f72444d
            r0.f72416b = r1
            com.ss.android.ugc.aweme.story.detail.f r1 = com.ss.android.ugc.aweme.story.detail.f.a()
            com.ss.android.ugc.aweme.story.feed.model.a r1 = r1.f72431c
            r0.f72417c = r1
            goto L_0x02f6
        L_0x02df:
            com.ss.android.ugc.aweme.story.detail.controller.StoryDetailController r0 = new com.ss.android.ugc.aweme.story.detail.controller.StoryDetailController
            com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment r1 = r7.g
            r0.<init>(r7, r1)
            com.ss.android.ugc.aweme.story.api.model.f r1 = r7.f72444d
            r0.f72399b = r1
            com.ss.android.ugc.aweme.story.detail.f r1 = com.ss.android.ugc.aweme.story.detail.f.a()
            com.ss.android.ugc.aweme.story.api.model.UserStory r1 = r1.f72430b
            r7.f72445e = r1
            com.ss.android.ugc.aweme.story.api.model.UserStory r1 = r7.f72445e
            r0.f72400c = r1
        L_0x02f6:
            com.ss.android.ugc.aweme.story.detail.controller.AutoPlayController r0 = new com.ss.android.ugc.aweme.story.detail.controller.AutoPlayController
            com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment r1 = r7.g
            r0.<init>(r7, r1)
            r7.o = r0
            com.ss.android.ugc.aweme.story.detail.controller.AutoPlayController r0 = r7.o
            com.ss.android.ugc.aweme.story.api.model.f r1 = r7.f72444d
            r0.f72394c = r1
        L_0x0305:
            java.lang.String r0 = "com.ss.android.ugc.aweme.story.detail.view.StoryDetailActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.detail.view.StoryDetailActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        KeyEvent keyEvent2 = keyEvent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), keyEvent2}, this, f72443c, false, 83192, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), keyEvent2}, this, f72443c, false, 83192, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        for (a a2 : this.f72446f) {
            if (a2.a(i2, keyEvent2)) {
                return true;
            }
        }
        int i3 = i2;
        return super.onKeyDown(i2, keyEvent);
    }
}
