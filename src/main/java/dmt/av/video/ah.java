package dmt.av.video;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.utils.co;
import com.ss.android.ugc.aweme.utils.g;
import com.ss.android.vesdk.VEUtils;

public final class ah {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82889a;

    public static int[] a(@NonNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f82889a, true, 92131, new Class[]{String.class}, int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[]{str2}, null, f82889a, true, 92131, new Class[]{String.class}, int[].class);
        }
        int[] iArr = new int[10];
        if (TEVideoUtils.getVideoFileInfo(g.a(str2, co.VIDEO), iArr) == 0) {
            return iArr;
        }
        return null;
    }

    public static int b(@NonNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f82889a, true, 92132, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, null, f82889a, true, 92132, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        int[] iArr = new int[10];
        if (TEVideoUtils.getVideoFileInfo(g.a(str2, co.VIDEO), iArr) == 0) {
            return iArr[7];
        }
        return 0;
    }

    public static int c(@NonNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f82889a, true, 92133, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, null, f82889a, true, 92133, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        int[] iArr = new int[10];
        if (TEVideoUtils.getVideoFileInfo(g.a(str2, co.VIDEO), iArr) == 0) {
            return iArr[6];
        }
        return 0;
    }

    public static int d(@NonNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f82889a, true, 92135, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, null, f82889a, true, 92135, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        int[] iArr = new int[10];
        if (VEUtils.getVideoFileInfo(g.a(str2, co.VIDEO), iArr) == 0) {
            return iArr[2];
        }
        return 0;
    }
}
