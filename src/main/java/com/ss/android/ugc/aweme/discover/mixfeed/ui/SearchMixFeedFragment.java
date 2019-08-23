package com.ss.android.ugc.aweme.discover.mixfeed.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.common.widget.NestedScrollingRecyclerView;
import com.ss.android.ugc.aweme.discover.base.HeaderAndFooterWrapper;
import com.ss.android.ugc.aweme.discover.helper.b;
import com.ss.android.ugc.aweme.discover.model.SearchMix;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.discover.presenter.d;
import com.ss.android.ugc.aweme.discover.presenter.k;
import com.ss.android.ugc.aweme.discover.presenter.q;
import com.ss.android.ugc.aweme.discover.ui.SearchBaseFragment;
import com.ss.android.ugc.aweme.discover.ui.SearchOriginalFragment;
import com.ss.android.ugc.aweme.feed.h.aa;
import com.ss.android.ugc.aweme.forward.f.c;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.newfollow.f.f;
import com.ss.android.ugc.aweme.newfollow.ui.FollowEnterDetailViewModel;
import com.ss.android.ugc.aweme.newfollow.ui.j;
import com.ss.android.ugc.aweme.newfollow.util.ScreenBroadcastReceiver;
import com.ss.android.ugc.aweme.newfollow.util.e;
import com.ss.android.ugc.aweme.utils.dq;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020+H\u0014J\u000e\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u0006J\b\u0010.\u001a\u00020+H\u0014J\u001a\u0010/\u001a\u00020+2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00104\u001a\u00020+H\u0014J\b\u00105\u001a\u00020\u001aH\u0002J\u0010\u00106\u001a\u00020+2\u0006\u00107\u001a\u00020\u001aH\u0016J\"\u00108\u001a\u00020+2\u0006\u00109\u001a\u00020\"2\u0006\u0010:\u001a\u00020\"2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J&\u0010=\u001a\u0004\u0018\u0001012\u0006\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010A2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u0010B\u001a\u00020+H\u0016J\b\u0010C\u001a\u00020+H\u0016J\b\u0010D\u001a\u00020+H\u0016J\b\u0010E\u001a\u00020+H\u0016J\b\u0010F\u001a\u00020+H\u0016J\b\u0010G\u001a\u00020+H\u0016J\u0010\u0010H\u001a\u00020+2\u0006\u0010I\u001a\u00020JH\u0017J\b\u0010K\u001a\u00020+H\u0016J\b\u0010L\u001a\u00020+H\u0016J\u0010\u0010M\u001a\u00020+2\u0006\u0010N\u001a\u00020\"H\u0016J\u0010\u0010O\u001a\u00020+2\u0006\u0010P\u001a\u00020\u0006H\u0014J\u0010\u0010Q\u001a\u00020+2\u0006\u0010R\u001a\u00020SH\u0016J\u0010\u0010T\u001a\u00020+2\u0006\u0010U\u001a\u00020\u001aH\u0016J\u0010\u0010V\u001a\u00020\u001a2\u0006\u0010W\u001a\u00020\u001aH\u0016J\b\u0010X\u001a\u00020+H\u0002J\b\u0010Y\u001a\u00020+H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010!\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006Z"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/mixfeed/ui/SearchMixFeedFragment;", "Lcom/ss/android/ugc/aweme/discover/ui/SearchOriginalFragment;", "Lcom/ss/android/ugc/aweme/discover/mixfeed/SearchMixFeed;", "Lcom/ss/android/ugc/aweme/newfollow/util/ScreenBroadcastReceiver$ScreenStateListener;", "()V", "labelName", "", "getLabelName", "()Ljava/lang/String;", "mDiggPresenter", "Lcom/ss/android/ugc/aweme/newfollow/presenter/FollowItemDiggPresenter;", "mHotBar", "Landroid/widget/FrameLayout;", "getMHotBar", "()Landroid/widget/FrameLayout;", "setMHotBar", "(Landroid/widget/FrameLayout;)V", "mHotSearchBar", "Lcom/ss/android/ugc/aweme/discover/mixfeed/ui/HotBar;", "mHotSearchStr", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "getMHotSearchStr", "()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "setMHotSearchStr", "(Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;)V", "mIsResumed", "", "mScreenBroadcastReceiver", "Lcom/ss/android/ugc/aweme/newfollow/util/ScreenBroadcastReceiver;", "mView", "Lcom/ss/android/ugc/aweme/discover/mixfeed/ui/SearchMixFeedViewHolder;", "mixPresenter", "Lcom/ss/android/ugc/aweme/discover/mixfeed/ui/SearchMixFeedPresenter;", "pageType", "", "getPageType", "()I", "presenter", "getPresenter", "()Lcom/ss/android/ugc/aweme/discover/mixfeed/ui/SearchMixFeedPresenter;", "getAnalysis", "Lcom/ss/android/ugc/aweme/analysis/Analysis;", "initAdapter", "", "initHotBar", "word", "initPresenter", "initView", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "invokeShowNetWorkError", "isEnterFullScreenDetail", "mobRefreshDataForV3", "isSuccess", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onDetach", "onPause", "onResume", "onScreenOff", "onScreenOn", "onSearchAfterLogin", "searchAfterLoginEvent", "Lcom/ss/android/ugc/aweme/discover/event/SearchAfterLoginEvent;", "onStop", "onUserPresent", "refreshData", "refreshType", "setKeyword", "keyword", "setSearchKeyword", "searchResultParam", "Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;", "setUserVisibleHint", "isVisibleToUser", "shouldShowSearchAdH5", "inI18n", "startCalTime", "stopCalTime", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchMixFeedFragment extends SearchOriginalFragment<com.ss.android.ugc.aweme.discover.mixfeed.a> implements ScreenBroadcastReceiver.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3039a;
    private c I;
    private ScreenBroadcastReceiver J;
    private boolean K;
    private f L;
    private HotBar M;
    private HashMap N;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public FrameLayout f3040b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public DmtTextView f3041c;

    /* renamed from: d  reason: collision with root package name */
    private e f3042d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/aweme/discover/mixfeed/ui/SearchMixFeedFragment$initPresenter$1", "Lcom/ss/android/ugc/aweme/discover/presenter/ISearchMixView;", "onFetchFailed", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onFetchSuccess", "userList", "Lcom/ss/android/ugc/aweme/discover/model/SearchMix;", "showLoading", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements d {
        public final void a(@Nullable SearchMix searchMix) {
        }

        public final void a(@Nullable Exception exc) {
        }

        a() {
        }
    }

    public final View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.id.ame)}, this, f3039a, false, 36846, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.id.ame)}, this, f3039a, false, 36846, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.N == null) {
            this.N = new HashMap();
        }
        View view = (View) this.N.get(Integer.valueOf(C0906R.id.ame));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(C0906R.id.ame);
            this.N.put(Integer.valueOf(C0906R.id.ame), view);
        }
        return view;
    }

    public final boolean a(boolean z) {
        return false;
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f3039a, false, 36847, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3039a, false, 36847, new Class[0], Void.TYPE);
            return;
        }
        if (this.N != null) {
            this.N.clear();
        }
    }

    @NotNull
    public final String i() {
        return "general_search";
    }

    @NotNull
    private c h() {
        if (PatchProxy.isSupport(new Object[0], this, f3039a, false, 36822, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], this, f3039a, false, 36822, new Class[0], c.class);
        }
        if (this.I == null) {
            this.I = new c(this);
        }
        c cVar = this.I;
        if (cVar == null) {
            Intrinsics.throwNpe();
        }
        return cVar;
    }

    private final void n() {
        if (PatchProxy.isSupport(new Object[0], this, f3039a, false, 36842, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3039a, false, 36842, new Class[0], Void.TYPE);
            return;
        }
        if (getUserVisibleHint() && getActivity() != null && !dq.a()) {
            com.ss.android.ugc.aweme.newfollow.g.a.a();
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f3039a, false, 36825, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3039a, false, 36825, new Class[0], Void.TYPE);
            return;
        }
        super.f();
        b("");
    }

    @NotNull
    public final Analysis getAnalysis() {
        if (PatchProxy.isSupport(new Object[0], this, f3039a, false, 36841, new Class[0], Analysis.class)) {
            return (Analysis) PatchProxy.accessDispatch(new Object[0], this, f3039a, false, 36841, new Class[0], Analysis.class);
        }
        Analysis labelName = new Analysis().setLabelName(i());
        Intrinsics.checkExpressionValueIsNotNull(labelName, "Analysis().setLabelName(labelName)");
        return labelName;
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f3039a, false, 36828, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3039a, false, 36828, new Class[0], Void.TYPE);
            return;
        }
        a((k<?>) new q<Object>(new a()));
    }

    public final void onDetach() {
        if (PatchProxy.isSupport(new Object[0], this, f3039a, false, 36837, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3039a, false, 36837, new Class[0], Void.TYPE);
            return;
        }
        super.onDetach();
    }

    public final void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f3039a, false, 36834, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3039a, false, 36834, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        if (this.f3042d != null) {
            e eVar = this.f3042d;
            if (eVar == null) {
                Intrinsics.throwNpe();
            }
            eVar.k();
        }
        this.K = false;
    }

    private final void o() {
        if (PatchProxy.isSupport(new Object[0], this, f3039a, false, 36843, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3039a, false, 36843, new Class[0], Void.TYPE);
        } else if (getUserVisibleHint()) {
            if (!b.m()) {
                e a2 = e.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "FollowPlayShareInfoManager.getInstance()");
                if (!a2.b()) {
                    com.ss.android.ugc.aweme.newfollow.g.a.a("search", "list");
                }
            } else if (!p()) {
                com.ss.android.ugc.aweme.newfollow.g.a.a("search", "list");
            }
        }
    }

    private final boolean p() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3039a, false, 36844, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3039a, false, 36844, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (b.m()) {
            FollowEnterDetailViewModel.a aVar = FollowEnterDetailViewModel.f57207c;
            String i = i();
            FragmentActivity activity = getActivity();
            if (activity == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
            if (aVar.a(i, activity).f57208b) {
                z = true;
            }
        }
        return z;
    }

    public final void K_() {
        if (PatchProxy.isSupport(new Object[0], this, f3039a, false, 36839, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3039a, false, 36839, new Class[0], Void.TYPE);
            return;
        }
        if (getUserVisibleHint() && this.mStatusActive && !this.K) {
            if (this.f3042d != null) {
                e eVar = this.f3042d;
                if (eVar == null) {
                    Intrinsics.throwNpe();
                }
                eVar.j();
            }
            n();
            this.K = true;
        }
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f3039a, false, 36827, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3039a, false, 36827, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3042d != null) {
            e eVar = this.f3042d;
            if (eVar == null) {
                Intrinsics.throwNpe();
            }
            SearchMixFeedAdapter searchMixFeedAdapter = (SearchMixFeedAdapter) eVar.j;
            Intrinsics.checkExpressionValueIsNotNull(searchMixFeedAdapter, "mView!!.adapter");
            a((BaseAdapter<D>) searchMixFeedAdapter);
            a(new HeaderAndFooterWrapper(v()));
        }
    }

    public final void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f3039a, false, 36835, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3039a, false, 36835, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        this.mStatusActive = false;
        if (this.f3042d != null) {
            e eVar = this.f3042d;
            if (eVar == null) {
                Intrinsics.throwNpe();
            }
            eVar.l();
        }
        if (getActivity() instanceof MainActivity) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainActivity");
            } else if (((MainActivity) activity).isUnderSecondTab()) {
                o();
            }
        }
        this.K = false;
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3039a, false, 36836, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3039a, false, 36836, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (getUserVisibleHint() && !dq.a()) {
            if (this.f3042d != null) {
                e eVar = this.f3042d;
                if (eVar == null) {
                    Intrinsics.throwNpe();
                }
                eVar.j();
            }
            n();
            this.K = true;
        }
    }

    public final void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f3039a, false, 36845, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3039a, false, 36845, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.I != null) {
            c cVar = this.I;
            if (cVar == null) {
                Intrinsics.throwNpe();
            }
            cVar.k();
            c cVar2 = this.I;
            if (cVar2 == null) {
                Intrinsics.throwNpe();
            }
            cVar2.j();
            c cVar3 = this.I;
            if (cVar3 == null) {
                Intrinsics.throwNpe();
            }
            cVar3.p();
            c cVar4 = this.I;
            if (cVar4 == null) {
                Intrinsics.throwNpe();
            }
            cVar4.o();
        }
        if (this.f3042d != null) {
            e eVar = this.f3042d;
            if (eVar == null) {
                Intrinsics.throwNpe();
            }
            eVar.m();
        }
        if (this.L != null) {
            f fVar = this.L;
            if (fVar == null) {
                Intrinsics.throwNpe();
            }
            fVar.k();
        }
        ScreenBroadcastReceiver screenBroadcastReceiver = this.J;
        if (screenBroadcastReceiver == null) {
            Intrinsics.throwNpe();
        }
        screenBroadcastReceiver.a();
        e.a().a("key_container_search_mix");
        c.a().b();
        g();
    }

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f3039a, false, 36833, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f3039a, false, 36833, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "keyword");
        c(str);
    }

    public final void a_(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3039a, false, 36831, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3039a, false, 36831, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        String i = i();
        if (TextUtils.equals("general_search", i)) {
            i = "general";
        }
        String str = i;
        c cVar = this.I;
        if (cVar == null) {
            Intrinsics.throwNpe();
        }
        String str2 = cVar.i().f42718f;
        String str3 = this.h;
        c cVar2 = this.I;
        if (cVar2 == null) {
            Intrinsics.throwNpe();
        }
        a(str, str2, str3, z, cVar2.i().f());
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f3039a, false, 36829, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f3039a, false, 36829, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.b(i);
        if (this.f3042d != null) {
            if ((this.k == 2 || this.k == 5) && TextUtils.equals(this.i, this.h)) {
                h().a(SearchBaseFragment.a.a());
            } else {
                h().a(0);
            }
            h().d(this.l);
            e eVar = this.f3042d;
            if (eVar == null) {
                Intrinsics.throwNpe();
            }
            eVar.b(0);
        }
    }

    @Subscribe
    public final void onSearchAfterLogin(@NotNull com.ss.android.ugc.aweme.discover.a.d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f3039a, false, 36830, new Class[]{com.ss.android.ugc.aweme.discover.a.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f3039a, false, 36830, new Class[]{com.ss.android.ugc.aweme.discover.a.d.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dVar, "searchAfterLoginEvent");
        if (dVar.f41491a && isViewValid() && this.f3042d != null) {
            e eVar = this.f3042d;
            if (eVar == null) {
                Intrinsics.throwNpe();
            }
            DmtStatusView dmtStatusView = eVar.mLoadingStatusView;
            Intrinsics.checkExpressionValueIsNotNull(dmtStatusView, "mView!!.loadingStatusView");
            if (dmtStatusView.j()) {
                e eVar2 = this.f3042d;
                if (eVar2 == null) {
                    Intrinsics.throwNpe();
                }
                eVar2.mLoadingStatusView.b();
                this.E = true;
                d(false);
            }
        }
    }

    public final void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3039a, false, 36838, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3039a, false, 36838, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (this.f3042d != null) {
            e eVar = this.f3042d;
            if (eVar == null) {
                Intrinsics.throwNpe();
            }
            eVar.d(z);
        }
        if (z) {
            n();
        } else {
            o();
        }
    }

    public final void a(@NotNull SearchResultParam searchResultParam) {
        SearchResultParam searchResultParam2 = searchResultParam;
        if (PatchProxy.isSupport(new Object[]{searchResultParam2}, this, f3039a, false, 36832, new Class[]{SearchResultParam.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchResultParam2}, this, f3039a, false, 36832, new Class[]{SearchResultParam.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(searchResultParam2, "searchResultParam");
        e eVar = this.f3042d;
        if (eVar != null) {
            eVar.a(searchResultParam2);
        }
        super.a(searchResultParam);
    }

    public final void b(@NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3039a, false, 36826, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3039a, false, 36826, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "word");
        if (this.M == null) {
            HotBar hotBar = new HotBar(this, this.f3040b, this.f3041c, q(), str);
            this.M = hotBar;
        } else {
            HotBar hotBar2 = this.M;
            if (hotBar2 == null) {
                Intrinsics.throwNpe();
            }
            hotBar2.a(this, this.f3040b, this.f3041c, q(), str);
        }
        HotBar hotBar3 = this.M;
        if (hotBar3 == null) {
            Intrinsics.throwNpe();
        }
        hotBar3.b();
    }

    public final void a(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f3039a, false, 36824, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f3039a, false, 36824, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.L = new f(i(), 9);
        f fVar = this.L;
        if (fVar == null) {
            Intrinsics.throwNpe();
        }
        fVar.d();
        this.f3040b = (FrameLayout) view.findViewById(C0906R.id.aoy);
        this.f3041c = (DmtTextView) view.findViewById(C0906R.id.da0);
        this.f3042d = new e();
        f fVar2 = this.L;
        if (fVar2 == null) {
            Intrinsics.throwNpe();
        }
        fVar2.a(new aa());
        f fVar3 = this.L;
        if (fVar3 == null) {
            Intrinsics.throwNpe();
        }
        fVar3.a((j) this.f3042d);
        this.J = new ScreenBroadcastReceiver(getContext());
        ScreenBroadcastReceiver screenBroadcastReceiver = this.J;
        if (screenBroadcastReceiver == null) {
            Intrinsics.throwNpe();
        }
        screenBroadcastReceiver.a(this);
        this.I = h();
        c cVar = this.I;
        if (cVar == null) {
            Intrinsics.throwNpe();
        }
        cVar.a((Fragment) this, 9);
        c cVar2 = this.I;
        if (cVar2 == null) {
            Intrinsics.throwNpe();
        }
        cVar2.a(this.f3042d);
        e eVar = this.f3042d;
        if (eVar == null) {
            Intrinsics.throwNpe();
        }
        eVar.a(this, view, this.I, this.L, this.h);
        l();
        e eVar2 = this.f3042d;
        if (eVar2 == null) {
            Intrinsics.throwNpe();
        }
        NestedScrollingRecyclerView nestedScrollingRecyclerView = eVar2.mRecyclerView;
        Intrinsics.checkExpressionValueIsNotNull(nestedScrollingRecyclerView, "mView!!.recycleView");
        a((RecyclerView) nestedScrollingRecyclerView);
        com.ss.android.ugc.aweme.discover.mixfeed.c cVar3 = new com.ss.android.ugc.aweme.discover.mixfeed.c();
        c cVar4 = this.I;
        if (cVar4 == null) {
            Intrinsics.throwNpe();
        }
        cVar4.a(cVar3);
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f3039a, false, 36840, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f3039a, false, 36840, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            b(0);
        }
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3039a, false, 36823, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3039a, false, 36823, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        return layoutInflater2.inflate(C0906R.layout.q0, viewGroup2, false);
    }
}
