package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
public final class t extends as<Object, Object> {

    /* renamed from: a  reason: collision with root package name */
    static final t f24807a = new t();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f24807a;
    }

    private t() {
        super(ak.of(), 0, null);
    }
}
