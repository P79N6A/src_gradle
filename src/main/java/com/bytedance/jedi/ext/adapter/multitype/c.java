package com.bytedance.jedi.ext.adapter.multitype;

import android.util.SparseArray;
import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.multitype.MultiTypeViewHolder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J%\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u001dJ5\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\r2\u0010\u0010\u001e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u000b¢\u0006\u0002\u0010\u001fJ\u001b\u0010 \u001a\u00028\u00002\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\r¢\u0006\u0002\u0010#J\u000e\u0010$\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rJ&\u0010%\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\t2\u0006\u0010\"\u001a\u00020\rH\u0002J\u0015\u0010&\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010'J\u000e\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020\u00192\u0006\u0010)\u001a\u00020*JW\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032%\u0010-\u001a!\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0007j\u0002`\u00122 \u0010.\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007j\n\u0012\u0006\b\u0001\u0012\u00028\u0000`\tH\u0016J8\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\"\u001a\u00020\r2 \u0010.\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007j\n\u0012\u0006\b\u0001\u0012\u00028\u0000`\tH\u0016R.\u0010\u0005\u001a\"\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\b\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007j\n\u0012\u0006\b\u0001\u0012\u00028\u0000`\t0\u0006X\u0004¢\u0006\u0002\n\u0000R_\u0010\n\u001aS\u0012O\u0012M\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\b\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007j\n\u0012\u0006\b\u0001\u0012\u00028\u0000`\t\u0012#\u0012!\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0007j\u0002`\u0012\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/multitype/ViewHolderFactoryManager;", "VH", "Lcom/bytedance/jedi/ext/adapter/multitype/MultiTypeViewHolder;", "Lcom/bytedance/jedi/ext/adapter/multitype/ViewHolderFactoryRegistry;", "()V", "factories", "Landroid/util/SparseArray;", "Lkotlin/Function1;", "Landroid/view/ViewGroup;", "Lcom/bytedance/jedi/ext/adapter/multitype/ViewHolderFactory;", "holderCreators", "", "Lkotlin/Triple;", "", "Lkotlin/ParameterName;", "name", "position", "", "Lcom/bytedance/jedi/ext/adapter/multitype/ViewHolderTypeMatcher;", "memento", "Lcom/bytedance/jedi/ext/adapter/multitype/LatestPositionMemento;", "getMemento$ext_adapter_release", "()Lcom/bytedance/jedi/ext/adapter/multitype/LatestPositionMemento;", "typeGenerator", "bindViewHolder", "", "holder", "item", "", "(Lcom/bytedance/jedi/ext/adapter/multitype/MultiTypeViewHolder;Ljava/lang/Object;I)V", "payloads", "(Lcom/bytedance/jedi/ext/adapter/multitype/MultiTypeViewHolder;Ljava/lang/Object;ILjava/util/List;)V", "createViewHolder", "parent", "viewType", "(Landroid/view/ViewGroup;I)Lcom/bytedance/jedi/ext/adapter/multitype/MultiTypeViewHolder;", "findItemViewType", "getFactory", "initViewHolder", "(Lcom/bytedance/jedi/ext/adapter/multitype/MultiTypeViewHolder;)Lcom/bytedance/jedi/ext/adapter/multitype/MultiTypeViewHolder;", "onAttachedToRecyclerView", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "onDetachedFromRecyclerView", "register", "typeMatcher", "factory", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public class c<VH extends MultiTypeViewHolder<?>> implements d<VH> {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<Function1<ViewGroup, VH>> f21499a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private final List<Triple<Function1<ViewGroup, VH>, Function1<Integer, Boolean>, Integer>> f21500b = new ArrayList();
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final b f21501c = new b();

    /* renamed from: d  reason: collision with root package name */
    private int f21502d = 11513600;

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
        if (this.f21499a.indexOfKey(i) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Function1<ViewGroup, VH> function1 = this.f21499a.get(i);
            Intrinsics.checkExpressionValueIsNotNull(function1, "factories[viewType]");
            VH vh = (MultiTypeViewHolder) function1.invoke(viewGroup);
            a(vh);
            return vh;
        }
        throw new IllegalArgumentException(("no factory for viewType " + i + " is registered").toString());
    }

    @NotNull
    public final d<VH> a(int i, @NotNull Function1<? super ViewGroup, ? extends VH> function1) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(function1, "factory");
        Function1 function12 = this.f21499a.get(i);
        if (function12 == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f21499a.put(i, function1);
            return this;
        }
        throw new IllegalArgumentException(("factory's viewType " + i + ' ' + function12.getClass().getSimpleName() + " is already registered").toString());
    }
}
