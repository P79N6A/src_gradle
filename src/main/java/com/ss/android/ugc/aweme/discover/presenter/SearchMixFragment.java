package com.ss.android.ugc.aweme.discover.presenter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.app.d.f;
import com.ss.android.ugc.aweme.common.f.d;
import com.ss.android.ugc.aweme.discover.base.HeaderAndFooterWrapper;
import com.ss.android.ugc.aweme.discover.model.SearchMix;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.discover.ui.SearchMixUIPage;
import com.ss.android.ugc.aweme.feed.panel.CellFeedFragmentPanel;
import com.ss.android.ugc.aweme.poi.a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001b\u001a\u00020\u001cH\u0014J\u0014\u0010\u001d\u001a\u00020\u001c2\n\u0010\u001e\u001a\u00060\u001fj\u0002` H\u0016J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#H\u0016J\u001a\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u00122\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0010\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u0018H\u0014R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/presenter/SearchMixFragment;", "Lcom/ss/android/ugc/aweme/discover/presenter/SearchFeedFragment;", "Lcom/ss/android/ugc/aweme/discover/presenter/ISearchMixView;", "()V", "eventLable", "", "getEventLable", "()Ljava/lang/String;", "fragmentPanel", "Lcom/ss/android/ugc/aweme/feed/panel/CellFeedFragmentPanel;", "getFragmentPanel", "()Lcom/ss/android/ugc/aweme/feed/panel/CellFeedFragmentPanel;", "labelName", "getLabelName", "mLatitude", "", "mLongitude", "mixLayout", "Landroid/view/View;", "getMixLayout", "()Landroid/view/View;", "setMixLayout", "(Landroid/view/View;)V", "pageType", "", "getPageType", "()I", "initPresenter", "", "onFetchFailed", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onFetchSuccess", "mix", "Lcom/ss/android/ugc/aweme/discover/model/SearchMix;", "onViewCreated", "view", "savedInstanceState", "Landroid/os/Bundle;", "refresh", "refreshType", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchMixFragment extends SearchFeedFragment implements d {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f42682c;
    private double I;
    private double J;
    private HashMap K;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    protected View f42683d;

    public final View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.id.ame)}, this, f42682c, false, 37257, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.id.ame)}, this, f42682c, false, 37257, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.K == null) {
            this.K = new HashMap();
        }
        View view = (View) this.K.get(Integer.valueOf(C0906R.id.ame));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(C0906R.id.ame);
            this.K.put(Integer.valueOf(C0906R.id.ame), view);
        }
        return view;
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f42682c, false, 37258, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42682c, false, 37258, new Class[0], Void.TYPE);
            return;
        }
        if (this.K != null) {
            this.K.clear();
        }
    }

    @NotNull
    public final String i() {
        return "general_search";
    }

    @NotNull
    public final String n() {
        return "general_search";
    }

    public final int o() {
        return 9;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        g();
    }

    @NotNull
    public final CellFeedFragmentPanel b() {
        if (PatchProxy.isSupport(new Object[0], this, f42682c, false, 37251, new Class[0], CellFeedFragmentPanel.class)) {
            return (CellFeedFragmentPanel) PatchProxy.accessDispatch(new Object[0], this, f42682c, false, 37251, new Class[0], CellFeedFragmentPanel.class);
        }
        if (this.f42677b == null) {
            this.f42677b = new CellFeedFragmentPanel(n(), this, this, o());
        }
        CellFeedFragmentPanel cellFeedFragmentPanel = this.f42677b;
        if (cellFeedFragmentPanel != null) {
            return cellFeedFragmentPanel;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.panel.CellFeedFragmentPanel");
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f42682c, false, 37255, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42682c, false, 37255, new Class[0], Void.TYPE);
            return;
        }
        a((k<?>) new q<Object>(this));
        k<?> E = E();
        if (E != null) {
            ((q) E).a(new p());
            E().a(this);
            E().g = this;
            E().a((d) this.f42677b);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.presenter.SearchMixPresenter");
    }

    public final void c(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f42682c, false, 37256, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f42682c, false, 37256, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        E().a(1, this.h, Integer.valueOf(i), Double.valueOf(this.I), Double.valueOf(this.J), Integer.valueOf(this.o));
    }

    public final void a(@NotNull SearchMix searchMix) {
        if (PatchProxy.isSupport(new Object[]{searchMix}, this, f42682c, false, 37254, new Class[]{SearchMix.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchMix}, this, f42682c, false, 37254, new Class[]{SearchMix.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(searchMix, "mix");
        if (searchMix.isAllEmpty()) {
            x_();
        } else {
            c(false);
        }
        HeaderAndFooterWrapper w = w();
        View view = this.f42683d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mixLayout");
        }
        w.b(view);
        SearchMixUIPage searchMixUIPage = new SearchMixUIPage(LayoutInflater.from(getContext()).inflate(C0906R.layout.a6p, q(), false));
        searchMixUIPage.a(searchMix, new SearchResultParam().setKeyword(this.h));
        View view2 = searchMixUIPage.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "holder.view");
        this.f42683d = view2;
        HeaderAndFooterWrapper w2 = w();
        View view3 = this.f42683d;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mixLayout");
        }
        w2.a(view3);
        C();
    }

    public final void a(@NotNull Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f42682c, false, 37253, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f42682c, false, 37253, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(exc2, "e");
        if (isViewValid()) {
            HeaderAndFooterWrapper w = w();
            View view = this.f42683d;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mixLayout");
            }
            w.b(view);
        }
        e(exc);
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f42682c, false, 37252, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f42682c, false, 37252, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        a a2 = af.a(getContext()).a((f) null);
        if (a2 != null) {
            this.I = a2.latitude;
            this.J = a2.longitude;
        }
    }
}
