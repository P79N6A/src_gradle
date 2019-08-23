package org.greenrobot.eventbus.a;

import org.greenrobot.eventbus.n;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private final e[] f84085a;

    public final synchronized n[] c() {
        n[] nVarArr;
        int length = this.f84085a.length;
        nVarArr = new n[length];
        for (int i = 0; i < length; i++) {
            e eVar = this.f84085a[i];
            nVarArr[i] = a(eVar.f84086a, eVar.f84088c, eVar.f84087b, eVar.f84089d, eVar.f84090e);
        }
        return nVarArr;
    }

    public b(Class cls, boolean z, e[] eVarArr) {
        super(cls, null, true);
        this.f84085a = eVarArr;
    }
}
