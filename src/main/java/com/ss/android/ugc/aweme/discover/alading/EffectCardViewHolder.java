package com.ss.android.ugc.aweme.discover.alading;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/alading/EffectCardViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "card", "getCard", "()Landroid/view/View;", "setCard", "count", "Landroid/widget/TextView;", "getCount", "()Landroid/widget/TextView;", "setCount", "(Landroid/widget/TextView;)V", "coverView", "Lcom/ss/android/ugc/aweme/notification/view/RemoteRoundImageView;", "getCoverView", "()Lcom/ss/android/ugc/aweme/notification/view/RemoteRoundImageView;", "setCoverView", "(Lcom/ss/android/ugc/aweme/notification/view/RemoteRoundImageView;)V", "title", "getTitle", "setTitle", "bind", "", "item", "Lcom/ss/android/ugc/aweme/feed/model/NewFaceSticker;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class EffectCardViewHolder extends RecyclerView.ViewHolder {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public View f42027a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public RemoteRoundImageView f42028b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public TextView f42029c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public TextView f42030d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EffectCardViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        this.f42027a = view;
        RemoteRoundImageView remoteRoundImageView = (RemoteRoundImageView) view.findViewById(C0906R.id.b0v);
        Intrinsics.checkExpressionValueIsNotNull(remoteRoundImageView, "itemView.iv_effect");
        this.f42028b = remoteRoundImageView;
        TextView textView = (TextView) view.findViewById(C0906R.id.bpn);
        Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.name");
        this.f42029c = textView;
        TextView textView2 = (TextView) view.findViewById(C0906R.id.dor);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.usage_count");
        this.f42030d = textView2;
    }
}
