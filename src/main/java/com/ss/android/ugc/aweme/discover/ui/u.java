package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3;
import com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter;
import com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.guide.a.b;
import com.ss.android.ugc.aweme.feed.guide.i;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.u.ab;
import com.ss.android.ugc.aweme.u.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016JR\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u001aH\u0016J\u0012\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0018\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001aH\u0014J\b\u0010$\u001a\u00020\u0007H\u0016J\b\u0010%\u001a\u00020\u0007H\u0016J\b\u0010&\u001a\u00020\u0007H\u0016J\u0010\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020)H\u0016J\"\u0010*\u001a\u00020\u00072\u0010\u0010+\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010-\u0018\u00010,2\u0006\u0010.\u001a\u00020)H\u0016J\b\u0010/\u001a\u00020\u0007H\u0016J\b\u00100\u001a\u00020\u0007H\u0016J\u001c\u00101\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0018\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u001aH\u0014J\u0018\u00108\u001a\u00020\u00072\u000e\u0010+\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010,H\u0014J\b\u00109\u001a\u00020\u0007H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/DiscoveryV3DetailFragmentPanel;", "Lcom/ss/android/ugc/aweme/detail/panel/DetailFragmentPanel;", "Lcom/ss/android/ugc/aweme/feed/guide/contract/FeedFragmentEventObserver;", "()V", "guideHelper", "Lcom/ss/android/ugc/aweme/feed/guide/SwipeUpGuide4Helper;", "cancelSwipeUpGuide", "", "createFeedPagerAdapter", "Lcom/ss/android/ugc/aweme/feed/adapter/FeedPagerAdapter;", "context", "Landroid/content/Context;", "inflater", "Landroid/view/LayoutInflater;", "viewTypeCount", "", "listener", "Lcom/ss/android/ugc/aweme/feed/event/OnInternalEventListener;", "Lcom/ss/android/ugc/aweme/feed/event/VideoEvent;", "fragment", "Landroid/support/v4/app/Fragment;", "tapTouchListener", "Landroid/view/View$OnTouchListener;", "baseFeedPageParams", "Lcom/ss/android/ugc/aweme/feed/model/BaseFeedPageParams;", "getPlayListIdKey", "", "getPlayListIdValue", "getPlayListType", "initAdvancedGuide", "view", "Landroid/view/View;", "mobCommentPost", "baseHolder", "Lcom/ss/android/ugc/aweme/feed/adapter/IFeedViewHolder;", "eventType", "onDoubleTap", "onFeedCompleted", "onFeedPlay", "onFeedSwipeSwitch", "down", "", "onRefreshResult", "list", "", "", "hasMore", "onUserClickLike", "onUserInteraction", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "sendMTFollowEvent", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "uid", "setAdapterData", "showSwipeUpGuide", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class u extends DetailFragmentPanel implements b {
    public static ChangeQuickRedirect r;
    private i s;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43197a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f43198b;

        a(u uVar) {
            this.f43198b = uVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f43197a, false, 37593, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f43197a, false, 37593, new Class[0], Void.TYPE);
                return;
            }
            this.f43198b.G_();
        }
    }

    public final void I() {
    }

    @NotNull
    public final String K() {
        return "playlist_id";
    }

    public final void M() {
    }

    public u() {
        this.U.l = this;
    }

    public final void E() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 37589, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 37589, new Class[0], Void.TYPE);
            return;
        }
        i iVar = this.s;
        if (iVar != null) {
            iVar.b();
        }
        this.s = null;
    }

    public final void G() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 37590, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 37590, new Class[0], Void.TYPE);
            return;
        }
        if (this.h.h(true)) {
            this.mLayout.postDelayed(new a(this), 2000);
        }
    }

    public final void H() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 37591, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 37591, new Class[0], Void.TYPE);
            return;
        }
        E();
    }

    @NotNull
    public final String J() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 37587, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, r, false, 37587, new Class[0], String.class);
        }
        DiscoveryCellStructV3.Companion companion = DiscoveryCellStructV3.Companion;
        com.ss.android.ugc.aweme.feed.param.b bVar = this.T;
        Intrinsics.checkExpressionValueIsNotNull(bVar, "param");
        return companion.getPlayListType(bVar.getType());
    }

    @NotNull
    public final String L() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 37586, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, r, false, 37586, new Class[0], String.class);
        }
        com.ss.android.ugc.aweme.feed.param.b bVar = this.T;
        Intrinsics.checkExpressionValueIsNotNull(bVar, "param");
        String cellId = bVar.getCellId();
        Intrinsics.checkExpressionValueIsNotNull(cellId, "param.cellId");
        return cellId;
    }

    public final void G_() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 37588, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 37588, new Class[0], Void.TYPE);
            return;
        }
        View view = this.mLayout;
        Intrinsics.checkExpressionValueIsNotNull(view, "mLayout");
        ViewStub viewStub = (ViewStub) view.findViewById(C0906R.id.cwu);
        if (viewStub != null) {
            viewStub.inflate();
        }
        View findViewById = this.mLayout.findViewById(C0906R.id.yn);
        if (findViewById != null) {
            this.s = new i(this.ar, findViewById, a(true));
        }
        i iVar = this.s;
        if (iVar != null) {
            iVar.a();
        }
    }

    public final void a(@Nullable View view) {
        this.Z = this;
    }

    public final void h(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, r, false, 37592, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, r, false, 37592, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        E();
    }

    public final void c(@Nullable List<Aweme> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, r, false, 37582, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, r, false, 37582, new Class[]{List.class}, Void.TYPE);
            return;
        }
        super.c(list);
        this.S.a(J(), K(), L());
    }

    public final void a(@Nullable View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, r, false, 37580, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, r, false, 37580, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.a(view, bundle);
        this.mLoadMoreLayout.setLoadMoreEmptyView(LayoutInflater.from(this.ar).inflate(C0906R.layout.aqq, null));
    }

    public final void a(@NotNull IFeedViewHolder iFeedViewHolder, @NotNull String str) {
        IFeedViewHolder iFeedViewHolder2 = iFeedViewHolder;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder2, str2}, this, r, false, 37584, new Class[]{IFeedViewHolder.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iFeedViewHolder2, str2}, this, r, false, 37584, new Class[]{IFeedViewHolder.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(iFeedViewHolder2, "baseHolder");
        Intrinsics.checkParameterIsNotNull(str2, "eventType");
        new ab().a(str2).b(str2).l(L()).k(K()).i(J()).f(iFeedViewHolder.d()).f(String.valueOf(this.n)).e();
    }

    public final void a(@NotNull Aweme aweme, @NotNull String str) {
        String str2;
        String str3;
        Aweme aweme2 = aweme;
        String str4 = str;
        if (PatchProxy.isSupport(new Object[]{aweme2, str4}, this, r, false, 37585, new Class[]{Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, str4}, this, r, false, 37585, new Class[]{Aweme.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aweme2, "aweme");
        Intrinsics.checkParameterIsNotNull(str4, "uid");
        s b2 = new s().b(a(true));
        if (TextUtils.isEmpty(O())) {
            str2 = f();
        } else {
            str2 = O();
        }
        s f2 = b2.f(str2);
        if (TextUtils.isEmpty(O())) {
            str3 = "follow_button";
        } else {
            str3 = bf();
        }
        f2.g(str3).p(L()).o(K()).n(J()).c("follow_button").h(str4).b(aweme2, bh()).e();
    }

    public final void a(@Nullable List<Object> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, r, false, 37583, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, r, false, 37583, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a((List) list, z);
        if (this.a_ != null) {
            this.a_.m();
        }
    }

    @NotNull
    public final FeedPagerAdapter a(@Nullable Context context, @Nullable LayoutInflater layoutInflater, int i, @Nullable aa<ar> aaVar, @Nullable Fragment fragment, @Nullable View.OnTouchListener onTouchListener, @Nullable BaseFeedPageParams baseFeedPageParams) {
        if (PatchProxy.isSupport(new Object[]{context, layoutInflater, 4, aaVar, fragment, onTouchListener, baseFeedPageParams}, this, r, false, 37581, new Class[]{Context.class, LayoutInflater.class, Integer.TYPE, aa.class, Fragment.class, View.OnTouchListener.class, BaseFeedPageParams.class}, FeedPagerAdapter.class)) {
            return (FeedPagerAdapter) PatchProxy.accessDispatch(new Object[]{context, layoutInflater, 4, aaVar, fragment, onTouchListener, baseFeedPageParams}, this, r, false, 37581, new Class[]{Context.class, LayoutInflater.class, Integer.TYPE, aa.class, Fragment.class, View.OnTouchListener.class, BaseFeedPageParams.class}, FeedPagerAdapter.class);
        }
        DiscoveryV3DetailFeedPagerAdapter discoveryV3DetailFeedPagerAdapter = new DiscoveryV3DetailFeedPagerAdapter(this.f3000c, context, layoutInflater, 4, aaVar, fragment, onTouchListener, baseFeedPageParams);
        String J = J();
        String K = K();
        String L = L();
        if (PatchProxy.isSupport(new Object[]{J, K, L}, discoveryV3DetailFeedPagerAdapter, DiscoveryV3DetailFeedPagerAdapter.f42891c, false, 37577, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{J, K, L}, discoveryV3DetailFeedPagerAdapter, DiscoveryV3DetailFeedPagerAdapter.f42891c, false, 37577, new Class[]{String.class, String.class, String.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(J, "playListType");
            Intrinsics.checkParameterIsNotNull(K, "playListIdKey");
            Intrinsics.checkParameterIsNotNull(L, "playListId");
            discoveryV3DetailFeedPagerAdapter.f42894f = L;
            discoveryV3DetailFeedPagerAdapter.f42892d = J;
            discoveryV3DetailFeedPagerAdapter.f42893e = K;
        }
        return discoveryV3DetailFeedPagerAdapter;
    }
}
