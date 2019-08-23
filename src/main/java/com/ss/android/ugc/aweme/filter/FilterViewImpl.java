package com.ss.android.ugc.aweme.filter;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LifecycleRegistry;
import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.e;
import com.ss.android.ugc.aweme.filter.at;
import com.ss.android.ugc.aweme.filter.l;
import com.ss.android.ugc.aweme.photomovie.transition.ITransition;
import com.ss.android.ugc.aweme.photomovie.transition.f;
import com.ss.android.ugc.aweme.shortvideo.c.g;
import com.ss.android.ugc.aweme.shortvideo.c.j;
import com.ss.android.ugc.aweme.shortvideo.c.m;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.sticker.c.c;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public class FilterViewImpl implements LifecycleObserver, View.OnClickListener, at {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3237a;
    @Nullable
    private at.c A;
    private final e B;
    private com.ss.android.ugc.aweme.base.activity.a C = new ap(this);

    /* renamed from: b  reason: collision with root package name */
    AppCompatActivity f3238b;

    /* renamed from: c  reason: collision with root package name */
    public b f3239c;

    /* renamed from: d  reason: collision with root package name */
    public b f3240d;

    /* renamed from: e  reason: collision with root package name */
    public a f3241e;

    /* renamed from: f  reason: collision with root package name */
    public List<at.d> f3242f = new ArrayList();
    public at.d g = new at.d() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47443a;

        public final void a(@Nullable h hVar) {
            h hVar2 = hVar;
            if (PatchProxy.isSupport(new Object[]{hVar2}, this, f47443a, false, 44398, new Class[]{h.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hVar2}, this, f47443a, false, 44398, new Class[]{h.class}, Void.TYPE);
                return;
            }
            for (at.d a2 : FilterViewImpl.this.f3242f) {
                a2.a(hVar2);
            }
        }

        public final void b(@Nullable h hVar) {
            h hVar2 = hVar;
            if (PatchProxy.isSupport(new Object[]{hVar2}, this, f47443a, false, 44399, new Class[]{h.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hVar2}, this, f47443a, false, 44399, new Class[]{h.class}, Void.TYPE);
                return;
            }
            for (at.d b2 : FilterViewImpl.this.f3242f) {
                b2.b(hVar2);
            }
        }

        public final void c(@NonNull h hVar) {
            h hVar2 = hVar;
            if (PatchProxy.isSupport(new Object[]{hVar2}, this, f47443a, false, 44400, new Class[]{h.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hVar2}, this, f47443a, false, 44400, new Class[]{h.class}, Void.TYPE);
                return;
            }
            for (at.d c2 : FilterViewImpl.this.f3242f) {
                c2.c(hVar2);
            }
        }
    };
    private View h;
    private FrameLayout i;
    private FrameLayout j;
    private AVDmtTextView k;
    private AVDmtTextView l;
    private boolean m;
    private boolean n;
    private boolean o;
    private g p;
    private m q;
    private j r;
    private FilterScrollerModule s;
    private i t;
    private boolean u;
    private boolean v;
    private boolean w;
    private AVETParameter x;
    @Nullable
    private at.b y;
    @Nullable
    private as z;

    static class a implements LifecycleOwner {

        /* renamed from: a  reason: collision with root package name */
        public LifecycleRegistry f47452a = new LifecycleRegistry(this);

        @NonNull
        public final Lifecycle getLifecycle() {
            return this.f47452a;
        }

        a() {
        }
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3237a, false, 44394, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3237a, false, 44394, new Class[0], Void.TYPE);
            return;
        }
        this.h = null;
        this.f3242f.clear();
        this.f3238b = null;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3237a, false, 44392, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3237a, false, 44392, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3239c != null) {
            this.f3239c.b(new c());
        }
        if (this.r != null) {
            this.r.b();
        }
        if (this.B != null) {
            this.B.b(this.C);
        }
    }

    public final void a() {
        g gVar;
        l lVar;
        ChangeQuickRedirect changeQuickRedirect;
        boolean z2;
        int i2;
        Class<l> cls;
        Object[] objArr;
        l.a aVar;
        Class[] clsArr;
        if (PatchProxy.isSupport(new Object[0], this, f3237a, false, 44391, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3237a, false, 44391, new Class[0], Void.TYPE);
            return;
        }
        this.i.removeAllViews();
        AppCompatActivity appCompatActivity = this.f3238b;
        FrameLayout frameLayout = this.i;
        if (PatchProxy.isSupport(new Object[]{appCompatActivity, frameLayout}, this, f3237a, false, 44390, new Class[]{AppCompatActivity.class, FrameLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{appCompatActivity, frameLayout}, this, f3237a, false, 44390, new Class[]{AppCompatActivity.class, FrameLayout.class}, Void.TYPE);
        } else if (this.h == null) {
            appCompatActivity.getLifecycle().addObserver(this);
            this.h = LayoutInflater.from(appCompatActivity).inflate(C0906R.layout.fx, frameLayout, false);
            FrameLayout frameLayout2 = (FrameLayout) this.h.findViewById(C0906R.id.cvg);
            this.k = (AVDmtTextView) this.h.findViewById(C0906R.id.d0x);
            this.l = (AVDmtTextView) this.h.findViewById(C0906R.id.d0w);
            if (this.o) {
                this.k.setOnClickListener(this);
                this.l.setOnClickListener(this);
            } else {
                this.h.findViewById(C0906R.id.adf).setVisibility(8);
            }
            this.k.setSelected(true);
            this.l.setSelected(false);
            final EffectFilterManager effectFilterManager = new EffectFilterManager();
            this.f3239c = new b(frameLayout, this.h, frameLayout2);
            this.h.findViewById(C0906R.id.cvy).setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f47445a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f47445a, false, 44402, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f47445a, false, 44402, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    FilterViewImpl.this.f3239c.b(new c());
                    FilterViewImpl.this.b();
                }
            });
            this.f3239c.a((f) new f.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f47447a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f47447a, false, 44403, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f47447a, false, 44403, new Class[0], Void.TYPE);
                        return;
                    }
                    FilterViewImpl.this.f3241e.f47452a.markState(Lifecycle.State.STARTED);
                    FilterViewImpl.this.g.a(null);
                }

                public final void d() {
                    if (PatchProxy.isSupport(new Object[0], this, f47447a, false, 44404, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f47447a, false, 44404, new Class[0], Void.TYPE);
                        return;
                    }
                    FilterViewImpl.this.f3241e.f47452a.markState(Lifecycle.State.CREATED);
                    FilterViewImpl.this.g.b(null);
                }
            });
            if (this.j != null) {
                if (PatchProxy.isSupport(new Object[]{this}, null, l.f47634a, true, 44120, new Class[]{FilterViewImpl.class}, l.class)) {
                    aVar = null;
                    changeQuickRedirect = l.f47634a;
                    z2 = true;
                    i2 = 44120;
                    cls = l.class;
                    objArr = new Object[]{this};
                    clsArr = new Class[]{FilterViewImpl.class};
                } else {
                    l.a aVar2 = l.f47635b;
                    if (PatchProxy.isSupport(new Object[]{this}, aVar2, l.a.f47637a, false, 44121, new Class[]{FilterViewImpl.class}, l.class)) {
                        changeQuickRedirect = l.a.f47637a;
                        z2 = false;
                        i2 = 44121;
                        cls = l.class;
                        objArr = new Object[]{this};
                        aVar = aVar2;
                        clsArr = new Class[]{FilterViewImpl.class};
                    } else {
                        Intrinsics.checkParameterIsNotNull(this, "filterView");
                        lVar = new l(this);
                        this.t = new i(lVar, appCompatActivity, this.j);
                        this.f3240d = new b(frameLayout, this.h, frameLayout2);
                        this.t.i = new f.a() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f47450a;

                            public final void a() {
                                if (PatchProxy.isSupport(new Object[0], this, f47450a, false, 44405, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f47450a, false, 44405, new Class[0], Void.TYPE);
                                    return;
                                }
                                FilterViewImpl.this.f3240d.b(new c());
                            }

                            public final void c() {
                                if (PatchProxy.isSupport(new Object[0], this, f47450a, false, 44406, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f47450a, false, 44406, new Class[0], Void.TYPE);
                                    return;
                                }
                                FilterViewImpl.this.f3240d.a((ITransition) new c());
                            }
                        };
                    }
                }
                lVar = (l) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, z2, i2, clsArr, cls);
                this.t = new i(lVar, appCompatActivity, this.j);
                this.f3240d = new b(frameLayout, this.h, frameLayout2);
                this.t.i = new f.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f47450a;

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f47450a, false, 44405, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f47450a, false, 44405, new Class[0], Void.TYPE);
                            return;
                        }
                        FilterViewImpl.this.f3240d.b(new c());
                    }

                    public final void c() {
                        if (PatchProxy.isSupport(new Object[0], this, f47450a, false, 44406, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f47450a, false, 44406, new Class[0], Void.TYPE);
                            return;
                        }
                        FilterViewImpl.this.f3240d.a((ITransition) new c());
                    }
                };
            }
            AppCompatActivity appCompatActivity2 = appCompatActivity;
            AppCompatActivity appCompatActivity3 = appCompatActivity;
            FilterScrollerModule filterScrollerModule = new FilterScrollerModule(appCompatActivity2, this.z, (LinearLayout) this.h.findViewById(C0906R.id.adn), com.ss.android.ugc.aweme.port.in.a.d().f47503d, this.x, this.t, this.w, this.v);
            this.s = filterScrollerModule;
            g.a aVar3 = new g.a(this.h.findViewById(C0906R.id.h3));
            aVar3.f65895d = new c(this.y);
            aVar3.f65896e = this.m;
            aVar3.f65894c = this.n;
            aVar3.f65897f = this.p;
            if (PatchProxy.isSupport(new Object[0], aVar3, g.a.f65892a, false, 75225, new Class[0], g.class)) {
                gVar = (g) PatchProxy.accessDispatch(new Object[0], aVar3, g.a.f65892a, false, 75225, new Class[0], g.class);
            } else {
                g gVar2 = new g(aVar3.f65893b, aVar3.f65897f, aVar3.f65894c, (byte) 0);
                gVar2.f65883d = aVar3.f65896e;
                gVar2.f65881b = aVar3.f65895d;
                gVar = gVar2;
            }
            this.r = gVar;
            ((FilterViewModel) ViewModelProviders.of((FragmentActivity) appCompatActivity3).get(FilterViewModel.class)).a().observe(this.f3241e, new aq(this));
        } else {
            FilterScrollerModule filterScrollerModule2 = this.s;
            if (PatchProxy.isSupport(new Object[0], filterScrollerModule2, FilterScrollerModule.f3231a, false, 44337, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], filterScrollerModule2, FilterScrollerModule.f3231a, false, 44337, new Class[0], Void.TYPE);
            } else if (filterScrollerModule2.g != null) {
                filterScrollerModule2.g.notifyDataSetChanged();
                h hVar = (h) ((FilterViewModel) ViewModelProviders.of((FragmentActivity) filterScrollerModule2.f3235e).get(FilterViewModel.class)).a().getValue();
                if (hVar != null) {
                    filterScrollerModule2.a(hVar);
                    filterScrollerModule2.g.c(hVar);
                }
            }
        }
        this.f3239c.a((ITransition) new c());
        if (this.r != null && this.u) {
            this.r.a();
        }
        if (this.B != null) {
            this.B.a(this.C);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean a(int i2) {
        if (i2 != 4) {
            return false;
        }
        if (this.t == null || !this.t.f47605c) {
            b();
        } else {
            this.t.b();
        }
        return true;
    }

    public final void a(h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f3237a, false, 44393, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f3237a, false, 44393, new Class[]{h.class}, Void.TYPE);
        } else if (this.f3238b != null) {
            FilterViewModel.a(this.f3238b, hVar);
        }
    }

    FilterViewImpl(ad adVar) {
        this.f3238b = adVar.q;
        this.i = adVar.f47476b;
        this.j = adVar.f47477c;
        this.o = adVar.g;
        this.n = adVar.h;
        this.m = adVar.i;
        this.y = adVar.f47480f;
        this.p = adVar.j;
        this.q = adVar.m;
        this.z = adVar.k;
        this.A = adVar.l;
        this.x = adVar.p;
        this.v = adVar.n;
        this.w = adVar.o;
        at.d dVar = adVar.f47478d;
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f3237a, false, 44389, new Class[]{at.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f3237a, false, 44389, new Class[]{at.d.class}, Void.TYPE);
        } else {
            this.f3242f.add(dVar);
        }
        this.B = adVar.f47479e;
        this.f3241e = new a();
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f3237a, false, 44395, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3237a, false, 44395, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view.getId() == this.k.getId()) {
            this.k.setSelected(true);
            this.l.setSelected(false);
            FilterScrollerModule filterScrollerModule = this.s;
            if (PatchProxy.isSupport(new Object[0], filterScrollerModule, FilterScrollerModule.f3231a, false, 44338, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], filterScrollerModule, FilterScrollerModule.f3231a, false, 44338, new Class[0], Void.TYPE);
            } else {
                filterScrollerModule.f3234d.setVisibility(0);
                filterScrollerModule.f3233c.setVisibility(0);
                filterScrollerModule.f3232b.setVisibility(0);
            }
            this.r.b();
            this.u = false;
            if (this.A != null) {
                this.A.a(0);
            }
        } else {
            this.k.setSelected(false);
            this.l.setSelected(true);
            FilterScrollerModule filterScrollerModule2 = this.s;
            if (PatchProxy.isSupport(new Object[0], filterScrollerModule2, FilterScrollerModule.f3231a, false, 44339, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], filterScrollerModule2, FilterScrollerModule.f3231a, false, 44339, new Class[0], Void.TYPE);
            } else {
                filterScrollerModule2.f3234d.setVisibility(8);
                filterScrollerModule2.f3233c.setVisibility(8);
                filterScrollerModule2.f3232b.setVisibility(8);
            }
            this.r.a();
            this.u = true;
            if (this.A != null) {
                this.A.a(1);
            }
        }
    }
}
