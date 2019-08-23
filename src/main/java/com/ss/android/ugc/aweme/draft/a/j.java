package com.ss.android.ugc.aweme.draft.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\b\u0018\u0000 F2\u00020\u0001:\u0001FB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004Bw\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0013J\t\u00100\u001a\u00020\u0006HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\t\u00107\u001a\u00020\fHÆ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J\t\u00109\u001a\u00020\u000fHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u000fHÆ\u0003J}\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\b\u0010<\u001a\u00020\u0006H\u0016J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0003J\t\u0010A\u001a\u00020\u0006HÖ\u0001J\t\u0010B\u001a\u00020\u000fHÖ\u0001J\u0018\u0010C\u001a\u00020D2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010E\u001a\u00020\u0006H\u0016R \u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001e\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR \u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001e\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001e\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001bR \u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0015\"\u0004\b-\u0010\u0017R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0019\"\u0004\b/\u0010\u001b¨\u0006G"}, d2 = {"Lcom/ss/android/ugc/aweme/draft/model/DraftVideoSegment;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "width", "", "height", "start", "end", "duration", "speed", "", "rotate", "videoPath", "", "audioPath", "reversePath", "tempVideoPath", "(IIIIIFILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAudioPath", "()Ljava/lang/String;", "setAudioPath", "(Ljava/lang/String;)V", "getDuration", "()I", "setDuration", "(I)V", "getEnd", "setEnd", "getHeight", "setHeight", "getReversePath", "setReversePath", "getRotate", "setRotate", "getSpeed", "()F", "setSpeed", "(F)V", "getStart", "setStart", "getTempVideoPath", "setTempVideoPath", "getVideoPath", "setVideoPath", "getWidth", "setWidth", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public final class j implements Parcelable {
    public static final a CREATOR = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43456a;
    @SerializedName("width")

    /* renamed from: b  reason: collision with root package name */
    public int f43457b;
    @SerializedName("height")

    /* renamed from: c  reason: collision with root package name */
    public int f43458c;
    @SerializedName("start")

    /* renamed from: d  reason: collision with root package name */
    public int f43459d;
    @SerializedName("end")

    /* renamed from: e  reason: collision with root package name */
    public int f43460e;
    @SerializedName("duration")

    /* renamed from: f  reason: collision with root package name */
    public int f43461f;
    @SerializedName("speed")
    public float g;
    @SerializedName("roatete")
    public int h;
    @SerializedName("video_path")
    @NotNull
    public String i;
    @SerializedName("audio_path")
    @Nullable
    public String j;
    @SerializedName("reverse_path")
    @Nullable
    public String k;
    @SerializedName("temp_path")
    @Nullable
    public String l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/draft/model/DraftVideoSegment$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/ugc/aweme/draft/model/DraftVideoSegment;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/ugc/aweme/draft/model/DraftVideoSegment;", "tools.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a implements Parcelable.Creator<j> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43462a;

        private a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new j[i];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (PatchProxy.isSupport(new Object[]{parcel2}, this, f43462a, false, 38506, new Class[]{Parcel.class}, j.class)) {
                return (j) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f43462a, false, 38506, new Class[]{Parcel.class}, j.class);
            }
            Intrinsics.checkParameterIsNotNull(parcel2, "parcel");
            return new j(parcel2);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f43456a, false, 38505, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f43456a, false, 38505, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof j) {
                j jVar = (j) obj;
                if (this.f43457b == jVar.f43457b) {
                    if (this.f43458c == jVar.f43458c) {
                        if (this.f43459d == jVar.f43459d) {
                            if (this.f43460e == jVar.f43460e) {
                                if ((this.f43461f == jVar.f43461f) && Float.compare(this.g, jVar.g) == 0) {
                                    if (!(this.h == jVar.h) || !Intrinsics.areEqual((Object) this.i, (Object) jVar.i) || !Intrinsics.areEqual((Object) this.j, (Object) jVar.j) || !Intrinsics.areEqual((Object) this.k, (Object) jVar.k) || !Intrinsics.areEqual((Object) this.l, (Object) jVar.l)) {
                                        return false;
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
        if (PatchProxy.isSupport(new Object[0], this, f43456a, false, 38504, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f43456a, false, 38504, new Class[0], Integer.TYPE)).intValue();
        }
        int floatToIntBits = ((((((((((((this.f43457b * 31) + this.f43458c) * 31) + this.f43459d) * 31) + this.f43460e) * 31) + this.f43461f) * 31) + Float.floatToIntBits(this.g)) * 31) + this.h) * 31;
        String str = this.i;
        int hashCode = (floatToIntBits + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.j;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.k;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.l;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f43456a, false, 38503, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f43456a, false, 38503, new Class[0], String.class);
        }
        return "DraftVideoSegment(width=" + this.f43457b + ", height=" + this.f43458c + ", start=" + this.f43459d + ", end=" + this.f43460e + ", duration=" + this.f43461f + ", speed=" + this.g + ", rotate=" + this.h + ", videoPath=" + this.i + ", audioPath=" + this.j + ", reversePath=" + this.k + ", tempVideoPath=" + this.l + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j(@org.jetbrains.annotations.NotNull android.os.Parcel r14) {
        /*
            r13 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r14, r0)
            int r2 = r14.readInt()
            int r3 = r14.readInt()
            int r4 = r14.readInt()
            int r5 = r14.readInt()
            int r6 = r14.readInt()
            float r7 = r14.readFloat()
            int r8 = r14.readInt()
            java.lang.String r9 = r14.readString()
            java.lang.String r0 = "parcel.readString()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r9, r0)
            java.lang.String r10 = r14.readString()
            java.lang.String r11 = r14.readString()
            java.lang.String r12 = r14.readString()
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.draft.a.j.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i2) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i2)}, this, f43456a, false, 38500, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i2)}, this, f43456a, false, 38500, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.f43457b);
        parcel.writeInt(this.f43458c);
        parcel.writeInt(this.f43459d);
        parcel.writeInt(this.f43460e);
        parcel.writeInt(this.f43461f);
        parcel.writeFloat(this.g);
        parcel.writeInt(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
    }

    public j(int i2, int i3, int i4, int i5, int i6, float f2, int i7, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkParameterIsNotNull(str, "videoPath");
        this.f43457b = i2;
        this.f43458c = i3;
        this.f43459d = i4;
        this.f43460e = i5;
        this.f43461f = i6;
        this.g = f2;
        this.h = i7;
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = str4;
    }
}
