package com.ss.android.ugc.aweme.utils;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;

public final class dj extends TypeAdapter<String> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75753a;

    public final /* synthetic */ Object read(JsonReader jsonReader) throws IOException {
        if (PatchProxy.isSupport(new Object[]{jsonReader}, this, f75753a, false, 88521, new Class[]{JsonReader.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{jsonReader}, this, f75753a, false, 88521, new Class[]{JsonReader.class}, String.class);
        }
        JsonToken peek = jsonReader.peek();
        switch (peek) {
            case NULL:
                jsonReader.nextNull();
                return null;
            case STRING:
                String nextString = jsonReader.nextString();
                if (nextString.contains("\r\n")) {
                    nextString = nextString.replaceAll("\r\n", "\n");
                }
                return nextString;
            default:
                throw new JsonSyntaxException("expect STRING, but got " + peek.name() + " at " + jsonReader.getPath());
        }
    }

    public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
        JsonWriter jsonWriter2 = jsonWriter;
        String str = (String) obj;
        if (PatchProxy.isSupport(new Object[]{jsonWriter2, str}, this, f75753a, false, 88520, new Class[]{JsonWriter.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jsonWriter2, str}, this, f75753a, false, 88520, new Class[]{JsonWriter.class, String.class}, Void.TYPE);
            return;
        }
        jsonWriter2.value(str);
    }
}
