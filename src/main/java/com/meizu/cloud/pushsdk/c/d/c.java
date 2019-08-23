package com.meizu.cloud.pushsdk.c.d;

import com.meizu.cloud.pushsdk.c.a.a;
import com.meizu.cloud.pushsdk.c.b.b;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

public class c implements d {

    /* renamed from: a  reason: collision with root package name */
    private int f27151a;

    /* renamed from: b  reason: collision with root package name */
    private AtomicLong f27152b = new AtomicLong(0);

    /* renamed from: c  reason: collision with root package name */
    private Map<Long, byte[]> f27153c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    private List<Long> f27154d = new CopyOnWriteArrayList();

    public c(int i) {
        this.f27151a = i;
    }

    public void a(a aVar) {
        b(aVar);
    }

    public boolean a() {
        return true;
    }

    public boolean a(long j) {
        return this.f27154d.remove(Long.valueOf(j)) && this.f27153c.remove(Long.valueOf(j)) != null;
    }

    public long b(a aVar) {
        byte[] a2 = a.a(aVar.a());
        long andIncrement = this.f27152b.getAndIncrement();
        this.f27154d.add(Long.valueOf(andIncrement));
        this.f27153c.put(Long.valueOf(andIncrement), a2);
        return andIncrement;
    }

    public long c() {
        return (long) this.f27154d.size();
    }

    public b d() {
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList = new ArrayList();
        int c2 = (int) c();
        if (c2 > this.f27151a) {
            c2 = this.f27151a;
        }
        for (int i = 0; i < c2; i++) {
            Long l = this.f27154d.get(i);
            if (l != null) {
                com.meizu.cloud.pushsdk.c.a.c cVar = new com.meizu.cloud.pushsdk.c.a.c();
                cVar.a(a.a(this.f27153c.get(l)));
                com.meizu.cloud.pushsdk.c.f.c.c("MemoryStore", " current key " + l + " payload " + cVar, new Object[0]);
                linkedList.add(l);
                arrayList.add(cVar);
            }
        }
        return new b(arrayList, linkedList);
    }
}
