package com.ss.android.ugc.aweme.detail;

import android.graphics.BlurMaskFilter;
import android.support.annotation.ColorInt;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/detail/Shadow;", "", "blurRadius", "", "blur", "Landroid/graphics/BlurMaskFilter$Blur;", "dx", "dy", "shadowColor", "", "(FLandroid/graphics/BlurMaskFilter$Blur;FFI)V", "getBlur", "()Landroid/graphics/BlurMaskFilter$Blur;", "getBlurRadius", "()F", "getDx", "getDy", "getShadowColor", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41165a;

    /* renamed from: b  reason: collision with root package name */
    public final float f41166b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final BlurMaskFilter.Blur f41167c;

    /* renamed from: d  reason: collision with root package name */
    public final float f41168d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    public final float f41169e;

    /* renamed from: f  reason: collision with root package name */
    public final int f41170f;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f41165a, false, 34646, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f41165a, false, 34646, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (Float.compare(this.f41166b, dVar.f41166b) == 0 && Intrinsics.areEqual((Object) this.f41167c, (Object) dVar.f41167c) && Float.compare(this.f41168d, dVar.f41168d) == 0 && Float.compare(this.f41169e, dVar.f41169e) == 0) {
                    if (this.f41170f == dVar.f41170f) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f41165a, false, 34645, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f41165a, false, 34645, new Class[0], Integer.TYPE)).intValue();
        }
        int floatToIntBits = Float.floatToIntBits(this.f41166b) * 31;
        BlurMaskFilter.Blur blur = this.f41167c;
        if (blur != null) {
            i = blur.hashCode();
        }
        return ((((((floatToIntBits + i) * 31) + Float.floatToIntBits(this.f41168d)) * 31) + Float.floatToIntBits(this.f41169e)) * 31) + this.f41170f;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f41165a, false, 34644, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f41165a, false, 34644, new Class[0], String.class);
        }
        return "Shadow(blurRadius=" + this.f41166b + ", blur=" + this.f41167c + ", dx=" + this.f41168d + ", dy=" + this.f41169e + ", shadowColor=" + this.f41170f + ")";
    }

    public d(float f2, @NotNull BlurMaskFilter.Blur blur, float f3, float f4, @ColorInt int i) {
        Intrinsics.checkParameterIsNotNull(blur, "blur");
        this.f41166b = f2;
        this.f41167c = blur;
        this.f41169e = f4;
        this.f41170f = i;
    }
}
