package com.bytedance.viewholder.typesafe;

import android.util.SparseArray;
import android.view.ViewGroup;
import com.bytedance.viewholder.typesafe.TypeSafeViewHolder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0016\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J#\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u001b\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0002\u0010\u0015J&\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\t2\u0006\u0010\u0014\u001a\u00020\u0010H\u0002J\u0015\u0010\u0017\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0018J8\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0014\u001a\u00020\u00102 \u0010\u001a\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007j\n\u0012\u0006\b\u0001\u0012\u00028\u0000`\tH\u0016R.\u0010\u0005\u001a\"\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\b\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007j\n\u0012\u0006\b\u0001\u0012\u00028\u0000`\t0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/bytedance/viewholder/typesafe/ViewHolderFactoryManager;", "VH", "Lcom/bytedance/viewholder/typesafe/TypeSafeViewHolder;", "Lcom/bytedance/viewholder/typesafe/ViewHolderFactoryRegistry;", "()V", "factories", "Landroid/util/SparseArray;", "Lkotlin/Function1;", "Landroid/view/ViewGroup;", "Lcom/bytedance/viewholder/typesafe/ViewHolderFactory;", "bindViewHolder", "", "holder", "item", "", "position", "", "(Lcom/bytedance/viewholder/typesafe/TypeSafeViewHolder;Ljava/lang/Object;I)V", "createViewHolder", "parent", "viewType", "(Landroid/view/ViewGroup;I)Lcom/bytedance/viewholder/typesafe/TypeSafeViewHolder;", "getFactory", "initViewHolder", "(Lcom/bytedance/viewholder/typesafe/TypeSafeViewHolder;)Lcom/bytedance/viewholder/typesafe/TypeSafeViewHolder;", "register", "factory", "typesafe_viewholder_release"}, k = 1, mv = {1, 1, 13})
public class a<VH extends TypeSafeViewHolder<?>> implements b<VH> {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<Function1<ViewGroup, VH>> f22897a = new SparseArray<>();

    /* access modifiers changed from: protected */
    @NotNull
    public VH a(@NotNull VH vh) {
        Intrinsics.checkParameterIsNotNull(vh, "holder");
        return vh;
    }

    @NotNull
    public final VH a(@NotNull ViewGroup viewGroup, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (this.f22897a.indexOfKey(i) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Function1<ViewGroup, VH> function1 = this.f22897a.get(i);
            Intrinsics.checkExpressionValueIsNotNull(function1, "factories[viewType]");
            VH vh = (TypeSafeViewHolder) function1.invoke(viewGroup);
            a(vh);
            return vh;
        }
        throw new IllegalArgumentException(("no factory for viewType " + i + " is registered").toString());
    }

    @NotNull
    public final b<VH> a(int i, @NotNull Function1<? super ViewGroup, ? extends VH> function1) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(function1, "factory");
        Function1 function12 = this.f22897a.get(i);
        if (function12 == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f22897a.put(i, function1);
            return this;
        }
        throw new IllegalArgumentException(("factory's viewType " + i + ' ' + function12.getClass().getSimpleName() + " is already registered").toString());
    }
}
