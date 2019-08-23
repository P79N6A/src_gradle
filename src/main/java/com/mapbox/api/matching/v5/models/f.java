package com.mapbox.api.matching.v5.models;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.a.as;
import com.mapbox.api.directions.v5.a.at;
import java.io.IOException;
import java.util.List;

public final class f extends b {

    public static final class a extends TypeAdapter<j> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<Double> f26343a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<String> f26344b;

        /* renamed from: c  reason: collision with root package name */
        private volatile TypeAdapter<List<as>> f26345c;

        /* renamed from: d  reason: collision with root package name */
        private volatile TypeAdapter<at> f26346d;

        /* renamed from: e  reason: collision with root package name */
        private final Gson f26347e;

        public a(Gson gson) {
            this.f26347e = gson;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v46, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: com.mapbox.api.directions.v5.a.at} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v51, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: java.lang.String} */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object read(com.google.gson.stream.JsonReader r20) throws java.io.IOException {
            /*
                r19 = this;
                r0 = r19
                r1 = r20
                com.google.gson.stream.JsonToken r2 = r20.peek()
                com.google.gson.stream.JsonToken r3 = com.google.gson.stream.JsonToken.NULL
                r4 = 0
                if (r2 != r3) goto L_0x0011
                r20.nextNull()
                return r4
            L_0x0011:
                r20.beginObject()
                r2 = 0
                r6 = r2
                r8 = r6
                r11 = r8
                r15 = r11
                r10 = r4
                r13 = r10
                r14 = r13
                r17 = r14
                r18 = r17
            L_0x0021:
                boolean r2 = r20.hasNext()
                if (r2 == 0) goto L_0x018c
                java.lang.String r2 = r20.nextName()
                com.google.gson.stream.JsonToken r3 = r20.peek()
                com.google.gson.stream.JsonToken r4 = com.google.gson.stream.JsonToken.NULL
                if (r3 != r4) goto L_0x0037
                r20.nextNull()
                goto L_0x0021
            L_0x0037:
                int r4 = r2.hashCode()
                r5 = 0
                r3 = 1
                switch(r4) {
                    case -1992012396: goto L_0x0092;
                    case -791592328: goto L_0x0088;
                    case -445777899: goto L_0x007e;
                    case -264720852: goto L_0x0073;
                    case 3317797: goto L_0x0069;
                    case 288459765: goto L_0x005f;
                    case 829251210: goto L_0x0055;
                    case 1846020210: goto L_0x004b;
                    case 2077998066: goto L_0x0041;
                    default: goto L_0x0040;
                }
            L_0x0040:
                goto L_0x009c
            L_0x0041:
                java.lang.String r4 = "weight_name"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x009c
                r2 = 4
                goto L_0x009d
            L_0x004b:
                java.lang.String r4 = "geometry"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x009c
                r2 = 2
                goto L_0x009d
            L_0x0055:
                java.lang.String r4 = "confidence"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x009c
                r2 = 6
                goto L_0x009d
            L_0x005f:
                java.lang.String r4 = "distance"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x009c
                r2 = 0
                goto L_0x009d
            L_0x0069:
                java.lang.String r4 = "legs"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x009c
                r2 = 5
                goto L_0x009d
            L_0x0073:
                java.lang.String r4 = "voiceLocale"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x009c
                r2 = 8
                goto L_0x009d
            L_0x007e:
                java.lang.String r4 = "routeOptions"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x009c
                r2 = 7
                goto L_0x009d
            L_0x0088:
                java.lang.String r4 = "weight"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x009c
                r2 = 3
                goto L_0x009d
            L_0x0092:
                java.lang.String r4 = "duration"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x009c
                r2 = 1
                goto L_0x009d
            L_0x009c:
                r2 = -1
            L_0x009d:
                switch(r2) {
                    case 0: goto L_0x0172;
                    case 1: goto L_0x0158;
                    case 2: goto L_0x0141;
                    case 3: goto L_0x0127;
                    case 4: goto L_0x0110;
                    case 5: goto L_0x00ef;
                    case 6: goto L_0x00d5;
                    case 7: goto L_0x00bd;
                    case 8: goto L_0x00a5;
                    default: goto L_0x00a0;
                }
            L_0x00a0:
                r20.skipValue()
                goto L_0x0021
            L_0x00a5:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26344b
                if (r2 != 0) goto L_0x00b3
                com.google.gson.Gson r2 = r0.f26347e
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26344b = r2
            L_0x00b3:
                java.lang.Object r2 = r2.read(r1)
                r18 = r2
                java.lang.String r18 = (java.lang.String) r18
                goto L_0x0021
            L_0x00bd:
                com.google.gson.TypeAdapter<com.mapbox.api.directions.v5.a.at> r2 = r0.f26346d
                if (r2 != 0) goto L_0x00cb
                com.google.gson.Gson r2 = r0.f26347e
                java.lang.Class<com.mapbox.api.directions.v5.a.at> r3 = com.mapbox.api.directions.v5.a.at.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26346d = r2
            L_0x00cb:
                java.lang.Object r2 = r2.read(r1)
                r17 = r2
                com.mapbox.api.directions.v5.a.at r17 = (com.mapbox.api.directions.v5.a.at) r17
                goto L_0x0021
            L_0x00d5:
                com.google.gson.TypeAdapter<java.lang.Double> r2 = r0.f26343a
                if (r2 != 0) goto L_0x00e3
                com.google.gson.Gson r2 = r0.f26347e
                java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26343a = r2
            L_0x00e3:
                java.lang.Object r2 = r2.read(r1)
                java.lang.Double r2 = (java.lang.Double) r2
                double r15 = r2.doubleValue()
                goto L_0x0021
            L_0x00ef:
                com.google.gson.TypeAdapter<java.util.List<com.mapbox.api.directions.v5.a.as>> r2 = r0.f26345c
                if (r2 != 0) goto L_0x0107
                com.google.gson.Gson r2 = r0.f26347e
                java.lang.Class<java.util.List> r4 = java.util.List.class
                java.lang.reflect.Type[] r3 = new java.lang.reflect.Type[r3]
                java.lang.Class<com.mapbox.api.directions.v5.a.as> r14 = com.mapbox.api.directions.v5.a.as.class
                r3[r5] = r14
                com.google.gson.reflect.TypeToken r3 = com.google.gson.reflect.TypeToken.getParameterized(r4, r3)
                com.google.gson.TypeAdapter r2 = r2.getAdapter((com.google.gson.reflect.TypeToken<T>) r3)
                r0.f26345c = r2
            L_0x0107:
                java.lang.Object r2 = r2.read(r1)
                r14 = r2
                java.util.List r14 = (java.util.List) r14
                goto L_0x0021
            L_0x0110:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26344b
                if (r2 != 0) goto L_0x011e
                com.google.gson.Gson r2 = r0.f26347e
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26344b = r2
            L_0x011e:
                java.lang.Object r2 = r2.read(r1)
                r13 = r2
                java.lang.String r13 = (java.lang.String) r13
                goto L_0x0021
            L_0x0127:
                com.google.gson.TypeAdapter<java.lang.Double> r2 = r0.f26343a
                if (r2 != 0) goto L_0x0135
                com.google.gson.Gson r2 = r0.f26347e
                java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26343a = r2
            L_0x0135:
                java.lang.Object r2 = r2.read(r1)
                java.lang.Double r2 = (java.lang.Double) r2
                double r11 = r2.doubleValue()
                goto L_0x0021
            L_0x0141:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26344b
                if (r2 != 0) goto L_0x014f
                com.google.gson.Gson r2 = r0.f26347e
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26344b = r2
            L_0x014f:
                java.lang.Object r2 = r2.read(r1)
                r10 = r2
                java.lang.String r10 = (java.lang.String) r10
                goto L_0x0021
            L_0x0158:
                com.google.gson.TypeAdapter<java.lang.Double> r2 = r0.f26343a
                if (r2 != 0) goto L_0x0166
                com.google.gson.Gson r2 = r0.f26347e
                java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26343a = r2
            L_0x0166:
                java.lang.Object r2 = r2.read(r1)
                java.lang.Double r2 = (java.lang.Double) r2
                double r8 = r2.doubleValue()
                goto L_0x0021
            L_0x0172:
                com.google.gson.TypeAdapter<java.lang.Double> r2 = r0.f26343a
                if (r2 != 0) goto L_0x0180
                com.google.gson.Gson r2 = r0.f26347e
                java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26343a = r2
            L_0x0180:
                java.lang.Object r2 = r2.read(r1)
                java.lang.Double r2 = (java.lang.Double) r2
                double r6 = r2.doubleValue()
                goto L_0x0021
            L_0x018c:
                r20.endObject()
                com.mapbox.api.matching.v5.models.f r1 = new com.mapbox.api.matching.v5.models.f
                r5 = r1
                r5.<init>(r6, r8, r10, r11, r13, r14, r15, r17, r18)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.api.matching.v5.models.f.a.read(com.google.gson.stream.JsonReader):java.lang.Object");
        }

        public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
            j jVar = (j) obj;
            if (jVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("distance");
            TypeAdapter<Double> typeAdapter = this.f26343a;
            if (typeAdapter == null) {
                typeAdapter = this.f26347e.getAdapter(Double.class);
                this.f26343a = typeAdapter;
            }
            typeAdapter.write(jsonWriter, Double.valueOf(jVar.distance()));
            jsonWriter.name("duration");
            TypeAdapter<Double> typeAdapter2 = this.f26343a;
            if (typeAdapter2 == null) {
                typeAdapter2 = this.f26347e.getAdapter(Double.class);
                this.f26343a = typeAdapter2;
            }
            typeAdapter2.write(jsonWriter, Double.valueOf(jVar.duration()));
            jsonWriter.name("geometry");
            if (jVar.geometry() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.f26344b;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f26347e.getAdapter(String.class);
                    this.f26344b = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, jVar.geometry());
            }
            jsonWriter.name("weight");
            TypeAdapter<Double> typeAdapter4 = this.f26343a;
            if (typeAdapter4 == null) {
                typeAdapter4 = this.f26347e.getAdapter(Double.class);
                this.f26343a = typeAdapter4;
            }
            typeAdapter4.write(jsonWriter, Double.valueOf(jVar.weight()));
            jsonWriter.name("weight_name");
            if (jVar.weightName() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter5 = this.f26344b;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.f26347e.getAdapter(String.class);
                    this.f26344b = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, jVar.weightName());
            }
            jsonWriter.name("legs");
            if (jVar.legs() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<as>> typeAdapter6 = this.f26345c;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.f26347e.getAdapter(TypeToken.getParameterized(List.class, as.class));
                    this.f26345c = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, jVar.legs());
            }
            jsonWriter.name("confidence");
            TypeAdapter<Double> typeAdapter7 = this.f26343a;
            if (typeAdapter7 == null) {
                typeAdapter7 = this.f26347e.getAdapter(Double.class);
                this.f26343a = typeAdapter7;
            }
            typeAdapter7.write(jsonWriter, Double.valueOf(jVar.confidence()));
            jsonWriter.name("routeOptions");
            if (jVar.routeOptions() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<at> typeAdapter8 = this.f26346d;
                if (typeAdapter8 == null) {
                    typeAdapter8 = this.f26347e.getAdapter(at.class);
                    this.f26346d = typeAdapter8;
                }
                typeAdapter8.write(jsonWriter, jVar.routeOptions());
            }
            jsonWriter.name("voiceLocale");
            if (jVar.voiceLanguage() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter9 = this.f26344b;
                if (typeAdapter9 == null) {
                    typeAdapter9 = this.f26347e.getAdapter(String.class);
                    this.f26344b = typeAdapter9;
                }
                typeAdapter9.write(jsonWriter, jVar.voiceLanguage());
            }
            jsonWriter.endObject();
        }
    }

    f(double d2, double d3, @Nullable String str, double d4, String str2, List<as> list, double d5, @Nullable at atVar, @Nullable String str3) {
        super(d2, d3, str, d4, str2, list, d5, atVar, str3);
    }
}
