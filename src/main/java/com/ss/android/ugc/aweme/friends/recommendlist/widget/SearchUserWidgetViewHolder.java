package com.ss.android.ugc.aweme.friends.recommendlist.widget;

import android.widget.TextView;
import com.ss.android.ugc.aweme.base.arch.JediBaseItemWidgetViewHolder;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerifyAndLive;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.ui.LiveCircleView;
import com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/widget/SearchUserWidgetViewHolder;", "Lcom/ss/android/ugc/aweme/base/arch/JediBaseItemWidgetViewHolder;", "Lcom/ss/android/ugc/aweme/discover/model/SearchUser;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "mBtnFollow", "Lcom/ss/android/ugc/aweme/following/ui/view/FollowUserBtn;", "getMBtnFollow", "()Lcom/ss/android/ugc/aweme/following/ui/view/FollowUserBtn;", "mIvAvator", "Lcom/ss/android/ugc/aweme/base/ui/AvatarImageWithVerifyAndLive;", "getMIvAvator", "()Lcom/ss/android/ugc/aweme/base/ui/AvatarImageWithVerifyAndLive;", "mLiveCircle", "Lcom/ss/android/ugc/aweme/feed/ui/LiveCircleView;", "getMLiveCircle", "()Lcom/ss/android/ugc/aweme/feed/ui/LiveCircleView;", "mTvAwemeId", "Landroid/widget/TextView;", "getMTvAwemeId", "()Landroid/widget/TextView;", "mTvDesc", "getMTvDesc", "mTvFansCnt", "getMTvFansCnt", "mTvUsername", "getMTvUsername", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchUserWidgetViewHolder extends JediBaseItemWidgetViewHolder<SearchUser> {
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final AvatarImageWithVerifyAndLive f49130d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final LiveCircleView f49131e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final FollowUserBtn f49132f;
    @NotNull
    public final TextView g;
    @NotNull
    public final TextView h;
    @NotNull
    public final TextView i;
    @NotNull
    public final TextView j;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SearchUserWidgetViewHolder(@org.jetbrains.annotations.NotNull android.view.ViewGroup r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131690487(0x7f0f03f7, float:1.901002E38)
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            java.lang.String r0 = "LayoutInflater.from(pare…arch_user, parent, false)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            r3.<init>(r4)
            android.view.View r4 = r3.itemView
            r0 = 2131167499(0x7f07090b, float:1.7949273E38)
            android.view.View r4 = r4.findViewById(r0)
            java.lang.String r0 = "itemView.findViewById(R.id.iv_avatar)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerifyAndLive r4 = (com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerifyAndLive) r4
            r3.f49130d = r4
            android.view.View r4 = r3.itemView
            r0 = 2131167415(0x7f0708b7, float:1.7949103E38)
            android.view.View r4 = r4.findViewById(r0)
            java.lang.String r0 = "itemView.findViewById(R.id.item_live_circle)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            com.ss.android.ugc.aweme.feed.ui.LiveCircleView r4 = (com.ss.android.ugc.aweme.feed.ui.LiveCircleView) r4
            r3.f49131e = r4
            android.view.View r4 = r3.itemView
            r0 = 2131165740(0x7f07022c, float:1.7945706E38)
            android.view.View r4 = r4.findViewById(r0)
            java.lang.String r0 = "itemView.findViewById(R.id.btn_follow)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn r4 = (com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn) r4
            r3.f49132f = r4
            android.view.View r4 = r3.itemView
            r0 = 2131171115(0x7f07172b, float:1.7956607E38)
            android.view.View r4 = r4.findViewById(r0)
            java.lang.String r0 = "itemView.findViewById(R.id.tv_username)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.g = r4
            android.view.View r4 = r3.itemView
            r0 = 2131170630(0x7f071546, float:1.7955624E38)
            android.view.View r4 = r4.findViewById(r0)
            java.lang.String r0 = "itemView.findViewById(R.id.tv_aweme_id)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.h = r4
            android.view.View r4 = r3.itemView
            r0 = 2131170751(0x7f0715bf, float:1.795587E38)
            android.view.View r4 = r4.findViewById(r0)
            java.lang.String r0 = "itemView.findViewById(R.id.tv_fans_count)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.i = r4
            android.view.View r4 = r3.itemView
            r0 = 2131170722(0x7f0715a2, float:1.795581E38)
            android.view.View r4 = r4.findViewById(r0)
            java.lang.String r0 = "itemView.findViewById(R.id.tv_desc)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.recommendlist.widget.SearchUserWidgetViewHolder.<init>(android.view.ViewGroup):void");
    }
}
