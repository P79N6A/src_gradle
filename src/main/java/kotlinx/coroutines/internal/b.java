package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0013\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u000eJ\b\u0010\u0012\u001a\u00020\u000eH\u0002J\r\u0010\u0013\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0014R\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005X\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u000e\u0010\f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/internal/ArrayQueue;", "T", "", "()V", "elements", "", "[Ljava/lang/Object;", "head", "", "isEmpty", "", "()Z", "tail", "addLast", "", "element", "(Ljava/lang/Object;)V", "clear", "ensureCapacity", "removeFirstOrNull", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class b<T> {

    /* renamed from: a  reason: collision with root package name */
    private Object[] f83916a = new Object[16];

    /* renamed from: b  reason: collision with root package name */
    private int f83917b;

    /* renamed from: c  reason: collision with root package name */
    private int f83918c;

    public final boolean a() {
        if (this.f83917b == this.f83918c) {
            return true;
        }
        return false;
    }

    private final void c() {
        int length = this.f83916a.length;
        Object[] objArr = new Object[(length << 1)];
        int length2 = this.f83916a.length - this.f83917b;
        a.a(this.f83916a, this.f83917b, objArr, 0, length2);
        a.a(this.f83916a, 0, objArr, length2, this.f83917b);
        this.f83916a = objArr;
        this.f83917b = 0;
        this.f83918c = length;
    }

    @Nullable
    public final T b() {
        if (this.f83917b == this.f83918c) {
            return null;
        }
        T t = this.f83916a[this.f83917b];
        this.f83916a[this.f83917b] = null;
        this.f83917b = (this.f83917b + 1) & (this.f83916a.length - 1);
        if (t != null) {
            return t;
        }
        throw new TypeCastException("null cannot be cast to non-null type T");
    }

    public final void a(@NotNull T t) {
        Intrinsics.checkParameterIsNotNull(t, "element");
        this.f83916a[this.f83918c] = t;
        this.f83918c = (this.f83918c + 1) & (this.f83916a.length - 1);
        if (this.f83918c == this.f83917b) {
            c();
        }
    }
}
