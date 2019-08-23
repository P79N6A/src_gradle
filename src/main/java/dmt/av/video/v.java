package dmt.av.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class v {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f83071a;

    /* renamed from: b  reason: collision with root package name */
    public int f83072b;

    /* renamed from: c  reason: collision with root package name */
    public int f83073c;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f83071a, false, 92026, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f83071a, false, 92026, new Class[0], String.class);
        }
        return "VEPreviewScaleOp{mOp=" + this.f83072b + ", mBackgroundColor=" + this.f83073c + '}';
    }
}
