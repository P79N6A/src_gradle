package com.ss.android.websocket.a;

import java.io.IOException;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;

public interface c {
    void a(int i, String str);

    void a(a aVar, Response response);

    void a(IOException iOException, Response response);

    void a(ResponseBody responseBody) throws IOException;

    void a(Buffer buffer);
}
