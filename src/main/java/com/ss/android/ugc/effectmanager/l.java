package com.ss.android.ugc.effectmanager;

import a.i;
import com.ss.android.ugc.effectmanager.common.g;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    final g<i<n>> f77515a;

    /* renamed from: b  reason: collision with root package name */
    volatile k f77516b;

    public final synchronized k a() {
        if (this.f77516b == null) {
            i iVar = (i) this.f77515a.a();
            try {
                iVar.g();
                if (!iVar.d()) {
                    this.f77516b = ((n) iVar.e()).a();
                    if (this.f77516b == null) {
                        throw new RuntimeException("config == null");
                    }
                } else {
                    throw new RuntimeException(iVar.f());
                }
            } catch (InterruptedException e2) {
                throw new RuntimeException(e2);
            }
        }
        return this.f77516b;
    }

    public l(g<i<n>> gVar) {
        this.f77515a = gVar;
    }
}
