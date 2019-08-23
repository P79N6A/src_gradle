package com.huawei.emui.hiexperience.iaware.sdk;

import android.os.Parcel;
import android.rms.iaware.IAwareSdkCore;

public class IAwareSdk {
    public static void asyncReportData(int i, String str, long j) {
        reportData(i, str, true);
    }

    public static void reportData(int i, String str, long j) {
        reportData(i, str, false);
    }

    private static void reportData(int i, String str, boolean z) {
        int i2;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        obtain.writeInt(i);
        obtain.writeLong(System.currentTimeMillis());
        obtain.writeString(str);
        if (z) {
            i2 = 10001;
        } else {
            i2 = 1;
        }
        IAwareSdkCore.handleEvent(i2, obtain, obtain2, i);
        obtain2.recycle();
        obtain.recycle();
    }
}
