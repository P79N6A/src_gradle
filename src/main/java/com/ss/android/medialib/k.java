package com.ss.android.medialib;

import android.annotation.TargetApi;
import android.media.Image;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.camera.j;
import java.nio.ByteBuffer;

@TargetApi(19)
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29679a;

    /* renamed from: b  reason: collision with root package name */
    j f29680b;

    public k(j jVar) {
        this.f29680b = jVar;
    }

    public final boolean a(int[][] iArr, ByteBuffer[] byteBufferArr) {
        if (PatchProxy.isSupport(new Object[]{iArr, byteBufferArr}, this, f29679a, false, 16590, new Class[]{int[][].class, ByteBuffer[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{iArr, byteBufferArr}, this, f29679a, false, 16590, new Class[]{int[][].class, ByteBuffer[].class}, Boolean.TYPE)).booleanValue();
        }
        com.ss.android.medialib.camera.k kVar = this.f29680b.f29607b;
        if (kVar == null) {
            return false;
        }
        Image.Plane[] planeArr = kVar.f29612a;
        if (planeArr == null) {
            return false;
        }
        for (int i = 0; i < planeArr.length; i++) {
            byteBufferArr[i] = planeArr[i].getBuffer();
            iArr[i] = new int[]{byteBufferArr[i].remaining(), planeArr[i].getRowStride(), planeArr[i].getPixelStride()};
        }
        return true;
    }
}
