package com.ss.android.ugc.aweme.base.arch;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.bytedance.viewholder.typesafe.TypeSafeViewHolder;
import com.bytedance.viewholder.typesafe.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH$J\u001a\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u001b\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u001c\u001a\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH$R!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078VX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/base/arch/BaseTypeSafeAdapter;", "VH", "Lcom/bytedance/viewholder/typesafe/TypeSafeViewHolder;", "Lcom/ss/android/ugc/aweme/common/adapter/LoadMoreRecyclerViewAdapter;", "Lcom/bytedance/viewholder/typesafe/ViewHolderFactoryManagerOwner;", "()V", "manager", "Lcom/bytedance/viewholder/typesafe/ViewHolderFactoryManager;", "getManager", "()Lcom/bytedance/viewholder/typesafe/ViewHolderFactoryManager;", "manager$delegate", "Lkotlin/Lazy;", "getHeaderViewCount", "", "getItemAt", "", "position", "onBindBasicViewHolder", "", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "onCreateBasicViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "(Landroid/view/ViewGroup;I)Lcom/bytedance/viewholder/typesafe/TypeSafeViewHolder;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "registerFactories", "registry", "Lcom/bytedance/viewholder/typesafe/ViewHolderFactoryRegistry;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class BaseTypeSafeAdapter<VH extends TypeSafeViewHolder<?>> extends LoadMoreRecyclerViewAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2722a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f2723b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BaseTypeSafeAdapter.class), "manager", "getManager()Lcom/bytedance/viewholder/typesafe/ViewHolderFactoryManager;"))};
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private final Lazy f2724c = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0<? extends T>) new a<Object>(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/viewholder/typesafe/ViewHolderFactoryManager;", "VH", "Lcom/bytedance/viewholder/typesafe/TypeSafeViewHolder;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<com.bytedance.viewholder.typesafe.a<VH>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ BaseTypeSafeAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(BaseTypeSafeAdapter baseTypeSafeAdapter) {
            super(0);
            this.this$0 = baseTypeSafeAdapter;
        }

        @NotNull
        public final com.bytedance.viewholder.typesafe.a<VH> invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 24422, new Class[0], com.bytedance.viewholder.typesafe.a.class)) {
                return (com.bytedance.viewholder.typesafe.a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 24422, new Class[0], com.bytedance.viewholder.typesafe.a.class);
            }
            com.bytedance.viewholder.typesafe.a<VH> aVar = new com.bytedance.viewholder.typesafe.a<>();
            this.this$0.a((b<VH>) aVar);
            return aVar;
        }
    }

    @NotNull
    public abstract Object a(int i);

    public abstract void a(@NotNull b<VH> bVar);

    @NotNull
    public com.bytedance.viewholder.typesafe.a<VH> c() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f2722a, false, 24417, new Class[0], com.bytedance.viewholder.typesafe.a.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f2722a, false, 24417, new Class[0], com.bytedance.viewholder.typesafe.a.class);
        } else {
            value = this.f2724c.getValue();
        }
        return (com.bytedance.viewholder.typesafe.a) value;
    }

    public int d() {
        return 0;
    }

    public void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f2722a, false, 24418, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f2722a, false, 24418, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        super.onViewAttachedToWindow(viewHolder);
        if (!(viewHolder2 instanceof TypeSafeViewHolder)) {
            viewHolder2 = null;
        }
        TypeSafeViewHolder typeSafeViewHolder = (TypeSafeViewHolder) viewHolder2;
        if (typeSafeViewHolder != null) {
            typeSafeViewHolder.a();
        }
    }

    public void onViewDetachedFromWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f2722a, false, 24419, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f2722a, false, 24419, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        super.onViewDetachedFromWindow(viewHolder);
        if (!(viewHolder2 instanceof TypeSafeViewHolder)) {
            viewHolder2 = null;
        }
        TypeSafeViewHolder typeSafeViewHolder = (TypeSafeViewHolder) viewHolder2;
        if (typeSafeViewHolder != null) {
            typeSafeViewHolder.b();
        }
    }

    public void onBindBasicViewHolder(@Nullable RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f2722a, false, 24421, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f2722a, false, 24421, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        c();
        if (viewHolder != null) {
            TypeSafeViewHolder typeSafeViewHolder = (TypeSafeViewHolder) viewHolder;
            Object a2 = a(i2);
            Intrinsics.checkParameterIsNotNull(typeSafeViewHolder, "holder");
            Intrinsics.checkParameterIsNotNull(a2, "item");
            typeSafeViewHolder.a(a2, i2 - d());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type VH");
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        TypeSafeViewHolder typeSafeViewHolder;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f2722a, false, 24420, new Class[]{ViewGroup.class, Integer.TYPE}, TypeSafeViewHolder.class)) {
            typeSafeViewHolder = (TypeSafeViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f2722a, false, 24420, new Class[]{ViewGroup.class, Integer.TYPE}, TypeSafeViewHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
            typeSafeViewHolder = c().a(viewGroup2, i);
        }
        return typeSafeViewHolder;
    }
}
