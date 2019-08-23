package com.ss.android.ugc.aweme.friends.recommendlist.widget;

import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.widget.ext.list.ItemWidgetViewHolder;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.a;
import com.ss.android.ugc.aweme.friends.ui.ThirdPartyAddFriendView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0019\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0019\u0010\r\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0019\u0010\u000f\u001a\n \b*\u0004\u0018\u00010\u00100\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0013\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0015\u001a\n \b*\u0004\u0018\u00010\u00160\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/widget/RecommendVerticalHeaderViewHolder;", "Lcom/bytedance/widget/ext/list/ItemWidgetViewHolder;", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/Header;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "addFriendLayout", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getAddFriendLayout", "()Landroid/view/View;", "divideLine", "getDivideLine", "faceAddFriendView", "getFaceAddFriendView", "faceToFaceTextView", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "getFaceToFaceTextView", "()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "scanAddFriendView", "getScanAddFriendView", "thirdPartyAddFriendView", "Lcom/ss/android/ugc/aweme/friends/ui/ThirdPartyAddFriendView;", "getThirdPartyAddFriendView", "()Lcom/ss/android/ugc/aweme/friends/ui/ThirdPartyAddFriendView;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RecommendVerticalHeaderViewHolder extends ItemWidgetViewHolder<a> {

    /* renamed from: d  reason: collision with root package name */
    public final View f49107d = this.itemView.findViewById(C0906R.id.b7u);

    /* renamed from: e  reason: collision with root package name */
    public final View f49108e = this.itemView.findViewById(C0906R.id.b_e);

    /* renamed from: f  reason: collision with root package name */
    public final View f49109f = this.itemView.findViewById(C0906R.id.b8l);
    public final View g = this.itemView.findViewById(C0906R.id.dn);
    public final ThirdPartyAddFriendView h = ((ThirdPartyAddFriendView) this.itemView.findViewById(C0906R.id.d2f));
    public final DmtTextView i = ((DmtTextView) this.itemView.findViewById(C0906R.id.abh));

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RecommendVerticalHeaderViewHolder(@org.jetbrains.annotations.NotNull android.view.ViewGroup r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131689906(0x7f0f01b2, float:1.900884E38)
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            java.lang.String r0 = "LayoutInflater.from(pare…iend_view, parent, false)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            r3.<init>(r4)
            android.view.View r4 = r3.itemView
            r0 = 2131167835(0x7f070a5b, float:1.7949955E38)
            android.view.View r4 = r4.findViewById(r0)
            r3.f49107d = r4
            android.view.View r4 = r3.itemView
            r0 = 2131167930(0x7f070aba, float:1.7950147E38)
            android.view.View r4 = r4.findViewById(r0)
            r3.f49108e = r4
            android.view.View r4 = r3.itemView
            r0 = 2131167863(0x7f070a77, float:1.7950012E38)
            android.view.View r4 = r4.findViewById(r0)
            r3.f49109f = r4
            android.view.View r4 = r3.itemView
            r0 = 2131165344(0x7f0700a0, float:1.7944902E38)
            android.view.View r4 = r4.findViewById(r0)
            r3.g = r4
            android.view.View r4 = r3.itemView
            r0 = 2131170372(0x7f071444, float:1.79551E38)
            android.view.View r4 = r4.findViewById(r0)
            com.ss.android.ugc.aweme.friends.ui.ThirdPartyAddFriendView r4 = (com.ss.android.ugc.aweme.friends.ui.ThirdPartyAddFriendView) r4
            r3.h = r4
            android.view.View r4 = r3.itemView
            r0 = 2131166641(0x7f0705b1, float:1.7947533E38)
            android.view.View r4 = r4.findViewById(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r4
            r3.i = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.recommendlist.widget.RecommendVerticalHeaderViewHolder.<init>(android.view.ViewGroup):void");
    }
}
