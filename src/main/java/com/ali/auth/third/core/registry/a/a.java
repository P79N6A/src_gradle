package com.ali.auth.third.core.registry.a;

import com.ali.auth.third.core.registry.ServiceRegistration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class a implements com.ali.auth.third.core.registry.a {

    /* renamed from: a  reason: collision with root package name */
    private Map<Class<?>, List<b>> f4933a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Map<ServiceRegistration, b> f4934b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private ReadWriteLock f4935c = new ReentrantReadWriteLock();

    /* renamed from: com.ali.auth.third.core.registry.a.a$a  reason: collision with other inner class name */
    static class C0034a implements ServiceRegistration {

        /* renamed from: a  reason: collision with root package name */
        private final String f4936a = UUID.randomUUID().toString();

        /* renamed from: b  reason: collision with root package name */
        private com.ali.auth.third.core.registry.a f4937b;

        /* renamed from: c  reason: collision with root package name */
        private Map<String, String> f4938c;

        public C0034a(com.ali.auth.third.core.registry.a aVar, Map<String, String> map) {
            this.f4937b = aVar;
            this.f4938c = map;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f4936a.equals(((C0034a) obj).f4936a);
            }
            return false;
        }

        public int hashCode() {
            return (this.f4936a == null ? 0 : this.f4936a.hashCode()) + 31;
        }

        public void setProperties(Map<String, String> map) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    if (!(next.getKey() == null || next.getValue() == null)) {
                        this.f4938c.put(next.getKey(), next.getValue());
                    }
                }
            }
        }

        public void unregister() {
            this.f4937b.a(this);
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        public Class<?>[] f4939a;

        /* renamed from: b  reason: collision with root package name */
        public Object f4940b;

        /* renamed from: c  reason: collision with root package name */
        public Map<String, String> f4941c;

        b() {
        }
    }

    public ServiceRegistration a(Class<?>[] clsArr, Object obj, Map<String, String> map) {
        if (clsArr == null || clsArr.length == 0 || obj == null) {
            throw new IllegalArgumentException("service types and instance must not be null");
        }
        b bVar = new b();
        bVar.f4940b = obj;
        bVar.f4939a = clsArr;
        bVar.f4941c = Collections.synchronizedMap(new HashMap());
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                if (!(next.getKey() == null || next.getValue() == null)) {
                    bVar.f4941c.put(next.getKey(), next.getValue());
                }
            }
        }
        this.f4935c.writeLock().lock();
        try {
            for (Class<?> cls : clsArr) {
                List list = this.f4933a.get(cls);
                if (list == null) {
                    list = new ArrayList(2);
                    this.f4933a.put(cls, list);
                }
                list.add(bVar);
            }
            C0034a aVar = new C0034a(this, bVar.f4941c);
            this.f4934b.put(aVar, bVar);
            return aVar;
        } finally {
            this.f4935c.writeLock().unlock();
        }
    }

    public Object a(ServiceRegistration serviceRegistration) {
        if (serviceRegistration == null) {
            return null;
        }
        this.f4935c.writeLock().lock();
        try {
            b remove = this.f4934b.remove(serviceRegistration);
            if (remove == null) {
                return null;
            }
            if (remove.f4939a != null) {
                for (Class<?> cls : remove.f4939a) {
                    List list = this.f4933a.get(cls);
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (it2.next() == remove) {
                                it2.remove();
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (list.size() == 0) {
                        this.f4933a.remove(cls);
                    }
                }
            }
            Object obj = remove.f4940b;
            this.f4935c.writeLock().unlock();
            return obj;
        } finally {
            this.f4935c.writeLock().unlock();
        }
    }

    public <T> T a(Class<T> cls, Map<String, String> map) {
        Object obj;
        this.f4935c.readLock().lock();
        try {
            List<b> list = this.f4933a.get(cls);
            if (list != null) {
                if (list.size() != 0) {
                    if (map != null) {
                        if (map.size() != 0) {
                            for (b bVar : list) {
                                boolean z = true;
                                Iterator<Map.Entry<String, String>> it2 = map.entrySet().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    Map.Entry next = it2.next();
                                    String str = bVar.f4941c.get(next.getKey());
                                    if (str != null) {
                                        if (!str.equals(next.getValue())) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                z = false;
                                continue;
                                if (z) {
                                    obj = bVar.f4940b;
                                    T cast = cls.cast(obj);
                                    this.f4935c.readLock().unlock();
                                    return cast;
                                }
                            }
                        }
                    }
                    obj = ((b) list.get(0)).f4940b;
                    T cast2 = cls.cast(obj);
                    this.f4935c.readLock().unlock();
                    return cast2;
                }
            }
            return null;
        } finally {
            this.f4935c.readLock().unlock();
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:35:0x00c0=Splitter:B:35:0x00c0, B:28:0x0093=Splitter:B:28:0x0093} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T[] b(java.lang.Class<T> r9, java.util.Map<java.lang.String, java.lang.String> r10) {
        /*
            r8 = this;
            java.util.concurrent.locks.ReadWriteLock r0 = r8.f4935c
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            java.util.Map<java.lang.Class<?>, java.util.List<com.ali.auth.third.core.registry.a.a$b>> r0 = r8.f4933a     // Catch:{ all -> 0x00c9 }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x00c9 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x00c9 }
            r1 = 0
            if (r0 == 0) goto L_0x00c0
            int r2 = r0.size()     // Catch:{ all -> 0x00c9 }
            if (r2 != 0) goto L_0x001c
            goto L_0x00c0
        L_0x001c:
            if (r10 == 0) goto L_0x0093
            int r2 = r10.size()     // Catch:{ all -> 0x00c9 }
            if (r2 != 0) goto L_0x0025
            goto L_0x0093
        L_0x0025:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x00c9 }
            int r3 = r0.size()     // Catch:{ all -> 0x00c9 }
            r2.<init>(r3)     // Catch:{ all -> 0x00c9 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00c9 }
        L_0x0032:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x00c9 }
            if (r3 == 0) goto L_0x0079
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x00c9 }
            com.ali.auth.third.core.registry.a.a$b r3 = (com.ali.auth.third.core.registry.a.a.b) r3     // Catch:{ all -> 0x00c9 }
            java.util.Set r4 = r10.entrySet()     // Catch:{ all -> 0x00c9 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00c9 }
        L_0x0046:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x00c9 }
            if (r5 == 0) goto L_0x006c
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x00c9 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x00c9 }
            java.util.Map<java.lang.String, java.lang.String> r6 = r3.f4941c     // Catch:{ all -> 0x00c9 }
            java.lang.Object r7 = r5.getKey()     // Catch:{ all -> 0x00c9 }
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x00c9 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x00c9 }
            if (r6 == 0) goto L_0x006a
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x00c9 }
            boolean r5 = r6.equals(r5)     // Catch:{ all -> 0x00c9 }
            if (r5 != 0) goto L_0x0046
        L_0x006a:
            r4 = 0
            goto L_0x006d
        L_0x006c:
            r4 = 1
        L_0x006d:
            if (r4 == 0) goto L_0x0032
            java.lang.Object r3 = r3.f4940b     // Catch:{ all -> 0x00c9 }
            java.lang.Object r3 = r9.cast(r3)     // Catch:{ all -> 0x00c9 }
            r2.add(r3)     // Catch:{ all -> 0x00c9 }
            goto L_0x0032
        L_0x0079:
            int r10 = r2.size()     // Catch:{ all -> 0x00c9 }
            java.lang.Object r9 = java.lang.reflect.Array.newInstance(r9, r10)     // Catch:{ all -> 0x00c9 }
            java.lang.Object[] r9 = (java.lang.Object[]) r9     // Catch:{ all -> 0x00c9 }
            java.lang.Object[] r9 = (java.lang.Object[]) r9     // Catch:{ all -> 0x00c9 }
            java.lang.Object[] r9 = r2.toArray(r9)     // Catch:{ all -> 0x00c9 }
        L_0x0089:
            java.util.concurrent.locks.ReadWriteLock r10 = r8.f4935c
            java.util.concurrent.locks.Lock r10 = r10.readLock()
            r10.unlock()
            return r9
        L_0x0093:
            int r10 = r0.size()     // Catch:{ all -> 0x00c9 }
            java.lang.Object r10 = java.lang.reflect.Array.newInstance(r9, r10)     // Catch:{ all -> 0x00c9 }
            java.lang.Object[] r10 = (java.lang.Object[]) r10     // Catch:{ all -> 0x00c9 }
            java.lang.Object[] r10 = (java.lang.Object[]) r10     // Catch:{ all -> 0x00c9 }
            int r2 = r0.size()     // Catch:{ all -> 0x00c9 }
        L_0x00a3:
            if (r1 >= r2) goto L_0x00b6
            java.lang.Object r3 = r0.get(r1)     // Catch:{ all -> 0x00c9 }
            com.ali.auth.third.core.registry.a.a$b r3 = (com.ali.auth.third.core.registry.a.a.b) r3     // Catch:{ all -> 0x00c9 }
            java.lang.Object r3 = r3.f4940b     // Catch:{ all -> 0x00c9 }
            java.lang.Object r3 = r9.cast(r3)     // Catch:{ all -> 0x00c9 }
            r10[r1] = r3     // Catch:{ all -> 0x00c9 }
            int r1 = r1 + 1
            goto L_0x00a3
        L_0x00b6:
            java.util.concurrent.locks.ReadWriteLock r9 = r8.f4935c
            java.util.concurrent.locks.Lock r9 = r9.readLock()
            r9.unlock()
            return r10
        L_0x00c0:
            java.lang.Object r9 = java.lang.reflect.Array.newInstance(r9, r1)     // Catch:{ all -> 0x00c9 }
            java.lang.Object[] r9 = (java.lang.Object[]) r9     // Catch:{ all -> 0x00c9 }
            java.lang.Object[] r9 = (java.lang.Object[]) r9     // Catch:{ all -> 0x00c9 }
            goto L_0x0089
        L_0x00c9:
            r9 = move-exception
            java.util.concurrent.locks.ReadWriteLock r10 = r8.f4935c
            java.util.concurrent.locks.Lock r10 = r10.readLock()
            r10.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.auth.third.core.registry.a.a.b(java.lang.Class, java.util.Map):java.lang.Object[]");
    }
}
