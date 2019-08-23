package com.mapbox.mapboxsdk.annotations;

import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import com.mapbox.mapboxsdk.d;
import com.mapbox.mapboxsdk.maps.o;

@Deprecated
public class i extends Marker {
    public float j;
    public float k;
    public float l;
    public float m;
    public float n = -1.0f;
    public float o = -1.0f;
    public float p;
    public float q;
    public boolean r;
    public boolean s = true;
    public float t;
    public float u;
    public float v = 1.0f;
    public boolean w;
    private j x;
    private e y;

    i() {
    }

    public final e c() {
        if (this.y == null) {
            a(f.a(d.b()).b());
        }
        return this.y;
    }

    public String toString() {
        return "MarkerView [position[" + this.position + "]]";
    }

    public final void a(o oVar) {
        super.a(oVar);
        if (oVar != null) {
            if (this.r) {
                this.t = (float) oVar.g().tilt;
            }
            this.x = oVar.i();
        }
    }

    public final void a(@Nullable e eVar) {
        if (eVar != null) {
            this.y = f.a("com.mapbox.icons.icon_marker_view", eVar.a());
        }
        e a2 = f.a("com.mapbox.icons.icon_marker_view", f.f26437a);
        if (this.x != null) {
            View view = this.x.f26454c.get(this);
            if (view != null && (view instanceof ImageView)) {
                ((ImageView) view).setImageBitmap(c().a());
                this.k = 0.0f;
                this.j = 0.0f;
                this.o = -1.0f;
                this.n = -1.0f;
                this.x.b();
            }
        }
        super.a(a2);
    }

    public final void a(float f2, float f3) {
        this.n = f2;
        this.o = f3;
    }
}
