package com.ss.android.ugc.aweme.friends.recommendlist.widget;

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
public final /* synthetic */ class a extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new a();
    public static ChangeQuickRedirect changeQuickRedirect;

    a() {
    }

    public final String getName() {
        return "hideRecommendMask";
    }

    public final KDeclarationContainer getOwner() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46912, new Class[0], KDeclarationContainer.class)) {
            return Reflection.getOrCreateKotlinClass(RecommendListState.class);
        }
        return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46912, new Class[0], KDeclarationContainer.class);
    }

    public final String getSignature() {
        return "getHideRecommendMask()Z";
    }

    @Nullable
    public final Object get(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 46913, new Class[]{Object.class}, Object.class)) {
            return Boolean.valueOf(((RecommendListState) obj).getHideRecommendMask());
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 46913, new Class[]{Object.class}, Object.class);
    }
}
