package com.bytedance.jedi.ext.adapter.decorator.internal;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/decorator/internal/HeaderHolder;", "Lcom/bytedance/jedi/ext/adapter/decorator/internal/InternalHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public final class HeaderHolder extends InternalHolder {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeaderHolder(@NotNull View view) {
        super(view, (byte) 0);
        Intrinsics.checkParameterIsNotNull(view, "view");
    }
}
