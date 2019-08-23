package com.bytedance.jedi.arch.ext.list;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u000e\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/bytedance/jedi/arch/ext/list/Payload;", "", "hasMore", "", "cursor", "", "(ZI)V", "getCursor", "()I", "Lcom/bytedance/jedi/arch/ext/list/DistinctBoolean;", "getHasMore", "()Lcom/bytedance/jedi/arch/ext/list/DistinctBoolean;", "equals", "other", "hashCode", "ext_list_release"}, k = 1, mv = {1, 1, 15})
public class k {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final b f21387a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21388b;

    public k() {
        this(false, 0, 3);
    }

    public int hashCode() {
        return (this.f21387a.hashCode() * 31) + this.f21388b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!(!Intrinsics.areEqual((Object) this.f21387a, (Object) kVar.f21387a)) && this.f21388b == kVar.f21388b) {
            return true;
        }
        return false;
    }

    public k(boolean z, int i) {
        this.f21388b = i;
        this.f21387a = new b(z);
    }

    public /* synthetic */ k(boolean z, int i, int i2) {
        this(true, 0);
    }
}
