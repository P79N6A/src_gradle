package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable;

public class CmdObject extends BaseMediaObject {
    public static final Parcelable.Creator<CmdObject> CREATOR = new Parcelable.Creator<CmdObject>() {
        public CmdObject[] newArray(int i) {
            return new CmdObject[i];
        }

        public CmdObject createFromParcel(Parcel parcel) {
            return new CmdObject(parcel);
        }
    };
    public String cmd;

    public int describeContents() {
        return 0;
    }

    public int getObjType() {
        return 7;
    }

    /* access modifiers changed from: protected */
    public BaseMediaObject toExtraMediaObject(String str) {
        return this;
    }

    /* access modifiers changed from: protected */
    public String toExtraMediaString() {
        return "";
    }

    public CmdObject() {
    }

    public boolean checkArgs() {
        if (this.cmd == null || this.cmd.length() == 0 || this.cmd.length() > 1024) {
            return false;
        }
        return true;
    }

    public CmdObject(Parcel parcel) {
        this.cmd = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cmd);
    }
}
