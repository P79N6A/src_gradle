package com.bytedance.jedi.arch;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.support.annotation.RestrictTo;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u00032\u00020\u0004B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00028\u00008VX\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/bytedance/jedi/arch/lifecycleAwareLazy;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Landroid/arch/lifecycle/LifecycleObserver;", "owner", "Landroid/arch/lifecycle/LifecycleOwner;", "initializer", "Lkotlin/Function0;", "(Landroid/arch/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;)V", "_value", "", "lock", "value", "value$annotations", "()V", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "onStart", "", "toString", "", "arch_release"}, k = 1, mv = {1, 1, 15})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class lifecycleAwareLazy<T> implements LifecycleObserver, Serializable, Lazy<T> {
    private volatile Object _value = ac.f21344a;
    private Function0<? extends T> initializer;
    private final lifecycleAwareLazy<T> lock = this;
    private final LifecycleOwner owner;

    public static /* synthetic */ void value$annotations() {
    }

    public final boolean isInitialized() {
        if (this._value != ac.f21344a) {
            return true;
        }
        return false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onStart() {
        if (!isInitialized()) {
            getValue();
        }
        this.owner.getLifecycle().removeObserver(this);
    }

    @NotNull
    public final String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }

    public final T getValue() {
        T t;
        T t2 = this._value;
        if (t2 != ac.f21344a) {
            return t2;
        }
        synchronized (this.lock) {
            t = this._value;
            if (t == ac.f21344a) {
                Function0<? extends T> function0 = this.initializer;
                if (function0 == null) {
                    Intrinsics.throwNpe();
                }
                t = function0.invoke();
                this._value = t;
                this.initializer = null;
            }
        }
        return t;
    }

    public lifecycleAwareLazy(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function0<? extends T> function0) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        Intrinsics.checkParameterIsNotNull(function0, "initializer");
        this.owner = lifecycleOwner;
        this.initializer = function0;
        this.owner.getLifecycle().addObserver(this);
    }
}
