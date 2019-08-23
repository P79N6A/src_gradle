package com.ss.android.ugc.aweme.effectplatform;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\n\u0010\u0019\u001a\u00020\u0011*\u00020\bR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u0015\u0010\u0010\u001a\u00020\u0011*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/effectplatform/FilterEffect;", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "Landroid/os/Parcelable;", "()V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "buildIn", "", "getBuildIn", "()Z", "setBuildIn", "(Z)V", "checked", "getChecked", "setChecked", "int", "", "getInt", "(Z)I", "describeContents", "writeToParcel", "", "dest", "flags", "toInt", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e extends Effect implements Parcelable {
    @NotNull
    @JvmField
    public static final Parcelable.Creator<e> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43843a;

    /* renamed from: d  reason: collision with root package name */
    public static final a f43844d = new a((byte) 0);
    @SerializedName("is_checked")

    /* renamed from: b  reason: collision with root package name */
    public boolean f43845b;
    @SerializedName("is_buildin")

    /* renamed from: c  reason: collision with root package name */
    public boolean f43846c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/effectplatform/FilterEffect$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/ugc/aweme/effectplatform/FilterEffect;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/aweme/effectplatform/FilterEffect$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/ugc/aweme/effectplatform/FilterEffect;", "createFromParcel", "source", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/ugc/aweme/effectplatform/FilterEffect;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements Parcelable.Creator<e> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43847a;

        b() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new e[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (PatchProxy.isSupport(new Object[]{parcel2}, this, f43847a, false, 38988, new Class[]{Parcel.class}, e.class)) {
                return (e) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f43847a, false, 38988, new Class[]{Parcel.class}, e.class);
            }
            Intrinsics.checkParameterIsNotNull(parcel2, "source");
            return new e(parcel2);
        }
    }

    private static int a(boolean z) {
        return z ? 1 : 0;
    }

    public final int describeContents() {
        return 0;
    }

    public e() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(@NotNull Parcel parcel) {
        super(parcel);
        boolean z;
        Intrinsics.checkParameterIsNotNull(parcel, "source");
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f43845b = z;
        this.f43846c = parcel.readByte() != 0 ? true : z2;
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, f43843a, false, 38987, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, f43843a, false, 38987, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(parcel, "dest");
        super.writeToParcel(parcel, i);
        parcel.writeByte((byte) a(this.f43845b));
        parcel.writeByte((byte) a(this.f43845b));
    }
}
