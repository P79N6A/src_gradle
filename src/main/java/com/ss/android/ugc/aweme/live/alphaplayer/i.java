package com.ss.android.ugc.aweme.live.alphaplayer;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.ss.android.ugc.aweme.live.alphaplayer.d;
import com.ss.android.ugc.aweme.live.alphaplayer.e;

public interface i extends SurfaceTexture.OnFrameAvailableListener, e.m {

    public interface a {
        void a(Surface surface);
    }

    void a();

    void a(float f2, float f3, float f4, float f5);

    void a(d.a aVar);

    void a(a aVar);

    void a(String str);
}
