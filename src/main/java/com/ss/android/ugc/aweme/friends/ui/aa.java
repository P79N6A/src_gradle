package com.ss.android.ugc.aweme.friends.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.friends.AddFriendsState;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
public final /* synthetic */ class aa extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new aa();
    public static ChangeQuickRedirect changeQuickRedirect;

    aa() {
    }

    public final String getName() {
        return "isFirstEnter";
    }

    public final KDeclarationContainer getOwner() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47328, new Class[0], KDeclarationContainer.class)) {
            return Reflection.getOrCreateKotlinClass(AddFriendsState.class);
        }
        return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47328, new Class[0], KDeclarationContainer.class);
    }

    public final String getSignature() {
        return "isFirstEnter()Z";
    }

    @Nullable
    public final Object get(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47329, new Class[]{Object.class}, Object.class)) {
            return Boolean.valueOf(((AddFriendsState) obj).isFirstEnter());
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47329, new Class[]{Object.class}, Object.class);
    }
}
