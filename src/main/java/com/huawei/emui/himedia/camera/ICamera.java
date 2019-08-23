package com.huawei.emui.himedia.camera;

import android.hardware.camera2.CaptureRequest;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface ICamera extends IInterface {

    public static abstract class Stub extends Binder implements ICamera {

        static class Proxy implements ICamera {
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.android.huawei.HiMediaEngine.ICamera";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public String getCaptureResultKeyName(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.huawei.HiMediaEngine.ICamera");
                    obtain.writeInt(i);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public byte[] getSupportApertureValue(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.huawei.HiMediaEngine.ICamera");
                    obtain.writeString(str);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createByteArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String[] getSupportedFeature(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.huawei.HiMediaEngine.ICamera");
                    obtain.writeInt(i);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createStringArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getCaptureRequestKeyIndex(CaptureRequest captureRequest, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.huawei.HiMediaEngine.ICamera");
                    captureRequest.writeToParcel(obtain, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public byte isFeatureSupported(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.huawei.HiMediaEngine.ICamera");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readByte();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.android.huawei.HiMediaEngine.ICamera");
        }

        public static ICamera asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.huawei.HiMediaEngine.ICamera");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ICamera)) {
                return new Proxy(iBinder);
            }
            return (ICamera) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.android.huawei.HiMediaEngine.ICamera");
                        String[] supportedFeature = getSupportedFeature(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeStringArray(supportedFeature);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.android.huawei.HiMediaEngine.ICamera");
                        byte isFeatureSupported = isFeatureSupported(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeByte(isFeatureSupported);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.android.huawei.HiMediaEngine.ICamera");
                        int captureRequestKeyIndex = getCaptureRequestKeyIndex((CaptureRequest) CaptureRequest.CREATOR.createFromParcel(parcel), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(captureRequestKeyIndex);
                        return true;
                    case 4:
                        parcel.enforceInterface("com.android.huawei.HiMediaEngine.ICamera");
                        String captureResultKeyName = getCaptureResultKeyName(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeString(captureResultKeyName);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.android.huawei.HiMediaEngine.ICamera");
                        byte[] supportApertureValue = getSupportApertureValue(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeByteArray(supportApertureValue);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.android.huawei.HiMediaEngine.ICamera");
                return true;
            }
        }
    }

    int getCaptureRequestKeyIndex(CaptureRequest captureRequest, int i) throws RemoteException;

    String getCaptureResultKeyName(int i) throws RemoteException;

    byte[] getSupportApertureValue(String str) throws RemoteException;

    String[] getSupportedFeature(int i) throws RemoteException;

    byte isFeatureSupported(int i, int i2) throws RemoteException;
}
