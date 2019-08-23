package com.ss.android.ugc.aweme.base.arch;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.multitype.MultiTypeViewHolder;
import com.bytedance.jedi.ext.adapter.multitype.b;
import com.bytedance.jedi.ext.adapter.multitype.c;
import com.bytedance.jedi.ext.adapter.multitype.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 (*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0002*\u0010\b\u0001\u0010\u0003 \u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u00052\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0006:\u0001(B\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u0004\u0018\u00010\tJ\u0006\u0010\u000e\u001a\u00020\u000bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH$J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000bH\u0016J(\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001aH\u0016J\u001d\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0016\u0010#\u001a\u00020\u00122\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%H$J\u0010\u0010&\u001a\u00020\u00122\b\u0010'\u001a\u0004\u0018\u00010\tR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ss/android/ugc/aweme/base/arch/MultiTypeAdapter;", "VH", "Lcom/bytedance/jedi/ext/adapter/multitype/MultiTypeViewHolder;", "M", "Lcom/bytedance/jedi/ext/adapter/multitype/ViewHolderFactoryManager;", "Lcom/ss/android/ugc/aweme/common/adapter/LoadMoreRecyclerViewAdapter;", "Lcom/bytedance/jedi/ext/adapter/multitype/GenericViewHolderFactoryManagerOwner;", "()V", "mHeaderView", "Landroid/view/View;", "getBasicItemViewType", "", "position", "getHeaderView", "getHeaderViewCount", "getItemAt", "", "onAttachedToRecyclerView", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "onBindBasicViewHolder", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "onBindViewHolder", "payloads", "", "onCreateBasicViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "(Landroid/view/ViewGroup;I)Lcom/bytedance/jedi/ext/adapter/multitype/MultiTypeViewHolder;", "onDetachedFromRecyclerView", "onViewAttachedToWindow", "onViewDetachedFromWindow", "registerFactories", "registry", "Lcom/bytedance/jedi/ext/adapter/multitype/ViewHolderFactoryRegistry;", "setHeaderView", "headerView", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class MultiTypeAdapter<VH extends MultiTypeViewHolder<?>, M extends c<VH>> extends LoadMoreRecyclerViewAdapter implements com.bytedance.jedi.ext.adapter.multitype.a<VH, M> {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f34643c;

    /* renamed from: e  reason: collision with root package name */
    public static final a f34644e = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public View f34645d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/base/arch/MultiTypeAdapter$Companion;", "", "()V", "TYPE_HEAD", "", "TYPE_NORMAL", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @NotNull
    public abstract Object a(int i);

    public abstract void a(@NotNull d<VH> dVar);

    public void onBindBasicViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f34643c, false, 24523, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f34643c, false, 24523, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
    }

    public final int c() {
        if (this.f34645d == null) {
            return 0;
        }
        return 1;
    }

    public int getBasicItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34643c, false, 24525, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34643c, false, 24525, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (i < c()) {
            return Integer.MAX_VALUE;
        } else {
            return 0;
        }
    }

    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2}, this, f34643c, false, 24520, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2}, this, f34643c, false, 24520, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView2, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        c b2 = b();
        Intrinsics.checkParameterIsNotNull(recyclerView2, "recyclerView");
        b bVar = b2.f21501c;
        Intrinsics.checkParameterIsNotNull(recyclerView2, "recyclerView");
        bVar.f21497a = recyclerView2;
    }

    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2}, this, f34643c, false, 24521, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2}, this, f34643c, false, 24521, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView2, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        c b2 = b();
        Intrinsics.checkParameterIsNotNull(recyclerView2, "recyclerView");
        b bVar = b2.f21501c;
        Intrinsics.checkParameterIsNotNull(recyclerView2, "recyclerView");
        bVar.f21497a = null;
    }

    public void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f34643c, false, 24518, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f34643c, false, 24518, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        super.onViewAttachedToWindow(viewHolder);
        if (!(viewHolder2 instanceof MultiTypeViewHolder)) {
            viewHolder2 = null;
        }
        MultiTypeViewHolder multiTypeViewHolder = (MultiTypeViewHolder) viewHolder2;
        if (multiTypeViewHolder != null) {
            multiTypeViewHolder.h();
        }
    }

    public void onViewDetachedFromWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f34643c, false, 24519, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f34643c, false, 24519, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        super.onViewDetachedFromWindow(viewHolder);
        if (!(viewHolder2 instanceof MultiTypeViewHolder)) {
            viewHolder2 = null;
        }
        MultiTypeViewHolder multiTypeViewHolder = (MultiTypeViewHolder) viewHolder2;
        if (multiTypeViewHolder != null) {
            multiTypeViewHolder.i();
        }
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        MultiTypeViewHolder multiTypeViewHolder;
        ViewGroup viewGroup2 = viewGroup;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f34643c, false, 24522, new Class[]{ViewGroup.class, Integer.TYPE}, MultiTypeViewHolder.class)) {
            multiTypeViewHolder = (MultiTypeViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f34643c, false, 24522, new Class[]{ViewGroup.class, Integer.TYPE}, MultiTypeViewHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
            if (i2 == Integer.MAX_VALUE) {
                View view = this.f34645d;
                if (view == null) {
                    Intrinsics.throwNpe();
                }
                multiTypeViewHolder = new JediHeaderViewHolder(view);
            } else {
                multiTypeViewHolder = b().a(viewGroup2, i2);
            }
        }
        return multiTypeViewHolder;
    }

    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i, @NotNull List<Object> list) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        int i2 = i;
        List<Object> list2 = list;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i), list2}, this, f34643c, false, 24524, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i), list2}, this, f34643c, false, 24524, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        Intrinsics.checkParameterIsNotNull(list2, "payloads");
        if (getItemViewType(i2) == Integer.MIN_VALUE) {
            super.onBindViewHolder(viewHolder, i, list);
            return;
        }
        if (getItemViewType(i2) != Integer.MAX_VALUE) {
            MultiTypeViewHolder multiTypeViewHolder = (MultiTypeViewHolder) viewHolder2;
            Object a2 = a(i2);
            Intrinsics.checkParameterIsNotNull(multiTypeViewHolder, "holder");
            Intrinsics.checkParameterIsNotNull(a2, "item");
            multiTypeViewHolder.a(a2, i2 - c(), list2);
        }
    }
}
