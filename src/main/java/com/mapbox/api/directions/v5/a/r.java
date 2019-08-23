package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public final class r extends b {

    public static final class a extends TypeAdapter<ah> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<Double> f26256a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<ai> f26257b;

        /* renamed from: c  reason: collision with root package name */
        private final Gson f26258c;

        public a(Gson gson) {
            this.f26258c = gson;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.mapbox.api.directions.v5.a.ai} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: com.mapbox.api.directions.v5.a.ai} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: com.mapbox.api.directions.v5.a.ai} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object read(com.google.gson.stream.JsonReader r10) throws java.io.IOException {
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
                r0 = 0
                r4 = r0
                r6 = r2
                r7 = r6
                r8 = r7
            L_0x0016:
                boolean r0 = r10.hasNext()
                if (r0 == 0) goto L_0x00d2
                java.lang.String r0 = r10.nextName()
                com.google.gson.stream.JsonToken r1 = r10.peek()
                com.google.gson.stream.JsonToken r2 = com.google.gson.stream.JsonToken.NULL
                if (r1 != r2) goto L_0x002c
                r10.nextNull()
                goto L_0x0016
            L_0x002c:
                r1 = -1
                int r2 = r0.hashCode()
                r3 = -817598092(0xffffffffcf447174, float:-3.2957696E9)
                if (r2 == r3) goto L_0x0064
                r3 = -314765822(0xffffffffed3d0e02, float:-3.65685E27)
                if (r2 == r3) goto L_0x005a
                r3 = 114240(0x1be40, float:1.60084E-40)
                if (r2 == r3) goto L_0x0050
                r3 = 713287674(0x2a83e7fa, float:2.343124E-13)
                if (r2 == r3) goto L_0x0046
                goto L_0x006d
            L_0x0046:
                java.lang.String r2 = "distanceAlongGeometry"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x006d
                r1 = 0
                goto L_0x006d
            L_0x0050:
                java.lang.String r2 = "sub"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x006d
                r1 = 3
                goto L_0x006d
            L_0x005a:
                java.lang.String r2 = "primary"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x006d
                r1 = 1
                goto L_0x006d
            L_0x0064:
                java.lang.String r2 = "secondary"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x006d
                r1 = 2
            L_0x006d:
                switch(r1) {
                    case 0: goto L_0x00b8;
                    case 1: goto L_0x00a1;
                    case 2: goto L_0x008a;
                    case 3: goto L_0x0074;
                    default: goto L_0x0070;
                }
            L_0x0070:
                r10.skipValue()
                goto L_0x0016
            L_0x0074:
                com.google.gson.TypeAdapter<com.mapbox.api.directions.v5.a.ai> r0 = r9.f26257b
                if (r0 != 0) goto L_0x0082
                com.google.gson.Gson r0 = r9.f26258c
                java.lang.Class<com.mapbox.api.directions.v5.a.ai> r1 = com.mapbox.api.directions.v5.a.ai.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r9.f26257b = r0
            L_0x0082:
                java.lang.Object r0 = r0.read(r10)
                r8 = r0
                com.mapbox.api.directions.v5.a.ai r8 = (com.mapbox.api.directions.v5.a.ai) r8
                goto L_0x0016
            L_0x008a:
                com.google.gson.TypeAdapter<com.mapbox.api.directions.v5.a.ai> r0 = r9.f26257b
                if (r0 != 0) goto L_0x0098
                com.google.gson.Gson r0 = r9.f26258c
                java.lang.Class<com.mapbox.api.directions.v5.a.ai> r1 = com.mapbox.api.directions.v5.a.ai.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r9.f26257b = r0
            L_0x0098:
                java.lang.Object r0 = r0.read(r10)
                r7 = r0
                com.mapbox.api.directions.v5.a.ai r7 = (com.mapbox.api.directions.v5.a.ai) r7
                goto L_0x0016
            L_0x00a1:
                com.google.gson.TypeAdapter<com.mapbox.api.directions.v5.a.ai> r0 = r9.f26257b
                if (r0 != 0) goto L_0x00af
                com.google.gson.Gson r0 = r9.f26258c
                java.lang.Class<com.mapbox.api.directions.v5.a.ai> r1 = com.mapbox.api.directions.v5.a.ai.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r9.f26257b = r0
            L_0x00af:
                java.lang.Object r0 = r0.read(r10)
                r6 = r0
                com.mapbox.api.directions.v5.a.ai r6 = (com.mapbox.api.directions.v5.a.ai) r6
                goto L_0x0016
            L_0x00b8:
                com.google.gson.TypeAdapter<java.lang.Double> r0 = r9.f26256a
                if (r0 != 0) goto L_0x00c6
                com.google.gson.Gson r0 = r9.f26258c
                java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r9.f26256a = r0
            L_0x00c6:
                java.lang.Object r0 = r0.read(r10)
                java.lang.Double r0 = (java.lang.Double) r0
                double r4 = r0.doubleValue()
                goto L_0x0016
            L_0x00d2:
                r10.endObject()
                com.mapbox.api.directions.v5.a.r r10 = new com.mapbox.api.directions.v5.a.r
                r3 = r10
                r3.<init>(r4, r6, r7, r8)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.api.directions.v5.a.r.a.read(com.google.gson.stream.JsonReader):java.lang.Object");
        }

        public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
            ah ahVar = (ah) obj;
            if (ahVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("distanceAlongGeometry");
            TypeAdapter<Double> typeAdapter = this.f26256a;
            if (typeAdapter == null) {
                typeAdapter = this.f26258c.getAdapter(Double.class);
                this.f26256a = typeAdapter;
            }
            typeAdapter.write(jsonWriter, Double.valueOf(ahVar.distanceAlongGeometry()));
            jsonWriter.name("primary");
            if (ahVar.primary() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<ai> typeAdapter2 = this.f26257b;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f26258c.getAdapter(ai.class);
                    this.f26257b = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, ahVar.primary());
            }
            jsonWriter.name("secondary");
            if (ahVar.secondary() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<ai> typeAdapter3 = this.f26257b;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f26258c.getAdapter(ai.class);
                    this.f26257b = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, ahVar.secondary());
            }
            jsonWriter.name("sub");
            if (ahVar.sub() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<ai> typeAdapter4 = this.f26257b;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.f26258c.getAdapter(ai.class);
                    this.f26257b = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, ahVar.sub());
            }
            jsonWriter.endObject();
        }
    }

    r(double d2, @Nullable ai aiVar, @Nullable ai aiVar2, @Nullable ai aiVar3) {
        super(d2, aiVar, aiVar2, aiVar3);
    }
}
