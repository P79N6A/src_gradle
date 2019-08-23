package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;

public final class ad extends n {

    public static final class a extends TypeAdapter<au> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<double[]> f26169a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<List<Integer>> f26170b;

        /* renamed from: c  reason: collision with root package name */
        private volatile TypeAdapter<List<String>> f26171c;

        /* renamed from: d  reason: collision with root package name */
        private volatile TypeAdapter<List<Boolean>> f26172d;

        /* renamed from: e  reason: collision with root package name */
        private volatile TypeAdapter<Integer> f26173e;

        /* renamed from: f  reason: collision with root package name */
        private volatile TypeAdapter<List<ao>> f26174f;
        private final Gson g;

        public a(Gson gson) {
            this.g = gson;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: double[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.Integer} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Integer} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.util.List} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object read(com.google.gson.stream.JsonReader r13) throws java.io.IOException {
            /*
                r12 = this;
                com.google.gson.stream.JsonToken r0 = r13.peek()
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                r2 = 0
                if (r0 != r1) goto L_0x000d
                r13.nextNull()
                return r2
            L_0x000d:
                r13.beginObject()
                r4 = r2
                r5 = r4
                r6 = r5
                r7 = r6
                r8 = r7
                r9 = r8
                r10 = r9
            L_0x0017:
                boolean r0 = r13.hasNext()
                if (r0 == 0) goto L_0x014d
                java.lang.String r0 = r13.nextName()
                com.google.gson.stream.JsonToken r1 = r13.peek()
                com.google.gson.stream.JsonToken r2 = com.google.gson.stream.JsonToken.NULL
                if (r1 != r2) goto L_0x002d
                r13.nextNull()
                goto L_0x0017
            L_0x002d:
                r1 = -1
                int r2 = r0.hashCode()
                r3 = 0
                r11 = 1
                switch(r2) {
                    case 3365: goto L_0x0074;
                    case 110414: goto L_0x006a;
                    case 96667762: goto L_0x0060;
                    case 102738951: goto L_0x0056;
                    case 853620774: goto L_0x004c;
                    case 1325825669: goto L_0x0042;
                    case 1901043637: goto L_0x0038;
                    default: goto L_0x0037;
                }
            L_0x0037:
                goto L_0x007d
            L_0x0038:
                java.lang.String r2 = "location"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x007d
                r1 = 0
                goto L_0x007d
            L_0x0042:
                java.lang.String r2 = "bearings"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x007d
                r1 = 1
                goto L_0x007d
            L_0x004c:
                java.lang.String r2 = "classes"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x007d
                r1 = 2
                goto L_0x007d
            L_0x0056:
                java.lang.String r2 = "lanes"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x007d
                r1 = 6
                goto L_0x007d
            L_0x0060:
                java.lang.String r2 = "entry"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x007d
                r1 = 3
                goto L_0x007d
            L_0x006a:
                java.lang.String r2 = "out"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x007d
                r1 = 5
                goto L_0x007d
            L_0x0074:
                java.lang.String r2 = "in"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x007d
                r1 = 4
            L_0x007d:
                switch(r1) {
                    case 0: goto L_0x0136;
                    case 1: goto L_0x0115;
                    case 2: goto L_0x00f4;
                    case 3: goto L_0x00d3;
                    case 4: goto L_0x00bc;
                    case 5: goto L_0x00a5;
                    case 6: goto L_0x0084;
                    default: goto L_0x0080;
                }
            L_0x0080:
                r13.skipValue()
                goto L_0x0017
            L_0x0084:
                com.google.gson.TypeAdapter<java.util.List<com.mapbox.api.directions.v5.a.ao>> r0 = r12.f26174f
                if (r0 != 0) goto L_0x009c
                com.google.gson.Gson r0 = r12.g
                java.lang.Class<java.util.List> r1 = java.util.List.class
                java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r11]
                java.lang.Class<com.mapbox.api.directions.v5.a.ao> r10 = com.mapbox.api.directions.v5.a.ao.class
                r2[r3] = r10
                com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.getParameterized(r1, r2)
                com.google.gson.TypeAdapter r0 = r0.getAdapter((com.google.gson.reflect.TypeToken<T>) r1)
                r12.f26174f = r0
            L_0x009c:
                java.lang.Object r0 = r0.read(r13)
                r10 = r0
                java.util.List r10 = (java.util.List) r10
                goto L_0x0017
            L_0x00a5:
                com.google.gson.TypeAdapter<java.lang.Integer> r0 = r12.f26173e
                if (r0 != 0) goto L_0x00b3
                com.google.gson.Gson r0 = r12.g
                java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r12.f26173e = r0
            L_0x00b3:
                java.lang.Object r0 = r0.read(r13)
                r9 = r0
                java.lang.Integer r9 = (java.lang.Integer) r9
                goto L_0x0017
            L_0x00bc:
                com.google.gson.TypeAdapter<java.lang.Integer> r0 = r12.f26173e
                if (r0 != 0) goto L_0x00ca
                com.google.gson.Gson r0 = r12.g
                java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r12.f26173e = r0
            L_0x00ca:
                java.lang.Object r0 = r0.read(r13)
                r8 = r0
                java.lang.Integer r8 = (java.lang.Integer) r8
                goto L_0x0017
            L_0x00d3:
                com.google.gson.TypeAdapter<java.util.List<java.lang.Boolean>> r0 = r12.f26172d
                if (r0 != 0) goto L_0x00eb
                com.google.gson.Gson r0 = r12.g
                java.lang.Class<java.util.List> r1 = java.util.List.class
                java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r11]
                java.lang.Class<java.lang.Boolean> r7 = java.lang.Boolean.class
                r2[r3] = r7
                com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.getParameterized(r1, r2)
                com.google.gson.TypeAdapter r0 = r0.getAdapter((com.google.gson.reflect.TypeToken<T>) r1)
                r12.f26172d = r0
            L_0x00eb:
                java.lang.Object r0 = r0.read(r13)
                r7 = r0
                java.util.List r7 = (java.util.List) r7
                goto L_0x0017
            L_0x00f4:
                com.google.gson.TypeAdapter<java.util.List<java.lang.String>> r0 = r12.f26171c
                if (r0 != 0) goto L_0x010c
                com.google.gson.Gson r0 = r12.g
                java.lang.Class<java.util.List> r1 = java.util.List.class
                java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r11]
                java.lang.Class<java.lang.String> r6 = java.lang.String.class
                r2[r3] = r6
                com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.getParameterized(r1, r2)
                com.google.gson.TypeAdapter r0 = r0.getAdapter((com.google.gson.reflect.TypeToken<T>) r1)
                r12.f26171c = r0
            L_0x010c:
                java.lang.Object r0 = r0.read(r13)
                r6 = r0
                java.util.List r6 = (java.util.List) r6
                goto L_0x0017
            L_0x0115:
                com.google.gson.TypeAdapter<java.util.List<java.lang.Integer>> r0 = r12.f26170b
                if (r0 != 0) goto L_0x012d
                com.google.gson.Gson r0 = r12.g
                java.lang.Class<java.util.List> r1 = java.util.List.class
                java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r11]
                java.lang.Class<java.lang.Integer> r5 = java.lang.Integer.class
                r2[r3] = r5
                com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.getParameterized(r1, r2)
                com.google.gson.TypeAdapter r0 = r0.getAdapter((com.google.gson.reflect.TypeToken<T>) r1)
                r12.f26170b = r0
            L_0x012d:
                java.lang.Object r0 = r0.read(r13)
                r5 = r0
                java.util.List r5 = (java.util.List) r5
                goto L_0x0017
            L_0x0136:
                com.google.gson.TypeAdapter<double[]> r0 = r12.f26169a
                if (r0 != 0) goto L_0x0144
                com.google.gson.Gson r0 = r12.g
                java.lang.Class<double[]> r1 = double[].class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r12.f26169a = r0
            L_0x0144:
                java.lang.Object r0 = r0.read(r13)
                r4 = r0
                double[] r4 = (double[]) r4
                goto L_0x0017
            L_0x014d:
                r13.endObject()
                com.mapbox.api.directions.v5.a.ad r13 = new com.mapbox.api.directions.v5.a.ad
                r3 = r13
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.api.directions.v5.a.ad.a.read(com.google.gson.stream.JsonReader):java.lang.Object");
        }

        public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
            au auVar = (au) obj;
            if (auVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("location");
            if (auVar.a() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<double[]> typeAdapter = this.f26169a;
                if (typeAdapter == null) {
                    typeAdapter = this.g.getAdapter(double[].class);
                    this.f26169a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, auVar.a());
            }
            jsonWriter.name("bearings");
            if (auVar.bearings() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Integer>> typeAdapter2 = this.f26170b;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.g.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                    this.f26170b = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, auVar.bearings());
            }
            jsonWriter.name("classes");
            if (auVar.classes() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<String>> typeAdapter3 = this.f26171c;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.g.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.f26171c = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, auVar.classes());
            }
            jsonWriter.name("entry");
            if (auVar.entry() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Boolean>> typeAdapter4 = this.f26172d;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.g.getAdapter(TypeToken.getParameterized(List.class, Boolean.class));
                    this.f26172d = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, auVar.entry());
            }
            jsonWriter.name("in");
            if (auVar.in() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter5 = this.f26173e;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.g.getAdapter(Integer.class);
                    this.f26173e = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, auVar.in());
            }
            jsonWriter.name("out");
            if (auVar.out() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter6 = this.f26173e;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.g.getAdapter(Integer.class);
                    this.f26173e = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, auVar.out());
            }
            jsonWriter.name("lanes");
            if (auVar.lanes() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<ao>> typeAdapter7 = this.f26174f;
                if (typeAdapter7 == null) {
                    typeAdapter7 = this.g.getAdapter(TypeToken.getParameterized(List.class, ao.class));
                    this.f26174f = typeAdapter7;
                }
                typeAdapter7.write(jsonWriter, auVar.lanes());
            }
            jsonWriter.endObject();
        }
    }

    ad(double[] dArr, @Nullable List<Integer> list, @Nullable List<String> list2, @Nullable List<Boolean> list3, @Nullable Integer num, @Nullable Integer num2, @Nullable List<ao> list4) {
        super(dArr, list, list2, list3, num, num2, list4);
    }
}
