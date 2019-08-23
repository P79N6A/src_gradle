package com.bytedance.jedi.ext.adapter;

import android.arch.lifecycle.ViewModelProvider;
import android.view.View;
import com.bytedance.jedi.arch.ae;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0000\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u000eJ\r\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0002\b\u0010R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/JediSimpleViewHolder;", "ITEM", "Lcom/bytedance/jedi/ext/adapter/JediViewHolder;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "Lcom/bytedance/jedi/ext/adapter/Factory;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "viewModelFactory", "getViewModelFactory", "()Lcom/bytedance/jedi/ext/adapter/Factory;", "onBind", "", "item", "(Ljava/lang/Object;)V", "onItemUpdated", "onItemUpdated$ext_adapter_release", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public abstract class JediSimpleViewHolder<ITEM> extends JediViewHolder<JediSimpleViewHolder<ITEM>, ITEM> implements ae<Factory> {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final Factory f21433a = d.f21436a;

    /* access modifiers changed from: protected */
    public abstract void a(ITEM item);

    public final void d() {
        a(e());
    }

    public final /* bridge */ /* synthetic */ ViewModelProvider.Factory r_() {
        return this.f21433a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JediSimpleViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
    }
}
