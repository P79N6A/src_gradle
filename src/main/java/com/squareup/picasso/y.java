package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import com.squareup.picasso.s;
import com.squareup.picasso.x;
import java.io.IOException;

public final class y extends x {

    /* renamed from: a  reason: collision with root package name */
    private final Context f27483a;

    y(Context context) {
        this.f27483a = context;
    }

    public final boolean a(v vVar) {
        if (vVar.f27465e != 0) {
            return true;
        }
        return "android.resource".equals(vVar.f27464d.getScheme());
    }

    public final x.a b(v vVar) throws IOException {
        Resources a2 = ad.a(this.f27483a, vVar);
        int a3 = ad.a(a2, vVar);
        BitmapFactory.Options d2 = d(vVar);
        if (a(d2)) {
            BitmapFactory.decodeResource(a2, a3, d2);
            a(vVar.h, vVar.i, d2, vVar);
        }
        return new x.a(BitmapFactory.decodeResource(a2, a3, d2), s.d.DISK);
    }
}
