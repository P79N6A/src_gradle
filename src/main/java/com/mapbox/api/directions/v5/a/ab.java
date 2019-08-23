package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;

public final class ab extends l {

    public static final class a extends TypeAdapter<as> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<Double> f26160a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<String> f26161b;

        /* renamed from: c  reason: collision with root package name */
        private volatile TypeAdapter<List<aq>> f26162c;

        /* renamed from: d  reason: collision with root package name */
        private volatile TypeAdapter<ap> f26163d;

        /* renamed from: e  reason: collision with root package name */
        private final Gson f26164e;

        public a(Gson gson) {
            this.f26164e = gson;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Double} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Double} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: com.mapbox.api.directions.v5.a.ap} */
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
                if (r0 == 0) goto L_0x00ea
                java.lang.String r0 = r11.nextName()
                com.google.gson.stream.JsonToken r1 = r11.peek()
                com.google.gson.stream.JsonToken r2 = com.google.gson.stream.JsonToken.NULL
                if (r1 != r2) goto L_0x002b
                r11.nextNull()
                goto L_0x0015
            L_0x002b:
                r1 = -1
                int r2 = r0.hashCode()
                r3 = 0
                r9 = 1
                switch(r2) {
                    case -1992012396: goto L_0x005e;
                    case -1857640538: goto L_0x0054;
                    case -1555043537: goto L_0x004a;
                    case 109761319: goto L_0x0040;
                    case 288459765: goto L_0x0036;
                    default: goto L_0x0035;
                }
            L_0x0035:
                goto L_0x0067
            L_0x0036:
                java.lang.String r2 = "distance"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0067
                r1 = 0
                goto L_0x0067
            L_0x0040:
                java.lang.String r2 = "steps"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0067
                r1 = 3
                goto L_0x0067
            L_0x004a:
                java.lang.String r2 = "annotation"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0067
                r1 = 4
                goto L_0x0067
            L_0x0054:
                java.lang.String r2 = "summary"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0067
                r1 = 2
                goto L_0x0067
            L_0x005e:
                java.lang.String r2 = "duration"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0067
                r1 = 1
            L_0x0067:
                switch(r1) {
                    case 0: goto L_0x00d3;
                    case 1: goto L_0x00bc;
                    case 2: goto L_0x00a5;
                    case 3: goto L_0x0084;
                    case 4: goto L_0x006e;
                    default: goto L_0x006a;
                }
            L_0x006a:
                r11.skipValue()
                goto L_0x0015
            L_0x006e:
                com.google.gson.TypeAdapter<com.mapbox.api.directions.v5.a.ap> r0 = r10.f26163d
                if (r0 != 0) goto L_0x007c
                com.google.gson.Gson r0 = r10.f26164e
                java.lang.Class<com.mapbox.api.directions.v5.a.ap> r1 = com.mapbox.api.directions.v5.a.ap.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r10.f26163d = r0
            L_0x007c:
                java.lang.Object r0 = r0.read(r11)
                r8 = r0
                com.mapbox.api.directions.v5.a.ap r8 = (com.mapbox.api.directions.v5.a.ap) r8
                goto L_0x0015
            L_0x0084:
                com.google.gson.TypeAdapter<java.util.List<com.mapbox.api.directions.v5.a.aq>> r0 = r10.f26162c
                if (r0 != 0) goto L_0x009c
                com.google.gson.Gson r0 = r10.f26164e
                java.lang.Class<java.util.List> r1 = java.util.List.class
                java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r9]
                java.lang.Class<com.mapbox.api.directions.v5.a.aq> r7 = com.mapbox.api.directions.v5.a.aq.class
                r2[r3] = r7
                com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.getParameterized(r1, r2)
                com.google.gson.TypeAdapter r0 = r0.getAdapter((com.google.gson.reflect.TypeToken<T>) r1)
                r10.f26162c = r0
            L_0x009c:
                java.lang.Object r0 = r0.read(r11)
                r7 = r0
                java.util.List r7 = (java.util.List) r7
                goto L_0x0015
            L_0x00a5:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r10.f26161b
                if (r0 != 0) goto L_0x00b3
                com.google.gson.Gson r0 = r10.f26164e
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r10.f26161b = r0
            L_0x00b3:
                java.lang.Object r0 = r0.read(r11)
                r6 = r0
                java.lang.String r6 = (java.lang.String) r6
                goto L_0x0015
            L_0x00bc:
                com.google.gson.TypeAdapter<java.lang.Double> r0 = r10.f26160a
                if (r0 != 0) goto L_0x00ca
                com.google.gson.Gson r0 = r10.f26164e
                java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r10.f26160a = r0
            L_0x00ca:
                java.lang.Object r0 = r0.read(r11)
                r5 = r0
                java.lang.Double r5 = (java.lang.Double) r5
                goto L_0x0015
            L_0x00d3:
                com.google.gson.TypeAdapter<java.lang.Double> r0 = r10.f26160a
                if (r0 != 0) goto L_0x00e1
                com.google.gson.Gson r0 = r10.f26164e
                java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r10.f26160a = r0
            L_0x00e1:
                java.lang.Object r0 = r0.read(r11)
                r4 = r0
                java.lang.Double r4 = (java.lang.Double) r4
                goto L_0x0015
            L_0x00ea:
                r11.endObject()
                com.mapbox.api.directions.v5.a.ab r11 = new com.mapbox.api.directions.v5.a.ab
                r3 = r11
                r3.<init>(r4, r5, r6, r7, r8)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.api.directions.v5.a.ab.a.read(com.google.gson.stream.JsonReader):java.lang.Object");
        }

        public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
            as asVar = (as) obj;
            if (asVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("distance");
            if (asVar.distance() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter = this.f26160a;
                if (typeAdapter == null) {
                    typeAdapter = this.f26164e.getAdapter(Double.class);
                    this.f26160a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, asVar.distance());
            }
            jsonWriter.name("duration");
            if (asVar.duration() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter2 = this.f26160a;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f26164e.getAdapter(Double.class);
                    this.f26160a = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, asVar.duration());
            }
            jsonWriter.name("summary");
            if (asVar.summary() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.f26161b;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f26164e.getAdapter(String.class);
                    this.f26161b = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, asVar.summary());
            }
            jsonWriter.name("steps");
            if (asVar.steps() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<aq>> typeAdapter4 = this.f26162c;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.f26164e.getAdapter(TypeToken.getParameterized(List.class, aq.class));
                    this.f26162c = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, asVar.steps());
            }
            jsonWriter.name("annotation");
            if (asVar.annotation() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<ap> typeAdapter5 = this.f26163d;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.f26164e.getAdapter(ap.class);
                    this.f26163d = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, asVar.annotation());
            }
            jsonWriter.endObject();
        }
    }

    ab(@Nullable Double d2, @Nullable Double d3, @Nullable String str, @Nullable List<aq> list, @Nullable ap apVar) {
        super(d2, d3, str, list, apVar);
    }
}
