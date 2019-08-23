package com.ss.android.ugc.lib.video.bitrate.regulator;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;

public class c implements Serializable, Comparable<c> {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 7003130400674500845L;
    public final double mDownThreshold;
    public final double mRate;
    public final double mUpThreshold;

    public double getMedianThreshold() {
        return (this.mDownThreshold + this.mUpThreshold) / 2.0d;
    }

    public int hashCode() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90460, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90460, new Class[0], Integer.TYPE)).intValue();
        }
        long doubleToLongBits = Double.doubleToLongBits(this.mRate);
        long doubleToLongBits2 = Double.doubleToLongBits(this.mDownThreshold);
        long doubleToLongBits3 = Double.doubleToLongBits(this.mUpThreshold);
        return (((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90458, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90458, new Class[0], String.class);
        }
        return "Shift{mRate=" + this.mRate + ", mDownThreshold=" + this.mDownThreshold + ", mUpThreshold=" + this.mUpThreshold + '}';
    }

    public int compareTo(c cVar) {
        c cVar2 = cVar;
        if (!PatchProxy.isSupport(new Object[]{cVar2}, this, changeQuickRedirect, false, 90459, new Class[]{c.class}, Integer.TYPE)) {
            return Double.compare(this.mRate, cVar2.mRate);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{cVar2}, this, changeQuickRedirect, false, 90459, new Class[]{c.class}, Integer.TYPE)).intValue();
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 90461, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 90461, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (Double.compare(cVar.mRate, this.mRate) == 0 && Double.compare(cVar.mDownThreshold, this.mDownThreshold) == 0 && Double.compare(cVar.mUpThreshold, this.mUpThreshold) == 0) {
                return true;
            }
            return false;
        }
    }

    public c(double d2, double d3, double d4) {
        this.mRate = d2;
        this.mDownThreshold = d3;
        this.mUpThreshold = d4;
    }
}
