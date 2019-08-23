package com.ss.android.ugc.aweme.shortvideo.upload.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/upload/speedprobe/UploadSpeedInfo;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "speed", "", "startTime", "endTime", "(JJJ)V", "getEndTime", "()J", "getSpeed", "getStartTime", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
@Parcelize
public final class b implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR = new a();
    public static ChangeQuickRedirect changeQuickRedirect;
    private final long endTime;
    private final long speed;
    private final long startTime;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static class a implements Parcelable.Creator {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70969a;

        @NotNull
        public final Object createFromParcel(@NotNull Parcel parcel) {
            Parcel parcel2 = parcel;
            if (PatchProxy.isSupport(new Object[]{parcel2}, this, f70969a, false, 80800, new Class[]{Parcel.class}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{parcel2}, this, f70969a, false, 80800, new Class[]{Parcel.class}, Object.class);
            }
            Intrinsics.checkParameterIsNotNull(parcel2, "in");
            b bVar = new b(parcel.readLong(), parcel.readLong(), parcel.readLong());
            return bVar;
        }

        @NotNull
        public final Object[] newArray(int i) {
            return new b[i];
        }
    }

    @JvmOverloads
    public b() {
        this(0, 0, 0, 7, null);
    }

    @JvmOverloads
    public b(long j) {
        this(j, 0, 0, 6, null);
    }

    @JvmOverloads
    public b(long j, long j2) {
        this(j, j2, 0, 4, null);
    }

    public static /* synthetic */ b copy$default(b bVar, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = bVar.speed;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = bVar.startTime;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = bVar.endTime;
        }
        return bVar.copy(j4, j5, j3);
    }

    public final long component1() {
        return this.speed;
    }

    public final long component2() {
        return this.startTime;
    }

    public final long component3() {
        return this.endTime;
    }

    @NotNull
    public final b copy(long j, long j2, long j3) {
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        if (PatchProxy.isSupport(new Object[]{new Long(j4), new Long(j5), new Long(j6)}, this, changeQuickRedirect, false, 80797, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE}, b.class)) {
            Object[] objArr = {new Long(j4), new Long(j5), new Long(j6)};
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, 80797, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE}, b.class);
        }
        b bVar = new b(j, j2, j3);
        return bVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.speed == bVar.speed) {
                    if (this.startTime == bVar.startTime) {
                        if (this.endTime == bVar.endTime) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.speed;
        long j2 = this.startTime;
        long j3 = this.endTime;
        return (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3));
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 80798, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 80798, new Class[0], String.class);
        }
        return "UploadSpeedInfo(speed=" + this.speed + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 80799, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 80799, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeLong(this.speed);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getSpeed() {
        return this.speed;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @JvmOverloads
    public b(long j, long j2, long j3) {
        this.speed = j;
        this.startTime = j2;
        this.endTime = j3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ b(long r7, long r9, long r11, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r6 = this;
            r14 = r13 & 1
            r0 = -6
            if (r14 == 0) goto L_0x0008
            r2 = r0
            goto L_0x0009
        L_0x0008:
            r2 = r7
        L_0x0009:
            r7 = r13 & 2
            if (r7 == 0) goto L_0x000f
            r4 = r0
            goto L_0x0010
        L_0x000f:
            r4 = r9
        L_0x0010:
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0016
            r12 = r0
            goto L_0x0017
        L_0x0016:
            r12 = r11
        L_0x0017:
            r7 = r6
            r8 = r2
            r10 = r4
            r7.<init>(r8, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.upload.a.b.<init>(long, long, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
