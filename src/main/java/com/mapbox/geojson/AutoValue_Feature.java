package com.mapbox.geojson;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public final class AutoValue_Feature extends C$AutoValue_Feature {

    public static final class GsonTypeAdapter extends TypeAdapter<Feature> {
        private volatile TypeAdapter<BoundingBox> boundingBox_adapter;
        private volatile TypeAdapter<Geometry> geometry_adapter;
        private final Gson gson;
        private volatile TypeAdapter<JsonObject> jsonObject_adapter;
        private volatile TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson2) {
            this.gson = gson2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.mapbox.geojson.BoundingBox} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: com.mapbox.geojson.Geometry} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: com.google.gson.JsonObject} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.mapbox.geojson.Feature read(com.google.gson.stream.JsonReader r10) throws java.io.IOException {
            /*
                r9 = this;
                com.google.gson.stream.JsonToken r0 = r10.peek()
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                r2 = 0
                if (r0 != r1) goto L_0x000d
                r10.nextNull()
                return r2
            L_0x000d:
                r10.beginObject()
                r4 = r2
                r5 = r4
                r6 = r5
                r7 = r6
                r8 = r7
            L_0x0015:
                boolean r0 = r10.hasNext()
                if (r0 == 0) goto L_0x00f4
                java.lang.String r0 = r10.nextName()
                com.google.gson.stream.JsonToken r1 = r10.peek()
                com.google.gson.stream.JsonToken r2 = com.google.gson.stream.JsonToken.NULL
                if (r1 != r2) goto L_0x002b
                r10.nextNull()
                goto L_0x0015
            L_0x002b:
                r1 = -1
                int r2 = r0.hashCode()
                r3 = -926053069(0xffffffffc8cd8d33, float:-420969.6)
                if (r2 == r3) goto L_0x0071
                r3 = 3355(0xd1b, float:4.701E-42)
                if (r2 == r3) goto L_0x0067
                r3 = 3017257(0x2e0a29, float:4.228078E-39)
                if (r2 == r3) goto L_0x005d
                r3 = 3575610(0x368f3a, float:5.010497E-39)
                if (r2 == r3) goto L_0x0053
                r3 = 1846020210(0x6e080872, float:1.0525043E28)
                if (r2 == r3) goto L_0x0049
                goto L_0x007a
            L_0x0049:
                java.lang.String r2 = "geometry"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x007a
                r1 = 3
                goto L_0x007a
            L_0x0053:
                java.lang.String r2 = "type"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x007a
                r1 = 0
                goto L_0x007a
            L_0x005d:
                java.lang.String r2 = "bbox"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x007a
                r1 = 1
                goto L_0x007a
            L_0x0067:
                java.lang.String r2 = "id"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x007a
                r1 = 2
                goto L_0x007a
            L_0x0071:
                java.lang.String r2 = "properties"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x007a
                r1 = 4
            L_0x007a:
                switch(r1) {
                    case 0: goto L_0x00dd;
                    case 1: goto L_0x00c6;
                    case 2: goto L_0x00af;
                    case 3: goto L_0x0098;
                    case 4: goto L_0x0081;
                    default: goto L_0x007d;
                }
            L_0x007d:
                r10.skipValue()
                goto L_0x0015
            L_0x0081:
                com.google.gson.TypeAdapter<com.google.gson.JsonObject> r0 = r9.jsonObject_adapter
                if (r0 != 0) goto L_0x008f
                com.google.gson.Gson r0 = r9.gson
                java.lang.Class<com.google.gson.JsonObject> r1 = com.google.gson.JsonObject.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r9.jsonObject_adapter = r0
            L_0x008f:
                java.lang.Object r0 = r0.read(r10)
                r8 = r0
                com.google.gson.JsonObject r8 = (com.google.gson.JsonObject) r8
                goto L_0x0015
            L_0x0098:
                com.google.gson.TypeAdapter<com.mapbox.geojson.Geometry> r0 = r9.geometry_adapter
                if (r0 != 0) goto L_0x00a6
                com.google.gson.Gson r0 = r9.gson
                java.lang.Class<com.mapbox.geojson.Geometry> r1 = com.mapbox.geojson.Geometry.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r9.geometry_adapter = r0
            L_0x00a6:
                java.lang.Object r0 = r0.read(r10)
                r7 = r0
                com.mapbox.geojson.Geometry r7 = (com.mapbox.geojson.Geometry) r7
                goto L_0x0015
            L_0x00af:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r9.string_adapter
                if (r0 != 0) goto L_0x00bd
                com.google.gson.Gson r0 = r9.gson
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r9.string_adapter = r0
            L_0x00bd:
                java.lang.Object r0 = r0.read(r10)
                r6 = r0
                java.lang.String r6 = (java.lang.String) r6
                goto L_0x0015
            L_0x00c6:
                com.google.gson.TypeAdapter<com.mapbox.geojson.BoundingBox> r0 = r9.boundingBox_adapter
                if (r0 != 0) goto L_0x00d4
                com.google.gson.Gson r0 = r9.gson
                java.lang.Class<com.mapbox.geojson.BoundingBox> r1 = com.mapbox.geojson.BoundingBox.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r9.boundingBox_adapter = r0
            L_0x00d4:
                java.lang.Object r0 = r0.read(r10)
                r5 = r0
                com.mapbox.geojson.BoundingBox r5 = (com.mapbox.geojson.BoundingBox) r5
                goto L_0x0015
            L_0x00dd:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r9.string_adapter
                if (r0 != 0) goto L_0x00eb
                com.google.gson.Gson r0 = r9.gson
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r9.string_adapter = r0
            L_0x00eb:
                java.lang.Object r0 = r0.read(r10)
                r4 = r0
                java.lang.String r4 = (java.lang.String) r4
                goto L_0x0015
            L_0x00f4:
                r10.endObject()
                com.mapbox.geojson.AutoValue_Feature r10 = new com.mapbox.geojson.AutoValue_Feature
                r3 = r10
                r3.<init>(r4, r5, r6, r7, r8)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.geojson.AutoValue_Feature.GsonTypeAdapter.read(com.google.gson.stream.JsonReader):com.mapbox.geojson.Feature");
        }

        public final void write(JsonWriter jsonWriter, Feature feature) throws IOException {
            if (feature == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("type");
            if (feature.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.string_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, feature.type());
            }
            jsonWriter.name("bbox");
            if (feature.bbox() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<BoundingBox> typeAdapter2 = this.boundingBox_adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(BoundingBox.class);
                    this.boundingBox_adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, feature.bbox());
            }
            jsonWriter.name("id");
            if (feature.id() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.string_adapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, feature.id());
            }
            jsonWriter.name("geometry");
            if (feature.geometry() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Geometry> typeAdapter4 = this.geometry_adapter;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.gson.getAdapter(Geometry.class);
                    this.geometry_adapter = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, feature.geometry());
            }
            jsonWriter.name("properties");
            if (feature.properties() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<JsonObject> typeAdapter5 = this.jsonObject_adapter;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.gson.getAdapter(JsonObject.class);
                    this.jsonObject_adapter = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, feature.properties());
            }
            jsonWriter.endObject();
        }
    }

    AutoValue_Feature(String str, @Nullable BoundingBox boundingBox, @Nullable String str2, @Nullable Geometry geometry, @Nullable JsonObject jsonObject) {
        super(str, boundingBox, str2, geometry, jsonObject);
    }
}
