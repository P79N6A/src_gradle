package com.benchmark;

import com.ss.android.common.applog.GlobalContext;
import com.ss.android.vesdk.VEBenchmark;

public final class n {
    private static n h = new n();

    /* renamed from: a  reason: collision with root package name */
    public String f7508a = (GlobalContext.getContext().getFilesDir().getPath() + "/benchmark/");

    /* renamed from: b  reason: collision with root package name */
    public String f7509b = (this.f7508a + "image.png");

    /* renamed from: c  reason: collision with root package name */
    public String f7510c = (this.f7508a + "h264_video.mp4");

    /* renamed from: d  reason: collision with root package name */
    public String f7511d = (this.f7508a + "h265_video.mp4");

    /* renamed from: e  reason: collision with root package name */
    public String f7512e = (this.f7508a + "h264_video.yuv");

    /* renamed from: f  reason: collision with root package name */
    public String f7513f = (this.f7508a + "h265_video.yuv");
    public String g = (this.f7508a + "h264_encode_video.mp4");
    private int i = -1;

    public static n a() {
        return h;
    }

    public final void c() {
        if (this.i == 0) {
            VEBenchmark.a().b();
            this.i = -1;
        }
    }

    public final int b() {
        if (this.i == 0) {
            return this.i;
        }
        this.i = VEBenchmark.a().a(GlobalContext.getContext(), this.f7509b);
        return this.i;
    }

    private n() {
    }
}
