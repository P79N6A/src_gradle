package com.ss.android.ugc.aweme.friends.friendlist;

import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.ss.android.ugc.aweme.base.arch.JediBaseItemWidgetViewHolder;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.ui.StoryCircleView;
import com.ss.android.ugc.aweme.friends.adapter.c;
import com.ss.android.ugc.aweme.story.api.b.b;
import com.ss.android.ugc.aweme.story.api.h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0011\u0010,\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)¨\u0006."}, d2 = {"Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListItemWidgetViewHolder;", "Lcom/ss/android/ugc/aweme/base/arch/JediBaseItemWidgetViewHolder;", "Lcom/ss/android/ugc/aweme/friends/adapter/FriendList;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "avatar", "Lcom/ss/android/ugc/aweme/base/ui/AvatarImageWithVerify;", "getAvatar", "()Lcom/ss/android/ugc/aweme/base/ui/AvatarImageWithVerify;", "avatar_loading_view", "Lcom/ss/android/ugc/aweme/base/ui/AnimationImageView;", "getAvatar_loading_view", "()Lcom/ss/android/ugc/aweme/base/ui/AnimationImageView;", "content_layout", "Landroid/widget/LinearLayout;", "getContent_layout", "()Landroid/widget/LinearLayout;", "iv_avatar_ring", "Lcom/ss/android/ugc/aweme/feed/ui/StoryCircleView;", "getIv_avatar_ring", "()Lcom/ss/android/ugc/aweme/feed/ui/StoryCircleView;", "iv_pen", "Landroid/widget/ImageView;", "getIv_pen", "()Landroid/widget/ImageView;", "iv_send_msg", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "getIv_send_msg", "()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "mStoryCircleHelper", "Lcom/ss/android/ugc/aweme/story/api/userstory/IStoryCircleHelper;", "getMStoryCircleHelper", "()Lcom/ss/android/ugc/aweme/story/api/userstory/IStoryCircleHelper;", "setMStoryCircleHelper", "(Lcom/ss/android/ugc/aweme/story/api/userstory/IStoryCircleHelper;)V", "mStoryRingService", "Lcom/ss/android/ugc/aweme/story/api/IStoryRingService;", "tv_label", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "getTv_label", "()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "tv_name", "getTv_name", "tv_signature", "getTv_signature", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FriendListItemWidgetViewHolder extends JediBaseItemWidgetViewHolder<c> {
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final AvatarImageWithVerify f48903d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final DmtTextView f48904e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final DmtTextView f48905f;
    @NotNull
    public final DmtTextView g;
    @NotNull
    public final ImageView h;
    @NotNull
    public final RemoteImageView i;
    @NotNull
    public final StoryCircleView j;
    @NotNull
    public final AnimationImageView k;
    @NotNull
    public final LinearLayout l;
    @Nullable
    public b m;
    private h n;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FriendListItemWidgetViewHolder(@org.jetbrains.annotations.NotNull android.view.ViewGroup r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131690285(0x7f0f032d, float:1.900961E38)
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            java.lang.String r0 = "LayoutInflater.from(pare…iend_list, parent, false)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            r3.<init>(r4)
            android.view.View r4 = r3.itemView
            r0 = 2131165500(0x7f07013c, float:1.7945219E38)
            android.view.View r4 = r4.findViewById(r0)
            java.lang.String r0 = "itemView.findViewById(R.id.avatar)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify r4 = (com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify) r4
            r3.f48903d = r4
            android.view.View r4 = r3.itemView
            r0 = 2131170883(0x7f071643, float:1.7956137E38)
            android.view.View r4 = r4.findViewById(r0)
            java.lang.String r0 = "itemView.findViewById(R.id.tv_name)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r4
            r3.f48904e = r4
            android.view.View r4 = r3.itemView
            r0 = 2131170819(0x7f071603, float:1.7956007E38)
            android.view.View r4 = r4.findViewById(r0)
            java.lang.String r0 = "itemView.findViewById(R.id.tv_label)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r4
            r3.f48905f = r4
            android.view.View r4 = r3.itemView
            r0 = 2131171024(0x7f0716d0, float:1.7956423E38)
            android.view.View r4 = r4.findViewById(r0)
            java.lang.String r0 = "itemView.findViewById(R.id.tv_signature)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r4
            r3.g = r4
            android.view.View r4 = r3.itemView
            r0 = 2131167687(0x7f0709c7, float:1.7949655E38)
            android.view.View r4 = r4.findViewById(r0)
            java.lang.String r0 = "itemView.findViewById(R.id.iv_pen)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.h = r4
            android.view.View r4 = r3.itemView
            r0 = 2131167731(0x7f0709f3, float:1.7949744E38)
            android.view.View r4 = r4.findViewById(r0)
            java.lang.String r0 = "itemView.findViewById(R.id.iv_send_msg)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r4 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r4
            r3.i = r4
            android.view.View r4 = r3.itemView
            r0 = 2131167501(0x7f07090d, float:1.7949277E38)
            android.view.View r4 = r4.findViewById(r0)
            java.lang.String r0 = "itemView.findViewById(R.id.iv_avatar_ring)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            com.ss.android.ugc.aweme.feed.ui.StoryCircleView r4 = (com.ss.android.ugc.aweme.feed.ui.StoryCircleView) r4
            r3.j = r4
            android.view.View r4 = r3.itemView
            r0 = 2131165524(0x7f070154, float:1.7945268E38)
            android.view.View r4 = r4.findViewById(r0)
            java.lang.String r0 = "itemView.findViewById(R.id.avatar_loading_view)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r4 = (com.ss.android.ugc.aweme.base.ui.AnimationImageView) r4
            r3.k = r4
            android.view.View r4 = r3.itemView
            r0 = 2131166143(0x7f0703bf, float:1.7946523E38)
            android.view.View r4 = r4.findViewById(r0)
            java.lang.String r0 = "itemView.findViewById(R.id.content_layout)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r3.l = r4
            boolean r4 = com.ss.android.g.a.a()
            if (r4 != 0) goto L_0x00e9
            com.ss.android.ugc.aweme.framework.services.ServiceManager r4 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.story.api.h> r0 = com.ss.android.ugc.aweme.story.api.h.class
            java.lang.Object r4 = r4.getService(r0)
            com.ss.android.ugc.aweme.story.api.h r4 = (com.ss.android.ugc.aweme.story.api.h) r4
            r3.n = r4
            com.ss.android.ugc.aweme.story.api.h r4 = r3.n
            if (r4 == 0) goto L_0x00e6
            com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify r0 = r3.f48903d
            android.view.View r0 = (android.view.View) r0
            com.ss.android.ugc.aweme.feed.ui.StoryCircleView r1 = r3.j
            android.view.View r1 = (android.view.View) r1
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r2 = r3.k
            com.ss.android.ugc.aweme.story.api.b.b r4 = r4.a(r0, r1, r2)
            goto L_0x00e7
        L_0x00e6:
            r4 = 0
        L_0x00e7:
            r3.m = r4
        L_0x00e9:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r4 = r3.i
            android.view.View r4 = (android.view.View) r4
            com.bytedance.ies.dmt.ui.e.b.a(r4)
            android.widget.ImageView r4 = r3.h
            android.view.View r4 = (android.view.View) r4
            com.bytedance.ies.dmt.ui.e.b.a(r4)
            com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify r4 = r3.f48903d
            com.ss.android.ugc.aweme.friends.ui.a r0 = new com.ss.android.ugc.aweme.friends.ui.a
            r0.<init>()
            android.view.View$AccessibilityDelegate r0 = (android.view.View.AccessibilityDelegate) r0
            r4.setAccessibilityDelegate(r0)
            android.view.View r4 = r3.itemView
            com.ss.android.ugc.aweme.friends.ui.a r0 = new com.ss.android.ugc.aweme.friends.ui.a
            r0.<init>()
            android.view.View$AccessibilityDelegate r0 = (android.view.View.AccessibilityDelegate) r0
            r4.setAccessibilityDelegate(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.friendlist.FriendListItemWidgetViewHolder.<init>(android.view.ViewGroup):void");
    }
}
