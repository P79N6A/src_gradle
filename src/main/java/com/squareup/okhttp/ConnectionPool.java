package com.squareup.okhttp;

import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.RouteDatabase;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.StreamAllocation;
import com.squareup.okhttp.internal.io.RealConnection;
import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public final class ConnectionPool {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final ConnectionPool systemDefault;
    private Runnable cleanupRunnable;
    private final Deque<RealConnection> connections;
    private final Executor executor;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;
    final RouteDatabase routeDatabase;

    public static ConnectionPool getDefault() {
        return systemDefault;
    }

    public final synchronized int getConnectionCount() {
        return this.connections.size();
    }

    @Deprecated
    public final synchronized int getSpdyConnectionCount() {
        return getMultiplexedConnectionCount();
    }

    public final synchronized int getHttpConnectionCount() {
        return this.connections.size() - getMultiplexedConnectionCount();
    }

    public final synchronized int getIdleConnectionCount() {
        int i;
        i = 0;
        for (RealConnection realConnection : this.connections) {
            if (realConnection.allocations.isEmpty()) {
                i++;
            }
        }
        return i;
    }

    public final synchronized int getMultiplexedConnectionCount() {
        int i;
        i = 0;
        for (RealConnection isMultiplexed : this.connections) {
            if (isMultiplexed.isMultiplexed()) {
                i++;
            }
        }
        return i;
    }

    static {
        long j;
        String property = System.getProperty("http.keepAlive");
        String property2 = System.getProperty("http.keepAliveDuration");
        String property3 = System.getProperty("http.maxConnections");
        if (property2 != null) {
            j = Long.parseLong(property2);
        } else {
            j = 300000;
        }
        if (property != null && !Boolean.parseBoolean(property)) {
            systemDefault = new ConnectionPool(0, j);
        } else if (property3 != null) {
            systemDefault = new ConnectionPool(Integer.parseInt(property3), j);
        } else {
            systemDefault = new ConnectionPool(5, j);
        }
    }

    public final void evictAll() {
        ArrayList<RealConnection> arrayList = new ArrayList<>();
        synchronized (this) {
            Iterator<RealConnection> it2 = this.connections.iterator();
            while (it2.hasNext()) {
                RealConnection next = it2.next();
                if (next.allocations.isEmpty()) {
                    next.noNewStreams = true;
                    arrayList.add(next);
                    it2.remove();
                }
            }
        }
        for (RealConnection socket : arrayList) {
            Util.closeQuietly(socket.getSocket());
        }
    }

    /* access modifiers changed from: package-private */
    public final void setCleanupRunnableForTest(Runnable runnable) {
        this.cleanupRunnable = runnable;
    }

    /* access modifiers changed from: package-private */
    public final boolean connectionBecameIdle(RealConnection realConnection) {
        if (realConnection.noNewStreams || this.maxIdleConnections == 0) {
            this.connections.remove(realConnection);
            return true;
        }
        notifyAll();
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void put(RealConnection realConnection) {
        if (this.connections.isEmpty()) {
            this.executor.execute(this.cleanupRunnable);
        }
        this.connections.add(realConnection);
    }

    /* access modifiers changed from: package-private */
    public final long cleanup(long j) {
        synchronized (this) {
            int i = 0;
            RealConnection realConnection = null;
            long j2 = Long.MIN_VALUE;
            int i2 = 0;
            for (RealConnection next : this.connections) {
                if (pruneAndGetAllocationCount(next, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - next.idleAtNanos;
                    if (j3 > j2) {
                        realConnection = next;
                        j2 = j3;
                    }
                }
            }
            if (j2 < this.keepAliveDurationNs) {
                if (i <= this.maxIdleConnections) {
                    if (i > 0) {
                        long j4 = this.keepAliveDurationNs - j2;
                        return j4;
                    } else if (i2 <= 0) {
                        return -1;
                    } else {
                        long j5 = this.keepAliveDurationNs;
                        return j5;
                    }
                }
            }
            this.connections.remove(realConnection);
            Util.closeQuietly(realConnection.getSocket());
            return 0;
        }
    }

    public ConnectionPool(int i, long j) {
        this(i, j, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    public final RealConnection get(Address address, StreamAllocation streamAllocation) {
        for (RealConnection next : this.connections) {
            if (next.allocations.size() < next.allocationLimit() && address.equals(next.getRoute().address) && !next.noNewStreams) {
                streamAllocation.acquire(next);
                return next;
            }
        }
        return null;
    }

    private int pruneAndGetAllocationCount(RealConnection realConnection, long j) {
        List<Reference<StreamAllocation>> list = realConnection.allocations;
        int i = 0;
        while (i < list.size()) {
            if (list.get(i).get() != null) {
                i++;
            } else {
                Logger logger = Internal.logger;
                logger.warning("A connection to " + realConnection.getRoute().getAddress().url() + " was leaked. Did you forget to close a response body?");
                list.remove(i);
                realConnection.noNewStreams = true;
                if (list.isEmpty()) {
                    realConnection.idleAtNanos = j - this.keepAliveDurationNs;
                    return 0;
                }
            }
        }
        return list.size();
    }

    public ConnectionPool(int i, long j, TimeUnit timeUnit) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory("OkHttp ConnectionPool", true));
        this.executor = threadPoolExecutor;
        this.cleanupRunnable = new Runnable() {
            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r6 = this;
                L_0x0000:
                    com.squareup.okhttp.ConnectionPool r0 = com.squareup.okhttp.ConnectionPool.this
                    long r1 = java.lang.System.nanoTime()
                    long r0 = r0.cleanup(r1)
                    r2 = -1
                    int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r4 != 0) goto L_0x0011
                    return
                L_0x0011:
                    r2 = 0
                    int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r4 <= 0) goto L_0x0000
                    r2 = 1000000(0xf4240, double:4.940656E-318)
                    long r4 = r0 / r2
                    long r2 = r2 * r4
                    long r0 = r0 - r2
                    com.squareup.okhttp.ConnectionPool r2 = com.squareup.okhttp.ConnectionPool.this
                    monitor-enter(r2)
                    com.squareup.okhttp.ConnectionPool r3 = com.squareup.okhttp.ConnectionPool.this     // Catch:{ InterruptedException -> 0x002b }
                    int r0 = (int) r0     // Catch:{ InterruptedException -> 0x002b }
                    r3.wait(r4, r0)     // Catch:{ InterruptedException -> 0x002b }
                    goto L_0x002b
                L_0x0029:
                    r0 = move-exception
                    goto L_0x002d
                L_0x002b:
                    monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                    goto L_0x0000
                L_0x002d:
                    monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.ConnectionPool.AnonymousClass1.run():void");
            }
        };
        this.connections = new ArrayDeque();
        this.routeDatabase = new RouteDatabase();
        this.maxIdleConnections = i;
        this.keepAliveDurationNs = timeUnit.toNanos(j);
        if (j <= 0) {
            throw new IllegalArgumentException("keepAliveDuration <= 0: " + j);
        }
    }
}
