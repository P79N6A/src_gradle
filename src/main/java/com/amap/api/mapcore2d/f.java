package com.amap.api.mapcore2d;

import com.amap.api.maps2d.AMapException;
import com.amap.api.maps2d.MapsInitializer;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public abstract class f<T, V> extends aw {

    /* renamed from: a  reason: collision with root package name */
    protected bo<T> f6103a;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f6104c = true;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Vector<Thread> f6105d;

    /* renamed from: e  reason: collision with root package name */
    private Runnable f6106e = new Runnable() {
        public void run() {
            Thread currentThread = Thread.currentThread();
            if (currentThread != null) {
                currentThread.setName("TaskRunDownLoad");
            }
            try {
                if (f.this.f6105d != null) {
                    f.this.f6105d.add(currentThread);
                }
                ArrayList arrayList = null;
                ArrayList arrayList2 = null;
                while (f.this.f6104c && !Thread.interrupted()) {
                    if (f.this.f5653b == null) {
                        boolean unused = f.this.f6104c = false;
                    } else if (MapsInitializer.getNetworkEnable()) {
                        if (f.this.f6103a != null) {
                            arrayList = f.this.f6103a.a(f.this.g(), false);
                        }
                        if (arrayList == null || arrayList.size() != 0) {
                            if (f.this.f6104c) {
                                if (arrayList != null) {
                                    if (f.this.f6104c) {
                                        if (f.this.f5653b != null) {
                                            try {
                                                arrayList2 = f.this.a(arrayList);
                                            } catch (AMapException e2) {
                                                cm.a(e2, "AsyncServer", "run");
                                            }
                                            if (!(arrayList2 == null || f.this.f6103a == null)) {
                                                f.this.f6103a.a((List<T>) arrayList2, false);
                                            }
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                if (f.this.f6104c && !Thread.interrupted()) {
                                    try {
                                        Thread.sleep(50);
                                    } catch (InterruptedException unused2) {
                                        Thread.currentThread().interrupt();
                                    } catch (Exception e3) {
                                        cm.a(e3, "AsyncServer", "run");
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                    } else if (!Thread.interrupted()) {
                        Thread.sleep(200);
                    }
                }
            } catch (InterruptedException unused3) {
                Thread.currentThread().interrupt();
            } catch (Exception e4) {
                cm.a(e4, "AsyncServer", "run");
                Thread.currentThread().interrupt();
            } catch (Throwable th) {
                cm.a(th, "AsyncServer", "run");
            }
        }
    };

    /* renamed from: f  reason: collision with root package name */
    private Runnable f6107f = new Runnable() {
        public void run() {
            Thread currentThread = Thread.currentThread();
            if (currentThread != null) {
                currentThread.setName("TaskRunCach");
            }
            try {
                if (!(f.this.f6105d == null || currentThread == null)) {
                    f.this.f6105d.add(currentThread);
                }
                ArrayList arrayList = null;
                ArrayList arrayList2 = null;
                while (f.this.f6104c && !Thread.interrupted()) {
                    if (f.this.f5653b == null) {
                        boolean unused = f.this.f6104c = false;
                    } else {
                        if (f.this.f6103a != null) {
                            arrayList = f.this.f6103a.a(f.this.g(), true);
                        }
                        if (arrayList == null || arrayList.size() != 0) {
                            if (f.this.f6104c) {
                                arrayList2 = f.this.b(arrayList);
                                if (!(arrayList2 == null || f.this.f6103a == null || !cm.a(ar.f5624a))) {
                                    f.this.f6103a.a((List<T>) arrayList2, false);
                                }
                                if (f.this.f6104c && !Thread.interrupted()) {
                                    try {
                                        Thread.sleep(50);
                                    } catch (InterruptedException unused2) {
                                        Thread.currentThread().interrupt();
                                    } catch (Throwable th) {
                                        cm.a(th, "AsyncServer", "run");
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                cm.a(th2, "AsyncServer", "run");
            }
        }
    };
    private bq g;

    /* access modifiers changed from: protected */
    public abstract ArrayList<T> a(ArrayList<T> arrayList) throws AMapException;

    /* access modifiers changed from: protected */
    public abstract ArrayList<T> b(ArrayList<T> arrayList) throws AMapException;

    /* access modifiers changed from: protected */
    public abstract int f();

    /* access modifiers changed from: protected */
    public abstract int g();

    public void c() {
        super.c();
        e();
    }

    /* access modifiers changed from: protected */
    public void a() {
        if (this.f6105d == null) {
            this.f6105d = new Vector<>();
        }
        this.g = new bq(f(), this.f6107f, this.f6106e);
        this.g.a();
    }

    public void b() {
        if (this.f6103a != null) {
            this.f6103a.a();
        }
        e();
        if (this.f6103a != null) {
            this.f6103a.b();
        }
        this.f6103a = null;
        this.f6107f = null;
        this.f6106e = null;
        this.f5653b = null;
    }

    public void d() {
        try {
            if (!this.f6104c) {
                this.f6104c = true;
                if (this.f6105d == null) {
                    this.f6105d = new Vector<>();
                }
                if (this.g == null) {
                    this.g = new bq(f(), this.f6107f, this.f6106e);
                    this.g.a();
                }
            }
        } catch (Throwable th) {
            cm.a(th, "AsyncServer", "onResume");
        }
    }

    public void e() {
        try {
            this.f6104c = false;
            if (this.f6105d != null) {
                int size = this.f6105d.size();
                for (int i = 0; i < size; i++) {
                    Thread thread = this.f6105d.get(0);
                    if (thread != null) {
                        thread.interrupt();
                        this.f6105d.remove(0);
                    }
                }
                this.f6105d = null;
            }
            if (this.g != null) {
                this.g.b();
                this.g = null;
            }
        } catch (Throwable th) {
            cm.a(th, "AsyncServer", "stopThreads");
        }
    }

    public f(az azVar) {
        super(azVar);
    }
}
