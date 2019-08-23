package com.ss.android.ugc.aweme.shortvideo.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.common.utility.DigestUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.fg;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65444a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new d[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f65444a, false, 74959, new Class[]{Parcel.class}, d.class)) {
                return new d(parcel2);
            }
            return (d) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f65444a, false, 74959, new Class[]{Parcel.class}, d.class);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65442a;

    /* renamed from: b  reason: collision with root package name */
    public final e f65443b;

    public final int describeContents() {
        return 0;
    }

    public static d a() {
        if (PatchProxy.isSupport(new Object[0], null, f65442a, true, 74929, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], null, f65442a, true, 74929, new Class[0], d.class);
        }
        a aVar = new a();
        d dVar = new d((e) aVar);
        aVar.o = dVar;
        return dVar;
    }

    public final File c() {
        if (!PatchProxy.isSupport(new Object[0], this, f65442a, false, 74942, new Class[0], File.class)) {
            return this.f65443b.a();
        }
        return (File) PatchProxy.accessDispatch(new Object[0], this, f65442a, false, 74942, new Class[0], File.class);
    }

    public final File d() {
        if (!PatchProxy.isSupport(new Object[0], this, f65442a, false, 74943, new Class[0], File.class)) {
            return this.f65443b.b();
        }
        return (File) PatchProxy.accessDispatch(new Object[0], this, f65442a, false, 74943, new Class[0], File.class);
    }

    public final File e() {
        if (!PatchProxy.isSupport(new Object[0], this, f65442a, false, 74944, new Class[0], File.class)) {
            return this.f65443b.c();
        }
        return (File) PatchProxy.accessDispatch(new Object[0], this, f65442a, false, 74944, new Class[0], File.class);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f65442a, false, 74946, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65442a, false, 74946, new Class[0], Void.TYPE);
            return;
        }
        this.f65443b.f();
    }

    public final File g() {
        if (!PatchProxy.isSupport(new Object[0], this, f65442a, false, 74949, new Class[0], File.class)) {
            return this.f65443b.e();
        }
        return (File) PatchProxy.accessDispatch(new Object[0], this, f65442a, false, 74949, new Class[0], File.class);
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f65442a, false, 74952, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65442a, false, 74952, new Class[0], Void.TYPE);
            return;
        }
        this.f65443b.g();
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f65442a, false, 74953, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65442a, false, 74953, new Class[0], Void.TYPE);
            return;
        }
        this.f65443b.h();
    }

    public final File j() {
        if (!PatchProxy.isSupport(new Object[0], this, f65442a, false, 74954, new Class[0], File.class)) {
            return this.f65443b.i();
        }
        return (File) PatchProxy.accessDispatch(new Object[0], this, f65442a, false, 74954, new Class[0], File.class);
    }

    public final File k() {
        if (!PatchProxy.isSupport(new Object[0], this, f65442a, false, 74955, new Class[0], File.class)) {
            return this.f65443b.j();
        }
        return (File) PatchProxy.accessDispatch(new Object[0], this, f65442a, false, 74955, new Class[0], File.class);
    }

    public final File l() {
        if (!PatchProxy.isSupport(new Object[0], this, f65442a, false, 74956, new Class[0], File.class)) {
            return this.f65443b.k();
        }
        return (File) PatchProxy.accessDispatch(new Object[0], this, f65442a, false, 74956, new Class[0], File.class);
    }

    public static String b() {
        if (PatchProxy.isSupport(new Object[0], null, f65442a, true, 74933, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f65442a, true, 74933, new Class[0], String.class);
        }
        new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
        return fg.i + r0.format(new Date());
    }

    private d(e eVar) {
        this.f65443b = eVar;
    }

    public d(Parcel parcel) {
        this.f65443b = (e) parcel.readParcelable(e.class.getClassLoader());
        if (this.f65443b instanceof a) {
            ((a) this.f65443b).o = this;
        }
    }

    public static String a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f65442a, true, 74932, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, f65442a, true, 74932, new Class[]{String.class}, String.class);
        }
        String md5Hex = DigestUtils.md5Hex(str);
        return fg.h + md5Hex;
    }

    public final void a(b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f65442a, false, 74936, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f65442a, false, 74936, new Class[]{b.class}, Void.TYPE);
            return;
        }
        this.f65443b.a(bVar2);
    }

    public final void a(File file) {
        File file2 = file;
        if (PatchProxy.isSupport(new Object[]{file2}, this, f65442a, false, 74945, new Class[]{File.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{file2}, this, f65442a, false, 74945, new Class[]{File.class}, Void.TYPE);
            return;
        }
        this.f65443b.a(file2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        if (PatchProxy.isSupport(new Object[]{parcel2, Integer.valueOf(i)}, this, f65442a, false, 74958, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel2, Integer.valueOf(i)}, this, f65442a, false, 74958, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel2.writeParcelable(this.f65443b, i);
    }

    public static d a(String str, String str2, String str3, String str4, String str5) {
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        if (PatchProxy.isSupport(new Object[]{str6, str7, str8, str9, str10}, null, f65442a, true, 74931, new Class[]{String.class, String.class, String.class, String.class, String.class}, d.class)) {
            Object[] objArr = {str6, str7, str8, str9, str10};
            return (d) PatchProxy.accessDispatch(objArr, null, f65442a, true, 74931, new Class[]{String.class, String.class, String.class, String.class, String.class}, d.class);
        }
        a aVar = new a();
        aVar.f65429b = 1;
        aVar.f65432e = str6;
        aVar.f65433f = str7;
        aVar.h = str8;
        aVar.g = str9;
        aVar.f65431d = a(str);
        aVar.i = str10;
        d dVar = new d((e) aVar);
        aVar.o = dVar;
        return dVar;
    }
}
