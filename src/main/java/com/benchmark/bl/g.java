package com.benchmark.bl;

import com.benchmark.a;
import com.benchmark.n;
import java.util.concurrent.Callable;

public final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final String f7486a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7487b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7488c;

    g(String str, String str2, String str3) {
        this.f7486a = str;
        this.f7487b = str2;
        this.f7488c = str3;
    }

    public final Object call() {
        String str = this.f7486a;
        String str2 = this.f7487b;
        String str3 = this.f7488c;
        boolean a2 = a.a(n.a().f7509b, str);
        boolean a3 = a.a(n.a().f7510c, str2);
        boolean a4 = a.a(n.a().f7511d, str3);
        if (!a2) {
            a2 = a.a(str, n.a().f7508a, "image.png");
        }
        if (!a3) {
            a3 = a.a(str2, n.a().f7508a, "h264_video.mp4");
        }
        if (!a4) {
            a4 = a.a(str3, n.a().f7508a, "h265_video.mp4");
        }
        return Boolean.valueOf(a2 && a3 && a4);
    }
}
