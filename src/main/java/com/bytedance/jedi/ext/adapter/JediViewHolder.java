package com.bytedance.jedi.ext.adapter;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LifecycleRegistry;
import android.arch.lifecycle.OnLifecycleEvent;
import android.support.annotation.CallSuper;
import android.support.annotation.RestrictTo;
import android.view.View;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.d;
import com.bytedance.jedi.arch.e;
import com.bytedance.jedi.arch.k;
import com.bytedance.jedi.arch.r;
import com.bytedance.jedi.arch.x;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy;
import com.bytedance.jedi.ext.adapter.multitype.MultiTypeViewHolder;
import io.reactivex.disposables.Disposable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u00042\u00020\u00052\u00020\u00062\b\u0012\u0004\u0012\u0002H\u00010\u0007B\r\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u00107\u001a\u000208H\u0016J\u001d\u00109\u001a\u0002082\u0006\u0010\u000f\u001a\u00028\u00012\u0006\u0010:\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010;J/\u00109\u001a\u0002082\u0006\u0010\u000f\u001a\u00028\u00012\u0006\u0010:\u001a\u00020\u00132\u0010\u0010<\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010>\u0018\u00010=H\u0007¢\u0006\u0002\u0010?J\u0010\u0010@\u001a\u0002082\u0006\u0010:\u001a\u00020\u0013H\u0002J\b\u0010A\u001a\u000208H\u0007J\b\u0010B\u001a\u000208H\u0016J\u0006\u0010C\u001a\u00020\u0005J\b\u0010D\u001a\u00020EH\u0016J\b\u0010F\u001a\u000208H\u0002J\b\u0010G\u001a\u000208H\u0002J\b\u0010H\u001a\u000208H\u0017J\b\u0010I\u001a\u000208H\u0017J\r\u0010J\u001a\u000208H\u0010¢\u0006\u0002\bKJ\b\u0010L\u001a\u000208H\u0017J\b\u0010M\u001a\u000208H\u0017J\b\u0010N\u001a\u000208H\u0017J\b\u0010O\u001a\u000208H\u0017J\b\u0010P\u001a\u000208H\u0015J\r\u0010Q\u001a\u000208H\u0000¢\u0006\u0002\bRR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00028\u00018DX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138DX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00018\u00012\b\u0010\u0016\u001a\u0004\u0018\u00018\u0001@BX\u000e¢\u0006\n\n\u0002\u0010\u001a\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001b\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\u00020#X.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020.X.¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0016\u00103\u001a\u0004\u0018\u0001048WX\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006S"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/JediViewHolder;", "R", "Lcom/bytedance/jedi/arch/IReceiver;", "ITEM", "Lcom/bytedance/jedi/ext/adapter/multitype/MultiTypeViewHolder;", "Landroid/arch/lifecycle/LifecycleOwner;", "Landroid/arch/lifecycle/LifecycleObserver;", "Lcom/bytedance/jedi/ext/adapter/ViewHolderSubscriber;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "currentProxy", "Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxy;", "isResumed", "", "item", "getItem", "()Ljava/lang/Object;", "itemPosition", "", "getItemPosition", "()I", "value", "latestItemInternal", "setLatestItemInternal", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "latestItemPositionInternal", "lifecycleRegistry", "Landroid/arch/lifecycle/LifecycleRegistry;", "getLifecycleRegistry", "()Landroid/arch/lifecycle/LifecycleRegistry;", "lifecycleRegistry$delegate", "Lkotlin/Lazy;", "manager", "Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderItemInitiationStatusManager;", "getManager$ext_adapter_release", "()Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderItemInitiationStatusManager;", "setManager$ext_adapter_release", "(Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderItemInitiationStatusManager;)V", "parent", "getParent$ext_adapter_release", "()Landroid/arch/lifecycle/LifecycleOwner;", "setParent$ext_adapter_release", "(Landroid/arch/lifecycle/LifecycleOwner;)V", "provider", "Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxyProvider;", "getProvider$ext_adapter_release", "()Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxyProvider;", "setProvider$ext_adapter_release", "(Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxyProvider;)V", "proxy", "Lcom/bytedance/jedi/ext/adapter/IJediViewHolderProxy;", "getProxy", "()Lcom/bytedance/jedi/ext/adapter/IJediViewHolderProxy;", "attachToWindow", "", "bind", "position", "(Ljava/lang/Object;I)V", "payloads", "", "", "(Ljava/lang/Object;ILjava/util/List;)V", "bindProxy", "create", "detachFromWindow", "getHost", "getLifecycle", "Landroid/arch/lifecycle/Lifecycle;", "moveToResumed", "moveToStop", "onCreate", "onDestroy", "onItemUpdated", "onItemUpdated$ext_adapter_release", "onPause", "onResume", "onStart", "onStop", "onViewHolderPrepared", "prepare", "prepare$ext_adapter_release", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public abstract class JediViewHolder<R extends d, ITEM> extends MultiTypeViewHolder<ITEM> implements LifecycleObserver, LifecycleOwner, h<R> {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f2285b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JediViewHolder.class), "lifecycleRegistry", "getLifecycleRegistry()Landroid/arch/lifecycle/LifecycleRegistry;"))};

    /* renamed from: a  reason: collision with root package name */
    private ITEM f2286a;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public LifecycleOwner f2287c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.jedi.ext.adapter.internal.a f2288d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public com.bytedance.jedi.ext.adapter.internal.d f2289e;

    /* renamed from: f  reason: collision with root package name */
    public int f2290f;
    private JediViewHolderProxy g;
    private final Lazy h = LazyKt.lazy(new a(this));
    private boolean i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/LifecycleRegistry;", "R", "Lcom/bytedance/jedi/arch/IReceiver;", "ITEM", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<LifecycleRegistry> {
        final /* synthetic */ JediViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(JediViewHolder jediViewHolder) {
            super(0);
            this.this$0 = jediViewHolder;
        }

        @NotNull
        public final LifecycleRegistry invoke() {
            return new LifecycleRegistry(this.this$0);
        }
    }

    private final LifecycleRegistry l() {
        return (LifecycleRegistry) this.h.getValue();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void a(ITEM item, int i2) {
    }

    public final boolean c() {
        return false;
    }

    public void d() {
    }

    @CallSuper
    public void j() {
    }

    public final ITEM e() {
        ITEM item = this.f2286a;
        if (item == null) {
            Intrinsics.throwNpe();
        }
        return item;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final b g() {
        return this.g;
    }

    @NotNull
    public Lifecycle getLifecycle() {
        return l();
    }

    public final void i() {
        JediViewHolderProxy jediViewHolderProxy = this.g;
        if (jediViewHolderProxy != null) {
            jediViewHolderProxy.f2298b = null;
        }
        n();
        super.i();
    }

    @NotNull
    public final LifecycleOwner k() {
        LifecycleOwner lifecycleOwner = this.f2287c;
        if (lifecycleOwner == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parent");
        }
        return lifecycleOwner;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    @CallSuper
    public void onDestroy() {
        l().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    @CallSuper
    public void onPause() {
        l().handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    @CallSuper
    public void onResume() {
        l().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    private final void m() {
        if (!this.i) {
            this.i = true;
            LifecycleOwner lifecycleOwner = this.f2287c;
            if (lifecycleOwner == null) {
                Intrinsics.throwUninitializedPropertyAccessException("parent");
            }
            lifecycleOwner.getLifecycle().addObserver(this);
        }
    }

    @NotNull
    public final k a() {
        b g2 = g();
        if (g2 != null) {
            return g2;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.jedi.arch.LifecycleOwnerHolder");
    }

    @NotNull
    public final r<R> b() {
        b g2 = g();
        if (g2 != null) {
            return g2;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.jedi.arch.ReceiverHolder<VH>");
    }

    public final void h() {
        super.h();
        JediViewHolderProxy jediViewHolderProxy = this.g;
        if (jediViewHolderProxy != null) {
            Intrinsics.checkParameterIsNotNull(this, "holder");
            jediViewHolderProxy.f2298b = this;
        }
        m();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    @CallSuper
    public void onStart() {
        l().handleLifecycleEvent(Lifecycle.Event.ON_START);
        JediViewHolderProxy jediViewHolderProxy = this.g;
        if (jediViewHolderProxy != null) {
            jediViewHolderProxy.a(false);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    @CallSuper
    public void onStop() {
        l().handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        JediViewHolderProxy jediViewHolderProxy = this.g;
        if (jediViewHolderProxy != null) {
            jediViewHolderProxy.b(false);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void create() {
        boolean z;
        com.bytedance.jedi.ext.adapter.internal.a aVar = this.f2288d;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
        }
        int i2 = this.f2290f;
        if (i2 < 0 || i2 >= aVar.f21483a.size()) {
            z = false;
        } else {
            z = aVar.f21483a.get(i2).booleanValue();
        }
        if (!z) {
            j();
            com.bytedance.jedi.ext.adapter.internal.a aVar2 = this.f2288d;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("manager");
            }
            aVar2.a(this.f2290f, true);
        }
    }

    private final void n() {
        if (this.i) {
            this.i = false;
            LifecycleOwner lifecycleOwner = this.f2287c;
            if (lifecycleOwner == null) {
                Intrinsics.throwUninitializedPropertyAccessException("parent");
            }
            lifecycleOwner.getLifecycle().removeObserver(this);
            switch (e.f21469a[getLifecycle().getCurrentState().ordinal()]) {
                case 1:
                    onStop();
                    return;
                case 2:
                    onStop();
                    return;
                case 3:
                    onPause();
                    onStop();
                    break;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JediViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
    }

    public final <VM1 extends JediViewModel<S1>, S1 extends x, R> R a(@NotNull VM1 vm1, @NotNull Function1<? super S1, ? extends R> function1) {
        Intrinsics.checkParameterIsNotNull(vm1, "viewModel1");
        Intrinsics.checkParameterIsNotNull(function1, "block");
        Intrinsics.checkParameterIsNotNull(vm1, "viewModel1");
        Intrinsics.checkParameterIsNotNull(function1, "block");
        return e.a.a(vm1, function1);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void a(ITEM item, int i2, @Nullable List<Object> list) {
        boolean z;
        JediViewHolderProxy jediViewHolderProxy;
        Object obj;
        boolean z2;
        this.f2290f = i2;
        this.f2286a = item;
        d();
        Collection collection = list;
        boolean z3 = false;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Iterable iterable = list;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (!(next instanceof Pair)) {
                        next = null;
                    }
                    Pair pair = (Pair) next;
                    if (pair != null) {
                        obj = pair.getSecond();
                    } else {
                        obj = null;
                    }
                    if (obj == c.a()) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        break;
                    }
                }
            }
            z3 = true;
            if (!z3) {
                return;
            }
        }
        n();
        com.bytedance.jedi.ext.adapter.internal.d dVar = this.f2289e;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("provider");
        }
        com.bytedance.jedi.ext.adapter.internal.e eVar = dVar.f21490b;
        if (i2 < 0 || i2 >= eVar.f21492a.size()) {
            jediViewHolderProxy = null;
        } else {
            jediViewHolderProxy = eVar.f21492a.get(i2);
        }
        if (jediViewHolderProxy == null) {
            jediViewHolderProxy = (JediViewHolderProxy) dVar.f21489a.invoke();
            dVar.f21490b.a(i2, jediViewHolderProxy);
        }
        if (jediViewHolderProxy != this.g) {
            JediViewHolderProxy jediViewHolderProxy2 = this.g;
            if (jediViewHolderProxy2 != null) {
                com.bytedance.jedi.ext.adapter.internal.d dVar2 = this.f2289e;
                if (dVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("provider");
                }
                jediViewHolderProxy2.a(dVar2.f21491c, null);
            }
            this.g = jediViewHolderProxy;
        }
        com.bytedance.jedi.ext.adapter.internal.d dVar3 = this.f2289e;
        if (dVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("provider");
        }
        jediViewHolderProxy.a(dVar3.f21491c, this);
        m();
    }

    @NotNull
    public final <S extends x> Disposable a(@NotNull JediViewModel<S> jediViewModel, boolean z, boolean z2, @NotNull Function2<? super R, ? super S, Unit> function2) {
        Intrinsics.checkParameterIsNotNull(jediViewModel, "$this$subscribe");
        Intrinsics.checkParameterIsNotNull(function2, "subscriber");
        Intrinsics.checkParameterIsNotNull(jediViewModel, "$this$subscribe");
        Intrinsics.checkParameterIsNotNull(function2, "subscriber");
        return e.a.a(this, jediViewModel, z, z2, function2);
    }

    @NotNull
    public final <S extends x, A> Disposable a(@NotNull JediViewModel<S> jediViewModel, @NotNull KProperty1<S, ? extends A> kProperty1, boolean z, boolean z2, @NotNull Function2<? super R, ? super A, Unit> function2) {
        Intrinsics.checkParameterIsNotNull(jediViewModel, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(kProperty1, "prop1");
        Intrinsics.checkParameterIsNotNull(function2, "subscriber");
        Intrinsics.checkParameterIsNotNull(jediViewModel, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(kProperty1, "prop1");
        Intrinsics.checkParameterIsNotNull(function2, "subscriber");
        return e.a.a(this, jediViewModel, kProperty1, z, z2, function2);
    }

    @NotNull
    public final <S extends x, T> Disposable a(@NotNull JediViewModel<S> jediViewModel, @NotNull KProperty1<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kProperty1, boolean z, boolean z2, @Nullable Function2<? super R, ? super Throwable, Unit> function2, @Nullable Function1<? super R, Unit> function1, @Nullable Function2<? super R, ? super T, Unit> function22) {
        Intrinsics.checkParameterIsNotNull(jediViewModel, "$this$asyncSubscribe");
        Intrinsics.checkParameterIsNotNull(kProperty1, "prop");
        Intrinsics.checkParameterIsNotNull(jediViewModel, "$this$asyncSubscribe");
        Intrinsics.checkParameterIsNotNull(kProperty1, "prop");
        return e.a.a((e<? extends RECEIVER>) this, jediViewModel, kProperty1, z, z2, function2, function1, function22);
    }
}
