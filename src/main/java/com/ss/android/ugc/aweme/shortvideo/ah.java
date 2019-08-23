package com.ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B)\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001cH\u0016R \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/ClientCherEffectParam;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "matrix", "", "", "duration", "", "segUseCher", "", "([Ljava/lang/String;[D[Z)V", "getDuration", "()[D", "setDuration", "([D)V", "getMatrix", "()[Ljava/lang/String;", "setMatrix", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "getSegUseCher", "()[Z", "setSegUseCher", "([Z)V", "describeContents", "", "writeToParcel", "", "flags", "CREATOR", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ah implements Parcelable, Serializable {
    public static final a CREATOR = new a((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("duration")
    @Nullable
    private double[] duration;
    @SerializedName("matrix")
    @Nullable
    private String[] matrix;
    @SerializedName("segUseCher")
    @Nullable
    private boolean[] segUseCher;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/ClientCherEffectParam$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/ugc/aweme/shortvideo/ClientCherEffectParam;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/ugc/aweme/shortvideo/ClientCherEffectParam;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements Parcelable.Creator<ah> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65527a;

        private a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ah[i];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (PatchProxy.isSupport(new Object[]{parcel2}, this, f65527a, false, 73981, new Class[]{Parcel.class}, ah.class)) {
                return (ah) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f65527a, false, 73981, new Class[]{Parcel.class}, ah.class);
            }
            Intrinsics.checkParameterIsNotNull(parcel2, "parcel");
            return new ah(parcel2);
        }
    }

    public final int describeContents() {
        return 0;
    }

    @Nullable
    public final double[] getDuration() {
        return this.duration;
    }

    @Nullable
    public final String[] getMatrix() {
        return this.matrix;
    }

    @Nullable
    public final boolean[] getSegUseCher() {
        return this.segUseCher;
    }

    public final void setDuration(@Nullable double[] dArr) {
        this.duration = dArr;
    }

    public final void setMatrix(@Nullable String[] strArr) {
        this.matrix = strArr;
    }

    public final void setSegUseCher(@Nullable boolean[] zArr) {
        this.segUseCher = zArr;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ah(@NotNull Parcel parcel) {
        this(parcel.createStringArray(), parcel.createDoubleArray(), parcel.createBooleanArray());
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 73980, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 73980, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeStringArray(this.matrix);
        parcel.writeDoubleArray(this.duration);
        parcel.writeBooleanArray(this.segUseCher);
    }

    public ah(@Nullable String[] strArr, @Nullable double[] dArr, @Nullable boolean[] zArr) {
        this.matrix = strArr;
        this.duration = dArr;
        this.segUseCher = zArr;
    }
}
