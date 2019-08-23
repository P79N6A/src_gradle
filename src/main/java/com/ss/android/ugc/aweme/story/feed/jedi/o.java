package com.ss.android.ugc.aweme.story.feed.jedi;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
public final /* synthetic */ class o extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new o();
    public static ChangeQuickRedirect changeQuickRedirect;

    o() {
    }

    public final String getName() {
        return "preLoadMore";
    }

    public final KDeclarationContainer getOwner() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 83412, new Class[0], KDeclarationContainer.class)) {
            return Reflection.getOrCreateKotlinClass(StoryMainHolderState.class);
        }
        return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 83412, new Class[0], KDeclarationContainer.class);
    }

    public final String getSignature() {
        return "getPreLoadMore()Lcom/bytedance/jedi/arch/Async;";
    }

    @Nullable
    public final Object get(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 83413, new Class[]{Object.class}, Object.class)) {
            return ((StoryMainHolderState) obj).getPreLoadMore();
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 83413, new Class[]{Object.class}, Object.class);
    }
}
