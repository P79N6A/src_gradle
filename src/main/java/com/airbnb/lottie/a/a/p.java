package com.airbnb.lottie.a.a;

import android.graphics.Path;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.c.b.o;
import com.airbnb.lottie.c.b.q;
import com.airbnb.lottie.f.f;
import java.util.List;

public final class p implements l, a.C0033a {

    /* renamed from: a  reason: collision with root package name */
    private final Path f4628a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final String f4629b;

    /* renamed from: c  reason: collision with root package name */
    private final LottieDrawable f4630c;

    /* renamed from: d  reason: collision with root package name */
    private final a<?, Path> f4631d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4632e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private r f4633f;

    public final String b() {
        return this.f4629b;
    }

    public final void a() {
        this.f4632e = false;
        this.f4630c.invalidateSelf();
    }

    public final Path e() {
        if (this.f4632e) {
            return this.f4628a;
        }
        this.f4628a.reset();
        this.f4628a.set((Path) this.f4631d.d());
        this.f4628a.setFillType(Path.FillType.EVEN_ODD);
        f.a(this.f4628a, this.f4633f);
        this.f4632e = true;
        return this.f4628a;
    }

    public final void a(List<b> list, List<b> list2) {
        for (int i = 0; i < list.size(); i++) {
            b bVar = list.get(i);
            if (bVar instanceof r) {
                r rVar = (r) bVar;
                if (rVar.f4638a == q.a.Simultaneously) {
                    this.f4633f = rVar;
                    this.f4633f.a(this);
                }
            }
        }
    }

    public p(LottieDrawable lottieDrawable, com.airbnb.lottie.c.c.a aVar, o oVar) {
        this.f4629b = oVar.f4750a;
        this.f4630c = lottieDrawable;
        this.f4631d = oVar.f4751b.a();
        aVar.a(this.f4631d);
        this.f4631d.a((a.C0033a) this);
    }
}
