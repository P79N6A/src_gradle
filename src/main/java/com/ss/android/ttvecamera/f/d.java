package com.ss.android.ttvecamera.f;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.view.Surface;
import com.ss.android.ttvecamera.aa;
import com.ss.android.ttvecamera.ac;
import com.ss.android.ttvecamera.ae;
import com.ss.android.ttvecamera.e;
import com.ss.android.ttvecamera.f.c;
import java.util.List;

@RequiresApi(api = 19)
public final class d extends b {

    /* renamed from: a  reason: collision with root package name */
    ImageReader f31442a;

    public final SurfaceTexture b() {
        return null;
    }

    public final int c() {
        return 2;
    }

    public final Surface a() {
        if (this.f31442a != null) {
            return this.f31442a.getSurface();
        }
        return null;
    }

    public final void d() {
        super.d();
        if (this.f31442a != null) {
            this.f31442a.close();
            this.f31442a = null;
        }
    }

    public d(c.a aVar, com.ss.android.ttvecamera.c cVar) {
        super(aVar, cVar);
    }

    public final int a(List<ac> list, ac acVar) {
        if (list != null && list.size() > 0) {
            this.f31430d = aa.a(list, acVar, this.f31430d);
        }
        this.f31442a = ImageReader.newInstance(this.f31430d.f31335a, this.f31430d.f31336b, 35, 1);
        this.f31442a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() {
            public final void onImageAvailable(ImageReader imageReader) {
                Image acquireLatestImage = imageReader.acquireLatestImage();
                if (acquireLatestImage != null) {
                    e eVar = new e(acquireLatestImage.getWidth(), acquireLatestImage.getHeight(), System.currentTimeMillis() * 1000);
                    eVar.a(new ae(acquireLatestImage.getPlanes()), d.this.f31431e.m(), d.this.f31429c, d.this.f31431e.o);
                    d.this.a(eVar);
                }
            }
        }, this.f31431e.k);
        return 0;
    }

    @RequiresApi(api = 21)
    public final int a(@NonNull StreamConfigurationMap streamConfigurationMap, ac acVar) {
        int i;
        int[] outputFormats = streamConfigurationMap.getOutputFormats();
        int i2 = 17;
        int i3 = 0;
        switch (e.AnonymousClass1.f31403a[this.f31429c.ordinal()]) {
            case 1:
                i = 35;
                break;
            case 2:
                i = 842094169;
                break;
            case 3:
                i = 17;
                break;
            case 4:
                i = 16;
                break;
            case 5:
            case 6:
                i = 39;
                break;
            case com.ss.android.ugc.aweme.commercialize.loft.model.e.l /*?: ONE_ARG  (7 int)*/:
                i = 41;
                break;
            case 8:
                i = 42;
                break;
            case 9:
                i = 256;
                break;
            default:
                i = 0;
                break;
        }
        int length = outputFormats.length;
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                int i5 = outputFormats[i4];
                if (i5 == i) {
                    i3 = i5;
                } else {
                    i4++;
                }
            }
        }
        if (i3 == 0) {
            this.f31429c = e.b.PIXEL_FORMAT_NV21;
        } else {
            i2 = i3;
        }
        return a(a(streamConfigurationMap.getOutputSizes(i2)), acVar);
    }
}
