package com.ss.android.ugc.aweme.commerce.portfolio;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commerce.portfolio.holders.PortfolioClassifyColumnHolder;
import com.ss.android.ugc.aweme.commerce.service.models.al;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/portfolio/PortfolioClassifyColumnAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/ss/android/ugc/aweme/commerce/portfolio/holders/PortfolioClassifyColumnHolder;", "categories", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/UserShopCategory;", "onItemClick", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PortfolioClassifyColumnAdapter extends RecyclerView.Adapter<PortfolioClassifyColumnHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37024a;

    /* renamed from: b  reason: collision with root package name */
    private final List<al> f37025b;

    /* renamed from: c  reason: collision with root package name */
    private final Function1<al, Unit> f37026c;

    public final int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f37024a, false, 28420, new Class[0], Integer.TYPE)) {
            return this.f37025b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f37024a, false, 28420, new Class[0], Integer.TYPE)).intValue();
    }

    public PortfolioClassifyColumnAdapter(@NotNull List<al> list, @NotNull Function1<? super al, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(list, "categories");
        Intrinsics.checkParameterIsNotNull(function1, "onItemClick");
        this.f37025b = list;
        this.f37026c = function1;
    }

    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        PortfolioClassifyColumnHolder portfolioClassifyColumnHolder;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f37024a, false, 28419, new Class[]{ViewGroup.class, Integer.TYPE}, PortfolioClassifyColumnHolder.class)) {
            portfolioClassifyColumnHolder = (PortfolioClassifyColumnHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f37024a, false, 28419, new Class[]{ViewGroup.class, Integer.TYPE}, PortfolioClassifyColumnHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
            portfolioClassifyColumnHolder = new PortfolioClassifyColumnHolder(viewGroup2);
        }
        return portfolioClassifyColumnHolder;
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String name;
        PortfolioClassifyColumnHolder portfolioClassifyColumnHolder = (PortfolioClassifyColumnHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{portfolioClassifyColumnHolder, Integer.valueOf(i)}, this, f37024a, false, 28421, new Class[]{PortfolioClassifyColumnHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{portfolioClassifyColumnHolder, Integer.valueOf(i)}, this, f37024a, false, 28421, new Class[]{PortfolioClassifyColumnHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(portfolioClassifyColumnHolder, "holder");
        al alVar = this.f37025b.get(i);
        Function1<al, Unit> function1 = this.f37026c;
        if (PatchProxy.isSupport(new Object[]{alVar, function1}, portfolioClassifyColumnHolder, PortfolioClassifyColumnHolder.f37060a, false, 28457, new Class[]{al.class, Function1.class}, Void.TYPE)) {
            PortfolioClassifyColumnHolder portfolioClassifyColumnHolder2 = portfolioClassifyColumnHolder;
            PatchProxy.accessDispatch(new Object[]{alVar, function1}, portfolioClassifyColumnHolder2, PortfolioClassifyColumnHolder.f37060a, false, 28457, new Class[]{al.class, Function1.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(alVar, "category");
        Intrinsics.checkParameterIsNotNull(function1, "onItemClick");
        View view = portfolioClassifyColumnHolder.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        DmtTextView dmtTextView = (DmtTextView) view.findViewById(C0906R.id.d9z);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "itemView.tv_category");
        if (TextUtils.isEmpty(alVar.getName())) {
            name = "";
        } else {
            name = alVar.getName();
        }
        dmtTextView.setText(name);
        portfolioClassifyColumnHolder.itemView.setOnClickListener(new PortfolioClassifyColumnHolder.a(function1, alVar));
    }
}
