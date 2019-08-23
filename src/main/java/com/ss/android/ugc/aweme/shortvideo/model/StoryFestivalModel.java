package com.ss.android.ugc.aweme.shortvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\bH\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\bH\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/model/StoryFestivalModel;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "transResult", "", "getTransResult", "()I", "setTransResult", "(I)V", "useActivityEffect", "", "getUseActivityEffect", "()Z", "setUseActivityEffect", "(Z)V", "describeContents", "writeToParcel", "", "flags", "CREATOR", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StoryFestivalModel implements Parcelable, Serializable {
    public static final CREATOR CREATOR = new CREATOR(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    private int transResult;
    private boolean useActivityEffect;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/model/StoryFestivalModel$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/ugc/aweme/shortvideo/model/StoryFestivalModel;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/ugc/aweme/shortvideo/model/StoryFestivalModel;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class CREATOR implements Parcelable.Creator<StoryFestivalModel> {
        public static ChangeQuickRedirect changeQuickRedirect;

        private CREATOR() {
        }

        @NotNull
        public final StoryFestivalModel[] newArray(int i) {
            return new StoryFestivalModel[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StoryFestivalModel createFromParcel(@NotNull Parcel parcel) {
            Parcel parcel2 = parcel;
            if (PatchProxy.isSupport(new Object[]{parcel2}, this, changeQuickRedirect, false, 77675, new Class[]{Parcel.class}, StoryFestivalModel.class)) {
                return (StoryFestivalModel) PatchProxy.accessDispatch(new Object[]{parcel2}, this, changeQuickRedirect, false, 77675, new Class[]{Parcel.class}, StoryFestivalModel.class);
            }
            Intrinsics.checkParameterIsNotNull(parcel2, "parcel");
            return new StoryFestivalModel(parcel2);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final int getTransResult() {
        return this.transResult;
    }

    public final boolean getUseActivityEffect() {
        return this.useActivityEffect;
    }

    public StoryFestivalModel() {
        this.transResult = -1;
    }

    public final void setTransResult(int i) {
        this.transResult = i;
    }

    public final void setUseActivityEffect(boolean z) {
        this.useActivityEffect = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StoryFestivalModel(@NotNull Parcel parcel) {
        this();
        boolean z;
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this.transResult = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.useActivityEffect = z;
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 77674, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 77674, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.transResult);
        parcel.writeByte(this.useActivityEffect ? (byte) 1 : 0);
    }
}
