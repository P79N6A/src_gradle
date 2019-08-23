package com.xiaomi.push;

import com.xiaomi.push.ec;
import java.io.File;
import java.util.Date;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ed extends ec.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f81972a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ ec f304a;

    /* renamed from: a  reason: collision with other field name */
    File f305a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f306a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Date f307a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ boolean f308a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f81973b;

    /* renamed from: b  reason: collision with other field name */
    final /* synthetic */ Date f309b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ed(ec ecVar, int i, Date date, Date date2, String str, String str2, boolean z) {
        super();
        this.f304a = ecVar;
        this.f81972a = i;
        this.f307a = date;
        this.f309b = date2;
        this.f306a = str;
        this.f81973b = str2;
        this.f308a = z;
    }

    public void b() {
        if (ab.d()) {
            try {
                File file = new File(ec.a(this.f304a).getExternalFilesDir(null) + "/.logcache");
                file.mkdirs();
                if (file.isDirectory()) {
                    eb ebVar = new eb();
                    ebVar.a(this.f81972a);
                    this.f305a = ebVar.a(ec.a(this.f304a), this.f307a, this.f309b, file);
                }
            } catch (NullPointerException unused) {
            }
        }
    }

    public void c() {
        if (this.f305a != null && this.f305a.exists()) {
            ConcurrentLinkedQueue a2 = ec.a(this.f304a);
            ec.c cVar = new ec.c(this.f306a, this.f81973b, this.f305a, this.f308a);
            a2.add(cVar);
        }
        this.f304a.a(0);
    }
}
