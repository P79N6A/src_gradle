package com.mapbox.geojson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public final class AutoValue_BoundingBox extends C$AutoValue_BoundingBox {

    public static final class GsonTypeAdapter extends TypeAdapter<BoundingBox> {
        private final Gson gson;
        private volatile TypeAdapter<Point> point_adapter;

        public GsonTypeAdapter(Gson gson2) {
            this.gson = gson2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.mapbox.geojson.Point} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.mapbox.geojson.BoundingBox read(com.google.gson.stream.JsonReader r7) throws java.io.IOException {
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
                r5 = -1635992324(0xffffffff9e7cbcfc, float:-1.337985E-20)
                if (r4 == r5) goto L_0x0041
                r5 = 443261570(0x1a6ba282, float:4.8728134E-23)
                if (r4 == r5) goto L_0x0037
                goto L_0x004a
            L_0x0037:
                java.lang.String r4 = "northeast"
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L_0x004a
                r3 = 1
                goto L_0x004a
            L_0x0041:
                java.lang.String r4 = "southwest"
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
                com.google.gson.TypeAdapter<com.mapbox.geojson.Point> r0 = r6.point_adapter
                if (r0 != 0) goto L_0x005f
                com.google.gson.Gson r0 = r6.gson
                java.lang.Class<com.mapbox.geojson.Point> r1 = com.mapbox.geojson.Point.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r6.point_adapter = r0
            L_0x005f:
                java.lang.Object r0 = r0.read(r7)
                com.mapbox.geojson.Point r0 = (com.mapbox.geojson.Point) r0
                goto L_0x0011
            L_0x0066:
                com.google.gson.TypeAdapter<com.mapbox.geojson.Point> r1 = r6.point_adapter
                if (r1 != 0) goto L_0x0074
                com.google.gson.Gson r1 = r6.gson
                java.lang.Class<com.mapbox.geojson.Point> r2 = com.mapbox.geojson.Point.class
                com.google.gson.TypeAdapter r1 = r1.getAdapter((java.lang.Class<T>) r2)
                r6.point_adapter = r1
            L_0x0074:
                java.lang.Object r1 = r1.read(r7)
                r2 = r1
                com.mapbox.geojson.Point r2 = (com.mapbox.geojson.Point) r2
                goto L_0x0011
            L_0x007c:
                r7.endObject()
                com.mapbox.geojson.AutoValue_BoundingBox r7 = new com.mapbox.geojson.AutoValue_BoundingBox
                r7.<init>(r2, r0)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.geojson.AutoValue_BoundingBox.GsonTypeAdapter.read(com.google.gson.stream.JsonReader):com.mapbox.geojson.BoundingBox");
        }

        public final void write(JsonWriter jsonWriter, BoundingBox boundingBox) throws IOException {
            if (boundingBox == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("southwest");
            if (boundingBox.southwest() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Point> typeAdapter = this.point_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(Point.class);
                    this.point_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, boundingBox.southwest());
            }
            jsonWriter.name("northeast");
            if (boundingBox.northeast() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Point> typeAdapter2 = this.point_adapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(Point.class);
                    this.point_adapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, boundingBox.northeast());
            }
            jsonWriter.endObject();
        }
    }

    AutoValue_BoundingBox(Point point, Point point2) {
        super(point, point2);
    }
}
