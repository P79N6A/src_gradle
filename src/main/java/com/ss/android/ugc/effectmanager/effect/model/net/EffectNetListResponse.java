package com.ss.android.ugc.effectmanager.effect.model.net;

import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelModel;

public class EffectNetListResponse extends BaseNetResponse {
    public EffectChannelModel data;

    public boolean checkValued() {
        if (this.data == null || !this.data.checkValued()) {
            return false;
        }
        return true;
    }
}
