package dmt.av.video;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.vesdk.VEVideoEncodeSettings;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82813a;

    public static int a(float f2) {
        return (int) (f2 * 4.0f * 1000.0f * 1000.0f);
    }

    public static int a(int i) {
        return i;
    }

    public static long a(long j) {
        return j;
    }

    public static int b(int i) {
        return i;
    }

    @Nullable
    public static VEVideoEncodeSettings.d c(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f82813a, true, 91943, new Class[]{Integer.TYPE}, VEVideoEncodeSettings.d.class)) {
            return (VEVideoEncodeSettings.d) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f82813a, true, 91943, new Class[]{Integer.TYPE}, VEVideoEncodeSettings.d.class);
        }
        VEVideoEncodeSettings.d[] values = VEVideoEncodeSettings.d.values();
        if (i2 < 0 || i2 >= values.length) {
            return null;
        }
        return values[i2];
    }
}
