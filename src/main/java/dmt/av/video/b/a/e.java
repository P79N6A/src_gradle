package dmt.av.video.b.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.vesdk.l;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0002\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0007H\u0000\u001a\f\u0010\n\u001a\u00020\u000b*\u00020\u0007H\u0000\u001a\f\u0010\f\u001a\u00020\r*\u00020\u0007H\u0000\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0010H\u0000¨\u0006\u0011"}, d2 = {"copySettingsFrom", "", "Lcom/ss/android/vesdk/VECameraSettings;", "params", "Lcom/ss/android/medialib/camera/CameraParams;", "hardwareLevel", "Lcom/ss/android/vesdk/VECameraSettings$CAMERA_HW_LEVEL;", "", "toCameraType", "Lcom/ss/android/vesdk/VECameraSettings$CAMERA_TYPE;", "toFacingId", "Lcom/ss/android/vesdk/VECameraSettings$CAMERA_FACING_ID;", "toFlashMode", "Lcom/ss/android/vesdk/VECameraSettings$CAMERA_FLASH_MODE;", "toNewCameraZoomListener", "Lcom/ss/android/vesdk/VERecorder$VECameraZoomListener;", "Lcom/ss/android/medialib/camera/IESCameraInterface$ZoomListener;", "tools.dmt-av-impl_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82911a;

    @NotNull
    public static final l.b a(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f82911a, true, 92376, new Class[]{Integer.TYPE}, l.b.class)) {
            return (l.b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f82911a, true, 92376, new Class[]{Integer.TYPE}, l.b.class);
        } else if (i2 == 4) {
            return l.b.FACING_3RD;
        } else {
            switch (i2) {
                case 0:
                    return l.b.FACING_BACK;
                case 1:
                    return l.b.FACING_FRONT;
                case 2:
                    return l.b.FACING_WIDE_ANGLE;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @NotNull
    public static final l.f b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f82911a, true, 92377, new Class[]{Integer.TYPE}, l.f.class)) {
            return (l.f) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f82911a, true, 92377, new Class[]{Integer.TYPE}, l.f.class);
        }
        switch (i) {
            case 0:
                return l.f.NULL;
            case 1:
                return l.f.TYPE1;
            case 2:
                return l.f.TYPE2;
            case 3:
                return l.f.TYPE_HuaWei;
            case 4:
                return l.f.TYPE_Mi;
            case 5:
                return l.f.TYPE_Oppo;
            default:
                throw new IllegalStateException();
        }
    }
}
