package com.squareup.wire;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import javax.annotation.Nullable;
import okio.ByteString;

public class ByteStringTypeAdapter extends TypeAdapter<ByteString> {
    ByteStringTypeAdapter() {
    }

    @Nullable
    public ByteString read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() != JsonToken.NULL) {
            return ByteString.decodeBase64(jsonReader.nextString());
        }
        jsonReader.nextNull();
        return null;
    }

    public void write(JsonWriter jsonWriter, @Nullable ByteString byteString) throws IOException {
        if (byteString == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(byteString.base64());
        }
    }
}
