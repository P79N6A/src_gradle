package com.umeng.commonsdk.statistics.noise;

import android.content.Context;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.d;

public class Defcon implements d {
    private static Defcon instanse;
    private int mLevel;

    private Defcon() {
    }

    public int getLevel() {
        return this.mLevel;
    }

    public boolean isOpen() {
        if (this.mLevel != 0) {
            return true;
        }
        return false;
    }

    public long getRetryInterval() {
        if (this.mLevel == 0) {
            return 0;
        }
        return 300000;
    }

    public long getReqInterval() {
        switch (this.mLevel) {
            case 1:
                return 14400000;
            case 2:
                return 28800000;
            case 3:
                return 86400000;
            default:
                return 0;
        }
    }

    public void setLevel(int i) {
        if (i >= 0 && i <= 3) {
            this.mLevel = i;
        }
    }

    public void onImprintChanged(ImprintHandler.a aVar) {
        setLevel(Integer.valueOf(aVar.a("defcon", PushConstants.PUSH_TYPE_NOTIFY)).intValue());
    }

    public static synchronized Defcon getService(Context context) {
        Defcon defcon;
        synchronized (Defcon.class) {
            if (instanse == null) {
                instanse = new Defcon();
                instanse.setLevel(Integer.valueOf(UMEnvelopeBuild.imprintProperty(context, "defcon", PushConstants.PUSH_TYPE_NOTIFY)).intValue());
            }
            defcon = instanse;
        }
        return defcon;
    }
}
