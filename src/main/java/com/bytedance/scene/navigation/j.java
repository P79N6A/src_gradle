package com.bytedance.scene.navigation;

import java.util.ArrayList;
import java.util.List;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    List<i> f22196a = new ArrayList();

    public final List<i> c() {
        return new ArrayList(this.f22196a);
    }

    j() {
    }

    public final boolean b() {
        if (this.f22196a.size() > 1) {
            return true;
        }
        return false;
    }

    public final i a() {
        if (this.f22196a.size() > 0) {
            return this.f22196a.get(this.f22196a.size() - 1);
        }
        return null;
    }

    public final void a(i iVar) {
        this.f22196a.remove(iVar);
    }
}
