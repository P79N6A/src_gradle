package com.ss.android.ugc.aweme.newfollow.vh;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.d;
import com.ss.android.ugc.aweme.forward.a.a;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.utils.dp;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0014J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0002¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/vh/InsFollowLiveViewHolderD;", "Lcom/ss/android/ugc/aweme/newfollow/vh/InsFollowLiveViewHolderB;", "view", "Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;", "provider", "Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;", "scrollStateManager", "Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;", "diggAwemeListener", "Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;", "dialogController", "Lcom/ss/android/ugc/aweme/feed/DialogController;", "(Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;Lcom/ss/android/ugc/aweme/feed/DialogController;)V", "bindViews", "", "inflateStub", "root", "Landroid/view/View;", "onLiveSizeChanged", "width", "", "height", "setSmallWindowRoundCorner", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class InsFollowLiveViewHolderD extends InsFollowLiveViewHolderB {
    public static ChangeQuickRedirect aa;

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, aa, false, 62506, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, aa, false, 62506, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, aa, false, 62508, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, aa, false, 62508, new Class[0], Void.TYPE);
        } else if (Build.VERSION.SDK_INT >= 21) {
            aj().setOutlineProvider(new dp((int) UIUtils.dip2Px(X(), 2.0f)));
            aj().setClipToOutline(true);
        }
        super.n();
    }

    public final void a(@Nullable View view) {
        ViewStub viewStub;
        View view2;
        ViewStub viewStub2;
        View view3;
        ViewStub viewStub3;
        if (PatchProxy.isSupport(new Object[]{view}, this, aa, false, 62505, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, aa, false, 62505, new Class[]{View.class}, Void.TYPE);
            return;
        }
        View view4 = null;
        if (view != null) {
            viewStub = (ViewStub) view.findViewById(C0906R.id.cwo);
        } else {
            viewStub = null;
        }
        if (viewStub != null) {
            viewStub.setLayoutResource(C0906R.layout.a5b);
        }
        if (viewStub != null) {
            view2 = viewStub.inflate();
        } else {
            view2 = null;
        }
        a(view2, 4.0f);
        if (view != null) {
            viewStub2 = (ViewStub) view.findViewById(C0906R.id.cwh);
        } else {
            viewStub2 = null;
        }
        if (viewStub2 != null) {
            viewStub2.setLayoutResource(C0906R.layout.a4g);
        }
        if (viewStub2 != null) {
            view3 = viewStub2.inflate();
        } else {
            view3 = null;
        }
        a(view3, 12.0f);
        if (view != null) {
            viewStub3 = (ViewStub) view.findViewById(C0906R.id.cwl);
        } else {
            viewStub3 = null;
        }
        if (viewStub3 != null) {
            viewStub3.setLayoutResource(C0906R.layout.a49);
        }
        if (viewStub3 != null) {
            view4 = viewStub3.inflate();
        }
        a(view4, 16.0f, 16.0f, 0.0f, 0.0f);
    }

    public final void a(int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, aa, false, 62507, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, aa, false, 62507, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        FrameLayout aj = aj();
        if (aj != null) {
            layoutParams = aj.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (i > i2) {
                layoutParams2.width = (int) UIUtils.dip2Px(X(), 267.0f);
                layoutParams2.height = (int) UIUtils.dip2Px(X(), 150.0f);
            } else {
                layoutParams2.width = (int) UIUtils.dip2Px(X(), 150.0f);
                layoutParams2.height = (int) UIUtils.dip2Px(X(), 267.0f);
            }
            aj().setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsFollowLiveViewHolderD(@NotNull FollowFeedLayout followFeedLayout, @NotNull a aVar, @NotNull l lVar, @NotNull com.ss.android.ugc.aweme.newfollow.b.a aVar2, @NotNull d dVar) {
        super(followFeedLayout, aVar, lVar, aVar2, dVar);
        Intrinsics.checkParameterIsNotNull(followFeedLayout, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        Intrinsics.checkParameterIsNotNull(lVar, "scrollStateManager");
        Intrinsics.checkParameterIsNotNull(aVar2, "diggAwemeListener");
        Intrinsics.checkParameterIsNotNull(dVar, "dialogController");
    }
}
