package com.ss.android.ugc.aweme.story.feed.view;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.arch.lifecycle.ViewModelStore;
import android.arch.lifecycle.ViewModelStoreOwner;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.arch.widgets.base.c;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.h.n;
import com.ss.android.ugc.aweme.story.api.model.b;
import com.ss.android.ugc.aweme.story.detail.view.StoryDetailActivity;
import com.ss.android.ugc.aweme.story.feed.c.g;
import com.ss.android.ugc.aweme.story.feed.view.adapter.StoryFeedPagerAdapter;
import com.ss.android.ugc.aweme.story.feed.view.ui.StoryFeedGradientView;
import com.ss.android.ugc.aweme.story.feed.view.widget.FromDoushanWidget;
import com.ss.android.ugc.aweme.story.feed.view.widget.StoryCommentInputWidget;
import com.ss.android.ugc.aweme.story.feed.view.widget.StoryLoadingLineWidget;
import com.ss.android.ugc.aweme.story.feed.viewmodel.StoryChange;
import com.ss.android.ugc.aweme.story.feed.viewmodel.ViewPagerMotionEventViewModel;
import java.util.HashMap;

public abstract class a implements ViewModelStoreOwner, com.ss.android.ugc.aweme.story.feed.view.adapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4140a;

    /* renamed from: b  reason: collision with root package name */
    public b f4141b;

    /* renamed from: c  reason: collision with root package name */
    protected WidgetManager f4142c;

    /* renamed from: d  reason: collision with root package name */
    protected DataCenter f4143d;

    /* renamed from: e  reason: collision with root package name */
    public Fragment f4144e;

    /* renamed from: f  reason: collision with root package name */
    public View f4145f;
    public boolean g;
    public boolean h;
    public StoryFeedGradientView i;
    protected StoryFeedPagerAdapter j;
    public boolean k;
    public com.ss.android.ugc.aweme.story.feed.view.ui.a l = new com.ss.android.ugc.aweme.story.feed.view.ui.a();
    protected boolean m;
    protected Widget n;
    private View o;
    private View p;

    public void e() {
        if (PatchProxy.isSupport(new Object[0], this, f4140a, false, 83826, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4140a, false, 83826, new Class[0], Void.TYPE);
            return;
        }
        this.f4143d.a("story_feed_page_selected", (Object) null);
        this.m = false;
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f4140a, false, 83830, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4140a, false, 83830, new Class[0], Void.TYPE);
            return;
        }
        if (this.n != null) {
            ((com.ss.android.ugc.aweme.sticker.a) this.n).f();
        }
    }

    @NonNull
    public ViewModelStore getViewModelStore() {
        if (!PatchProxy.isSupport(new Object[0], this, f4140a, false, 83823, new Class[0], ViewModelStore.class)) {
            return new ViewModelStore();
        }
        return (ViewModelStore) PatchProxy.accessDispatch(new Object[0], this, f4140a, false, 83823, new Class[0], ViewModelStore.class);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f4140a, false, 83820, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4140a, false, 83820, new Class[0], Void.TYPE);
        } else if (this.p != null && this.o != null) {
            if (!com.ss.android.ugc.aweme.story.base.utils.b.a().b()) {
                this.f4145f.getContext();
                return;
            }
            int c2 = com.ss.android.ugc.aweme.story.base.utils.b.a().c();
            int d2 = com.ss.android.ugc.aweme.story.base.utils.b.a().d();
            if (c2 != 0) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.o.getLayoutParams();
                if (layoutParams.height != c2) {
                    layoutParams.height = c2;
                    this.o.setLayoutParams(layoutParams);
                }
            }
            if (d2 != 0) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.p.getLayoutParams();
                if (layoutParams2.height != d2) {
                    layoutParams2.height = d2;
                    this.p.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    public final boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f4140a, false, 83822, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f4140a, false, 83822, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f4144e.getActivity() == null) {
            return false;
        } else {
            b b2 = StoryChange.b(this.f4144e.getActivity());
            if (b2 != null && g.a(b2, this.f4141b)) {
                z = true;
            }
            return z;
        }
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f4140a, false, 83818, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4140a, false, 83818, new Class[0], Void.TYPE);
            return;
        }
        this.f4143d = DataCenter.a(c.a(this.f4144e, this), (LifecycleOwner) this.f4144e);
        this.f4143d.a("story_feed_adapter", (Object) this.j);
        this.f4143d.a("story_view_holder", (Object) this);
        this.f4142c = WidgetManager.a(this.f4144e, this.f4145f);
        this.f4142c.a(this.f4143d);
        this.f4142c.b(C0906R.id.vb, new StoryCommentInputWidget()).b(C0906R.id.b9_, new StoryLoadingLineWidget()).b(C0906R.id.aiv, new FromDoushanWidget());
        this.n = ((n) ServiceManager.get().getService(n.class)).a();
    }

    public final boolean g() {
        if (PatchProxy.isSupport(new Object[0], this, f4140a, false, 83831, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f4140a, false, 83831, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.j == null && this.f4144e == null) {
            return false;
        } else {
            FragmentActivity activity = this.f4144e.getActivity();
            String a2 = g.a(this.f4141b);
            int i2 = -1;
            if (PatchProxy.isSupport(new Object[]{activity, a2}, null, StoryChange.f72992a, true, 84394, new Class[]{FragmentActivity.class, String.class}, Integer.TYPE)) {
                i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{activity, a2}, null, StoryChange.f72992a, true, 84394, new Class[]{FragmentActivity.class, String.class}, Integer.TYPE)).intValue();
            } else {
                HashMap hashMap = (HashMap) StoryChange.a(activity).f72994c.getValue();
                if (PatchProxy.isSupport(new Object[]{hashMap, a2}, null, StoryChange.f72992a, true, 84395, new Class[]{HashMap.class, String.class}, Integer.TYPE)) {
                    i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{hashMap, a2}, null, StoryChange.f72992a, true, 84395, new Class[]{HashMap.class, String.class}, Integer.TYPE)).intValue();
                } else if (hashMap != null) {
                    Integer num = (Integer) hashMap.get(a2);
                    if (num != null) {
                        i2 = num.intValue();
                    }
                }
            }
            if (!g.a(this.f4141b, this.j.b(i2)) || !TextUtils.equals(g.a(this.f4141b), g.a(StoryChange.c(this.f4144e.getActivity())))) {
                return false;
            }
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x02b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
            r25 = this;
            r7 = r25
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f4140a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 83824(0x14770, float:1.17462E-40)
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0029
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f4140a
            r3 = 0
            r4 = 83824(0x14770, float:1.17462E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0029:
            android.support.v4.app.Fragment r0 = r7.f4144e
            if (r0 == 0) goto L_0x03b3
            android.support.v4.app.Fragment r0 = r7.f4144e
            android.support.v4.app.FragmentActivity r0 = r0.getActivity()
            if (r0 != 0) goto L_0x0037
            goto L_0x03b3
        L_0x0037:
            boolean r0 = r7.m
            if (r0 == 0) goto L_0x003c
            return
        L_0x003c:
            com.ss.android.ugc.aweme.story.api.model.b r0 = r7.f4141b
            boolean r0 = r0.isRead()
            r7.g = r0
            android.support.v4.app.Fragment r0 = r7.f4144e
            android.support.v4.app.FragmentActivity r0 = r0.getActivity()
            com.ss.android.ugc.aweme.arch.widgets.base.b r0 = com.ss.android.ugc.aweme.story.feed.viewmodel.ChangeUserModeViewModel.a(r0)
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r7.h = r8
            r9 = 2
            r10 = 1
            if (r0 == 0) goto L_0x0091
            r1 = -1
            int r2 = r0.hashCode()
            r3 = -2004557874(0xffffffff8884dfce, float:-7.997077E-34)
            if (r2 == r3) goto L_0x0083
            r3 = -777079990(0xffffffffd1aeb34a, float:-9.3791535E10)
            if (r2 == r3) goto L_0x0079
            r3 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r2 == r3) goto L_0x006f
            goto L_0x008c
        L_0x006f:
            java.lang.String r2 = "auto"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x008c
            r1 = 0
            goto L_0x008c
        L_0x0079:
            java.lang.String r2 = "click_next"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x008c
            r1 = 2
            goto L_0x008c
        L_0x0083:
            java.lang.String r2 = "click_previous"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x008c
            r1 = 1
        L_0x008c:
            if (r1 == 0) goto L_0x008f
            goto L_0x0091
        L_0x008f:
            r7.h = r10
        L_0x0091:
            android.support.v4.app.Fragment r0 = r7.f4144e
            android.content.Context r0 = r0.getContext()
            android.support.v4.app.FragmentActivity r0 = (android.support.v4.app.FragmentActivity) r0
            com.ss.android.ugc.aweme.story.api.model.b r1 = r7.f4141b
            com.ss.android.ugc.aweme.story.feed.viewmodel.StoryChange.a((android.support.v4.app.FragmentActivity) r0, (com.ss.android.ugc.aweme.story.api.model.b) r1)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f4140a
            r3 = 0
            r4 = 83827(0x14773, float:1.17467E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00c5
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f4140a
            r3 = 0
            r4 = 83827(0x14773, float:1.17467E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x02d3
        L_0x00c5:
            android.support.v4.app.Fragment r0 = r7.f4144e
            android.support.v4.app.FragmentActivity r0 = r0.getActivity()
            com.ss.android.ugc.aweme.story.api.model.UserStory r0 = com.ss.android.ugc.aweme.story.feed.viewmodel.StoryChange.c(r0)
            com.ss.android.ugc.aweme.story.api.model.b r1 = r7.f4141b
            java.lang.String r1 = com.ss.android.ugc.aweme.story.feed.c.g.a((com.ss.android.ugc.aweme.story.api.model.b) r1)
            com.ss.android.ugc.aweme.story.api.model.b r2 = r7.f4141b
            java.lang.String r2 = com.ss.android.ugc.aweme.story.feed.c.g.b((com.ss.android.ugc.aweme.story.api.model.b) r2)
            com.ss.android.ugc.aweme.story.api.model.b r3 = r7.f4141b
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r8] = r3
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.c.g.f72502a
            r14 = 1
            r15 = 83721(0x14709, float:1.17318E-40)
            java.lang.Class[] r4 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.b> r5 = com.ss.android.ugc.aweme.story.api.model.b.class
            r4[r8] = r5
            java.lang.Class r17 = java.lang.Integer.TYPE
            r16 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r4 == 0) goto L_0x0118
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r8] = r3
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.c.g.f72502a
            r14 = 1
            r15 = 83721(0x14709, float:1.17318E-40)
            java.lang.Class[] r3 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.b> r4 = com.ss.android.ugc.aweme.story.api.model.b.class
            r3[r8] = r4
            java.lang.Class r17 = java.lang.Integer.TYPE
        L_0x010b:
            r16 = r3
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L_0x0151
        L_0x0118:
            com.ss.android.ugc.aweme.story.feed.c.g$a r4 = com.ss.android.ugc.aweme.story.feed.c.g.f72503b
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r8] = r3
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.c.g.a.f72504a
            r14 = 0
            r15 = 83783(0x14747, float:1.17405E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.b> r6 = com.ss.android.ugc.aweme.story.api.model.b.class
            r5[r8] = r6
            java.lang.Class r17 = java.lang.Integer.TYPE
            r12 = r4
            r16 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r5 == 0) goto L_0x0149
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r8] = r3
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.c.g.a.f72504a
            r14 = 0
            r15 = 83783(0x14747, float:1.17405E-40)
            java.lang.Class[] r3 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.b> r5 = com.ss.android.ugc.aweme.story.api.model.b.class
            r3[r8] = r5
            java.lang.Class r17 = java.lang.Integer.TYPE
            r12 = r4
            goto L_0x010b
        L_0x0149:
            if (r3 == 0) goto L_0x0150
            int r3 = r3.getAwemeType()
            goto L_0x0151
        L_0x0150:
            r3 = 0
        L_0x0151:
            int r0 = com.ss.android.ugc.aweme.story.metrics.a.a.a((com.ss.android.ugc.aweme.story.api.model.UserStory) r0)
            r4 = 4
            java.lang.Object[] r11 = new java.lang.Object[r4]
            r11[r8] = r1
            r11[r10] = r2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r11[r9] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r6 = 3
            r11[r6] = r5
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.c.f.f72499a
            r14 = 1
            r15 = 83694(0x146ee, float:1.1728E-40)
            java.lang.Class[] r5 = new java.lang.Class[r4]
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r5[r8] = r16
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r5[r10] = r16
            java.lang.Class r16 = java.lang.Integer.TYPE
            r5[r9] = r16
            java.lang.Class r16 = java.lang.Integer.TYPE
            r5[r6] = r16
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r5 == 0) goto L_0x01c0
            java.lang.Object[] r11 = new java.lang.Object[r4]
            r11[r8] = r1
            r11[r10] = r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r11[r9] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11[r6] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.feed.c.f.f72499a
            r14 = 1
            r15 = 83694(0x146ee, float:1.1728E-40)
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r8] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r6] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x025f
        L_0x01c0:
            com.ss.android.ugc.aweme.story.a.b.m r3 = com.ss.android.ugc.aweme.story.a.a.a()
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r4[r8] = r1
            r4[r10] = r2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r4[r9] = r5
            com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.story.a.b.m.f71822a
            r21 = 0
            r22 = 85078(0x14c56, float:1.1922E-40)
            java.lang.Class[] r5 = new java.lang.Class[r6]
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            r5[r8] = r11
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            r5[r10] = r11
            java.lang.Class r11 = java.lang.Integer.TYPE
            r5[r9] = r11
            java.lang.Class<io.reactivex.Single> r24 = io.reactivex.Single.class
            r18 = r4
            r19 = r3
            r23 = r5
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r18, r19, r20, r21, r22, r23, r24)
            if (r4 == 0) goto L_0x0223
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r4[r8] = r1
            r4[r10] = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.story.a.b.m.f71822a
            r21 = 0
            r22 = 85078(0x14c56, float:1.1922E-40)
            java.lang.Class[] r0 = new java.lang.Class[r6]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r8] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r9] = r1
            java.lang.Class<io.reactivex.Single> r24 = io.reactivex.Single.class
            r18 = r4
            r19 = r3
            r23 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r18, r19, r20, r21, r22, r23, r24)
            io.reactivex.Single r0 = (io.reactivex.Single) r0
            goto L_0x024b
        L_0x0223:
            java.lang.String r4 = "userId"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r4)
            java.lang.String r4 = "storyId"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r4)
            com.ss.android.ugc.aweme.story.a.b.j r3 = r3.f71825d
            com.ss.android.ugc.aweme.story.a.b.k r4 = new com.ss.android.ugc.aweme.story.a.b.k
            r4.<init>(r1, r2, r0)
            io.reactivex.Observable r0 = r3.a(r4)
            io.reactivex.Scheduler r1 = io.reactivex.schedulers.Schedulers.io()
            io.reactivex.Observable r0 = r0.subscribeOn(r1)
            io.reactivex.ObservableSource r0 = (io.reactivex.ObservableSource) r0
            io.reactivex.Single r0 = io.reactivex.Single.fromObservable(r0)
            java.lang.String r1 = "Single.fromObservable(\n …chedulers.io())\n        )"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
        L_0x024b:
            io.reactivex.Observable r0 = r0.toObservable()
            io.reactivex.Scheduler r1 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            io.reactivex.Observable r0 = r0.observeOn(r1)
            com.ss.android.ugc.aweme.story.feed.c.f$1 r1 = new com.ss.android.ugc.aweme.story.feed.c.f$1
            r1.<init>()
            r0.subscribe((io.reactivex.Observer<? super T>) r1)
        L_0x025f:
            com.ss.android.ugc.aweme.story.api.model.b r0 = r7.f4141b
            r0.setRead(r10)
            com.ss.android.ugc.aweme.story.detail.g r0 = com.ss.android.ugc.aweme.story.detail.g.a.f72441a
            com.ss.android.ugc.aweme.story.api.model.b r1 = r7.f4141b
            java.lang.String r1 = com.ss.android.ugc.aweme.story.feed.c.g.a((com.ss.android.ugc.aweme.story.api.model.b) r1)
            com.ss.android.ugc.aweme.story.api.model.b r2 = r7.f4141b
            java.lang.String r2 = com.ss.android.ugc.aweme.story.feed.c.g.b((com.ss.android.ugc.aweme.story.api.model.b) r2)
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r8] = r1
            r11[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.detail.g.f72439a
            r14 = 0
            r15 = 83131(0x144bb, float:1.16491E-40)
            java.lang.Class[] r3 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r3[r8] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r3[r10] = r4
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r3 == 0) goto L_0x02b2
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r8] = r1
            r11[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.detail.g.f72439a
            r14 = 0
            r15 = 83131(0x144bb, float:1.16491E-40)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r8] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r10] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x02d3
        L_0x02b2:
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r3 = r0.f72440b
            java.lang.Object r3 = r3.get(r1)
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L_0x02c5
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r3.add(r2)
            goto L_0x02ce
        L_0x02c5:
            boolean r4 = r3.contains(r2)
            if (r4 != 0) goto L_0x02ce
            r3.add(r2)
        L_0x02ce:
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r0 = r0.f72440b
            r0.put(r1, r3)
        L_0x02d3:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.f4143d
            java.lang.String r1 = "story_feed_page_selected"
            r2 = 0
            r0.a((java.lang.String) r1, (java.lang.Object) r2)
            r7.m = r10
            com.ss.android.ugc.aweme.story.feed.view.adapter.StoryFeedPagerAdapter r0 = r7.j
            java.util.List<com.ss.android.ugc.aweme.story.api.model.b> r0 = r0.f4152f
            com.ss.android.ugc.aweme.story.api.model.b r1 = r7.f4141b
            java.lang.String r1 = com.ss.android.ugc.aweme.story.feed.c.g.b((com.ss.android.ugc.aweme.story.api.model.b) r1)
            int r11 = com.ss.android.ugc.aweme.story.feed.c.g.a((java.util.List<? extends com.ss.android.ugc.aweme.story.api.model.b>) r0, (java.lang.String) r1)
            android.support.v4.app.Fragment r0 = r7.f4144e
            android.support.v4.app.FragmentActivity r0 = r0.getActivity()
            com.ss.android.ugc.aweme.story.api.model.UserStory r12 = com.ss.android.ugc.aweme.story.feed.viewmodel.StoryChange.c(r0)
            int r0 = r12.getReadFlag()
            if (r0 != 0) goto L_0x03b2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f4140a
            r3 = 0
            r4 = 83825(0x14771, float:1.17464E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x033c
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f4140a
            r3 = 0
            r4 = 83825(0x14771, float:1.17464E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r25
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x034c
        L_0x033c:
            com.ss.android.ugc.aweme.story.feed.view.adapter.StoryFeedPagerAdapter r0 = r7.j
            if (r0 == 0) goto L_0x034b
            com.ss.android.ugc.aweme.story.feed.view.adapter.StoryFeedPagerAdapter r0 = r7.j
            int r0 = r0.getCount()
            int r0 = r0 - r10
            if (r11 != r0) goto L_0x034b
            r0 = 1
            goto L_0x034c
        L_0x034b:
            r0 = 0
        L_0x034c:
            if (r0 == 0) goto L_0x0361
            r12.setReadFlag(r10)
            org.greenrobot.eventbus.c r0 = org.greenrobot.eventbus.c.a()
            com.ss.android.ugc.aweme.story.feed.a.b r1 = new com.ss.android.ugc.aweme.story.feed.a.b
            java.lang.String r2 = com.ss.android.ugc.aweme.story.feed.c.g.a((com.ss.android.ugc.aweme.story.api.model.UserStory) r12)
            r1.<init>(r2)
            r0.d(r1)
        L_0x0361:
            com.ss.android.ugc.aweme.story.feed.view.adapter.StoryFeedPagerAdapter r0 = r7.j
            java.util.List<com.ss.android.ugc.aweme.story.api.model.b> r0 = r0.f4152f
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r8] = r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r12[r10] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.story.feed.c.g.f72502a
            r15 = 1
            r16 = 83737(0x14719, float:1.1734E-40)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<java.util.List> r2 = java.util.List.class
            r1[r8] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r10] = r2
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x03ad
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r8] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r12[r10] = r0
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.story.feed.c.g.f72502a
            r15 = 1
            r16 = 83737(0x14719, float:1.1734E-40)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r0[r8] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x03ad:
            com.ss.android.ugc.aweme.story.feed.c.g$a r1 = com.ss.android.ugc.aweme.story.feed.c.g.f72503b
            r1.a((java.util.List<com.ss.android.ugc.aweme.story.api.model.b>) r0, (int) r11)
        L_0x03b2:
            return
        L_0x03b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.view.a.d():void");
    }

    public final com.ss.android.ugc.aweme.sticker.c b(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f4140a, false, 83833, new Class[]{b.class}, com.ss.android.ugc.aweme.sticker.c.class)) {
            return (com.ss.android.ugc.aweme.sticker.c) PatchProxy.accessDispatch(new Object[]{bVar}, this, f4140a, false, 83833, new Class[]{b.class}, com.ss.android.ugc.aweme.sticker.c.class);
        }
        String str = "";
        if ((this.f4145f.getContext() instanceof StoryDetailActivity) && ((StoryDetailActivity) this.f4145f.getContext()).f72444d != null) {
            str = ((StoryDetailActivity) this.f4145f.getContext()).f72444d.eventType;
        }
        com.ss.android.ugc.aweme.sticker.c cVar = new com.ss.android.ugc.aweme.sticker.c();
        cVar.b(String.valueOf(bVar.getLifeStory().getAuthorUserId())).a(str).c(bVar.getLifeStory().getGroupId()).d(com.ss.android.ugc.aweme.story.base.api.a.f71919b.toJson((Object) bVar.getLogPb()));
        return cVar;
    }

    public void a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f4140a, false, 83819, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f4140a, false, 83819, new Class[]{b.class}, Void.TYPE);
            return;
        }
        this.f4141b = bVar;
        this.f4143d.a("story_feed_data", (Object) bVar);
        this.o = this.f4145f.findViewById(C0906R.id.d5u);
        this.p = this.f4145f.findViewById(C0906R.id.ms);
        b();
        this.f4145f.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72696a;

            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)}, this, f72696a, false, 83834, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)}, this, f72696a, false, 83834, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                a.this.b();
            }
        });
        if (PatchProxy.isSupport(new Object[0], this, f4140a, false, 83821, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4140a, false, 83821, new Class[0], Void.TYPE);
            return;
        }
        this.i = (StoryFeedGradientView) this.f4145f.findViewById(C0906R.id.ale);
        ((ViewPagerMotionEventViewModel) ViewModelProviders.of(this.f4144e.getActivity()).get(ViewPagerMotionEventViewModel.class)).a().observe(this.f4144e, new Observer<com.ss.android.ugc.aweme.story.feed.a.c>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72698a;

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
                if (r0 != 6) goto L_0x007b;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ void onChanged(@android.support.annotation.Nullable java.lang.Object r11) {
                /*
                    r10 = this;
                    r7 = r11
                    com.ss.android.ugc.aweme.story.feed.a.c r7 = (com.ss.android.ugc.aweme.story.feed.a.c) r7
                    r8 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r8]
                    r9 = 0
                    r0[r9] = r7
                    com.meituan.robust.ChangeQuickRedirect r2 = f72698a
                    java.lang.Class[] r5 = new java.lang.Class[r8]
                    java.lang.Class<com.ss.android.ugc.aweme.story.feed.a.c> r1 = com.ss.android.ugc.aweme.story.feed.a.c.class
                    r5[r9] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r3 = 0
                    r4 = 83835(0x1477b, float:1.17478E-40)
                    r1 = r10
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                    if (r0 == 0) goto L_0x0035
                    java.lang.Object[] r0 = new java.lang.Object[r8]
                    r0[r9] = r7
                    com.meituan.robust.ChangeQuickRedirect r2 = f72698a
                    r3 = 0
                    r4 = 83835(0x1477b, float:1.17478E-40)
                    java.lang.Class[] r5 = new java.lang.Class[r8]
                    java.lang.Class<com.ss.android.ugc.aweme.story.feed.a.c> r1 = com.ss.android.ugc.aweme.story.feed.a.c.class
                    r5[r9] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r1 = r10
                    com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                    return
                L_0x0035:
                    if (r7 == 0) goto L_0x007b
                    int r0 = r7.f72457c
                    r1 = 2
                    r2 = 200(0xc8, double:9.9E-322)
                    if (r0 == r1) goto L_0x0066
                    r1 = 4
                    if (r0 == r1) goto L_0x0045
                    r1 = 6
                    if (r0 == r1) goto L_0x0066
                    goto L_0x007b
                L_0x0045:
                    com.ss.android.ugc.aweme.story.feed.view.a r0 = com.ss.android.ugc.aweme.story.feed.view.a.this
                    boolean r0 = r0.c()
                    if (r0 == 0) goto L_0x007b
                    com.ss.android.ugc.aweme.story.feed.view.a r0 = com.ss.android.ugc.aweme.story.feed.view.a.this
                    boolean r0 = r0.k
                    if (r0 != 0) goto L_0x007b
                    com.ss.android.ugc.aweme.story.feed.view.a r0 = com.ss.android.ugc.aweme.story.feed.view.a.this
                    com.ss.android.ugc.aweme.story.feed.view.ui.a r0 = r0.l
                    com.ss.android.ugc.aweme.story.feed.view.a r1 = com.ss.android.ugc.aweme.story.feed.view.a.this
                    com.ss.android.ugc.aweme.story.feed.view.ui.StoryFeedGradientView r1 = r1.i
                    boolean r0 = r0.a((android.view.View) r1, (boolean) r9, (long) r2)
                    if (r0 == 0) goto L_0x007b
                    com.ss.android.ugc.aweme.story.feed.view.a r0 = com.ss.android.ugc.aweme.story.feed.view.a.this
                    r0.k = r8
                    return
                L_0x0066:
                    com.ss.android.ugc.aweme.story.feed.view.a r0 = com.ss.android.ugc.aweme.story.feed.view.a.this
                    boolean r0 = r0.k
                    if (r0 == 0) goto L_0x007b
                    com.ss.android.ugc.aweme.story.feed.view.a r0 = com.ss.android.ugc.aweme.story.feed.view.a.this
                    com.ss.android.ugc.aweme.story.feed.view.ui.a r0 = r0.l
                    com.ss.android.ugc.aweme.story.feed.view.a r1 = com.ss.android.ugc.aweme.story.feed.view.a.this
                    com.ss.android.ugc.aweme.story.feed.view.ui.StoryFeedGradientView r1 = r1.i
                    r0.a((android.view.View) r1, (boolean) r8, (long) r2)
                    com.ss.android.ugc.aweme.story.feed.view.a r0 = com.ss.android.ugc.aweme.story.feed.view.a.this
                    r0.k = r9
                L_0x007b:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.view.a.AnonymousClass2.onChanged(java.lang.Object):void");
            }
        });
    }

    public a(View view, Fragment fragment, StoryFeedPagerAdapter storyFeedPagerAdapter) {
        this.f4144e = fragment;
        this.f4145f = view;
        this.j = storyFeedPagerAdapter;
        a();
        if (PatchProxy.isSupport(new Object[0], this, f4140a, false, 83832, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4140a, false, 83832, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.story.base.a.a.a().a("dismiss_sticker_pop_up_window", Boolean.class).observe(this.f4144e, new Observer<Boolean>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72700a;

            public final /* synthetic */ void onChanged(@Nullable Object obj) {
                Boolean bool = (Boolean) obj;
                if (PatchProxy.isSupport(new Object[]{bool}, this, f72700a, false, 83836, new Class[]{Boolean.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bool}, this, f72700a, false, 83836, new Class[]{Boolean.class}, Void.TYPE);
                    return;
                }
                if (bool.booleanValue()) {
                    a.this.f();
                }
            }
        });
    }
}
