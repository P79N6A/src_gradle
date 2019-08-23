package com.bytedance.jedi.arch;

import android.support.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JM\u0010\u0005\u001a\u0004\u0018\u0001H\u0006\"\b\b\u0000\u0010\u0007*\u00020\b\"\u000e\b\u0001\u0010\t*\b\u0012\u0004\u0012\u0002H\u00070\n\"\u0014\b\u0002\u0010\u0006*\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\t0\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\t0\rH\u0016¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bytedance/jedi/arch/MiddlewareBindingFactoryReflectImpl;", "Lcom/bytedance/jedi/arch/MiddlewareBindingFactory;", "()V", "isFirstTimeCreated", "", "create", "T", "S", "Lcom/bytedance/jedi/arch/State;", "VM", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/bytedance/jedi/arch/MiddlewareBinding;", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/bytedance/jedi/arch/MiddlewareBinding;", "arch_release"}, k = 1, mv = {1, 1, 15})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class p implements o {

    /* renamed from: a  reason: collision with root package name */
    private boolean f21403a = true;

    @Nullable
    public final <S extends x, VM extends JediViewModel<S>, T extends n<S, VM>> T a(@NotNull Class<VM> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        try {
            String str = cls.getName() + "_MiddlewareBinding";
            if (!this.f21403a) {
                return null;
            }
            T newInstance = Class.forName(str).newInstance();
            if (!(newInstance instanceof n)) {
                newInstance = null;
            }
            T t = (n) newInstance;
            if (t == null) {
                return null;
            }
            this.f21403a = false;
            return t;
        } catch (Exception unused) {
            return null;
        }
    }
}
