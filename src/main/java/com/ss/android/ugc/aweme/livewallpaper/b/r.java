package com.ss.android.ugc.aweme.livewallpaper.b;

import android.opengl.GLES20;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class r extends o {
    public static ChangeQuickRedirect j;
    private int i;
    private int k;

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 56199, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 56199, new Class[0], Void.TYPE);
            return;
        }
        super.c();
        if (this.i != 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{this.i}, 0);
            this.i = 0;
        }
        if (this.k != 0) {
            GLES20.glDeleteTextures(1, new int[]{this.k}, 0);
            this.k = 0;
        }
    }

    public final boolean a(int i2, int i3) {
        boolean z;
        int i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, j, false, 56194, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, j, false, 56194, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (PatchProxy.isSupport(new Object[0], this, j, false, 56201, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 56201, new Class[0], Void.TYPE);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, i.f53625a, true, 56121, new Class[0], Integer.TYPE)) {
                i4 = ((Integer) PatchProxy.accessDispatch(new Object[0], null, i.f53625a, true, 56121, new Class[0], Integer.TYPE)).intValue();
            } else {
                int[] iArr = new int[1];
                GLES20.glGenFramebuffers(1, iArr, 0);
                i4 = iArr[0];
            }
            this.i = i4;
        }
        if (super.a(i2, i3)) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, j, false, 56200, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, j, false, 56200, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            } else {
                this.k = i.a(null, i2, i3, 6408);
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
