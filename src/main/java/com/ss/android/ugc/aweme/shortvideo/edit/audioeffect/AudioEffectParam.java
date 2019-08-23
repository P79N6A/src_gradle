package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005BK\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\b\u0010+\u001a\u00020\u0007H\u0016J\u0018\u0010,\u001a\u00020-2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0007H\u0016R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R \u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001a\u0010!\u001a\u00020\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001e¨\u00060"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectParam;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "trackType", "", "trackIndex", "effectPath", "", "effectTag", "seqIn", "seqOut", "preprocessResult", "", "(IILjava/lang/String;Ljava/lang/String;II[B)V", "getEffectPath", "()Ljava/lang/String;", "setEffectPath", "(Ljava/lang/String;)V", "getEffectTag", "setEffectTag", "getPreprocessResult", "()[B", "setPreprocessResult", "([B)V", "getSeqIn", "()I", "setSeqIn", "(I)V", "getSeqOut", "setSeqOut", "showErrorToast", "", "getShowErrorToast", "()Z", "setShowErrorToast", "(Z)V", "getTrackIndex", "setTrackIndex", "getTrackType", "setTrackType", "describeContents", "writeToParcel", "", "flags", "CREATOR", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AudioEffectParam implements Parcelable, Serializable {
    public static final a CREATOR = new a((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("effectPath")
    @NotNull
    private String effectPath;
    @SerializedName("effectTag")
    @NotNull
    private String effectTag;
    @SerializedName("preprocessResult")
    @Nullable
    private byte[] preprocessResult;
    @SerializedName("seqIn")
    private int seqIn;
    @SerializedName("seqOut")
    private int seqOut;
    private boolean showErrorToast;
    @SerializedName("trackIndex")
    private int trackIndex;
    @SerializedName("trackType")
    private int trackType;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectParam$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectParam;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectParam;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements Parcelable.Creator<AudioEffectParam> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67004a;

        private a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AudioEffectParam[i];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (PatchProxy.isSupport(new Object[]{parcel2}, this, f67004a, false, 76642, new Class[]{Parcel.class}, AudioEffectParam.class)) {
                return (AudioEffectParam) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f67004a, false, 76642, new Class[]{Parcel.class}, AudioEffectParam.class);
            }
            Intrinsics.checkParameterIsNotNull(parcel2, "parcel");
            return new AudioEffectParam(parcel2);
        }
    }

    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final String getEffectPath() {
        return this.effectPath;
    }

    @NotNull
    public final String getEffectTag() {
        return this.effectTag;
    }

    @Nullable
    public final byte[] getPreprocessResult() {
        return this.preprocessResult;
    }

    public final int getSeqIn() {
        return this.seqIn;
    }

    public final int getSeqOut() {
        return this.seqOut;
    }

    public final boolean getShowErrorToast() {
        return this.showErrorToast;
    }

    public final int getTrackIndex() {
        return this.trackIndex;
    }

    public final int getTrackType() {
        return this.trackType;
    }

    public final void setPreprocessResult(@Nullable byte[] bArr) {
        this.preprocessResult = bArr;
    }

    public final void setSeqIn(int i) {
        this.seqIn = i;
    }

    public final void setSeqOut(int i) {
        this.seqOut = i;
    }

    public final void setShowErrorToast(boolean z) {
        this.showErrorToast = z;
    }

    public final void setTrackIndex(int i) {
        this.trackIndex = i;
    }

    public final void setTrackType(int i) {
        this.trackType = i;
    }

    public final void setEffectPath(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 76640, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 76640, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.effectPath = str2;
    }

    public final void setEffectTag(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 76641, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 76641, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.effectTag = str2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AudioEffectParam(@org.jetbrains.annotations.NotNull android.os.Parcel r10) {
        /*
            r9 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            int r2 = r10.readInt()
            int r3 = r10.readInt()
            java.lang.String r4 = r10.readString()
            java.lang.String r0 = "parcel.readString()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            java.lang.String r5 = r10.readString()
            java.lang.String r0 = "parcel.readString()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r0)
            int r6 = r10.readInt()
            int r7 = r10.readInt()
            byte[] r8 = r10.createByteArray()
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 76639, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 76639, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.trackType);
        parcel.writeInt(this.trackIndex);
        parcel.writeString(this.effectPath);
        parcel.writeString(this.effectTag);
        parcel.writeInt(this.seqIn);
        parcel.writeInt(this.seqOut);
        parcel.writeByteArray(this.preprocessResult);
    }

    public AudioEffectParam(int i, int i2, @NotNull String str, @NotNull String str2, int i3, int i4, @Nullable byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(str, "effectPath");
        Intrinsics.checkParameterIsNotNull(str2, "effectTag");
        this.trackType = i;
        this.trackIndex = i2;
        this.effectPath = str;
        this.effectTag = str2;
        this.seqIn = i3;
        this.seqOut = i4;
        this.preprocessResult = bArr;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AudioEffectParam(int r12, int r13, java.lang.String r14, java.lang.String r15, int r16, int r17, byte[] r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r11 = this;
            r1 = r19 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0007
            r4 = 0
            goto L_0x0008
        L_0x0007:
            r4 = r12
        L_0x0008:
            r1 = r19 & 2
            if (r1 == 0) goto L_0x000e
            r5 = 0
            goto L_0x000f
        L_0x000e:
            r5 = r13
        L_0x000f:
            r1 = r19 & 4
            if (r1 == 0) goto L_0x0017
            java.lang.String r1 = ""
            r6 = r1
            goto L_0x0018
        L_0x0017:
            r6 = r14
        L_0x0018:
            r1 = r19 & 8
            if (r1 == 0) goto L_0x0020
            java.lang.String r1 = ""
            r7 = r1
            goto L_0x0021
        L_0x0020:
            r7 = r15
        L_0x0021:
            r1 = r19 & 16
            if (r1 == 0) goto L_0x0027
            r8 = 0
            goto L_0x0029
        L_0x0027:
            r8 = r16
        L_0x0029:
            r0 = r19 & 32
            if (r0 == 0) goto L_0x002f
            r9 = 0
            goto L_0x0031
        L_0x002f:
            r9 = r17
        L_0x0031:
            r3 = r11
            r10 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam.<init>(int, int, java.lang.String, java.lang.String, int, int, byte[], int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
