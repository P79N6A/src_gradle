package com.ss.android.ugc.aweme.filter;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.effect.c.a.a;
import com.ss.android.ugc.aweme.filter.i;
import com.ss.android.ugc.aweme.photomovie.transition.ITransition;
import com.ss.android.ugc.aweme.port.in.m;
import com.ss.android.ugc.aweme.port.in.y;
import com.ss.android.ugc.aweme.shortvideo.bj;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public class FilterScrollerModule implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3231a;

    /* renamed from: b  reason: collision with root package name */
    ImageView f3232b;

    /* renamed from: c  reason: collision with root package name */
    AVDmtTabLayout f3233c;

    /* renamed from: d  reason: collision with root package name */
    public RecyclerView f3234d;

    /* renamed from: e  reason: collision with root package name */
    public AppCompatActivity f3235e;

    /* renamed from: f  reason: collision with root package name */
    public LinearLayoutManager f3236f;
    public EffectFilterAdapter g;
    public List<EffectCategoryResponse> h = new ArrayList();
    public AVETParameter i;
    i j;
    h k;
    public h l;
    @Nullable
    public as m;
    public boolean n;
    private View o;
    private Map<h, a<h, Void>> p = new HashMap();
    private a<h, Void> q = new a<h, Void>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47430a;

        public final /* synthetic */ void a(Object obj) {
            h hVar = (h) obj;
            if (PatchProxy.isSupport(new Object[]{hVar}, this, f47430a, false, 44351, new Class[]{h.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hVar}, this, f47430a, false, 44351, new Class[]{h.class}, Void.TYPE);
                return;
            }
            FilterScrollerModule.this.g.notifyItemChanged(FilterScrollerModule.this.b(hVar));
        }

        public final /* synthetic */ void a(Object obj, @org.jetbrains.annotations.Nullable Object obj2) {
            h hVar = (h) obj;
            Void voidR = (Void) obj2;
            if (PatchProxy.isSupport(new Object[]{hVar, voidR}, this, f47430a, false, 44352, new Class[]{h.class, Void.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hVar, voidR}, this, f47430a, false, 44352, new Class[]{h.class, Void.class}, Void.TYPE);
                return;
            }
            int b2 = FilterScrollerModule.this.b(hVar);
            if (b2 >= 0 && b2 < FilterScrollerModule.this.g.getItemCount()) {
                FilterScrollerModule.this.g.notifyItemChanged(b2);
            }
            if (hVar.equals(FilterScrollerModule.this.l)) {
                FilterViewModel.a(FilterScrollerModule.this.f3235e, hVar);
                FilterScrollerModule.this.l = null;
            }
            w.c(hVar);
        }

        public final /* synthetic */ void a(Object obj, @org.jetbrains.annotations.Nullable Integer num, @org.jetbrains.annotations.Nullable String str, @org.jetbrains.annotations.Nullable Exception exc) {
            h hVar = (h) obj;
            if (PatchProxy.isSupport(new Object[]{hVar, num, str, exc}, this, f47430a, false, 44353, new Class[]{h.class, Integer.class, String.class, Exception.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hVar, num, str, exc}, this, f47430a, false, 44353, new Class[]{h.class, Integer.class, String.class, Exception.class}, Void.TYPE);
                return;
            }
            FilterScrollerModule.this.g.notifyItemChanged(FilterScrollerModule.this.b(hVar));
        }
    };

    public class TopSmoothScroller extends LinearSmoothScroller {
        public int getHorizontalSnapPreference() {
            return -1;
        }

        public int getVerticalSnapPreference() {
            return -1;
        }

        TopSmoothScroller(Context context) {
            super(context);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3231a, false, 44336, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3231a, false, 44336, new Class[0], Void.TYPE);
            return;
        }
        a(f.b(this.g, this.f3236f.findFirstVisibleItemPosition()));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void removeListener() {
        if (PatchProxy.isSupport(new Object[0], this, f3231a, false, 44340, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3231a, false, 44340, new Class[0], Void.TYPE);
            return;
        }
        if (this.m != null) {
            this.m.a();
        }
        if (PatchProxy.isSupport(new Object[0], this, f3231a, false, 44341, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3231a, false, 44341, new Class[0], Void.TYPE);
            return;
        }
        for (Map.Entry next : this.p.entrySet()) {
            aa.a().b((h) next.getKey(), (a) next.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        Single single;
        if (!this.j.k.b()) {
            if (PatchProxy.isSupport(new Object[0], this, f3231a, false, 44342, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3231a, false, 44342, new Class[0], Void.TYPE);
            } else {
                i iVar = this.j;
                if (PatchProxy.isSupport(new Object[0], iVar, i.f47603a, false, 44082, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], iVar, i.f47603a, false, 44082, new Class[0], Void.TYPE);
                } else {
                    if (iVar.f47606d == null) {
                        AppCompatActivity appCompatActivity = iVar.l;
                        FrameLayout frameLayout = iVar.m;
                        if (PatchProxy.isSupport(new Object[]{appCompatActivity, frameLayout}, iVar, i.f47603a, false, 44084, new Class[]{AppCompatActivity.class, FrameLayout.class}, Void.TYPE)) {
                            i iVar2 = iVar;
                            PatchProxy.accessDispatch(new Object[]{appCompatActivity, frameLayout}, iVar2, i.f47603a, false, 44084, new Class[]{AppCompatActivity.class, FrameLayout.class}, Void.TYPE);
                        } else {
                            iVar.f47606d = LayoutInflater.from(appCompatActivity).inflate(C0906R.layout.f7, frameLayout, false);
                            View view = iVar.f47606d;
                            if (view == null) {
                                Intrinsics.throwNpe();
                            }
                            iVar.f47608f = new b(frameLayout, view, view.findViewById(C0906R.id.cvg));
                            view.findViewById(C0906R.id.cvy).setOnClickListener(new i.e(iVar));
                            View findViewById = view.findViewById(C0906R.id.adi);
                            Intrinsics.checkExpressionValueIsNotNull(findViewById, "nonNullFilterBoxView.fin…yId(R.id.filter_box_view)");
                            iVar.f47607e = (FilterBoxView) findViewById;
                            FilterBoxView filterBoxView = iVar.f47607e;
                            if (filterBoxView == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("filterBoxView");
                            }
                            filterBoxView.setDependency(iVar.k);
                        }
                    }
                    b bVar = iVar.f47608f;
                    if (bVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("chooseFilterTransition");
                    }
                    bVar.a((ITransition) new i.m(iVar));
                    if (PatchProxy.isSupport(new Object[0], iVar, i.f47603a, false, 44086, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], iVar, i.f47603a, false, 44086, new Class[0], Void.TYPE);
                    } else {
                        iVar.g = new t();
                        FilterBoxView filterBoxView2 = iVar.f47607e;
                        if (filterBoxView2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("filterBoxView");
                        }
                        filterBoxView2.setState(1);
                        if (PatchProxy.isSupport(new Object[0], iVar, i.f47603a, false, 44087, new Class[0], Single.class)) {
                            single = (Single) PatchProxy.accessDispatch(new Object[0], iVar, i.f47603a, false, 44087, new Class[0], Single.class);
                        } else {
                            FilterBoxApi a2 = iVar.a();
                            String g2 = com.ss.android.ugc.aweme.port.in.a.g();
                            Intrinsics.checkExpressionValueIsNotNull(g2, "AVEnv.getEffectPlatformAccessKey()");
                            m mVar = com.ss.android.ugc.aweme.port.in.a.f61121d;
                            Intrinsics.checkExpressionValueIsNotNull(mVar, "AVEnv.APPLICATION_SERVICE");
                            String d2 = mVar.d();
                            Intrinsics.checkExpressionValueIsNotNull(d2, "AVEnv.APPLICATION_SERVICE.appVersion");
                            y yVar = com.ss.android.ugc.aweme.port.in.a.h;
                            Intrinsics.checkExpressionValueIsNotNull(yVar, "AVEnv.LOCATION_SERVICE");
                            String c2 = yVar.c();
                            Intrinsics.checkExpressionValueIsNotNull(c2, "AVEnv.LOCATION_SERVICE.region");
                            single = a2.listFilterBox(g2, "4.9.0", d2, c2, "colorfilternew").map(i.f.f47618b);
                            Intrinsics.checkExpressionValueIsNotNull(single, "api.listFilterBox(AVEnv.…         .map { it.data }");
                        }
                        iVar.j = single.map(new i.C0569i(iVar)).subscribeOn(Schedulers.from(a.i.f1051a)).map(new i.j(iVar)).observeOn(AndroidSchedulers.mainThread()).subscribe(new i.k(iVar), new i.l(iVar));
                    }
                    iVar.f47605c = true;
                }
                w.a();
            }
        }
        r.a("click_filter_box", (Map) bj.a().a("enter_from", this.i.getShootWay()).f65805b);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3231a, false, 44329, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3231a, false, 44329, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.f3233c != null) {
            TabLayout.e a2 = this.f3233c.a(i2);
            if (a2 != null) {
                a2.a();
            }
        }
    }

    public final int b(h hVar) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2}, this, f3231a, false, 44335, new Class[]{h.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{hVar2}, this, f3231a, false, 44335, new Class[]{h.class}, Integer.TYPE)).intValue();
        }
        List data = this.g.getData();
        if (CollectionUtils.isEmpty(data) || hVar2 == null) {
            return -1;
        }
        for (int i2 = 0; i2 < data.size(); i2++) {
            if (hVar2.equals(data.get(i2))) {
                return i2;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void a(h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f3231a, false, 44328, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f3231a, false, 44328, new Class[]{h.class}, Void.TYPE);
            return;
        }
        int a2 = this.g.a(hVar);
        if (a2 != -1) {
            int c2 = f.c(this.g, a2);
            if (this.f3233c.getSelectedTabPosition() != c2) {
                a(c2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(List<h> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f3231a, false, 44334, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f3231a, false, 44334, new Class[]{List.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(list)) {
            for (h next : list) {
                if (!this.p.containsKey(next)) {
                    aa.a().a(next, this.q);
                    this.p.put(next, this.q);
                }
            }
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3231a, false, 44327, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3231a, false, 44327, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.n = z;
        FilterViewModel.a(this.f3235e, Boolean.valueOf(z));
        this.f3232b.setSelected(z);
        this.g.a(z);
        if (z) {
            if (this.f3233c.getCurSelectedTab() != null && (this.f3233c.getCurSelectedTab().g instanceof com.ss.android.ugc.aweme.themechange.base.a)) {
                this.f3233c.getCurSelectedTab().g.setSelected(false);
            }
            this.f3233c.d();
        }
    }

    FilterScrollerModule(@NonNull AppCompatActivity appCompatActivity, @Nullable as asVar, @NonNull LinearLayout linearLayout, @Nullable LiveData<Map<EffectCategoryResponse, List<h>>> liveData, @Nullable AVETParameter aVETParameter, @Nullable i iVar, boolean z, boolean z2) {
        LinearLayout linearLayout2 = linearLayout;
        LiveData<Map<EffectCategoryResponse, List<h>>> liveData2 = liveData;
        this.f3234d = (RecyclerView) linearLayout2.findViewById(C0906R.id.ae0);
        this.f3233c = (AVDmtTabLayout) linearLayout2.findViewById(C0906R.id.ae3);
        this.f3232b = (ImageView) linearLayout2.findViewById(C0906R.id.as9);
        this.o = linearLayout2.findViewById(C0906R.id.cz4);
        if (z) {
            this.f3232b.setVisibility(0);
            this.o.setVisibility(0);
        }
        this.f3232b.setOnClickListener(new ae(this));
        this.f3235e = appCompatActivity;
        this.m = asVar;
        this.i = aVETParameter;
        this.j = iVar;
        if (PatchProxy.isSupport(new Object[0], this, f3231a, false, 44330, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3231a, false, 44330, new Class[0], Void.TYPE);
        } else {
            this.f3233c.setTabMargin(12);
            this.f3233c.a(new TabLayout.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f47432a;

                public final void b(TabLayout.e eVar) {
                }

                public final void c(TabLayout.e eVar) {
                }

                public final void a(TabLayout.e eVar) {
                    if (PatchProxy.isSupport(new Object[]{eVar}, this, f47432a, false, 44354, new Class[]{TabLayout.e.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{eVar}, this, f47432a, false, 44354, new Class[]{TabLayout.e.class}, Void.TYPE);
                        return;
                    }
                    if (!(eVar == null || eVar.g == null || eVar.f70400f >= FilterScrollerModule.this.h.size())) {
                        View view = eVar.g;
                        if (view instanceof com.ss.android.ugc.aweme.themechange.base.a) {
                            ((com.ss.android.ugc.aweme.themechange.base.a) view).b(false);
                        }
                        EffectCategoryResponse effectCategoryResponse = FilterScrollerModule.this.h.get(eVar.f70400f);
                        if (!(effectCategoryResponse == null || FilterScrollerModule.this.m == null)) {
                            FilterScrollerModule.this.m.a(effectCategoryResponse.id, effectCategoryResponse.tagsUpdateTime, am.f47499b);
                        }
                    }
                }
            });
        }
        if (PatchProxy.isSupport(new Object[]{liveData2}, this, f3231a, false, 44333, new Class[]{LiveData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{liveData2}, this, f3231a, false, 44333, new Class[]{LiveData.class}, Void.TYPE);
        } else {
            this.f3236f = new EffectCenterLayoutManager(this.f3234d.getContext(), 0, false);
            this.f3234d.setLayoutManager(this.f3236f);
            this.g = new EffectFilterAdapter(this.m);
            this.g.setData(com.ss.android.ugc.aweme.port.in.a.d().b());
            this.g.setShowFooter(false);
            this.g.a();
            this.f3234d.setAdapter(this.g);
            if (liveData2 != null) {
                liveData2.observe(this.f3235e, new ak(this));
            }
            this.f3234d.addOnScrollListener(new RecyclerView.OnScrollListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f47438a;

                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f47438a, false, 44357, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f47438a, false, 44357, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    super.onScrollStateChanged(recyclerView, i);
                    if (!FilterScrollerModule.this.n) {
                        FilterScrollerModule.this.a(f.b(FilterScrollerModule.this.g, FilterScrollerModule.this.f3236f.findFirstVisibleItemPosition()));
                    }
                }

                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f47438a, false, 44358, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f47438a, false, 44358, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    super.onScrolled(recyclerView, i, i2);
                }
            });
            this.g.f47314d = new al(this);
            this.g.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f47440a;

                public void onItemRangeInserted(int i, int i2) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f47440a, false, 44359, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f47440a, false, 44359, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    super.onItemRangeInserted(i, i2);
                    FilterScrollerModule.this.a();
                }

                public void onItemRangeRemoved(int i, int i2) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f47440a, false, 44360, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f47440a, false, 44360, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    super.onItemRangeRemoved(i, i2);
                    FilterScrollerModule.this.a();
                }
            });
        }
        aa.a().i();
        AppCompatActivity appCompatActivity2 = this.f3235e;
        af afVar = new af(this);
        if (PatchProxy.isSupport(new Object[]{appCompatActivity2, afVar}, null, FilterViewModel.f47453a, true, 44407, new Class[]{AppCompatActivity.class, Observer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{appCompatActivity2, afVar}, null, FilterViewModel.f47453a, true, 44407, new Class[]{AppCompatActivity.class, Observer.class}, Void.TYPE);
        } else {
            ((FilterViewModel) ViewModelProviders.of((FragmentActivity) appCompatActivity2).get(FilterViewModel.class)).a().observe(appCompatActivity2, afVar);
        }
        AppCompatActivity appCompatActivity3 = this.f3235e;
        ag agVar = new ag(this);
        if (PatchProxy.isSupport(new Object[]{appCompatActivity3, agVar}, null, FilterViewModel.f47453a, true, 44408, new Class[]{AppCompatActivity.class, Observer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{appCompatActivity3, agVar}, null, FilterViewModel.f47453a, true, 44408, new Class[]{AppCompatActivity.class, Observer.class}, Void.TYPE);
        } else {
            ((FilterViewModel) ViewModelProviders.of((FragmentActivity) appCompatActivity3).get(FilterViewModel.class)).b().observe(appCompatActivity3, agVar);
        }
        a(z2);
        this.f3235e.getLifecycle().addObserver(this);
    }
}
