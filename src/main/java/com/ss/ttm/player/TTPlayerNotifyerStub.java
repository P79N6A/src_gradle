package com.ss.ttm.player;

import android.os.RemoteException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ttm.player.ITTNotifyer;

public class TTPlayerNotifyerStub extends ITTNotifyer.Stub {
    public static ChangeQuickRedirect changeQuickRedirect;
    TTPlayerConnection mConnection;

    TTPlayerNotifyerStub(TTPlayerConnection tTPlayerConnection) {
        this.mConnection = tTPlayerConnection;
    }

    public void handleErrorNotify(long j, int i, int i2, String str) throws RemoteException {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), str}, this, changeQuickRedirect, false, 91053, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), str}, this, changeQuickRedirect, false, 91053, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        this.mConnection.handlePlayerError(j, i, i2, str);
    }

    public void handlePlayerNotify(long j, int i, int i2, int i3, String str) throws RemoteException {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, this, changeQuickRedirect, false, 91052, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 91052, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        this.mConnection.recvNotify(j, i, i2, i3, str);
    }
}
