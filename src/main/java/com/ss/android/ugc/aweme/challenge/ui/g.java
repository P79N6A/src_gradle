package com.ss.android.ugc.aweme.challenge.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailState;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
public final /* synthetic */ class g extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new g();
    public static ChangeQuickRedirect changeQuickRedirect;

    g() {
    }

    public final String getName() {
        return "challengeDetail";
    }

    public final KDeclarationContainer getOwner() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 26148, new Class[0], KDeclarationContainer.class)) {
            return Reflection.getOrCreateKotlinClass(ChallengeDetailState.class);
        }
        return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 26148, new Class[0], KDeclarationContainer.class);
    }

    public final String getSignature() {
        return "getChallengeDetail()Lcom/bytedance/jedi/arch/Async;";
    }

    @Nullable
    public final Object get(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 26149, new Class[]{Object.class}, Object.class)) {
            return ((ChallengeDetailState) obj).getChallengeDetail();
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 26149, new Class[]{Object.class}, Object.class);
    }
}
