package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.detail.DetailFeedPagerAdapter;
import com.ss.android.ugc.aweme.detail.ui.c;
import com.ss.android.ugc.aweme.detail.ui.d;
import com.ss.android.ugc.aweme.detail.ui.i;
import com.ss.android.ugc.aweme.feed.adapter.FeedImageViewHolder;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013JF\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\tH\u0016J6\u0010\u001f\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/DiscoveryV3DetailFeedPagerAdapter;", "Lcom/ss/android/ugc/aweme/detail/DetailFeedPagerAdapter;", "viewHolderHost", "Lcom/ss/android/ugc/aweme/detail/ui/IDetailFeedViewHolderHost;", "context", "Landroid/content/Context;", "inflater", "Landroid/view/LayoutInflater;", "viewTypeCount", "", "listener", "Lcom/ss/android/ugc/aweme/feed/event/OnInternalEventListener;", "Lcom/ss/android/ugc/aweme/feed/event/VideoEvent;", "fragment", "Landroid/support/v4/app/Fragment;", "tapTouchListener", "Landroid/view/View$OnTouchListener;", "baseFeedPageParams", "Lcom/ss/android/ugc/aweme/feed/model/BaseFeedPageParams;", "(Lcom/ss/android/ugc/aweme/detail/ui/IDetailFeedViewHolderHost;Landroid/content/Context;Landroid/view/LayoutInflater;ILcom/ss/android/ugc/aweme/feed/event/OnInternalEventListener;Landroid/support/v4/app/Fragment;Landroid/view/View$OnTouchListener;Lcom/ss/android/ugc/aweme/feed/model/BaseFeedPageParams;)V", "mPlayListId", "", "mPlayListIdKey", "mPlayListType", "createFeedImageViewHolder", "Lcom/ss/android/ugc/aweme/feed/adapter/FeedImageViewHolder;", "fromPage", "view", "Landroid/view/View;", "eventType", "pageType", "createVideoViewHolder", "Lcom/ss/android/ugc/aweme/feed/adapter/VideoViewHolder;", "setPlayListMobInfo", "", "playListType", "playListIdKey", "playListId", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DiscoveryV3DetailFeedPagerAdapter extends DetailFeedPagerAdapter {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f42891c;

    /* renamed from: d  reason: collision with root package name */
    String f42892d;

    /* renamed from: e  reason: collision with root package name */
    String f42893e;

    /* renamed from: f  reason: collision with root package name */
    String f42894f;

    @NotNull
    public final VideoViewHolder a(@NotNull View view, @NotNull aa<ar> aaVar, @NotNull View.OnTouchListener onTouchListener, @NotNull Fragment fragment, @NotNull BaseFeedPageParams baseFeedPageParams) {
        View view2 = view;
        aa<ar> aaVar2 = aaVar;
        View.OnTouchListener onTouchListener2 = onTouchListener;
        Fragment fragment2 = fragment;
        BaseFeedPageParams baseFeedPageParams2 = baseFeedPageParams;
        if (PatchProxy.isSupport(new Object[]{view2, aaVar2, onTouchListener2, fragment2, baseFeedPageParams2}, this, f42891c, false, 37578, new Class[]{View.class, aa.class, View.OnTouchListener.class, Fragment.class, BaseFeedPageParams.class}, VideoViewHolder.class)) {
            return (VideoViewHolder) PatchProxy.accessDispatch(new Object[]{view2, aaVar2, onTouchListener2, fragment2, baseFeedPageParams2}, this, f42891c, false, 37578, new Class[]{View.class, aa.class, View.OnTouchListener.class, Fragment.class, BaseFeedPageParams.class}, VideoViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        Intrinsics.checkParameterIsNotNull(aaVar2, "listener");
        Intrinsics.checkParameterIsNotNull(onTouchListener2, "tapTouchListener");
        Intrinsics.checkParameterIsNotNull(fragment2, "fragment");
        Intrinsics.checkParameterIsNotNull(baseFeedPageParams2, "baseFeedPageParams");
        d dVar = new d(this.f41090b, view, aaVar, onTouchListener, fragment, baseFeedPageParams, this.j);
        dVar.a(this.f42892d, this.f42893e, this.f42894f);
        return dVar;
    }

    @NotNull
    public final FeedImageViewHolder a(int i, @NotNull View view, @NotNull aa<ar> aaVar, @NotNull String str, @NotNull View.OnTouchListener onTouchListener, @NotNull Fragment fragment, int i2) {
        View view2 = view;
        aa<ar> aaVar2 = aaVar;
        String str2 = str;
        View.OnTouchListener onTouchListener2 = onTouchListener;
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), view2, aaVar2, str2, onTouchListener2, fragment2, Integer.valueOf(i2)}, this, f42891c, false, 37579, new Class[]{Integer.TYPE, View.class, aa.class, String.class, View.OnTouchListener.class, Fragment.class, Integer.TYPE}, FeedImageViewHolder.class)) {
            return (FeedImageViewHolder) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), view2, aaVar2, str2, onTouchListener2, fragment2, Integer.valueOf(i2)}, this, f42891c, false, 37579, new Class[]{Integer.TYPE, View.class, aa.class, String.class, View.OnTouchListener.class, Fragment.class, Integer.TYPE}, FeedImageViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        Intrinsics.checkParameterIsNotNull(aaVar2, "listener");
        Intrinsics.checkParameterIsNotNull(str2, "eventType");
        Intrinsics.checkParameterIsNotNull(onTouchListener2, "tapTouchListener");
        Intrinsics.checkParameterIsNotNull(fragment2, "fragment");
        c cVar = new c(this.f41090b, i, view, aaVar, str, onTouchListener, fragment, i2);
        cVar.a(this.f42892d, this.f42893e, this.f42894f);
        return cVar;
    }

    public DiscoveryV3DetailFeedPagerAdapter(@Nullable i iVar, @Nullable Context context, @Nullable LayoutInflater layoutInflater, int i, @Nullable aa<ar> aaVar, @Nullable Fragment fragment, @Nullable View.OnTouchListener onTouchListener, @Nullable BaseFeedPageParams baseFeedPageParams) {
        super(iVar, context, layoutInflater, i, aaVar, fragment, onTouchListener, baseFeedPageParams);
    }
}
