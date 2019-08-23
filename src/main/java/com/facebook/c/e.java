package com.facebook.c;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import com.facebook.c.b.k;
import com.facebook.c.c;
import java.util.HashMap;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public k f23421a;

    /* renamed from: b  reason: collision with root package name */
    public int f23422b = 60;

    /* renamed from: c  reason: collision with root package name */
    public a f23423c = new a();

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public Map<String, c.a> f23424a;

        public final c a() {
            return e.this.a();
        }

        public a() {
        }

        public final a a(Pair<String, Pair<Drawable, Matrix>>... pairArr) {
            this.f23424a = new HashMap();
            for (int i = 0; i <= 0; i++) {
                Pair<String, Pair<Drawable, Matrix>> pair = pairArr[0];
                this.f23424a.put(pair.first, new c.a((Drawable) ((Pair) pair.second).first, (Matrix) ((Pair) pair.second).second));
            }
            return this;
        }
    }

    public final c a() {
        if (this.f23421a != null) {
            return new c(this);
        }
        throw new IllegalArgumentException("No KFImage provided!");
    }

    public final e a(k kVar) {
        this.f23421a = kVar;
        return this;
    }
}
