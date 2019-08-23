package com.bytedance.retrofit2.client;

import java.io.IOException;

public interface Client {

    public interface Provider {
        Client get();
    }

    a newSsCall(Request request) throws IOException;
}
