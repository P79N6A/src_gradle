package com.ss.android.ugc.effectmanager.link.model.configuration;

import android.content.Context;
import android.support.annotation.NonNull;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import java.util.List;

public class LinkSelectorConfiguration {
    public Context mContext;
    public boolean mEnableLinkSelector;
    public boolean mIsLazy;
    public boolean mIsNetworkChangeMonitor = true;
    public List<Host> mOriginHosts;
    public int mRepeatTime = 2;
    public String mSpeedApi = "/ies/speed/";
    public int mSpeedTimeOut = 2000;

    public void setContext(@NonNull Context context) {
        this.mContext = context.getApplicationContext();
    }

    public void setLazy(boolean z) {
        this.mEnableLinkSelector = true;
        this.mIsLazy = z;
    }

    public void setNetworkChangeMonitor(boolean z) {
        this.mEnableLinkSelector = true;
        this.mIsNetworkChangeMonitor = z;
    }

    public void setRepeatTime(int i) {
        this.mEnableLinkSelector = true;
        this.mRepeatTime = i;
    }

    public void setSpeedApi(@NonNull String str) {
        this.mEnableLinkSelector = true;
        this.mSpeedApi = str;
    }

    public void setSpeedTimeOut(int i) {
        this.mEnableLinkSelector = true;
        this.mSpeedTimeOut = i;
    }

    public void setOriginHosts(@NonNull List<Host> list) {
        boolean z = true;
        if (list.size() <= 1) {
            z = false;
        }
        this.mEnableLinkSelector = z;
        this.mOriginHosts = list;
    }
}
