package com.ss.android.ugc.aweme.following.ui.viewmodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
public final /* synthetic */ class c extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new c();
    public static ChangeQuickRedirect changeQuickRedirect;

    c() {
    }

    public final String getName() {
        return "listState";
    }

    public final KDeclarationContainer getOwner() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 45242, new Class[0], KDeclarationContainer.class)) {
            return Reflection.getOrCreateKotlinClass(FollowerRelationState.class);
        }
        return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 45242, new Class[0], KDeclarationContainer.class);
    }

    public final String getSignature() {
        return "getListState()Lcom/bytedance/jedi/arch/ext/list/ListState;";
    }

    @Nullable
    public final Object get(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 45243, new Class[]{Object.class}, Object.class)) {
            return ((FollowerRelationState) obj).getListState();
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 45243, new Class[]{Object.class}, Object.class);
    }
}