package com.ss.android.ugc.aweme.discover.hotspot;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.hotspot.viewmodel.HotSpotMainState;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
public final /* synthetic */ class f extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new f();
    public static ChangeQuickRedirect changeQuickRedirect;

    f() {
    }

    public final String getName() {
        return "curMarqueeList";
    }

    public final KDeclarationContainer getOwner() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 36530, new Class[0], KDeclarationContainer.class)) {
            return Reflection.getOrCreateKotlinClass(HotSpotMainState.class);
        }
        return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 36530, new Class[0], KDeclarationContainer.class);
    }

    public final String getSignature() {
        return "getCurMarqueeList()Lcom/bytedance/jedi/arch/Async;";
    }

    @Nullable
    public final Object get(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 36531, new Class[]{Object.class}, Object.class)) {
            return ((HotSpotMainState) obj).getCurMarqueeList();
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 36531, new Class[]{Object.class}, Object.class);
    }
}
