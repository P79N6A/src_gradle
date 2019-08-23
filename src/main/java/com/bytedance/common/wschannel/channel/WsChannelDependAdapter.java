package com.bytedance.common.wschannel.channel;

import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.tools.SafelyLibraryLoader;

public class WsChannelDependAdapter implements IWsChannelDepend {
    public static WsChannelDependAdapter INSTANCE = new WsChannelDependAdapter();

    public void loggerD(String str, String str2) {
    }

    public void setAdapter(IWsChannelDepend iWsChannelDepend) {
    }

    private WsChannelDependAdapter() {
    }

    public static WsChannelDependAdapter inst() {
        return INSTANCE;
    }

    public boolean loggerDebug() {
        return Logger.debug();
    }

    public int getNetworkType(Context context) {
        return NetworkUtils.getNetworkType(context).getValue();
    }

    public void loadLibrary(Context context, String str) {
        SafelyLibraryLoader.loadLibrary(context, str);
    }
}
