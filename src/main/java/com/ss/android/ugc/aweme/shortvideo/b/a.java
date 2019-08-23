package com.ss.android.ugc.aweme.shortvideo.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.jni.EffectThumb;
import com.ss.android.ugc.aweme.utils.co;
import com.ss.android.ugc.aweme.utils.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/androidq/QEffectThumb;", "Lcom/ss/android/medialib/jni/EffectThumb;", "()V", "init", "", "path", "", "trimIn", "", "trimOut", "speed", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends EffectThumb {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65769a;

    public final int init(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f65769a, false, 75084, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, this, f65769a, false, 75084, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, "path");
        return super.init(g.a(str2, co.VIDEO));
    }

    public final int init(@NotNull String str, long j, long j2, float f2) {
        String str2 = str;
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j3), new Long(j4), Float.valueOf(f2)}, this, f65769a, false, 75085, new Class[]{String.class, Long.TYPE, Long.TYPE, Float.TYPE}, Integer.TYPE)) {
            Object[] objArr = {str2, new Long(j3), new Long(j4), Float.valueOf(f2)};
            return ((Integer) PatchProxy.accessDispatch(objArr, this, f65769a, false, 75085, new Class[]{String.class, Long.TYPE, Long.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, "path");
        return super.init(g.a(str2, co.VIDEO), j, j2, f2);
    }
}
