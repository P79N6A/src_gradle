package com.bytedance.jedi.ext.adapter.decorator.internal;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/decorator/internal/HeaderDelegate;", "Lcom/bytedance/jedi/ext/adapter/decorator/internal/Delegate;", "()V", "viewType", "", "getViewType", "()I", "setViewType", "(I)V", "createViewHolder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public final class d extends a {

    /* renamed from: a  reason: collision with root package name */
    private int f21462a;

    public final int f() {
        return this.f21462a;
    }

    @NotNull
    public final RecyclerView.ViewHolder a(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View b2 = b();
        if (b2 == null) {
            Intrinsics.throwNpe();
        }
        RecyclerView.ViewHolder headerHolder = new HeaderHolder(b2);
        a(headerHolder);
        return headerHolder;
    }
}
