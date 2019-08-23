package com.ss.android.ugc.aweme.friends.recommendlist.widget;

import android.view.View;
import android.widget.TextView;
import com.bytedance.widget.ext.list.ItemWidgetViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/widget/RecommendFriendsTitleWidgetHolder;", "Lcom/bytedance/widget/ext/list/ItemWidgetViewHolder;", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/Title;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "btnGoAllFollower", "Landroid/widget/TextView;", "getBtnGoAllFollower", "()Landroid/widget/TextView;", "txtRedDotCount", "getTxtRedDotCount", "txtTitle", "getTxtTitle", "viewNewFriendRecommendMask", "Landroid/view/View;", "getViewNewFriendRecommendMask", "()Landroid/view/View;", "viewPrivacyReminder", "getViewPrivacyReminder", "viewRedDot", "getViewRedDot", "viewYellowDot", "getViewYellowDot", "hideRecommendDot", "", "hideRedDot", "showRedDot", "newFriendRecommendCount", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RecommendFriendsTitleWidgetHolder extends ItemWidgetViewHolder<h> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f49074d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final View f49075e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final View f49076f;
    @NotNull
    public final TextView g;
    @NotNull
    public final View h;
    @NotNull
    public final TextView i;
    @NotNull
    public final TextView j;
    @NotNull
    public final View k;

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f49074d, false, 46917, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49074d, false, 46917, new Class[0], Void.TYPE);
            return;
        }
        this.i.setVisibility(8);
        this.h.setVisibility(8);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RecommendFriendsTitleWidgetHolder(@org.jetbrains.annotations.NotNull android.view.ViewGroup r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131690287(0x7f0f032f, float:1.9009613E38)
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            java.lang.String r0 = "LayoutInflater.from(pare…ist_title, parent, false)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            r3.<init>(r4)
            android.view.View r4 = r3.itemView
            r0 = 2131168556(0x7f070d2c, float:1.7951417E38)
            android.view.View r4 = r4.findViewById(r0)
            java.lang.String r0 = "itemView.findViewById(R.…ew_friend_recommend_mask)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            r3.f49075e = r4
            android.view.View r4 = r3.itemView
            r0 = 2131168558(0x7f070d2e, float:1.7951421E38)
            android.view.View r4 = r4.findViewById(r0)
            java.lang.String r0 = "itemView.findViewById(R.…end_recommend_yellow_dot)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            r3.f49076f = r4
            android.view.View r4 = r3.itemView
            r0 = 2131171193(0x7f071779, float:1.7956766E38)
            android.view.View r4 = r4.findViewById(r0)
            java.lang.String r0 = "itemView.findViewById(R.id.txt_tips)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.g = r4
            android.view.View r4 = r3.itemView
            r0 = 2131168557(0x7f070d2d, float:1.795142E38)
            android.view.View r4 = r4.findViewById(r0)
            java.lang.String r0 = "itemView.findViewById(R.…friend_recommend_red_dot)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            r3.h = r4
            android.view.View r4 = r3.itemView
            r0 = 2131168555(0x7f070d2b, float:1.7951415E38)
            android.view.View r4 = r4.findViewById(r0)
            java.lang.String r0 = "itemView.findViewById(R.…w_friend_recommend_count)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.i = r4
            android.view.View r4 = r3.itemView
            r0 = 2131165375(0x7f0700bf, float:1.7944965E38)
            android.view.View r4 = r4.findViewById(r0)
            java.lang.String r0 = "itemView.findViewById(R.id.all_follower_btn)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.j = r4
            android.view.View r4 = r3.itemView
            r0 = 2131169147(0x7f070f7b, float:1.7952616E38)
            android.view.View r4 = r4.findViewById(r0)
            java.lang.String r0 = "itemView.findViewById(R.id.privacy_reminder_image)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            r3.k = r4
            android.widget.TextView r4 = r3.j
            com.ss.android.ugc.aweme.friends.recommendlist.widget.RecommendFriendsTitleWidgetHolder$1 r0 = com.ss.android.ugc.aweme.friends.recommendlist.widget.RecommendFriendsTitleWidgetHolder.AnonymousClass1.f49078b
            android.view.View$OnTouchListener r0 = (android.view.View.OnTouchListener) r0
            r4.setOnTouchListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.recommendlist.widget.RecommendFriendsTitleWidgetHolder.<init>(android.view.ViewGroup):void");
    }
}
