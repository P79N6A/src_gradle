package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;

public final class z extends j {

    public static final class a extends TypeAdapter<aq> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<Double> f26284a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<String> f26285b;

        /* renamed from: c  reason: collision with root package name */
        private volatile TypeAdapter<av> f26286c;

        /* renamed from: d  reason: collision with root package name */
        private volatile TypeAdapter<List<aw>> f26287d;

        /* renamed from: e  reason: collision with root package name */
        private volatile TypeAdapter<List<ah>> f26288e;

        /* renamed from: f  reason: collision with root package name */
        private volatile TypeAdapter<List<au>> f26289f;
        private final Gson g;

        public a(Gson gson) {
            this.g = gson;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v49, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v54, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v59, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: com.mapbox.api.directions.v5.a.av} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v64, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v69, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v74, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v85, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v90, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: java.lang.String} */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object read(com.google.gson.stream.JsonReader r27) throws java.io.IOException {
            /*
                r26 = this;
                r0 = r26
                r1 = r27
                com.google.gson.stream.JsonToken r2 = r27.peek()
                com.google.gson.stream.JsonToken r3 = com.google.gson.stream.JsonToken.NULL
                r4 = 0
                if (r2 != r3) goto L_0x0011
                r27.nextNull()
                return r4
            L_0x0011:
                r27.beginObject()
                r2 = 0
                r6 = r2
                r8 = r6
                r22 = r8
                r10 = r4
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
                r21 = r20
                r24 = r21
                r25 = r24
            L_0x0030:
                boolean r2 = r27.hasNext()
                if (r2 == 0) goto L_0x02ca
                java.lang.String r2 = r27.nextName()
                com.google.gson.stream.JsonToken r3 = r27.peek()
                com.google.gson.stream.JsonToken r4 = com.google.gson.stream.JsonToken.NULL
                if (r3 != r4) goto L_0x0046
                r27.nextNull()
                goto L_0x0030
            L_0x0046:
                int r4 = r2.hashCode()
                r5 = 0
                r3 = 1
                switch(r4) {
                    case -2131714057: goto L_0x0100;
                    case -1992012396: goto L_0x00f6;
                    case -1823285049: goto L_0x00eb;
                    case -1375584731: goto L_0x00e1;
                    case -791592328: goto L_0x00d6;
                    case -521036971: goto L_0x00cc;
                    case -487319823: goto L_0x00c1;
                    case -463249713: goto L_0x00b6;
                    case 112787: goto L_0x00ac;
                    case 3357091: goto L_0x00a2;
                    case 3373707: goto L_0x0097;
                    case 96955157: goto L_0x008b;
                    case 127393753: goto L_0x007f;
                    case 288459765: goto L_0x0074;
                    case 661843161: goto L_0x0068;
                    case 967255818: goto L_0x005c;
                    case 1846020210: goto L_0x0051;
                    default: goto L_0x004f;
                }
            L_0x004f:
                goto L_0x010b
            L_0x0051:
                java.lang.String r4 = "geometry"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x010b
                r2 = 2
                goto L_0x010c
            L_0x005c:
                java.lang.String r4 = "intersections"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x010b
                r2 = 15
                goto L_0x010c
            L_0x0068:
                java.lang.String r4 = "rotary_name"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x010b
                r2 = 8
                goto L_0x010c
            L_0x0074:
                java.lang.String r4 = "distance"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x010b
                r2 = 0
                goto L_0x010c
            L_0x007f:
                java.lang.String r4 = "maneuver"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x010b
                r2 = 10
                goto L_0x010c
            L_0x008b:
                java.lang.String r4 = "exits"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x010b
                r2 = 16
                goto L_0x010c
            L_0x0097:
                java.lang.String r4 = "name"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x010b
                r2 = 3
                goto L_0x010c
            L_0x00a2:
                java.lang.String r4 = "mode"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x010b
                r2 = 6
                goto L_0x010c
            L_0x00ac:
                java.lang.String r4 = "ref"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x010b
                r2 = 4
                goto L_0x010c
            L_0x00b6:
                java.lang.String r4 = "driving_side"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x010b
                r2 = 13
                goto L_0x010c
            L_0x00c1:
                java.lang.String r4 = "bannerInstructions"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x010b
                r2 = 12
                goto L_0x010c
            L_0x00cc:
                java.lang.String r4 = "pronunciation"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x010b
                r2 = 7
                goto L_0x010c
            L_0x00d6:
                java.lang.String r4 = "weight"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x010b
                r2 = 14
                goto L_0x010c
            L_0x00e1:
                java.lang.String r4 = "destinations"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x010b
                r2 = 5
                goto L_0x010c
            L_0x00eb:
                java.lang.String r4 = "rotary_pronunciation"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x010b
                r2 = 9
                goto L_0x010c
            L_0x00f6:
                java.lang.String r4 = "duration"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x010b
                r2 = 1
                goto L_0x010c
            L_0x0100:
                java.lang.String r4 = "voiceInstructions"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x010b
                r2 = 11
                goto L_0x010c
            L_0x010b:
                r2 = -1
            L_0x010c:
                switch(r2) {
                    case 0: goto L_0x02b0;
                    case 1: goto L_0x0296;
                    case 2: goto L_0x027f;
                    case 3: goto L_0x0268;
                    case 4: goto L_0x0251;
                    case 5: goto L_0x023a;
                    case 6: goto L_0x0223;
                    case 7: goto L_0x020c;
                    case 8: goto L_0x01f4;
                    case 9: goto L_0x01dc;
                    case 10: goto L_0x01c4;
                    case 11: goto L_0x01a2;
                    case 12: goto L_0x0180;
                    case 13: goto L_0x0168;
                    case 14: goto L_0x014e;
                    case 15: goto L_0x012c;
                    case 16: goto L_0x0114;
                    default: goto L_0x010f;
                }
            L_0x010f:
                r27.skipValue()
                goto L_0x0030
            L_0x0114:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26285b
                if (r2 != 0) goto L_0x0122
                com.google.gson.Gson r2 = r0.g
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26285b = r2
            L_0x0122:
                java.lang.Object r2 = r2.read(r1)
                r25 = r2
                java.lang.String r25 = (java.lang.String) r25
                goto L_0x0030
            L_0x012c:
                com.google.gson.TypeAdapter<java.util.List<com.mapbox.api.directions.v5.a.au>> r2 = r0.f26289f
                if (r2 != 0) goto L_0x0144
                com.google.gson.Gson r2 = r0.g
                java.lang.Class<java.util.List> r4 = java.util.List.class
                java.lang.reflect.Type[] r3 = new java.lang.reflect.Type[r3]
                java.lang.Class<com.mapbox.api.directions.v5.a.au> r24 = com.mapbox.api.directions.v5.a.au.class
                r3[r5] = r24
                com.google.gson.reflect.TypeToken r3 = com.google.gson.reflect.TypeToken.getParameterized(r4, r3)
                com.google.gson.TypeAdapter r2 = r2.getAdapter((com.google.gson.reflect.TypeToken<T>) r3)
                r0.f26289f = r2
            L_0x0144:
                java.lang.Object r2 = r2.read(r1)
                r24 = r2
                java.util.List r24 = (java.util.List) r24
                goto L_0x0030
            L_0x014e:
                com.google.gson.TypeAdapter<java.lang.Double> r2 = r0.f26284a
                if (r2 != 0) goto L_0x015c
                com.google.gson.Gson r2 = r0.g
                java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26284a = r2
            L_0x015c:
                java.lang.Object r2 = r2.read(r1)
                java.lang.Double r2 = (java.lang.Double) r2
                double r22 = r2.doubleValue()
                goto L_0x0030
            L_0x0168:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26285b
                if (r2 != 0) goto L_0x0176
                com.google.gson.Gson r2 = r0.g
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26285b = r2
            L_0x0176:
                java.lang.Object r2 = r2.read(r1)
                r21 = r2
                java.lang.String r21 = (java.lang.String) r21
                goto L_0x0030
            L_0x0180:
                com.google.gson.TypeAdapter<java.util.List<com.mapbox.api.directions.v5.a.ah>> r2 = r0.f26288e
                if (r2 != 0) goto L_0x0198
                com.google.gson.Gson r2 = r0.g
                java.lang.Class<java.util.List> r4 = java.util.List.class
                java.lang.reflect.Type[] r3 = new java.lang.reflect.Type[r3]
                java.lang.Class<com.mapbox.api.directions.v5.a.ah> r20 = com.mapbox.api.directions.v5.a.ah.class
                r3[r5] = r20
                com.google.gson.reflect.TypeToken r3 = com.google.gson.reflect.TypeToken.getParameterized(r4, r3)
                com.google.gson.TypeAdapter r2 = r2.getAdapter((com.google.gson.reflect.TypeToken<T>) r3)
                r0.f26288e = r2
            L_0x0198:
                java.lang.Object r2 = r2.read(r1)
                r20 = r2
                java.util.List r20 = (java.util.List) r20
                goto L_0x0030
            L_0x01a2:
                com.google.gson.TypeAdapter<java.util.List<com.mapbox.api.directions.v5.a.aw>> r2 = r0.f26287d
                if (r2 != 0) goto L_0x01ba
                com.google.gson.Gson r2 = r0.g
                java.lang.Class<java.util.List> r4 = java.util.List.class
                java.lang.reflect.Type[] r3 = new java.lang.reflect.Type[r3]
                java.lang.Class<com.mapbox.api.directions.v5.a.aw> r19 = com.mapbox.api.directions.v5.a.aw.class
                r3[r5] = r19
                com.google.gson.reflect.TypeToken r3 = com.google.gson.reflect.TypeToken.getParameterized(r4, r3)
                com.google.gson.TypeAdapter r2 = r2.getAdapter((com.google.gson.reflect.TypeToken<T>) r3)
                r0.f26287d = r2
            L_0x01ba:
                java.lang.Object r2 = r2.read(r1)
                r19 = r2
                java.util.List r19 = (java.util.List) r19
                goto L_0x0030
            L_0x01c4:
                com.google.gson.TypeAdapter<com.mapbox.api.directions.v5.a.av> r2 = r0.f26286c
                if (r2 != 0) goto L_0x01d2
                com.google.gson.Gson r2 = r0.g
                java.lang.Class<com.mapbox.api.directions.v5.a.av> r3 = com.mapbox.api.directions.v5.a.av.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26286c = r2
            L_0x01d2:
                java.lang.Object r2 = r2.read(r1)
                r18 = r2
                com.mapbox.api.directions.v5.a.av r18 = (com.mapbox.api.directions.v5.a.av) r18
                goto L_0x0030
            L_0x01dc:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26285b
                if (r2 != 0) goto L_0x01ea
                com.google.gson.Gson r2 = r0.g
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26285b = r2
            L_0x01ea:
                java.lang.Object r2 = r2.read(r1)
                r17 = r2
                java.lang.String r17 = (java.lang.String) r17
                goto L_0x0030
            L_0x01f4:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26285b
                if (r2 != 0) goto L_0x0202
                com.google.gson.Gson r2 = r0.g
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26285b = r2
            L_0x0202:
                java.lang.Object r2 = r2.read(r1)
                r16 = r2
                java.lang.String r16 = (java.lang.String) r16
                goto L_0x0030
            L_0x020c:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26285b
                if (r2 != 0) goto L_0x021a
                com.google.gson.Gson r2 = r0.g
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26285b = r2
            L_0x021a:
                java.lang.Object r2 = r2.read(r1)
                r15 = r2
                java.lang.String r15 = (java.lang.String) r15
                goto L_0x0030
            L_0x0223:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26285b
                if (r2 != 0) goto L_0x0231
                com.google.gson.Gson r2 = r0.g
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26285b = r2
            L_0x0231:
                java.lang.Object r2 = r2.read(r1)
                r14 = r2
                java.lang.String r14 = (java.lang.String) r14
                goto L_0x0030
            L_0x023a:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26285b
                if (r2 != 0) goto L_0x0248
                com.google.gson.Gson r2 = r0.g
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26285b = r2
            L_0x0248:
                java.lang.Object r2 = r2.read(r1)
                r13 = r2
                java.lang.String r13 = (java.lang.String) r13
                goto L_0x0030
            L_0x0251:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26285b
                if (r2 != 0) goto L_0x025f
                com.google.gson.Gson r2 = r0.g
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26285b = r2
            L_0x025f:
                java.lang.Object r2 = r2.read(r1)
                r12 = r2
                java.lang.String r12 = (java.lang.String) r12
                goto L_0x0030
            L_0x0268:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26285b
                if (r2 != 0) goto L_0x0276
                com.google.gson.Gson r2 = r0.g
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26285b = r2
            L_0x0276:
                java.lang.Object r2 = r2.read(r1)
                r11 = r2
                java.lang.String r11 = (java.lang.String) r11
                goto L_0x0030
            L_0x027f:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26285b
                if (r2 != 0) goto L_0x028d
                com.google.gson.Gson r2 = r0.g
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26285b = r2
            L_0x028d:
                java.lang.Object r2 = r2.read(r1)
                r10 = r2
                java.lang.String r10 = (java.lang.String) r10
                goto L_0x0030
            L_0x0296:
                com.google.gson.TypeAdapter<java.lang.Double> r2 = r0.f26284a
                if (r2 != 0) goto L_0x02a4
                com.google.gson.Gson r2 = r0.g
                java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26284a = r2
            L_0x02a4:
                java.lang.Object r2 = r2.read(r1)
                java.lang.Double r2 = (java.lang.Double) r2
                double r8 = r2.doubleValue()
                goto L_0x0030
            L_0x02b0:
                com.google.gson.TypeAdapter<java.lang.Double> r2 = r0.f26284a
                if (r2 != 0) goto L_0x02be
                com.google.gson.Gson r2 = r0.g
                java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26284a = r2
            L_0x02be:
                java.lang.Object r2 = r2.read(r1)
                java.lang.Double r2 = (java.lang.Double) r2
                double r6 = r2.doubleValue()
                goto L_0x0030
            L_0x02ca:
                r27.endObject()
                com.mapbox.api.directions.v5.a.z r1 = new com.mapbox.api.directions.v5.a.z
                r5 = r1
                r5.<init>(r6, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r25)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.api.directions.v5.a.z.a.read(com.google.gson.stream.JsonReader):java.lang.Object");
        }

        public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
            aq aqVar = (aq) obj;
            if (aqVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("distance");
            TypeAdapter<Double> typeAdapter = this.f26284a;
            if (typeAdapter == null) {
                typeAdapter = this.g.getAdapter(Double.class);
                this.f26284a = typeAdapter;
            }
            typeAdapter.write(jsonWriter, Double.valueOf(aqVar.distance()));
            jsonWriter.name("duration");
            TypeAdapter<Double> typeAdapter2 = this.f26284a;
            if (typeAdapter2 == null) {
                typeAdapter2 = this.g.getAdapter(Double.class);
                this.f26284a = typeAdapter2;
            }
            typeAdapter2.write(jsonWriter, Double.valueOf(aqVar.duration()));
            jsonWriter.name("geometry");
            if (aqVar.geometry() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.f26285b;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.g.getAdapter(String.class);
                    this.f26285b = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, aqVar.geometry());
            }
            jsonWriter.name("name");
            if (aqVar.name() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter4 = this.f26285b;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.g.getAdapter(String.class);
                    this.f26285b = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, aqVar.name());
            }
            jsonWriter.name("ref");
            if (aqVar.ref() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter5 = this.f26285b;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.g.getAdapter(String.class);
                    this.f26285b = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, aqVar.ref());
            }
            jsonWriter.name("destinations");
            if (aqVar.destinations() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter6 = this.f26285b;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.g.getAdapter(String.class);
                    this.f26285b = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, aqVar.destinations());
            }
            jsonWriter.name("mode");
            if (aqVar.mode() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter7 = this.f26285b;
                if (typeAdapter7 == null) {
                    typeAdapter7 = this.g.getAdapter(String.class);
                    this.f26285b = typeAdapter7;
                }
                typeAdapter7.write(jsonWriter, aqVar.mode());
            }
            jsonWriter.name("pronunciation");
            if (aqVar.pronunciation() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter8 = this.f26285b;
                if (typeAdapter8 == null) {
                    typeAdapter8 = this.g.getAdapter(String.class);
                    this.f26285b = typeAdapter8;
                }
                typeAdapter8.write(jsonWriter, aqVar.pronunciation());
            }
            jsonWriter.name("rotary_name");
            if (aqVar.rotaryName() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter9 = this.f26285b;
                if (typeAdapter9 == null) {
                    typeAdapter9 = this.g.getAdapter(String.class);
                    this.f26285b = typeAdapter9;
                }
                typeAdapter9.write(jsonWriter, aqVar.rotaryName());
            }
            jsonWriter.name("rotary_pronunciation");
            if (aqVar.rotaryPronunciation() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter10 = this.f26285b;
                if (typeAdapter10 == null) {
                    typeAdapter10 = this.g.getAdapter(String.class);
                    this.f26285b = typeAdapter10;
                }
                typeAdapter10.write(jsonWriter, aqVar.rotaryPronunciation());
            }
            jsonWriter.name("maneuver");
            if (aqVar.maneuver() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<av> typeAdapter11 = this.f26286c;
                if (typeAdapter11 == null) {
                    typeAdapter11 = this.g.getAdapter(av.class);
                    this.f26286c = typeAdapter11;
                }
                typeAdapter11.write(jsonWriter, aqVar.maneuver());
            }
            jsonWriter.name("voiceInstructions");
            if (aqVar.voiceInstructions() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<aw>> typeAdapter12 = this.f26287d;
                if (typeAdapter12 == null) {
                    typeAdapter12 = this.g.getAdapter(TypeToken.getParameterized(List.class, aw.class));
                    this.f26287d = typeAdapter12;
                }
                typeAdapter12.write(jsonWriter, aqVar.voiceInstructions());
            }
            jsonWriter.name("bannerInstructions");
            if (aqVar.bannerInstructions() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<ah>> typeAdapter13 = this.f26288e;
                if (typeAdapter13 == null) {
                    typeAdapter13 = this.g.getAdapter(TypeToken.getParameterized(List.class, ah.class));
                    this.f26288e = typeAdapter13;
                }
                typeAdapter13.write(jsonWriter, aqVar.bannerInstructions());
            }
            jsonWriter.name("driving_side");
            if (aqVar.drivingSide() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter14 = this.f26285b;
                if (typeAdapter14 == null) {
                    typeAdapter14 = this.g.getAdapter(String.class);
                    this.f26285b = typeAdapter14;
                }
                typeAdapter14.write(jsonWriter, aqVar.drivingSide());
            }
            jsonWriter.name("weight");
            TypeAdapter<Double> typeAdapter15 = this.f26284a;
            if (typeAdapter15 == null) {
                typeAdapter15 = this.g.getAdapter(Double.class);
                this.f26284a = typeAdapter15;
            }
            typeAdapter15.write(jsonWriter, Double.valueOf(aqVar.weight()));
            jsonWriter.name("intersections");
            if (aqVar.intersections() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<au>> typeAdapter16 = this.f26289f;
                if (typeAdapter16 == null) {
                    typeAdapter16 = this.g.getAdapter(TypeToken.getParameterized(List.class, au.class));
                    this.f26289f = typeAdapter16;
                }
                typeAdapter16.write(jsonWriter, aqVar.intersections());
            }
            jsonWriter.name("exits");
            if (aqVar.exits() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter17 = this.f26285b;
                if (typeAdapter17 == null) {
                    typeAdapter17 = this.g.getAdapter(String.class);
                    this.f26285b = typeAdapter17;
                }
                typeAdapter17.write(jsonWriter, aqVar.exits());
            }
            jsonWriter.endObject();
        }
    }

    z(double d2, double d3, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, av avVar, @Nullable List<aw> list, @Nullable List<ah> list2, @Nullable String str9, double d4, @Nullable List<au> list3, @Nullable String str10) {
        super(d2, d3, str, str2, str3, str4, str5, str6, str7, str8, avVar, list, list2, str9, d4, list3, str10);
    }
}
