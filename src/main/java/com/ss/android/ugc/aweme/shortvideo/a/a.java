package com.ss.android.ugc.aweme.shortvideo.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.r;
import com.ss.android.ugc.aweme.shortvideo.fg;
import com.ss.android.ugc.aweme.video.b;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

public class a implements e {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65439a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new a[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f65439a, false, 74927, new Class[]{Parcel.class}, a.class)) {
                return new a(parcel2);
            }
            return (a) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f65439a, false, 74927, new Class[]{Parcel.class}, a.class);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65428a;

    /* renamed from: b  reason: collision with root package name */
    int f65429b;

    /* renamed from: c  reason: collision with root package name */
    String f65430c = fg.g;

    /* renamed from: d  reason: collision with root package name */
    String f65431d;

    /* renamed from: e  reason: collision with root package name */
    String f65432e;

    /* renamed from: f  reason: collision with root package name */
    String f65433f;
    String g;
    String h;
    String i;
    String j;
    String k;
    String l;
    String m;
    String n;
    d o;

    public int describeContents() {
        return 0;
    }

    public final void f() {
        this.h = null;
    }

    public a() {
    }

    public final File a() {
        if (PatchProxy.isSupport(new Object[0], this, f65428a, false, 74905, new Class[0], File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[0], this, f65428a, false, 74905, new Class[0], File.class);
        }
        if (this.f65432e == null) {
            this.f65432e = fg.c("-concat-v");
        }
        return new File(this.f65432e);
    }

    public final File b() {
        if (PatchProxy.isSupport(new Object[0], this, f65428a, false, 74906, new Class[0], File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[0], this, f65428a, false, 74906, new Class[0], File.class);
        }
        if (this.f65433f == null) {
            this.f65433f = fg.c("-concat-a");
        }
        return new File(this.f65433f);
    }

    public final File c() {
        if (PatchProxy.isSupport(new Object[0], this, f65428a, false, 74907, new Class[0], File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[0], this, f65428a, false, 74907, new Class[0], File.class);
        } else if (this.h == null) {
            return null;
        } else {
            return new File(this.h);
        }
    }

    public final File e() {
        if (!PatchProxy.isSupport(new Object[0], this, f65428a, false, 74910, new Class[0], File.class)) {
            return new File(this.f65430c);
        }
        return (File) PatchProxy.accessDispatch(new Object[0], this, f65428a, false, 74910, new Class[0], File.class);
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f65428a, false, 74915, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65428a, false, 74915, new Class[0], Void.TYPE);
            return;
        }
        if (e().exists()) {
            b.b(e());
        }
        g();
    }

    public final File d() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f65428a, false, 74908, new Class[0], File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[0], this, f65428a, false, 74908, new Class[0], File.class);
        }
        if (this.g == null) {
            if (PatchProxy.isSupport(new Object[0], null, fg.f67716e, true, 74573, new Class[0], String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[0], null, fg.f67716e, true, 74573, new Class[0], String.class);
            } else {
                str = fg.d("-concat-v");
            }
            this.g = str;
        }
        if (this.g.startsWith(fg.f67717f)) {
            return new File(this.g);
        }
        return new File(fg.f67717f, this.g);
    }

    public final File i() {
        if (PatchProxy.isSupport(new Object[0], this, f65428a, false, 74917, new Class[0], File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[0], this, f65428a, false, 74917, new Class[0], File.class);
        }
        if (this.l == null) {
            this.l = new r().a(a().getPath());
        }
        return new File(this.l);
    }

    public final void g() {
        File file;
        File file2;
        if (PatchProxy.isSupport(new Object[0], this, f65428a, false, 74914, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65428a, false, 74914, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f65428a, false, 74913, new Class[0], File.class)) {
            file = (File) PatchProxy.accessDispatch(new Object[0], this, f65428a, false, 74913, new Class[0], File.class);
        } else {
            if (this.k == null) {
                this.k = new File(this.h + ".wav").getPath();
            }
            file = new File(this.k);
        }
        if (file.exists()) {
            file.delete();
        }
        if (PatchProxy.isSupport(new Object[0], this, f65428a, false, 74912, new Class[0], File.class)) {
            file2 = (File) PatchProxy.accessDispatch(new Object[0], this, f65428a, false, 74912, new Class[0], File.class);
        } else {
            if (this.j == null) {
                this.j = new File(fg.f67717f, "mix.wav").getPath();
            }
            file2 = new File(this.j);
        }
        if (file2.exists()) {
            file2.delete();
        }
    }

    public final File j() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f65428a, false, 74918, new Class[0], File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[0], this, f65428a, false, 74918, new Class[0], File.class);
        }
        if (this.m == null) {
            File b2 = b();
            r rVar = new r();
            String path = b2.getPath();
            if (PatchProxy.isSupport(new Object[]{path}, rVar, r.f67483a, false, 76291, new Class[]{String.class}, String.class)) {
                r rVar2 = rVar;
                str = (String) PatchProxy.accessDispatch(new Object[]{path}, rVar2, r.f67483a, false, 76291, new Class[]{String.class}, String.class);
            } else {
                Intrinsics.checkParameterIsNotNull(path, "concatAudioPath");
                str = new File(fg.j, new File(path).getName()).getPath();
                Intrinsics.checkExpressionValueIsNotNull(str, "originalSoundFile.path");
            }
            this.m = str;
        }
        return new File(this.m);
    }

    public final File k() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f65428a, false, 74919, new Class[0], File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[0], this, f65428a, false, 74919, new Class[0], File.class);
        }
        if (this.n == null) {
            File a2 = a();
            r rVar = new r();
            String path = a2.getPath();
            if (PatchProxy.isSupport(new Object[]{path}, rVar, r.f67483a, false, 76292, new Class[]{String.class}, String.class)) {
                r rVar2 = rVar;
                str = (String) PatchProxy.accessDispatch(new Object[]{path}, rVar2, r.f67483a, false, 76292, new Class[]{String.class}, String.class);
            } else {
                Intrinsics.checkParameterIsNotNull(path, "concatVideoPath");
                str = new File(fg.l, new File(path).getName()).getPath();
                Intrinsics.checkExpressionValueIsNotNull(str, "synthetiseOutputFile.path");
            }
            this.n = str;
        }
        return new File(this.n);
    }

    public a(Parcel parcel) {
        this.f65429b = parcel.readInt();
        this.f65430c = parcel.readString();
        this.f65431d = parcel.readString();
        this.f65432e = parcel.readString();
        this.f65433f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.k = parcel.readString();
        this.j = parcel.readString();
        this.l = parcel.readString();
    }

    public final void a(b bVar) {
        final b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f65428a, false, 74899, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f65428a, false, 74899, new Class[]{b.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.tools.a.a().execute(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65434a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f65434a, false, 74923, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f65434a, false, 74923, new Class[0], Void.TYPE);
                    return;
                }
                File[] listFiles = new File(d.a(a.this.a().getPath())).listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        if (file.isFile()) {
                            file.delete();
                        }
                    }
                }
                b.b(a.this.e().getPath(), r1 + File.separator);
                com.ss.android.b.a.a.a.b(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f65437a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f65437a, false, 74924, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f65437a, false, 74924, new Class[0], Void.TYPE);
                            return;
                        }
                        if (bVar2 != null) {
                            bVar2.a(a.this.o);
                        }
                    }
                });
            }
        });
    }

    public final void a(File file) {
        if (PatchProxy.isSupport(new Object[]{file}, this, f65428a, false, 74911, new Class[]{File.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{file}, this, f65428a, false, 74911, new Class[]{File.class}, Void.TYPE);
            return;
        }
        this.h = file.getPath();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i2)}, this, f65428a, false, 74920, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i2)}, this, f65428a, false, 74920, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeInt(this.f65429b);
        parcel.writeString(this.f65430c);
        parcel.writeString(this.f65431d);
        parcel.writeString(this.f65432e);
        parcel.writeString(this.f65433f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.k);
        parcel.writeString(this.j);
        parcel.writeString(this.l);
    }
}
