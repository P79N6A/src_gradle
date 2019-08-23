package com.ss.android.ugc.effectmanager.effect.model.net;

import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;

public class CategoryEffectListResponse extends BaseNetResponse {
    public CategoryPageModel data;

    public boolean checkValue() {
        if (this.data == null || this.data.category_effects == null) {
            return false;
        }
        return true;
    }
}
