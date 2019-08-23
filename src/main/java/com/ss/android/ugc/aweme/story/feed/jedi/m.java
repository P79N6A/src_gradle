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
public final /* synthetic */ class m extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new m();
    public static ChangeQuickRedirect changeQuickRedirect;

    m() {
    }

    public final String getName() {
        return "userStory";
    }

    public final KDeclarationContainer getOwner() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 83406, new Class[0], KDeclarationContainer.class)) {
            return Reflection.getOrCreateKotlinClass(StoryMainHolderState.class);
        }
        return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 83406, new Class[0], KDeclarationContainer.class);
    }

    public final String getSignature() {
        return "getUserStory()Lcom/ss/android/ugc/aweme/story/api/model/UserStory;";
    }

    @Nullable
    public final Object get(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 83407, new Class[]{Object.class}, Object.class)) {
            return ((StoryMainHolderState) obj).getUserStory();
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 83407, new Class[]{Object.class}, Object.class);
    }
}
