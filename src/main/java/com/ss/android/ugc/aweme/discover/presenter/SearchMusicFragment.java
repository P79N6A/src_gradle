package com.ss.android.ugc.aweme.discover.presenter;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver;
import com.ss.android.ugc.aweme.discover.adapter.SearchMusicAdapter;
import com.ss.android.ugc.aweme.discover.adapter.s;
import com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.ss.android.ugc.aweme.discover.model.SearchMusic;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel$SearchStateListener$$CC;
import com.ss.android.ugc.aweme.discover.ui.SearchOriginalFragment;
import com.ss.android.ugc.aweme.discover.ui.aw;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u000bH\u0014J\b\u0010\r\u001a\u00020\u000bH\u0016J\u001a\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0002J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0005H\u0014J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/presenter/SearchMusicFragment;", "Lcom/ss/android/ugc/aweme/discover/ui/SearchOriginalFragment;", "Lcom/ss/android/ugc/aweme/discover/model/SearchMusic;", "()V", "labelName", "", "getLabelName", "()Ljava/lang/String;", "mPlayHelper", "Lcom/ss/android/ugc/aweme/discover/helper/MusicPlayHelper;", "initAdapter", "", "initPresenter", "onPause", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "pauseMusic", "setKeyword", "keyword", "setUserVisibleHint", "isVisibleToUser", "", "shouldShowSearchAdH5", "inI18n", "showLoadEmpty", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchMusicFragment extends SearchOriginalFragment<SearchMusic> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42684a;

    /* renamed from: b  reason: collision with root package name */
    private MusicPlayHelper f42685b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap f42686c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/discover/presenter/SearchMusicFragment$initAdapter$1", "Lcom/ss/android/ugc/aweme/common/utils/RecyclerViewVisibilityObserver$Identifier;", "getUniqueId", "", "pos", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements RecyclerViewVisibilityObserver.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42687a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchMusicFragment f42688b;

        a(SearchMusicFragment searchMusicFragment) {
            this.f42688b = searchMusicFragment;
        }

        @Nullable
        public final Object a(int i) {
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f42687a, false, 37278, new Class[]{Integer.TYPE}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f42687a, false, 37278, new Class[]{Integer.TYPE}, Object.class);
            }
            List data = this.f42688b.v().getData();
            if (data == null || i2 < 0 || i2 >= data.size()) {
                return null;
            }
            return (SearchMusic) data.get(i2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "visible", "", "onContentVisible"}, k = 3, mv = {1, 1, 15})
    static final class b implements SearchStateViewModel.SearchStateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42689a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchMusicFragment f42690b;

        b(SearchMusicFragment searchMusicFragment) {
            this.f42690b = searchMusicFragment;
        }

        public final void onPageHidden() {
            if (PatchProxy.isSupport(new Object[0], this, f42689a, false, 37280, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42689a, false, 37280, new Class[0], Void.TYPE);
                return;
            }
            SearchStateViewModel$SearchStateListener$$CC.onPageHidden(this);
        }

        public final void onPageResume() {
            if (PatchProxy.isSupport(new Object[0], this, f42689a, false, 37281, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42689a, false, 37281, new Class[0], Void.TYPE);
                return;
            }
            SearchStateViewModel$SearchStateListener$$CC.onPageResume(this);
        }

        public final void onContentVisible(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f42689a, false, 37279, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f42689a, false, 37279, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (!z) {
                this.f42690b.b();
            }
        }
    }

    public final View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.id.ame)}, this, f42684a, false, 37276, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.id.ame)}, this, f42684a, false, 37276, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.f42686c == null) {
            this.f42686c = new HashMap();
        }
        View view = (View) this.f42686c.get(Integer.valueOf(C0906R.id.ame));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(C0906R.id.ame);
            this.f42686c.put(Integer.valueOf(C0906R.id.ame), view);
        }
        return view;
    }

    public final boolean a(boolean z) {
        return z;
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f42684a, false, 37277, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42684a, false, 37277, new Class[0], Void.TYPE);
            return;
        }
        if (this.f42686c != null) {
            this.f42686c.clear();
        }
    }

    @NotNull
    public final String i() {
        return "music";
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        g();
    }

    public SearchMusicFragment() {
        this.j = aw.f43138f;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f42684a, false, 37273, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42684a, false, 37273, new Class[0], Void.TYPE);
            return;
        }
        if (this.f42685b != null) {
            MusicPlayHelper musicPlayHelper = this.f42685b;
            if (musicPlayHelper == null) {
                Intrinsics.throwNpe();
            }
            musicPlayHelper.a();
        }
    }

    public final void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f42684a, false, 37272, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42684a, false, 37272, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        b();
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f42684a, false, 37275, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42684a, false, 37275, new Class[0], Void.TYPE);
            return;
        }
        super.y_();
        r.a("music_search_feedback_show", (Map) d.a().a("enter_from", "music_search_result").f34114b);
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f42684a, false, 37269, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42684a, false, 37269, new Class[0], Void.TYPE);
            return;
        }
        a((k<?>) new s<Object>());
        k<?> E = E();
        if (E != null) {
            ((s) E).a(new r());
            E().a(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.presenter.SearchMusicPresenter");
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f42684a, false, 37270, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42684a, false, 37270, new Class[0], Void.TYPE);
            return;
        }
        a((BaseAdapter<D>) new SearchMusicAdapter<D>(this.f42685b, new s(false), this.h));
        RecyclerViewVisibilityObserver.a(q(), new a(this));
    }

    public final void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f42684a, false, 37271, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f42684a, false, 37271, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (!z) {
            b();
        }
    }

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f42684a, false, 37274, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f42684a, false, 37274, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "keyword");
        BaseAdapter v = v();
        if (v != null) {
            ((SearchMusicAdapter) v).h = str2;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.adapter.SearchMusicAdapter");
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f42684a, false, 37268, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f42684a, false, 37268, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        if (!com.ss.android.g.a.a()) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                Intrinsics.throwNpe();
            }
            this.f42685b = (MusicPlayHelper) ViewModelProviders.of(activity).get(MusicPlayHelper.class);
            FragmentActivity activity2 = getActivity();
            if (activity2 == null) {
                Intrinsics.throwNpe();
            }
            ViewModel viewModel = ViewModelProviders.of(activity2).get(SearchStateViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…ateViewModel::class.java)");
            SearchStateViewModel.SearchObserver searchObserver = new SearchStateViewModel.SearchObserver();
            searchObserver.setListener(new b(this));
            ((SearchStateViewModel) viewModel).searchState.observe(this, searchObserver);
        }
        super.onViewCreated(view, bundle);
    }
}
