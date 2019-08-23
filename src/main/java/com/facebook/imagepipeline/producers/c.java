package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.s;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class c<FETCH_STATE extends s> implements ah<FETCH_STATE> {
    @Nullable
    public Map<String, String> getExtraMap(FETCH_STATE fetch_state, int i) {
        return null;
    }

    public void onFetchCompletion(FETCH_STATE fetch_state, int i) {
    }

    public boolean shouldPropagate(FETCH_STATE fetch_state) {
        return true;
    }
}
