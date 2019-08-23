package com.ss.android.experiencekit;

import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.huawei.emui.hiexperience.hwperf.HwPerfFactory;
import com.huawei.emui.hiexperience.hwperf.thumbnailmanager.HwPerfThumbnailManager;
import com.ss.android.experiencekit.b.a;
import com.ss.android.experiencekit.b.b;
import com.ss.android.experiencekit.b.c;
import com.ss.android.experiencekit.b.d;
import com.ss.android.experiencekit.b.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class b {

    /* renamed from: d  reason: collision with root package name */
    private static volatile b f29064d;

    /* renamed from: a  reason: collision with root package name */
    public List<d> f29065a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public SparseIntArray f29066b = new SparseIntArray();

    /* renamed from: c  reason: collision with root package name */
    public boolean f29067c = false;

    /* renamed from: e  reason: collision with root package name */
    private Application f29068e;

    /* renamed from: f  reason: collision with root package name */
    private d f29069f = new a();

    private b() {
    }

    public static b b() {
        if (f29064d == null) {
            synchronized (b.class) {
                if (f29064d == null) {
                    f29064d = new b();
                }
            }
        }
        return f29064d;
    }

    public final c.a a() {
        try {
            if (this.f29069f instanceof com.ss.android.experiencekit.b.b) {
                com.ss.android.experiencekit.b.b bVar = (com.ss.android.experiencekit.b.b) this.f29069f;
                if (bVar.f29070a == null) {
                    return null;
                }
                HwPerfFactory instance = HwPerfFactory.getInstance(bVar.f29071b);
                if (instance != null) {
                    return new b.C0347b((HwPerfThumbnailManager) instance.createFeature(3));
                }
                return null;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public final boolean a(Application application) {
        boolean z;
        try {
            this.f29068e = application;
            if (RomUtils.a()) {
                this.f29069f = new com.ss.android.experiencekit.b.b();
            } else {
                String a2 = RomUtils.a("ro.product.brand");
                if (TextUtils.isEmpty(a2) || !a2.toLowerCase().contains("oppo")) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    this.f29069f = new e();
                }
            }
            boolean a3 = this.f29069f.a(application, application.getPackageName());
            if (!a3) {
                return a3;
            }
            try {
                application.registerActivityLifecycleCallbacks(new a());
                return a3;
            } catch (Throwable unused) {
                return a3;
            }
        } catch (Throwable unused2) {
            return false;
        }
    }

    public final synchronized boolean a(d dVar) {
        boolean z;
        Iterator<d> it2 = this.f29065a.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (it2.next().getClass().getName().equals(dVar.getClass().getName())) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z && dVar.a(this.f29068e, this.f29068e.getPackageName())) {
            this.f29065a.add(dVar);
        }
        if (!z) {
            return true;
        }
        return false;
    }

    public final boolean a(com.ss.android.experiencekit.c.b bVar, com.ss.android.experiencekit.c.d dVar) {
        return a(bVar, dVar, null);
    }

    private boolean a(com.ss.android.experiencekit.c.b bVar, com.ss.android.experiencekit.c.d dVar, Bundle bundle) {
        try {
            if (this.f29066b.get(bVar.a()) != dVar.getStatus()) {
                this.f29066b.put(bVar.a(), dVar.getStatus());
                for (d a2 : this.f29065a) {
                    if (a2.a(bVar, dVar, bundle)) {
                        return true;
                    }
                }
                return this.f29069f.a(bVar, dVar, bundle);
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public final boolean a(com.ss.android.experiencekit.c.b bVar, com.ss.android.experiencekit.c.d dVar, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return a(bVar, dVar, bundle);
    }
}
