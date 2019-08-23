package com.ss.android.ugc.aweme.feed.ui.masklayer;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/masklayer/MaskLayerOptionsViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "optionIcon", "Landroid/widget/ImageView;", "getOptionIcon", "()Landroid/widget/ImageView;", "setOptionIcon", "(Landroid/widget/ImageView;)V", "optionName", "Landroid/widget/TextView;", "getOptionName", "()Landroid/widget/TextView;", "setOptionName", "(Landroid/widget/TextView;)V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class MaskLayerOptionsViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: c  reason: collision with root package name */
    public static final a f46690c = new a((byte) 0);
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public ImageView f46691a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public TextView f46692b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/masklayer/MaskLayerOptionsViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer/MaskLayerOptionsViewHolder;", "parent", "Landroid/view/ViewGroup;", "getLayout", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46693a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MaskLayerOptionsViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        View findViewById = view.findViewById(C0906R.id.cou);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.shade_item_icon)");
        this.f46691a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C0906R.id.cov);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.shade_item_name)");
        this.f46692b = (TextView) findViewById2;
    }
}
