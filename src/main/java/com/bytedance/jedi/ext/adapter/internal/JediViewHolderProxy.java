package com.bytedance.jedi.ext.adapter.internal;

import android.arch.lifecycle.JediViewHolderProxyViewModelStore;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LifecycleRegistry;
import android.arch.lifecycle.OnLifecycleEvent;
import com.bytedance.jedi.arch.d;
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J$\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001b2\u0014\u0010,\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0007\u0012\u0002\b\u0003\u0018\u00010\u0006J\u0015\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020\tH\u0000¢\u0006\u0002\b/J\u0015\u00100\u001a\u00020*2\u0006\u0010.\u001a\u00020\tH\u0000¢\u0006\u0002\b1J\u0006\u00102\u001a\u000203J\b\u00104\u001a\u000205H\u0016J\u001a\u00106\u001a\u00020*2\u0012\u0010,\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u0007\u0012\u0002\b\u00030\u0006J\b\u00107\u001a\u00020*H\u0007J\b\u00108\u001a\u00020*H\u0007J\u0006\u00109\u001a\u00020*J\b\u0010:\u001a\u00020*H\u0007J\b\u0010;\u001a\u00020*H\u0007R\u001c\u0010\u0005\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0007\u0012\u0002\b\u0003\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u000e\u0010\u000f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0004¢\u0006\u0002\n\u0000R\"\u0010#\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0007\u0012\u0002\b\u0003\u0018\u00010\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\"8VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006<"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxy;", "Lcom/bytedance/jedi/ext/adapter/IJediViewHolderProxy;", "Lcom/bytedance/jedi/arch/NestedLifecycleOwner;", "Landroid/arch/lifecycle/LifecycleObserver;", "()V", "holderInternal", "Lcom/bytedance/jedi/ext/adapter/JediViewHolder;", "Lcom/bytedance/jedi/arch/IReceiver;", "isDestroyed", "", "isDestroyed$ext_adapter_release", "()Z", "setDestroyed$ext_adapter_release", "(Z)V", "isLastEventEmittedByParent", "isLastEventEmittedByParentInternal", "lifecycleRegistry", "Landroid/arch/lifecycle/LifecycleRegistry;", "getLifecycleRegistry", "()Landroid/arch/lifecycle/LifecycleRegistry;", "lifecycleRegistry$delegate", "Lkotlin/Lazy;", "owner", "Landroid/arch/lifecycle/LifecycleOwner;", "getOwner", "()Landroid/arch/lifecycle/LifecycleOwner;", "proxyManager", "Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxyManager;", "getProxyManager$ext_adapter_release", "()Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxyManager;", "setProxyManager$ext_adapter_release", "(Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxyManager;)V", "realStore", "Lkotlin/Lazy;", "Landroid/arch/lifecycle/JediViewHolderProxyViewModelStore;", "receiver", "getReceiver", "()Lcom/bytedance/jedi/ext/adapter/JediViewHolder;", "store", "getStore", "()Landroid/arch/lifecycle/JediViewHolderProxyViewModelStore;", "bindViewHolder", "", "manager", "holder", "doStart", "isEmittedByParent", "doStart$ext_adapter_release", "doStop", "doStop$ext_adapter_release", "getHost", "", "getLifecycle", "Landroid/arch/lifecycle/Lifecycle;", "onAttachToWindow", "onCreate", "onDestroy", "onDetachedFromWindow", "onStart", "onStop", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public final class JediViewHolderProxy implements LifecycleObserver, q, com.bytedance.jedi.ext.adapter.b {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f2297a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JediViewHolderProxy.class), "lifecycleRegistry", "getLifecycleRegistry()Landroid/arch/lifecycle/LifecycleRegistry;"))};

    /* renamed from: b  reason: collision with root package name */
    public JediViewHolder<? extends d, ?> f2298b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public b f2299c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2300d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2301e = true;

    /* renamed from: f  reason: collision with root package name */
    private final Lazy<JediViewHolderProxyViewModelStore> f2302f = LazyKt.lazy(b.INSTANCE);
    private final Lazy g = LazyKt.lazy(new a(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/LifecycleRegistry;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<LifecycleRegistry> {
        final /* synthetic */ JediViewHolderProxy this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(JediViewHolderProxy jediViewHolderProxy) {
            super(0);
            this.this$0 = jediViewHolderProxy;
        }

        @NotNull
        public final LifecycleRegistry invoke() {
            return new LifecycleRegistry(this.this$0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/JediViewHolderProxyViewModelStore;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<JediViewHolderProxyViewModelStore> {
        public static final b INSTANCE = new b();

        b() {
            super(0);
        }

        @NotNull
        public final JediViewHolderProxyViewModelStore invoke() {
            return new JediViewHolderProxyViewModelStore();
        }
    }

    private final LifecycleRegistry c() {
        return (LifecycleRegistry) this.g.getValue();
    }

    @NotNull
    public final LifecycleOwner d() {
        return this;
    }

    public final boolean a() {
        return this.f2301e;
    }

    public final /* bridge */ /* synthetic */ d e() {
        return this.f2298b;
    }

    @NotNull
    public final Lifecycle getLifecycle() {
        return c();
    }

    @NotNull
    public final JediViewHolderProxyViewModelStore b() {
        return (JediViewHolderProxyViewModelStore) this.f2302f.getValue();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        this.f2300d = false;
        c().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        if (this.f2298b != null) {
            a(true);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        if (this.f2298b != null) {
            b(true);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        c().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        if (this.f2302f.isInitialized()) {
            b().clear();
        }
        this.f2300d = true;
    }

    public final void a(boolean z) {
        this.f2301e = z;
        c().handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    public final void b(boolean z) {
        this.f2301e = z;
        c().handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    public final void a(@NotNull b bVar, @Nullable JediViewHolder<? extends d, ?> jediViewHolder) {
        Intrinsics.checkParameterIsNotNull(bVar, "manager");
        if (jediViewHolder != null) {
            this.f2298b = jediViewHolder;
            bVar.a(this);
            return;
        }
        this.f2298b = null;
    }
}
