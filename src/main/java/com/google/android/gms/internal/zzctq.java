package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;

public abstract class zzctq extends zzee implements zzctp {
    public zzctq() {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Parcelable.Creator creator;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 3:
                zzef.zza(parcel, ConnectionResult.CREATOR);
                creator = zzctm.CREATOR;
                break;
            case 4:
            case 6:
                creator = Status.CREATOR;
                break;
            case e.l /*?: ONE_ARG  (7 int)*/:
                zzef.zza(parcel, Status.CREATOR);
                creator = GoogleSignInAccount.CREATOR;
                break;
            case 8:
                zzb((zzctw) zzef.zza(parcel, zzctw.CREATOR));
                break;
            default:
                return false;
        }
        zzef.zza(parcel, creator);
        parcel2.writeNoException();
        return true;
    }
}
