package com.ss.android.ugc.aweme.shortvideo.cut;

import android.annotation.SuppressLint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.cut.model.h;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\b\b\u0018\u00002\u00020\u0001B}\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t¢\u0006\u0002\u0010\u0016J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0013HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\t\u00100\u001a\u00020\tHÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\t\u00102\u001a\u00020\rHÆ\u0003J\t\u00103\u001a\u00020\u000fHÆ\u0003J\t\u00104\u001a\u00020\u0011HÆ\u0003J\u0001\u00105\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\tHÆ\u0001J\u0013\u00106\u001a\u00020\r2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\tHÖ\u0001J\t\u00109\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001fR\u0011\u0010\u0015\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0014\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001e¨\u0006:"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/CutVideoCompileSettings;", "", "segments", "", "Lcom/ss/android/ugc/aweme/shortvideo/cut/model/VideoSegment;", "videoOutputPath", "", "audioOutputPath", "videoWidth", "", "videoHeight", "fps", "isHWEncode", "", "encodeStandard", "Lcom/ss/android/vesdk/VEVideoEncodeSettings$ENCODE_STANDARD;", "encodeProfile", "Lcom/ss/android/vesdk/VEVideoEncodeSettings$ENCODE_PROFILE;", "videoEncodeBitrateMode", "Lcom/ss/android/vesdk/VEVideoEncodeSettings$ENCODE_BITRATE_MODE;", "videoBitrate", "resizeMode", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IIIZLcom/ss/android/vesdk/VEVideoEncodeSettings$ENCODE_STANDARD;Lcom/ss/android/vesdk/VEVideoEncodeSettings$ENCODE_PROFILE;Lcom/ss/android/vesdk/VEVideoEncodeSettings$ENCODE_BITRATE_MODE;II)V", "getAudioOutputPath", "()Ljava/lang/String;", "getEncodeProfile", "()Lcom/ss/android/vesdk/VEVideoEncodeSettings$ENCODE_PROFILE;", "getEncodeStandard", "()Lcom/ss/android/vesdk/VEVideoEncodeSettings$ENCODE_STANDARD;", "getFps", "()I", "()Z", "getResizeMode", "getSegments", "()Ljava/util/List;", "getVideoBitrate", "getVideoEncodeBitrateMode", "()Lcom/ss/android/vesdk/VEVideoEncodeSettings$ENCODE_BITRATE_MODE;", "getVideoHeight", "getVideoOutputPath", "getVideoWidth", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"TooManyMethodParam"})
public final class af {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66349a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final List<h> f66350b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final String f66351c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final String f66352d;

    /* renamed from: e  reason: collision with root package name */
    public final int f66353e;

    /* renamed from: f  reason: collision with root package name */
    public final int f66354f;
    public final int g;
    public final boolean h;
    @NotNull
    public final VEVideoEncodeSettings.f i;
    @NotNull
    public final VEVideoEncodeSettings.e j;
    @NotNull
    public final VEVideoEncodeSettings.c k;
    public final int l;
    public final int m;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66349a, false, 75503, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f66349a, false, 75503, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof af) {
                af afVar = (af) obj;
                if (Intrinsics.areEqual((Object) this.f66350b, (Object) afVar.f66350b) && Intrinsics.areEqual((Object) this.f66351c, (Object) afVar.f66351c) && Intrinsics.areEqual((Object) this.f66352d, (Object) afVar.f66352d)) {
                    if (this.f66353e == afVar.f66353e) {
                        if (this.f66354f == afVar.f66354f) {
                            if (this.g == afVar.g) {
                                if ((this.h == afVar.h) && Intrinsics.areEqual((Object) this.i, (Object) afVar.i) && Intrinsics.areEqual((Object) this.j, (Object) afVar.j) && Intrinsics.areEqual((Object) this.k, (Object) afVar.k)) {
                                    if (this.l == afVar.l) {
                                        if (this.m == afVar.m) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f66349a, false, 75502, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f66349a, false, 75502, new Class[0], Integer.TYPE)).intValue();
        }
        List<h> list = this.f66350b;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f66351c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f66352d;
        int hashCode3 = (((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f66353e) * 31) + this.f66354f) * 31) + this.g) * 31;
        boolean z = this.h;
        if (z) {
            z = true;
        }
        int i3 = (hashCode3 + (z ? 1 : 0)) * 31;
        VEVideoEncodeSettings.f fVar = this.i;
        int hashCode4 = (i3 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        VEVideoEncodeSettings.e eVar = this.j;
        int hashCode5 = (hashCode4 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        VEVideoEncodeSettings.c cVar = this.k;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return ((((hashCode5 + i2) * 31) + this.l) * 31) + this.m;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f66349a, false, 75501, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f66349a, false, 75501, new Class[0], String.class);
        }
        return "CutVideoCompileSettings(segments=" + this.f66350b + ", videoOutputPath=" + this.f66351c + ", audioOutputPath=" + this.f66352d + ", videoWidth=" + this.f66353e + ", videoHeight=" + this.f66354f + ", fps=" + this.g + ", isHWEncode=" + this.h + ", encodeStandard=" + this.i + ", encodeProfile=" + this.j + ", videoEncodeBitrateMode=" + this.k + ", videoBitrate=" + this.l + ", resizeMode=" + this.m + ")";
    }

    private af(@NotNull List<? extends h> list, @NotNull String str, @NotNull String str2, int i2, int i3, int i4, boolean z, @NotNull VEVideoEncodeSettings.f fVar, @NotNull VEVideoEncodeSettings.e eVar, @NotNull VEVideoEncodeSettings.c cVar, int i5, int i6) {
        Intrinsics.checkParameterIsNotNull(list, "segments");
        Intrinsics.checkParameterIsNotNull(str, "videoOutputPath");
        Intrinsics.checkParameterIsNotNull(str2, "audioOutputPath");
        Intrinsics.checkParameterIsNotNull(fVar, "encodeStandard");
        Intrinsics.checkParameterIsNotNull(eVar, "encodeProfile");
        Intrinsics.checkParameterIsNotNull(cVar, "videoEncodeBitrateMode");
        this.f66350b = list;
        this.f66351c = str;
        this.f66352d = str2;
        this.f66353e = i2;
        this.f66354f = i3;
        this.g = i4;
        this.h = z;
        this.i = fVar;
        this.j = eVar;
        this.k = cVar;
        this.l = i5;
        this.m = i6;
    }

    public /* synthetic */ af(List list, String str, String str2, int i2, int i3, int i4, boolean z, VEVideoEncodeSettings.f fVar, VEVideoEncodeSettings.e eVar, VEVideoEncodeSettings.c cVar, int i5, int i6, int i7) {
        this(list, str, str2, -1, -1, i4, false, VEVideoEncodeSettings.f.ENCODE_STANDARD_H264, VEVideoEncodeSettings.e.ENCODE_PROFILE_BASELINE, VEVideoEncodeSettings.c.ENCODE_BITRATE_CRF, 15, 1);
    }
}
