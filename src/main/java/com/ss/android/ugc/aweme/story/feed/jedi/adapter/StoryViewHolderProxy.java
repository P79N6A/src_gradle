package com.ss.android.ugc.aweme.story.feed.jedi.adapter;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LifecycleRegistry;
import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.StoryViewHolderProxyViewModelStore;
import com.bytedance.jedi.arch.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\"\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00182\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u0003\u0018\u00010\u0006J\u0006\u0010*\u001a\u00020+J\b\u0010,\u001a\u00020-H\u0016J\u0018\u0010.\u001a\u00020'2\u0010\u0010)\u001a\f\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u00030\u0006J\b\u0010/\u001a\u00020'H\u0007J\b\u00100\u001a\u00020'H\u0007J\u0006\u00101\u001a\u00020'J\b\u00102\u001a\u00020'H\u0007J\b\u00103\u001a\u00020'H\u0007R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u0003\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0004¢\u0006\u0002\n\u0000R \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u0003\u0018\u00010\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u001f8VX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u00064"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderProxy;", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/IStoryViewHolderProxy;", "Landroid/arch/lifecycle/LifecycleObserver;", "Landroid/arch/lifecycle/LifecycleOwner;", "()V", "holderInternal", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolder;", "Lcom/bytedance/jedi/arch/IReceiver;", "isDestroyed", "", "isDestroyed$awemestory_douyinCnRelease", "()Z", "setDestroyed$awemestory_douyinCnRelease", "(Z)V", "lifecycleRegistry", "Landroid/arch/lifecycle/LifecycleRegistry;", "getLifecycleRegistry", "()Landroid/arch/lifecycle/LifecycleRegistry;", "lifecycleRegistry$delegate", "Lkotlin/Lazy;", "owner", "getOwner", "()Landroid/arch/lifecycle/LifecycleOwner;", "proxyManager", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderProxyManager;", "getProxyManager$awemestory_douyinCnRelease", "()Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderProxyManager;", "setProxyManager$awemestory_douyinCnRelease", "(Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderProxyManager;)V", "realStore", "Lkotlin/Lazy;", "Landroid/arch/lifecycle/StoryViewHolderProxyViewModelStore;", "receiver", "getReceiver", "()Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolder;", "store", "getStore", "()Landroid/arch/lifecycle/StoryViewHolderProxyViewModelStore;", "bindViewHolder", "", "widgetManager", "holder", "getHost", "", "getLifecycle", "Landroid/arch/lifecycle/Lifecycle;", "onAttachToWindow", "onCreate", "onDestroy", "onDetachedFromWindow", "onStart", "onStop", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StoryViewHolderProxy implements LifecycleObserver, LifecycleOwner, a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4128a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f4129b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(StoryViewHolderProxy.class), "lifecycleRegistry", "getLifecycleRegistry()Landroid/arch/lifecycle/LifecycleRegistry;"))};

    /* renamed from: c  reason: collision with root package name */
    public StoryViewHolder<? extends d, ?> f4130c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public StoryViewHolderProxyManager f4131d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4132e;

    /* renamed from: f  reason: collision with root package name */
    private final Lazy<StoryViewHolderProxyViewModelStore> f4133f = LazyKt.lazy(b.INSTANCE);
    private final Lazy g = LazyKt.lazy(new a(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/LifecycleRegistry;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<LifecycleRegistry> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ StoryViewHolderProxy this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(StoryViewHolderProxy storyViewHolderProxy) {
            super(0);
            this.this$0 = storyViewHolderProxy;
        }

        @NotNull
        public final LifecycleRegistry invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 83535, new Class[0], LifecycleRegistry.class)) {
                return new LifecycleRegistry(this.this$0);
            }
            return (LifecycleRegistry) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 83535, new Class[0], LifecycleRegistry.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/StoryViewHolderProxyViewModelStore;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<StoryViewHolderProxyViewModelStore> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(0);
        }

        @NotNull
        public final StoryViewHolderProxyViewModelStore invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 83536, new Class[0], StoryViewHolderProxyViewModelStore.class)) {
                return new StoryViewHolderProxyViewModelStore();
            }
            return (StoryViewHolderProxyViewModelStore) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 83536, new Class[0], StoryViewHolderProxyViewModelStore.class);
        }
    }

    private final LifecycleRegistry b() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f4128a, false, 83526, new Class[0], LifecycleRegistry.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f4128a, false, 83526, new Class[0], LifecycleRegistry.class);
        } else {
            value = this.g.getValue();
        }
        return (LifecycleRegistry) value;
    }

    @NotNull
    public final LifecycleOwner d() {
        return this;
    }

    public final /* bridge */ /* synthetic */ d e() {
        return this.f4130c;
    }

    @NotNull
    public final StoryViewHolderProxyViewModelStore a() {
        if (!PatchProxy.isSupport(new Object[0], this, f4128a, false, 83525, new Class[0], StoryViewHolderProxyViewModelStore.class)) {
            return (StoryViewHolderProxyViewModelStore) this.f4133f.getValue();
        }
        return (StoryViewHolderProxyViewModelStore) PatchProxy.accessDispatch(new Object[0], this, f4128a, false, 83525, new Class[0], StoryViewHolderProxyViewModelStore.class);
    }

    @NotNull
    public final Lifecycle getLifecycle() {
        if (!PatchProxy.isSupport(new Object[0], this, f4128a, false, 83534, new Class[0], Lifecycle.class)) {
            return b();
        }
        return (Lifecycle) PatchProxy.accessDispatch(new Object[0], this, f4128a, false, 83534, new Class[0], Lifecycle.class);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f4128a, false, 83529, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4128a, false, 83529, new Class[0], Void.TYPE);
            return;
        }
        this.f4132e = false;
        b().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f4128a, false, 83530, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4128a, false, 83530, new Class[0], Void.TYPE);
            return;
        }
        b().handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f4128a, false, 83531, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4128a, false, 83531, new Class[0], Void.TYPE);
            return;
        }
        b().handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f4128a, false, 83532, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4128a, false, 83532, new Class[0], Void.TYPE);
            return;
        }
        b().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        if (this.f4133f.isInitialized()) {
            a().clear();
        }
        this.f4132e = true;
    }

    public final void a(@NotNull StoryViewHolderProxyManager storyViewHolderProxyManager, @Nullable StoryViewHolder<? extends d, ?> storyViewHolder) {
        if (PatchProxy.isSupport(new Object[]{storyViewHolderProxyManager, storyViewHolder}, this, f4128a, false, 83527, new Class[]{StoryViewHolderProxyManager.class, StoryViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{storyViewHolderProxyManager, storyViewHolder}, this, f4128a, false, 83527, new Class[]{StoryViewHolderProxyManager.class, StoryViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(storyViewHolderProxyManager, "widgetManager");
        if (storyViewHolder != null) {
            this.f4130c = storyViewHolder;
            storyViewHolderProxyManager.a(this);
            return;
        }
        this.f4130c = null;
    }
}
