package com.ss.android.ugc.aweme.common;

import android.content.Context;
import android.hardware.SensorManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.sharedpref.c;
import com.ss.android.ugc.aweme.main.b;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\b\u0010\n\u001a\u00020\u0006H\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/common/DouCompatParams;", "", "()V", "getSuitableThreshold", "", "isOppoF7", "", "isSupportGyroscope", "context", "Landroid/content/Context;", "isVivo1606", "isVivoX7", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40232a;

    /* renamed from: b  reason: collision with root package name */
    public static final k f40233b = new k();

    private k() {
    }

    @JvmStatic
    public static final boolean a(@Nullable Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f40232a, true, 33278, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f40232a, true, 33278, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (context2 == null) {
            return false;
        } else {
            Object systemService = context2.getSystemService("sensor");
            if (systemService == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.hardware.SensorManager");
            } else if (((SensorManager) systemService).getDefaultSensor(4) == null || !((b) c.a(context2, b.class)).a(true)) {
                return false;
            } else {
                return true;
            }
        }
    }
}
