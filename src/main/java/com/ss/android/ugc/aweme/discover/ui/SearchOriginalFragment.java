package com.ss.android.ugc.aweme.discover.ui;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.NetworkUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.presenter.j;
import com.ss.android.ugc.aweme.discover.presenter.k;
import com.ss.android.ugc.aweme.discover.ui.SearchBaseFragment;
import com.ss.android.ugc.aweme.discover.ui.a.c;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0014J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016R\u001e\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/SearchOriginalFragment;", "D", "Lcom/ss/android/ugc/aweme/discover/ui/SearchFragment;", "()V", "mPresenter", "Lcom/ss/android/ugc/aweme/discover/presenter/SearchBasePresenter;", "getMPresenter", "()Lcom/ss/android/ugc/aweme/discover/presenter/SearchBasePresenter;", "setMPresenter", "(Lcom/ss/android/ugc/aweme/discover/presenter/SearchBasePresenter;)V", "loadMoreData", "", "mobRefreshDataForV3", "isSuccess", "", "onDestroyView", "refresh", "refreshType", "", "refreshData", "showLoadEmpty", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class SearchOriginalFragment<D> extends SearchFragment<D> {
    public static ChangeQuickRedirect G;
    @NotNull
    protected k<?> H;

    /* renamed from: a  reason: collision with root package name */
    private HashMap f3072a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "D", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43022a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchOriginalFragment f43023b;

        a(SearchOriginalFragment searchOriginalFragment) {
            this.f43023b = searchOriginalFragment;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f43022a, false, 38027, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f43022a, false, 38027, new Class[0], Void.TYPE);
            } else if (this.f43023b.isViewValid()) {
                this.f43023b.f();
            }
        }
    }

    public View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.id.ame)}, this, G, false, 38025, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.id.ame)}, this, G, false, 38025, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.f3072a == null) {
            this.f3072a = new HashMap();
        }
        View view = (View) this.f3072a.get(Integer.valueOf(C0906R.id.ame));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(C0906R.id.ame);
            this.f3072a.put(Integer.valueOf(C0906R.id.ame), view);
        }
        return view;
    }

    public void g() {
        if (PatchProxy.isSupport(new Object[0], this, G, false, 38026, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, G, false, 38026, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3072a != null) {
            this.f3072a.clear();
        }
    }

    @NotNull
    public final k<?> E() {
        if (PatchProxy.isSupport(new Object[0], this, G, false, 38017, new Class[0], k.class)) {
            return (k) PatchProxy.accessDispatch(new Object[0], this, G, false, 38017, new Class[0], k.class);
        }
        k<?> kVar = this.H;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        return kVar;
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, G, false, 38024, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, G, false, 38024, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        k<?> kVar = this.H;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        kVar.k();
        g();
    }

    public void y_() {
        if (PatchProxy.isSupport(new Object[0], this, G, false, 38022, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, G, false, 38022, new Class[0], Void.TYPE);
            return;
        }
        k<?> kVar = this.H;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        if (kVar.i() instanceof j) {
            c z = z();
            k<?> kVar2 = this.H;
            if (kVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            }
            j jVar = (j) kVar2.i();
            Intrinsics.checkExpressionValueIsNotNull(jVar, "mPresenter.model");
            com.bytedance.ies.dmt.ui.widget.c a2 = c.a(z, (SearchApiResult) jVar.getData(), null, 2);
            if (a2 != null) {
                a(a2);
                return;
            }
        }
        x_();
    }

    public void j() {
        if (PatchProxy.isSupport(new Object[0], this, G, false, 38020, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, G, false, 38020, new Class[0], Void.TYPE);
            return;
        }
        if ((this.k == 2 || this.k == 5) && TextUtils.equals(this.h, this.i)) {
            k<?> kVar = this.H;
            if (kVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            }
            kVar.b(SearchBaseFragment.a.a());
        } else {
            k<?> kVar2 = this.H;
            if (kVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            }
            kVar2.b(0);
        }
        k<?> kVar3 = this.H;
        if (kVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        kVar3.a(4, D(), 1, Integer.valueOf(this.o));
    }

    public final void a(@NotNull k<?> kVar) {
        k<?> kVar2 = kVar;
        if (PatchProxy.isSupport(new Object[]{kVar2}, this, G, false, 38018, new Class[]{k.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVar2}, this, G, false, 38018, new Class[]{k.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(kVar2, "<set-?>");
        this.H = kVar2;
    }

    public void a_(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, G, false, 38023, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, G, false, 38023, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        String i = i();
        k<?> kVar = this.H;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        j jVar = (j) kVar.i();
        if (jVar != null) {
            a(i, jVar.f42718f, this.h, z, jVar.f());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.presenter.SearchBaseModel<*, *>");
    }

    public void c(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, G, false, 38021, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, G, false, 38021, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        k<?> kVar = this.H;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        kVar.a(1, this.h, Integer.valueOf(i), Integer.valueOf(this.o));
    }

    public void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, G, false, 38019, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, G, false, 38019, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.b(i);
        if (NetworkUtils.isNetworkAvailable(getActivity())) {
            if ((this.k == 2 || this.k == 5) && TextUtils.equals(this.h, this.i)) {
                k<?> kVar = this.H;
                if (kVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                }
                kVar.b(SearchBaseFragment.a.a());
            } else {
                k<?> kVar2 = this.H;
                if (kVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                }
                kVar2.b(0);
            }
            c(i);
            return;
        }
        com.ss.android.b.a.a.a.a(new a(this), 100);
    }
}
