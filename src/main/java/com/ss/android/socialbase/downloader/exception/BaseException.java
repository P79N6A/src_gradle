package com.ss.android.socialbase.downloader.exception;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.socialbase.downloader.e.d;

public class BaseException extends Exception implements Parcelable {
    public static final Parcelable.Creator<BaseException> CREATOR = new Parcelable.Creator<BaseException>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new BaseException[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new BaseException(parcel);
        }
    };
    private int errorCode;
    private String errorMsg;

    public int describeContents() {
        return 0;
    }

    public BaseException() {
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMsg;
    }

    public void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    protected BaseException(Parcel parcel) {
        readFromParcel(parcel);
    }

    public void readFromParcel(Parcel parcel) {
        this.errorCode = parcel.readInt();
        this.errorMsg = parcel.readString();
    }

    public BaseException(int i, Throwable th) {
        this(i, d.c(th));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.errorCode);
        parcel.writeString(this.errorMsg);
    }

    public BaseException(int i, String str) {
        super("[d-ex]:" + str);
        this.errorMsg = "[d-ex]:" + str;
        this.errorCode = i;
    }
}
