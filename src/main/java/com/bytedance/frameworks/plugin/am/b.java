package com.bytedance.frameworks.plugin.am;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface b extends IInterface {

    public static abstract class a extends Binder implements b {

        /* renamed from: com.bytedance.frameworks.plugin.am.b$a$a  reason: collision with other inner class name */
        static class C0165a implements b {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f20005a;

            public final IBinder asBinder() {
                return this.f20005a;
            }

            C0165a(IBinder iBinder) {
                this.f20005a = iBinder;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public a() {
            attachInterface(this, "com.bytedance.frameworks.plugin.am.IApplicationThread");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.bytedance.frameworks.plugin.am.IApplicationThread");
            return true;
        }
    }
}
