package com.tencent.wcdb;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IContentObserver extends IInterface {

    public static abstract class Stub extends Binder implements IContentObserver {

        static class Proxy implements IContentObserver {
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.tencent.wcdb.IContentObserver";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public void onChange(boolean z, Uri uri) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.wcdb.IContentObserver");
                    obtain.writeInt(z ? 1 : 0);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.tencent.wcdb.IContentObserver");
        }

        public static IContentObserver asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.wcdb.IContentObserver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IContentObserver)) {
                return new Proxy(iBinder);
            }
            return (IContentObserver) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            Uri uri;
            if (i == 1) {
                parcel.enforceInterface("com.tencent.wcdb.IContentObserver");
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                } else {
                    uri = null;
                }
                onChange(z, uri);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.wcdb.IContentObserver");
                return true;
            }
        }
    }

    void onChange(boolean z, Uri uri) throws RemoteException;
}
