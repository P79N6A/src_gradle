package com.amap.api.mapcore2d;

public class am extends bn<bs> {
    am() {
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(bs bsVar) {
        remove((Object) bsVar);
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean b(bs bsVar) {
        if (contains(bsVar)) {
            return false;
        }
        a(bsVar);
        return true;
    }
}
