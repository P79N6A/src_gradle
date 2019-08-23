package dmt.av.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class s {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f83060a;

    /* renamed from: b  reason: collision with root package name */
    public final int f83061b;

    /* renamed from: c  reason: collision with root package name */
    public final long f83062c;

    public static s a() {
        if (PatchProxy.isSupport(new Object[0], null, f83060a, true, 92013, new Class[0], s.class)) {
            return (s) PatchProxy.accessDispatch(new Object[0], null, f83060a, true, 92013, new Class[0], s.class);
        }
        return new s(0);
    }

    public static s b() {
        if (PatchProxy.isSupport(new Object[0], null, f83060a, true, 92014, new Class[0], s.class)) {
            return (s) PatchProxy.accessDispatch(new Object[0], null, f83060a, true, 92014, new Class[0], s.class);
        }
        return new s(1);
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f83060a, false, 92017, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f83060a, false, 92017, new Class[0], String.class);
        }
        return "VEPreviewControlOp{mType=" + this.f83061b + ", mSeekTo=" + this.f83062c + '}';
    }

    private s(int i) {
        this(i, 0);
    }

    public static s a(long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f83060a, true, 92015, new Class[]{Long.TYPE}, s.class)) {
            return new s(2, j2);
        }
        return (s) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f83060a, true, 92015, new Class[]{Long.TYPE}, s.class);
    }

    public static s b(long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f83060a, true, 92016, new Class[]{Long.TYPE}, s.class)) {
            return new s(3, j2);
        }
        return (s) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f83060a, true, 92016, new Class[]{Long.TYPE}, s.class);
    }

    private s(int i, long j) {
        this.f83061b = i;
        this.f83062c = j;
    }
}
