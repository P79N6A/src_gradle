package com.ss.ugc.live.a;

import com.ss.display.CameraDisplay2;
import com.ss.ugc.live.a.a.c;

public final class f implements c {

    /* renamed from: a  reason: collision with root package name */
    CameraDisplay2 f78613a;

    public f(CameraDisplay2 cameraDisplay2) {
        this.f78613a = cameraDisplay2;
    }

    public final void a(String str) {
        this.f78613a.setEffect(null);
    }

    public final void a(boolean z) {
        this.f78613a.enableMockFace(z);
    }

    public final int a(int i, int i2) {
        return this.f78613a.setComposerMode(i, i2);
    }

    public final int a(String[] strArr, int i) {
        return this.f78613a.setComposerSetNodes(strArr, i);
    }

    public final void a(String str, float f2) {
        this.f78613a.setFilter(str, 1.0f);
    }

    public final void a(String str, boolean z) {
        this.f78613a.setEffect(str, z);
    }

    public final int b(String str, String str2, float f2) {
        return this.f78613a.setComposerUpdateNode(str, str2, f2);
    }

    public final int a(String str, String str2, float f2) {
        return this.f78613a.setFilter(str, str2, f2);
    }

    public final void a(String str, String str2, boolean z) {
        this.f78613a.setCustomEffect(str, str2, z);
    }
}
