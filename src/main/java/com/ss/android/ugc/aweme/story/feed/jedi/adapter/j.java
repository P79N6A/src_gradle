package com.ss.android.ugc.aweme.story.feed.jedi.adapter;

import android.arch.lifecycle.StoryViewHolderProxyViewModelStore;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J+\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\r¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderViewModelProvider;", "", "factory", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "store", "Landroid/arch/lifecycle/StoryViewHolderProxyViewModelStore;", "(Landroid/arch/lifecycle/ViewModelProvider$Factory;Landroid/arch/lifecycle/StoryViewHolderProxyViewModelStore;)V", "get", "VM", "Landroid/arch/lifecycle/ViewModel;", "key", "", "clazz", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Landroid/arch/lifecycle/ViewModel;", "Companion", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72647a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f72648b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final ViewModelProvider.Factory f72649c;

    /* renamed from: d  reason: collision with root package name */
    private final StoryViewHolderProxyViewModelStore f72650d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderViewModelProvider$Companion;", "", "()V", "of", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderViewModelProvider;", "factory", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "store", "Landroid/arch/lifecycle/StoryViewHolderProxyViewModelStore;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72651a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @NotNull
        public final j a(@NotNull ViewModelProvider.Factory factory, @NotNull StoryViewHolderProxyViewModelStore storyViewHolderProxyViewModelStore) {
            ViewModelProvider.Factory factory2 = factory;
            StoryViewHolderProxyViewModelStore storyViewHolderProxyViewModelStore2 = storyViewHolderProxyViewModelStore;
            if (PatchProxy.isSupport(new Object[]{factory2, storyViewHolderProxyViewModelStore2}, this, f72651a, false, 83580, new Class[]{ViewModelProvider.Factory.class, StoryViewHolderProxyViewModelStore.class}, j.class)) {
                return (j) PatchProxy.accessDispatch(new Object[]{factory2, storyViewHolderProxyViewModelStore2}, this, f72651a, false, 83580, new Class[]{ViewModelProvider.Factory.class, StoryViewHolderProxyViewModelStore.class}, j.class);
            }
            Intrinsics.checkParameterIsNotNull(factory2, "factory");
            Intrinsics.checkParameterIsNotNull(storyViewHolderProxyViewModelStore2, "store");
            return new j(factory2, storyViewHolderProxyViewModelStore2);
        }
    }

    public j(@NotNull ViewModelProvider.Factory factory, @NotNull StoryViewHolderProxyViewModelStore storyViewHolderProxyViewModelStore) {
        Intrinsics.checkParameterIsNotNull(factory, "factory");
        Intrinsics.checkParameterIsNotNull(storyViewHolderProxyViewModelStore, "store");
        this.f72649c = factory;
        this.f72650d = storyViewHolderProxyViewModelStore;
    }

    @NotNull
    public final <VM extends ViewModel> VM a(@NotNull String str, @NotNull Class<VM> cls) {
        if (PatchProxy.isSupport(new Object[]{str, cls}, this, f72647a, false, 83579, new Class[]{String.class, Class.class}, ViewModel.class)) {
            return (ViewModel) PatchProxy.accessDispatch(new Object[]{str, cls}, this, f72647a, false, 83579, new Class[]{String.class, Class.class}, ViewModel.class);
        }
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        VM vm = this.f72650d.get(str);
        if (!cls.isInstance(vm)) {
            VM create = this.f72649c.create(cls);
            StoryViewHolderProxyViewModelStore storyViewHolderProxyViewModelStore = this.f72650d;
            Intrinsics.checkExpressionValueIsNotNull(create, AdvanceSetting.NETWORK_TYPE);
            storyViewHolderProxyViewModelStore.put(str, create);
            Intrinsics.checkExpressionValueIsNotNull(create, "factory.create<VM>(clazz…so { store.put(key, it) }");
            return create;
        } else if (vm != null) {
            return vm;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type VM");
        }
    }
}
