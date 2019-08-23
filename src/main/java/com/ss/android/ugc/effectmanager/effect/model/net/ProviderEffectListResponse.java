package com.ss.android.ugc.effectmanager.effect.model.net;

import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;

public class ProviderEffectListResponse extends BaseNetResponse {
    public ProviderEffectModel data;

    public boolean checkValue() {
        if (this.data != null) {
            return true;
        }
        return false;
    }
}
