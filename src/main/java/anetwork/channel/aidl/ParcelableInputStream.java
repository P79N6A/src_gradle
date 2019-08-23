package anetwork.channel.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;

public interface ParcelableInputStream extends IInterface {

    public static abstract class Stub extends Binder implements ParcelableInputStream {

        static class Proxy implements ParcelableInputStream {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f1479a;

            public IBinder asBinder() {
                return this.f1479a;
            }

            public int available() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("anetwork.channel.aidl.ParcelableInputStream");
                    this.f1479a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void close() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("anetwork.channel.aidl.ParcelableInputStream");
                    this.f1479a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int length() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("anetwork.channel.aidl.ParcelableInputStream");
                    this.f1479a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int readByte() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("anetwork.channel.aidl.ParcelableInputStream");
                    this.f1479a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            Proxy(IBinder iBinder) {
                this.f1479a = iBinder;
            }

            public int read(byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("anetwork.channel.aidl.ParcelableInputStream");
                    if (bArr == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr.length);
                    }
                    this.f1479a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr);
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public long skip(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("anetwork.channel.aidl.ParcelableInputStream");
                    obtain.writeInt(i);
                    this.f1479a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int readBytes(byte[] bArr, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("anetwork.channel.aidl.ParcelableInputStream");
                    if (bArr == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr.length);
                    }
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f1479a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr);
                    return readInt;
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
            attachInterface(this, "anetwork.channel.aidl.ParcelableInputStream");
        }

        public static ParcelableInputStream asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("anetwork.channel.aidl.ParcelableInputStream");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ParcelableInputStream)) {
                return new Proxy(iBinder);
            }
            return (ParcelableInputStream) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                byte[] bArr = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("anetwork.channel.aidl.ParcelableInputStream");
                        int available = available();
                        parcel2.writeNoException();
                        parcel2.writeInt(available);
                        return true;
                    case 2:
                        parcel.enforceInterface("anetwork.channel.aidl.ParcelableInputStream");
                        close();
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("anetwork.channel.aidl.ParcelableInputStream");
                        int readByte = readByte();
                        parcel2.writeNoException();
                        parcel2.writeInt(readByte);
                        return true;
                    case 4:
                        parcel.enforceInterface("anetwork.channel.aidl.ParcelableInputStream");
                        int readInt = parcel.readInt();
                        if (readInt >= 0) {
                            bArr = new byte[readInt];
                        }
                        int readBytes = readBytes(bArr, parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(readBytes);
                        parcel2.writeByteArray(bArr);
                        return true;
                    case 5:
                        parcel.enforceInterface("anetwork.channel.aidl.ParcelableInputStream");
                        int readInt2 = parcel.readInt();
                        if (readInt2 >= 0) {
                            bArr = new byte[readInt2];
                        }
                        int read = read(bArr);
                        parcel2.writeNoException();
                        parcel2.writeInt(read);
                        parcel2.writeByteArray(bArr);
                        return true;
                    case 6:
                        parcel.enforceInterface("anetwork.channel.aidl.ParcelableInputStream");
                        long skip = skip(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeLong(skip);
                        return true;
                    case e.l /*7*/:
                        parcel.enforceInterface("anetwork.channel.aidl.ParcelableInputStream");
                        int length = length();
                        parcel2.writeNoException();
                        parcel2.writeInt(length);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("anetwork.channel.aidl.ParcelableInputStream");
                return true;
            }
        }
    }

    int available() throws RemoteException;

    void close() throws RemoteException;

    int length() throws RemoteException;

    int read(byte[] bArr) throws RemoteException;

    int readByte() throws RemoteException;

    int readBytes(byte[] bArr, int i, int i2) throws RemoteException;

    long skip(int i) throws RemoteException;
}
