package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.feed.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.a.a;
import com.ss.android.ugc.aweme.newfollow.ui.FollowEnterDetailViewModel;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.vh.FollowVideoViewHolder;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.e.e;
import com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u001b\u001a\u00020\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u001cH\u0014J\b\u0010\u001e\u001a\u00020\u001fH\u0014J\b\u0010 \u001a\u00020!H\u0014J\b\u0010\"\u001a\u00020#H\u0014J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001fH\u0014R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006%"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/adapter/viewholder/PoiVideoViewHolder;", "Lcom/ss/android/ugc/aweme/newfollow/vh/FollowVideoViewHolder;", "view", "Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;", "poiSimpleBundle", "Lcom/ss/android/ugc/aweme/poi/PoiSimpleBundle;", "provider", "Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;", "scrollStateManager", "Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;", "diggAwemeListener", "Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;", "dialogController", "Lcom/ss/android/ugc/aweme/feed/DialogController;", "(Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;Lcom/ss/android/ugc/aweme/poi/PoiSimpleBundle;Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;Lcom/ss/android/ugc/aweme/feed/DialogController;)V", "getDialogController", "()Lcom/ss/android/ugc/aweme/feed/DialogController;", "getDiggAwemeListener", "()Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;", "getPoiSimpleBundle", "()Lcom/ss/android/ugc/aweme/poi/PoiSimpleBundle;", "getProvider", "()Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;", "getScrollStateManager", "()Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;", "getView", "()Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;", "enterDetail", "", "expandVideo", "getEnterDetail", "", "getFrom", "", "getPageType", "", "setEnterDetail", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PoiVideoViewHolder extends FollowVideoViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59650a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final FollowFeedLayout f59651b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final c f59652c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final a f59653d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final l f59654e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.newfollow.b.a f59655f;
    @NotNull
    public final d g;

    @NotNull
    public final String D_() {
        return "from_poi_detail";
    }

    public final int e() {
        return 10;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f59650a, false, 64910, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59650a, false, 64910, new Class[0], Void.TYPE);
        } else if (e.a()) {
            C_();
        } else {
            super.a();
        }
    }

    public final void C_() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, f59650a, false, 64911, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59650a, false, 64911, new Class[0], Void.TYPE);
            return;
        }
        super.C_();
        Context X = X();
        Aweme aweme = this.j;
        Intrinsics.checkExpressionValueIsNotNull(aweme, "mAweme");
        String aid = aweme.getAid();
        String d2 = d();
        String D_ = D_();
        Aweme aweme2 = this.j;
        Intrinsics.checkExpressionValueIsNotNull(aweme2, "mAweme");
        int enterpriseType = aweme2.getEnterpriseType();
        int e2 = e();
        String g2 = g();
        c cVar = this.f59652c;
        if (cVar != null) {
            str = cVar.getPoiId();
        } else {
            str = null;
        }
        c cVar2 = this.f59652c;
        if (cVar2 != null) {
            str2 = cVar2.getAwemeId();
        } else {
            str2 = null;
        }
        DetailActivity.a(X, aid, d2, D_, enterpriseType, e2, g2, str, str2, this.mVideoLayout);
    }

    public final boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f59650a, false, 64913, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f59650a, false, 64913, new Class[0], Boolean.TYPE)).booleanValue();
        }
        FollowEnterDetailViewModel.a aVar = FollowEnterDetailViewModel.f57207c;
        String d2 = d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "eventType");
        Context X = X();
        if (!(X instanceof PoiDetailActivity)) {
            X = null;
        }
        PoiDetailActivity poiDetailActivity = (PoiDetailActivity) X;
        if (poiDetailActivity != null) {
            z = aVar.a(d2, poiDetailActivity).f57208b;
        }
        return z;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f59650a, false, 64912, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f59650a, false, 64912, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        FollowEnterDetailViewModel.a aVar = FollowEnterDetailViewModel.f57207c;
        String d2 = d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "eventType");
        Context X = X();
        if (!(X instanceof PoiDetailActivity)) {
            X = null;
        }
        PoiDetailActivity poiDetailActivity = (PoiDetailActivity) X;
        if (poiDetailActivity != null) {
            aVar.a(d2, poiDetailActivity).f57208b = z;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PoiVideoViewHolder(@NotNull FollowFeedLayout followFeedLayout, @Nullable c cVar, @NotNull a aVar, @NotNull l lVar, @NotNull com.ss.android.ugc.aweme.newfollow.b.a aVar2, @NotNull d dVar) {
        super(followFeedLayout, aVar, lVar, aVar2, dVar);
        Intrinsics.checkParameterIsNotNull(followFeedLayout, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        Intrinsics.checkParameterIsNotNull(lVar, "scrollStateManager");
        Intrinsics.checkParameterIsNotNull(aVar2, "diggAwemeListener");
        Intrinsics.checkParameterIsNotNull(dVar, "dialogController");
        this.f59651b = followFeedLayout;
        this.f59652c = cVar;
        this.f59653d = aVar;
        this.f59654e = lVar;
        this.f59655f = aVar2;
        this.g = dVar;
    }
}
