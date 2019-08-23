package com.ss.android.ugc.bogut.library.b;

import android.os.Parcel;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final ClassLoader f77166a = a.class.getClassLoader();

    a() {
    }

    static byte[] a(Object obj) {
        Parcel obtain = Parcel.obtain();
        obtain.writeValue(obj);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    static <T> T a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T readValue = obtain.readValue(f77166a);
        obtain.recycle();
        return readValue;
    }
}
