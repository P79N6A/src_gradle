package com.ss.android.socialbase.downloader.model;

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new b[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new b(parcel);
        }
    };
    private static final String l = "b";

    /* renamed from: a  reason: collision with root package name */
    public int f31053a;

    /* renamed from: b  reason: collision with root package name */
    public long f31054b;

    /* renamed from: c  reason: collision with root package name */
    public long f31055c;

    /* renamed from: d  reason: collision with root package name */
    public long f31056d;

    /* renamed from: e  reason: collision with root package name */
    public int f31057e;

    /* renamed from: f  reason: collision with root package name */
    public long f31058f;
    public List<b> g;
    public b h;
    public int i;
    public boolean j;
    public AtomicBoolean k;
    private AtomicLong m;
    private AtomicInteger n;
    private com.ss.android.socialbase.downloader.d.b o;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f31059a;

        /* renamed from: b  reason: collision with root package name */
        public long f31060b;

        /* renamed from: c  reason: collision with root package name */
        public long f31061c;

        /* renamed from: d  reason: collision with root package name */
        public long f31062d;

        /* renamed from: e  reason: collision with root package name */
        public long f31063e;

        /* renamed from: f  reason: collision with root package name */
        public int f31064f;
        public long g;
        public b h;

        public final b a() {
            return new b(this, (byte) 0);
        }

        public final a a(int i) {
            this.f31064f = i;
            return this;
        }

        public final a b(long j) {
            this.f31061c = j;
            return this;
        }

        public final a c(long j) {
            this.f31062d = j;
            return this;
        }

        public final a d(long j) {
            this.f31063e = j;
            return this;
        }

        public final a e(long j) {
            this.g = j;
            return this;
        }

        public a(int i) {
            this.f31059a = i;
        }

        public final a a(long j) {
            this.f31060b = j;
            return this;
        }
    }

    public int describeContents() {
        return 0;
    }

    public final int a() {
        if (this.n == null) {
            return -1;
        }
        return this.n.get();
    }

    public final boolean b() {
        if (a() == -1) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.g == null || this.g.size() <= 0) {
            return false;
        }
        return true;
    }

    public final long h() {
        if (this.m != null) {
            return this.m.get();
        }
        return 0;
    }

    public final b c() {
        b bVar;
        if (!b()) {
            bVar = this.h;
        } else {
            bVar = this;
        }
        if (bVar == null || !bVar.d()) {
            return null;
        }
        return bVar.g.get(0);
    }

    public final boolean e() {
        if (this.h == null) {
            return true;
        }
        if (!this.h.d()) {
            return false;
        }
        for (int i2 = 0; i2 < this.h.g.size(); i2++) {
            b bVar = this.h.g.get(i2);
            if (bVar != null) {
                int indexOf = this.h.g.indexOf(this);
                if (indexOf > i2 && !bVar.f()) {
                    return false;
                }
                if (indexOf == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean f() {
        long j2 = this.f31054b;
        if (b() && this.f31058f > this.f31054b) {
            j2 = this.f31058f;
        }
        if (i() - j2 >= this.f31056d) {
            return true;
        }
        return false;
    }

    public final long g() {
        if (this.h == null || this.h.g == null) {
            return -1;
        }
        int indexOf = this.h.g.indexOf(this);
        boolean z = false;
        for (int i2 = 0; i2 < this.h.g.size(); i2++) {
            b bVar = this.h.g.get(i2);
            if (bVar != null) {
                if (z) {
                    return bVar.i();
                }
                if (indexOf == i2) {
                    z = true;
                }
            }
        }
        return -1;
    }

    public final long j() {
        long i2 = i() - this.f31054b;
        if (d()) {
            i2 = 0;
            for (int i3 = 0; i3 < this.g.size(); i3++) {
                b bVar = this.g.get(i3);
                if (bVar != null) {
                    i2 += bVar.i() - bVar.f31054b;
                }
            }
        }
        return i2;
    }

    public final long i() {
        if (!b() || !d()) {
            return h();
        }
        long j2 = 0;
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            b bVar = this.g.get(i2);
            if (bVar != null) {
                if (!bVar.f()) {
                    return bVar.h();
                }
                if (j2 < bVar.h()) {
                    j2 = bVar.h();
                }
            }
        }
        return j2;
    }

    private void a(int i2) {
        if (this.n == null) {
            this.n = new AtomicInteger(i2);
        } else {
            this.n.set(i2);
        }
    }

    protected b(Parcel parcel) {
        this.f31053a = parcel.readInt();
        this.f31054b = parcel.readLong();
        this.m = new AtomicLong(parcel.readLong());
        this.f31055c = parcel.readLong();
        this.f31056d = parcel.readLong();
        this.f31057e = parcel.readInt();
        this.n = new AtomicInteger(parcel.readInt());
    }

    public final void a(long j2) {
        if (this.m != null) {
            this.m.set(j2);
        } else {
            this.m = new AtomicLong(j2);
        }
    }

    private b(a aVar) {
        if (aVar != null) {
            this.f31053a = aVar.f31059a;
            this.f31054b = aVar.f31060b;
            this.m = new AtomicLong(aVar.f31061c);
            this.f31055c = aVar.f31062d;
            this.f31056d = aVar.f31063e;
            this.f31057e = aVar.f31064f;
            this.f31058f = aVar.g;
            this.n = new AtomicInteger(-1);
            a(aVar.h);
            this.k = new AtomicBoolean(false);
        }
    }

    public final void a(com.ss.android.socialbase.downloader.d.b bVar) {
        this.o = bVar;
        this.f31058f = i();
    }

    public final long b(boolean z) {
        long i2 = i();
        long j2 = this.f31056d - (i2 - this.f31058f);
        if (!z && i2 == this.f31058f) {
            j2 = this.f31056d - (i2 - this.f31054b);
        }
        StringBuilder sb = new StringBuilder("contentLength:");
        sb.append(this.f31056d);
        sb.append(" curOffset:");
        sb.append(i());
        sb.append(" oldOffset:");
        sb.append(this.f31058f);
        sb.append(" retainLen:");
        sb.append(j2);
        if (j2 < 0) {
            return 0;
        }
        return j2;
    }

    public b(Cursor cursor) {
        if (cursor != null) {
            this.f31053a = cursor.getInt(cursor.getColumnIndex("_id"));
            this.f31057e = cursor.getInt(cursor.getColumnIndex("chunkIndex"));
            this.f31054b = cursor.getLong(cursor.getColumnIndex("startOffset"));
            int columnIndex = cursor.getColumnIndex("curOffset");
            if (columnIndex != -1) {
                this.m = new AtomicLong(cursor.getLong(columnIndex));
            } else {
                this.m = new AtomicLong(0);
            }
            this.f31055c = cursor.getLong(cursor.getColumnIndex("endOffset"));
            int columnIndex2 = cursor.getColumnIndex("hostChunkIndex");
            if (columnIndex2 != -1) {
                this.n = new AtomicInteger(cursor.getInt(columnIndex2));
            } else {
                this.n = new AtomicInteger(-1);
            }
            int columnIndex3 = cursor.getColumnIndex("chunkContentLen");
            if (columnIndex3 != -1) {
                this.f31056d = cursor.getLong(columnIndex3);
            }
            this.k = new AtomicBoolean(false);
        }
    }

    public final void a(b bVar) {
        this.h = bVar;
        if (this.h != null) {
            a(this.h.f31057e);
        }
    }

    public final void a(boolean z) {
        if (this.k == null) {
            this.k = new AtomicBoolean(z);
        } else {
            this.k.set(z);
        }
        this.o = null;
    }

    /* synthetic */ b(a aVar, byte b2) {
        this(aVar);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        long j2;
        parcel.writeInt(this.f31053a);
        parcel.writeLong(this.f31054b);
        if (this.m != null) {
            j2 = this.m.get();
        } else {
            j2 = 0;
        }
        parcel.writeLong(j2);
        parcel.writeLong(this.f31055c);
        parcel.writeLong(this.f31056d);
        parcel.writeInt(this.f31057e);
        int i3 = -1;
        if (this.n != null) {
            i3 = this.n.get();
        }
        parcel.writeInt(i3);
    }

    public final List<b> a(int i2, long j2) {
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        int i3 = i2;
        if (!b() || d()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long h2 = h();
        long b2 = b(true);
        long j9 = b2 / ((long) i3);
        StringBuilder sb = new StringBuilder("retainLen:");
        sb.append(b2);
        sb.append(" divideChunkForReuse chunkSize:");
        sb.append(j9);
        sb.append(" current host downloadChunk index:");
        sb.append(this.f31057e);
        long j10 = h2;
        int i4 = 0;
        while (i4 < i3) {
            if (i4 == 0) {
                j5 = b2;
                j7 = this.f31054b;
            } else {
                j5 = b2;
                int i5 = i3 - 1;
                if (i4 == i5) {
                    long j11 = this.f31055c;
                    if (j11 > j10) {
                        j8 = (j11 - j10) + 1;
                    } else {
                        j8 = j5 - (((long) i5) * j9);
                    }
                    j4 = j8;
                    j6 = j11;
                    j7 = j10;
                    long j12 = j4;
                    a d2 = new a(this.f31053a).a((-i4) - 1).a(j7).b(j10).e(j10).c(j6).d(j12);
                    d2.h = this;
                    b a2 = d2.a();
                    StringBuilder sb2 = new StringBuilder("divide sub chunk : ");
                    sb2.append(i4);
                    sb2.append(" startOffset:");
                    sb2.append(j7);
                    sb2.append(" curOffset:");
                    long j13 = j10;
                    sb2.append(j13);
                    sb2.append(" endOffset:");
                    sb2.append(j6);
                    sb2.append(" contentLen:");
                    sb2.append(j12);
                    arrayList.add(a2);
                    j10 = j13 + j9;
                    i4++;
                    b2 = j5;
                } else {
                    j7 = j10;
                }
            }
            j6 = (j10 + j9) - 1;
            j4 = j9;
            long j122 = j4;
            a d22 = new a(this.f31053a).a((-i4) - 1).a(j7).b(j10).e(j10).c(j6).d(j122);
            d22.h = this;
            b a22 = d22.a();
            StringBuilder sb22 = new StringBuilder("divide sub chunk : ");
            sb22.append(i4);
            sb22.append(" startOffset:");
            sb22.append(j7);
            sb22.append(" curOffset:");
            long j132 = j10;
            sb22.append(j132);
            sb22.append(" endOffset:");
            sb22.append(j6);
            sb22.append(" contentLen:");
            sb22.append(j122);
            arrayList.add(a22);
            j10 = j132 + j9;
            i4++;
            b2 = j5;
        }
        long j14 = 0;
        for (int size = arrayList.size() - 1; size > 0; size--) {
            b bVar = (b) arrayList.get(size);
            if (bVar != null) {
                j14 += bVar.f31056d;
            }
        }
        new StringBuilder("reuseChunkContentLen:").append(j14);
        b bVar2 = (b) arrayList.get(0);
        if (bVar2 != null) {
            if (this.f31055c == 0) {
                j3 = j2 - this.f31054b;
            } else {
                j3 = (this.f31055c - this.f31054b) + 1;
            }
            bVar2.f31056d = j3 - j14;
            bVar2.f31057e = this.f31057e;
            if (this.o != null) {
                com.ss.android.socialbase.downloader.d.b bVar3 = this.o;
                long j15 = bVar2.f31055c;
                long j16 = this.f31056d - j14;
                if (bVar3.f30859a != null) {
                    bVar3.f30859a.a(j15, j16);
                }
            }
        }
        this.g = arrayList;
        return arrayList;
    }
}
