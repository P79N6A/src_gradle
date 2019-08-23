package com.airbnb.lottie;

import android.support.v4.util.ArraySet;
import android.support.v4.util.Pair;
import com.airbnb.lottie.f.d;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4893a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Object> f4894b = new ArraySet();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, d> f4895c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Comparator<Pair<String, Float>> f4896d = new Comparator<Pair<String, Float>>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            float floatValue = ((Float) ((Pair) obj).second).floatValue();
            float floatValue2 = ((Float) ((Pair) obj2).second).floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            if (floatValue > floatValue2) {
                return -1;
            }
            return 0;
        }
    };

    public final void a(String str, float f2) {
        if (this.f4893a) {
            d dVar = this.f4895c.get(str);
            if (dVar == null) {
                dVar = new d();
                this.f4895c.put(str, dVar);
            }
            dVar.f4845a += f2;
            dVar.f4846b++;
            if (dVar.f4846b == Integer.MAX_VALUE) {
                dVar.f4845a /= 2.0f;
                dVar.f4846b /= 2;
            }
            if (str.equals("__container")) {
                Iterator<Object> it2 = this.f4894b.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
        }
    }
}
