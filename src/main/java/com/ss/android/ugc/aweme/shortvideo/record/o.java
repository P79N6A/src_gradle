package com.ss.android.ugc.aweme.shortvideo.record;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.property.f;
import com.ss.android.ugc.aweme.tools.am;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import dmt.av.video.b.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69126a;

    private static boolean a(int i) {
        return i == 1 || i == 2 || i == 8;
    }

    public static VEVideoEncodeSettings.e a() {
        if (PatchProxy.isSupport(new Object[0], null, f69126a, true, 78395, new Class[0], VEVideoEncodeSettings.e.class)) {
            return (VEVideoEncodeSettings.e) PatchProxy.accessDispatch(new Object[0], null, f69126a, true, 78395, new Class[0], VEVideoEncodeSettings.e.class);
        }
        int b2 = b();
        if (b2 == 8) {
            return VEVideoEncodeSettings.e.ENCODE_PROFILE_HIGH;
        }
        switch (b2) {
            case 1:
                return VEVideoEncodeSettings.e.ENCODE_PROFILE_BASELINE;
            case 2:
                return VEVideoEncodeSettings.e.ENCODE_PROFILE_MAIN;
            default:
                return VEVideoEncodeSettings.e.ENCODE_PROFILE_UNKNOWN;
        }
    }

    private static int b() {
        int i;
        if (PatchProxy.isSupport(new Object[0], null, f69126a, true, 78394, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f69126a, true, 78394, new Class[0], Integer.TYPE)).intValue();
        }
        if (a.L.b(e.a.RecordHardwareProfile) != 1) {
            i = a.L.b(e.a.RecordHardwareProfile);
        } else if (a.M.b(a.C0682a.RecordHardwareProfile) != 1) {
            i = com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.RecordHardwareProfile);
        } else {
            i = 1;
        }
        if (!a(i)) {
            i = 1;
        }
        return i;
    }

    public static void a(@NonNull y yVar, boolean z, am amVar, Function1<Integer, Unit> function1) {
        if (PatchProxy.isSupport(new Object[]{yVar, Byte.valueOf(z ? (byte) 1 : 0), amVar, function1}, null, f69126a, true, 78393, new Class[]{y.class, Boolean.TYPE, am.class, Function1.class}, Void.TYPE)) {
            Object[] objArr = {yVar, Byte.valueOf(z), amVar, function1};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f69126a, true, 78393, new Class[]{y.class, Boolean.TYPE, am.class, Function1.class}, Void.TYPE);
            return;
        }
        y yVar2 = yVar;
        yVar2.a((double) amVar.value(), !z, f.e(), com.ss.android.ugc.aweme.port.in.a.L.b(e.a.RecordBitrateMode), b(), false, function1);
    }
}
