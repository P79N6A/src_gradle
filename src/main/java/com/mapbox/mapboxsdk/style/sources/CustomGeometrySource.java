package com.mapbox.mapboxsdk.style.sources;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

public class CustomGeometrySource extends Source {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f26801a = new AtomicInteger();

    /* renamed from: b  reason: collision with root package name */
    public ThreadPoolExecutor f26802b;

    /* renamed from: c  reason: collision with root package name */
    private final Lock f26803c;

    /* renamed from: d  reason: collision with root package name */
    private b f26804d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<b, a> f26805e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<b, AtomicBoolean> f26806f;

    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final b f26810a;

        /* renamed from: b  reason: collision with root package name */
        private final b f26811b;

        /* renamed from: c  reason: collision with root package name */
        private final Map<b, a> f26812c;

        /* renamed from: d  reason: collision with root package name */
        private final Map<b, AtomicBoolean> f26813d;

        /* renamed from: e  reason: collision with root package name */
        private final WeakReference<CustomGeometrySource> f26814e;

        /* renamed from: f  reason: collision with root package name */
        private final AtomicBoolean f26815f;

        private Boolean a() {
            return Boolean.valueOf(this.f26815f.get());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
            if (a().booleanValue() != false) goto L_0x0085;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
            r0 = r13.f26811b;
            r1 = r13.f26810a.f26816a;
            r2 = r13.f26810a.f26817b;
            r3 = r13.f26810a.f26818c;
            new com.mapbox.mapboxsdk.geometry.LatLngBounds(com.mapbox.mapboxsdk.geometry.LatLngBounds.a(r1, r3), com.mapbox.mapboxsdk.geometry.LatLngBounds.b(r1, r2 + 1), com.mapbox.mapboxsdk.geometry.LatLngBounds.a(r1, r3 + 1), com.mapbox.mapboxsdk.geometry.LatLngBounds.b(r1, r2));
            r0 = r0.a();
            r1 = (com.mapbox.mapboxsdk.style.sources.CustomGeometrySource) r13.f26814e.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0074, code lost:
            if (a().booleanValue() != false) goto L_0x0085;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
            if (r1 == null) goto L_0x0085;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0078, code lost:
            if (r0 == null) goto L_0x0085;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x007a, code lost:
            r2 = r13.f26810a;
            r1.nativeSetTileData(r2.f26816a, r2.f26817b, r2.f26818c, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0085, code lost:
            r1 = r13.f26812c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0087, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            r0 = r13.f26813d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            r13.f26813d.remove(r13.f26810a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x009a, code lost:
            if (r13.f26812c.containsKey(r13.f26810a) == false) goto L_0x00be;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x009c, code lost:
            r2 = r13.f26812c.get(r13.f26810a);
            r3 = (com.mapbox.mapboxsdk.style.sources.CustomGeometrySource) r13.f26814e.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ae, code lost:
            if (r3 == null) goto L_0x00b7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b0, code lost:
            if (r2 == null) goto L_0x00b7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b2, code lost:
            r3.f26802b.execute(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b7, code lost:
            r13.f26812c.remove(r13.f26810a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00be, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c0, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r13 = this;
                java.util.Map<com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b, com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$a> r0 = r13.f26812c
                monitor-enter(r0)
                java.util.Map<com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b, java.util.concurrent.atomic.AtomicBoolean> r1 = r13.f26813d     // Catch:{ all -> 0x00ca }
                monitor-enter(r1)     // Catch:{ all -> 0x00ca }
                java.util.Map<com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b, java.util.concurrent.atomic.AtomicBoolean> r2 = r13.f26813d     // Catch:{ all -> 0x00c7 }
                com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b r3 = r13.f26810a     // Catch:{ all -> 0x00c7 }
                boolean r2 = r2.containsKey(r3)     // Catch:{ all -> 0x00c7 }
                if (r2 == 0) goto L_0x0024
                java.util.Map<com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b, com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$a> r2 = r13.f26812c     // Catch:{ all -> 0x00c7 }
                com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b r3 = r13.f26810a     // Catch:{ all -> 0x00c7 }
                boolean r2 = r2.containsKey(r3)     // Catch:{ all -> 0x00c7 }
                if (r2 != 0) goto L_0x0021
                java.util.Map<com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b, com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$a> r2 = r13.f26812c     // Catch:{ all -> 0x00c7 }
                com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b r3 = r13.f26810a     // Catch:{ all -> 0x00c7 }
                r2.put(r3, r13)     // Catch:{ all -> 0x00c7 }
            L_0x0021:
                monitor-exit(r1)     // Catch:{ all -> 0x00c7 }
                monitor-exit(r0)     // Catch:{ all -> 0x00ca }
                return
            L_0x0024:
                java.util.Map<com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b, java.util.concurrent.atomic.AtomicBoolean> r2 = r13.f26813d     // Catch:{ all -> 0x00c7 }
                com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b r3 = r13.f26810a     // Catch:{ all -> 0x00c7 }
                java.util.concurrent.atomic.AtomicBoolean r4 = r13.f26815f     // Catch:{ all -> 0x00c7 }
                r2.put(r3, r4)     // Catch:{ all -> 0x00c7 }
                monitor-exit(r1)     // Catch:{ all -> 0x00c7 }
                monitor-exit(r0)     // Catch:{ all -> 0x00ca }
                java.lang.Boolean r0 = r13.a()
                boolean r0 = r0.booleanValue()
                if (r0 != 0) goto L_0x0085
                com.mapbox.mapboxsdk.style.sources.b r0 = r13.f26811b
                com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b r1 = r13.f26810a
                int r1 = r1.f26816a
                com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b r2 = r13.f26810a
                int r2 = r2.f26817b
                com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b r3 = r13.f26810a
                int r3 = r3.f26818c
                com.mapbox.mapboxsdk.geometry.LatLngBounds r4 = new com.mapbox.mapboxsdk.geometry.LatLngBounds
                double r5 = com.mapbox.mapboxsdk.geometry.LatLngBounds.a((int) r1, (int) r3)
                int r7 = r2 + 1
                double r7 = com.mapbox.mapboxsdk.geometry.LatLngBounds.b(r1, r7)
                int r3 = r3 + 1
                double r9 = com.mapbox.mapboxsdk.geometry.LatLngBounds.a((int) r1, (int) r3)
                double r11 = com.mapbox.mapboxsdk.geometry.LatLngBounds.b(r1, r2)
                r4.<init>(r5, r7, r9, r11)
                com.mapbox.geojson.FeatureCollection r0 = r0.a()
                java.lang.ref.WeakReference<com.mapbox.mapboxsdk.style.sources.CustomGeometrySource> r1 = r13.f26814e
                java.lang.Object r1 = r1.get()
                com.mapbox.mapboxsdk.style.sources.CustomGeometrySource r1 = (com.mapbox.mapboxsdk.style.sources.CustomGeometrySource) r1
                java.lang.Boolean r2 = r13.a()
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L_0x0085
                if (r1 == 0) goto L_0x0085
                if (r0 == 0) goto L_0x0085
                com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b r2 = r13.f26810a
                int r3 = r2.f26816a
                int r4 = r2.f26817b
                int r2 = r2.f26818c
                r1.nativeSetTileData(r3, r4, r2, r0)
            L_0x0085:
                java.util.Map<com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b, com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$a> r1 = r13.f26812c
                monitor-enter(r1)
                java.util.Map<com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b, java.util.concurrent.atomic.AtomicBoolean> r0 = r13.f26813d     // Catch:{ all -> 0x00c4 }
                monitor-enter(r0)     // Catch:{ all -> 0x00c4 }
                java.util.Map<com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b, java.util.concurrent.atomic.AtomicBoolean> r2 = r13.f26813d     // Catch:{ all -> 0x00c1 }
                com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b r3 = r13.f26810a     // Catch:{ all -> 0x00c1 }
                r2.remove(r3)     // Catch:{ all -> 0x00c1 }
                java.util.Map<com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b, com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$a> r2 = r13.f26812c     // Catch:{ all -> 0x00c1 }
                com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b r3 = r13.f26810a     // Catch:{ all -> 0x00c1 }
                boolean r2 = r2.containsKey(r3)     // Catch:{ all -> 0x00c1 }
                if (r2 == 0) goto L_0x00be
                java.util.Map<com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b, com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$a> r2 = r13.f26812c     // Catch:{ all -> 0x00c1 }
                com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b r3 = r13.f26810a     // Catch:{ all -> 0x00c1 }
                java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x00c1 }
                com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$a r2 = (com.mapbox.mapboxsdk.style.sources.CustomGeometrySource.a) r2     // Catch:{ all -> 0x00c1 }
                java.lang.ref.WeakReference<com.mapbox.mapboxsdk.style.sources.CustomGeometrySource> r3 = r13.f26814e     // Catch:{ all -> 0x00c1 }
                java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x00c1 }
                com.mapbox.mapboxsdk.style.sources.CustomGeometrySource r3 = (com.mapbox.mapboxsdk.style.sources.CustomGeometrySource) r3     // Catch:{ all -> 0x00c1 }
                if (r3 == 0) goto L_0x00b7
                if (r2 == 0) goto L_0x00b7
                java.util.concurrent.ThreadPoolExecutor r3 = r3.f26802b     // Catch:{ all -> 0x00c1 }
                r3.execute(r2)     // Catch:{ all -> 0x00c1 }
            L_0x00b7:
                java.util.Map<com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b, com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$a> r2 = r13.f26812c     // Catch:{ all -> 0x00c1 }
                com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b r3 = r13.f26810a     // Catch:{ all -> 0x00c1 }
                r2.remove(r3)     // Catch:{ all -> 0x00c1 }
            L_0x00be:
                monitor-exit(r0)     // Catch:{ all -> 0x00c1 }
                monitor-exit(r1)     // Catch:{ all -> 0x00c4 }
                return
            L_0x00c1:
                r2 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00c1 }
                throw r2     // Catch:{ all -> 0x00c4 }
            L_0x00c4:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x00c4 }
                throw r0
            L_0x00c7:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x00c7 }
                throw r2     // Catch:{ all -> 0x00ca }
            L_0x00ca:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00ca }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.style.sources.CustomGeometrySource.a.run():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f26810a.equals(((a) obj).f26810a);
        }

        a(b bVar, b bVar2, Map<b, a> map, Map<b, AtomicBoolean> map2, CustomGeometrySource customGeometrySource, AtomicBoolean atomicBoolean) {
            this.f26810a = bVar;
            this.f26811b = bVar2;
            this.f26812c = map;
            this.f26813d = map2;
            this.f26814e = new WeakReference<>(customGeometrySource);
            this.f26815f = atomicBoolean;
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f26816a;

        /* renamed from: b  reason: collision with root package name */
        public int f26817b;

        /* renamed from: c  reason: collision with root package name */
        public int f26818c;

        public final int hashCode() {
            return Arrays.hashCode(new int[]{this.f26816a, this.f26817b, this.f26818c});
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass() || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f26816a == bVar.f26816a && this.f26817b == bVar.f26817b && this.f26818c == bVar.f26818c) {
                return true;
            }
            return false;
        }

        b(int i, int i2, int i3) {
            this.f26816a = i;
            this.f26817b = i2;
            this.f26818c = i3;
        }
    }

    @Keep
    private native void nativeInvalidateBounds(LatLngBounds latLngBounds);

    @Keep
    private native void nativeInvalidateTile(int i, int i2, int i3);

    @Keep
    private native Feature[] querySourceFeatures(Object[] objArr);

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize() throws Throwable;

    /* access modifiers changed from: protected */
    @Keep
    public native void initialize(String str, Object obj);

    /* access modifiers changed from: package-private */
    @Keep
    public native void nativeSetTileData(int i, int i2, int i3, FeatureCollection featureCollection);

    @Keep
    private void releaseThreads() {
        this.f26803c.lock();
        try {
            this.f26802b.shutdownNow();
        } finally {
            this.f26803c.unlock();
        }
    }

    @Keep
    private void startThreads() {
        this.f26803c.lock();
        try {
            if (this.f26802b != null && !this.f26802b.isShutdown()) {
                this.f26802b.shutdownNow();
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 4, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() {

                /* renamed from: a  reason: collision with root package name */
                final AtomicInteger f26807a = new AtomicInteger();

                /* renamed from: b  reason: collision with root package name */
                final int f26808b = CustomGeometrySource.f26801a.getAndIncrement();

                public final Thread newThread(@NonNull Runnable runnable) {
                    return new Thread(runnable, String.format(Locale.US, "%s-%d-%d", new Object[]{"CustomGeom", Integer.valueOf(this.f26808b), Integer.valueOf(this.f26807a.getAndIncrement())}));
                }
            });
            this.f26802b = threadPoolExecutor;
        } finally {
            this.f26803c.unlock();
        }
    }

    private void a(a aVar) {
        this.f26803c.lock();
        try {
            if (this.f26802b != null && !this.f26802b.isShutdown()) {
                this.f26802b.execute(aVar);
            }
        } finally {
            this.f26803c.unlock();
        }
    }

    @Keep
    private boolean isCancelled(int i, int i2, int i3) {
        return this.f26806f.get(new b(i, i2, i3)).get();
    }

    @Keep
    @WorkerThread
    private void cancelTile(int i, int i2, int i3) {
        b bVar = new b(i, i2, i3);
        synchronized (this.f26805e) {
            synchronized (this.f26806f) {
                AtomicBoolean atomicBoolean = this.f26806f.get(bVar);
                if (atomicBoolean == null || !atomicBoolean.compareAndSet(false, true)) {
                    a aVar = new a(bVar, null, null, null, null, null);
                    if (!this.f26802b.getQueue().remove(aVar)) {
                        this.f26805e.remove(bVar);
                    }
                }
            }
        }
    }

    @Keep
    @WorkerThread
    private void fetchTile(int i, int i2, int i3) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        b bVar = new b(i, i2, i3);
        a aVar = new a(bVar, this.f26804d, this.f26805e, this.f26806f, this, atomicBoolean);
        synchronized (this.f26805e) {
            synchronized (this.f26806f) {
                if (this.f26802b.getQueue().contains(aVar)) {
                    this.f26802b.remove(aVar);
                } else if (this.f26806f.containsKey(bVar)) {
                    this.f26805e.put(bVar, aVar);
                }
                a(aVar);
            }
        }
    }
}
