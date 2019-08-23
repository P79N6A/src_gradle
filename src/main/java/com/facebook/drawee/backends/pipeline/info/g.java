package com.facebook.drawee.backends.pipeline.info;

import android.graphics.Rect;
import com.facebook.common.time.b;
import com.facebook.drawee.backends.pipeline.c;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.listener.a;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public final class g extends a {

    /* renamed from: a  reason: collision with root package name */
    public final h f23668a = new h();
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public List<f> f23669b;

    /* renamed from: c  reason: collision with root package name */
    private final c f23670c;

    /* renamed from: d  reason: collision with root package name */
    private final b f23671d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private c f23672e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private b f23673f;
    @Nullable
    private com.facebook.drawee.backends.pipeline.info.a.c g;
    @Nullable
    private com.facebook.drawee.backends.pipeline.info.a.a h;
    @Nullable
    private com.facebook.imagepipeline.listener.b i;
    private boolean j;

    private void a() {
        if (this.h == null) {
            this.h = new com.facebook.drawee.backends.pipeline.info.a.a(this.f23671d, this.f23668a, this);
        }
        if (this.g == null) {
            this.g = new com.facebook.drawee.backends.pipeline.info.a.c(this.f23671d, this.f23668a);
        }
        if (this.f23673f == null) {
            this.f23673f = new com.facebook.drawee.backends.pipeline.info.a.b(this.f23668a, this);
        }
        if (this.f23672e == null) {
            this.f23672e = new c(this.f23670c.getId(), this.f23673f);
        } else {
            this.f23672e.f23660a = this.f23670c.getId();
        }
        if (this.i == null) {
            this.i = new com.facebook.imagepipeline.listener.b(this.g, this.f23672e);
        }
    }

    public final void a(boolean z) {
        this.j = z;
        if (z) {
            a();
            if (this.f23673f != null) {
                this.f23670c.a(this.f23673f);
            }
            if (this.h != null) {
                this.f23670c.addControllerListener(this.h);
            }
            if (this.i != null) {
                this.f23670c.a((RequestListener) this.i);
            }
        } else {
            if (this.f23673f != null) {
                this.f23670c.b(this.f23673f);
            }
            if (this.h != null) {
                this.f23670c.removeControllerListener(this.h);
            }
            if (this.i != null) {
                this.f23670c.b((RequestListener) this.i);
            }
        }
    }

    public g(b bVar, c cVar) {
        this.f23671d = bVar;
        this.f23670c = cVar;
    }

    public final void b(h hVar, int i2) {
        if (this.j && this.f23669b != null && !this.f23669b.isEmpty()) {
            hVar.a();
            Iterator<f> it2 = this.f23669b.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    public final void a(h hVar, int i2) {
        hVar.q = i2;
        if (this.j && this.f23669b != null && !this.f23669b.isEmpty()) {
            if (i2 == 3) {
                DraweeHierarchy hierarchy = this.f23670c.getHierarchy();
                if (!(hierarchy == null || hierarchy.getTopLevelDrawable() == null)) {
                    Rect bounds = hierarchy.getTopLevelDrawable().getBounds();
                    this.f23668a.o = bounds.width();
                    this.f23668a.p = bounds.height();
                }
            }
            hVar.a();
            Iterator<f> it2 = this.f23669b.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }
}
