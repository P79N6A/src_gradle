package com.ss.android.ugc.effectmanager.model;

import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import java.util.List;
import java.util.Map;

public class DownloadableModelResponse extends BaseNetResponse {
    private Data data;

    public static class Data {
        private Map<String, List<ModelInfo>> arithmetics;

        public Map<String, List<ModelInfo>> getArithmetics() {
            return this.arithmetics;
        }

        public void setArithmetics(Map<String, List<ModelInfo>> map) {
            this.arithmetics = map;
        }
    }

    public Data getData() {
        return this.data;
    }

    public void setData(Data data2) {
        this.data = data2;
    }
}
