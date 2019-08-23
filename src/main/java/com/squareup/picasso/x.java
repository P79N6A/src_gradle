package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.s;
import java.io.IOException;
import java.io.InputStream;

public abstract class x {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final s.d f27479a;

        /* renamed from: b  reason: collision with root package name */
        public final Bitmap f27480b;

        /* renamed from: c  reason: collision with root package name */
        public final InputStream f27481c;

        /* renamed from: d  reason: collision with root package name */
        public final int f27482d;

        public a(Bitmap bitmap, s.d dVar) {
            this((Bitmap) ad.a(bitmap, "bitmap == null"), null, dVar, 0);
        }

        public a(InputStream inputStream, s.d dVar) {
            this(null, (InputStream) ad.a(inputStream, "stream == null"), dVar, 0);
        }

        a(Bitmap bitmap, InputStream inputStream, s.d dVar, int i) {
            boolean z;
            boolean z2 = false;
            if (bitmap != null) {
                z = true;
            } else {
                z = false;
            }
            if ((inputStream != null ? true : z2) ^ z) {
                this.f27480b = bitmap;
                this.f27481c = inputStream;
                this.f27479a = (s.d) ad.a(dVar, "loadedFrom == null");
                this.f27482d = i;
                return;
            }
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public boolean a(NetworkInfo networkInfo) {
        return false;
    }

    public abstract boolean a(v vVar);

    public abstract a b(v vVar) throws IOException;

    /* access modifiers changed from: package-private */
    public boolean b() {
        return false;
    }

    static boolean a(BitmapFactory.Options options) {
        if (options == null || !options.inJustDecodeBounds) {
            return false;
        }
        return true;
    }

    static BitmapFactory.Options d(v vVar) {
        boolean z;
        boolean c2 = vVar.c();
        if (vVar.q != null) {
            z = true;
        } else {
            z = false;
        }
        BitmapFactory.Options options = null;
        if (c2 || z) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = c2;
            if (z) {
                options.inPreferredConfig = vVar.q;
            }
        }
        return options;
    }

    static void a(int i, int i2, BitmapFactory.Options options, v vVar) {
        a(i, i2, options.outWidth, options.outHeight, options, vVar);
    }

    static void a(int i, int i2, int i3, int i4, BitmapFactory.Options options, v vVar) {
        int i5;
        if (i4 <= i2 && i3 <= i) {
            i5 = 1;
        } else if (i2 == 0) {
            i5 = (int) Math.floor((double) (((float) i3) / ((float) i)));
        } else if (i == 0) {
            i5 = (int) Math.floor((double) (((float) i4) / ((float) i2)));
        } else {
            int floor = (int) Math.floor((double) (((float) i4) / ((float) i2)));
            int floor2 = (int) Math.floor((double) (((float) i3) / ((float) i)));
            if (vVar.k) {
                i5 = Math.max(floor, floor2);
            } else {
                i5 = Math.min(floor, floor2);
            }
        }
        options.inSampleSize = i5;
        options.inJustDecodeBounds = false;
    }
}
