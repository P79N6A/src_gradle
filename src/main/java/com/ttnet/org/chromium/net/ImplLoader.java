package com.ttnet.org.chromium.net;

import android.content.Context;

public final class ImplLoader {
    ImplLoader() {
    }

    static ICronetEngineBuilder load(Context context) {
        try {
            return (ICronetEngineBuilder) Class.forName("com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl").asSubclass(ICronetEngineBuilder.class).getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
        } catch (Exception e2) {
            throw new RuntimeException("Unable to construct the implementation of the Cronet Engine Builder: com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl", e2);
        }
    }
}
