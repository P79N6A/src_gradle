package com.ss.android.ugc.aweme.discover.base;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.adapter.a;
import com.ss.android.ugc.aweme.common.adapter.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u001e\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00002\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u000eJ&\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u000eJ\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u001a\u0010\u0014\u001a\u00020\u00102\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u000eJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0006H\u0016J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0003H\u0016J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003H\u0016J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003H\u0016J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003H\u0016J\u001c\u0010\"\u001a\u00020\u00162\u0014\u0010#\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0018\u00010\u000eJ\u0016\u0010$\u001a\u00020\u00162\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/base/MultiTypeAdapter;", "T", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "()V", "items", "", "getItems", "()Ljava/util/List;", "mDelegateManager", "Lcom/ss/android/ugc/aweme/common/adapter/AdapterDelegatesManager;", "", "addDelegate", "delegate", "Lcom/ss/android/ugc/aweme/common/adapter/AdapterDelegate;", "viewType", "", "getItemCount", "getItemViewType", "position", "getViewTypeForDelegate", "onBindViewHolder", "", "holder", "payloads", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "onFailedToRecycleView", "", "onViewAttachedToWindow", "onViewDetachedFromWindow", "onViewRecycled", "setFallbackDelegate", "fallbackDelegate", "setItems", "list", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class MultiTypeAdapter<T> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static ChangeQuickRedirect l;
    protected final b<List<T>> m = new b<>();
    @NotNull
    public final List<T> n = new ArrayList();

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, l, false, 36148, new Class[0], Integer.TYPE)) {
            return this.n.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, l, false, 36148, new Class[0], Integer.TYPE)).intValue();
    }

    @NotNull
    public final MultiTypeAdapter<?> a(@NotNull a<List<T>> aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, l, false, 36137, new Class[]{a.class}, MultiTypeAdapter.class)) {
            return (MultiTypeAdapter) PatchProxy.accessDispatch(new Object[]{aVar}, this, l, false, 36137, new Class[]{a.class}, MultiTypeAdapter.class);
        }
        Intrinsics.checkParameterIsNotNull(aVar, "delegate");
        this.m.a(aVar);
        return this;
    }

    public int getItemViewType(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, l, false, 36141, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return this.m.a(this.n, i);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, l, false, 36141, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public boolean onFailedToRecycleView(@NotNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, l, false, 36145, new Class[]{RecyclerView.ViewHolder.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, l, false, 36145, new Class[]{RecyclerView.ViewHolder.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        return this.m.b(viewHolder2);
    }

    public void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, l, false, 36146, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, l, false, 36146, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        this.m.c(viewHolder2);
    }

    public void onViewDetachedFromWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, l, false, 36147, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, l, false, 36147, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        this.m.d(viewHolder2);
    }

    public void onViewRecycled(@NotNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, l, false, 36144, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, l, false, 36144, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        this.m.a(viewHolder2);
    }

    @NotNull
    public final MultiTypeAdapter<?> a(int i, @NotNull a<List<T>> aVar) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), aVar}, this, l, false, 36138, new Class[]{Integer.TYPE, a.class}, MultiTypeAdapter.class)) {
            return (MultiTypeAdapter) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), aVar}, this, l, false, 36138, new Class[]{Integer.TYPE, a.class}, MultiTypeAdapter.class);
        }
        Intrinsics.checkParameterIsNotNull(aVar, "delegate");
        this.m.a(i, false, aVar);
        return this;
    }

    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, l, false, 36142, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, l, false, 36142, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        this.m.a(this.n, i, viewHolder);
    }

    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, l, false, 36140, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, l, false, 36140, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        RecyclerView.ViewHolder a2 = this.m.a(viewGroup2, i);
        Intrinsics.checkExpressionValueIsNotNull(a2, "mDelegateManager.onCreat…wHolder(parent, viewType)");
        return a2;
    }

    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i, @NotNull List<Object> list) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        List<Object> list2 = list;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i), list2}, this, l, false, 36143, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i), list2}, this, l, false, 36143, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        Intrinsics.checkParameterIsNotNull(list2, "payloads");
        this.m.a(this.n, i, viewHolder, list2);
    }
}
