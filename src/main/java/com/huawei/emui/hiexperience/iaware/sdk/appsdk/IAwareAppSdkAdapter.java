package com.huawei.emui.hiexperience.iaware.sdk.appsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.rms.iaware.IAwareSdkCore;
import com.huawei.emui.hiexperience.iaware.sdk.appsdk.IAwareAppSdk;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class IAwareAppSdkAdapter {
    private static int INTERFACE_ID_REGISTER_APP_CALLBACK = 9;
    private static int INTERFACE_ID_REPORT_DATA = 1;
    public boolean isRegistedSuccess;
    public IAwareAppSdk.AppCallBack mAppCbk;
    private String mPackageName = "";
    private SDKCallback mSdkCbk;
    private int myPid;

    class SDKCallback extends Binder implements IInterface {
        public IBinder asBinder() {
            return this;
        }

        public SDKCallback() {
            attachInterface(this, "com.huawei.iaware.sdk.ISDKCallbak");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i <= 0 || i > 16777215) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            if (i != 1) {
                return false;
            }
            try {
                parcel.enforceInterface("com.huawei.iaware.sdk.ISDKCallbak");
                String readString = parcel.readString();
                if (IAwareAppSdkAdapter.this.mAppCbk != null && IAwareAppSdkAdapter.this.isRegistedSuccess) {
                    IAwareAppSdkAdapter.this.mAppCbk.getPhoneInfo(readString);
                }
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        }
    }

    public void reportScene(String str) {
        if (this.isRegistedSuccess) {
            Parcel obtain = Parcel.obtain();
            obtain.writeInt(3009);
            obtain.writeLong(0);
            obtain.writeString(PushConstants.PUSH_TYPE_THROUGH_MESSAGE + "&&" + this.myPid + "&&" + this.mPackageName + "&&" + str);
            IAwareSdkCore.handleEvent(INTERFACE_ID_REPORT_DATA, obtain, null, 3009);
            obtain.recycle();
        }
    }

    public void reportVip(String str) {
        if (this.isRegistedSuccess) {
            Parcel obtain = Parcel.obtain();
            obtain.writeInt(3010);
            obtain.writeLong(0);
            obtain.writeString(PushConstants.PUSH_TYPE_THROUGH_MESSAGE + "&&" + this.myPid + "&&" + this.mPackageName + "&&" + str);
            IAwareSdkCore.handleEvent(INTERFACE_ID_REPORT_DATA, obtain, null, 3010);
            obtain.recycle();
        }
    }

    private boolean registerSdkCallback(String str, SDKCallback sDKCallback) {
        boolean z;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        obtain.writeString(str);
        obtain.writeStrongBinder(sDKCallback);
        IAwareSdkCore.handleEvent(INTERFACE_ID_REGISTER_APP_CALLBACK, obtain, obtain2);
        int readInt = obtain2.readInt();
        StringBuilder sb = new StringBuilder("registerSdkCallback ret: ");
        if (readInt > 0) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        obtain2.recycle();
        obtain.recycle();
        if (readInt > 0) {
            return true;
        }
        return false;
    }

    public boolean registerAppCallback(String str, IAwareAppSdk.AppCallBack appCallBack) {
        this.mAppCbk = appCallBack;
        this.mPackageName = str;
        this.myPid = Process.myPid();
        if (this.mAppCbk != null && this.mSdkCbk == null) {
            this.mSdkCbk = new SDKCallback();
            this.isRegistedSuccess = registerSdkCallback(str, this.mSdkCbk);
        }
        return this.isRegistedSuccess;
    }
}
