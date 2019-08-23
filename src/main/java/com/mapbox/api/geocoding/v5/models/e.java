package com.mapbox.api.geocoding.v5.models;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.BoundingBox;
import com.mapbox.geojson.Geometry;
import java.io.IOException;
import java.util.List;

public final class e extends b {

    public static final class a extends TypeAdapter<h> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<String> f26316a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<BoundingBox> f26317b;

        /* renamed from: c  reason: collision with root package name */
        private volatile TypeAdapter<Geometry> f26318c;

        /* renamed from: d  reason: collision with root package name */
        private volatile TypeAdapter<JsonObject> f26319d;

        /* renamed from: e  reason: collision with root package name */
        private volatile TypeAdapter<List<String>> f26320e;

        /* renamed from: f  reason: collision with root package name */
        private volatile TypeAdapter<double[]> f26321f;
        private volatile TypeAdapter<List<g>> g;
        private volatile TypeAdapter<Double> h;
        private final Gson i;

        public a(Gson gson) {
            this.i = gson;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: com.mapbox.geojson.BoundingBox} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: com.mapbox.geojson.Geometry} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: com.google.gson.JsonObject} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v41, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v46, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v51, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: double[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v56, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v61, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: java.lang.Double} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v66, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v71, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v76, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: java.lang.String} */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object read(com.google.gson.stream.JsonReader r22) throws java.io.IOException {
            /*
                r21 = this;
                r0 = r21
                r1 = r22
                com.google.gson.stream.JsonToken r2 = r22.peek()
                com.google.gson.stream.JsonToken r3 = com.google.gson.stream.JsonToken.NULL
                r4 = 0
                if (r2 != r3) goto L_0x0011
                r22.nextNull()
                return r4
            L_0x0011:
                r22.beginObject()
                r6 = r4
                r7 = r6
                r8 = r7
                r9 = r8
                r10 = r9
                r11 = r10
                r12 = r11
                r13 = r12
                r14 = r13
                r15 = r14
                r16 = r15
                r17 = r16
                r18 = r17
                r19 = r18
                r20 = r19
            L_0x0028:
                boolean r2 = r22.hasNext()
                if (r2 == 0) goto L_0x0266
                java.lang.String r2 = r22.nextName()
                com.google.gson.stream.JsonToken r3 = r22.peek()
                com.google.gson.stream.JsonToken r4 = com.google.gson.stream.JsonToken.NULL
                if (r3 != r4) goto L_0x003e
                r22.nextNull()
                goto L_0x0028
            L_0x003e:
                int r4 = r2.hashCode()
                r5 = 0
                r3 = 1
                switch(r4) {
                    case -1613589672: goto L_0x00e0;
                    case -1364013995: goto L_0x00d5;
                    case -1351923665: goto L_0x00ca;
                    case -1147692044: goto L_0x00bf;
                    case -1072291771: goto L_0x00b4;
                    case -926053069: goto L_0x00aa;
                    case -266148157: goto L_0x00a0;
                    case -265946254: goto L_0x0096;
                    case 3355: goto L_0x008c;
                    case 3017257: goto L_0x0082;
                    case 3556653: goto L_0x0077;
                    case 3575610: goto L_0x006c;
                    case 108474201: goto L_0x0060;
                    case 951530927: goto L_0x0054;
                    case 1846020210: goto L_0x0049;
                    default: goto L_0x0047;
                }
            L_0x0047:
                goto L_0x00eb
            L_0x0049:
                java.lang.String r4 = "geometry"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x00eb
                r2 = 3
                goto L_0x00ec
            L_0x0054:
                java.lang.String r4 = "context"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x00eb
                r2 = 10
                goto L_0x00ec
            L_0x0060:
                java.lang.String r4 = "relevance"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x00eb
                r2 = 11
                goto L_0x00ec
            L_0x006c:
                java.lang.String r4 = "type"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x00eb
                r2 = 0
                goto L_0x00ec
            L_0x0077:
                java.lang.String r4 = "text"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x00eb
                r2 = 5
                goto L_0x00ec
            L_0x0082:
                java.lang.String r4 = "bbox"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x00eb
                r2 = 1
                goto L_0x00ec
            L_0x008c:
                java.lang.String r4 = "id"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x00eb
                r2 = 2
                goto L_0x00ec
            L_0x0096:
                java.lang.String r4 = "place_type"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x00eb
                r2 = 7
                goto L_0x00ec
            L_0x00a0:
                java.lang.String r4 = "place_name"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x00eb
                r2 = 6
                goto L_0x00ec
            L_0x00aa:
                java.lang.String r4 = "properties"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x00eb
                r2 = 4
                goto L_0x00ec
            L_0x00b4:
                java.lang.String r4 = "matching_place_name"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x00eb
                r2 = 13
                goto L_0x00ec
            L_0x00bf:
                java.lang.String r4 = "address"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x00eb
                r2 = 8
                goto L_0x00ec
            L_0x00ca:
                java.lang.String r4 = "matching_text"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x00eb
                r2 = 12
                goto L_0x00ec
            L_0x00d5:
                java.lang.String r4 = "center"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x00eb
                r2 = 9
                goto L_0x00ec
            L_0x00e0:
                java.lang.String r4 = "language"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x00eb
                r2 = 14
                goto L_0x00ec
            L_0x00eb:
                r2 = -1
            L_0x00ec:
                switch(r2) {
                    case 0: goto L_0x024f;
                    case 1: goto L_0x0238;
                    case 2: goto L_0x0221;
                    case 3: goto L_0x020a;
                    case 4: goto L_0x01f3;
                    case 5: goto L_0x01dc;
                    case 6: goto L_0x01c5;
                    case 7: goto L_0x01a4;
                    case 8: goto L_0x018d;
                    case 9: goto L_0x0176;
                    case 10: goto L_0x0154;
                    case 11: goto L_0x013c;
                    case 12: goto L_0x0124;
                    case 13: goto L_0x010c;
                    case 14: goto L_0x00f4;
                    default: goto L_0x00ef;
                }
            L_0x00ef:
                r22.skipValue()
                goto L_0x0028
            L_0x00f4:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26316a
                if (r2 != 0) goto L_0x0102
                com.google.gson.Gson r2 = r0.i
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26316a = r2
            L_0x0102:
                java.lang.Object r2 = r2.read(r1)
                r20 = r2
                java.lang.String r20 = (java.lang.String) r20
                goto L_0x0028
            L_0x010c:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26316a
                if (r2 != 0) goto L_0x011a
                com.google.gson.Gson r2 = r0.i
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26316a = r2
            L_0x011a:
                java.lang.Object r2 = r2.read(r1)
                r19 = r2
                java.lang.String r19 = (java.lang.String) r19
                goto L_0x0028
            L_0x0124:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26316a
                if (r2 != 0) goto L_0x0132
                com.google.gson.Gson r2 = r0.i
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26316a = r2
            L_0x0132:
                java.lang.Object r2 = r2.read(r1)
                r18 = r2
                java.lang.String r18 = (java.lang.String) r18
                goto L_0x0028
            L_0x013c:
                com.google.gson.TypeAdapter<java.lang.Double> r2 = r0.h
                if (r2 != 0) goto L_0x014a
                com.google.gson.Gson r2 = r0.i
                java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.h = r2
            L_0x014a:
                java.lang.Object r2 = r2.read(r1)
                r17 = r2
                java.lang.Double r17 = (java.lang.Double) r17
                goto L_0x0028
            L_0x0154:
                com.google.gson.TypeAdapter<java.util.List<com.mapbox.api.geocoding.v5.models.g>> r2 = r0.g
                if (r2 != 0) goto L_0x016c
                com.google.gson.Gson r2 = r0.i
                java.lang.Class<java.util.List> r4 = java.util.List.class
                java.lang.reflect.Type[] r3 = new java.lang.reflect.Type[r3]
                java.lang.Class<com.mapbox.api.geocoding.v5.models.g> r16 = com.mapbox.api.geocoding.v5.models.g.class
                r3[r5] = r16
                com.google.gson.reflect.TypeToken r3 = com.google.gson.reflect.TypeToken.getParameterized(r4, r3)
                com.google.gson.TypeAdapter r2 = r2.getAdapter((com.google.gson.reflect.TypeToken<T>) r3)
                r0.g = r2
            L_0x016c:
                java.lang.Object r2 = r2.read(r1)
                r16 = r2
                java.util.List r16 = (java.util.List) r16
                goto L_0x0028
            L_0x0176:
                com.google.gson.TypeAdapter<double[]> r2 = r0.f26321f
                if (r2 != 0) goto L_0x0184
                com.google.gson.Gson r2 = r0.i
                java.lang.Class<double[]> r3 = double[].class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26321f = r2
            L_0x0184:
                java.lang.Object r2 = r2.read(r1)
                r15 = r2
                double[] r15 = (double[]) r15
                goto L_0x0028
            L_0x018d:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26316a
                if (r2 != 0) goto L_0x019b
                com.google.gson.Gson r2 = r0.i
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26316a = r2
            L_0x019b:
                java.lang.Object r2 = r2.read(r1)
                r14 = r2
                java.lang.String r14 = (java.lang.String) r14
                goto L_0x0028
            L_0x01a4:
                com.google.gson.TypeAdapter<java.util.List<java.lang.String>> r2 = r0.f26320e
                if (r2 != 0) goto L_0x01bc
                com.google.gson.Gson r2 = r0.i
                java.lang.Class<java.util.List> r4 = java.util.List.class
                java.lang.reflect.Type[] r3 = new java.lang.reflect.Type[r3]
                java.lang.Class<java.lang.String> r13 = java.lang.String.class
                r3[r5] = r13
                com.google.gson.reflect.TypeToken r3 = com.google.gson.reflect.TypeToken.getParameterized(r4, r3)
                com.google.gson.TypeAdapter r2 = r2.getAdapter((com.google.gson.reflect.TypeToken<T>) r3)
                r0.f26320e = r2
            L_0x01bc:
                java.lang.Object r2 = r2.read(r1)
                r13 = r2
                java.util.List r13 = (java.util.List) r13
                goto L_0x0028
            L_0x01c5:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26316a
                if (r2 != 0) goto L_0x01d3
                com.google.gson.Gson r2 = r0.i
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26316a = r2
            L_0x01d3:
                java.lang.Object r2 = r2.read(r1)
                r12 = r2
                java.lang.String r12 = (java.lang.String) r12
                goto L_0x0028
            L_0x01dc:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26316a
                if (r2 != 0) goto L_0x01ea
                com.google.gson.Gson r2 = r0.i
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26316a = r2
            L_0x01ea:
                java.lang.Object r2 = r2.read(r1)
                r11 = r2
                java.lang.String r11 = (java.lang.String) r11
                goto L_0x0028
            L_0x01f3:
                com.google.gson.TypeAdapter<com.google.gson.JsonObject> r2 = r0.f26319d
                if (r2 != 0) goto L_0x0201
                com.google.gson.Gson r2 = r0.i
                java.lang.Class<com.google.gson.JsonObject> r3 = com.google.gson.JsonObject.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26319d = r2
            L_0x0201:
                java.lang.Object r2 = r2.read(r1)
                r10 = r2
                com.google.gson.JsonObject r10 = (com.google.gson.JsonObject) r10
                goto L_0x0028
            L_0x020a:
                com.google.gson.TypeAdapter<com.mapbox.geojson.Geometry> r2 = r0.f26318c
                if (r2 != 0) goto L_0x0218
                com.google.gson.Gson r2 = r0.i
                java.lang.Class<com.mapbox.geojson.Geometry> r3 = com.mapbox.geojson.Geometry.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26318c = r2
            L_0x0218:
                java.lang.Object r2 = r2.read(r1)
                r9 = r2
                com.mapbox.geojson.Geometry r9 = (com.mapbox.geojson.Geometry) r9
                goto L_0x0028
            L_0x0221:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26316a
                if (r2 != 0) goto L_0x022f
                com.google.gson.Gson r2 = r0.i
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26316a = r2
            L_0x022f:
                java.lang.Object r2 = r2.read(r1)
                r8 = r2
                java.lang.String r8 = (java.lang.String) r8
                goto L_0x0028
            L_0x0238:
                com.google.gson.TypeAdapter<com.mapbox.geojson.BoundingBox> r2 = r0.f26317b
                if (r2 != 0) goto L_0x0246
                com.google.gson.Gson r2 = r0.i
                java.lang.Class<com.mapbox.geojson.BoundingBox> r3 = com.mapbox.geojson.BoundingBox.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26317b = r2
            L_0x0246:
                java.lang.Object r2 = r2.read(r1)
                r7 = r2
                com.mapbox.geojson.BoundingBox r7 = (com.mapbox.geojson.BoundingBox) r7
                goto L_0x0028
            L_0x024f:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26316a
                if (r2 != 0) goto L_0x025d
                com.google.gson.Gson r2 = r0.i
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26316a = r2
            L_0x025d:
                java.lang.Object r2 = r2.read(r1)
                r6 = r2
                java.lang.String r6 = (java.lang.String) r6
                goto L_0x0028
            L_0x0266:
                r22.endObject()
                com.mapbox.api.geocoding.v5.models.e r1 = new com.mapbox.api.geocoding.v5.models.e
                r5 = r1
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.api.geocoding.v5.models.e.a.read(com.google.gson.stream.JsonReader):java.lang.Object");
        }

        public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
            h hVar = (h) obj;
            if (hVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("type");
            if (hVar.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.f26316a;
                if (typeAdapter == null) {
                    typeAdapter = this.i.getAdapter(String.class);
                    this.f26316a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, hVar.type());
            }
            jsonWriter.name("bbox");
            if (hVar.bbox() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<BoundingBox> typeAdapter2 = this.f26317b;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.i.getAdapter(BoundingBox.class);
                    this.f26317b = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, hVar.bbox());
            }
            jsonWriter.name("id");
            if (hVar.id() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.f26316a;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.i.getAdapter(String.class);
                    this.f26316a = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, hVar.id());
            }
            jsonWriter.name("geometry");
            if (hVar.geometry() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Geometry> typeAdapter4 = this.f26318c;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.i.getAdapter(Geometry.class);
                    this.f26318c = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, hVar.geometry());
            }
            jsonWriter.name("properties");
            if (hVar.properties() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<JsonObject> typeAdapter5 = this.f26319d;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.i.getAdapter(JsonObject.class);
                    this.f26319d = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, hVar.properties());
            }
            jsonWriter.name("text");
            if (hVar.text() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter6 = this.f26316a;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.i.getAdapter(String.class);
                    this.f26316a = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, hVar.text());
            }
            jsonWriter.name("place_name");
            if (hVar.placeName() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter7 = this.f26316a;
                if (typeAdapter7 == null) {
                    typeAdapter7 = this.i.getAdapter(String.class);
                    this.f26316a = typeAdapter7;
                }
                typeAdapter7.write(jsonWriter, hVar.placeName());
            }
            jsonWriter.name("place_type");
            if (hVar.placeType() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<String>> typeAdapter8 = this.f26320e;
                if (typeAdapter8 == null) {
                    typeAdapter8 = this.i.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.f26320e = typeAdapter8;
                }
                typeAdapter8.write(jsonWriter, hVar.placeType());
            }
            jsonWriter.name("address");
            if (hVar.address() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter9 = this.f26316a;
                if (typeAdapter9 == null) {
                    typeAdapter9 = this.i.getAdapter(String.class);
                    this.f26316a = typeAdapter9;
                }
                typeAdapter9.write(jsonWriter, hVar.address());
            }
            jsonWriter.name("center");
            if (hVar.a() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<double[]> typeAdapter10 = this.f26321f;
                if (typeAdapter10 == null) {
                    typeAdapter10 = this.i.getAdapter(double[].class);
                    this.f26321f = typeAdapter10;
                }
                typeAdapter10.write(jsonWriter, hVar.a());
            }
            jsonWriter.name("context");
            if (hVar.context() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<g>> typeAdapter11 = this.g;
                if (typeAdapter11 == null) {
                    typeAdapter11 = this.i.getAdapter(TypeToken.getParameterized(List.class, g.class));
                    this.g = typeAdapter11;
                }
                typeAdapter11.write(jsonWriter, hVar.context());
            }
            jsonWriter.name("relevance");
            if (hVar.relevance() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter12 = this.h;
                if (typeAdapter12 == null) {
                    typeAdapter12 = this.i.getAdapter(Double.class);
                    this.h = typeAdapter12;
                }
                typeAdapter12.write(jsonWriter, hVar.relevance());
            }
            jsonWriter.name("matching_text");
            if (hVar.matchingText() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter13 = this.f26316a;
                if (typeAdapter13 == null) {
                    typeAdapter13 = this.i.getAdapter(String.class);
                    this.f26316a = typeAdapter13;
                }
                typeAdapter13.write(jsonWriter, hVar.matchingText());
            }
            jsonWriter.name("matching_place_name");
            if (hVar.matchingPlaceName() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter14 = this.f26316a;
                if (typeAdapter14 == null) {
                    typeAdapter14 = this.i.getAdapter(String.class);
                    this.f26316a = typeAdapter14;
                }
                typeAdapter14.write(jsonWriter, hVar.matchingPlaceName());
            }
            jsonWriter.name("language");
            if (hVar.language() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter15 = this.f26316a;
                if (typeAdapter15 == null) {
                    typeAdapter15 = this.i.getAdapter(String.class);
                    this.f26316a = typeAdapter15;
                }
                typeAdapter15.write(jsonWriter, hVar.language());
            }
            jsonWriter.endObject();
        }
    }

    e(String str, @Nullable BoundingBox boundingBox, @Nullable String str2, @Nullable Geometry geometry, @Nullable JsonObject jsonObject, @Nullable String str3, @Nullable String str4, @Nullable List<String> list, @Nullable String str5, @Nullable double[] dArr, @Nullable List<g> list2, @Nullable Double d2, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        super(str, boundingBox, str2, geometry, jsonObject, str3, str4, list, str5, dArr, list2, d2, str6, str7, str8);
    }
}
