package com.ss.android.ugc.aweme.services.video;

import android.support.annotation.FloatRange;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class VEVolumeChangeOp {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int mType;
    @FloatRange(from = 0.0d, to = 1.0d)
    public final float mVolume;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71623, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71623, new Class[0], String.class);
        }
        return "VEVolumeChangeOp{mType=" + this.mType + ", mVolume=" + this.mVolume + '}';
    }

    public static VEVolumeChangeOp ofMusic(float f2) {
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, null, changeQuickRedirect, true, 71622, new Class[]{Float.TYPE}, VEVolumeChangeOp.class)) {
            return new VEVolumeChangeOp(1, f2);
        }
        return (VEVolumeChangeOp) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, null, changeQuickRedirect, true, 71622, new Class[]{Float.TYPE}, VEVolumeChangeOp.class);
    }

    public static VEVolumeChangeOp ofVoice(float f2) {
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, null, changeQuickRedirect, true, 71621, new Class[]{Float.TYPE}, VEVolumeChangeOp.class)) {
            return new VEVolumeChangeOp(0, f2);
        }
        return (VEVolumeChangeOp) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, null, changeQuickRedirect, true, 71621, new Class[]{Float.TYPE}, VEVolumeChangeOp.class);
    }

    private VEVolumeChangeOp(int i, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.mType = i;
        this.mVolume = f2;
    }
}
