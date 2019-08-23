package com.ss.android.ugc.aweme.commerce.portfolio;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commerce.portfolio.holders.PortfolioSortHolder;
import com.ss.android.ugc.aweme.commerce.portfolio.holders.PortfolioSortSearchHolder;
import com.ss.android.ugc.aweme.commerce.service.l.g;
import com.ss.android.ugc.aweme.commerce.service.models.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B=\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/portfolio/PortfolioSortAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "mColumn", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/ShopColumn;", "mCb", "Lkotlin/Function1;", "", "mOnSearchClick", "Lkotlin/Function0;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "getItem", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PortfolioSortAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37035a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f37036c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final List<t> f37037b;

    /* renamed from: d  reason: collision with root package name */
    private final Function1<t, Unit> f37038d;

    /* renamed from: e  reason: collision with root package name */
    private final Function0<Unit> f37039e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/portfolio/PortfolioSortAdapter$Companion;", "", "()V", "TYPE_NORMAL", "", "TYPE_SEARCH", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f37035a, false, 28451, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f37035a, false, 28451, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f37039e == null) {
            return this.f37037b.size();
        } else {
            return this.f37037b.size() + 1;
        }
    }

    public final int getItemViewType(int i) {
        if (this.f37039e == null || i != 0) {
            return 1;
        }
        return 0;
    }

    @NotNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f37035a, false, 28449, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f37035a, false, 28449, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        if (i == 0) {
            return new PortfolioSortSearchHolder(viewGroup2);
        }
        return new PortfolioSortHolder(viewGroup2);
    }

    public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        t tVar;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f37035a, false, 28450, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f37035a, false, 28450, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        if (getItemViewType(i2) == 0) {
            if (viewHolder2 instanceof PortfolioSortSearchHolder) {
                PortfolioSortSearchHolder portfolioSortSearchHolder = (PortfolioSortSearchHolder) viewHolder2;
                Function0<Unit> function0 = this.f37039e;
                if (PatchProxy.isSupport(new Object[]{function0}, portfolioSortSearchHolder, PortfolioSortSearchHolder.f37083a, false, 28468, new Class[]{Function0.class}, Void.TYPE)) {
                    PortfolioSortSearchHolder portfolioSortSearchHolder2 = portfolioSortSearchHolder;
                    PatchProxy.accessDispatch(new Object[]{function0}, portfolioSortSearchHolder2, PortfolioSortSearchHolder.f37083a, false, 28468, new Class[]{Function0.class}, Void.TYPE);
                } else {
                    portfolioSortSearchHolder.itemView.setOnClickListener(new PortfolioSortSearchHolder.a(function0));
                }
            }
        } else if (viewHolder2 instanceof PortfolioSortHolder) {
            if (this.f37039e == null) {
                tVar = this.f37037b.get(i2);
            } else {
                tVar = this.f37037b.get(i2 - 1);
            }
            PortfolioSortHolder portfolioSortHolder = (PortfolioSortHolder) viewHolder2;
            Function1<t, Unit> function1 = this.f37038d;
            if (PatchProxy.isSupport(new Object[]{tVar, function1}, portfolioSortHolder, PortfolioSortHolder.f37079a, false, 28466, new Class[]{t.class, Function1.class}, Void.TYPE)) {
                PortfolioSortHolder portfolioSortHolder2 = portfolioSortHolder;
                PatchProxy.accessDispatch(new Object[]{tVar, function1}, portfolioSortHolder2, PortfolioSortHolder.f37079a, false, 28466, new Class[]{t.class, Function1.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(tVar, "column");
            View view = portfolioSortHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            DmtTextView dmtTextView = (DmtTextView) view.findViewById(C0906R.id.djb);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "itemView.tv_sort");
            dmtTextView.setText(tVar.getName());
            if (tVar.getCanReverse()) {
                View view2 = portfolioSortHolder.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                ImageView imageView = (ImageView) view2.findViewById(C0906R.id.b59);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "itemView.iv_sort");
                imageView.setVisibility(0);
                if (!tVar.getSelected()) {
                    View view3 = portfolioSortHolder.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
                    ((ImageView) view3.findViewById(C0906R.id.b59)).setImageResource(2130838477);
                } else if (tVar.getSort() == 0) {
                    View view4 = portfolioSortHolder.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
                    ((ImageView) view4.findViewById(C0906R.id.b59)).setImageResource(2130838475);
                } else {
                    View view5 = portfolioSortHolder.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
                    ((ImageView) view5.findViewById(C0906R.id.b59)).setImageResource(2130838474);
                }
            } else {
                View view6 = portfolioSortHolder.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
                ImageView imageView2 = (ImageView) view6.findViewById(C0906R.id.b59);
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "itemView.iv_sort");
                imageView2.setVisibility(8);
            }
            if (tVar.getSelected()) {
                View view7 = portfolioSortHolder.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
                g.a aVar = g.f38016b;
                View view8 = portfolioSortHolder.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
                Context context = view8.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
                ((DmtTextView) view7.findViewById(C0906R.id.djb)).setTextColor(aVar.a(context, C0906R.color.a17));
            } else {
                View view9 = portfolioSortHolder.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view9, "itemView");
                g.a aVar2 = g.f38016b;
                View view10 = portfolioSortHolder.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view10, "itemView");
                Context context2 = view10.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "itemView.context");
                ((DmtTextView) view9.findViewById(C0906R.id.djb)).setTextColor(aVar2.a(context2, C0906R.color.a1m));
            }
            portfolioSortHolder.itemView.setOnClickListener(new PortfolioSortHolder.a(function1, tVar));
        }
    }

    public PortfolioSortAdapter(@NotNull List<t> list, @Nullable Function1<? super t, Unit> function1, @Nullable Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(list, "mColumn");
        this.f37037b = list;
        this.f37038d = function1;
        this.f37039e = function0;
    }

    public /* synthetic */ PortfolioSortAdapter(List list, Function1 function1, Function0 function0, int i) {
        this(list, function1, null);
    }
}
