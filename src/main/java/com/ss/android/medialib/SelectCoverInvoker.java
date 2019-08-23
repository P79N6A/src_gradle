package com.ss.android.medialib;

import android.support.annotation.Keep;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.medialib.SelectCoverManager;
import com.ss.android.ttve.nativePort.b;

@Keep
@Deprecated
public class SelectCoverInvoker {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected static SelectCoverInvoker mSingleton;

    public native int destroyEnv();

    public native int[] getSelectedCover();

    public native int getThumbnail(long[] jArr);

    public native int initEnv(Surface surface, int i, int i2, String str, int i3, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int[] iArr);

    public native int registerInterfaceNameNative(SelectCoverManager.interface_name interface_name);

    public native int selectCover(int i);

    public native int unRegisterInterfaceNameNative();

    static {
        b.a();
    }

    public SelectCoverInvoker() {
        mSingleton = this;
    }
}
