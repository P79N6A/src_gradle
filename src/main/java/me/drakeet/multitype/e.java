package me.drakeet.multitype;

import android.support.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

public final class e implements i {
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    private final List<Class<?>> f83978a = new ArrayList();
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final List<c<?, ?>> f83979b = new ArrayList();
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    private final List<d<?>> f83980c = new ArrayList();

    @NonNull
    public final c<?, ?> a(int i) {
        return this.f83979b.get(i);
    }

    @NonNull
    public final d<?> b(int i) {
        return this.f83980c.get(i);
    }

    public final boolean a(@NonNull Class<?> cls) {
        boolean z = false;
        while (true) {
            int indexOf = this.f83978a.indexOf(cls);
            if (indexOf == -1) {
                return z;
            }
            this.f83978a.remove(indexOf);
            this.f83979b.remove(indexOf);
            this.f83980c.remove(indexOf);
            z = true;
        }
    }

    public final int b(@NonNull Class<?> cls) {
        int indexOf = this.f83978a.indexOf(cls);
        if (indexOf != -1) {
            return indexOf;
        }
        for (int i = 0; i < this.f83978a.size(); i++) {
            if (this.f83978a.get(i).isAssignableFrom(cls)) {
                return i;
            }
        }
        return -1;
    }

    public final <T> void a(@NonNull Class<? extends T> cls, @NonNull c<T, ?> cVar, @NonNull d<T> dVar) {
        this.f83978a.add(cls);
        this.f83979b.add(cVar);
        this.f83980c.add(dVar);
    }
}
