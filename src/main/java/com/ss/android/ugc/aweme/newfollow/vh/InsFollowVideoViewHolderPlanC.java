package com.ss.android.ugc.aweme.newfollow.vh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.forward.a.a;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J \u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\"\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0010H\u0014¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/vh/InsFollowVideoViewHolderPlanC;", "Lcom/ss/android/ugc/aweme/newfollow/vh/InsFollowVideoViewHolder;", "view", "Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;", "provider", "Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;", "scrollStateManager", "Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;", "diggAwemeListener", "Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;", "dialogController", "Lcom/ss/android/ugc/aweme/feed/DialogController;", "(Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;Lcom/ss/android/ugc/aweme/feed/DialogController;)V", "adjustVideoViewRegion", "", "layoutWidth", "", "layoutHeight", "calNewMediaItemSize", "screenWidth", "ratioHW", "", "dstSize", "", "updateMediaItemLayoutParams", "Landroid/view/View;", "mediaWidth", "mediaHeight", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class InsFollowVideoViewHolderPlanC extends InsFollowVideoViewHolder {
    public static ChangeQuickRedirect aa;

    public final void a(@Nullable View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, aa, false, 62535, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, aa, false, 62535, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (view2 != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int[] iArr = new int[2];
            int screenWidth = UIUtils.getScreenWidth(X());
            float f2 = ((float) i2) / ((float) i);
            iArr[0] = screenWidth;
            if (f2 > 1.2533333f) {
                iArr[1] = (int) (((float) screenWidth) * 1.2533333f);
            } else {
                iArr[1] = (int) (((float) screenWidth) * f2);
            }
            int i3 = iArr[0];
            int i4 = iArr[1];
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3), Integer.valueOf(i4)}, this, aa, false, 62536, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3), Integer.valueOf(i4)}, this, aa, false, 62536, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else {
                Aweme aweme = this.j;
                Intrinsics.checkExpressionValueIsNotNull(aweme, "mAweme");
                Video video = aweme.getVideo();
                Intrinsics.checkExpressionValueIsNotNull(video, "mAweme.video");
                int width = video.getWidth();
                Aweme aweme2 = this.j;
                Intrinsics.checkExpressionValueIsNotNull(aweme2, "mAweme");
                Video video2 = aweme2.getVideo();
                Intrinsics.checkExpressionValueIsNotNull(video2, "mAweme.video");
                if (((float) video2.getHeight()) / ((float) width) > 1.5933334f) {
                    int i5 = (int) (((float) i4) / 1.5933334f);
                    FrameLayout frameLayout = this.mVideoLayout;
                    if (frameLayout == null) {
                        Intrinsics.throwNpe();
                    }
                    Context X = X();
                    Intrinsics.checkExpressionValueIsNotNull(X, "context");
                    frameLayout.setBackgroundColor(X.getResources().getColor(C0906R.color.a25));
                    KeepSurfaceTextureView keepSurfaceTextureView = this.mVideoView;
                    if (keepSurfaceTextureView == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(keepSurfaceTextureView, "mVideoView!!");
                    keepSurfaceTextureView.getLayoutParams().width = i5;
                    KeepSurfaceTextureView keepSurfaceTextureView2 = this.mVideoView;
                    if (keepSurfaceTextureView2 == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(keepSurfaceTextureView2, "mVideoView!!");
                    keepSurfaceTextureView2.getLayoutParams().height = i4;
                    RemoteImageView remoteImageView = this.mCoverView;
                    if (remoteImageView == null) {
                        Intrinsics.throwNpe();
                    }
                    remoteImageView.getLayoutParams().width = i5;
                    RemoteImageView remoteImageView2 = this.mCoverView;
                    if (remoteImageView2 == null) {
                        Intrinsics.throwNpe();
                    }
                    remoteImageView2.getLayoutParams().height = i4;
                } else {
                    KeepSurfaceTextureView keepSurfaceTextureView3 = this.mVideoView;
                    if (keepSurfaceTextureView3 == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(keepSurfaceTextureView3, "mVideoView!!");
                    keepSurfaceTextureView3.getLayoutParams().width = i3;
                    KeepSurfaceTextureView keepSurfaceTextureView4 = this.mVideoView;
                    if (keepSurfaceTextureView4 == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(keepSurfaceTextureView4, "mVideoView!!");
                    keepSurfaceTextureView4.getLayoutParams().height = i4;
                    RemoteImageView remoteImageView3 = this.mCoverView;
                    if (remoteImageView3 == null) {
                        Intrinsics.throwNpe();
                    }
                    remoteImageView3.getLayoutParams().width = i3;
                    RemoteImageView remoteImageView4 = this.mCoverView;
                    if (remoteImageView4 == null) {
                        Intrinsics.throwNpe();
                    }
                    remoteImageView4.getLayoutParams().height = i4;
                }
            }
            layoutParams2.width = iArr[0];
            layoutParams2.height = iArr[1];
            view2.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsFollowVideoViewHolderPlanC(@NotNull FollowFeedLayout followFeedLayout, @NotNull a aVar, @NotNull l lVar, @NotNull com.ss.android.ugc.aweme.newfollow.b.a aVar2, @NotNull d dVar) {
        super(followFeedLayout, aVar, lVar, aVar2, dVar);
        Intrinsics.checkParameterIsNotNull(followFeedLayout, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        Intrinsics.checkParameterIsNotNull(lVar, "scrollStateManager");
        Intrinsics.checkParameterIsNotNull(aVar2, "diggAwemeListener");
        Intrinsics.checkParameterIsNotNull(dVar, "dialogController");
    }
}
