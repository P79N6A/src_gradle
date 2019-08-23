package com.ss.android.ugc.effectmanager.common;

import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public boolean f77327a;

    /* renamed from: b  reason: collision with root package name */
    public ExecutorService f77328b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f77329c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.effectmanager.a.a f77330d;

    /* renamed from: e  reason: collision with root package name */
    public Map<String, com.ss.android.ugc.effectmanager.d.a.a> f77331e;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public ExecutorService f77334a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f77335b;

        /* renamed from: c  reason: collision with root package name */
        public com.ss.android.ugc.effectmanager.a.a f77336c;
    }

    public final void a(final com.ss.android.ugc.effectmanager.common.e.a aVar) {
        if (this.f77327a) {
            for (com.ss.android.ugc.effectmanager.d.a.a a2 : this.f77331e.values()) {
                a2.a(aVar);
            }
            this.f77328b.execute(new Runnable() {
                public final void run() {
                    aVar.a();
                }
            });
            return;
        }
        throw new IllegalStateException("EffectPlatformSDK: TaskManager is not init !!!");
    }
}
