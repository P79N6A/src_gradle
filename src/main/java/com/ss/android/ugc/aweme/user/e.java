package com.ss.android.ugc.aweme.user;

import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
public final class e implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Function1 f75352a;

    e(Function1 function1) {
        this.f75352a = function1;
    }

    public final /* synthetic */ boolean test(Object obj) {
        Object invoke = this.f75352a.invoke(obj);
        Intrinsics.checkExpressionValueIsNotNull(invoke, "invoke(...)");
        return ((Boolean) invoke).booleanValue();
    }
}
