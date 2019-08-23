package anetwork.channel.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import anetwork.channel.aidl.ParcelableInputStream;
import anetwork.channel.statist.StatisticData;
import java.util.Map;

public interface Connection extends IInterface {

    public static abstract class Stub extends Binder implements Connection {

        static class Proxy implements Connection {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f1456a;

            public IBinder asBinder() {
                return this.f1456a;
            }

            public void cancel() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("anetwork.channel.aidl.Connection");
                    this.f1456a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public Map getConnHeadFields() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("anetwork.channel.aidl.Connection");
                    this.f1456a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getDesc() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("anetwork.channel.aidl.Connection");
                    this.f1456a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public ParcelableInputStream getInputStream() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("anetwork.channel.aidl.Connection");
                    this.f1456a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return ParcelableInputStream.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public StatisticData getStatisticData() throws RemoteException {
                StatisticData statisticData;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("anetwork.channel.aidl.Connection");
                    this.f1456a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 1) {
                        statisticData = (StatisticData) obtain2.readSerializable();
                    } else {
                        statisticData = null;
                    }
                    return statisticData;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getStatusCode() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("anetwork.channel.aidl.Connection");
                    this.f1456a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            Proxy(IBinder iBinder) {
                this.f1456a = iBinder;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "anetwork.channel.aidl.Connection");
        }

        public static Connection asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("anetwork.channel.aidl.Connection");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof Connection)) {
                return new Proxy(iBinder);
            }
            return (Connection) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            IBinder iBinder;
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("anetwork.channel.aidl.Connection");
                        ParcelableInputStream inputStream = getInputStream();
                        parcel2.writeNoException();
                        if (inputStream != null) {
                            iBinder = inputStream.asBinder();
                        } else {
                            iBinder = null;
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 2:
                        parcel.enforceInterface("anetwork.channel.aidl.Connection");
                        int statusCode = getStatusCode();
                        parcel2.writeNoException();
                        parcel2.writeInt(statusCode);
                        return true;
                    case 3:
                        parcel.enforceInterface("anetwork.channel.aidl.Connection");
                        String desc = getDesc();
                        parcel2.writeNoException();
                        parcel2.writeString(desc);
                        return true;
                    case 4:
                        parcel.enforceInterface("anetwork.channel.aidl.Connection");
                        Map connHeadFields = getConnHeadFields();
                        parcel2.writeNoException();
                        parcel2.writeMap(connHeadFields);
                        return true;
                    case 5:
                        parcel.enforceInterface("anetwork.channel.aidl.Connection");
                        StatisticData statisticData = getStatisticData();
                        parcel2.writeNoException();
                        if (statisticData != null) {
                            parcel2.writeInt(1);
                            parcel2.writeSerializable(statisticData);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 6:
                        parcel.enforceInterface("anetwork.channel.aidl.Connection");
                        cancel();
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("anetwork.channel.aidl.Connection");
                return true;
            }
        }
    }

    void cancel() throws RemoteException;

    Map getConnHeadFields() throws RemoteException;

    String getDesc() throws RemoteException;

    ParcelableInputStream getInputStream() throws RemoteException;

    StatisticData getStatisticData() throws RemoteException;

    int getStatusCode() throws RemoteException;
}
