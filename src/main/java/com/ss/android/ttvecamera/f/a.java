package com.ss.android.ttvecamera.f;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.Surface;
import com.ss.android.ttvecamera.aa;
import com.ss.android.ttvecamera.ac;
import com.ss.android.ttvecamera.e;
import com.ss.android.ttvecamera.f.c;
import java.util.List;

public class a extends b {
    private static final String g = "a";

    /* renamed from: a  reason: collision with root package name */
    public Camera.PreviewCallback f31425a;

    public final Surface a() {
        return null;
    }

    public final SurfaceTexture b() {
        return null;
    }

    public final int c() {
        return 4;
    }

    public a(c.a aVar, com.ss.android.ttvecamera.c cVar) {
        super(aVar, cVar);
    }

    public final int a(List<ac> list, ac acVar) {
        if (list != null && list.size() > 0) {
            this.f31430d = aa.a(list, acVar, this.f31430d);
        }
        this.f31425a = new Camera.PreviewCallback() {
            public final void onPreviewFrame(byte[] bArr, Camera camera) {
                e eVar = new e(a.this.f31430d.f31335a, a.this.f31430d.f31336b, System.currentTimeMillis() * 1000);
                e.C0398e eVar2 = new e.C0398e(eVar.f31399a, eVar.f31400b, eVar.f31401c, bArr, a.this.f31431e.m(), a.this.f31429c, a.this.f31431e.h.f31294e);
                eVar.f31402d = eVar2;
                a.this.a(eVar);
            }
        };
        return 0;
    }
}
