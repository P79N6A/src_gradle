package com.ss.android.ugc.aweme.profile.c;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.Streams;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;

public final class a extends TypeAdapter<String> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61354a;

    public final /* synthetic */ Object read(JsonReader jsonReader) throws IOException {
        if (PatchProxy.isSupport(new Object[]{jsonReader}, this, f61354a, false, 67473, new Class[]{JsonReader.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{jsonReader}, this, f61354a, false, 67473, new Class[]{JsonReader.class}, String.class);
        }
        JsonElement parse = Streams.parse(jsonReader);
        if (parse != null) {
            return parse.toString();
        }
        return null;
    }

    public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
        JsonWriter jsonWriter2 = jsonWriter;
        String str = (String) obj;
        if (PatchProxy.isSupport(new Object[]{jsonWriter2, str}, this, f61354a, false, 67472, new Class[]{JsonWriter.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jsonWriter2, str}, this, f61354a, false, 67472, new Class[]{JsonWriter.class, String.class}, Void.TYPE);
            return;
        }
        TypeAdapters.JSON_ELEMENT.write(jsonWriter2, new JsonParser().parse(str));
    }
}
