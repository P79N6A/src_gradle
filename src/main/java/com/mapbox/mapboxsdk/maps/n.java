package com.mapbox.mapboxsdk.maps;

import android.support.annotation.NonNull;
import android.widget.ZoomButtonsController;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    ac f26693a;

    /* renamed from: b  reason: collision with root package name */
    ZoomButtonsController f26694b;

    n(@NonNull ZoomButtonsController zoomButtonsController) {
        this.f26694b = zoomButtonsController;
        this.f26694b.setZoomSpeed(300);
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        if (this.f26693a == null || this.f26693a.i) {
            this.f26694b.setVisible(z);
        }
    }
}
