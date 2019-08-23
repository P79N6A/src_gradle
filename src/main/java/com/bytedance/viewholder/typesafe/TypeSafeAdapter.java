package com.bytedance.viewholder.typesafe;

import android.support.v7.widget.RecyclerView;
import com.bytedance.viewholder.typesafe.TypeSafeViewHolder;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH$J\u001b\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0013J\u001b\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000f¢\u0006\u0002\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aJ\u0016\u0010\u001c\u001a\u00020\u00112\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH$R!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078VX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/bytedance/viewholder/typesafe/TypeSafeAdapter;", "VH", "Lcom/bytedance/viewholder/typesafe/TypeSafeViewHolder;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/bytedance/viewholder/typesafe/ViewHolderFactoryManagerOwner;", "()V", "manager", "Lcom/bytedance/viewholder/typesafe/ViewHolderFactoryManager;", "getManager", "()Lcom/bytedance/viewholder/typesafe/ViewHolderFactoryManager;", "manager$delegate", "Lkotlin/Lazy;", "getItemAt", "", "position", "", "onBindViewHolder", "", "holder", "(Lcom/bytedance/viewholder/typesafe/TypeSafeViewHolder;I)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "(Landroid/view/ViewGroup;I)Lcom/bytedance/viewholder/typesafe/TypeSafeViewHolder;", "onViewAttachedToWindow", "(Lcom/bytedance/viewholder/typesafe/TypeSafeViewHolder;)V", "onViewDetachedFromWindow", "registerFactories", "registry", "Lcom/bytedance/viewholder/typesafe/ViewHolderFactoryRegistry;", "typesafe_viewholder_release"}, k = 1, mv = {1, 1, 13})
public abstract class TypeSafeAdapter<VH extends TypeSafeViewHolder<?>> extends RecyclerView.Adapter<VH> {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f2330a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(TypeSafeAdapter.class), "manager", "getManager()Lcom/bytedance/viewholder/typesafe/ViewHolderFactoryManager;"))};
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final Lazy f2331b = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0<? extends T>) new a<Object>(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/viewholder/typesafe/ViewHolderFactoryManager;", "VH", "Lcom/bytedance/viewholder/typesafe/TypeSafeViewHolder;", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class a extends Lambda implements Function0<a<VH>> {
        final /* synthetic */ TypeSafeAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(TypeSafeAdapter typeSafeAdapter) {
            super(0);
            this.this$0 = typeSafeAdapter;
        }

        @NotNull
        public final a<VH> invoke() {
            return new a<>();
        }
    }
}
