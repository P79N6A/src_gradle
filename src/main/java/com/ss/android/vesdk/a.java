package com.ss.android.vesdk;

import android.support.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

public final class a<E> {

    /* renamed from: a  reason: collision with root package name */
    private List<E> f77861a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private boolean f77862b = false;

    /* renamed from: c  reason: collision with root package name */
    private List<E> f77863c = new ArrayList();

    public final synchronized boolean a() {
        return this.f77861a.isEmpty();
    }

    public final synchronized List<E> b() {
        if (this.f77862b) {
            this.f77863c = new ArrayList(this.f77861a.size());
            for (E add : this.f77861a) {
                this.f77863c.add(add);
            }
            this.f77862b = false;
        }
        return this.f77863c;
    }

    public final synchronized boolean b(E e2) {
        this.f77862b = true;
        return this.f77861a.remove(e2);
    }

    public final synchronized boolean a(@NonNull E e2) {
        this.f77862b = true;
        return this.f77861a.add(e2);
    }
}
