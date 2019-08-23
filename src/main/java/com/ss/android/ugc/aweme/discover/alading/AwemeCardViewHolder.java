package com.ss.android.ugc.aweme.discover.alading;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.feed.widget.LinearGradientDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/alading/AwemeCardViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "card", "getCard", "()Landroid/view/View;", "setCard", "coverView", "Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;", "getCoverView", "()Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;", "setCoverView", "(Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;)V", "description", "Landroid/widget/TextView;", "getDescription", "()Landroid/widget/TextView;", "setDescription", "(Landroid/widget/TextView;)V", "likecount", "getLikecount", "setLikecount", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AwemeCardViewHolder extends RecyclerView.ViewHolder {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public View f42016a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public AnimatedImageView f42017b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public TextView f42018c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public TextView f42019d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AwemeCardViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        this.f42016a = view;
        LinearGradientDraweeView linearGradientDraweeView = (LinearGradientDraweeView) view.findViewById(C0906R.id.a1a);
        Intrinsics.checkExpressionValueIsNotNull(linearGradientDraweeView, "itemView.cover");
        this.f42017b = linearGradientDraweeView;
        DmtTextView dmtTextView = (DmtTextView) view.findViewById(C0906R.id.a3m);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "itemView.desc");
        this.f42018c = dmtTextView;
        DmtTextView dmtTextView2 = (DmtTextView) view.findViewById(C0906R.id.bbd);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "itemView.like_count");
        this.f42019d = dmtTextView2;
    }
}
