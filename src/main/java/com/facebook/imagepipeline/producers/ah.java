package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.image.b;
import com.facebook.imagepipeline.producers.s;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import javax.annotation.Nullable;

public interface ah<FETCH_STATE extends s> {

    public interface a {
        void onCancellation();

        void onFailure(Throwable th);

        void onResponse(InputStream inputStream, int i) throws IOException;
    }

    FETCH_STATE createFetchState(Consumer<b> consumer, am amVar);

    void fetch(FETCH_STATE fetch_state, a aVar);

    @Nullable
    Map<String, String> getExtraMap(FETCH_STATE fetch_state, int i);

    void onFetchCompletion(FETCH_STATE fetch_state, int i);

    boolean shouldPropagate(FETCH_STATE fetch_state);
}
