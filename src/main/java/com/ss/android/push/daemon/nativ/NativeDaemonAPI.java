package com.ss.android.push.daemon.nativ;

import android.content.Context;
import com.ss.android.push.daemon.NativeDaemonBase;

public class NativeDaemonAPI extends NativeDaemonBase {
    public native void doDaemon(String str, String str2, String str3, String str4);

    static {
        try {
            System.loadLibrary("daemon");
        } catch (Exception unused) {
        }
    }

    public NativeDaemonAPI(Context context) {
        super(context);
    }
}
