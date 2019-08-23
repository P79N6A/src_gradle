package org.android.agoo.service;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface SendMessage extends IInterface {

    public static abstract class Stub extends Binder implements SendMessage {

        static class a implements SendMessage {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f84035a;

            public IBinder asBinder() {
                return this.f84035a;
            }

            a(IBinder iBinder) {
                this.f84035a = iBinder;
            }

            public int doSend(Intent intent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("org.android.agoo.service.SendMessage");
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f84035a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
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
            attachInterface(this, "org.android.agoo.service.SendMessage");
        }

        public static SendMessage asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("org.android.agoo.service.SendMessage");
            if (queryLocalInterface instanceof SendMessage) {
                return (SendMessage) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Intent intent;
            if (i == 1) {
                parcel.enforceInterface("org.android.agoo.service.SendMessage");
                if (parcel.readInt() != 0) {
                    intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
                } else {
                    intent = null;
                }
                int doSend = doSend(intent);
                parcel2.writeNoException();
                parcel2.writeInt(doSend);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("org.android.agoo.service.SendMessage");
                return true;
            }
        }
    }

    int doSend(Intent intent) throws RemoteException;
}
