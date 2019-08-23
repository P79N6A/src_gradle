package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;

public final class v extends f {

    public static final class a extends TypeAdapter<am> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<Double> f26269a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<String> f26270b;

        /* renamed from: c  reason: collision with root package name */
        private volatile TypeAdapter<List<as>> f26271c;

        /* renamed from: d  reason: collision with root package name */
        private volatile TypeAdapter<at> f26272d;

        /* renamed from: e  reason: collision with root package name */
        private final Gson f26273e;

        public a(Gson gson) {
            this.f26273e = gson;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Double} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Double} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Double} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: com.mapbox.api.directions.v5.a.at} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v40, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object read(com.google.gson.stream.JsonReader r14) throws java.io.IOException {
            /*
                r13 = this;
                com.google.gson.stream.JsonToken r0 = r14.peek()
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                r2 = 0
                if (r0 != r1) goto L_0x000d
                r14.nextNull()
                return r2
            L_0x000d:
                r14.beginObject()
                r4 = r2
                r5 = r4
                r6 = r5
                r7 = r6
                r8 = r7
                r9 = r8
                r10 = r9
                r11 = r10
            L_0x0018:
                boolean r0 = r14.hasNext()
                if (r0 == 0) goto L_0x0151
                java.lang.String r0 = r14.nextName()
                com.google.gson.stream.JsonToken r1 = r14.peek()
                com.google.gson.stream.JsonToken r2 = com.google.gson.stream.JsonToken.NULL
                if (r1 != r2) goto L_0x002e
                r14.nextNull()
                goto L_0x0018
            L_0x002e:
                r1 = -1
                int r2 = r0.hashCode()
                r3 = 0
                r12 = 1
                switch(r2) {
                    case -1992012396: goto L_0x007f;
                    case -791592328: goto L_0x0075;
                    case -445777899: goto L_0x006b;
                    case -264720852: goto L_0x0061;
                    case 3317797: goto L_0x0057;
                    case 288459765: goto L_0x004d;
                    case 1846020210: goto L_0x0043;
                    case 2077998066: goto L_0x0039;
                    default: goto L_0x0038;
                }
            L_0x0038:
                goto L_0x0088
            L_0x0039:
                java.lang.String r2 = "weight_name"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0088
                r1 = 4
                goto L_0x0088
            L_0x0043:
                java.lang.String r2 = "geometry"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0088
                r1 = 2
                goto L_0x0088
            L_0x004d:
                java.lang.String r2 = "distance"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0088
                r1 = 0
                goto L_0x0088
            L_0x0057:
                java.lang.String r2 = "legs"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0088
                r1 = 5
                goto L_0x0088
            L_0x0061:
                java.lang.String r2 = "voiceLocale"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0088
                r1 = 7
                goto L_0x0088
            L_0x006b:
                java.lang.String r2 = "routeOptions"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0088
                r1 = 6
                goto L_0x0088
            L_0x0075:
                java.lang.String r2 = "weight"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0088
                r1 = 3
                goto L_0x0088
            L_0x007f:
                java.lang.String r2 = "duration"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0088
                r1 = 1
            L_0x0088:
                switch(r1) {
                    case 0: goto L_0x013a;
                    case 1: goto L_0x0123;
                    case 2: goto L_0x010c;
                    case 3: goto L_0x00f5;
                    case 4: goto L_0x00de;
                    case 5: goto L_0x00bd;
                    case 6: goto L_0x00a6;
                    case 7: goto L_0x008f;
                    default: goto L_0x008b;
                }
            L_0x008b:
                r14.skipValue()
                goto L_0x0018
            L_0x008f:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r13.f26270b
                if (r0 != 0) goto L_0x009d
                com.google.gson.Gson r0 = r13.f26273e
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r13.f26270b = r0
            L_0x009d:
                java.lang.Object r0 = r0.read(r14)
                r11 = r0
                java.lang.String r11 = (java.lang.String) r11
                goto L_0x0018
            L_0x00a6:
                com.google.gson.TypeAdapter<com.mapbox.api.directions.v5.a.at> r0 = r13.f26272d
                if (r0 != 0) goto L_0x00b4
                com.google.gson.Gson r0 = r13.f26273e
                java.lang.Class<com.mapbox.api.directions.v5.a.at> r1 = com.mapbox.api.directions.v5.a.at.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r13.f26272d = r0
            L_0x00b4:
                java.lang.Object r0 = r0.read(r14)
                r10 = r0
                com.mapbox.api.directions.v5.a.at r10 = (com.mapbox.api.directions.v5.a.at) r10
                goto L_0x0018
            L_0x00bd:
                com.google.gson.TypeAdapter<java.util.List<com.mapbox.api.directions.v5.a.as>> r0 = r13.f26271c
                if (r0 != 0) goto L_0x00d5
                com.google.gson.Gson r0 = r13.f26273e
                java.lang.Class<java.util.List> r1 = java.util.List.class
                java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r12]
                java.lang.Class<com.mapbox.api.directions.v5.a.as> r9 = com.mapbox.api.directions.v5.a.as.class
                r2[r3] = r9
                com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.getParameterized(r1, r2)
                com.google.gson.TypeAdapter r0 = r0.getAdapter((com.google.gson.reflect.TypeToken<T>) r1)
                r13.f26271c = r0
            L_0x00d5:
                java.lang.Object r0 = r0.read(r14)
                r9 = r0
                java.util.List r9 = (java.util.List) r9
                goto L_0x0018
            L_0x00de:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r13.f26270b
                if (r0 != 0) goto L_0x00ec
                com.google.gson.Gson r0 = r13.f26273e
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r13.f26270b = r0
            L_0x00ec:
                java.lang.Object r0 = r0.read(r14)
                r8 = r0
                java.lang.String r8 = (java.lang.String) r8
                goto L_0x0018
            L_0x00f5:
                com.google.gson.TypeAdapter<java.lang.Double> r0 = r13.f26269a
                if (r0 != 0) goto L_0x0103
                com.google.gson.Gson r0 = r13.f26273e
                java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r13.f26269a = r0
            L_0x0103:
                java.lang.Object r0 = r0.read(r14)
                r7 = r0
                java.lang.Double r7 = (java.lang.Double) r7
                goto L_0x0018
            L_0x010c:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r13.f26270b
                if (r0 != 0) goto L_0x011a
                com.google.gson.Gson r0 = r13.f26273e
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r13.f26270b = r0
            L_0x011a:
                java.lang.Object r0 = r0.read(r14)
                r6 = r0
                java.lang.String r6 = (java.lang.String) r6
                goto L_0x0018
            L_0x0123:
                com.google.gson.TypeAdapter<java.lang.Double> r0 = r13.f26269a
                if (r0 != 0) goto L_0x0131
                com.google.gson.Gson r0 = r13.f26273e
                java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r13.f26269a = r0
            L_0x0131:
                java.lang.Object r0 = r0.read(r14)
                r5 = r0
                java.lang.Double r5 = (java.lang.Double) r5
                goto L_0x0018
            L_0x013a:
                com.google.gson.TypeAdapter<java.lang.Double> r0 = r13.f26269a
                if (r0 != 0) goto L_0x0148
                com.google.gson.Gson r0 = r13.f26273e
                java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r13.f26269a = r0
            L_0x0148:
                java.lang.Object r0 = r0.read(r14)
                r4 = r0
                java.lang.Double r4 = (java.lang.Double) r4
                goto L_0x0018
            L_0x0151:
                r14.endObject()
                com.mapbox.api.directions.v5.a.v r14 = new com.mapbox.api.directions.v5.a.v
                r3 = r14
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.api.directions.v5.a.v.a.read(com.google.gson.stream.JsonReader):java.lang.Object");
        }

        public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
            am amVar = (am) obj;
            if (amVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("distance");
            if (amVar.distance() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter = this.f26269a;
                if (typeAdapter == null) {
                    typeAdapter = this.f26273e.getAdapter(Double.class);
                    this.f26269a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, amVar.distance());
            }
            jsonWriter.name("duration");
            if (amVar.duration() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter2 = this.f26269a;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f26273e.getAdapter(Double.class);
                    this.f26269a = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, amVar.duration());
            }
            jsonWriter.name("geometry");
            if (amVar.geometry() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.f26270b;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f26273e.getAdapter(String.class);
                    this.f26270b = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, amVar.geometry());
            }
            jsonWriter.name("weight");
            if (amVar.weight() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter4 = this.f26269a;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.f26273e.getAdapter(Double.class);
                    this.f26269a = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, amVar.weight());
            }
            jsonWriter.name("weight_name");
            if (amVar.weightName() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter5 = this.f26270b;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.f26273e.getAdapter(String.class);
                    this.f26270b = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, amVar.weightName());
            }
            jsonWriter.name("legs");
            if (amVar.legs() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<as>> typeAdapter6 = this.f26271c;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.f26273e.getAdapter(TypeToken.getParameterized(List.class, as.class));
                    this.f26271c = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, amVar.legs());
            }
            jsonWriter.name("routeOptions");
            if (amVar.routeOptions() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<at> typeAdapter7 = this.f26272d;
                if (typeAdapter7 == null) {
                    typeAdapter7 = this.f26273e.getAdapter(at.class);
                    this.f26272d = typeAdapter7;
                }
                typeAdapter7.write(jsonWriter, amVar.routeOptions());
            }
            jsonWriter.name("voiceLocale");
            if (amVar.voiceLanguage() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter8 = this.f26270b;
                if (typeAdapter8 == null) {
                    typeAdapter8 = this.f26273e.getAdapter(String.class);
                    this.f26270b = typeAdapter8;
                }
                typeAdapter8.write(jsonWriter, amVar.voiceLanguage());
            }
            jsonWriter.endObject();
        }
    }

    v(@Nullable Double d2, @Nullable Double d3, @Nullable String str, @Nullable Double d4, @Nullable String str2, @Nullable List<as> list, @Nullable at atVar, @Nullable String str3) {
        super(d2, d3, str, d4, str2, list, atVar, str3);
    }
}
