package com.airbnb.lottie.a.a;

import android.annotation.TargetApi;
import android.graphics.Path;
import android.os.Build;
import com.airbnb.lottie.c.b.h;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@TargetApi(19)
public final class k implements i, l {

    /* renamed from: a  reason: collision with root package name */
    private final Path f4602a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final Path f4603b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private final Path f4604c = new Path();

    /* renamed from: d  reason: collision with root package name */
    private final String f4605d;

    /* renamed from: e  reason: collision with root package name */
    private final List<l> f4606e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final h f4607f;

    public final String b() {
        return this.f4605d;
    }

    public final Path e() {
        this.f4604c.reset();
        switch (this.f4607f.f4725b) {
            case Merge:
                for (int i = 0; i < this.f4606e.size(); i++) {
                    this.f4604c.addPath(this.f4606e.get(i).e());
                }
                break;
            case Add:
                a(Path.Op.UNION);
                break;
            case Subtract:
                a(Path.Op.REVERSE_DIFFERENCE);
                break;
            case Intersect:
                a(Path.Op.INTERSECT);
                break;
            case ExcludeIntersections:
                a(Path.Op.XOR);
                break;
        }
        return this.f4604c;
    }

    public k(h hVar) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f4605d = hVar.f4724a;
            this.f4607f = hVar;
            return;
        }
        throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
    }

    public final void a(ListIterator<b> listIterator) {
        while (listIterator.hasPrevious()) {
            if (listIterator.previous() == this) {
                break;
            }
        }
        while (listIterator.hasPrevious()) {
            b previous = listIterator.previous();
            if (previous instanceof l) {
                this.f4606e.add((l) previous);
                listIterator.remove();
            }
        }
    }

    @TargetApi(19)
    private void a(Path.Op op) {
        this.f4603b.reset();
        this.f4602a.reset();
        for (int size = this.f4606e.size() - 1; size > 0; size--) {
            l lVar = this.f4606e.get(size);
            if (lVar instanceof c) {
                c cVar = (c) lVar;
                List<l> c2 = cVar.c();
                for (int size2 = c2.size() - 1; size2 >= 0; size2--) {
                    Path e2 = c2.get(size2).e();
                    e2.transform(cVar.d());
                    this.f4603b.addPath(e2);
                }
            } else {
                this.f4603b.addPath(lVar.e());
            }
        }
        l lVar2 = this.f4606e.get(0);
        if (lVar2 instanceof c) {
            c cVar2 = (c) lVar2;
            List<l> c3 = cVar2.c();
            for (int i = 0; i < c3.size(); i++) {
                Path e3 = c3.get(i).e();
                e3.transform(cVar2.d());
                this.f4602a.addPath(e3);
            }
        } else {
            this.f4602a.set(lVar2.e());
        }
        this.f4604c.op(this.f4602a, this.f4603b, op);
    }

    public final void a(List<b> list, List<b> list2) {
        for (int i = 0; i < this.f4606e.size(); i++) {
            this.f4606e.get(i).a(list, list2);
        }
    }
}
