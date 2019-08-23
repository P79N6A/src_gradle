package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import android.view.View;
import com.swmansion.gesturehandler.b;
import com.swmansion.gesturehandler.e;
import java.util.ArrayList;
import javax.annotation.Nullable;

public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<b> f78817a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<Integer> f78818b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray<ArrayList<b>> f78819c = new SparseArray<>();

    public final synchronized void a() {
        this.f78817a.clear();
        this.f78818b.clear();
        this.f78819c.clear();
    }

    private synchronized ArrayList<b> c(int i) {
        return this.f78819c.get(i);
    }

    @Nullable
    public final synchronized b a(int i) {
        return this.f78817a.get(i);
    }

    public final synchronized ArrayList<b> a(View view) {
        return c(view.getId());
    }

    public final synchronized void b(int i) {
        b bVar = this.f78817a.get(i);
        if (bVar != null) {
            b(bVar);
            this.f78817a.remove(i);
        }
    }

    private synchronized void b(b bVar) {
        Integer num = this.f78818b.get(bVar.f78772e);
        if (num != null) {
            this.f78818b.remove(bVar.f78772e);
            ArrayList arrayList = this.f78819c.get(num.intValue());
            if (arrayList != null) {
                arrayList.remove(bVar);
                if (arrayList.size() == 0) {
                    this.f78819c.remove(num.intValue());
                }
            }
        }
        if (bVar.f78773f != null) {
            bVar.c();
        }
    }

    public final synchronized void a(b bVar) {
        this.f78817a.put(bVar.f78772e, bVar);
    }

    private synchronized void a(int i, b bVar) {
        if (this.f78818b.get(bVar.f78772e) == null) {
            this.f78818b.put(bVar.f78772e, Integer.valueOf(i));
            ArrayList arrayList = this.f78819c.get(i);
            if (arrayList == null) {
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add(bVar);
                this.f78819c.put(i, arrayList2);
                return;
            }
            arrayList.add(bVar);
            return;
        }
        throw new IllegalStateException("Handler " + bVar + " already attached");
    }

    public final synchronized boolean a(int i, int i2) {
        b bVar = this.f78817a.get(i);
        if (bVar == null) {
            return false;
        }
        b(bVar);
        a(i2, bVar);
        return true;
    }
}
