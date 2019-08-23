package com.bytedance.jedi.arch;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
public final class t implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Function1 f21412a;

    t(Function1 function1) {
        this.f21412a = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkExpressionValueIsNotNull(this.f21412a.invoke(obj), "invoke(...)");
    }
}
