package com.ss.android.ugc.aweme.antiaddic.lock.entity;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

@Keep
public class MinorSetting implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<MinorSettingData> minorSetting;

    public List<MinorSettingData> getMinorSetting() {
        return this.minorSetting;
    }

    public void setMinorSetting(List<MinorSettingData> list) {
        this.minorSetting = list;
    }
}
