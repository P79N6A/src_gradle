package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;

public final class s extends c {

    public static final class a extends TypeAdapter<ai> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<String> f26259a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<List<ag>> f26260b;

        /* renamed from: c  reason: collision with root package name */
        private volatile TypeAdapter<Double> f26261c;

        /* renamed from: d  reason: collision with root package name */
        private final Gson f26262d;

        public a(Gson gson) {
            this.f26262d = gson;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.Double} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object read(com.google.gson.stream.JsonReader r12) throws java.io.IOException {
            /*
                r11 = this;
                com.google.gson.stream.JsonToken r0 = r12.peek()
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                r2 = 0
                if (r0 != r1) goto L_0x000d
                r12.nextNull()
                return r2
            L_0x000d:
                r12.beginObject()
                r4 = r2
                r5 = r4
                r6 = r5
                r7 = r6
                r8 = r7
                r9 = r8
            L_0x0016:
                boolean r0 = r12.hasNext()
                if (r0 == 0) goto L_0x010c
                java.lang.String r0 = r12.nextName()
                com.google.gson.stream.JsonToken r1 = r12.peek()
                com.google.gson.stream.JsonToken r2 = com.google.gson.stream.JsonToken.NULL
                if (r1 != r2) goto L_0x002c
                r12.nextNull()
                goto L_0x0016
            L_0x002c:
                r1 = -1
                int r2 = r0.hashCode()
                r3 = 0
                r10 = 1
                switch(r2) {
                    case -615513385: goto L_0x0069;
                    case -463249713: goto L_0x005f;
                    case -447446250: goto L_0x0055;
                    case 3556653: goto L_0x004b;
                    case 3575610: goto L_0x0041;
                    case 1546218279: goto L_0x0037;
                    default: goto L_0x0036;
                }
            L_0x0036:
                goto L_0x0072
            L_0x0037:
                java.lang.String r2 = "degrees"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0072
                r1 = 4
                goto L_0x0072
            L_0x0041:
                java.lang.String r2 = "type"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0072
                r1 = 2
                goto L_0x0072
            L_0x004b:
                java.lang.String r2 = "text"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0072
                r1 = 0
                goto L_0x0072
            L_0x0055:
                java.lang.String r2 = "components"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0072
                r1 = 1
                goto L_0x0072
            L_0x005f:
                java.lang.String r2 = "driving_side"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0072
                r1 = 5
                goto L_0x0072
            L_0x0069:
                java.lang.String r2 = "modifier"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0072
                r1 = 3
            L_0x0072:
                switch(r1) {
                    case 0: goto L_0x00f5;
                    case 1: goto L_0x00d4;
                    case 2: goto L_0x00bd;
                    case 3: goto L_0x00a6;
                    case 4: goto L_0x008f;
                    case 5: goto L_0x0079;
                    default: goto L_0x0075;
                }
            L_0x0075:
                r12.skipValue()
                goto L_0x0016
            L_0x0079:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r11.f26259a
                if (r0 != 0) goto L_0x0087
                com.google.gson.Gson r0 = r11.f26262d
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r11.f26259a = r0
            L_0x0087:
                java.lang.Object r0 = r0.read(r12)
                r9 = r0
                java.lang.String r9 = (java.lang.String) r9
                goto L_0x0016
            L_0x008f:
                com.google.gson.TypeAdapter<java.lang.Double> r0 = r11.f26261c
                if (r0 != 0) goto L_0x009d
                com.google.gson.Gson r0 = r11.f26262d
                java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r11.f26261c = r0
            L_0x009d:
                java.lang.Object r0 = r0.read(r12)
                r8 = r0
                java.lang.Double r8 = (java.lang.Double) r8
                goto L_0x0016
            L_0x00a6:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r11.f26259a
                if (r0 != 0) goto L_0x00b4
                com.google.gson.Gson r0 = r11.f26262d
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r11.f26259a = r0
            L_0x00b4:
                java.lang.Object r0 = r0.read(r12)
                r7 = r0
                java.lang.String r7 = (java.lang.String) r7
                goto L_0x0016
            L_0x00bd:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r11.f26259a
                if (r0 != 0) goto L_0x00cb
                com.google.gson.Gson r0 = r11.f26262d
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r11.f26259a = r0
            L_0x00cb:
                java.lang.Object r0 = r0.read(r12)
                r6 = r0
                java.lang.String r6 = (java.lang.String) r6
                goto L_0x0016
            L_0x00d4:
                com.google.gson.TypeAdapter<java.util.List<com.mapbox.api.directions.v5.a.ag>> r0 = r11.f26260b
                if (r0 != 0) goto L_0x00ec
                com.google.gson.Gson r0 = r11.f26262d
                java.lang.Class<java.util.List> r1 = java.util.List.class
                java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r10]
                java.lang.Class<com.mapbox.api.directions.v5.a.ag> r5 = com.mapbox.api.directions.v5.a.ag.class
                r2[r3] = r5
                com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.getParameterized(r1, r2)
                com.google.gson.TypeAdapter r0 = r0.getAdapter((com.google.gson.reflect.TypeToken<T>) r1)
                r11.f26260b = r0
            L_0x00ec:
                java.lang.Object r0 = r0.read(r12)
                r5 = r0
                java.util.List r5 = (java.util.List) r5
                goto L_0x0016
            L_0x00f5:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r11.f26259a
                if (r0 != 0) goto L_0x0103
                com.google.gson.Gson r0 = r11.f26262d
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r11.f26259a = r0
            L_0x0103:
                java.lang.Object r0 = r0.read(r12)
                r4 = r0
                java.lang.String r4 = (java.lang.String) r4
                goto L_0x0016
            L_0x010c:
                r12.endObject()
                com.mapbox.api.directions.v5.a.s r12 = new com.mapbox.api.directions.v5.a.s
                r3 = r12
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.api.directions.v5.a.s.a.read(com.google.gson.stream.JsonReader):java.lang.Object");
        }

        public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
            ai aiVar = (ai) obj;
            if (aiVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("text");
            if (aiVar.text() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.f26259a;
                if (typeAdapter == null) {
                    typeAdapter = this.f26262d.getAdapter(String.class);
                    this.f26259a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, aiVar.text());
            }
            jsonWriter.name("components");
            if (aiVar.components() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<ag>> typeAdapter2 = this.f26260b;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f26262d.getAdapter(TypeToken.getParameterized(List.class, ag.class));
                    this.f26260b = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, aiVar.components());
            }
            jsonWriter.name("type");
            if (aiVar.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.f26259a;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f26262d.getAdapter(String.class);
                    this.f26259a = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, aiVar.type());
            }
            jsonWriter.name("modifier");
            if (aiVar.modifier() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter4 = this.f26259a;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.f26262d.getAdapter(String.class);
                    this.f26259a = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, aiVar.modifier());
            }
            jsonWriter.name("degrees");
            if (aiVar.degrees() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter5 = this.f26261c;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.f26262d.getAdapter(Double.class);
                    this.f26261c = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, aiVar.degrees());
            }
            jsonWriter.name("driving_side");
            if (aiVar.drivingSide() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter6 = this.f26259a;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.f26262d.getAdapter(String.class);
                    this.f26259a = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, aiVar.drivingSide());
            }
            jsonWriter.endObject();
        }
    }

    s(@Nullable String str, @Nullable List<ag> list, @Nullable String str2, @Nullable String str3, @Nullable Double d2, @Nullable String str4) {
        super(str, list, str2, str3, d2, str4);
    }
}
