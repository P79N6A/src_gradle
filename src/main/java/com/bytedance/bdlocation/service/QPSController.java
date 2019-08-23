package com.bytedance.bdlocation.service;

import android.location.Location;
import android.support.annotation.Keep;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Keep
public class QPSController {
    private final Object lock = new Object();
    private Map<Long, a> mQps = new ConcurrentHashMap();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f19262a;

        /* renamed from: b  reason: collision with root package name */
        public int f19263b;
    }

    public a getQPS(long j) {
        a aVar;
        synchronized (this.lock) {
            aVar = this.mQps.get(Long.valueOf(j));
        }
        return aVar;
    }

    public void startLocation(long j) {
        synchronized (this.lock) {
            this.mQps.put(Long.valueOf(j), new a());
        }
    }

    public void stopLocation(long j) {
        synchronized (this.lock) {
            this.mQps.remove(Long.valueOf(j));
        }
    }

    public void callback(Location location) {
        synchronized (this.lock) {
            for (Map.Entry<Long, a> value : this.mQps.entrySet()) {
                ((a) value.getValue()).f19262a++;
            }
        }
    }

    public void callbackError(Throwable th) {
        synchronized (this.lock) {
            for (Map.Entry<Long, a> value : this.mQps.entrySet()) {
                ((a) value.getValue()).f19263b++;
            }
        }
    }
}
