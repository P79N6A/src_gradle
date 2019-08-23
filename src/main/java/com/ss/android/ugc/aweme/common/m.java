package com.ss.android.ugc.aweme.common;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/common/EffectThumbInitConfigure;", "", "trimIn", "", "trimOut", "speed", "", "(IIF)V", "getSpeed", "()F", "getTrimIn", "()I", "getTrimOut", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40259a;

    /* renamed from: b  reason: collision with root package name */
    public final int f40260b;

    /* renamed from: c  reason: collision with root package name */
    public final int f40261c;

    /* renamed from: d  reason: collision with root package name */
    public final float f40262d;

    public m() {
        this(0, 0, 0.0f, 7);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f40259a, false, 33293, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f40259a, false, 33293, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof m) {
                m mVar = (m) obj;
                if (this.f40260b == mVar.f40260b) {
                    if (!(this.f40261c == mVar.f40261c) || Float.compare(this.f40262d, mVar.f40262d) != 0) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f40259a, false, 33292, new Class[0], Integer.TYPE)) {
            return (((this.f40260b * 31) + this.f40261c) * 31) + Float.floatToIntBits(this.f40262d);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f40259a, false, 33292, new Class[0], Integer.TYPE)).intValue();
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f40259a, false, 33291, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f40259a, false, 33291, new Class[0], String.class);
        }
        return "EffectThumbInitConfigure(trimIn=" + this.f40260b + ", trimOut=" + this.f40261c + ", speed=" + this.f40262d + ")";
    }

    public m(int i, int i2, float f2) {
        this.f40260b = i;
        this.f40261c = i2;
        this.f40262d = f2;
    }

    private /* synthetic */ m(int i, int i2, float f2, int i3) {
        this(-1, -1, 1.0f);
    }
}
