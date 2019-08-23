package com.ss.android.ugc.aweme.discover.alading;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.alading.ScrollToOpenLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/alading/SearchAbsAladingCard;", "ITEM", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Lcom/ss/android/ugc/aweme/discover/alading/ScrollToOpenLayout$OnScrollToEndListener;", "itemView", "Landroid/view/View;", "list", "", "(Landroid/view/View;Ljava/util/List;)V", "cardListView", "Landroid/support/v7/widget/RecyclerView;", "getCardListView", "()Landroid/support/v7/widget/RecyclerView;", "setCardListView", "(Landroid/support/v7/widget/RecyclerView;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class SearchAbsAladingCard<ITEM> extends RecyclerView.ViewHolder implements ScrollToOpenLayout.b {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f3030a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchAbsAladingCard(@NotNull View view, @NotNull List<? extends ITEM> list) {
        super(view);
        int i;
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(list, "list");
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C0906R.id.qp);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "itemView.card_list");
        this.f3030a = recyclerView;
        boolean z = false;
        this.f3030a.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        ((ScrollToOpenLayout) view.findViewById(C0906R.id.ck_)).setOnScrollToEndListener(this);
        if (list.size() < 10) {
            ((ScrollToOpenLayout) view.findViewById(C0906R.id.ck_)).setOnScrollToEndListener(null);
        }
        ((ScrollToOpenLayout) view.findViewById(C0906R.id.ck_)).setEnable(list.size() >= 5 ? true : z);
        TextView textView = (TextView) view.findViewById(C0906R.id.d0b);
        if (list.size() >= 10) {
            i = C0906R.string.a1x;
        } else {
            i = C0906R.string.bho;
        }
        textView.setText(i);
    }
}
