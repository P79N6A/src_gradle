package com.ss.android.ugc.effectmanager.effect.model.net;

import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;

public class PanelInfoResponse extends BaseNetResponse {
    public PanelInfoModel data;

    public boolean checkValue() {
        if (this.data != null) {
            return true;
        }
        return false;
    }
}
