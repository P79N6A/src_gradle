package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;

public final class u extends e {

    public static final class a extends TypeAdapter<al> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<String> f26265a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<List<an>> f26266b;

        /* renamed from: c  reason: collision with root package name */
        private volatile TypeAdapter<List<am>> f26267c;

        /* renamed from: d  reason: collision with root package name */
        private final Gson f26268d;

        public a(Gson gson) {
            this.f26268d = gson;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.String} */
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
            L_0x0015:
                boolean r0 = r11.hasNext()
                if (r0 == 0) goto L_0x00f4
                java.lang.String r0 = r11.nextName()
                com.google.gson.stream.JsonToken r1 = r11.peek()
                com.google.gson.stream.JsonToken r2 = com.google.gson.stream.JsonToken.NULL
                if (r1 != r2) goto L_0x002b
                r11.nextNull()
                goto L_0x0015
            L_0x002b:
                r1 = -1
                int r2 = r0.hashCode()
                r3 = 1
                r9 = 0
                switch(r2) {
                    case -925132982: goto L_0x005e;
                    case 3059181: goto L_0x0054;
                    case 3601339: goto L_0x004a;
                    case 241170578: goto L_0x0040;
                    case 954925063: goto L_0x0036;
                    default: goto L_0x0035;
                }
            L_0x0035:
                goto L_0x0067
            L_0x0036:
                java.lang.String r2 = "message"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0067
                r1 = 1
                goto L_0x0067
            L_0x0040:
                java.lang.String r2 = "waypoints"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0067
                r1 = 2
                goto L_0x0067
            L_0x004a:
                java.lang.String r2 = "uuid"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0067
                r1 = 4
                goto L_0x0067
            L_0x0054:
                java.lang.String r2 = "code"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0067
                r1 = 0
                goto L_0x0067
            L_0x005e:
                java.lang.String r2 = "routes"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0067
                r1 = 3
            L_0x0067:
                switch(r1) {
                    case 0: goto L_0x00dd;
                    case 1: goto L_0x00c6;
                    case 2: goto L_0x00a5;
                    case 3: goto L_0x0084;
                    case 4: goto L_0x006e;
                    default: goto L_0x006a;
                }
            L_0x006a:
                r11.skipValue()
                goto L_0x0015
            L_0x006e:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r10.f26265a
                if (r0 != 0) goto L_0x007c
                com.google.gson.Gson r0 = r10.f26268d
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r10.f26265a = r0
            L_0x007c:
                java.lang.Object r0 = r0.read(r11)
                r8 = r0
                java.lang.String r8 = (java.lang.String) r8
                goto L_0x0015
            L_0x0084:
                com.google.gson.TypeAdapter<java.util.List<com.mapbox.api.directions.v5.a.am>> r0 = r10.f26267c
                if (r0 != 0) goto L_0x009c
                com.google.gson.Gson r0 = r10.f26268d
                java.lang.Class<java.util.List> r1 = java.util.List.class
                java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r3]
                java.lang.Class<com.mapbox.api.directions.v5.a.am> r3 = com.mapbox.api.directions.v5.a.am.class
                r2[r9] = r3
                com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.getParameterized(r1, r2)
                com.google.gson.TypeAdapter r0 = r0.getAdapter((com.google.gson.reflect.TypeToken<T>) r1)
                r10.f26267c = r0
            L_0x009c:
                java.lang.Object r0 = r0.read(r11)
                r7 = r0
                java.util.List r7 = (java.util.List) r7
                goto L_0x0015
            L_0x00a5:
                com.google.gson.TypeAdapter<java.util.List<com.mapbox.api.directions.v5.a.an>> r0 = r10.f26266b
                if (r0 != 0) goto L_0x00bd
                com.google.gson.Gson r0 = r10.f26268d
                java.lang.Class<java.util.List> r1 = java.util.List.class
                java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r3]
                java.lang.Class<com.mapbox.api.directions.v5.a.an> r3 = com.mapbox.api.directions.v5.a.an.class
                r2[r9] = r3
                com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.getParameterized(r1, r2)
                com.google.gson.TypeAdapter r0 = r0.getAdapter((com.google.gson.reflect.TypeToken<T>) r1)
                r10.f26266b = r0
            L_0x00bd:
                java.lang.Object r0 = r0.read(r11)
                r6 = r0
                java.util.List r6 = (java.util.List) r6
                goto L_0x0015
            L_0x00c6:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r10.f26265a
                if (r0 != 0) goto L_0x00d4
                com.google.gson.Gson r0 = r10.f26268d
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r10.f26265a = r0
            L_0x00d4:
                java.lang.Object r0 = r0.read(r11)
                r5 = r0
                java.lang.String r5 = (java.lang.String) r5
                goto L_0x0015
            L_0x00dd:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r10.f26265a
                if (r0 != 0) goto L_0x00eb
                com.google.gson.Gson r0 = r10.f26268d
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r10.f26265a = r0
            L_0x00eb:
                java.lang.Object r0 = r0.read(r11)
                r4 = r0
                java.lang.String r4 = (java.lang.String) r4
                goto L_0x0015
            L_0x00f4:
                r11.endObject()
                com.mapbox.api.directions.v5.a.u r11 = new com.mapbox.api.directions.v5.a.u
                r3 = r11
                r3.<init>(r4, r5, r6, r7, r8)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.api.directions.v5.a.u.a.read(com.google.gson.stream.JsonReader):java.lang.Object");
        }

        public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
            al alVar = (al) obj;
            if (alVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("code");
            if (alVar.code() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.f26265a;
                if (typeAdapter == null) {
                    typeAdapter = this.f26268d.getAdapter(String.class);
                    this.f26265a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, alVar.code());
            }
            jsonWriter.name("message");
            if (alVar.message() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.f26265a;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f26268d.getAdapter(String.class);
                    this.f26265a = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, alVar.message());
            }
            jsonWriter.name("waypoints");
            if (alVar.waypoints() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<an>> typeAdapter3 = this.f26266b;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f26268d.getAdapter(TypeToken.getParameterized(List.class, an.class));
                    this.f26266b = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, alVar.waypoints());
            }
            jsonWriter.name("routes");
            if (alVar.routes() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<am>> typeAdapter4 = this.f26267c;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.f26268d.getAdapter(TypeToken.getParameterized(List.class, am.class));
                    this.f26267c = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, alVar.routes());
            }
            jsonWriter.name("uuid");
            if (alVar.uuid() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter5 = this.f26265a;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.f26268d.getAdapter(String.class);
                    this.f26265a = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, alVar.uuid());
            }
            jsonWriter.endObject();
        }
    }

    u(String str, @Nullable String str2, @Nullable List<an> list, List<am> list2, @Nullable String str3) {
        super(str, str2, list, list2, str3);
    }
}
