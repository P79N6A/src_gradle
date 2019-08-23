package com.facebook.cache.disk;

import android.os.Build;
import android.os.StatFs;
import com.facebook.binaryresource.BinaryResource;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.f;
import com.facebook.cache.disk.c;
import com.facebook.common.d.a;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.logging.FLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class d implements FileCache {

    /* renamed from: e  reason: collision with root package name */
    private static final Class<?> f23468e = d.class;

    /* renamed from: f  reason: collision with root package name */
    private static final long f23469f = TimeUnit.HOURS.toMillis(2);
    private static final long g = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    public final CountDownLatch f23470a;
    @GuardedBy
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    final Set<String> f23471b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f23472c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public boolean f23473d;
    private final long h;
    private final long i;
    private long j;
    private final CacheEventListener k;
    private long l;
    private final long m;
    private final com.facebook.common.d.a n;
    private final c o;
    private final g p;
    private final com.facebook.cache.common.a q;
    private final boolean r;
    private final a s;
    private final com.facebook.common.time.a t;

    @VisibleForTesting
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f23475a;

        /* renamed from: b  reason: collision with root package name */
        private long f23476b = -1;

        /* renamed from: c  reason: collision with root package name */
        private long f23477c = -1;

        public final synchronized boolean a() {
            return this.f23475a;
        }

        public final synchronized long c() {
            return this.f23476b;
        }

        public final synchronized long d() {
            return this.f23477c;
        }

        a() {
        }

        public final synchronized void b() {
            this.f23475a = false;
            this.f23477c = -1;
            this.f23476b = -1;
        }

        public final synchronized void a(long j, long j2) {
            this.f23477c = j2;
            this.f23476b = j;
            this.f23475a = true;
        }

        public final synchronized void b(long j, long j2) {
            if (this.f23475a) {
                this.f23476b += j;
                this.f23477c += j2;
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final long f23478a;

        /* renamed from: b  reason: collision with root package name */
        public final long f23479b;

        /* renamed from: c  reason: collision with root package name */
        public final long f23480c;

        public b(long j, long j2, long j3) {
            this.f23478a = j;
            this.f23479b = j2;
            this.f23480c = j3;
        }
    }

    public long getCount() {
        return this.s.d();
    }

    public c.a getDumpInfo() throws IOException {
        return this.o.e();
    }

    public long getSize() {
        return this.s.c();
    }

    public boolean isEnabled() {
        return this.o.a();
    }

    @GuardedBy
    public final boolean a() {
        long a2 = this.t.a();
        if (!this.s.a() || this.l == -1 || a2 - this.l > g) {
            return b();
        }
        return false;
    }

    public void clearAll() {
        synchronized (this.f23472c) {
            try {
                this.o.d();
                this.f23471b.clear();
                this.k.onCleared();
            } catch (IOException | NullPointerException e2) {
                new StringBuilder("clearAll: ").append(e2.getMessage());
            }
            this.s.b();
        }
    }

    @GuardedBy
    private boolean b() {
        Set<String> set;
        long a2 = this.t.a();
        long j2 = f23469f + a2;
        if (this.r && this.f23471b.isEmpty()) {
            set = this.f23471b;
        } else if (this.r) {
            set = new HashSet<>();
        } else {
            set = null;
        }
        try {
            Iterator<c.C0253c> it2 = this.o.f().iterator();
            int i2 = 0;
            int i3 = 0;
            boolean z = false;
            int i4 = 0;
            long j3 = -1;
            long j4 = 0;
            while (it2.hasNext()) {
                c.C0253c next = it2.next();
                i4++;
                j4 += next.c();
                if (next.b() > j2) {
                    i2++;
                    i3 = (int) (((long) i3) + next.c());
                    j3 = Math.max(next.b() - a2, j3);
                    it2 = it2;
                    z = true;
                } else {
                    Iterator<c.C0253c> it3 = it2;
                    if (this.r) {
                        set.add(next.a());
                    }
                    it2 = it3;
                }
            }
            if (z) {
                StringBuilder sb = new StringBuilder("Future timestamp found in ");
                sb.append(i2);
                sb.append(" files , with a total size of ");
                sb.append(i3);
                sb.append(" bytes, and a maximum time delta of ");
                sb.append(j3);
                sb.append("ms");
            }
            long j5 = (long) i4;
            if (!(this.s.d() == j5 && this.s.c() == j4)) {
                if (this.r && this.f23471b != set) {
                    this.f23471b.clear();
                    this.f23471b.addAll(set);
                }
                this.s.a(j4, j5);
            }
            this.l = a2;
            return true;
        } catch (IOException e2) {
            new StringBuilder("calcFileCacheSize: ").append(e2.getMessage());
            return false;
        }
    }

    public boolean hasKey(CacheKey cacheKey) {
        synchronized (this.f23472c) {
            if (hasKeySync(cacheKey)) {
                return true;
            }
            try {
                List<String> a2 = com.facebook.cache.common.b.a(cacheKey);
                for (int i2 = 0; i2 < a2.size(); i2++) {
                    String str = a2.get(i2);
                    if (this.o.c(str, cacheKey)) {
                        this.f23471b.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    public boolean hasKeySync(CacheKey cacheKey) {
        synchronized (this.f23472c) {
            List<String> a2 = com.facebook.cache.common.b.a(cacheKey);
            for (int i2 = 0; i2 < a2.size(); i2++) {
                if (this.f23471b.contains(a2.get(i2))) {
                    return true;
                }
            }
            return false;
        }
    }

    public void remove(CacheKey cacheKey) {
        synchronized (this.f23472c) {
            try {
                List<String> a2 = com.facebook.cache.common.b.a(cacheKey);
                for (int i2 = 0; i2 < a2.size(); i2++) {
                    String str = a2.get(i2);
                    this.o.b(str);
                    this.f23471b.remove(str);
                }
            } catch (IOException e2) {
                new StringBuilder("delete: ").append(e2.getMessage());
            }
        }
    }

    private Collection<c.C0253c> a(Collection<c.C0253c> collection) {
        long a2 = this.t.a() + f23469f;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (c.C0253c next : collection) {
            if (next.b() > a2) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        Collections.sort(arrayList2, this.p.a());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public BinaryResource getResource(CacheKey cacheKey) {
        BinaryResource binaryResource;
        h a2 = h.a().a(cacheKey);
        try {
            synchronized (this.f23472c) {
                List<String> a3 = com.facebook.cache.common.b.a(cacheKey);
                String str = null;
                binaryResource = null;
                for (int i2 = 0; i2 < a3.size(); i2++) {
                    str = a3.get(i2);
                    a2.a(str);
                    binaryResource = this.o.b(str, cacheKey);
                    if (binaryResource != null) {
                        break;
                    }
                }
                if (binaryResource == null) {
                    this.k.onMiss(a2);
                    this.f23471b.remove(str);
                } else {
                    this.k.onHit(a2);
                    this.f23471b.add(str);
                }
            }
            a2.b();
            return binaryResource;
        } catch (IOException e2) {
            try {
                a2.a(e2);
                this.k.onReadException(a2);
                return null;
            } finally {
                a2.b();
            }
        }
    }

    public boolean probe(CacheKey cacheKey) {
        String str;
        String str2 = null;
        try {
            synchronized (this.f23472c) {
                try {
                    List<String> a2 = com.facebook.cache.common.b.a(cacheKey);
                    String str3 = null;
                    int i2 = 0;
                    while (i2 < a2.size()) {
                        try {
                            String str4 = a2.get(i2);
                            try {
                                if (this.o.d(str4, cacheKey)) {
                                    this.f23471b.add(str4);
                                    return true;
                                }
                                i2++;
                                str3 = str4;
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    throw th;
                                } catch (IOException e2) {
                                    e = e2;
                                    str2 = str;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            str = str3;
                            throw th;
                        }
                    }
                    return false;
                } catch (Throwable th3) {
                    str = null;
                    th = th3;
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            h a3 = h.a().a(cacheKey).a(str2).a(e);
            this.k.onReadException(a3);
            a3.b();
            return false;
        }
    }

    public long clearOldEntries(long j2) {
        long j3;
        Iterator<c.C0253c> it2;
        synchronized (this.f23472c) {
            try {
                long a2 = this.t.a();
                Collection<c.C0253c> f2 = this.o.f();
                long c2 = this.s.c();
                int i2 = 0;
                Iterator<c.C0253c> it3 = f2.iterator();
                long j4 = 0;
                j3 = 0;
                while (it3.hasNext()) {
                    try {
                        c.C0253c next = it3.next();
                        long j5 = a2;
                        long max = Math.max(1, Math.abs(a2 - next.b()));
                        if (max >= j2) {
                            long a3 = this.o.a(next);
                            it2 = it3;
                            this.f23471b.remove(next.a());
                            if (a3 > 0) {
                                i2++;
                                j4 += a3;
                                h b2 = h.a().a(next.a()).a(CacheEventListener.a.CONTENT_STALE).a(a3).b(c2 - j4);
                                this.k.onEviction(b2);
                                b2.b();
                            }
                        } else {
                            it2 = it3;
                            j3 = Math.max(j3, max);
                        }
                        a2 = j5;
                        it3 = it2;
                    } catch (IOException e2) {
                        e = e2;
                        new StringBuilder("clearOldEntries: ").append(e.getMessage());
                        return j3;
                    }
                }
                this.o.c();
                if (i2 > 0) {
                    a();
                    this.s.b(-j4, (long) (-i2));
                }
            } catch (IOException e3) {
                e = e3;
                j3 = 0;
                new StringBuilder("clearOldEntries: ").append(e.getMessage());
                return j3;
            }
        }
        return j3;
    }

    public BinaryResource insert(CacheKey cacheKey, f fVar) throws IOException {
        String b2;
        c.d a2;
        h a3 = h.a().a(cacheKey);
        this.k.onWriteAttempt(a3);
        synchronized (this.f23472c) {
            b2 = com.facebook.cache.common.b.b(cacheKey);
        }
        a3.a(b2);
        try {
            a2 = a(b2, cacheKey);
            a2.a(fVar);
            BinaryResource a4 = a(a2, cacheKey, b2);
            a3.a(a4.size()).b(this.s.c());
            this.k.onWriteSuccess(a3);
            if (!a2.b()) {
                FLog.e(f23468e, "Failed to delete temp file");
            }
            a3.b();
            return a4;
        } catch (IOException e2) {
            try {
                a3.a(e2);
                this.k.onWriteException(a3);
                FLog.e(f23468e, "Failed inserting a file into the cache", (Throwable) e2);
                throw e2;
            } catch (Throwable th) {
                a3.b();
                throw th;
            }
        } catch (Throwable th2) {
            if (!a2.b()) {
                FLog.e(f23468e, "Failed to delete temp file");
            }
            throw th2;
        }
    }

    private c.d a(String str, CacheKey cacheKey) throws IOException {
        a.C0255a aVar;
        StatFs statFs;
        long j2;
        long j3;
        long j4;
        synchronized (this.f23472c) {
            boolean a2 = a();
            if (this.o.b()) {
                aVar = a.C0255a.EXTERNAL;
            } else {
                aVar = a.C0255a.INTERNAL;
            }
            com.facebook.common.d.a aVar2 = this.n;
            long c2 = this.i - this.s.c();
            aVar2.b();
            aVar2.b();
            aVar2.c();
            if (aVar == a.C0255a.INTERNAL) {
                statFs = aVar2.f23502a;
            } else {
                statFs = aVar2.f23503b;
            }
            if (statFs != null) {
                if (Build.VERSION.SDK_INT >= 18) {
                    j3 = statFs.getBlockSizeLong();
                    j4 = statFs.getAvailableBlocksLong();
                } else {
                    j3 = (long) statFs.getBlockSize();
                    j4 = (long) statFs.getAvailableBlocks();
                }
                j2 = j4 * j3;
            } else {
                j2 = 0;
            }
            boolean z = true;
            if (j2 > 0) {
                if (j2 >= c2) {
                    z = false;
                }
            }
            if (z) {
                this.j = this.h;
            } else {
                this.j = this.i;
            }
            long c3 = this.s.c();
            if (c3 > this.j && !a2) {
                this.s.b();
                a();
            }
            if (c3 > this.j) {
                a((this.j * 9) / 10, CacheEventListener.a.CACHE_FULL);
            }
        }
        return this.o.a(str, cacheKey);
    }

    @GuardedBy
    private void a(long j2, CacheEventListener.a aVar) throws IOException {
        long j3 = j2;
        try {
            Collection<c.C0253c> a2 = a(this.o.f());
            long c2 = this.s.c();
            long j4 = c2 - j3;
            int i2 = 0;
            long j5 = 0;
            for (c.C0253c next : a2) {
                if (j5 > j4) {
                    break;
                }
                long a3 = this.o.a(next);
                this.f23471b.remove(next.a());
                if (a3 > 0) {
                    i2++;
                    j5 += a3;
                    h c3 = h.a().a(next.a()).a(aVar).a(a3).b(c2 - j5).c(j3);
                    this.k.onEviction(c3);
                    c3.b();
                } else {
                    CacheEventListener.a aVar2 = aVar;
                }
            }
            this.s.b(-j5, (long) (-i2));
            this.o.c();
        } catch (IOException e2) {
            new StringBuilder("evictAboveSize: ").append(e2.getMessage());
            throw e2;
        }
    }

    private BinaryResource a(c.d dVar, CacheKey cacheKey, String str) throws IOException {
        BinaryResource a2;
        synchronized (this.f23472c) {
            a2 = dVar.a();
            this.f23471b.add(str);
            this.s.b(a2.size(), 1);
        }
        return a2;
    }

    public d(c cVar, g gVar, b bVar, CacheEventListener cacheEventListener, com.facebook.cache.common.a aVar, @Nullable com.facebook.common.a.a aVar2, Executor executor, boolean z) {
        this.h = bVar.f23479b;
        this.i = bVar.f23480c;
        this.j = bVar.f23480c;
        this.n = com.facebook.common.d.a.a();
        this.o = cVar;
        this.p = gVar;
        this.l = -1;
        this.k = cacheEventListener;
        this.m = bVar.f23478a;
        this.q = aVar;
        this.s = new a();
        this.t = com.facebook.common.time.c.b();
        this.r = z;
        this.f23471b = new HashSet();
        if (this.r) {
            this.f23470a = new CountDownLatch(1);
            executor.execute(new Runnable() {
                public final void run() {
                    synchronized (d.this.f23472c) {
                        d.this.a();
                    }
                    d.this.f23473d = true;
                    d.this.f23470a.countDown();
                }
            });
            return;
        }
        this.f23470a = new CountDownLatch(0);
    }
}
