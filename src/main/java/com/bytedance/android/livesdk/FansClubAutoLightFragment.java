package com.bytedance.android.livesdk;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.arch.paging.PagedList;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.a.e;
import com.bytedance.android.live.core.a.o;
import com.bytedance.android.live.core.paging.a.c;
import com.bytedance.android.live.core.paging.b;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.live.core.ui.BaseFragment;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.adapter.FansClubAutoLightAdapter;
import com.bytedance.android.livesdk.viewmodel.FansClubAutoLightViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class FansClubAutoLightFragment extends BaseFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8740a;

    /* renamed from: b  reason: collision with root package name */
    FansClubAutoLightAdapter f8741b;

    /* renamed from: c  reason: collision with root package name */
    FansClubAutoLightViewModel f8742c;
    RecyclerView h;
    SwipeRefreshLayout i;
    BaseDialogFragment j;

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        b bVar;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f8740a, false, 2502, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f8740a, false, 2502, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f8740a, false, 2503, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8740a, false, 2503, new Class[0], Void.TYPE);
        } else {
            this.f8741b = new FansClubAutoLightAdapter();
            this.f8742c = (FansClubAutoLightViewModel) ViewModelProviders.of(getActivity(), (ViewModelProvider.Factory) new ViewModelProvider.Factory() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f8745a;

                @NonNull
                public final <T extends ViewModel> T create(@NonNull Class<T> cls) {
                    if (!PatchProxy.isSupport(new Object[]{cls}, this, f8745a, false, 2508, new Class[]{Class.class}, ViewModel.class)) {
                        return new FansClubAutoLightViewModel();
                    }
                    return (ViewModel) PatchProxy.accessDispatch(new Object[]{cls}, this, f8745a, false, 2508, new Class[]{Class.class}, ViewModel.class);
                }
            }).get(FansClubAutoLightViewModel.class);
        }
        this.h.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.h.setItemAnimator(null);
        this.h.setAdapter(this.f8741b);
        this.f8741b.a((PagingViewModel<T>) this.f8742c);
        FansClubAutoLightViewModel fansClubAutoLightViewModel = this.f8742c;
        if (PatchProxy.isSupport(new Object[0], fansClubAutoLightViewModel, FansClubAutoLightViewModel.f17720a, false, 13858, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], fansClubAutoLightViewModel, FansClubAutoLightViewModel.f17720a, false, 13858, new Class[0], Void.TYPE);
        } else {
            c cVar = new c();
            if (PatchProxy.isSupport(new Object[]{fansClubAutoLightViewModel}, cVar, c.f7883a, false, 526, new Class[]{com.bytedance.android.live.core.paging.b.b.class}, c.class)) {
                Object[] objArr = {fansClubAutoLightViewModel};
                c cVar2 = cVar;
                cVar = (c) PatchProxy.accessDispatch(objArr, cVar2, c.f7883a, false, 526, new Class[]{com.bytedance.android.live.core.paging.b.b.class}, c.class);
            } else {
                cVar.f7884b.a((com.bytedance.android.live.core.paging.b.b<V>) fansClubAutoLightViewModel);
            }
            PagedList.Config build = new PagedList.Config.Builder().setEnablePlaceholders(false).setPageSize(20).setPrefetchDistance(20).build();
            if (PatchProxy.isSupport(new Object[]{build}, cVar, c.f7883a, false, 519, new Class[]{PagedList.Config.class}, c.class)) {
                c cVar3 = cVar;
                cVar = (c) PatchProxy.accessDispatch(new Object[]{build}, cVar3, c.f7883a, false, 519, new Class[]{PagedList.Config.class}, c.class);
            } else {
                cVar.f7884b.a(build);
            }
            if (PatchProxy.isSupport(new Object[0], cVar, c.f7883a, false, 542, new Class[0], b.class)) {
                bVar = (b) PatchProxy.accessDispatch(new Object[0], cVar, c.f7883a, false, 542, new Class[0], b.class);
            } else {
                bVar = cVar.f7884b.a(o.a()).a(new o(), new e()).j();
            }
            fansClubAutoLightViewModel.a(bVar);
        }
        this.f8742c.f7975d.observe(getActivity(), new d(this));
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f8740a, false, 2501, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f8740a, false, 2501, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.aem, viewGroup2, false);
        this.h = (RecyclerView) inflate.findViewById(C0906R.id.ac_);
        this.i = (SwipeRefreshLayout) inflate.findViewById(C0906R.id.aci);
        this.i.setOnRefreshListener(new FansClubAutoLightFragment$$Lambda$0(this));
        inflate.findViewById(C0906R.id.iu).setOnClickListener(new b(this));
        inflate.findViewById(C0906R.id.b1z).setOnClickListener(new c(this));
        return inflate;
    }
}
