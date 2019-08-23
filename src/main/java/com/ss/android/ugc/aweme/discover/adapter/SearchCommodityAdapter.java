package com.ss.android.ugc.aweme.discover.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.model.SearchCommodity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0014J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/SearchCommodityAdapter;", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchBaseAdapter;", "Lcom/ss/android/ugc/aweme/discover/model/SearchCommodity;", "mobParam", "Lcom/ss/android/ugc/aweme/discover/adapter/MobParam;", "mKeyword", "", "(Lcom/ss/android/ugc/aweme/discover/adapter/MobParam;Ljava/lang/String;)V", "onBindItemViewHolder", "", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "position", "", "onCreateItemViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewAttachedToWindow", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchCommodityAdapter extends SearchBaseAdapter<SearchCommodity> {
    public static ChangeQuickRedirect i;

    public final void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, i, false, 35785, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, i, false, 35785, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder2 instanceof SearchCommodityViewHolder) {
            ((SearchCommodityViewHolder) viewHolder2).c();
        }
    }

    public SearchCommodityAdapter(@Nullable s sVar, @Nullable String str) {
        super(sVar, str);
    }

    @NotNull
    public final RecyclerView.ViewHolder a(@NotNull ViewGroup viewGroup, int i2) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, i, false, 35783, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, i, false, 35783, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        SearchCommodityViewHolder a2 = SearchCommodityViewHolder.f41794e.a(viewGroup2);
        a2.a(new s(false));
        return a2;
    }

    public final void a(@Nullable RecyclerView.ViewHolder viewHolder, int i2) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, i, false, 35784, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, i, false, 35784, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (viewHolder2 instanceof SearchCommodityViewHolder) {
            Object obj = this.mItems.get(i2);
            Intrinsics.checkExpressionValueIsNotNull(obj, "mItems[position]");
            ((SearchCommodityViewHolder) viewHolder2).a((SearchCommodity) obj);
        }
    }
}
