package com.ss.android.ugc.aweme.discover.delegate.a;

import android.arch.lifecycle.LifecycleOwner;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.adapter.HotSearchImageViewHolder;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.ss.android.ugc.aweme.discover.ui.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0005¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0014J4\u0010\u000f\u001a\u00020\u00102\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J\u000e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\tR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/HotSearchImageDelegate;", "Lcom/ss/android/ugc/aweme/common/adapter/AdapterDelegate;", "", "", "owner", "Landroid/arch/lifecycle/LifecycleOwner;", "(Landroid/arch/lifecycle/LifecycleOwner;)V", "()V", "mHandler", "Lcom/ss/android/ugc/aweme/discover/ui/SearchActionHandler$IHotSearchHandler;", "isForViewType", "", "items", "position", "", "onBindViewHolder", "", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "payloads", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "setHotSearchHandler", "handler", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends com.ss.android.ugc.aweme.common.adapter.a<List<? extends Object>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42240a;

    /* renamed from: b  reason: collision with root package name */
    public ak.b f42241b;

    /* renamed from: c  reason: collision with root package name */
    private LifecycleOwner f42242c;

    public a() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(@NotNull LifecycleOwner lifecycleOwner) {
        this();
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        this.f42242c = lifecycleOwner;
    }

    @NotNull
    public final RecyclerView.ViewHolder a(@NotNull ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f42240a, false, 36225, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f42240a, false, 36225, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        HotSearchImageViewHolder a2 = HotSearchImageViewHolder.a(viewGroup, "hot_search_section_search", this.f42241b, this.f42242c);
        Intrinsics.checkExpressionValueIsNotNull(a2, "HotSearchImageViewHolder…         mHandler, owner)");
        return a2;
    }

    public final /* synthetic */ boolean a(Object obj, int i) {
        List list = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f42240a, false, 36224, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f42240a, false, 36224, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(list, "items");
        Object obj2 = list.get(i);
        if (!(obj2 instanceof List)) {
            obj2 = null;
        }
        List list2 = (List) obj2;
        if (list2 != null && !CollectionUtils.isEmpty(list2) && (list2.get(0) instanceof HotSearchItem)) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void a(Object obj, int i, RecyclerView.ViewHolder viewHolder, List list) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        List list2 = list;
        List list3 = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list3, Integer.valueOf(i), viewHolder2, list2}, this, f42240a, false, 36226, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list3, Integer.valueOf(i), viewHolder2, list2}, this, f42240a, false, 36226, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list3, "items");
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        Intrinsics.checkParameterIsNotNull(list2, "payloads");
        Object obj2 = list3.get(i);
        if (obj2 != null) {
            List list4 = (List) obj2;
            if (viewHolder2 instanceof HotSearchImageViewHolder) {
                ((HotSearchImageViewHolder) viewHolder2).a(list4);
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.discover.model.HotSearchItem>");
    }
}
