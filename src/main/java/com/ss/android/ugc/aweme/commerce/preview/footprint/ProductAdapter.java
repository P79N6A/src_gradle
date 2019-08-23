package com.ss.android.ugc.aweme.commerce.preview.footprint;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commerce.service.widgets.PriceView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/footprint/ProductAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/ss/android/ugc/aweme/commerce/preview/footprint/ProductAdapter$ProductViewHolder;", "productList", "", "Lcom/ss/android/ugc/aweme/commerce/preview/footprint/ProductItem;", "itemClickListener", "Lcom/ss/android/ugc/aweme/commerce/preview/footprint/ProductAdapter$ItemClickListener;", "(Ljava/util/List;Lcom/ss/android/ugc/aweme/commerce/preview/footprint/ProductAdapter$ItemClickListener;)V", "mItemClickListener", "mProductList", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewAttachedToWindow", "ItemClickListener", "ProductViewHolder", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37414a;

    /* renamed from: b  reason: collision with root package name */
    private List<e> f37415b;

    /* renamed from: c  reason: collision with root package name */
    private a f37416c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u000bR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/footprint/ProductAdapter$ProductViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "itemClickListener", "Lcom/ss/android/ugc/aweme/commerce/preview/footprint/ProductAdapter$ItemClickListener;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/commerce/preview/footprint/ProductAdapter$ItemClickListener;)V", "mItemClickListener", "mProductItem", "Lcom/ss/android/ugc/aweme/commerce/preview/footprint/ProductItem;", "bind", "", "productItem", "onAttach", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class ProductViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37417a;

        /* renamed from: b  reason: collision with root package name */
        public a f37418b;

        /* renamed from: c  reason: collision with root package name */
        e f37419c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f37420a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ProductViewHolder f37421b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ e f37422c;

            a(ProductViewHolder productViewHolder, e eVar) {
                this.f37421b = productViewHolder;
                this.f37422c = eVar;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f37420a, false, 28957, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f37420a, false, 28957, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                a aVar = this.f37421b.f37418b;
                if (aVar != null) {
                    e eVar = this.f37422c;
                    View view2 = this.f37421b.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                    aVar.a(eVar, view2);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ProductViewHolder(@NotNull View view, @Nullable a aVar) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f37418b = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/footprint/ProductAdapter$ItemClickListener;", "", "click", "", "productItem", "Lcom/ss/android/ugc/aweme/commerce/preview/footprint/ProductItem;", "view", "Landroid/view/View;", "onItemShow", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void a(@NotNull e eVar);

        void a(@NotNull e eVar, @NotNull View view);
    }

    public final int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f37414a, false, 28952, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f37414a, false, 28952, new Class[0], Integer.TYPE)).intValue();
        }
        List<e> list = this.f37415b;
        if (list == null) {
            Intrinsics.throwNpe();
        }
        return list.size();
    }

    public final /* synthetic */ void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        ProductViewHolder productViewHolder = (ProductViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{productViewHolder}, this, f37414a, false, 28954, new Class[]{ProductViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{productViewHolder}, this, f37414a, false, 28954, new Class[]{ProductViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(productViewHolder, "holder");
        super.onViewAttachedToWindow(productViewHolder);
        if (PatchProxy.isSupport(new Object[0], productViewHolder, ProductViewHolder.f37417a, false, 28956, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], productViewHolder, ProductViewHolder.f37417a, false, 28956, new Class[0], Void.TYPE);
            return;
        }
        e eVar = productViewHolder.f37419c;
        if (eVar != null) {
            a aVar = productViewHolder.f37418b;
            if (aVar != null) {
                aVar.a(eVar);
            }
        }
    }

    public ProductAdapter(@NotNull List<e> list, @NotNull a aVar) {
        Intrinsics.checkParameterIsNotNull(list, "productList");
        Intrinsics.checkParameterIsNotNull(aVar, "itemClickListener");
        this.f37415b = list;
        this.f37416c = aVar;
    }

    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ProductViewHolder productViewHolder;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f37414a, false, 28951, new Class[]{ViewGroup.class, Integer.TYPE}, ProductViewHolder.class)) {
            productViewHolder = (ProductViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f37414a, false, 28951, new Class[]{ViewGroup.class, Integer.TYPE}, ProductViewHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.hm, viewGroup2, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
            productViewHolder = new ProductViewHolder(inflate, this.f37416c);
        }
        return productViewHolder;
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ProductViewHolder productViewHolder = (ProductViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{productViewHolder, Integer.valueOf(i)}, this, f37414a, false, 28953, new Class[]{ProductViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{productViewHolder, Integer.valueOf(i)}, this, f37414a, false, 28953, new Class[]{ProductViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(productViewHolder, "holder");
        List<e> list = this.f37415b;
        if (list == null) {
            Intrinsics.throwNpe();
        }
        e eVar = list.get(i);
        if (PatchProxy.isSupport(new Object[]{eVar}, productViewHolder, ProductViewHolder.f37417a, false, 28955, new Class[]{e.class}, Void.TYPE)) {
            ProductViewHolder productViewHolder2 = productViewHolder;
            PatchProxy.accessDispatch(new Object[]{eVar}, productViewHolder2, ProductViewHolder.f37417a, false, 28955, new Class[]{e.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(eVar, "productItem");
        productViewHolder.f37419c = eVar;
        productViewHolder.itemView.setOnClickListener(new ProductViewHolder.a(productViewHolder, eVar));
        View view = productViewHolder.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        DmtTextView dmtTextView = (DmtTextView) view.findViewById(C0906R.id.df7);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "itemView.tv_name");
        dmtTextView.setText(eVar.g);
        View view2 = productViewHolder.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        ((PriceView) view2.findViewById(C0906R.id.c9k)).setPriceText(eVar.h);
        View view3 = productViewHolder.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        c.b((RemoteImageView) view3.findViewById(C0906R.id.b47), eVar.i);
    }
}
