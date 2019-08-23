package com.ss.android.ugc.aweme.draft.a;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J2\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/draft/model/DraftCherEffectParam;", "", "matrix", "", "", "duration", "", "segUseCher", "", "([Ljava/lang/String;[D[Z)V", "getDuration", "()[D", "getMatrix", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getSegUseCher", "()[Z", "component1", "component2", "component3", "copy", "([Ljava/lang/String;[D[Z)Lcom/ss/android/ugc/aweme/draft/model/DraftCherEffectParam;", "equals", "", "other", "hashCode", "", "toString", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43439a;
    @SerializedName("matrix")
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final String[] f43440b;
    @SerializedName("duration")
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final double[] f43441c;
    @SerializedName("seg_user_cher")
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final boolean[] f43442d;

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f43439a, false, 38488, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f43439a, false, 38488, new Class[0], String.class);
        }
        return "DraftCherEffectParam(matrix=" + Arrays.toString(this.f43440b) + ", duration=" + Arrays.toString(this.f43441c) + ", segUseCher=" + Arrays.toString(this.f43442d) + ")";
    }

    public final int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f43439a, false, 38486, new Class[0], Integer.TYPE)) {
            return (((Arrays.hashCode(this.f43440b) * 31) + Arrays.hashCode(this.f43441c)) * 31) + Arrays.hashCode(this.f43442d);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f43439a, false, 38486, new Class[0], Integer.TYPE)).intValue();
    }

    public final boolean equals(@Nullable Object obj) {
        Class<?> cls;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f43439a, false, 38485, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f43439a, false, 38485, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!Intrinsics.areEqual((Object) cls2, (Object) cls)) {
                return false;
            }
            if (obj != null) {
                e eVar = (e) obj;
                if (Arrays.equals(this.f43440b, eVar.f43440b) && Arrays.equals(this.f43441c, eVar.f43441c) && Arrays.equals(this.f43442d, eVar.f43442d)) {
                    return true;
                }
                return false;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.draft.model.DraftCherEffectParam");
        }
    }

    public e(@NotNull String[] strArr, @NotNull double[] dArr, @NotNull boolean[] zArr) {
        Intrinsics.checkParameterIsNotNull(strArr, "matrix");
        Intrinsics.checkParameterIsNotNull(dArr, "duration");
        Intrinsics.checkParameterIsNotNull(zArr, "segUseCher");
        this.f43440b = strArr;
        this.f43441c = dArr;
        this.f43442d = zArr;
    }
}
