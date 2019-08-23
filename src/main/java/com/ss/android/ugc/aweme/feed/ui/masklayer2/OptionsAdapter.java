package com.ss.android.ugc.aweme.feed.ui.masklayer2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.DislikeOptionVH;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.NormalOptionVH;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tH\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/OptionsAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "items", "", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/Item;", "(Ljava/util/List;)V", "mItems", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "viewHolder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class OptionsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46748a;

    /* renamed from: b  reason: collision with root package name */
    private final List<l> f46749b;

    public final int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f46748a, false, 43477, new Class[0], Integer.TYPE)) {
            return this.f46749b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f46748a, false, 43477, new Class[0], Integer.TYPE)).intValue();
    }

    public OptionsAdapter(@NotNull List<? extends l> list) {
        Intrinsics.checkParameterIsNotNull(list, "items");
        this.f46749b = list;
    }

    public final int getItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f46748a, false, 43478, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f46748a, false, 43478, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.f46749b.get(i) instanceof m) {
            return 0;
        } else {
            if (this.f46749b.get(i) instanceof b) {
                return 1;
            }
            return -1;
        }
    }

    public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f46748a, false, 43475, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f46748a, false, 43475, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "viewHolder");
        l lVar = this.f46749b.get(i);
        if (lVar instanceof m) {
            NormalOptionVH normalOptionVH = (NormalOptionVH) viewHolder2;
            m mVar = (m) lVar;
            if (PatchProxy.isSupport(new Object[]{mVar}, normalOptionVH, NormalOptionVH.f46738a, false, 43463, new Class[]{m.class}, Void.TYPE)) {
                NormalOptionVH normalOptionVH2 = normalOptionVH;
                PatchProxy.accessDispatch(new Object[]{mVar}, normalOptionVH2, NormalOptionVH.f46738a, false, 43463, new Class[]{m.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(mVar, "item");
                normalOptionVH.f46741c = mVar.f46782b;
                normalOptionVH.f46740b.a(mVar.f46781a);
            }
        } else if (lVar instanceof b) {
            DislikeOptionVH dislikeOptionVH = (DislikeOptionVH) viewHolder2;
            b bVar = (b) lVar;
            if (PatchProxy.isSupport(new Object[]{bVar}, dislikeOptionVH, DislikeOptionVH.f46706a, false, 43423, new Class[]{b.class}, Void.TYPE)) {
                DislikeOptionVH dislikeOptionVH2 = dislikeOptionVH;
                PatchProxy.accessDispatch(new Object[]{bVar}, dislikeOptionVH2, DislikeOptionVH.f46706a, false, 43423, new Class[]{b.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(bVar, "item");
            dislikeOptionVH.f46707b.a(bVar.f46757a);
            dislikeOptionVH.itemView.setOnClickListener(new DislikeOptionVH.k(dislikeOptionVH, bVar));
        }
    }

    @NotNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        DislikeOptionVH dislikeOptionVH;
        NormalOptionVH normalOptionVH;
        ViewGroup viewGroup2 = viewGroup;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f46748a, false, 43476, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f46748a, false, 43476, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        if (i2 == 0) {
            NormalOptionVH.a aVar = NormalOptionVH.f46739d;
            if (PatchProxy.isSupport(new Object[]{viewGroup2}, aVar, NormalOptionVH.a.f46744a, false, 43465, new Class[]{ViewGroup.class}, NormalOptionVH.class)) {
                NormalOptionVH.a aVar2 = aVar;
                normalOptionVH = (NormalOptionVH) PatchProxy.accessDispatch(new Object[]{viewGroup2}, aVar2, NormalOptionVH.a.f46744a, false, 43465, new Class[]{ViewGroup.class}, NormalOptionVH.class);
            } else {
                Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.wi, viewGroup2, false);
                Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…lse\n                    )");
                normalOptionVH = new NormalOptionVH(inflate);
            }
            return normalOptionVH;
        } else if (i2 == 1) {
            DislikeOptionVH.a aVar3 = DislikeOptionVH.i;
            if (PatchProxy.isSupport(new Object[]{viewGroup2}, aVar3, DislikeOptionVH.a.f46712a, false, 43426, new Class[]{ViewGroup.class}, DislikeOptionVH.class)) {
                DislikeOptionVH.a aVar4 = aVar3;
                dislikeOptionVH = (DislikeOptionVH) PatchProxy.accessDispatch(new Object[]{viewGroup2}, aVar4, DislikeOptionVH.a.f46712a, false, 43426, new Class[]{ViewGroup.class}, DislikeOptionVH.class);
            } else {
                Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.wg, viewGroup2, false);
                Intrinsics.checkExpressionValueIsNotNull(inflate2, "LayoutInflater.from(pare…n_dislike, parent, false)");
                dislikeOptionVH = new DislikeOptionVH(inflate2);
            }
            return dislikeOptionVH;
        } else {
            throw new RuntimeException("unknown view type !");
        }
    }
}
