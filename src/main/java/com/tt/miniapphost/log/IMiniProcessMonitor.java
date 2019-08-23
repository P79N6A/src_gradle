package com.tt.miniapphost.log;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IMiniProcessMonitor extends IInterface {

    public static abstract class Stub extends Binder implements IMiniProcessMonitor {

        static class Proxy implements IMiniProcessMonitor {
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.tt.miniapphost.log.IMiniProcessMonitor";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.tt.miniapphost.log.IMiniProcessMonitor");
        }

        public static IMiniProcessMonitor asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tt.miniapphost.log.IMiniProcessMonitor");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IMiniProcessMonitor)) {
                return new Proxy(iBinder);
            }
            return (IMiniProcessMonitor) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.tt.miniapphost.log.IMiniProcessMonitor");
            return true;
        }
    }
}
