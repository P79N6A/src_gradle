package com.ss.android.ad.splash.core.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

public class SSRenderSurfaceView extends d implements SurfaceHolder.Callback {

    /* renamed from: c  reason: collision with root package name */
    private static ArrayList<h> f27740c = new ArrayList<>();

    /* renamed from: a  reason: collision with root package name */
    private a f27741a;

    /* renamed from: b  reason: collision with root package name */
    private h f27742b;

    public View getView() {
        return this;
    }

    private void a() {
        this.f27742b = new h(this);
        f27740c.add(this.f27742b);
    }

    public SSRenderSurfaceView(Context context) {
        super(context);
        a();
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.f27741a != null) {
            this.f27741a.a(surfaceHolder);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (this.f27741a != null) {
            this.f27741a.b(surfaceHolder);
        }
    }

    public final void a(a aVar) {
        this.f27741a = aVar;
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator<h> it2 = f27740c.iterator();
        while (it2.hasNext()) {
            h next = it2.next();
            if (((SurfaceHolder.Callback) next.f27793a.get()) == null) {
                holder.removeCallback(next);
                it2.remove();
            }
        }
        holder.addCallback(this.f27742b);
    }

    public SSRenderSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public SSRenderSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (this.f27741a != null) {
            this.f27741a.a(surfaceHolder, i, i2, i3);
        }
    }
}
