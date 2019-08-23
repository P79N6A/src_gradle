package com.facebook.imagepipeline.cache;

import com.facebook.common.internal.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public final class f<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final s<V> f23866a;
    @GuardedBy

    /* renamed from: b  reason: collision with root package name */
    private final LinkedHashMap<K, V> f23867b = new LinkedHashMap<>();
    @GuardedBy

    /* renamed from: c  reason: collision with root package name */
    private int f23868c = 0;

    public final synchronized int getSizeInBytes() {
        return this.f23868c;
    }

    public final synchronized int getCount() {
        return this.f23867b.size();
    }

    public final synchronized ArrayList<V> clear() {
        ArrayList<V> arrayList;
        arrayList = new ArrayList<>(this.f23867b.values());
        this.f23867b.clear();
        this.f23868c = 0;
        return arrayList;
    }

    @Nullable
    public final synchronized K getFirstKey() {
        if (this.f23867b.isEmpty()) {
            return null;
        }
        return this.f23867b.keySet().iterator().next();
    }

    public f(s<V> sVar) {
        this.f23866a = sVar;
    }

    private int a(V v) {
        if (v == null) {
            return 0;
        }
        return this.f23866a.getSizeInBytes(v);
    }

    public final synchronized boolean contains(K k) {
        return this.f23867b.containsKey(k);
    }

    @Nullable
    public final synchronized V get(K k) {
        return this.f23867b.get(k);
    }

    @Nullable
    public final synchronized V remove(K k) {
        V remove;
        remove = this.f23867b.remove(k);
        this.f23868c -= a(remove);
        return remove;
    }

    public final synchronized ArrayList<Map.Entry<K, V>> getMatchingEntries(@Nullable i<K> iVar) {
        ArrayList<Map.Entry<K, V>> arrayList;
        arrayList = new ArrayList<>(this.f23867b.entrySet().size());
        for (Map.Entry next : this.f23867b.entrySet()) {
            if (iVar == null || iVar.apply(next.getKey())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final synchronized ArrayList<V> removeAll(@Nullable i<K> iVar) {
        ArrayList<V> arrayList;
        arrayList = new ArrayList<>();
        Iterator<Map.Entry<K, V>> it2 = this.f23867b.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry next = it2.next();
            if (iVar == null || iVar.apply(next.getKey())) {
                arrayList.add(next.getValue());
                this.f23868c -= a(next.getValue());
                it2.remove();
            }
        }
        return arrayList;
    }

    @Nullable
    public final synchronized V put(K k, V v) {
        V remove;
        remove = this.f23867b.remove(k);
        this.f23868c -= a(remove);
        this.f23867b.put(k, v);
        this.f23868c += a(v);
        return remove;
    }
}
