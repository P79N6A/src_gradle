package com.alibaba.fastjson;

import com.google.gson.stream.JsonReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;

@Deprecated
public class JSONReader implements Closeable {
    JsonReader mReader;

    public void close() throws IOException {
        this.mReader.close();
    }

    public JSONReader(Reader reader) {
        this.mReader = new JsonReader(reader);
    }

    public <T> T readObject(Class<T> cls) {
        return JSON.createAdapterGson().fromJson(this.mReader, (Type) cls);
    }
}
