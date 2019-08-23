package dmt.av.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class r {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f83057a;

    /* renamed from: b  reason: collision with root package name */
    public int f83058b;

    /* renamed from: c  reason: collision with root package name */
    public int f83059c;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f83057a, false, 92012, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f83057a, false, 92012, new Class[0], String.class);
        }
        return "VEMusicStartChangeOp{mStartMillis=" + this.f83058b + ", mDuration=" + this.f83059c + '}';
    }

    private r(int i, int i2) {
        this.f83058b = i;
        this.f83059c = i2;
    }

    public static r a(int i, int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, f83057a, true, 92011, new Class[]{Integer.TYPE, Integer.TYPE}, r.class)) {
            return new r(i, i2);
        }
        return (r) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, f83057a, true, 92011, new Class[]{Integer.TYPE, Integer.TYPE}, r.class);
    }
}
