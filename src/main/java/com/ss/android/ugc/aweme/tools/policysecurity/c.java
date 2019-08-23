package com.ss.android.ugc.aweme.tools.policysecurity;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\b\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B%\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\u0018\u0010#\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u001cH\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006'"}, d2 = {"Lcom/ss/android/ugc/aweme/tools/policysecurity/OriginalSoundUploadTask;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "awemeId", "", "vid", "originalSoundPath", "updateTime", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "audioVid", "getAudioVid", "()Ljava/lang/String;", "setAudioVid", "(Ljava/lang/String;)V", "getAwemeId", "getOriginalSoundPath", "getUpdateTime", "()J", "getVid", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c implements Parcelable {
    public static final a CREATOR = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74928a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public String f74929b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final String f74930c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final String f74931d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final String f74932e;

    /* renamed from: f  reason: collision with root package name */
    public final long f74933f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/tools/policysecurity/OriginalSoundUploadTask$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/ugc/aweme/tools/policysecurity/OriginalSoundUploadTask;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/ugc/aweme/tools/policysecurity/OriginalSoundUploadTask;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements Parcelable.Creator<c> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74934a;

        private a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new c[i];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (PatchProxy.isSupport(new Object[]{parcel2}, this, f74934a, false, 87264, new Class[]{Parcel.class}, c.class)) {
                return (c) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f74934a, false, 87264, new Class[]{Parcel.class}, c.class);
            }
            Intrinsics.checkParameterIsNotNull(parcel2, "parcel");
            return new c(parcel2);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f74928a, false, 87263, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f74928a, false, 87263, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (Intrinsics.areEqual((Object) this.f74930c, (Object) cVar.f74930c) && Intrinsics.areEqual((Object) this.f74931d, (Object) cVar.f74931d) && Intrinsics.areEqual((Object) this.f74932e, (Object) cVar.f74932e)) {
                    if (this.f74933f == cVar.f74933f) {
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
        if (PatchProxy.isSupport(new Object[0], this, f74928a, false, 87262, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f74928a, false, 87262, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.f74930c;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f74931d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f74932e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        long j = this.f74933f;
        return ((hashCode2 + i) * 31) + ((int) (j ^ (j >>> 32)));
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f74928a, false, 87261, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74928a, false, 87261, new Class[0], String.class);
        }
        return "OriginalSoundUploadTask(awemeId=" + this.f74930c + ", vid=" + this.f74931d + ", originalSoundPath=" + this.f74932e + ", updateTime=" + this.f74933f + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(@org.jetbrains.annotations.NotNull android.os.Parcel r8) {
        /*
            r7 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            java.lang.String r2 = r8.readString()
            if (r2 != 0) goto L_0x000e
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x000e:
            java.lang.String r3 = r8.readString()
            if (r3 != 0) goto L_0x0017
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0017:
            java.lang.String r4 = r8.readString()
            if (r4 != 0) goto L_0x0020
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0020:
            long r5 = r8.readLong()
            r1 = r7
            r1.<init>(r2, r3, r4, r5)
            java.lang.String r8 = r8.readString()
            r7.f74929b = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.policysecurity.c.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, f74928a, false, 87259, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, f74928a, false, 87259, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f74930c);
        parcel.writeString(this.f74931d);
        parcel.writeString(this.f74932e);
        parcel.writeLong(this.f74933f);
        parcel.writeString(this.f74929b);
    }

    public c(@NotNull String str, @NotNull String str2, @NotNull String str3, long j) {
        Intrinsics.checkParameterIsNotNull(str, "awemeId");
        Intrinsics.checkParameterIsNotNull(str2, "vid");
        Intrinsics.checkParameterIsNotNull(str3, "originalSoundPath");
        this.f74930c = str;
        this.f74931d = str2;
        this.f74932e = str3;
        this.f74933f = j;
    }
}
