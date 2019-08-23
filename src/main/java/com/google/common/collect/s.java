package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
public final class s extends aj<Object, Object> {

    /* renamed from: a  reason: collision with root package name */
    static final s f24806a = new s();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f24806a;
    }

    private s() {
        super(ak.of(), 0);
    }
}
