package com.bytedance.jedi.ext.adapter.multitype;

import android.support.annotation.CallSuper;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0017J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u000bH&¢\u0006\u0002\u0010\fJ/\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u000b2\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0007H\u0017¨\u0006\u0012"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/multitype/MultiTypeViewHolder;", "ITEM", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "attachToWindow", "", "bind", "item", "position", "", "(Ljava/lang/Object;I)V", "payloads", "", "", "(Ljava/lang/Object;ILjava/util/List;)V", "detachFromWindow", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public abstract class MultiTypeViewHolder<ITEM> extends RecyclerView.ViewHolder {
    public abstract void a(ITEM item, int i);

    @CallSuper
    public void h() {
    }

    @CallSuper
    public void i() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiTypeViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
    }

    public void a(ITEM item, int i, @Nullable List<Object> list) {
        a(item, i);
    }
}
