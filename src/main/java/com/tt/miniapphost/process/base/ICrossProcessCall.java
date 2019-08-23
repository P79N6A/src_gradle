package com.tt.miniapphost.process.base;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tt.miniapphost.process.data.CrossProcessCallEntity;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;

public interface ICrossProcessCall extends IInterface {

    public static abstract class Stub extends Binder implements ICrossProcessCall {

        static class Proxy implements ICrossProcessCall {
            private IBinder mRemote;

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public CrossProcessDataEntity syncCall(CrossProcessCallEntity crossProcessCallEntity) throws RemoteException {
                CrossProcessDataEntity crossProcessDataEntity;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tt.miniapphost.process.base.ICrossProcessCall");
                    crossProcessCallEntity.writeToParcel(obtain, 0);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 1) {
                        crossProcessDataEntity = CrossProcessDataEntity.CREATOR.createFromParcel(obtain2);
                    } else {
                        crossProcessDataEntity = null;
                    }
                    return crossProcessDataEntity;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void asyncCall(CrossProcessCallEntity crossProcessCallEntity, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tt.miniapphost.process.base.ICrossProcessCall");
                    crossProcessCallEntity.writeToParcel(obtain, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(2, obtain, obtain2, 1);
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
            attachInterface(this, "com.tt.miniapphost.process.base.ICrossProcessCall");
        }

        public static ICrossProcessCall asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tt.miniapphost.process.base.ICrossProcessCall");
            if (queryLocalInterface instanceof ICrossProcessCall) {
                return (ICrossProcessCall) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public boolean onTransact(int i, @NonNull Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.tt.miniapphost.process.base.ICrossProcessCall");
                        CrossProcessDataEntity syncCall = syncCall(CrossProcessCallEntity.CREATOR.createFromParcel(parcel));
                        parcel2.writeNoException();
                        if (syncCall != null) {
                            parcel2.writeInt(1);
                            syncCall.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 2:
                        parcel.enforceInterface("com.tt.miniapphost.process.base.ICrossProcessCall");
                        asyncCall(CrossProcessCallEntity.CREATOR.createFromParcel(parcel), parcel.readInt());
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.tt.miniapphost.process.base.ICrossProcessCall");
                return true;
            }
        }
    }

    void asyncCall(CrossProcessCallEntity crossProcessCallEntity, int i) throws RemoteException;

    @Nullable
    CrossProcessDataEntity syncCall(CrossProcessCallEntity crossProcessCallEntity) throws RemoteException;
}
