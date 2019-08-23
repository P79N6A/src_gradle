package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import java.util.Collection;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public interface bg<E> extends Collection<E> {

    public interface a<E> {
        int getCount();

        E getElement();
    }

    @CanIgnoreReturnValue
    int add(@NullableDecl E e2, int i);

    boolean contains(@NullableDecl Object obj);

    boolean containsAll(Collection<?> collection);

    int count(@NullableDecl @CompatibleWith Object obj);

    Set<E> elementSet();

    Set<a<E>> entrySet();

    @CanIgnoreReturnValue
    int remove(@NullableDecl @CompatibleWith Object obj, int i);

    @CanIgnoreReturnValue
    boolean remove(@NullableDecl Object obj);

    @CanIgnoreReturnValue
    int setCount(E e2, int i);

    @CanIgnoreReturnValue
    boolean setCount(E e2, int i, int i2);

    int size();
}
