package com.ss.android.ugc.aweme.shortvideo.cover;

import a.i;
import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.photomovie.edit.cover.b;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.vesdk.VEListener;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public final /* synthetic */ class e implements VEListener.l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66118a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoCoverGeneratorImpl f66119b;

    /* renamed from: c  reason: collision with root package name */
    private final b.a f66120c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicInteger f66121d;

    e(VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl, b.a aVar, AtomicInteger atomicInteger) {
        this.f66119b = vEVideoCoverGeneratorImpl;
        this.f66120c = aVar;
        this.f66121d = atomicInteger;
    }

    public final int a(byte[] bArr, int i, int i2, int i3, float f2) {
        if (PatchProxy.isSupport(new Object[]{bArr, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2)}, this, f66118a, false, 75386, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{bArr, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2)}, this, f66118a, false, 75386, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
        }
        VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl = this.f66119b;
        b.a aVar = this.f66120c;
        AtomicInteger atomicInteger = this.f66121d;
        if (bArr != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
            i.a((Callable<TResult>) new f<TResult>(aVar, createBitmap), i.f1052b);
            atomicInteger.incrementAndGet();
        } else {
            vEVideoCoverGeneratorImpl.f3911c.x();
            if (atomicInteger.get() != vEVideoCoverGeneratorImpl.f3910b) {
                ai.b("VEVideoCoverGeneratorImpl:取到的封面张数不符合预期，预期" + vEVideoCoverGeneratorImpl.f3910b + "张，实际" + atomicInteger.get() + "张");
            }
        }
        return 0;
    }
}
