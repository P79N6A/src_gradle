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
public final /* synthetic */ class k extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new k();
    public static ChangeQuickRedirect changeQuickRedirect;

    k() {
    }

    public final String getName() {
        return "storyList";
    }

    public final KDeclarationContainer getOwner() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 83317, new Class[0], KDeclarationContainer.class)) {
            return Reflection.getOrCreateKotlinClass(StoryFeedState.class);
        }
        return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 83317, new Class[0], KDeclarationContainer.class);
    }

    public final String getSignature() {
        return "getStoryList()Ljava/util/List;";
    }

    @Nullable
    public final Object get(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 83318, new Class[]{Object.class}, Object.class)) {
            return ((StoryFeedState) obj).getStoryList();
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 83318, new Class[]{Object.class}, Object.class);
    }
}
