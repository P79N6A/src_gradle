package com.ss.android.ttvecamera.f;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.util.Size;
import android.view.Surface;
import com.ss.android.ttvecamera.ac;
import com.ss.android.ttvecamera.c;
import com.ss.android.ttvecamera.e;
import com.ss.android.ttvecamera.f.c;
import java.util.ArrayList;
import java.util.List;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private a f31427a = new a() {
        public final void onFrameCaptured(e eVar) {
        }
    };

    /* renamed from: b  reason: collision with root package name */
    a f31428b;

    /* renamed from: c  reason: collision with root package name */
    public e.b f31429c;

    /* renamed from: d  reason: collision with root package name */
    public ac f31430d = new ac();

    /* renamed from: e  reason: collision with root package name */
    c f31431e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f31432f = true;

    public interface a {
        void onFrameCaptured(e eVar);
    }

    public int a(@NonNull StreamConfigurationMap streamConfigurationMap, ac acVar) {
        return -1;
    }

    public abstract int a(List<ac> list, ac acVar);

    public abstract Surface a();

    public abstract SurfaceTexture b();

    public abstract int c();

    public void d() {
        this.f31428b = this.f31427a;
    }

    @RequiresApi(api = 21)
    public static List<ac> a(Size[] sizeArr) {
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            arrayList.add(new ac(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    public final void a(e eVar) {
        if (this.f31428b != null) {
            this.f31428b.onFrameCaptured(eVar);
        }
    }

    public b(c.a aVar, com.ss.android.ttvecamera.c cVar) {
        this.f31429c = aVar.f31441f;
        this.f31428b = aVar.f31438c;
        this.f31430d = aVar.f31437b;
        this.f31431e = cVar;
        this.f31432f = aVar.f31436a;
    }
}
