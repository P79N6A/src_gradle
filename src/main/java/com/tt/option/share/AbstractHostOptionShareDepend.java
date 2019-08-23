package com.tt.option.share;

import android.support.annotation.Nullable;
import com.tt.miniapphost.process.annotation.MiniAppProcess;
import com.tt.option.BaseAbstractHostDepend;
import com.tt.option.share.HostOptionShareDepend;

public class AbstractHostOptionShareDepend extends BaseAbstractHostDepend<HostOptionShareDepend> implements HostOptionShareDepend {
    @MiniAppProcess
    public String getImplClassName() {
        return "HostOptionShareDependImpl";
    }

    @Nullable
    @MiniAppProcess
    public HostOptionShareDepend.ObtainShareInfoCallback obtainShareInfoCallback() {
        if (inject()) {
            return ((HostOptionShareDepend) this.defaultOptionDepend).obtainShareInfoCallback();
        }
        return null;
    }

    @MiniAppProcess
    public void getShareBaseInfo(String str, OnGetShareBaseInfoListener onGetShareBaseInfoListener) {
        if (inject()) {
            ((HostOptionShareDepend) this.defaultOptionDepend).getShareBaseInfo(str, onGetShareBaseInfoListener);
        }
    }

    @MiniAppProcess
    public void getShareToken(ShareInfoModel shareInfoModel, OnGetShareTokenInfoListener onGetShareTokenInfoListener) {
        if (inject()) {
            ((HostOptionShareDepend) this.defaultOptionDepend).getShareToken(shareInfoModel, onGetShareTokenInfoListener);
        }
    }
}
