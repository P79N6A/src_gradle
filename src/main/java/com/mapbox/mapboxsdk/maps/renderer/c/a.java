package com.mapbox.mapboxsdk.maps.renderer.c;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.TextureView;
import com.mapbox.mapboxsdk.maps.renderer.MapRenderer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class a extends MapRenderer {

    /* renamed from: a  reason: collision with root package name */
    private b f26723a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f26724b;

    public void onStart() {
        b bVar = this.f26723a;
        synchronized (bVar.f26725a) {
            bVar.f26728d = false;
            bVar.f26725a.notifyAll();
        }
    }

    public void onStop() {
        b bVar = this.f26723a;
        synchronized (bVar.f26725a) {
            bVar.f26728d = true;
            bVar.f26725a.notifyAll();
        }
    }

    public void requestRender() {
        b bVar = this.f26723a;
        synchronized (bVar.f26725a) {
            bVar.f26727c = true;
            bVar.f26725a.notifyAll();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:7|8|9|10|19|16|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x000d, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0017 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r3 = this;
            com.mapbox.mapboxsdk.maps.renderer.c.b r0 = r3.f26723a
            java.lang.Object r1 = r0.f26725a
            monitor-enter(r1)
            r2 = 1
            r0.f26729e = r2     // Catch:{ all -> 0x0021 }
            java.lang.Object r2 = r0.f26725a     // Catch:{ all -> 0x0021 }
            r2.notifyAll()     // Catch:{ all -> 0x0021 }
        L_0x000d:
            boolean r2 = r0.f26730f     // Catch:{ all -> 0x0021 }
            if (r2 != 0) goto L_0x001f
            java.lang.Object r2 = r0.f26725a     // Catch:{ InterruptedException -> 0x0017 }
            r2.wait()     // Catch:{ InterruptedException -> 0x0017 }
            goto L_0x000d
        L_0x0017:
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0021 }
            r2.interrupt()     // Catch:{ all -> 0x0021 }
            goto L_0x000d
        L_0x001f:
            monitor-exit(r1)     // Catch:{ all -> 0x0021 }
            return
        L_0x0021:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0021 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.renderer.c.a.onDestroy():void");
    }

    public void onDrawFrame(GL10 gl10) {
        super.onDrawFrame(gl10);
    }

    public void queueEvent(Runnable runnable) {
        b bVar = this.f26723a;
        if (runnable != null) {
            synchronized (bVar.f26725a) {
                bVar.f26726b.add(runnable);
                bVar.f26725a.notifyAll();
            }
            return;
        }
        throw new IllegalArgumentException("runnable must not be null");
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        super.onSurfaceCreated(gl10, eGLConfig);
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        super.onSurfaceChanged(gl10, i, i2);
    }

    public a(@NonNull Context context, @NonNull TextureView textureView, String str, boolean z) {
        super(context, str);
        this.f26724b = z;
        this.f26723a = new b(textureView, this);
        this.f26723a.start();
    }
}
