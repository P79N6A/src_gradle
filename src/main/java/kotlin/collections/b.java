package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH$J\b\u0010\n\u001a\u00020\tH\u0004J\t\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\fH\u0002R\u0012\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlin/collections/AbstractIterator;", "T", "", "()V", "nextValue", "Ljava/lang/Object;", "state", "Lkotlin/collections/State;", "computeNext", "", "done", "hasNext", "", "next", "()Ljava/lang/Object;", "setNext", "value", "(Ljava/lang/Object;)V", "tryToComputeNext", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
public abstract class b<T> implements Iterator<T>, a {

    /* renamed from: a  reason: collision with root package name */
    private az f83447a = az.NotReady;

    /* renamed from: b  reason: collision with root package name */
    private T f83448b;

    /* access modifiers changed from: protected */
    public abstract void a();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.f83447a = az.Done;
    }

    public T next() {
        if (hasNext()) {
            this.f83447a = az.NotReady;
            return this.f83448b;
        }
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        boolean z;
        if (this.f83447a != az.Failed) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            switch (c.f83449a[this.f83447a.ordinal()]) {
                case 1:
                    return false;
                case 2:
                    return true;
                default:
                    this.f83447a = az.Failed;
                    a();
                    if (this.f83447a == az.Ready) {
                        return true;
                    }
                    return false;
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* access modifiers changed from: protected */
    public final void a(T t) {
        this.f83448b = t;
        this.f83447a = az.Ready;
    }
}
