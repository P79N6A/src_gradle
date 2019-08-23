package dmt.av.video.b.a;

import android.content.Context;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.camera.g;
import com.ss.android.vesdk.k;
import dmt.av.video.b.n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\f"}, d2 = {"Ldmt/av/video/record/camera/CameraDeviceAbility;", "", "()V", "isHwSupported", "", "context", "Landroid/content/Context;", "isSupportAntiShake", "cameraType", "", "cameraPosition", "isSupportWideAngle", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82890a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f82891b = new a();

    private a() {
    }

    @JvmStatic
    public static final boolean a(@NotNull Context context, int i) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i)}, null, f82890a, true, 92296, new Class[]{Context.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i)}, null, f82890a, true, 92296, new Class[]{Context.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        if (!n.a()) {
            return g.a(context, i);
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("device_support_wide_angle", false);
        k.a(context2, e.b(i), bundle);
        return bundle.getBoolean("device_support_wide_angle");
    }

    @JvmStatic
    public static final boolean a(@NotNull Context context, int i, int i2) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, 5, 0}, null, f82890a, true, 92297, new Class[]{Context.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, 5, 0}, null, f82890a, true, 92297, new Class[]{Context.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        if (!n.a()) {
            return g.a(context2, 5, 0);
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("support_anti_shake", null);
        k.a(context2, e.b(5), bundle);
        Map map = (Map) bundle.getSerializable("support_anti_shake");
        if (map != null) {
            Boolean bool = (Boolean) map.get(0);
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }
}
