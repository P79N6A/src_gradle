package anetwork.channel.cache;

import anet.channel.util.ALog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class CacheManager {

    /* renamed from: a  reason: collision with root package name */
    private static List<a> f1493a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private static final ReentrantReadWriteLock f1494b;

    /* renamed from: c  reason: collision with root package name */
    private static final ReentrantReadWriteLock.ReadLock f1495c;

    /* renamed from: d  reason: collision with root package name */
    private static final ReentrantReadWriteLock.WriteLock f1496d = f1494b.writeLock();

    static class a implements Comparable<a> {

        /* renamed from: a  reason: collision with root package name */
        final Cache f1497a;

        /* renamed from: b  reason: collision with root package name */
        final CachePrediction f1498b;

        /* renamed from: c  reason: collision with root package name */
        final int f1499c;

        /* renamed from: a */
        public int compareTo(a aVar) {
            return this.f1499c - aVar.f1499c;
        }

        a(Cache cache, CachePrediction cachePrediction, int i) {
            this.f1497a = cache;
            this.f1498b = cachePrediction;
            this.f1499c = i;
        }
    }

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        f1494b = reentrantReadWriteLock;
        f1495c = reentrantReadWriteLock.readLock();
    }

    public static void clearAllCache() {
        ALog.w("anet.CacheManager", "clearAllCache", null, new Object[0]);
        for (a aVar : f1493a) {
            try {
                aVar.f1497a.clear();
            } catch (Exception unused) {
            }
        }
    }

    public static void removeCache(Cache cache) {
        try {
            f1496d.lock();
            ListIterator<a> listIterator = f1493a.listIterator();
            while (true) {
                if (listIterator.hasNext()) {
                    if (listIterator.next().f1497a == cache) {
                        listIterator.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
        } finally {
            f1496d.unlock();
        }
    }

    public static Cache getCache(String str, Map<String, String> map) {
        try {
            f1495c.lock();
            for (a next : f1493a) {
                if (next.f1498b.handleCache(str, map)) {
                    return next.f1497a;
                }
            }
            f1495c.unlock();
            return null;
        } finally {
            f1495c.unlock();
        }
    }

    public static void addCache(Cache cache, CachePrediction cachePrediction, int i) {
        if (cache == null) {
            throw new IllegalArgumentException("cache is null");
        } else if (cachePrediction != null) {
            try {
                f1496d.lock();
                f1493a.add(new a(cache, cachePrediction, i));
                Collections.sort(f1493a);
            } finally {
                f1496d.unlock();
            }
        } else {
            throw new IllegalArgumentException("prediction is null");
        }
    }
}
