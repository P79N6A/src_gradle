package com.bytedance.jedi.arch;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0006\u001a\u00028\u0000HÂ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u000e\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0010\u0010\u0003\u001a\u00028\u0000X\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/bytedance/jedi/arch/Success;", "T", "Lcom/bytedance/jedi/arch/Async;", "value", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/bytedance/jedi/arch/Success;", "equals", "", "other", "", "hashCode", "", "invoke", "toString", "", "arch_release"}, k = 1, mv = {1, 1, 15})
public final class aa<T> extends a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f21342a;

    public final boolean equals(@Nullable Object obj) {
        return this == obj || ((obj instanceof aa) && Intrinsics.areEqual((Object) this.f21342a, (Object) ((aa) obj).f21342a));
    }

    public final int hashCode() {
        T t = this.f21342a;
        if (t != null) {
            return t.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        return "Success(value=" + this.f21342a + ")";
    }

    public final T a() {
        return this.f21342a;
    }

    public aa(T t) {
        super((byte) 0);
        this.f21342a = t;
    }
}
