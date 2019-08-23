package com.mapbox.api.matching.v5.models;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public final class h extends d {

    public static final class a extends TypeAdapter<l> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<Integer> f26352a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<String> f26353b;

        /* renamed from: c  reason: collision with root package name */
        private volatile TypeAdapter<double[]> f26354c;

        /* renamed from: d  reason: collision with root package name */
        private final Gson f26355d;

        public a(Gson gson) {
            this.f26355d = gson;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Integer} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Integer} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Integer} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: double[]} */
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
                r4 = r2
                r5 = r4
                r6 = r5
                r7 = r6
                r8 = r7
            L_0x0015:
                boolean r0 = r10.hasNext()
                if (r0 == 0) goto L_0x00de
                java.lang.String r0 = r10.nextName()
                com.google.gson.stream.JsonToken r1 = r10.peek()
                com.google.gson.stream.JsonToken r2 = com.google.gson.stream.JsonToken.NULL
                if (r1 != r2) goto L_0x002b
                r10.nextNull()
                goto L_0x0015
            L_0x002b:
                r1 = -1
                int r2 = r0.hashCode()
                switch(r2) {
                    case -2146142359: goto L_0x005c;
                    case -1874027018: goto L_0x0052;
                    case 3373707: goto L_0x0048;
                    case 601411348: goto L_0x003e;
                    case 1901043637: goto L_0x0034;
                    default: goto L_0x0033;
                }
            L_0x0033:
                goto L_0x0065
            L_0x0034:
                java.lang.String r2 = "location"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0065
                r1 = 4
                goto L_0x0065
            L_0x003e:
                java.lang.String r2 = "waypoint_index"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0065
                r1 = 2
                goto L_0x0065
            L_0x0048:
                java.lang.String r2 = "name"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0065
                r1 = 3
                goto L_0x0065
            L_0x0052:
                java.lang.String r2 = "alternatives_count"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0065
                r1 = 1
                goto L_0x0065
            L_0x005c:
                java.lang.String r2 = "matchings_index"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0065
                r1 = 0
            L_0x0065:
                switch(r1) {
                    case 0: goto L_0x00c7;
                    case 1: goto L_0x00b0;
                    case 2: goto L_0x0099;
                    case 3: goto L_0x0082;
                    case 4: goto L_0x006c;
                    default: goto L_0x0068;
                }
            L_0x0068:
                r10.skipValue()
                goto L_0x0015
            L_0x006c:
                com.google.gson.TypeAdapter<double[]> r0 = r9.f26354c
                if (r0 != 0) goto L_0x007a
                com.google.gson.Gson r0 = r9.f26355d
                java.lang.Class<double[]> r1 = double[].class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r9.f26354c = r0
            L_0x007a:
                java.lang.Object r0 = r0.read(r10)
                r8 = r0
                double[] r8 = (double[]) r8
                goto L_0x0015
            L_0x0082:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r9.f26353b
                if (r0 != 0) goto L_0x0090
                com.google.gson.Gson r0 = r9.f26355d
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r9.f26353b = r0
            L_0x0090:
                java.lang.Object r0 = r0.read(r10)
                r7 = r0
                java.lang.String r7 = (java.lang.String) r7
                goto L_0x0015
            L_0x0099:
                com.google.gson.TypeAdapter<java.lang.Integer> r0 = r9.f26352a
                if (r0 != 0) goto L_0x00a7
                com.google.gson.Gson r0 = r9.f26355d
                java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r9.f26352a = r0
            L_0x00a7:
                java.lang.Object r0 = r0.read(r10)
                r6 = r0
                java.lang.Integer r6 = (java.lang.Integer) r6
                goto L_0x0015
            L_0x00b0:
                com.google.gson.TypeAdapter<java.lang.Integer> r0 = r9.f26352a
                if (r0 != 0) goto L_0x00be
                com.google.gson.Gson r0 = r9.f26355d
                java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r9.f26352a = r0
            L_0x00be:
                java.lang.Object r0 = r0.read(r10)
                r5 = r0
                java.lang.Integer r5 = (java.lang.Integer) r5
                goto L_0x0015
            L_0x00c7:
                com.google.gson.TypeAdapter<java.lang.Integer> r0 = r9.f26352a
                if (r0 != 0) goto L_0x00d5
                com.google.gson.Gson r0 = r9.f26355d
                java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r9.f26352a = r0
            L_0x00d5:
                java.lang.Object r0 = r0.read(r10)
                r4 = r0
                java.lang.Integer r4 = (java.lang.Integer) r4
                goto L_0x0015
            L_0x00de:
                r10.endObject()
                com.mapbox.api.matching.v5.models.h r10 = new com.mapbox.api.matching.v5.models.h
                r3 = r10
                r3.<init>(r4, r5, r6, r7, r8)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.api.matching.v5.models.h.a.read(com.google.gson.stream.JsonReader):java.lang.Object");
        }

        public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
            l lVar = (l) obj;
            if (lVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("matchings_index");
            if (lVar.matchingsIndex() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter = this.f26352a;
                if (typeAdapter == null) {
                    typeAdapter = this.f26355d.getAdapter(Integer.class);
                    this.f26352a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, lVar.matchingsIndex());
            }
            jsonWriter.name("alternatives_count");
            if (lVar.alternativesCount() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter2 = this.f26352a;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f26355d.getAdapter(Integer.class);
                    this.f26352a = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, lVar.alternativesCount());
            }
            jsonWriter.name("waypoint_index");
            if (lVar.waypointIndex() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter3 = this.f26352a;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f26355d.getAdapter(Integer.class);
                    this.f26352a = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, lVar.waypointIndex());
            }
            jsonWriter.name("name");
            if (lVar.name() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter4 = this.f26353b;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.f26355d.getAdapter(String.class);
                    this.f26353b = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, lVar.name());
            }
            jsonWriter.name("location");
            if (lVar.a() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<double[]> typeAdapter5 = this.f26354c;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.f26355d.getAdapter(double[].class);
                    this.f26354c = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, lVar.a());
            }
            jsonWriter.endObject();
        }
    }

    h(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str, @Nullable double[] dArr) {
        super(num, num2, num3, str, dArr);
    }
}
