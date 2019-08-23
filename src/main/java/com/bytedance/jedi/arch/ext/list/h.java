package com.bytedance.jedi.arch.ext.list;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
public final /* synthetic */ class h extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new h();

    h() {
    }

    public final String getName() {
        return "list";
    }

    public final KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(ListState.class);
    }

    public final String getSignature() {
        return "getList()Ljava/util/List;";
    }

    @Nullable
    public final Object get(@Nullable Object obj) {
        return ((ListState) obj).getList();
    }
}
