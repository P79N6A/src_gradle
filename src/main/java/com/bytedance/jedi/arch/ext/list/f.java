package com.bytedance.jedi.arch.ext.list;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
public final /* synthetic */ class f extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new f();

    f() {
    }

    public final String getName() {
        return "refresh";
    }

    public final KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(ListState.class);
    }

    public final String getSignature() {
        return "getRefresh()Lcom/bytedance/jedi/arch/Async;";
    }

    @Nullable
    public final Object get(@Nullable Object obj) {
        return ((ListState) obj).getRefresh();
    }
}
