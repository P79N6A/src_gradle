package com.mapbox.android.gestures;

import android.content.Context;
import android.support.annotation.UiThread;
import android.view.MotionEvent;
import com.mapbox.android.gestures.c;
import com.mapbox.android.gestures.f;
import com.mapbox.android.gestures.j;
import com.mapbox.android.gestures.k;
import com.mapbox.android.gestures.m;
import com.mapbox.android.gestures.n;
import com.ss.android.ugc.aweme.C0906R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@UiThread
public final class AndroidGesturesManager {

    /* renamed from: a  reason: collision with root package name */
    public final List<Set<Integer>> f25935a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f25936b;

    /* renamed from: c  reason: collision with root package name */
    public final m f25937c;

    /* renamed from: d  reason: collision with root package name */
    public final n f25938d;

    /* renamed from: e  reason: collision with root package name */
    public final j f25939e;

    /* renamed from: f  reason: collision with root package name */
    public final k f25940f;
    public final f g;
    public final c h;
    public final l i;

    @Retention(RetentionPolicy.SOURCE)
    public @interface GestureType {
    }

    private void a() {
        for (a next : this.f25936b) {
            boolean z = next instanceof f;
            if (z) {
                ((e) next).b((int) C0906R.dimen.i4);
            }
            if (next instanceof n) {
                ((n) next).c(C0906R.dimen.i5);
            }
            if (next instanceof k) {
                k kVar = (k) next;
                kVar.c(C0906R.dimen.i6);
                kVar.g = 20.0f;
            }
            if (next instanceof l) {
                l lVar = (l) next;
                lVar.c(C0906R.dimen.i6);
                lVar.g = 20.0f;
            }
            if (z) {
                f fVar = (f) next;
                fVar.c(C0906R.dimen.i3);
                fVar.g = 150;
            }
            if (next instanceof j) {
                ((j) next).g = 15.3f;
            }
        }
    }

    public AndroidGesturesManager(Context context) {
        this(context, true);
    }

    public final void a(c.a aVar) {
        this.h.f25946f = aVar;
    }

    public final void a(f.a aVar) {
        this.g.f25946f = aVar;
    }

    public final void a(j.a aVar) {
        this.f25939e.f25946f = aVar;
    }

    public final void a(k.a aVar) {
        this.f25940f.f25946f = aVar;
    }

    public final void a(m.b bVar) {
        this.f25937c.f25946f = bVar;
    }

    public final void a(n.b bVar) {
        this.f25938d.f25946f = bVar;
    }

    @SafeVarargs
    public final void a(Set<Integer>... setArr) {
        List asList = Arrays.asList(setArr);
        this.f25935a.clear();
        this.f25935a.addAll(asList);
    }

    public final boolean a(MotionEvent motionEvent) {
        boolean z = false;
        for (a a2 : this.f25936b) {
            if (a2.a(motionEvent)) {
                z = true;
            }
        }
        return z;
    }

    private AndroidGesturesManager(Context context, boolean z) {
        this(context, new ArrayList(), true);
    }

    private AndroidGesturesManager(Context context, List<Set<Integer>> list, boolean z) {
        this.f25935a = new ArrayList();
        this.f25936b = new ArrayList();
        this.f25935a.addAll(list);
        this.f25939e = new j(context, this);
        this.f25938d = new n(context, this);
        this.f25940f = new k(context, this);
        this.i = new l(context, this);
        this.g = new f(context, this);
        this.h = new c(context, this);
        this.f25937c = new m(context, this);
        this.f25936b.add(this.f25939e);
        this.f25936b.add(this.f25938d);
        this.f25936b.add(this.f25940f);
        this.f25936b.add(this.i);
        this.f25936b.add(this.g);
        this.f25936b.add(this.h);
        this.f25936b.add(this.f25937c);
        if (z) {
            a();
        }
    }
}
