package com.bytedance.jedi.ext.adapter;

import android.arch.lifecycle.JediViewHolderProxyViewModelStore;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.os.Looper;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J+\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\r¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/JediViewHolderViewModelProvider;", "", "factory", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "store", "Landroid/arch/lifecycle/JediViewHolderProxyViewModelStore;", "(Landroid/arch/lifecycle/ViewModelProvider$Factory;Landroid/arch/lifecycle/JediViewHolderProxyViewModelStore;)V", "get", "VM", "Landroid/arch/lifecycle/ViewModel;", "key", "", "clazz", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Landroid/arch/lifecycle/ViewModel;", "Companion", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f21473a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final ViewModelProvider.Factory f21474b;

    /* renamed from: c  reason: collision with root package name */
    private final JediViewHolderProxyViewModelStore f21475c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/JediViewHolderViewModelProvider$Companion;", "", "()V", "of", "Lcom/bytedance/jedi/ext/adapter/JediViewHolderViewModelProvider;", "factory", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "store", "Landroid/arch/lifecycle/JediViewHolderProxyViewModelStore;", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @NotNull
        public static g a(@NotNull ViewModelProvider.Factory factory, @NotNull JediViewHolderProxyViewModelStore jediViewHolderProxyViewModelStore) {
            Intrinsics.checkParameterIsNotNull(factory, "factory");
            Intrinsics.checkParameterIsNotNull(jediViewHolderProxyViewModelStore, "store");
            return new g(factory, jediViewHolderProxyViewModelStore);
        }
    }

    public g(@NotNull ViewModelProvider.Factory factory, @NotNull JediViewHolderProxyViewModelStore jediViewHolderProxyViewModelStore) {
        Intrinsics.checkParameterIsNotNull(factory, "factory");
        Intrinsics.checkParameterIsNotNull(jediViewHolderProxyViewModelStore, "store");
        this.f21474b = factory;
        this.f21475c = jediViewHolderProxyViewModelStore;
    }

    @NotNull
    public final <VM extends ViewModel> VM a(@NotNull String str, @NotNull Class<VM> cls) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        VM vm = this.f21475c.get(str);
        if (!cls.isInstance(vm)) {
            Thread currentThread = Thread.currentThread();
            Looper mainLooper = Looper.getMainLooper();
            Intrinsics.checkExpressionValueIsNotNull(mainLooper, "Looper.getMainLooper()");
            if (currentThread == mainLooper.getThread()) {
                VM create = this.f21474b.create(cls);
                JediViewHolderProxyViewModelStore jediViewHolderProxyViewModelStore = this.f21475c;
                Intrinsics.checkExpressionValueIsNotNull(create, AdvanceSetting.NETWORK_TYPE);
                jediViewHolderProxyViewModelStore.put(str, create);
                Intrinsics.checkExpressionValueIsNotNull(create, "factory.create<VM>(clazz…so { store.put(key, it) }");
                return create;
            }
            throw new IllegalStateException("ViewModel's creation for JediViewHolder is only allowed in main thread, current thread is:" + Thread.currentThread());
        } else if (vm != null) {
            return vm;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type VM");
        }
    }
}
