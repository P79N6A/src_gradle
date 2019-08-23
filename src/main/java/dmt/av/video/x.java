package dmt.av.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class x implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f83081a;

    /* renamed from: b  reason: collision with root package name */
    public final String f83082b;

    /* renamed from: c  reason: collision with root package name */
    public final long f83083c;

    /* renamed from: d  reason: collision with root package name */
    public int f83084d;

    public static x a() {
        if (PatchProxy.isSupport(new Object[0], null, f83081a, true, 92031, new Class[0], x.class)) {
            return (x) PatchProxy.accessDispatch(new Object[0], null, f83081a, true, 92031, new Class[0], x.class);
        }
        return new x(PushConstants.PUSH_TYPE_NOTIFY, 0);
    }

    public static x b() {
        if (PatchProxy.isSupport(new Object[0], null, f83081a, true, 92032, new Class[0], x.class)) {
            return (x) PatchProxy.accessDispatch(new Object[0], null, f83081a, true, 92032, new Class[0], x.class);
        }
        return new x(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, 0);
    }

    /* renamed from: c */
    public final x clone() {
        if (PatchProxy.isSupport(new Object[0], this, f83081a, false, 92038, new Class[0], x.class)) {
            return (x) PatchProxy.accessDispatch(new Object[0], this, f83081a, false, 92038, new Class[0], x.class);
        }
        try {
            return (x) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f83081a, false, 92037, new Class[0], Integer.TYPE)) {
            return super.hashCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f83081a, false, 92037, new Class[0], Integer.TYPE)).intValue();
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f83081a, false, 92036, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f83081a, false, 92036, new Class[0], String.class);
        }
        return "VETimeEffectOp{mType='" + this.f83082b + '\'' + ", mTimePoint=" + this.f83083c + ", mIndex=" + this.f83084d + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f83082b == xVar.f83082b && this.f83083c == xVar.f83083c && this.f83084d == xVar.f83084d) {
            return true;
        }
        return false;
    }

    public static x a(long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f83081a, true, 92033, new Class[]{Long.TYPE}, x.class)) {
            return new x(PushConstants.PUSH_TYPE_UPLOAD_LOG, j2);
        }
        return (x) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f83081a, true, 92033, new Class[]{Long.TYPE}, x.class);
    }

    public static x b(long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f83081a, true, 92034, new Class[]{Long.TYPE}, x.class)) {
            return new x("3", j2);
        }
        return (x) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f83081a, true, 92034, new Class[]{Long.TYPE}, x.class);
    }

    public x(String str, long j) {
        this.f83082b = str;
        this.f83083c = j;
    }
}
