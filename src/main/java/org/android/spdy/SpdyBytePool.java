package org.android.spdy;

import java.util.Random;
import java.util.TreeSet;

public class SpdyBytePool {
    private static volatile SpdyBytePool gInstance = null;
    private static Object lock = new Object();
    private static Random rand = new Random();
    private TreeSet<SpdyByteArray> pool = new TreeSet<>();
    private long reused = 0;
    private SpdyByteArray std = new SpdyByteArray();

    private SpdyBytePool() {
    }

    public static SpdyBytePool getInstance() {
        if (gInstance == null) {
            synchronized (lock) {
                if (gInstance == null) {
                    gInstance = new SpdyBytePool();
                }
            }
        }
        return gInstance;
    }

    /* access modifiers changed from: package-private */
    public void recycle(SpdyByteArray spdyByteArray) {
        synchronized (lock) {
            this.pool.add(spdyByteArray);
            while (this.pool.size() > 100) {
                if (rand.nextBoolean()) {
                    this.pool.pollFirst();
                } else {
                    this.pool.pollLast();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public SpdyByteArray getSpdyByteArray(int i) {
        SpdyByteArray ceiling;
        synchronized (lock) {
            this.std.length = i;
            ceiling = this.pool.ceiling(this.std);
            if (ceiling == null) {
                ceiling = new SpdyByteArray(i);
            } else {
                this.pool.remove(ceiling);
                this.reused += (long) i;
            }
        }
        spduLog.Logi("libeasy", "getSpdyByteArray: " + ceiling);
        spduLog.Logi("libeasy", "reused: " + this.reused);
        return ceiling;
    }
}
