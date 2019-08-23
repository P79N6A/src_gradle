package com.facebook.c.b.a;

import android.view.animation.Interpolator;
import com.facebook.c.c.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a {
    public static List<Interpolator> a(float[][][] fArr) {
        if (fArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (float[][] fArr2 : fArr) {
            arrayList.add(new d(fArr2[0][0], fArr2[0][1], fArr2[1][0], fArr2[1][1]));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
