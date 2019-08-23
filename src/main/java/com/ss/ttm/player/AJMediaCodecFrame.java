package com.ss.ttm.player;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.nio.ByteBuffer;

public class AJMediaCodecFrame implements Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ByteBuffer data;
    public int flags;
    public int index;
    public long pts = -269488145;
    public int size;

    public AJMediaCodecFrame clone() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90575, new Class[0], AJMediaCodecFrame.class)) {
            return (AJMediaCodecFrame) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90575, new Class[0], AJMediaCodecFrame.class);
        }
        try {
            return (AJMediaCodecFrame) super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }
}
