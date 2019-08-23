package com.bytedance.ies.geckoclient.b;

import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public final class a extends TypeAdapter<Boolean> {
    public final /* synthetic */ Object read(JsonReader jsonReader) throws IOException {
        boolean z;
        JsonToken peek = jsonReader.peek();
        switch (peek) {
            case BOOLEAN:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case NULL:
                jsonReader.nextNull();
                return null;
            case NUMBER:
                if (jsonReader.nextInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                throw new JsonParseException("Expected BOOLEAN or NUMBER but was " + peek);
        }
    }

    public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(bool.booleanValue());
        }
    }
}
