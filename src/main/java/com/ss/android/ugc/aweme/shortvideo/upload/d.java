package com.ss.android.ugc.aweme.shortvideo.upload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.upload.a;
import java.util.List;
import java.util.concurrent.Callable;

public final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71013a;

    /* renamed from: b  reason: collision with root package name */
    private final a.AnonymousClass1.AnonymousClass1 f71014b;

    /* renamed from: c  reason: collision with root package name */
    private final int f71015c;

    /* renamed from: d  reason: collision with root package name */
    private final int f71016d;

    /* renamed from: e  reason: collision with root package name */
    private final float f71017e;

    d(a.AnonymousClass1.AnonymousClass1 r1, int i, int i2, float f2) {
        this.f71014b = r1;
        this.f71015c = i;
        this.f71016d = i2;
        this.f71017e = f2;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f71013a, false, 80771, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f71013a, false, 80771, new Class[0], Object.class);
        }
        a.AnonymousClass1.AnonymousClass1 r0 = this.f71014b;
        int i = this.f71015c;
        int i2 = this.f71016d;
        float f2 = this.f71017e;
        List<String> list = a.this.f70948c;
        list.add("type:" + i + " ext:" + i2 + " f:" + f2);
        return null;
    }
}
