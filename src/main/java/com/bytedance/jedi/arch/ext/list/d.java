package com.bytedance.jedi.arch.ext.list;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
public final /* synthetic */ class d extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new d();

    d() {
    }

    public final String getName() {
        return "hasMore";
    }

    public final KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinPackage(i.class, "ext_list_release");
    }

    public final String getSignature() {
        return "getHasMore(Lcom/bytedance/jedi/arch/ext/list/ListState;)Lcom/bytedance/jedi/arch/ext/list/DistinctBoolean;";
    }

    @Nullable
    public final Object get(@Nullable Object obj) {
        return i.a((ListState) obj);
    }
}
