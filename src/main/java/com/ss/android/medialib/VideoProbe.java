package com.ss.android.medialib;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ttve.nativePort.b;

public final class VideoProbe {

    public static class VideoInfo {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29326a;

        /* renamed from: b  reason: collision with root package name */
        public long f29327b;

        /* renamed from: c  reason: collision with root package name */
        public String f29328c;

        /* renamed from: d  reason: collision with root package name */
        public long f29329d;

        /* renamed from: e  reason: collision with root package name */
        public long f29330e;

        /* renamed from: f  reason: collision with root package name */
        public int f29331f;
        public int g;
        public float h;
        public int i;

        public String toString() {
            if (PatchProxy.isSupport(new Object[0], this, f29326a, false, 16600, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f29326a, false, 16600, new Class[0], String.class);
            }
            return "VideoInfo{duration=" + this.f29327b + ", videoCodec='" + this.f29328c + '\'' + ", nbFrames=" + this.f29329d + ", videoBitRate=" + this.f29330e + ", width=" + this.f29331f + ", height=" + this.g + ", frameRate=" + this.h + ", rotate=" + this.i + '}';
        }
    }

    private static native VideoInfo nativeProbe(String str);

    static {
        b.a();
    }

    private VideoProbe() {
    }
}
