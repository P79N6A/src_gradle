package com.ss.android.ugc.aweme.friends.recommendlist.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.notification.d.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/adapter/AddFriendViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "title", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "getTitle", "()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "unreadDot", "getUnreadDot", "()Landroid/view/View;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AddFriendViewHolder extends RecyclerView.ViewHolder {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f48969a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final View f48970b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final DmtTextView f48971c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddFriendViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        View findViewById = view.findViewById(C0906R.id.aq8);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.icon)");
        this.f48969a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C0906R.id.do5);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.unread_dot)");
        this.f48970b = findViewById2;
        View findViewById3 = view.findViewById(C0906R.id.title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.title)");
        this.f48971c = (DmtTextView) findViewById3;
        c.b(this.f48969a);
    }
}
