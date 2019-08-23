package io.fabric.sdk.android;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.fabric.sdk.android.services.b.g;
import io.fabric.sdk.android.services.b.i;
import io.fabric.sdk.android.services.b.l;
import io.fabric.sdk.android.services.d.b;
import io.fabric.sdk.android.services.d.e;
import io.fabric.sdk.android.services.f.d;
import io.fabric.sdk.android.services.f.h;
import io.fabric.sdk.android.services.f.n;
import io.fabric.sdk.android.services.f.q;
import io.fabric.sdk.android.services.f.t;
import io.fabric.sdk.android.services.f.y;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;

public final class m extends i<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private final e f83152a = new b();

    /* renamed from: b  reason: collision with root package name */
    private PackageManager f83153b;

    /* renamed from: c  reason: collision with root package name */
    private String f83154c;

    /* renamed from: d  reason: collision with root package name */
    private PackageInfo f83155d;

    /* renamed from: e  reason: collision with root package name */
    private String f83156e;

    /* renamed from: f  reason: collision with root package name */
    private String f83157f;
    private String g;
    private String h;
    private String i;
    private final Future<Map<String, k>> j;
    private final Collection<i> k;

    public final String getIdentifier() {
        return "io.fabric.sdk.android:fabric";
    }

    public final String getVersion() {
        return "1.4.8.32";
    }

    private String c() {
        return i.c(this.context, "com.crashlytics.ApiEndpoint");
    }

    private t b() {
        try {
            q.a().a(this, this.idManager, this.f83152a, this.f83156e, this.f83157f, c(), l.a(this.context)).c();
            return q.a().b();
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onPreExecute() {
        String str;
        try {
            this.g = this.idManager.f();
            this.f83153b = this.context.getPackageManager();
            this.f83154c = this.context.getPackageName();
            this.f83155d = this.f83153b.getPackageInfo(this.f83154c, 0);
            this.f83156e = Integer.toString(this.f83155d.versionCode);
            if (this.f83155d.versionName == null) {
                str = "0.0";
            } else {
                str = this.f83155d.versionName;
            }
            this.f83157f = str;
            this.h = this.f83153b.getApplicationLabel(this.context.getApplicationInfo()).toString();
            this.i = Integer.toString(this.context.getApplicationInfo().targetSdkVersion);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Boolean doInBackground() {
        Map map;
        boolean z;
        String f2 = i.f(this.context);
        t b2 = b();
        boolean z2 = false;
        if (b2 != null) {
            try {
                if (this.j != null) {
                    map = this.j.get();
                } else {
                    map = new HashMap();
                }
                Map<String, k> a2 = a(map, this.k);
                io.fabric.sdk.android.services.f.e eVar = b2.f83353a;
                Collection<k> values = a2.values();
                if ("new".equals(eVar.f83313b)) {
                    if (new h(this, c(), eVar.f83314c, this.f83152a).a(a(n.a(this.context, f2), values))) {
                        z = q.a().d();
                    }
                } else if ("configured".equals(eVar.f83313b)) {
                    z = q.a().d();
                } else {
                    if (eVar.f83317f) {
                        new y(this, c(), eVar.f83314c, this.f83152a).a(a(n.a(this.context, f2), values));
                    }
                    z2 = true;
                }
                z2 = z;
            } catch (Exception unused) {
            }
        }
        return Boolean.valueOf(z2);
    }

    public m(Future<Map<String, k>> future, Collection<i> collection) {
        this.j = future;
        this.k = collection;
    }

    private d a(n nVar, Collection<k> collection) {
        Context context = this.context;
        d dVar = new d(new g().a(context), this.idManager.f83194b, this.f83157f, this.f83156e, i.a(i.h(context)), this.h, io.fabric.sdk.android.services.b.m.determineFrom(this.g).getId(), this.i, PushConstants.PUSH_TYPE_NOTIFY, nVar, collection);
        return dVar;
    }

    private static Map<String, k> a(Map<String, k> map, Collection<i> collection) {
        for (i next : collection) {
            if (!map.containsKey(next.getIdentifier())) {
                map.put(next.getIdentifier(), new k(next.getIdentifier(), next.getVersion(), "binary"));
            }
        }
        return map;
    }
}
