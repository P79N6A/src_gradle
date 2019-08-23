package com.facebook.c.a;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class a<T> {
    /* access modifiers changed from: package-private */
    public abstract T b(JsonReader jsonReader) throws IOException;

    public final List<T> a(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(b(jsonReader));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
