package anetwork.channel.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import anetwork.channel.aidl.RemoteNetwork;

public interface IRemoteNetworkGetter extends IInterface {

    public static abstract class Stub extends Binder implements IRemoteNetworkGetter {

        static class Proxy implements IRemoteNetworkGetter {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f1466a;

            public IBinder asBinder() {
                return this.f1466a;
            }

            Proxy(IBinder iBinder) {
                this.f1466a = iBinder;
            }

            public RemoteNetwork get(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("anetwork.channel.aidl.IRemoteNetworkGetter");
                    obtain.writeInt(i);
                    this.f1466a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return RemoteNetwork.Stub.asInterface(obtain2.readStrongBinder());
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
            attachInterface(this, "anetwork.channel.aidl.IRemoteNetworkGetter");
        }

        public static IRemoteNetworkGetter asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("anetwork.channel.aidl.IRemoteNetworkGetter");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IRemoteNetworkGetter)) {
                return new Proxy(iBinder);
            }
            return (IRemoteNetworkGetter) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            IBinder iBinder;
            if (i == 1) {
                parcel.enforceInterface("anetwork.channel.aidl.IRemoteNetworkGetter");
                RemoteNetwork remoteNetwork = get(parcel.readInt());
                parcel2.writeNoException();
                if (remoteNetwork != null) {
                    iBinder = remoteNetwork.asBinder();
                } else {
                    iBinder = null;
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("anetwork.channel.aidl.IRemoteNetworkGetter");
                return true;
            }
        }
    }

    RemoteNetwork get(int i) throws RemoteException;
}
