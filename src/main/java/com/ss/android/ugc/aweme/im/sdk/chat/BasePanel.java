package com.ss.android.ugc.aweme.im.sdk.chat;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LifecycleRegistry;
import android.arch.lifecycle.OnLifecycleEvent;
import android.support.annotation.CallSuper;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0006\u0010\u0013\u001a\u00020\u0006J\b\u0010\u0014\u001a\u00020\u0015H\u0017J\b\u0010\u0016\u001a\u00020\u0015H\u0017J\b\u0010\u0017\u001a\u00020\u0015H\u0017J\b\u0010\u0018\u001a\u00020\u0015H\u0017J\b\u0010\u0019\u001a\u00020\u0015H\u0017J\b\u0010\u001a\u001a\u00020\u0015H\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/BasePanel;", "Landroid/arch/lifecycle/LifecycleOwner;", "Landroid/arch/lifecycle/LifecycleObserver;", "parent", "(Landroid/arch/lifecycle/LifecycleOwner;)V", "isDestroyed", "", "isResumed", "lifecycleRegistry", "Landroid/arch/lifecycle/LifecycleRegistry;", "getLifecycleRegistry", "()Landroid/arch/lifecycle/LifecycleRegistry;", "lifecycleRegistry$delegate", "Lkotlin/Lazy;", "getParent", "()Landroid/arch/lifecycle/LifecycleOwner;", "getHost", "getLifecycle", "Landroid/arch/lifecycle/Lifecycle;", "isResume", "onCreate", "", "onDestroy", "onPause", "onResume", "onStart", "onStop", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class BasePanel implements LifecycleObserver, LifecycleOwner {
    public static ChangeQuickRedirect o;
    static final /* synthetic */ KProperty[] p = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BasePanel.class), "lifecycleRegistry", "getLifecycleRegistry()Landroid/arch/lifecycle/LifecycleRegistry;"))};

    /* renamed from: a  reason: collision with root package name */
    private boolean f3362a;

    /* renamed from: b  reason: collision with root package name */
    private final Lazy f3363b = LazyKt.lazy(new a(this));
    public boolean q;
    @NotNull
    public final LifecycleOwner r;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/LifecycleRegistry;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<LifecycleRegistry> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ BasePanel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(BasePanel basePanel) {
            super(0);
            this.this$0 = basePanel;
        }

        @NotNull
        public final LifecycleRegistry invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 50236, new Class[0], LifecycleRegistry.class)) {
                return new LifecycleRegistry(this.this$0);
            }
            return (LifecycleRegistry) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 50236, new Class[0], LifecycleRegistry.class);
        }
    }

    private final LifecycleRegistry a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, o, false, 50228, new Class[0], LifecycleRegistry.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, o, false, 50228, new Class[0], LifecycleRegistry.class);
        } else {
            value = this.f3363b.getValue();
        }
        return (LifecycleRegistry) value;
    }

    @NotNull
    public Lifecycle getLifecycle() {
        if (!PatchProxy.isSupport(new Object[0], this, o, false, 50229, new Class[0], Lifecycle.class)) {
            return a();
        }
        return (Lifecycle) PatchProxy.accessDispatch(new Object[0], this, o, false, 50229, new Class[0], Lifecycle.class);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    @CallSuper
    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 50230, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 50230, new Class[0], Void.TYPE);
            return;
        }
        this.f3362a = false;
        a().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    @CallSuper
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 50235, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 50235, new Class[0], Void.TYPE);
            return;
        }
        a().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    @CallSuper
    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 50233, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 50233, new Class[0], Void.TYPE);
            return;
        }
        this.q = false;
        a().handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    @CallSuper
    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 50232, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 50232, new Class[0], Void.TYPE);
            return;
        }
        this.q = true;
        a().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    @CallSuper
    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 50231, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 50231, new Class[0], Void.TYPE);
            return;
        }
        a().handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    @CallSuper
    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 50234, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 50234, new Class[0], Void.TYPE);
            return;
        }
        this.f3362a = true;
        a().handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    public BasePanel(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "parent");
        this.r = lifecycleOwner;
    }
}
