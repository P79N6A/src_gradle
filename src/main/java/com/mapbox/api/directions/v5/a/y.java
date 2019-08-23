package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;

public final class y extends i {

    public static final class a extends TypeAdapter<ap> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<List<Double>> f26280a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<List<ar>> f26281b;

        /* renamed from: c  reason: collision with root package name */
        private volatile TypeAdapter<List<String>> f26282c;

        /* renamed from: d  reason: collision with root package name */
        private final Gson f26283d;

        public a(Gson gson) {
            this.f26283d = gson;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.util.List} */
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
                if (r0 == 0) goto L_0x0112
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
                    case 109641799: goto L_0x0054;
                    case 288459765: goto L_0x004a;
                    case 426449251: goto L_0x0040;
                    case 1616533543: goto L_0x0036;
                    default: goto L_0x0035;
                }
            L_0x0035:
                goto L_0x0067
            L_0x0036:
                java.lang.String r2 = "congestion"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0067
                r1 = 4
                goto L_0x0067
            L_0x0040:
                java.lang.String r2 = "maxspeed"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0067
                r1 = 3
                goto L_0x0067
            L_0x004a:
                java.lang.String r2 = "distance"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0067
                r1 = 0
                goto L_0x0067
            L_0x0054:
                java.lang.String r2 = "speed"
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
                    case 0: goto L_0x00f1;
                    case 1: goto L_0x00d0;
                    case 2: goto L_0x00af;
                    case 3: goto L_0x008e;
                    case 4: goto L_0x006e;
                    default: goto L_0x006a;
                }
            L_0x006a:
                r11.skipValue()
                goto L_0x0015
            L_0x006e:
                com.google.gson.TypeAdapter<java.util.List<java.lang.String>> r0 = r10.f26282c
                if (r0 != 0) goto L_0x0086
                com.google.gson.Gson r0 = r10.f26283d
                java.lang.Class<java.util.List> r1 = java.util.List.class
                java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r9]
                java.lang.Class<java.lang.String> r8 = java.lang.String.class
                r2[r3] = r8
                com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.getParameterized(r1, r2)
                com.google.gson.TypeAdapter r0 = r0.getAdapter((com.google.gson.reflect.TypeToken<T>) r1)
                r10.f26282c = r0
            L_0x0086:
                java.lang.Object r0 = r0.read(r11)
                r8 = r0
                java.util.List r8 = (java.util.List) r8
                goto L_0x0015
            L_0x008e:
                com.google.gson.TypeAdapter<java.util.List<com.mapbox.api.directions.v5.a.ar>> r0 = r10.f26281b
                if (r0 != 0) goto L_0x00a6
                com.google.gson.Gson r0 = r10.f26283d
                java.lang.Class<java.util.List> r1 = java.util.List.class
                java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r9]
                java.lang.Class<com.mapbox.api.directions.v5.a.ar> r7 = com.mapbox.api.directions.v5.a.ar.class
                r2[r3] = r7
                com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.getParameterized(r1, r2)
                com.google.gson.TypeAdapter r0 = r0.getAdapter((com.google.gson.reflect.TypeToken<T>) r1)
                r10.f26281b = r0
            L_0x00a6:
                java.lang.Object r0 = r0.read(r11)
                r7 = r0
                java.util.List r7 = (java.util.List) r7
                goto L_0x0015
            L_0x00af:
                com.google.gson.TypeAdapter<java.util.List<java.lang.Double>> r0 = r10.f26280a
                if (r0 != 0) goto L_0x00c7
                com.google.gson.Gson r0 = r10.f26283d
                java.lang.Class<java.util.List> r1 = java.util.List.class
                java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r9]
                java.lang.Class<java.lang.Double> r6 = java.lang.Double.class
                r2[r3] = r6
                com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.getParameterized(r1, r2)
                com.google.gson.TypeAdapter r0 = r0.getAdapter((com.google.gson.reflect.TypeToken<T>) r1)
                r10.f26280a = r0
            L_0x00c7:
                java.lang.Object r0 = r0.read(r11)
                r6 = r0
                java.util.List r6 = (java.util.List) r6
                goto L_0x0015
            L_0x00d0:
                com.google.gson.TypeAdapter<java.util.List<java.lang.Double>> r0 = r10.f26280a
                if (r0 != 0) goto L_0x00e8
                com.google.gson.Gson r0 = r10.f26283d
                java.lang.Class<java.util.List> r1 = java.util.List.class
                java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r9]
                java.lang.Class<java.lang.Double> r5 = java.lang.Double.class
                r2[r3] = r5
                com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.getParameterized(r1, r2)
                com.google.gson.TypeAdapter r0 = r0.getAdapter((com.google.gson.reflect.TypeToken<T>) r1)
                r10.f26280a = r0
            L_0x00e8:
                java.lang.Object r0 = r0.read(r11)
                r5 = r0
                java.util.List r5 = (java.util.List) r5
                goto L_0x0015
            L_0x00f1:
                com.google.gson.TypeAdapter<java.util.List<java.lang.Double>> r0 = r10.f26280a
                if (r0 != 0) goto L_0x0109
                com.google.gson.Gson r0 = r10.f26283d
                java.lang.Class<java.util.List> r1 = java.util.List.class
                java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r9]
                java.lang.Class<java.lang.Double> r4 = java.lang.Double.class
                r2[r3] = r4
                com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.getParameterized(r1, r2)
                com.google.gson.TypeAdapter r0 = r0.getAdapter((com.google.gson.reflect.TypeToken<T>) r1)
                r10.f26280a = r0
            L_0x0109:
                java.lang.Object r0 = r0.read(r11)
                r4 = r0
                java.util.List r4 = (java.util.List) r4
                goto L_0x0015
            L_0x0112:
                r11.endObject()
                com.mapbox.api.directions.v5.a.y r11 = new com.mapbox.api.directions.v5.a.y
                r3 = r11
                r3.<init>(r4, r5, r6, r7, r8)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.api.directions.v5.a.y.a.read(com.google.gson.stream.JsonReader):java.lang.Object");
        }

        public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
            ap apVar = (ap) obj;
            if (apVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("distance");
            if (apVar.distance() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Double>> typeAdapter = this.f26280a;
                if (typeAdapter == null) {
                    typeAdapter = this.f26283d.getAdapter(TypeToken.getParameterized(List.class, Double.class));
                    this.f26280a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, apVar.distance());
            }
            jsonWriter.name("duration");
            if (apVar.duration() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Double>> typeAdapter2 = this.f26280a;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f26283d.getAdapter(TypeToken.getParameterized(List.class, Double.class));
                    this.f26280a = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, apVar.duration());
            }
            jsonWriter.name("speed");
            if (apVar.speed() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Double>> typeAdapter3 = this.f26280a;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f26283d.getAdapter(TypeToken.getParameterized(List.class, Double.class));
                    this.f26280a = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, apVar.speed());
            }
            jsonWriter.name("maxspeed");
            if (apVar.maxspeed() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<ar>> typeAdapter4 = this.f26281b;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.f26283d.getAdapter(TypeToken.getParameterized(List.class, ar.class));
                    this.f26281b = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, apVar.maxspeed());
            }
            jsonWriter.name("congestion");
            if (apVar.congestion() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<String>> typeAdapter5 = this.f26282c;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.f26283d.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.f26282c = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, apVar.congestion());
            }
            jsonWriter.endObject();
        }
    }

    y(@Nullable List<Double> list, @Nullable List<Double> list2, @Nullable List<Double> list3, @Nullable List<ar> list4, @Nullable List<String> list5) {
        super(list, list2, list3, list4, list5);
    }
}
