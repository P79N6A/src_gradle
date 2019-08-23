package com.ss.android.ugc.aweme.discover.base;

import android.support.v4.util.SparseArrayCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000{\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0016\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\u0010\u0004J\u0010\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%J\u0018\u0010\"\u001a\u00020#2\u0006\u0010&\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010%J\u0010\u0010'\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%J\u0018\u0010'\u001a\u00020#2\u0006\u0010&\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010%J\f\u0010(\u001a\b\u0012\u0004\u0012\u00020%0)J\f\u0010*\u001a\b\u0012\u0004\u0012\u00020%0)J\b\u0010+\u001a\u00020\u0006H\u0016J\u0010\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006H\u0016J\u0010\u0010.\u001a\u00020/2\u0006\u0010-\u001a\u00020\u0006H\u0002J\u0010\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u0006H\u0004J\u0010\u00102\u001a\u00020/2\u0006\u0010-\u001a\u00020\u0006H\u0002J\u0010\u00103\u001a\u00020#2\u0006\u00104\u001a\u00020\u0019H\u0016J\u0018\u00105\u001a\u00020#2\u0006\u00106\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u0006H\u0016J&\u00105\u001a\u00020#2\u0006\u00106\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00062\f\u00107\u001a\b\u0012\u0004\u0012\u00020908H\u0016J\u0018\u0010:\u001a\u00020\u00022\u0006\u0010;\u001a\u00020<2\u0006\u00101\u001a\u00020\u0006H\u0016J\u0010\u0010=\u001a\u00020#2\u0006\u00104\u001a\u00020\u0019H\u0016J\u0010\u0010>\u001a\u00020/2\u0006\u00106\u001a\u00020\u0002H\u0016J\u0010\u0010?\u001a\u00020#2\u0006\u00106\u001a\u00020\u0002H\u0016J\u0010\u0010@\u001a\u00020#2\u0006\u00106\u001a\u00020\u0002H\u0016J\u0010\u0010A\u001a\u00020#2\u0006\u00106\u001a\u00020\u0002H\u0016J\u0010\u0010B\u001a\u00020#2\u0006\u0010C\u001a\u00020DH\u0016J\u0006\u0010E\u001a\u00020/J\u0010\u0010E\u001a\u00020/2\b\u0010$\u001a\u0004\u0018\u00010%J\u000e\u0010E\u001a\u00020/2\u0006\u0010&\u001a\u00020\u0006J\u0006\u0010F\u001a\u00020/J\u0010\u0010F\u001a\u00020/2\b\u0010$\u001a\u0004\u0018\u00010%J\u000e\u0010F\u001a\u00020/2\u0006\u0010&\u001a\u00020\u0006J\u0010\u0010G\u001a\u00020#2\u0006\u0010C\u001a\u00020DH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00020\u00068DX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\b¨\u0006H"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/base/HeaderAndFooterWrapper;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "innerAdapter", "(Landroid/support/v7/widget/RecyclerView$Adapter;)V", "footersCount", "", "getFootersCount", "()I", "headersCount", "getHeadersCount", "getInnerAdapter", "()Landroid/support/v7/widget/RecyclerView$Adapter;", "setInnerAdapter", "mFooterViewHolderList", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/discover/base/ViewHolder;", "mFooterViewTypeMap", "Landroid/support/v4/util/SparseArrayCompat;", "mHeaderViewHolderList", "mHeaderViewTypeMap", "mInnerObserver", "com/ss/android/ugc/aweme/discover/base/HeaderAndFooterWrapper$mInnerObserver$1", "Lcom/ss/android/ugc/aweme/discover/base/HeaderAndFooterWrapper$mInnerObserver$1;", "mRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "getMRecyclerView", "()Landroid/support/v7/widget/RecyclerView;", "setMRecyclerView", "(Landroid/support/v7/widget/RecyclerView;)V", "mViewTypeManager", "Lcom/ss/android/ugc/aweme/discover/base/ViewTypeManager;", "realItemCount", "getRealItemCount", "addFootView", "", "view", "Landroid/view/View;", "pos", "addHeaderView", "getFootViews", "", "getHeadViews", "getItemCount", "getItemViewType", "position", "isFooterViewPos", "", "isHeaderOrFooterViewType", "viewType", "isHeaderViewPos", "onAttachedToRecyclerView", "recyclerView", "onBindViewHolder", "holder", "payloads", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "onDetachedFromRecyclerView", "onFailedToRecycleView", "onViewAttachedToWindow", "onViewDetachedFromWindow", "onViewRecycled", "registerAdapterDataObserver", "observer", "Landroid/support/v7/widget/RecyclerView$AdapterDataObserver;", "removeFooterView", "removeHeaderView", "unregisterAdapterDataObserver", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class HeaderAndFooterWrapper extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42110a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<ViewHolder> f42111b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    final SparseArrayCompat<ViewHolder> f42112c = new SparseArrayCompat<>();

    /* renamed from: d  reason: collision with root package name */
    final i f42113d = new i();
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public RecyclerView f42114e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public RecyclerView.Adapter<RecyclerView.ViewHolder> f42115f;
    private final ArrayList<ViewHolder> g = new ArrayList<>();
    private final SparseArrayCompat<ViewHolder> h = new SparseArrayCompat<>();
    private final HeaderAndFooterWrapper$mInnerObserver$1 i = new HeaderAndFooterWrapper$mInnerObserver$1(this);

    private int d() {
        if (!PatchProxy.isSupport(new Object[0], this, f42110a, false, 36086, new Class[0], Integer.TYPE)) {
            return this.f42115f.getItemCount();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f42110a, false, 36086, new Class[0], Integer.TYPE)).intValue();
    }

    public final int a() {
        if (!PatchProxy.isSupport(new Object[0], this, f42110a, false, 36087, new Class[0], Integer.TYPE)) {
            return this.g.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f42110a, false, 36087, new Class[0], Integer.TYPE)).intValue();
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        if (!PatchProxy.isSupport(new Object[0], this, f42110a, false, 36088, new Class[0], Integer.TYPE)) {
            return this.f42111b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f42110a, false, 36088, new Class[0], Integer.TYPE)).intValue();
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f42110a, false, 36093, new Class[0], Integer.TYPE)) {
            return a() + b() + d();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f42110a, false, 36093, new Class[0], Integer.TYPE)).intValue();
    }

    @NotNull
    public final List<View> c() {
        if (PatchProxy.isSupport(new Object[0], this, f42110a, false, 36107, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f42110a, false, 36107, new Class[0], List.class);
        }
        Iterable<ViewHolder> iterable = this.g;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (ViewHolder viewHolder : iterable) {
            arrayList.add(viewHolder.itemView);
        }
        return (List) arrayList;
    }

    public HeaderAndFooterWrapper(@NotNull RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
        Intrinsics.checkParameterIsNotNull(adapter, "innerAdapter");
        this.f42115f = adapter;
        setHasStableIds(this.f42115f.hasStableIds());
    }

    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f42110a, false, 36095, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f42110a, false, 36095, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        this.f42114e = null;
        this.f42115f.onDetachedFromRecyclerView(recyclerView);
    }

    private final boolean b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f42110a, false, 36102, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f42110a, false, 36102, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (i2 < a()) {
            return true;
        } else {
            return false;
        }
    }

    private final boolean c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f42110a, false, 36103, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f42110a, false, 36103, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (i2 >= a() + d()) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean a(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f42110a, false, 36104, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return i.a(i2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f42110a, false, 36104, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f42110a, false, 36094, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f42110a, false, 36094, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        this.f42114e = recyclerView;
        this.f42115f.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new HeaderAndFooterWrapper$onAttachedToRecyclerView$1(this, gridLayoutManager, gridLayoutManager.getSpanSizeLookup()));
        }
    }

    public boolean onFailedToRecycleView(@NotNull RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f42110a, false, 36100, new Class[]{RecyclerView.ViewHolder.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f42110a, false, 36100, new Class[]{RecyclerView.ViewHolder.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        if (a(viewHolder.getItemViewType())) {
            return super.onFailedToRecycleView(viewHolder);
        }
        return this.f42115f.onFailedToRecycleView(viewHolder);
    }

    public void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f42110a, false, 36098, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f42110a, false, 36098, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        if (a(viewHolder.getItemViewType())) {
            View view = viewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
            }
        } else {
            this.f42115f.onViewAttachedToWindow(viewHolder);
        }
    }

    public void onViewDetachedFromWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f42110a, false, 36099, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f42110a, false, 36099, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        if (a(viewHolder.getItemViewType())) {
            super.onViewDetachedFromWindow(viewHolder);
        } else {
            this.f42115f.onViewDetachedFromWindow(viewHolder);
        }
    }

    public void onViewRecycled(@NotNull RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f42110a, false, 36101, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f42110a, false, 36101, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        if (a(viewHolder.getItemViewType())) {
            super.onViewRecycled(viewHolder);
        } else {
            this.f42115f.onViewRecycled(viewHolder);
        }
    }

    public void registerAdapterDataObserver(@NotNull RecyclerView.AdapterDataObserver adapterDataObserver) {
        if (PatchProxy.isSupport(new Object[]{adapterDataObserver}, this, f42110a, false, 36096, new Class[]{RecyclerView.AdapterDataObserver.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{adapterDataObserver}, this, f42110a, false, 36096, new Class[]{RecyclerView.AdapterDataObserver.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(adapterDataObserver, "observer");
        super.registerAdapterDataObserver(adapterDataObserver);
        this.f42115f.registerAdapterDataObserver(this.i);
    }

    public void unregisterAdapterDataObserver(@NotNull RecyclerView.AdapterDataObserver adapterDataObserver) {
        if (PatchProxy.isSupport(new Object[]{adapterDataObserver}, this, f42110a, false, 36097, new Class[]{RecyclerView.AdapterDataObserver.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{adapterDataObserver}, this, f42110a, false, 36097, new Class[]{RecyclerView.AdapterDataObserver.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(adapterDataObserver, "observer");
        super.unregisterAdapterDataObserver(adapterDataObserver);
        this.f42115f.unregisterAdapterDataObserver(this.i);
    }

    public final void a(@Nullable View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f42110a, false, 36105, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f42110a, false, 36105, new Class[]{View.class}, Void.TYPE);
            return;
        }
        int size = this.g.size();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(size), view}, this, f42110a, false, 36106, new Class[]{Integer.TYPE, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(size), view}, this, f42110a, false, 36106, new Class[]{Integer.TYPE, View.class}, Void.TYPE);
            return;
        }
        if (size >= 0 && size <= this.g.size() && view != null) {
            int a2 = this.f42113d.a();
            ViewHolder viewHolder = new ViewHolder(a2, view);
            this.g.add(viewHolder);
            this.h.put(a2, viewHolder);
            notifyItemInserted(size);
        }
    }

    public int getItemViewType(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f42110a, false, 36090, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f42110a, false, 36090, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (b(i2)) {
            return this.g.get(i2).f42136a;
        } else {
            if (c(i2)) {
                return this.f42111b.get((i2 - a()) - d()).f42136a;
            }
            int itemViewType = this.f42115f.getItemViewType(i2 - a());
            if (!a(itemViewType)) {
                return itemViewType;
            }
            throw new IllegalArgumentException("HeaderAndFooterWrapper use the viewType between 100000 and 110000");
        }
    }

    public final boolean b(@Nullable View view) {
        int i2;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f42110a, false, 36108, new Class[]{View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2}, this, f42110a, false, 36108, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
        } else if (view2 == null) {
            return false;
        } else {
            Iterator it2 = this.g.iterator();
            int i3 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i2 = -1;
                    break;
                } else if (Intrinsics.areEqual((Object) ((ViewHolder) it2.next()).itemView, (Object) view2)) {
                    i2 = i3;
                    break;
                } else {
                    i3++;
                }
            }
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f42110a, false, 36110, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f42110a, false, 36110, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (i2 < 0 || i2 >= this.g.size()) {
                return false;
            } else {
                ViewHolder remove = this.g.remove(i2);
                Intrinsics.checkExpressionValueIsNotNull(remove, "mHeaderViewHolderList.removeAt(pos)");
                ViewHolder viewHolder = remove;
                this.h.remove(viewHolder.f42136a);
                viewHolder.setIsRecyclable(false);
                i iVar = this.f42113d;
                int i4 = viewHolder.f42136a;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i4)}, iVar, i.f42176a, false, 36176, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    i iVar2 = iVar;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i4)}, iVar2, i.f42176a, false, 36176, new Class[]{Integer.TYPE}, Void.TYPE);
                } else {
                    iVar.f42178b.addLast(Integer.valueOf(i4));
                }
                notifyItemRemoved(i2);
                return true;
            }
        }
    }

    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i2) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f42110a, false, 36091, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f42110a, false, 36091, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        if (!b(i2) && !c(i2)) {
            this.f42115f.onBindViewHolder(viewHolder, i2 - a());
        }
    }

    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i2) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f42110a, false, 36089, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f42110a, false, 36089, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        ViewHolder viewHolder = (ViewHolder) this.h.get(i2);
        if (viewHolder == null) {
            viewHolder = (ViewHolder) this.f42112c.get(i2);
        }
        if (viewHolder != null) {
            return viewHolder;
        }
        RecyclerView.ViewHolder onCreateViewHolder = this.f42115f.onCreateViewHolder(viewGroup, i2);
        Intrinsics.checkExpressionValueIsNotNull(onCreateViewHolder, "innerAdapter.onCreateViewHolder(parent, viewType)");
        return onCreateViewHolder;
    }

    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i2, @NotNull List<Object> list) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        int i3 = i2;
        List<Object> list2 = list;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2), list2}, this, f42110a, false, 36092, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2), list2}, this, f42110a, false, 36092, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        Intrinsics.checkParameterIsNotNull(list2, "payloads");
        if (!b(i3) && !c(i3)) {
            this.f42115f.onBindViewHolder(viewHolder2, i3 - a(), list2);
        }
    }
}
