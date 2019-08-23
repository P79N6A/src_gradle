package com.ss.android.ugc.aweme.shortvideo.filter.func;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v4.math.MathUtils;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ViewStubCompat;
import android.text.TextUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.bytedance.common.utility.Lists;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.filter.CircleViewPager;
import com.ss.android.ugc.aweme.filter.EmptyFilterAdapter;
import com.ss.android.ugc.aweme.filter.FilterViewModel;
import com.ss.android.ugc.aweme.filter.ac;
import com.ss.android.ugc.aweme.filter.at;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.filter.o;
import com.ss.android.ugc.aweme.filter.y;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.c.c;
import com.ss.android.ugc.aweme.shortvideo.c.i;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.filter.a;
import com.ss.android.ugc.aweme.shortvideo.filter.d;
import com.ss.android.ugc.aweme.shortvideo.filter.e;
import com.ss.android.ugc.aweme.shortvideo.j.b;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.story.widget.CompositeStoryFilterIndicator;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public class RecordFilterModuleImpl implements LifecycleObserver, d, e, b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3945a;
    private FrameLayout A;
    private FrameLayout B;

    /* renamed from: b  reason: collision with root package name */
    public final AbsActivity f3946b;

    /* renamed from: c  reason: collision with root package name */
    protected final com.ss.android.ugc.aweme.shortvideo.j.d f3947c;

    /* renamed from: d  reason: collision with root package name */
    public final ac.a f3948d;

    /* renamed from: e  reason: collision with root package name */
    public h f3949e;

    /* renamed from: f  reason: collision with root package name */
    public h f3950f;
    protected i g;
    public boolean h;
    boolean i;
    public boolean j;
    boolean k;
    public ac.c l;
    public ac.b m;
    public ac.d n;
    public EmptyFilterAdapter o;
    public h p;
    private final FrameLayout q;
    private final com.ss.android.ugc.aweme.base.b.a.d<JSONObject> r;
    private com.ss.android.ugc.aweme.base.activity.e s;
    private ValueAnimator t;
    private ViewPager.OnPageChangeListener u;
    private boolean v;
    private boolean w;
    private at x;
    private ViewStubCompat y;
    private CompositeStoryFilterIndicator z;

    public final /* bridge */ /* synthetic */ a c() {
        return this;
    }

    @NotNull
    public final i f() {
        return this.g;
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3945a, false, 77264, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3945a, false, 77264, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!this.o.f47336c) {
            CircleViewPager a2 = this.n.a();
            if (a2 != null) {
                a2.setCurrentItem(this.f3949e.f47602f, false);
            }
            if (e().f47602f < this.o.getCount() - 1) {
                this.h = false;
            }
            if (z2) {
                l();
            }
            this.p = this.f3949e;
        }
    }

    public final void b(boolean z2, boolean z3) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f3945a, false, 77285, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3)}, this, f3945a, false, 77285, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.g.a(z2, z3);
    }

    public final void a(boolean z2, boolean z3) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f3945a, false, 77291, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3)}, this, f3945a, false, 77291, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.g.c(z2, z3);
    }

    public final void a(List<h> list, int i2) {
        List<h> list2 = list;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i2)}, this, f3945a, false, 77297, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Integer.valueOf(i2)}, this, f3945a, false, 77297, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        CircleViewPager a2 = this.n.a();
        if (a2 != null && !list.isEmpty()) {
            EmptyFilterAdapter emptyFilterAdapter = (EmptyFilterAdapter) a2.getAdapter();
            emptyFilterAdapter.a(true);
            emptyFilterAdapter.a(list2);
            ai.a("RecordFilterModuleImpl setLiveFilter currentPos: " + i3);
            if (i3 == -1) {
                i3 = 0;
            }
            a2.setCurrentItem(i3);
        }
    }

    public final int d() {
        if (!PatchProxy.isSupport(new Object[0], this, f3945a, false, 77289, new Class[0], Integer.TYPE)) {
            return this.g.f();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3945a, false, 77289, new Class[0], Integer.TYPE)).intValue();
    }

    public final h e() {
        if (PatchProxy.isSupport(new Object[0], this, f3945a, false, 77268, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], this, f3945a, false, 77268, new Class[0], h.class);
        }
        h n2 = n();
        if (n2 == null) {
            n2 = y.a();
        }
        return n2;
    }

    public final int i() {
        if (!PatchProxy.isSupport(new Object[0], this, f3945a, false, 77276, new Class[0], Integer.TYPE)) {
            return this.g.b();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3945a, false, 77276, new Class[0], Integer.TYPE)).intValue();
    }

    public final int j() {
        if (!PatchProxy.isSupport(new Object[0], this, f3945a, false, 77277, new Class[0], Integer.TYPE)) {
            return this.g.c();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3945a, false, 77277, new Class[0], Integer.TYPE)).intValue();
    }

    public final int k() {
        if (!PatchProxy.isSupport(new Object[0], this, f3945a, false, 77286, new Class[0], Integer.TYPE)) {
            return this.g.e();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3945a, false, 77286, new Class[0], Integer.TYPE)).intValue();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3945a, false, 77293, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3945a, false, 77293, new Class[0], Void.TYPE);
            return;
        }
        if (this.t != null) {
            this.t.cancel();
        }
    }

    @NonNull
    private String m() {
        if (PatchProxy.isSupport(new Object[0], this, f3945a, false, 77263, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f3945a, false, 77263, new Class[0], String.class);
        } else if (this.f3949e == null) {
            return "";
        } else {
            if (!(this.f3949e instanceof o) || !TextUtils.equals("filter_box", ((o) this.f3949e).o)) {
                return "click";
            }
            return "filter_box";
        }
    }

    private h n() {
        if (PatchProxy.isSupport(new Object[0], this, f3945a, false, 77269, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], this, f3945a, false, 77269, new Class[0], h.class);
        } else if (this.f3949e == null) {
            return null;
        } else {
            if (this.o.f47336c) {
                return a(this.o.f47335b, this.f3949e);
            }
            return b(this.o.a(), this.f3949e);
        }
    }

    public void h() {
        if (PatchProxy.isSupport(new Object[0], this, f3945a, false, 77275, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3945a, false, 77275, new Class[0], Void.TYPE);
            return;
        }
        a(e());
        if (!com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.SplitFilterBeauty)) {
            e(k());
            a(i());
            b(j());
        }
    }

    public final void l() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f3945a, false, 77298, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3945a, false, 77298, new Class[0], Void.TYPE);
            return;
        }
        String c2 = com.ss.android.ugc.aweme.port.in.a.d().c(this.p);
        String c3 = com.ss.android.ugc.aweme.port.in.a.d().c(this.f3949e);
        if (this.z == null) {
            this.z = (CompositeStoryFilterIndicator) this.y.inflate();
        }
        CompositeStoryFilterIndicator compositeStoryFilterIndicator = this.z;
        com.ss.android.ugc.aweme.story.widget.a aVar = new com.ss.android.ugc.aweme.story.widget.a(this.p.f47599c, c2);
        com.ss.android.ugc.aweme.story.widget.a aVar2 = new com.ss.android.ugc.aweme.story.widget.a(this.f3949e.f47599c, c3);
        if (this.p.f47602f < this.f3949e.f47602f) {
            z2 = true;
        }
        compositeStoryFilterIndicator.a(aVar, aVar2, z2);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3945a, false, 77258, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3945a, false, 77258, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f3945a, false, 77256, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3945a, false, 77256, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f3945a, false, 77257, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3945a, false, 77257, new Class[0], Void.TYPE);
        } else if (this.u == null) {
            this.u = new ViewPager.SimpleOnPageChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67730a;

                public void onPageSelected(int i) {
                    boolean z = true;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f67730a, false, 77306, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f67730a, false, 77306, new Class[]{Integer.TYPE}, Void.TYPE);
                    } else if (i < RecordFilterModuleImpl.this.o.a().size()) {
                        h hVar = (h) RecordFilterModuleImpl.this.o.a().get(i);
                        RecordFilterModuleImpl.this.e(hVar);
                        if (RecordFilterModuleImpl.this.o.f47336c) {
                            RecordFilterModuleImpl.this.f3947c.a(hVar.j);
                        } else {
                            RecordFilterModuleImpl.this.m.b(RecordFilterModuleImpl.this.f3949e);
                        }
                        RecordFilterModuleImpl.this.m.a(RecordFilterModuleImpl.this.f3949e);
                        if (i < RecordFilterModuleImpl.this.o.getCount() - 1) {
                            RecordFilterModuleImpl.this.h = false;
                        }
                        RecordFilterModuleImpl recordFilterModuleImpl = RecordFilterModuleImpl.this;
                        if (!recordFilterModuleImpl.k && recordFilterModuleImpl.j) {
                            z = false;
                        }
                        if (z) {
                            RecordFilterModuleImpl.this.l();
                        }
                        RecordFilterModuleImpl.this.j = false;
                        RecordFilterModuleImpl.this.p = RecordFilterModuleImpl.this.f3949e;
                    }
                }
            };
        }
        CircleViewPager a2 = this.n.a();
        if (a2 != null) {
            a2.setAdapter(this.o);
            this.o.a(this.o.a(), true);
            a2.removeOnPageChangeListener(this.u);
            a2.addOnPageChangeListener(this.u);
            a2.setOnScrolledListener(new CircleViewPager.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67728a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f67728a, false, 77305, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f67728a, false, 77305, new Class[0], Void.TYPE);
                        return;
                    }
                    if (!RecordFilterModuleImpl.this.h) {
                        com.bytedance.ies.dmt.ui.d.a.c((Context) RecordFilterModuleImpl.this.f3946b, RecordFilterModuleImpl.this.f3946b.getString(C0906R.string.b4w)).a();
                        RecordFilterModuleImpl.this.h = true;
                    }
                }

                public final void a(float f2) {
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f67728a, false, 77304, new Class[]{Float.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f67728a, false, 77304, new Class[]{Float.TYPE}, Void.TYPE);
                    } else if (RecordFilterModuleImpl.this.o == null || !RecordFilterModuleImpl.this.o.f47336c) {
                        RecordFilterModuleImpl.this.m.a(f2);
                    } else {
                        RecordFilterModuleImpl.this.f3947c.a(RecordFilterModuleImpl.this.e().f47602f, RecordFilterModuleImpl.this.o.f47335b, f2);
                    }
                }
            });
            b(this.f3949e);
        }
    }

    public final void g() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f3945a, false, 77262, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3945a, false, 77262, new Class[0], Void.TYPE);
            return;
        }
        EffectCategoryResponse b2 = com.ss.android.ugc.aweme.port.in.a.d().b(this.f3949e);
        if (b2 == null) {
            str = "";
        } else {
            str = b2.name;
        }
        fh fhVar = ((ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) this.f3946b).get(ShortVideoContextViewModel.class)).f65401b;
        r.a("select_filter", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", fhVar.q).a("shoot_way", fhVar.r).a("draft_id", fhVar.v).a("enter_method", m()).a("enter_from", "video_shoot_page").a("filter_name", this.f3949e.f47600d).a("filter_id", this.f3949e.f47598b).a("tab_name", str).a("content_source", fhVar.d().getContentSource()).a("content_type", fhVar.d().getContentType()).a("enter_from", "video_shoot_page").f34114b);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v60, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: com.ss.android.ugc.aweme.filter.at$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r29 = this;
            r7 = r29
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3945a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 77259(0x12dcb, float:1.08263E-40)
            r1 = r29
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0029
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3945a
            r3 = 0
            r4 = 77259(0x12dcb, float:1.08263E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0029:
            com.bytedance.ies.uikit.base.AbsActivity r0 = r7.f3946b
            android.arch.lifecycle.ViewModelProvider r0 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r0)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel> r1 = com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.class
            android.arch.lifecycle.ViewModel r0 = r0.get(r1)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r0 = (com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel) r0
            com.ss.android.ugc.aweme.shortvideo.fh r0 = r0.f65401b
            java.lang.String r1 = "click_modify_entrance"
            com.ss.android.ugc.aweme.app.d.d r2 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r3 = "creation_id"
            java.lang.String r4 = r0.q
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "shoot_way"
            java.lang.String r4 = r0.r
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "content_source"
            com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r4 = r0.d()
            java.lang.String r4 = r4.getContentSource()
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "content_type"
            com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r0 = r0.d()
            java.lang.String r0 = r0.getContentType()
            com.ss.android.ugc.aweme.app.d.d r0 = r2.a((java.lang.String) r3, (java.lang.String) r0)
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "video_shoot_page"
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "scene_id"
            java.lang.String r3 = "1004"
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r1, (java.util.Map) r0)
            com.ss.android.ugc.aweme.filter.at r0 = r7.x
            if (r0 != 0) goto L_0x0293
            com.ss.android.ugc.aweme.filter.at$a r0 = new com.ss.android.ugc.aweme.filter.at$a
            com.bytedance.ies.uikit.base.AbsActivity r1 = r7.f3946b
            android.widget.FrameLayout r2 = r7.A
            android.widget.FrameLayout r3 = r7.B
            r0.<init>(r1, r2, r3)
            com.ss.android.ugc.aweme.base.activity.e r1 = r7.s
            com.ss.android.ugc.aweme.filter.at$a r0 = r0.a((com.ss.android.ugc.aweme.base.activity.e) r1)
            boolean r1 = r7.w
            com.ss.android.ugc.aweme.filter.at$a r15 = r0.a((boolean) r1)
            boolean r0 = com.ss.android.g.a.b()
            boolean r1 = com.ss.android.g.a.c()
            r0 = r0 | r1
            r14 = 1
            if (r0 != 0) goto L_0x00a9
            r0 = 1
            goto L_0x00aa
        L_0x00a9:
            r0 = 0
        L_0x00aa:
            com.ss.android.ugc.aweme.filter.ad r1 = r15.f47523b
            r1.i = r0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3945a
            r3 = 0
            r4 = 77253(0x12dc5, float:1.08255E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.filter.g> r6 = com.ss.android.ugc.aweme.filter.g.class
            r1 = r29
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00d7
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3945a
            r3 = 0
            r4 = 77253(0x12dc5, float:1.08255E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.filter.g> r6 = com.ss.android.ugc.aweme.filter.g.class
            r1 = r29
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.filter.g r0 = (com.ss.android.ugc.aweme.filter.g) r0
            goto L_0x0102
        L_0x00d7:
            com.ss.android.ugc.aweme.filter.g r0 = new com.ss.android.ugc.aweme.filter.g
            r17 = 100
            int r18 = r29.k()
            r19 = 100
            int r20 = r29.j()
            r21 = 100
            int r22 = r29.d()
            r23 = 100
            int r24 = r29.i()
            r25 = 2130837668(0x7f0200a4, float:1.7280297E38)
            r26 = 2130837665(0x7f0200a1, float:1.728029E38)
            r27 = 2130837667(0x7f0200a3, float:1.7280295E38)
            r28 = 2130837666(0x7f0200a2, float:1.7280293E38)
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x0102:
            java.lang.Object[] r9 = new java.lang.Object[r14]
            r9[r8] = r0
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.filter.at.a.f47522a
            r12 = 0
            r13 = 44416(0xad80, float:6.224E-41)
            java.lang.Class[] r1 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.filter.g> r2 = com.ss.android.ugc.aweme.filter.g.class
            r1[r8] = r2
            java.lang.Class<com.ss.android.ugc.aweme.filter.at$a> r2 = com.ss.android.ugc.aweme.filter.at.a.class
            r10 = r15
            r6 = 1
            r14 = r1
            r1 = r15
            r15 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r2 == 0) goto L_0x013a
            java.lang.Object[] r9 = new java.lang.Object[r6]
            r9[r8] = r0
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.filter.at.a.f47522a
            r12 = 0
            r13 = 44416(0xad80, float:6.224E-41)
            java.lang.Class[] r14 = new java.lang.Class[r6]
            java.lang.Class<com.ss.android.ugc.aweme.filter.g> r0 = com.ss.android.ugc.aweme.filter.g.class
            r14[r8] = r0
            java.lang.Class<com.ss.android.ugc.aweme.filter.at$a> r15 = com.ss.android.ugc.aweme.filter.at.a.class
            r10 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            r15 = r0
            com.ss.android.ugc.aweme.filter.at$a r15 = (com.ss.android.ugc.aweme.filter.at.a) r15
            goto L_0x017b
        L_0x013a:
            if (r0 != 0) goto L_0x0141
            com.ss.android.ugc.aweme.filter.g r0 = new com.ss.android.ugc.aweme.filter.g
            r0.<init>()
        L_0x0141:
            com.ss.android.ugc.aweme.filter.ad r2 = r1.f47523b
            java.lang.Object[] r9 = new java.lang.Object[r6]
            r9[r8] = r0
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.filter.ad.f47475a
            r12 = 0
            r13 = 44322(0xad22, float:6.2108E-41)
            java.lang.Class[] r14 = new java.lang.Class[r6]
            java.lang.Class<com.ss.android.ugc.aweme.filter.g> r3 = com.ss.android.ugc.aweme.filter.g.class
            r14[r8] = r3
            java.lang.Class r15 = java.lang.Void.TYPE
            r10 = r2
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r3 == 0) goto L_0x0173
            java.lang.Object[] r9 = new java.lang.Object[r6]
            r9[r8] = r0
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.filter.ad.f47475a
            r12 = 0
            r13 = 44322(0xad22, float:6.2108E-41)
            java.lang.Class[] r14 = new java.lang.Class[r6]
            java.lang.Class<com.ss.android.ugc.aweme.filter.g> r0 = com.ss.android.ugc.aweme.filter.g.class
            r14[r8] = r0
            java.lang.Class r15 = java.lang.Void.TYPE
            r10 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x017a
        L_0x0173:
            java.lang.String r3 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r3)
            r2.j = r0
        L_0x017a:
            r15 = r1
        L_0x017b:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3945a
            r3 = 0
            r4 = 77254(0x12dc6, float:1.08256E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.c.m> r9 = com.ss.android.ugc.aweme.shortvideo.c.m.class
            r1 = r29
            r10 = 1
            r6 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01a7
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3945a
            r3 = 0
            r4 = 77254(0x12dc6, float:1.08256E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.c.m> r6 = com.ss.android.ugc.aweme.shortvideo.c.m.class
            r1 = r29
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.shortvideo.c.m r0 = (com.ss.android.ugc.aweme.shortvideo.c.m) r0
            goto L_0x0228
        L_0x01a7:
            com.ss.android.ugc.aweme.shortvideo.c.m r9 = new com.ss.android.ugc.aweme.shortvideo.c.m
            int r11 = r29.k()
            int r12 = r29.i()
            int r13 = r29.j()
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3945a
            r3 = 0
            r4 = 77281(0x12de1, float:1.08294E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r29
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01e3
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3945a
            r3 = 0
            r4 = 77281(0x12de1, float:1.08294E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r29
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
        L_0x01e1:
            r14 = r0
            goto L_0x01ea
        L_0x01e3:
            com.ss.android.ugc.aweme.shortvideo.c.i r0 = r7.g
            int r0 = r0.g()
            goto L_0x01e1
        L_0x01ea:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3945a
            r3 = 0
            r4 = 77284(0x12de4, float:1.08298E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r29
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0218
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3945a
            r3 = 0
            r4 = 77284(0x12de4, float:1.08298E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r29
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
        L_0x0216:
            r6 = r0
            goto L_0x021f
        L_0x0218:
            com.ss.android.ugc.aweme.shortvideo.c.i r0 = r7.g
            int r0 = r0.d()
            goto L_0x0216
        L_0x021f:
            r1 = r9
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r1.<init>(r2, r3, r4, r5, r6)
            r0 = r9
        L_0x0228:
            com.ss.android.ugc.aweme.filter.ad r1 = r15.f47523b
            r1.m = r0
            boolean r0 = r7.v
            com.ss.android.ugc.aweme.filter.ad r1 = r15.f47523b
            r1.h = r0
            com.ss.android.ugc.aweme.shortvideo.filter.func.RecordFilterModuleImpl$4 r0 = new com.ss.android.ugc.aweme.shortvideo.filter.func.RecordFilterModuleImpl$4
            r0.<init>()
            com.ss.android.ugc.aweme.filter.ad r1 = r15.f47523b
            r1.f47480f = r0
            com.ss.android.ugc.aweme.shortvideo.filter.func.RecordFilterModuleImpl$3 r0 = new com.ss.android.ugc.aweme.shortvideo.filter.func.RecordFilterModuleImpl$3
            r0.<init>()
            com.ss.android.ugc.aweme.filter.at$a r0 = r15.a((com.ss.android.ugc.aweme.filter.at.d) r0)
            com.ss.android.ugc.aweme.shortvideo.filter.func.g r1 = new com.ss.android.ugc.aweme.shortvideo.filter.func.g
            r1.<init>(r7)
            com.ss.android.ugc.aweme.filter.ad r2 = r0.f47523b
            r2.l = r1
            com.ss.android.ugc.aweme.shortvideo.filter.b r1 = new com.ss.android.ugc.aweme.shortvideo.filter.b
            com.ss.android.ugc.aweme.filter.aa r2 = com.ss.android.ugc.aweme.filter.aa.a()
            com.ss.android.ugc.aweme.effectplatform.EffectPlatform r2 = r2.f()
            r1.<init>(r2)
            com.ss.android.ugc.aweme.filter.at$a r0 = r0.a((com.ss.android.ugc.aweme.filter.as) r1)
            com.ss.android.ugc.aweme.property.e r1 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r2 = com.ss.android.ugc.aweme.property.e.a.DisableFilter
            boolean r1 = r1.a((com.ss.android.ugc.aweme.property.e.a) r2)
            com.ss.android.ugc.aweme.filter.ad r2 = r0.f47523b
            r2.n = r1
            com.bytedance.ies.uikit.base.AbsActivity r1 = r7.f3946b
            android.arch.lifecycle.ViewModelProvider r1 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r1)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel> r2 = com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.class
            android.arch.lifecycle.ViewModel r1 = r1.get(r2)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r1 = (com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel) r1
            com.ss.android.ugc.aweme.shortvideo.fh r1 = r1.f65401b
            com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r1 = r1.d()
            com.ss.android.ugc.aweme.filter.at$a r0 = r0.a((com.ss.android.ugc.aweme.shortvideo.model.AVETParameter) r1)
            com.ss.android.ugc.aweme.filter.ad r1 = r0.f47523b
            r1.o = r10
            com.ss.android.ugc.aweme.filter.at r0 = r0.a()
            r7.x = r0
            com.ss.android.ugc.aweme.filter.h r0 = r7.f3949e
            if (r0 == 0) goto L_0x0293
            r29.g()
        L_0x0293:
            com.ss.android.ugc.aweme.filter.at r0 = r7.x
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.filter.func.RecordFilterModuleImpl.b():void");
    }

    public final void a(h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f3945a, false, 77265, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f3945a, false, 77265, new Class[]{h.class}, Void.TYPE);
        } else if (!this.i) {
            this.m.b(hVar);
        }
    }

    public final void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3945a, false, 77280, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3945a, false, 77280, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g.c(i2);
    }

    public final void d(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3945a, false, 77282, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3945a, false, 77282, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g.d(i2);
    }

    public void e(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3945a, false, 77287, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3945a, false, 77287, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g.e(i2);
    }

    public final void f(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3945a, false, 77290, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3945a, false, 77290, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g.g(i2);
    }

    public final void g(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3945a, false, 77294, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3945a, false, 77294, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        CircleViewPager a2 = this.n.a();
        if (a2 != null) {
            ((EmptyFilterAdapter) a2.getAdapter()).a(false);
            a2.setCurrentItem(i2);
        }
    }

    public void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3945a, false, 77279, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3945a, false, 77279, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g.b(i2);
    }

    public final void c(h hVar) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f3945a, false, 77272, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f3945a, false, 77272, new Class[]{h.class}, Void.TYPE);
        } else if (this.o != null && !this.o.f47336c) {
            this.f3949e = hVar;
            this.p = this.f3949e;
            if (!this.i) {
                i iVar = this.g;
                if (this.f3949e != null) {
                    i2 = this.f3949e.f47602f;
                }
                iVar.f(i2);
                FilterViewModel.a((AppCompatActivity) this.f3946b, hVar);
            }
        }
    }

    public final void d(h hVar) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f3945a, false, 77274, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f3945a, false, 77274, new Class[]{h.class}, Void.TYPE);
            return;
        }
        this.f3949e = hVar;
        this.p = this.f3949e;
        if (!this.i) {
            i iVar = this.g;
            if (this.f3949e != null) {
                i2 = this.f3949e.f47602f;
            }
            iVar.f(i2);
            FilterViewModel.a((AppCompatActivity) this.f3946b, hVar);
        }
    }

    public final void e(h hVar) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f3945a, false, 77273, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f3945a, false, 77273, new Class[]{h.class}, Void.TYPE);
            return;
        }
        this.f3949e = hVar;
        i iVar = this.g;
        if (this.f3949e != null) {
            i2 = this.f3949e.f47602f;
        }
        iVar.f(i2);
        FilterViewModel.a((AppCompatActivity) this.f3946b, hVar);
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f3945a, false, 77260, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f3945a, false, 77260, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        CircleViewPager a2 = this.n.a();
        if (!(a2 == null || a2.getAdapter() == null)) {
            a2.a(f2);
        }
    }

    public void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3945a, false, 77278, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3945a, false, 77278, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g.a(i2);
    }

    public final void b(h hVar) {
        int i2;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f3945a, false, 77266, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f3945a, false, 77266, new Class[]{h.class}, Void.TYPE);
            return;
        }
        if (hVar != null) {
            i2 = hVar.f47602f;
        } else {
            i2 = 0;
        }
        if (!this.i) {
            if (i2 != 0) {
                z2 = false;
            }
            this.k = z2;
            CircleViewPager a2 = this.n.a();
            if (a2 != null) {
                a2.setStartItem(i2);
            }
        }
    }

    public final void a(List<h> list) {
        List<h> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f3945a, false, 77295, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f3945a, false, 77295, new Class[]{List.class}, Void.TYPE);
            return;
        }
        CircleViewPager a2 = this.n.a();
        if (a2 != null && !list.isEmpty()) {
            EmptyFilterAdapter emptyFilterAdapter = (EmptyFilterAdapter) a2.getAdapter();
            emptyFilterAdapter.a(true);
            emptyFilterAdapter.a(list2);
        }
    }

    public final void b(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f3945a, false, 77267, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f3945a, false, 77267, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        b(true, true);
        c(true, true);
        a(true, true);
    }

    private h a(List<h> list, h hVar) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{list, hVar2}, this, f3945a, false, 77270, new Class[]{List.class, h.class}, h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[]{list, hVar2}, this, f3945a, false, 77270, new Class[]{List.class, h.class}, h.class);
        } else if (Lists.isEmpty(list) || hVar2 == null) {
            return null;
        } else {
            for (h next : list) {
                if (next != null && TextUtils.equals(next.f47599c, hVar2.f47599c)) {
                    return next;
                }
            }
            return null;
        }
    }

    private h b(List<h> list, h hVar) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{list, hVar2}, this, f3945a, false, 77271, new Class[]{List.class, h.class}, h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[]{list, hVar2}, this, f3945a, false, 77271, new Class[]{List.class, h.class}, h.class);
        } else if (Lists.isEmpty(list) || hVar2 == null) {
            return null;
        } else {
            for (h next : list) {
                if (next != null && next.f47598b == hVar2.f47598b) {
                    return next;
                }
            }
            return null;
        }
    }

    public final void b(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f3945a, false, 77296, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f3945a, false, 77296, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.c((int) (f2 * 100.0f));
            this.g.d((int) (f3 * 100.0f));
        }
        if (this.f3946b != null && (this.f3946b instanceof VideoRecordNewActivity)) {
            c cVar = ((VideoRecordNewActivity) this.f3946b).Q;
            if (cVar != null) {
                int i2 = (int) (f2 * 100.0f);
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, cVar, c.f65864a, false, 75205, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    c cVar2 = cVar;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, cVar2, c.f65864a, false, 75205, new Class[]{Integer.TYPE}, Void.TYPE);
                } else {
                    cVar.f65866c.c(i2);
                }
                int i3 = (int) (100.0f * f3);
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3)}, cVar, c.f65864a, false, 75206, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    c cVar3 = cVar;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3)}, cVar3, c.f65864a, false, 75206, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                cVar.f65866c.d(i3);
            }
        }
    }

    public final void c(boolean z2, boolean z3) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f3945a, false, 77288, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3)}, this, f3945a, false, 77288, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.g.b(z2, z3);
    }

    public final void a(float f2, float f3) {
        long j2;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f3945a, false, 77261, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f3945a, false, 77261, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        int width = this.q.getWidth();
        com.ss.android.ugc.aweme.utils.a.f75468b.a(this.f3946b, "filter_slide", "shoot_page", 0, 0, (JSONObject) this.r.a());
        if (Math.signum(f3) == Math.signum(f2)) {
            this.f3950f = this.f3949e;
            this.t = ValueAnimator.ofFloat(new float[]{f3, 0.0f});
            j2 = (long) (((float) ((long) (((float) width) * Math.abs(f3)))) / ((Math.abs(f2) / 1000.0f) / 2.0f));
        } else {
            List a2 = this.o.a();
            if (a2.isEmpty()) {
                this.f3950f = y.a();
                this.t = ValueAnimator.ofFloat(new float[]{f3, -1.0f});
            } else if (f2 >= 1.0E-5f) {
                this.f3950f = (h) a2.get(MathUtils.clamp(e().f47602f - 1, 0, a2.size() - 1));
                this.t = ValueAnimator.ofFloat(new float[]{f3, -1.0f});
            } else {
                this.f3950f = (h) a2.get(Math.min(this.o.a().size() - 1, e().f47602f + 1));
                this.t = ValueAnimator.ofFloat(new float[]{f3, 1.0f});
            }
            j2 = (long) (((float) ((long) (((float) width) * (1.0f - Math.abs(f3))))) / ((Math.abs(f2) / 1000.0f) / 2.0f));
        }
        long min = Math.min(j2, 400);
        this.t.setInterpolator(new DecelerateInterpolator());
        this.t.setDuration(min);
        this.t.addUpdateListener(new h(this));
        this.t.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f67736a;

            public final void onAnimationStart(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f67736a, false, 77316, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f67736a, false, 77316, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                RecordFilterModuleImpl.this.f3948d.a();
            }

            public final void onAnimationEnd(Animator animator) {
                String str;
                if (PatchProxy.isSupport(new Object[]{animator}, this, f67736a, false, 77317, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f67736a, false, 77317, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                if (RecordFilterModuleImpl.this.f3950f != null) {
                    RecordFilterModuleImpl.this.f3949e = RecordFilterModuleImpl.this.f3950f;
                    RecordFilterModuleImpl.this.g.f(RecordFilterModuleImpl.this.f3949e.f47602f);
                    CircleViewPager a2 = RecordFilterModuleImpl.this.n.a();
                    if (a2 != null) {
                        a2.setCurrentItem(RecordFilterModuleImpl.this.f3949e.f47602f, true);
                    }
                    EffectCategoryResponse b2 = com.ss.android.ugc.aweme.port.in.a.d().b(RecordFilterModuleImpl.this.f3949e);
                    if (b2 == null) {
                        str = "";
                    } else {
                        str = b2.name;
                    }
                    fh fhVar = ((ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) RecordFilterModuleImpl.this.f3946b).get(ShortVideoContextViewModel.class)).f65401b;
                    r.a("select_filter", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", fhVar.q).a("shoot_way", fhVar.r).a("draft_id", fhVar.v).a("enter_method", "slide").a("enter_from", "video_shoot_page").a("filter_name", RecordFilterModuleImpl.this.f3949e.f47600d).a("filter_id", RecordFilterModuleImpl.this.f3949e.f47598b).a("tab_name", str).a("content_source", fhVar.d().getContentSource()).a("content_type", fhVar.d().getContentType()).a("enter_from", "video_shoot_page").f34114b);
                }
                RecordFilterModuleImpl.this.f3948d.b();
            }
        });
        this.t.start();
    }

    public RecordFilterModuleImpl(AbsActivity absActivity, MediaRecordPresenter mediaRecordPresenter, com.ss.android.ugc.aweme.shortvideo.j.d dVar, FrameLayout frameLayout, ac.a aVar, ac.c cVar, ac.b bVar, com.ss.android.ugc.aweme.base.b.a.d<JSONObject> dVar2, ac.d dVar3) {
        boolean z2;
        AbsActivity absActivity2 = absActivity;
        com.ss.android.ugc.aweme.shortvideo.j.d dVar4 = dVar;
        FrameLayout frameLayout2 = frameLayout;
        ac.d dVar5 = dVar3;
        this.j = true;
        this.k = true;
        this.f3946b = absActivity2;
        this.f3947c = dVar4;
        this.q = frameLayout2;
        this.f3948d = aVar;
        this.r = dVar2;
        this.l = cVar;
        this.m = bVar;
        this.n = dVar5;
        this.y = (ViewStubCompat) frameLayout2.findViewById(C0906R.id.adr);
        this.A = (FrameLayout) frameLayout2.findViewById(C0906R.id.b_1);
        this.B = (FrameLayout) frameLayout2.findViewById(C0906R.id.b_2);
        absActivity.getLifecycle().addObserver(this);
        this.v = com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.UseContourSlider);
        if (com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.SplitFilterBeauty) || com.ss.android.g.a.b()) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.w = z2;
        MediaRecordPresenter mediaRecordPresenter2 = mediaRecordPresenter;
        this.g = new com.ss.android.ugc.aweme.shortvideo.c.a(dVar4, mediaRecordPresenter, this.v);
        this.o = new EmptyFilterAdapter(absActivity);
        List<h> b2 = com.ss.android.ugc.aweme.port.in.a.d().b();
        if (!Lists.isEmpty(b2)) {
            this.o.a(b2, false);
        }
        this.p = e();
        if (!com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.SplitFilterBeauty)) {
            if (PatchProxy.isSupport(new Object[0], this, f3945a, false, 77255, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3945a, false, 77255, new Class[0], Void.TYPE);
            } else {
                this.g.a();
            }
        }
        this.n = dVar5;
        com.ss.android.ugc.aweme.port.in.a.d().a().observe(absActivity, new d(this));
        FilterViewModel.a((AppCompatActivity) absActivity, Boolean.valueOf(com.ss.android.ugc.aweme.port.in.a.L.a(e.a.DisableFilter)));
        e eVar = new e(this, dVar4);
        if (PatchProxy.isSupport(new Object[]{absActivity2, eVar}, null, FilterViewModel.f47453a, true, 44413, new Class[]{AppCompatActivity.class, Observer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{absActivity2, eVar}, null, FilterViewModel.f47453a, true, 44413, new Class[]{AppCompatActivity.class, Observer.class}, Void.TYPE);
            return;
        }
        ((FilterViewModel) ViewModelProviders.of((FragmentActivity) absActivity).get(FilterViewModel.class)).c().observe(absActivity, eVar);
    }

    public RecordFilterModuleImpl(AbsActivity absActivity, com.ss.android.ugc.aweme.base.activity.e eVar, MediaRecordPresenter mediaRecordPresenter, com.ss.android.ugc.aweme.shortvideo.j.d dVar, FrameLayout frameLayout, ac.a aVar, ac.c cVar, ac.b bVar, com.ss.android.ugc.aweme.base.b.a.d<JSONObject> dVar2, ac.d dVar3) {
        this(absActivity, mediaRecordPresenter, dVar, frameLayout, aVar, cVar, bVar, dVar2, dVar3);
        this.s = eVar;
    }
}
