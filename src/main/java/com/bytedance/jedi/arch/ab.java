package com.bytedance.jedi.arch;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/bytedance/jedi/arch/Tuple1;", "A", "", "a", "(Ljava/lang/Object;)V", "getA", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/bytedance/jedi/arch/Tuple1;", "equals", "", "other", "hashCode", "", "toString", "", "arch_release"}, k = 1, mv = {1, 1, 15})
public final class ab<A> {

    /* renamed from: a  reason: collision with root package name */
    public final A f21343a;

    public final boolean equals(@Nullable Object obj) {
        return this == obj || ((obj instanceof ab) && Intrinsics.areEqual((Object) this.f21343a, (Object) ((ab) obj).f21343a));
    }

    public final int hashCode() {
        A a2 = this.f21343a;
        if (a2 != null) {
            return a2.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        return "Tuple1(a=" + this.f21343a + ")";
    }

    public ab(A a2) {
        this.f21343a = a2;
    }
}
