package com.bytedance.jedi.arch;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/bytedance/jedi/arch/Fail;", "T", "Lcom/bytedance/jedi/arch/Async;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "arch_release"}, k = 1, mv = {1, 1, 15})
public final class c<T> extends a<T> {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f21347a;

    @NotNull
    public final String toString() {
        return "Fail(error=" + this.f21347a + ")";
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Reflection.getOrCreateKotlinClass(this.f21347a.getClass()), this.f21347a.getMessage(), this.f21347a.getStackTrace()[0]});
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(@NotNull Throwable th) {
        super((byte) 0);
        Intrinsics.checkParameterIsNotNull(th, "error");
        this.f21347a = th;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        Throwable th = ((c) obj).f21347a;
        if (!Intrinsics.areEqual((Object) Reflection.getOrCreateKotlinClass(this.f21347a.getClass()), (Object) Reflection.getOrCreateKotlinClass(th.getClass())) || !Intrinsics.areEqual((Object) this.f21347a.getMessage(), (Object) th.getMessage()) || !Intrinsics.areEqual((Object) this.f21347a.getStackTrace()[0], (Object) th.getStackTrace()[0])) {
            return false;
        }
        return true;
    }
}
