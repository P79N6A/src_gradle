package com.ss.android.ugc.aweme.discover.presenter;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.app.d.f;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.discover.adapter.SearchPoiAdapter;
import com.ss.android.ugc.aweme.discover.adapter.s;
import com.ss.android.ugc.aweme.discover.model.SearchPoi;
import com.ss.android.ugc.aweme.discover.ui.SearchBaseFragment;
import com.ss.android.ugc.aweme.discover.ui.SearchOriginalFragment;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\rH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\rH\u0014J \u0010\u0012\u001a\u00020\r2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0010H\u0016J\u001a\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0006H\u0014J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0010H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/ugc/aweme/discover/presenter/SearchPoiFragment;", "Lcom/ss/android/ugc/aweme/discover/ui/SearchOriginalFragment;", "Lcom/ss/android/ugc/aweme/discover/model/SearchPoi;", "Lcom/ss/android/ugc/aweme/common/presenter/IBaseListView;", "()V", "labelName", "", "getLabelName", "()Ljava/lang/String;", "mLatitude", "", "mLongitude", "initAdapter", "", "initPresenter", "isRegisterEventBus", "", "loadMoreData", "onLoadMoreResult", "list", "", "hasMore", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "refresh", "refreshType", "", "setKeyword", "keyword", "shouldShowSearchAdH5", "inI18n", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchPoiFragment extends SearchOriginalFragment<SearchPoi> implements c<SearchPoi> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42691a;

    /* renamed from: b  reason: collision with root package name */
    private double f42692b;

    /* renamed from: c  reason: collision with root package name */
    private double f42693c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap f42694d;

    public final View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.id.ame)}, this, f42691a, false, 37294, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.id.ame)}, this, f42691a, false, 37294, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.f42694d == null) {
            this.f42694d = new HashMap();
        }
        View view = (View) this.f42694d.get(Integer.valueOf(C0906R.id.ame));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(C0906R.id.ame);
            this.f42694d.put(Integer.valueOf(C0906R.id.ame), view);
        }
        return view;
    }

    public final boolean a(boolean z) {
        return false;
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f42691a, false, 37295, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42691a, false, 37295, new Class[0], Void.TYPE);
            return;
        }
        if (this.f42694d != null) {
            this.f42694d.clear();
        }
    }

    @NotNull
    public final String i() {
        return "poi";
    }

    public final boolean isRegisterEventBus() {
        return false;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        g();
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f42691a, false, 37288, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42691a, false, 37288, new Class[0], Void.TYPE);
            return;
        }
        a((k<?>) new u<Object>());
        E().a(this);
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f42691a, false, 37290, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42691a, false, 37290, new Class[0], Void.TYPE);
            return;
        }
        a((BaseAdapter<D>) new SearchPoiAdapter<D>(getContext(), new s(false), this.h));
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f42691a, false, 37293, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42691a, false, 37293, new Class[0], Void.TYPE);
            return;
        }
        if ((this.k == 2 || this.k == 5) && TextUtils.equals(this.h, this.i)) {
            E().b(SearchBaseFragment.a.a());
        } else {
            E().b(0);
        }
        E().a(4, D(), 1, Double.valueOf(this.f42692b), Double.valueOf(this.f42693c), Integer.valueOf(this.o));
    }

    public final void c(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f42691a, false, 37292, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f42691a, false, 37292, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        E().a(1, this.h, Integer.valueOf(i), Double.valueOf(this.f42692b), Double.valueOf(this.f42693c), Integer.valueOf(this.o));
    }

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f42691a, false, 37291, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f42691a, false, 37291, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "keyword");
        if (v() != null) {
            BaseAdapter v = v();
            if (v != null) {
                ((SearchPoiAdapter) v).h = str2;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.adapter.SearchPoiAdapter");
            }
        }
    }

    public final void b(@Nullable List<? extends SearchPoi> list, boolean z) {
        SearchPoiFragment searchPoiFragment;
        List<? extends SearchPoi> list2 = list;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f42691a, false, 37289, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z)}, this, f42691a, false, 37289, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (a.a()) {
            if (E() != null) {
                k<?> E = E();
                if (E == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.presenter.SearchPoiPresenter");
                } else if (((u) E).c()) {
                    z2 = true;
                }
            }
            searchPoiFragment = this;
        } else {
            searchPoiFragment = this;
            z2 = z;
        }
        super.b(list2, z2);
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f42691a, false, 37287, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f42691a, false, 37287, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        com.ss.android.ugc.aweme.poi.a a2 = af.a(getContext()).a((f) null);
        if (a2 != null) {
            this.f42692b = a2.latitude;
            this.f42693c = a2.longitude;
        }
    }
}
