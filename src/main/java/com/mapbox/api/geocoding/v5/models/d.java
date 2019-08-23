package com.mapbox.api.geocoding.v5.models;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public final class d extends a {

    public static final class a extends TypeAdapter<g> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<String> f26314a;

        /* renamed from: b  reason: collision with root package name */
        private final Gson f26315b;

        public a(Gson gson) {
            this.f26315b = gson;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object read(com.google.gson.stream.JsonReader r11) throws java.io.IOException {
            /*
                r10 = this;
                com.google.gson.stream.JsonToken r0 = r11.peek()
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                r2 = 0
                if (r0 != r1) goto L_0x000d
                r11.nextNull()
                return r2
            L_0x000d:
                r11.beginObject()
                r4 = r2
                r5 = r4
                r6 = r5
                r7 = r6
                r8 = r7
                r9 = r8
            L_0x0016:
                boolean r0 = r11.hasNext()
                if (r0 == 0) goto L_0x0100
                java.lang.String r0 = r11.nextName()
                com.google.gson.stream.JsonToken r1 = r11.peek()
                com.google.gson.stream.JsonToken r2 = com.google.gson.stream.JsonToken.NULL
                if (r1 != r2) goto L_0x002c
                r11.nextNull()
                goto L_0x0016
            L_0x002c:
                r1 = -1
                int r2 = r0.hashCode()
                switch(r2) {
                    case -1196996774: goto L_0x0067;
                    case 3355: goto L_0x005d;
                    case 3343858: goto L_0x0053;
                    case 3556653: goto L_0x0049;
                    case 50511102: goto L_0x003f;
                    case 1565478864: goto L_0x0035;
                    default: goto L_0x0034;
                }
            L_0x0034:
                goto L_0x0070
            L_0x0035:
                java.lang.String r2 = "short_code"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0070
                r1 = 2
                goto L_0x0070
            L_0x003f:
                java.lang.String r2 = "category"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0070
                r1 = 4
                goto L_0x0070
            L_0x0049:
                java.lang.String r2 = "text"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0070
                r1 = 1
                goto L_0x0070
            L_0x0053:
                java.lang.String r2 = "maki"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0070
                r1 = 5
                goto L_0x0070
            L_0x005d:
                java.lang.String r2 = "id"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0070
                r1 = 0
                goto L_0x0070
            L_0x0067:
                java.lang.String r2 = "wikidata"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0070
                r1 = 3
            L_0x0070:
                switch(r1) {
                    case 0: goto L_0x00e9;
                    case 1: goto L_0x00d2;
                    case 2: goto L_0x00bb;
                    case 3: goto L_0x00a4;
                    case 4: goto L_0x008d;
                    case 5: goto L_0x0077;
                    default: goto L_0x0073;
                }
            L_0x0073:
                r11.skipValue()
                goto L_0x0016
            L_0x0077:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r10.f26314a
                if (r0 != 0) goto L_0x0085
                com.google.gson.Gson r0 = r10.f26315b
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r10.f26314a = r0
            L_0x0085:
                java.lang.Object r0 = r0.read(r11)
                r9 = r0
                java.lang.String r9 = (java.lang.String) r9
                goto L_0x0016
            L_0x008d:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r10.f26314a
                if (r0 != 0) goto L_0x009b
                com.google.gson.Gson r0 = r10.f26315b
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r10.f26314a = r0
            L_0x009b:
                java.lang.Object r0 = r0.read(r11)
                r8 = r0
                java.lang.String r8 = (java.lang.String) r8
                goto L_0x0016
            L_0x00a4:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r10.f26314a
                if (r0 != 0) goto L_0x00b2
                com.google.gson.Gson r0 = r10.f26315b
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r10.f26314a = r0
            L_0x00b2:
                java.lang.Object r0 = r0.read(r11)
                r7 = r0
                java.lang.String r7 = (java.lang.String) r7
                goto L_0x0016
            L_0x00bb:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r10.f26314a
                if (r0 != 0) goto L_0x00c9
                com.google.gson.Gson r0 = r10.f26315b
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r10.f26314a = r0
            L_0x00c9:
                java.lang.Object r0 = r0.read(r11)
                r6 = r0
                java.lang.String r6 = (java.lang.String) r6
                goto L_0x0016
            L_0x00d2:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r10.f26314a
                if (r0 != 0) goto L_0x00e0
                com.google.gson.Gson r0 = r10.f26315b
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r10.f26314a = r0
            L_0x00e0:
                java.lang.Object r0 = r0.read(r11)
                r5 = r0
                java.lang.String r5 = (java.lang.String) r5
                goto L_0x0016
            L_0x00e9:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r10.f26314a
                if (r0 != 0) goto L_0x00f7
                com.google.gson.Gson r0 = r10.f26315b
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r10.f26314a = r0
            L_0x00f7:
                java.lang.Object r0 = r0.read(r11)
                r4 = r0
                java.lang.String r4 = (java.lang.String) r4
                goto L_0x0016
            L_0x0100:
                r11.endObject()
                com.mapbox.api.geocoding.v5.models.d r11 = new com.mapbox.api.geocoding.v5.models.d
                r3 = r11
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.api.geocoding.v5.models.d.a.read(com.google.gson.stream.JsonReader):java.lang.Object");
        }

        public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
            g gVar = (g) obj;
            if (gVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("id");
            if (gVar.id() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.f26314a;
                if (typeAdapter == null) {
                    typeAdapter = this.f26315b.getAdapter(String.class);
                    this.f26314a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, gVar.id());
            }
            jsonWriter.name("text");
            if (gVar.text() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.f26314a;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f26315b.getAdapter(String.class);
                    this.f26314a = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, gVar.text());
            }
            jsonWriter.name("short_code");
            if (gVar.shortCode() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.f26314a;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f26315b.getAdapter(String.class);
                    this.f26314a = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, gVar.shortCode());
            }
            jsonWriter.name("wikidata");
            if (gVar.wikidata() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter4 = this.f26314a;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.f26315b.getAdapter(String.class);
                    this.f26314a = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, gVar.wikidata());
            }
            jsonWriter.name("category");
            if (gVar.category() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter5 = this.f26314a;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.f26315b.getAdapter(String.class);
                    this.f26314a = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, gVar.category());
            }
            jsonWriter.name("maki");
            if (gVar.maki() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter6 = this.f26314a;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.f26315b.getAdapter(String.class);
                    this.f26314a = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, gVar.maki());
            }
            jsonWriter.endObject();
        }
    }

    d(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        super(str, str2, str3, str4, str5, str6);
    }
}
