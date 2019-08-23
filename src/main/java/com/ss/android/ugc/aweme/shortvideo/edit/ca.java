package com.ss.android.ugc.aweme.shortvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a6\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b¨\u0006\u000f"}, d2 = {"editInVideoExpandMode", "", "model", "Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", "needTransformCoordinates", "transformXY", "", "x", "", "y", "canvasWidth", "", "canvasHeight", "outWidth", "outHeight", "tools.dmt-av-impl_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
@JvmName
public final class ca {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67161a;

    public static final boolean a(@NotNull cb cbVar) {
        cb cbVar2 = cbVar;
        if (PatchProxy.isSupport(new Object[]{cbVar2}, null, f67161a, true, 76544, new Class[]{cb.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{cbVar2}, null, f67161a, true, 76544, new Class[]{cb.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(cbVar2, "model");
        if (cbVar2.mVideoCanvasWidth <= 0 || cbVar2.mVideoCanvasHeight <= 0 || (cbVar2.mVideoCanvasWidth < cbVar2.mVideoWidth && cbVar2.mVideoCanvasHeight < cbVar2.mVideoHeight)) {
            return false;
        }
        return true;
    }

    public static final boolean b(@NotNull cb cbVar) {
        cb cbVar2 = cbVar;
        if (PatchProxy.isSupport(new Object[]{cbVar2}, null, f67161a, true, 76545, new Class[]{cb.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{cbVar2}, null, f67161a, true, 76545, new Class[]{cb.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(cbVar2, "model");
        if (cbVar2.mVideoCanvasWidth == cbVar2.mOutVideoWidth && cbVar2.mVideoCanvasHeight == cbVar2.mOutVideoHeight) {
            return false;
        }
        return true;
    }

    @NotNull
    public static final float[] a(float f2, float f3, int i, int i2, int i3, int i4) {
        float f4;
        float f5;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, null, f67161a, true, 76546, new Class[]{Float.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, float[].class)) {
            Object[] objArr = {Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            return (float[]) PatchProxy.accessDispatch(objArr, null, f67161a, true, 76546, new Class[]{Float.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, float[].class);
        }
        float f6 = (float) i3;
        float f7 = (float) i;
        float f8 = (f6 * 1.0f) / f7;
        float f9 = (float) i4;
        float f10 = (float) i2;
        float f11 = (1.0f * f9) / f10;
        if (f8 == f11) {
            return new float[]{f2, f3};
        }
        float max = Math.max(f8, f11);
        if (max == f8) {
            f4 = (((f3 * f10) * max) - (((f10 * max) - f9) / 2.0f)) / f9;
            f5 = f2;
        } else {
            f5 = (((f2 * f7) * max) - (((f7 * max) - f6) / 2.0f)) / f6;
            f4 = f3;
        }
        return new float[]{f5, f4};
    }
}
