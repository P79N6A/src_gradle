package com.ss.ttm.player;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.nio.ByteBuffer;

public class AJCodecBuffer implements Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ByteBuffer data;
    public int index;
    public long pts;
    public int size;

    public AJCodecBuffer clone() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90538, new Class[0], AJCodecBuffer.class)) {
            return (AJCodecBuffer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90538, new Class[0], AJCodecBuffer.class);
        }
        AJCodecBuffer aJCodecBuffer = null;
        try {
            aJCodecBuffer = (AJCodecBuffer) super.clone();
        } catch (Throwable unused) {
        }
        aJCodecBuffer.size = this.size;
        aJCodecBuffer.pts = this.pts;
        aJCodecBuffer.index = this.index;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.size);
        allocateDirect.put(this.data);
        aJCodecBuffer.data = allocateDirect;
        return aJCodecBuffer;
    }
}
