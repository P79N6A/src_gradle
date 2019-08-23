package com.ss.android.ugc.aweme.friends.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListState;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
public final /* synthetic */ class w extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new w();
    public static ChangeQuickRedirect changeQuickRedirect;

    w() {
    }

    public final String getName() {
        return "showGuide";
    }

    public final KDeclarationContainer getOwner() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47257, new Class[0], KDeclarationContainer.class)) {
            return Reflection.getOrCreateKotlinClass(RecommendListState.class);
        }
        return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47257, new Class[0], KDeclarationContainer.class);
    }

    public final String getSignature() {
        return "getShowGuide()Z";
    }

    @Nullable
    public final Object get(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47258, new Class[]{Object.class}, Object.class)) {
            return Boolean.valueOf(((RecommendListState) obj).getShowGuide());
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47258, new Class[]{Object.class}, Object.class);
    }
}
