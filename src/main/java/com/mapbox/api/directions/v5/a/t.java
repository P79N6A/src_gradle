package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public final class t extends d {

    public static final class a extends TypeAdapter<aj> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<String> f26263a;

        /* renamed from: b  reason: collision with root package name */
        private final Gson f26264b;

        public a(Gson gson) {
            this.f26264b = gson;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object read(com.google.gson.stream.JsonReader r7) throws java.io.IOException {
            /*
                r6 = this;
                com.google.gson.stream.JsonToken r0 = r7.peek()
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                r2 = 0
                if (r0 != r1) goto L_0x000d
                r7.nextNull()
                return r2
            L_0x000d:
                r7.beginObject()
                r0 = r2
            L_0x0011:
                boolean r1 = r7.hasNext()
                if (r1 == 0) goto L_0x007c
                java.lang.String r1 = r7.nextName()
                com.google.gson.stream.JsonToken r3 = r7.peek()
                com.google.gson.stream.JsonToken r4 = com.google.gson.stream.JsonToken.NULL
                if (r3 != r4) goto L_0x0027
                r7.nextNull()
                goto L_0x0011
            L_0x0027:
                r3 = -1
                int r4 = r1.hashCode()
                r5 = 3059181(0x2eaded, float:4.286826E-39)
                if (r4 == r5) goto L_0x0041
                r5 = 954925063(0x38eb0007, float:1.1205678E-4)
                if (r4 == r5) goto L_0x0037
                goto L_0x004a
            L_0x0037:
                java.lang.String r4 = "message"
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L_0x004a
                r3 = 1
                goto L_0x004a
            L_0x0041:
                java.lang.String r4 = "code"
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L_0x004a
                r3 = 0
            L_0x004a:
                switch(r3) {
                    case 0: goto L_0x0066;
                    case 1: goto L_0x0051;
                    default: goto L_0x004d;
                }
            L_0x004d:
                r7.skipValue()
                goto L_0x0011
            L_0x0051:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r6.f26263a
                if (r0 != 0) goto L_0x005f
                com.google.gson.Gson r0 = r6.f26264b
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r6.f26263a = r0
            L_0x005f:
                java.lang.Object r0 = r0.read(r7)
                java.lang.String r0 = (java.lang.String) r0
                goto L_0x0011
            L_0x0066:
                com.google.gson.TypeAdapter<java.lang.String> r1 = r6.f26263a
                if (r1 != 0) goto L_0x0074
                com.google.gson.Gson r1 = r6.f26264b
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                com.google.gson.TypeAdapter r1 = r1.getAdapter((java.lang.Class<T>) r2)
                r6.f26263a = r1
            L_0x0074:
                java.lang.Object r1 = r1.read(r7)
                r2 = r1
                java.lang.String r2 = (java.lang.String) r2
                goto L_0x0011
            L_0x007c:
                r7.endObject()
                com.mapbox.api.directions.v5.a.t r7 = new com.mapbox.api.directions.v5.a.t
                r7.<init>(r2, r0)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.api.directions.v5.a.t.a.read(com.google.gson.stream.JsonReader):java.lang.Object");
        }

        public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
            aj ajVar = (aj) obj;
            if (ajVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("code");
            if (ajVar.code() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.f26263a;
                if (typeAdapter == null) {
                    typeAdapter = this.f26264b.getAdapter(String.class);
                    this.f26263a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, ajVar.code());
            }
            jsonWriter.name("message");
            if (ajVar.message() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.f26263a;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f26264b.getAdapter(String.class);
                    this.f26263a = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, ajVar.message());
            }
            jsonWriter.endObject();
        }
    }

    t(@Nullable String str, @Nullable String str2) {
        super(str, str2);
    }
}
