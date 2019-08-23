package com.ss.android.ugc.aweme.user.repository;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
public final /* synthetic */ class i extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new i();
    public static ChangeQuickRedirect changeQuickRedirect;

    i() {
    }

    public final String getName() {
        return AllStoryActivity.f73306b;
    }

    public final KDeclarationContainer getOwner() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 87716, new Class[0], KDeclarationContainer.class)) {
            return Reflection.getOrCreateKotlinClass(UserState.class);
        }
        return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 87716, new Class[0], KDeclarationContainer.class);
    }

    public final String getSignature() {
        return "getUser()Lcom/ss/android/ugc/aweme/profile/model/User;";
    }

    @Nullable
    public final Object get(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 87717, new Class[]{Object.class}, Object.class)) {
            return ((UserState) obj).getUser();
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 87717, new Class[]{Object.class}, Object.class);
    }
}
