package com.mapbox.mapboxsdk.annotations;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.LongSparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.o;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Deprecated
public final class j implements MapView.l {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f26452a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewTreeObserver.OnPreDrawListener f26453b = new ViewTreeObserver.OnPreDrawListener() {
        public final boolean onPreDraw() {
            j.this.b();
            j.this.f26452a.getViewTreeObserver().removeOnPreDrawListener(j.this.f26453b);
            return false;
        }
    };

    /* renamed from: c  reason: collision with root package name */
    public final Map<i, View> f26454c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final List<o.c> f26455d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public o f26456e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f26457f;
    public long g;
    public o.p h;
    public boolean i;
    private final LongSparseArray<b> j = new LongSparseArray<>();

    static class a extends o.c<i> {

        /* renamed from: d  reason: collision with root package name */
        private LayoutInflater f26459d;

        /* renamed from: com.mapbox.mapboxsdk.annotations.j$a$a  reason: collision with other inner class name */
        static class C0304a {

            /* renamed from: a  reason: collision with root package name */
            ImageView f26460a;

            private C0304a() {
            }

            /* synthetic */ C0304a(byte b2) {
                this();
            }
        }

        a(Context context) {
            super(context, i.class);
            this.f26459d = LayoutInflater.from(context);
        }

        @Nullable
        public final View a(@NonNull i iVar, @Nullable View view, @NonNull ViewGroup viewGroup) {
            View view2;
            C0304a aVar;
            if (view == null) {
                aVar = new C0304a((byte) 0);
                view2 = this.f26459d.inflate(C0906R.layout.aa0, viewGroup, false);
                aVar.f26460a = (ImageView) view2.findViewById(C0906R.id.ar6);
                view2.setTag(aVar);
            } else {
                view2 = view;
                aVar = (C0304a) view.getTag();
            }
            aVar.f26460a.setImageBitmap(iVar.c().a());
            aVar.f26460a.setContentDescription(iVar.f26419e);
            return view2;
        }
    }

    public interface b {
    }

    public final void a() {
        for (i next : this.f26454c.keySet()) {
            View view = this.f26454c.get(next);
            if (view != null) {
                PointF a2 = this.f26456e.f26697c.a(next.position);
                if (next.n == -1.0f && next.j == 0.0f && next.s) {
                    view.getViewTreeObserver().addOnPreDrawListener(this.f26453b);
                }
                next.j = (float) view.getWidth();
                next.k = (float) view.getHeight();
                if (next.j != 0.0f) {
                    next.a((float) ((int) (next.l * next.j)), (float) ((int) (next.m * next.k)));
                }
                view.setX(a2.x - next.n);
                view.setY(a2.y - next.o);
                if (next.s && view.getVisibility() == 8) {
                    View view2 = this.f26454c.get(next);
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                }
            }
        }
    }

    public final void b() {
        List<i> a2 = this.f26456e.a(new RectF(0.0f, 0.0f, (float) this.f26452a.getWidth(), (float) this.f26452a.getHeight()));
        Iterator<i> it2 = this.f26454c.keySet().iterator();
        while (it2.hasNext()) {
            i next = it2.next();
            if (!a2.contains(next)) {
                View view = this.f26454c.get(next);
                for (o.c next2 : this.f26455d) {
                    if (next2.f26702b.equals(next.getClass())) {
                        next2.a(view);
                        it2.remove();
                    }
                }
            }
        }
        for (i next3 : a2) {
            if (!this.f26454c.containsKey(next3)) {
                for (o.c next4 : this.f26455d) {
                    if (next4.f26702b.equals(next3.getClass())) {
                        View view2 = (View) next4.f26703c.acquire();
                        View a3 = next4.a(next3, view2, this.f26452a);
                        if (a3 != null) {
                            a3.setRotationX(next3.t);
                            a3.setRotation(next3.u);
                            a3.setAlpha(next3.v);
                            a3.setVisibility(8);
                            if (this.f26456e.h().contains(next3)) {
                                this.f26456e.a((Marker) next3);
                            }
                            next3.a(this.f26456e);
                            this.f26454c.put(next3, a3);
                            if (view2 == null) {
                                a3.setVisibility(8);
                                this.f26452a.addView(a3);
                            }
                        }
                        if (((b) this.j.get(next3.f26421a)) != null) {
                            this.j.remove(next3.f26421a);
                        }
                    }
                }
            }
        }
        this.j.clear();
        a();
    }

    @Nullable
    public final View a(i iVar) {
        return this.f26454c.get(iVar);
    }

    public final void a(int i2) {
        if (this.i && i2 == 10) {
            this.i = false;
            b();
        }
    }

    public j(@NonNull ViewGroup viewGroup) {
        this.f26452a = viewGroup;
        this.f26455d.add(new a(viewGroup.getContext()));
    }

    public final void a(float f2) {
        for (i next : this.f26454c.keySet()) {
            if (next.r) {
                View view = this.f26454c.get(next);
                if (view != null) {
                    next.t = f2;
                    view.setRotationX(f2);
                }
            }
        }
    }

    public final void b(i iVar) {
        View view = this.f26454c.get(iVar);
        if (!(view == null || iVar == null)) {
            for (o.c next : this.f26455d) {
                if (next.f26702b.equals(iVar.getClass())) {
                    iVar.a(-1.0f, -1.0f);
                    next.a(view);
                }
            }
        }
        iVar.a((o) null);
        this.f26454c.remove(iVar);
    }

    public final boolean c(i iVar) {
        boolean z;
        o.c cVar = null;
        for (o.c next : this.f26455d) {
            if (next.f26702b.equals(iVar.getClass())) {
                cVar = next;
            }
        }
        View a2 = a(iVar);
        if (cVar == null || a2 == null) {
            return true;
        }
        if (this.h != null) {
            z = this.h.a();
        } else {
            z = false;
        }
        return z;
    }

    public final void a(@NonNull i iVar, boolean z) {
        if (this.f26454c.get(iVar) != null) {
            for (o.c cVar : this.f26455d) {
                cVar.f26702b.equals(iVar.getClass());
            }
        }
        iVar.w = false;
    }
}
