package com.ss.android.ugc.aweme.tools;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class al extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74619a;

    /* renamed from: b  reason: collision with root package name */
    public static al f74620b;

    /* renamed from: c  reason: collision with root package name */
    public static int f74621c;

    /* renamed from: d  reason: collision with root package name */
    public int f74622d;

    /* renamed from: e  reason: collision with root package name */
    public al f74623e;

    /* renamed from: f  reason: collision with root package name */
    public float f74624f;
    public float g;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f74619a, false, 86986, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74619a, false, 86986, new Class[0], String.class);
        }
        return "RecordingScaleRatioEvent{flags=" + this.f74622d + ", next=" + this.f74623e + ", mCurrentY=" + this.f74624f + ", mBottom=" + this.g + '}';
    }

    public al(float f2, float f3) {
        this.f74624f = f2;
        this.g = f3;
    }
}
