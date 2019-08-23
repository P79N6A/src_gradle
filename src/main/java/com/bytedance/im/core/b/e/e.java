package com.bytedance.im.core.b.e;

import com.bytedance.im.core.d.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class e extends ArrayList<n> {
    public e() {
    }

    public e(Collection<? extends n> collection) {
        super(collection);
    }

    public final boolean update(n nVar) {
        int indexOf = indexOf(nVar);
        if (indexOf < 0) {
            return false;
        }
        set(indexOf, nVar);
        return true;
    }

    private static boolean a(n nVar) {
        if (nVar == null || nVar.isDeleted() || nVar.getSvrStatus() != 0) {
            return false;
        }
        return true;
    }

    public final boolean add(n nVar) {
        int indexOf = indexOf(nVar);
        if (indexOf < 0) {
            super.add((-indexOf) - 1, nVar);
        } else {
            set(indexOf, nVar);
        }
        return true;
    }

    public final void addList(List<n> list) {
        if (list != null && !list.isEmpty()) {
            for (n next : list) {
                if (a(next)) {
                    add(next);
                }
            }
        }
    }

    public final void appendList(List<n> list) {
        if (list != null && !list.isEmpty()) {
            for (n next : list) {
                if (a(next)) {
                    int indexOf = indexOf(next);
                    if (indexOf < 0) {
                        super.add(next);
                    } else {
                        set(indexOf, next);
                    }
                }
            }
        }
    }

    public final void updateList(List<n> list) {
        if (list != null && !list.isEmpty()) {
            for (n next : list) {
                if (a(next)) {
                    update(next);
                }
            }
        }
    }
}
