package com.ss.android.ugc.effectmanager.effect.model.net;

import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FetchFavoriteListResponse extends BaseNetResponse {
    private List<Data> data = new ArrayList();

    static class Data implements Serializable {
        public List<Effect> effects = new ArrayList();
        public String type;

        private Data() {
        }
    }

    public boolean checkValued() {
        if (this.data == null) {
            this.data = new ArrayList();
        }
        return true;
    }

    public List<Effect> getEffects() {
        return this.data.get(0).effects;
    }

    public String getType() {
        return this.data.get(0).type;
    }
}