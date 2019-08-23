package com.ss.android.ugc.aweme.discover.mixfeed.viewholder;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.discover.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.discover.helper.b;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.feed.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.a.a;
import com.ss.android.ugc.aweme.newfollow.ui.FollowEnterDetailViewModel;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.vh.FollowVideoViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0019\u001a\u00020\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u001aH\u0014J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001fH\u0014J\b\u0010 \u001a\u00020!H\u0014J\u0010\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001dH\u0014J\u0010\u0010#\u001a\u00020\u001a2\b\u0010$\u001a\u0004\u0018\u00010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/mixfeed/viewholder/SearchMixVideoViewHolder;", "Lcom/ss/android/ugc/aweme/newfollow/vh/FollowVideoViewHolder;", "view", "Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;", "provider", "Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;", "scrollStateManager", "Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;", "diggAwemeListener", "Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;", "dialogController", "Lcom/ss/android/ugc/aweme/feed/DialogController;", "(Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;Lcom/ss/android/ugc/aweme/feed/DialogController;)V", "getDialogController", "()Lcom/ss/android/ugc/aweme/feed/DialogController;", "getDiggAwemeListener", "()Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;", "getProvider", "()Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;", "getScrollStateManager", "()Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;", "searchParam", "Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;", "getView", "()Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;", "enterDetail", "", "expandVideo", "getEnterDetail", "", "getFrom", "", "getPageType", "", "setEnterDetail", "setSearchParam", "param", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchMixVideoViewHolder extends FollowVideoViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42626a;

    /* renamed from: b  reason: collision with root package name */
    public SearchResultParam f42627b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final FollowFeedLayout f42628c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final a f42629d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final l f42630e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.newfollow.b.a f42631f;
    @NotNull
    public final d g;

    @NotNull
    public final String D_() {
        return "from_search_mix";
    }

    public final int e() {
        return 9;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f42626a, false, 36937, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42626a, false, 36937, new Class[0], Void.TYPE);
        } else if (b.m()) {
            C_();
        } else {
            super.a();
        }
    }

    public final void C_() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f42626a, false, 36938, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42626a, false, 36938, new Class[0], Void.TYPE);
            return;
        }
        super.C_();
        Context X = X();
        SearchResultParam searchResultParam = this.f42627b;
        if (searchResultParam != null) {
            str = searchResultParam.getKeyword();
        } else {
            str = null;
        }
        String str2 = str;
        Aweme aweme = this.j;
        Intrinsics.checkExpressionValueIsNotNull(aweme, "mAweme");
        String aid = aweme.getAid();
        String d2 = d();
        String D_ = D_();
        Aweme aweme2 = this.j;
        Intrinsics.checkExpressionValueIsNotNull(aweme2, "mAweme");
        DetailActivity.a(X, str2, aid, d2, D_, aweme2.getEnterpriseType(), e(), g(), this.mVideoLayout);
    }

    public final boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f42626a, false, 36940, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f42626a, false, 36940, new Class[0], Boolean.TYPE)).booleanValue();
        }
        FollowEnterDetailViewModel.a aVar = FollowEnterDetailViewModel.f57207c;
        String d2 = d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "eventType");
        Context X = X();
        if (!(X instanceof SearchResultActivity)) {
            X = null;
        }
        SearchResultActivity searchResultActivity = (SearchResultActivity) X;
        if (searchResultActivity != null) {
            z = aVar.a(d2, searchResultActivity).f57208b;
        }
        return z;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f42626a, false, 36939, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f42626a, false, 36939, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        FollowEnterDetailViewModel.a aVar = FollowEnterDetailViewModel.f57207c;
        String d2 = d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "eventType");
        Context X = X();
        if (!(X instanceof SearchResultActivity)) {
            X = null;
        }
        SearchResultActivity searchResultActivity = (SearchResultActivity) X;
        if (searchResultActivity != null) {
            aVar.a(d2, searchResultActivity).f57208b = z;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchMixVideoViewHolder(@NotNull FollowFeedLayout followFeedLayout, @NotNull a aVar, @NotNull l lVar, @NotNull com.ss.android.ugc.aweme.newfollow.b.a aVar2, @NotNull d dVar) {
        super(followFeedLayout, aVar, lVar, aVar2, dVar);
        Intrinsics.checkParameterIsNotNull(followFeedLayout, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        Intrinsics.checkParameterIsNotNull(lVar, "scrollStateManager");
        Intrinsics.checkParameterIsNotNull(aVar2, "diggAwemeListener");
        Intrinsics.checkParameterIsNotNull(dVar, "dialogController");
        this.f42628c = followFeedLayout;
        this.f42629d = aVar;
        this.f42630e = lVar;
        this.f42631f = aVar2;
        this.g = dVar;
    }
}
