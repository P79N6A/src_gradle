package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.RestrictTo;
import android.util.SparseIntArray;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private final SparseIntArray f1094a;

    /* renamed from: b  reason: collision with root package name */
    private final Parcel f1095b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1096c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1097d;

    /* renamed from: e  reason: collision with root package name */
    private final String f1098e;

    /* renamed from: f  reason: collision with root package name */
    private int f1099f;
    private int g;

    public final int c() {
        return this.f1095b.readInt();
    }

    public final String d() {
        return this.f1095b.readString();
    }

    public final <T extends Parcelable> T f() {
        return this.f1095b.readParcelable(getClass().getClassLoader());
    }

    public final byte[] e() {
        int readInt = this.f1095b.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f1095b.readByteArray(bArr);
        return bArr;
    }

    public final void a() {
        if (this.f1099f >= 0) {
            int i = this.f1094a.get(this.f1099f);
            int dataPosition = this.f1095b.dataPosition();
            this.f1095b.setDataPosition(i);
            this.f1095b.writeInt(dataPosition - i);
            this.f1095b.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    public final a b() {
        int i;
        Parcel parcel = this.f1095b;
        int dataPosition = this.f1095b.dataPosition();
        if (this.g == this.f1096c) {
            i = this.f1097d;
        } else {
            i = this.g;
        }
        return new b(parcel, dataPosition, i, this.f1098e + "  ");
    }

    public final void a(int i) {
        this.f1095b.writeInt(i);
    }

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "");
    }

    public final void a(Parcelable parcelable) {
        this.f1095b.writeParcelable(parcelable, 0);
    }

    public final void a(String str) {
        this.f1095b.writeString(str);
    }

    public final void c(int i) {
        a();
        this.f1099f = i;
        this.f1094a.put(i, this.f1095b.dataPosition());
        a(0);
        a(i);
    }

    public final void a(byte[] bArr) {
        if (bArr != null) {
            this.f1095b.writeInt(bArr.length);
            this.f1095b.writeByteArray(bArr);
            return;
        }
        this.f1095b.writeInt(-1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(int r5) {
        /*
            r4 = this;
        L_0x0000:
            int r0 = r4.g
            int r1 = r4.f1097d
            r2 = -1
            if (r0 >= r1) goto L_0x0028
            android.os.Parcel r0 = r4.f1095b
            int r1 = r4.g
            r0.setDataPosition(r1)
            android.os.Parcel r0 = r4.f1095b
            int r0 = r0.readInt()
            android.os.Parcel r1 = r4.f1095b
            int r1 = r1.readInt()
            int r3 = r4.g
            int r3 = r3 + r0
            r4.g = r3
            if (r1 != r5) goto L_0x0000
            android.os.Parcel r5 = r4.f1095b
            int r5 = r5.dataPosition()
            goto L_0x0029
        L_0x0028:
            r5 = -1
        L_0x0029:
            if (r5 != r2) goto L_0x002d
            r5 = 0
            return r5
        L_0x002d:
            android.os.Parcel r0 = r4.f1095b
            r0.setDataPosition(r5)
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.versionedparcelable.b.b(int):boolean");
    }

    private b(Parcel parcel, int i, int i2, String str) {
        this.f1094a = new SparseIntArray();
        this.f1099f = -1;
        this.g = 0;
        this.f1095b = parcel;
        this.f1096c = i;
        this.f1097d = i2;
        this.g = this.f1096c;
        this.f1098e = str;
    }
}
