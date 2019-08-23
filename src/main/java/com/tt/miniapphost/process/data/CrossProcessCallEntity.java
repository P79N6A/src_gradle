package com.tt.miniapphost.process.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tt.miniapphost.util.ProcessUtil;

public class CrossProcessCallEntity implements Parcelable {
    public static final Parcelable.Creator<CrossProcessCallEntity> CREATOR = new Parcelable.Creator<CrossProcessCallEntity>() {
        public final CrossProcessCallEntity[] newArray(int i) {
            return new CrossProcessCallEntity[i];
        }

        public final CrossProcessCallEntity createFromParcel(Parcel parcel) {
            return new CrossProcessCallEntity(parcel);
        }
    };
    private final CrossProcessDataEntity mCallData;
    private final CrossProcessDataEntity mCallExtraData;
    private final String mCallProcessIdentify;
    private final String mCallType;
    private final String mCallerProcessIdentify;

    public int describeContents() {
        return 0;
    }

    @Nullable
    public CrossProcessDataEntity getCallData() {
        return this.mCallData;
    }

    @Nullable
    public CrossProcessDataEntity getCallExtraData() {
        return this.mCallExtraData;
    }

    @NonNull
    public String getCallProcessIdentify() {
        return this.mCallProcessIdentify;
    }

    @NonNull
    public String getCallType() {
        return this.mCallType;
    }

    @NonNull
    public String getCallerProcessIdentify() {
        return this.mCallerProcessIdentify;
    }

    public String toString() {
        return "CrossProcessCallEntity{mCallerProcessIdentify: " + this.mCallerProcessIdentify + ",mCallType: " + this.mCallType + ",callData: " + this.mCallData + ",mCallExtraData: " + this.mCallExtraData + "}";
    }

    protected CrossProcessCallEntity(Parcel parcel) {
        this.mCallerProcessIdentify = parcel.readString();
        this.mCallProcessIdentify = parcel.readString();
        this.mCallType = parcel.readString();
        this.mCallData = (CrossProcessDataEntity) parcel.readParcelable(CrossProcessDataEntity.class.getClassLoader());
        this.mCallExtraData = (CrossProcessDataEntity) parcel.readParcelable(CrossProcessDataEntity.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mCallerProcessIdentify);
        parcel.writeString(this.mCallProcessIdentify);
        parcel.writeString(this.mCallType);
        parcel.writeParcelable(this.mCallData, i);
        parcel.writeParcelable(this.mCallExtraData, i);
    }

    public CrossProcessCallEntity(@NonNull String str, @NonNull String str2, @Nullable CrossProcessDataEntity crossProcessDataEntity) {
        this.mCallerProcessIdentify = ProcessUtil.getProcessFlag();
        this.mCallProcessIdentify = str;
        this.mCallType = str2;
        this.mCallData = crossProcessDataEntity;
        this.mCallExtraData = null;
    }

    public CrossProcessCallEntity(@NonNull String str, @NonNull String str2, @Nullable CrossProcessDataEntity crossProcessDataEntity, @Nullable CrossProcessDataEntity crossProcessDataEntity2) {
        this.mCallerProcessIdentify = ProcessUtil.getProcessFlag();
        this.mCallProcessIdentify = str;
        this.mCallType = str2;
        this.mCallData = crossProcessDataEntity;
        this.mCallExtraData = crossProcessDataEntity2;
    }
}
