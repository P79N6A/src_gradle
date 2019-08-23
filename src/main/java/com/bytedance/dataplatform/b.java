package com.bytedance.dataplatform;

import java.util.concurrent.Future;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static volatile h f19602a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile a f19603b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile Future f19604c;

    public static boolean a() {
        if (f19604c != null) {
            try {
                f19604c.get();
                return f19603b.c();
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        } else {
            throw new RuntimeException("ExperimentManager has not been init (refresh)");
        }
    }

    public static void b() {
        if (f19604c != null) {
            try {
                f19604c.get();
                f19603b.b();
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        } else {
            throw new RuntimeException("ExperimentManager has not been init (refresh)");
        }
    }
}
