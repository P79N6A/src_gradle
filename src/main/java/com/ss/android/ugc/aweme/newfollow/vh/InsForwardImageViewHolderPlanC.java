package com.ss.android.ugc.aweme.newfollow.vh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.ss.android.ugc.aweme.forward.a.a;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J \u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\"\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0010H\u0014¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/vh/InsForwardImageViewHolderPlanC;", "Lcom/ss/android/ugc/aweme/newfollow/vh/InsForwardImageViewHolder;", "itemView", "Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;", "provider", "Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;", "scrollStateManager", "Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;", "itemViewInteractListener", "Lcom/ss/android/ugc/aweme/newfollow/vh/BaseFollowViewHolder$ItemViewInteractListener;", "diggAwemeListener", "Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;", "(Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;Lcom/ss/android/ugc/aweme/newfollow/vh/BaseFollowViewHolder$ItemViewInteractListener;Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;)V", "adjustVideoViewRegion", "", "layoutWidth", "", "layoutHeight", "calNewMediaItemSize", "screenWidth", "ratioHW", "", "dstSize", "", "updateOriginContentLayoutParams", "view", "Landroid/view/View;", "mediaWidth", "mediaHeight", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class InsForwardImageViewHolderPlanC extends InsForwardImageViewHolder {
    public static ChangeQuickRedirect x;

    public final void a(@Nullable View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, x, false, 62561, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, x, false, 62561, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
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
            int screenWidth = UIUtils.getScreenWidth(c());
            float f2 = ((float) i2) / ((float) i);
            iArr[0] = screenWidth;
            if (f2 > 1.2533333f) {
                iArr[1] = (int) (((float) screenWidth) * 1.2533333f);
            } else {
                iArr[1] = (int) (((float) screenWidth) * f2);
            }
            int i3 = iArr[0];
            int i4 = iArr[1];
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3), Integer.valueOf(i4)}, this, x, false, 62562, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3), Integer.valueOf(i4)}, this, x, false, 62562, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else {
                Aweme aweme = this.f48319d;
                Intrinsics.checkExpressionValueIsNotNull(aweme, "mAweme");
                Aweme forwardItem = aweme.getForwardItem();
                Intrinsics.checkExpressionValueIsNotNull(forwardItem, "mAweme.forwardItem");
                ImageInfo imageInfo = forwardItem.getImageInfos().get(0);
                Intrinsics.checkExpressionValueIsNotNull(imageInfo, "mAweme.forwardItem.imageInfos[0]");
                int width = imageInfo.getWidth();
                Aweme aweme2 = this.f48319d;
                Intrinsics.checkExpressionValueIsNotNull(aweme2, "mAweme");
                Aweme forwardItem2 = aweme2.getForwardItem();
                Intrinsics.checkExpressionValueIsNotNull(forwardItem2, "mAweme.forwardItem");
                ImageInfo imageInfo2 = forwardItem2.getImageInfos().get(0);
                Intrinsics.checkExpressionValueIsNotNull(imageInfo2, "mAweme.forwardItem.imageInfos[0]");
                if (((float) imageInfo2.getHeight()) / ((float) width) > 1.5933334f) {
                    int i5 = (int) (((float) i4) / 1.5933334f);
                    ViewGroup viewGroup = this.mImageLayout;
                    if (viewGroup == null) {
                        Intrinsics.throwNpe();
                    }
                    Context c2 = c();
                    Intrinsics.checkExpressionValueIsNotNull(c2, "context");
                    viewGroup.setBackgroundColor(c2.getResources().getColor(C0906R.color.a25));
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
    public InsForwardImageViewHolderPlanC(@NotNull FollowFeedLayout followFeedLayout, @NotNull a aVar, @NotNull l lVar, @NotNull BaseFollowViewHolder.a aVar2, @NotNull com.ss.android.ugc.aweme.newfollow.b.a aVar3) {
        super(followFeedLayout, aVar, lVar, aVar2, aVar3);
        Intrinsics.checkParameterIsNotNull(followFeedLayout, "itemView");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        Intrinsics.checkParameterIsNotNull(lVar, "scrollStateManager");
        Intrinsics.checkParameterIsNotNull(aVar2, "itemViewInteractListener");
        Intrinsics.checkParameterIsNotNull(aVar3, "diggAwemeListener");
    }
}
