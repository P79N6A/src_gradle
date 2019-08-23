package com.bytedance.android.livesdk.feed.fragment;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.a.e;
import com.bytedance.android.live.core.feed.FeedApi;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.live.core.ui.BaseFragment;
import com.bytedance.android.livesdk.feed.FixEmptyItemInStaggeredLayoutScrollListener;
import com.bytedance.android.livesdk.feed.adapter.BaseFeedAdapter;
import com.bytedance.android.livesdk.feed.adapter.FeedOwnerAdapter$2;
import com.bytedance.android.livesdk.feed.adapter.c;
import com.bytedance.android.livesdk.feed.adapter.g;
import com.bytedance.android.livesdk.feed.adapter.k;
import com.bytedance.android.livesdk.feed.adapter.l;
import com.bytedance.android.livesdk.feed.adapter.m;
import com.bytedance.android.livesdk.feed.adapter.n;
import com.bytedance.android.livesdk.feed.b.b;
import com.bytedance.android.livesdk.feed.f;
import com.bytedance.android.livesdk.feed.h;
import com.bytedance.android.livesdk.feed.j;
import com.bytedance.android.livesdk.feed.o;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.android.livesdk.feed.services.d;
import com.bytedance.android.livesdk.feed.tab.b.a;
import com.bytedance.android.livesdk.feed.viewmodel.FragmentFeedViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public abstract class BaseFeedFragment extends BaseFragment implements h, j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14120a;

    /* renamed from: b  reason: collision with root package name */
    protected FragmentFeedViewModel f14121b;

    /* renamed from: c  reason: collision with root package name */
    protected f f14122c;
    protected RecyclerView h;
    protected c i;

    public c.a a(c.a aVar) {
        return aVar;
    }

    public String a() {
        return "";
    }

    public void a(FeedItem feedItem) {
    }

    public String b() {
        return "";
    }

    public long c() {
        return 0;
    }

    public int d() {
        return 4;
    }

    public abstract BaseFeedAdapter f();

    public int h() {
        return 2;
    }

    public abstract RecyclerView.ItemDecoration i();

    public FragmentFeedViewModel e() {
        if (!PatchProxy.isSupport(new Object[0], this, f14120a, false, 8607, new Class[0], FragmentFeedViewModel.class)) {
            return (FragmentFeedViewModel) ViewModelProviders.of((Fragment) this, (ViewModelProvider.Factory) this.f14122c.a((h) this)).get(FragmentFeedViewModel.class);
        }
        return (FragmentFeedViewModel) PatchProxy.accessDispatch(new Object[0], this, f14120a, false, 8607, new Class[0], FragmentFeedViewModel.class);
    }

    public RecyclerView.LayoutManager g() {
        if (PatchProxy.isSupport(new Object[0], this, f14120a, false, 8608, new Class[0], RecyclerView.LayoutManager.class)) {
            return (RecyclerView.LayoutManager) PatchProxy.accessDispatch(new Object[0], this, f14120a, false, 8608, new Class[0], RecyclerView.LayoutManager.class);
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(h(), 1);
        staggeredGridLayoutManager.setGapStrategy(0);
        return staggeredGridLayoutManager;
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f14120a, false, 8610, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14120a, false, 8610, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        if (f() != null) {
            f().d();
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f14120a, false, 8612, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14120a, false, 8612, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (f() != null) {
            BaseFeedAdapter f2 = f();
            if (PatchProxy.isSupport(new Object[0], f2, BaseFeedAdapter.o, false, 8483, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], f2, BaseFeedAdapter.o, false, 8483, new Class[0], Void.TYPE);
                return;
            }
            f2.v.onNext(i.f8107b);
            f2.p.removeCallbacksAndMessages(null);
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f14120a, false, 8611, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14120a, false, 8611, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (f() != null) {
            BaseFeedAdapter f2 = f();
            if (PatchProxy.isSupport(new Object[0], f2, BaseFeedAdapter.o, false, 8482, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], f2, BaseFeedAdapter.o, false, 8482, new Class[0], Void.TYPE);
                return;
            }
            f2.u.onNext(i.f8107b);
            f2.y = false;
        }
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f14120a, false, 8609, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f14120a, false, 8609, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (this.f14121b != null) {
            this.f14121b.a(z);
        }
        if (f() != null) {
            f().a(z);
        }
    }

    public void onCreate(Bundle bundle) {
        f fVar;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f14120a, false, 8605, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f14120a, false, 8605, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (PatchProxy.isSupport(new Object[0], this, f14120a, false, 8614, new Class[0], f.class)) {
            fVar = (f) PatchProxy.accessDispatch(new Object[0], this, f14120a, false, 8614, new Class[0], f.class);
        } else {
            FeedRepository feedRepository = new FeedRepository(d.a().b(), (FeedApi) d.a().d().a(FeedApi.class), new e(), new com.bytedance.android.live.core.a.j(), new e(), d.a().c(), null, new com.bytedance.android.livesdk.feed.d(a.d()));
            fVar = new f(feedRepository, a.d(), b.b().getApplicationContext(), new o() {
            }, new com.bytedance.android.livesdk.feed.k.a());
        }
        this.f14122c = fVar;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        c cVar;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f14120a, false, 8606, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f14120a, false, 8606, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.f14121b = e();
        c.a aVar = new c.a();
        aVar.h = this;
        aVar.f13963d = this.f14121b;
        aVar.f13962c = this.h;
        aVar.k = new a(this);
        aVar.f13961b = f();
        aVar.f13964e = g();
        aVar.g = i();
        aVar.i = false;
        aVar.f13965f = h();
        aVar.j = this;
        c.a a2 = a(aVar);
        if (PatchProxy.isSupport(new Object[0], a2, c.a.f13960a, false, 8508, new Class[0], c.class)) {
            cVar = (c) PatchProxy.accessDispatch(new Object[0], a2, c.a.f13960a, false, 8508, new Class[0], c.class);
        } else if (a2.f13962c != null) {
            a2.f13962c.setItemAnimator(null);
            if (a2.f13961b == null) {
                throw new IllegalStateException("adapter must not be null");
            } else if (a2.f13963d == null) {
                throw new IllegalStateException("viewModel must not be null");
            } else if (a2.h != null) {
                c cVar2 = new c(a2.h, a2.f13961b, a2.f13962c, a2.f13963d, (byte) 0);
                cVar2.f13956e = a2.f13964e;
                if (a2.f13964e instanceof StaggeredGridLayoutManager) {
                    ((StaggeredGridLayoutManager) a2.f13964e).setSpanCount(a2.f13965f);
                }
                cVar2.j = a2.k;
                cVar2.f13957f = a2.g;
                cVar2.i = a2.i;
                cVar2.h = a2.j;
                cVar2.k = a2.l;
                cVar2.l = a2.m;
                cVar = cVar2;
            } else {
                throw new IllegalStateException("lifecycleOwner must not be null");
            }
        } else {
            throw new IllegalStateException("recyclerView must not be null");
        }
        this.i = cVar;
        c cVar3 = this.i;
        if (PatchProxy.isSupport(new Object[0], cVar3, c.f13952a, false, 8492, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], cVar3, c.f13952a, false, 8492, new Class[0], Void.TYPE);
        } else {
            if (PatchProxy.isSupport(new Object[0], cVar3, c.f13952a, false, 8493, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], cVar3, c.f13952a, false, 8493, new Class[0], Void.TYPE);
            } else {
                BaseFeedAdapter baseFeedAdapter = cVar3.f13953b;
                c.AnonymousClass1 r2 = new n() {

                    /* renamed from: a */
                    public static ChangeQuickRedirect f13958a;

                    public final com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout.a b(
/*
Method generation error in method: com.bytedance.android.livesdk.feed.adapter.c.1.b():com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout$a, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.android.livesdk.feed.adapter.c.1.b():com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout$a, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                    
*/

                    public final com.bytedance.android.livesdk.feed.d.c a(
/*
Method generation error in method: com.bytedance.android.livesdk.feed.adapter.c.1.a():com.bytedance.android.livesdk.feed.d.c, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.android.livesdk.feed.adapter.c.1.a():com.bytedance.android.livesdk.feed.d.c, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                    
*/
                };
                if (PatchProxy.isSupport(new Object[]{r2}, baseFeedAdapter, BaseFeedAdapter.o, false, 8468, new Class[]{n.class}, Void.TYPE)) {
                    Object[] objArr = {r2};
                    Object[] objArr2 = objArr;
                    BaseFeedAdapter baseFeedAdapter2 = baseFeedAdapter;
                    PatchProxy.accessDispatch(objArr2, baseFeedAdapter2, BaseFeedAdapter.o, false, 8468, new Class[]{n.class}, Void.TYPE);
                } else {
                    baseFeedAdapter.q = r2.a();
                    baseFeedAdapter.n = new Object[]{r2, baseFeedAdapter.t, baseFeedAdapter.u, baseFeedAdapter.v, baseFeedAdapter.w, baseFeedAdapter.x};
                }
                cVar3.f13954c.setAdapter(cVar3.f13953b);
                cVar3.f13954c.setLayoutManager(cVar3.f13956e);
                cVar3.f13954c.addOnScrollListener(new FeedOwnerAdapter$2(cVar3));
                if (cVar3.f13957f != null) {
                    cVar3.f13954c.addItemDecoration(cVar3.f13957f);
                }
                cVar3.f13953b.a((PagingViewModel<T>) cVar3.f13955d);
                cVar3.f13953b.s.filter(com.bytedance.android.livesdk.feed.adapter.d.f13967b).subscribe(new com.bytedance.android.livesdk.feed.adapter.e(cVar3), com.bytedance.android.livesdk.feed.adapter.f.f13971b);
                cVar3.f13953b.t.subscribe(new g(cVar3), com.bytedance.android.livesdk.feed.adapter.h.f13975b);
                cVar3.f13953b.u.subscribe(new com.bytedance.android.livesdk.feed.adapter.i(cVar3), com.bytedance.android.livesdk.feed.adapter.j.f13979b);
                cVar3.f13955d.b();
                cVar3.f13955d.l.a(cVar3.g);
                cVar3.f13955d.m.observeForever(new k(cVar3));
                cVar3.f13955d.z.observe(cVar3.g, new l(cVar3));
                cVar3.f13955d.r.observe(cVar3.g, new m(cVar3));
            }
        }
        this.f14121b.a(getUserVisibleHint());
        this.h.addOnScrollListener(new FixEmptyItemInStaggeredLayoutScrollListener(h()));
        this.f14121b.q.observe(this, new b(this));
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f14120a, false, 8613, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f14120a, false, 8613, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater2.inflate(C0906R.layout.ahw, viewGroup2, false);
        this.h = (RecyclerView) inflate.findViewById(C0906R.id.bcl);
        return inflate;
    }
}
