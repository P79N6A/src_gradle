package com.benchmark.bl;

import a.g;
import a.i;

public final /* synthetic */ class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f7489a;

    h(Runnable runnable) {
        this.f7489a = runnable;
    }

    public final Object then(i iVar) {
        Runnable runnable = this.f7489a;
        if (iVar.b() && ((Boolean) iVar.e()).booleanValue() && runnable != null) {
            runnable.run();
        }
        return null;
    }
}
