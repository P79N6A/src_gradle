package com.taobao.accs.client;

import android.content.Context;
import com.taobao.accs.IProcessName;
import com.taobao.accs.client.AccsConfig;
import com.taobao.accs.data.Message;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.h;

public class GlobalConfig {
    public static boolean enableCookie = true;
    public static AccsConfig.ACCS_GROUP mGroup = AccsConfig.ACCS_GROUP.TAOBAO;

    public static void setChannelProcessName(String str) {
        a.f78913e = str;
    }

    public static void setControlFrameMaxRetry(int i) {
        Message.f78926a = i;
    }

    public static void setCurrProcessNameImpl(IProcessName iProcessName) {
        a.f78914f = iProcessName;
    }

    public static void setMainProcessName(String str) {
        a.f78912d = str;
    }

    public static void setChannelReuse(boolean z, AccsConfig.ACCS_GROUP accs_group) {
        GlobalClientInfo.f78906d = z;
        mGroup = accs_group;
    }

    public static void setEnableForground(Context context, boolean z) {
        int i = 0;
        ALog.i("GlobalConfig", "setEnableForground", "enable", Boolean.valueOf(z));
        if (z) {
            i = 24;
        }
        h.a(context, "support_foreground_v", i);
    }
}
