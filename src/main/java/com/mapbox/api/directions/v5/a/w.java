package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public final class w extends g {

    public static final class a extends TypeAdapter<an> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<String> f26274a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<double[]> f26275b;

        /* renamed from: c  reason: collision with root package name */
        private final Gson f26276c;

        public a(Gson gson) {
            this.f26276c = gson;
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
                r5 = 3373707(0x337a8b, float:4.72757E-39)
                if (r4 == r5) goto L_0x0041
                r5 = 1901043637(0x714f9fb5, float:1.0281035E30)
                if (r4 == r5) goto L_0x0037
                goto L_0x004a
            L_0x0037:
                java.lang.String r4 = "location"
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L_0x004a
                r3 = 1
                goto L_0x004a
            L_0x0041:
                java.lang.String r4 = "name"
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
                com.google.gson.TypeAdapter<double[]> r0 = r6.f26275b
                if (r0 != 0) goto L_0x005f
                com.google.gson.Gson r0 = r6.f26276c
                java.lang.Class<double[]> r1 = double[].class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r6.f26275b = r0
            L_0x005f:
                java.lang.Object r0 = r0.read(r7)
                double[] r0 = (double[]) r0
                goto L_0x0011
            L_0x0066:
                com.google.gson.TypeAdapter<java.lang.String> r1 = r6.f26274a
                if (r1 != 0) goto L_0x0074
                com.google.gson.Gson r1 = r6.f26276c
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                com.google.gson.TypeAdapter r1 = r1.getAdapter((java.lang.Class<T>) r2)
                r6.f26274a = r1
            L_0x0074:
                java.lang.Object r1 = r1.read(r7)
                r2 = r1
                java.lang.String r2 = (java.lang.String) r2
                goto L_0x0011
            L_0x007c:
                r7.endObject()
                com.mapbox.api.directions.v5.a.w r7 = new com.mapbox.api.directions.v5.a.w
                r7.<init>(r2, r0)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.api.directions.v5.a.w.a.read(com.google.gson.stream.JsonReader):java.lang.Object");
        }

        public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
            an anVar = (an) obj;
            if (anVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("name");
            if (anVar.name() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.f26274a;
                if (typeAdapter == null) {
                    typeAdapter = this.f26276c.getAdapter(String.class);
                    this.f26274a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, anVar.name());
            }
            jsonWriter.name("location");
            if (anVar.a() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<double[]> typeAdapter2 = this.f26275b;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f26276c.getAdapter(double[].class);
                    this.f26275b = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, anVar.a());
            }
            jsonWriter.endObject();
        }
    }

    w(@Nullable String str, @Nullable double[] dArr) {
        super(str, dArr);
    }
}
