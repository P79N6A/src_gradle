package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.l;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/jvm/internal/ArrayByteIterator;", "Lkotlin/collections/ByteIterator;", "array", "", "([B)V", "index", "", "hasNext", "", "nextByte", "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
public final class b extends l {

    /* renamed from: a  reason: collision with root package name */
    private int f83578a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f83579b;

    public final boolean hasNext() {
        if (this.f83578a < this.f83579b.length) {
            return true;
        }
        return false;
    }

    public final byte a() {
        try {
            byte[] bArr = this.f83579b;
            int i = this.f83578a;
            this.f83578a = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f83578a--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public b(@NotNull byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, "array");
        this.f83579b = bArr;
    }
}
