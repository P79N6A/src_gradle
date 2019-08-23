package com.ss.android.ugc.aweme.shortvideo.c;

import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.q.c;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0002J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0007J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0007J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0010H\u0007J \u0010\u0015\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/beauty/BeautyParamsPreference;", "", "()V", "BEAUTY_PARAMS_DEFAULT_PREFIX", "", "BEAUTY_PARAMS_MAX_PREFIX", "sPreferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "sPreferences$annotations", "generateDefaultKey", "type", "", "gender", "generateMaxKey", "getBeautyDefaultValue", "", "getBeautyMaxValue", "saveBeautyDefaultValue", "", "value", "saveBeautyMaxValue", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65861a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f65862b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static final SharedPreferences f65863c = c.a(a.f61119b, "beauty_params", 0);

    private b() {
    }

    private final String c(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f65861a, false, 75196, new Class[]{Integer.TYPE, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f65861a, false, 75196, new Class[]{Integer.TYPE, String.class}, String.class);
        }
        return "beauty_params_default" + i + str2;
    }

    private final String d(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f65861a, false, 75197, new Class[]{Integer.TYPE, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f65861a, false, 75197, new Class[]{Integer.TYPE, String.class}, String.class);
        }
        return "beauty_params_max" + i + str2;
    }

    @JvmStatic
    public static final float a(int i, @NotNull String str) {
        float f2;
        int i2 = i;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, null, f65861a, true, 75194, new Class[]{Integer.TYPE, String.class}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, null, f65861a, true, 75194, new Class[]{Integer.TYPE, String.class}, Float.TYPE)).floatValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, "gender");
        float f3 = f65863c.getFloat(f65862b.c(i2, str2), -1.0f);
        if (f3 == -1.0f) {
            if (!Intrinsics.areEqual((Object) str2, (Object) PushConstants.PUSH_TYPE_NOTIFY)) {
                f2 = f65863c.getFloat(f65862b.c(i2, PushConstants.PUSH_TYPE_NOTIFY), -1.0f);
            } else {
                f2 = f65863c.getFloat(f65862b.c(i2, PushConstants.PUSH_TYPE_UPLOAD_LOG), -1.0f);
            }
            f3 = f2;
        }
        return f3;
    }

    @JvmStatic
    public static final float b(int i, @NotNull String str) {
        float f2;
        int i2 = i;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, null, f65861a, true, 75195, new Class[]{Integer.TYPE, String.class}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, null, f65861a, true, 75195, new Class[]{Integer.TYPE, String.class}, Float.TYPE)).floatValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, "gender");
        float f3 = f65863c.getFloat(f65862b.d(i2, str2), -1.0f);
        if (f3 == -1.0f) {
            if (!Intrinsics.areEqual((Object) str2, (Object) PushConstants.PUSH_TYPE_NOTIFY)) {
                f2 = f65863c.getFloat(f65862b.d(i2, PushConstants.PUSH_TYPE_NOTIFY), -1.0f);
            } else {
                f2 = f65863c.getFloat(f65862b.d(i2, PushConstants.PUSH_TYPE_UPLOAD_LOG), -1.0f);
            }
            f3 = f2;
        }
        return f3;
    }

    @JvmStatic
    public static final void a(int i, @NotNull String str, float f2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2, Float.valueOf(f2)}, null, f65861a, true, 75192, new Class[]{Integer.TYPE, String.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2, Float.valueOf(f2)}, null, f65861a, true, 75192, new Class[]{Integer.TYPE, String.class, Float.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "gender");
        f65863c.edit().putFloat(f65862b.c(i, str2), f2).commit();
    }

    @JvmStatic
    public static final void b(int i, @NotNull String str, float f2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2, Float.valueOf(f2)}, null, f65861a, true, 75193, new Class[]{Integer.TYPE, String.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2, Float.valueOf(f2)}, null, f65861a, true, 75193, new Class[]{Integer.TYPE, String.class, Float.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "gender");
        f65863c.edit().putFloat(f65862b.d(i, str2), f2).commit();
    }
}
