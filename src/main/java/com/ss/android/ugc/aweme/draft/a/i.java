package com.ss.android.ugc.aweme.draft.a;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003JI\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010%\u001a\u00020\u0003H\u0016J\t\u0010&\u001a\u00020\u0006HÖ\u0001R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014¨\u0006'"}, d2 = {"Lcom/ss/android/ugc/aweme/draft/model/DraftVEAudioEffectParam;", "", "trackType", "", "trackIndex", "effectPath", "", "effectTag", "seqIn", "seqOut", "(IILjava/lang/String;Ljava/lang/String;II)V", "getEffectPath", "()Ljava/lang/String;", "setEffectPath", "(Ljava/lang/String;)V", "getEffectTag", "setEffectTag", "getSeqIn", "()I", "setSeqIn", "(I)V", "getSeqOut", "setSeqOut", "getTrackIndex", "setTrackIndex", "getTrackType", "setTrackType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43450a;
    @SerializedName("trackType")

    /* renamed from: b  reason: collision with root package name */
    public int f43451b;
    @SerializedName("trackIndex")

    /* renamed from: c  reason: collision with root package name */
    public int f43452c;
    @SerializedName("effectPath")
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public String f43453d;
    @SerializedName("effectTag")
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public String f43454e;
    @SerializedName("seqIn")

    /* renamed from: f  reason: collision with root package name */
    public int f43455f;
    @SerializedName("seqOut")
    public int g;

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f43450a, false, 38499, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f43450a, false, 38499, new Class[0], String.class);
        }
        return "DraftVEAudioEffectParam(trackType=" + this.f43451b + ", trackIndex=" + this.f43452c + ", effectPath=" + this.f43453d + ", effectTag=" + this.f43454e + ", seqIn=" + this.f43455f + ", seqOut=" + this.g + ")";
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f43450a, false, 38497, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f43450a, false, 38497, new Class[0], Integer.TYPE)).intValue();
        }
        int hashCode = ((Integer.valueOf(this.f43451b).hashCode() * 31) + Integer.valueOf(this.f43452c).hashCode()) * 31;
        String str = this.f43453d;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.f43454e;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((((i3 + i2) * 31) + Integer.valueOf(this.f43455f).hashCode()) * 31) + Integer.valueOf(this.g).hashCode();
    }

    public final boolean equals(@Nullable Object obj) {
        Class<?> cls;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f43450a, false, 38496, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f43450a, false, 38496, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (Intrinsics.areEqual((Object) this, obj)) {
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
                i iVar = (i) obj;
                if (this.f43451b == iVar.f43451b && this.f43452c == iVar.f43452c && StringsKt.equals$default(this.f43453d, iVar.f43453d, false, 2, null) && StringsKt.equals$default(this.f43454e, iVar.f43454e, false, 2, null) && this.f43455f == iVar.f43455f && this.g == iVar.g) {
                    return true;
                }
                return false;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.draft.model.DraftVEAudioEffectParam");
        }
    }

    public i(int i, int i2, @Nullable String str, @Nullable String str2, int i3, int i4) {
        this.f43451b = i;
        this.f43452c = i2;
        this.f43453d = str;
        this.f43454e = str2;
        this.f43455f = i3;
        this.g = i4;
    }
}
