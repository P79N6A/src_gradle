package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;

public final class q extends a {

    public static final class a extends TypeAdapter<ag> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<String> f26251a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<Integer> f26252b;

        /* renamed from: c  reason: collision with root package name */
        private volatile TypeAdapter<List<String>> f26253c;

        /* renamed from: d  reason: collision with root package name */
        private volatile TypeAdapter<Boolean> f26254d;

        /* renamed from: e  reason: collision with root package name */
        private final Gson f26255e;

        public a(Gson gson) {
            this.f26255e = gson;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Integer} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Boolean} */
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
                if (r0 == 0) goto L_0x012f
                java.lang.String r0 = r13.nextName()
                com.google.gson.stream.JsonToken r1 = r13.peek()
                com.google.gson.stream.JsonToken r2 = com.google.gson.stream.JsonToken.NULL
                if (r1 != r2) goto L_0x002d
                r13.nextNull()
                goto L_0x0017
            L_0x002d:
                r1 = -1
                int r2 = r0.hashCode()
                r3 = 1
                r11 = 0
                switch(r2) {
                    case -1422950650: goto L_0x0074;
                    case -640336398: goto L_0x006a;
                    case 2987057: goto L_0x0060;
                    case 3556653: goto L_0x0056;
                    case 3575610: goto L_0x004c;
                    case 224454868: goto L_0x0042;
                    case 265635587: goto L_0x0038;
                    default: goto L_0x0037;
                }
            L_0x0037:
                goto L_0x007d
            L_0x0038:
                java.lang.String r2 = "imageBaseURL"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x007d
                r1 = 4
                goto L_0x007d
            L_0x0042:
                java.lang.String r2 = "directions"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x007d
                r1 = 5
                goto L_0x007d
            L_0x004c:
                java.lang.String r2 = "type"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x007d
                r1 = 1
                goto L_0x007d
            L_0x0056:
                java.lang.String r2 = "text"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x007d
                r1 = 0
                goto L_0x007d
            L_0x0060:
                java.lang.String r2 = "abbr"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x007d
                r1 = 2
                goto L_0x007d
            L_0x006a:
                java.lang.String r2 = "abbr_priority"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x007d
                r1 = 3
                goto L_0x007d
            L_0x0074:
                java.lang.String r2 = "active"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x007d
                r1 = 6
            L_0x007d:
                switch(r1) {
                    case 0: goto L_0x0118;
                    case 1: goto L_0x0101;
                    case 2: goto L_0x00ea;
                    case 3: goto L_0x00d3;
                    case 4: goto L_0x00bc;
                    case 5: goto L_0x009b;
                    case 6: goto L_0x0084;
                    default: goto L_0x0080;
                }
            L_0x0080:
                r13.skipValue()
                goto L_0x0017
            L_0x0084:
                com.google.gson.TypeAdapter<java.lang.Boolean> r0 = r12.f26254d
                if (r0 != 0) goto L_0x0092
                com.google.gson.Gson r0 = r12.f26255e
                java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r12.f26254d = r0
            L_0x0092:
                java.lang.Object r0 = r0.read(r13)
                r10 = r0
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                goto L_0x0017
            L_0x009b:
                com.google.gson.TypeAdapter<java.util.List<java.lang.String>> r0 = r12.f26253c
                if (r0 != 0) goto L_0x00b3
                com.google.gson.Gson r0 = r12.f26255e
                java.lang.Class<java.util.List> r1 = java.util.List.class
                java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r3]
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                r2[r11] = r3
                com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.getParameterized(r1, r2)
                com.google.gson.TypeAdapter r0 = r0.getAdapter((com.google.gson.reflect.TypeToken<T>) r1)
                r12.f26253c = r0
            L_0x00b3:
                java.lang.Object r0 = r0.read(r13)
                r9 = r0
                java.util.List r9 = (java.util.List) r9
                goto L_0x0017
            L_0x00bc:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r12.f26251a
                if (r0 != 0) goto L_0x00ca
                com.google.gson.Gson r0 = r12.f26255e
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r12.f26251a = r0
            L_0x00ca:
                java.lang.Object r0 = r0.read(r13)
                r8 = r0
                java.lang.String r8 = (java.lang.String) r8
                goto L_0x0017
            L_0x00d3:
                com.google.gson.TypeAdapter<java.lang.Integer> r0 = r12.f26252b
                if (r0 != 0) goto L_0x00e1
                com.google.gson.Gson r0 = r12.f26255e
                java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r12.f26252b = r0
            L_0x00e1:
                java.lang.Object r0 = r0.read(r13)
                r7 = r0
                java.lang.Integer r7 = (java.lang.Integer) r7
                goto L_0x0017
            L_0x00ea:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r12.f26251a
                if (r0 != 0) goto L_0x00f8
                com.google.gson.Gson r0 = r12.f26255e
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r12.f26251a = r0
            L_0x00f8:
                java.lang.Object r0 = r0.read(r13)
                r6 = r0
                java.lang.String r6 = (java.lang.String) r6
                goto L_0x0017
            L_0x0101:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r12.f26251a
                if (r0 != 0) goto L_0x010f
                com.google.gson.Gson r0 = r12.f26255e
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r12.f26251a = r0
            L_0x010f:
                java.lang.Object r0 = r0.read(r13)
                r5 = r0
                java.lang.String r5 = (java.lang.String) r5
                goto L_0x0017
            L_0x0118:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r12.f26251a
                if (r0 != 0) goto L_0x0126
                com.google.gson.Gson r0 = r12.f26255e
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r12.f26251a = r0
            L_0x0126:
                java.lang.Object r0 = r0.read(r13)
                r4 = r0
                java.lang.String r4 = (java.lang.String) r4
                goto L_0x0017
            L_0x012f:
                r13.endObject()
                com.mapbox.api.directions.v5.a.q r13 = new com.mapbox.api.directions.v5.a.q
                r3 = r13
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.api.directions.v5.a.q.a.read(com.google.gson.stream.JsonReader):java.lang.Object");
        }

        public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
            ag agVar = (ag) obj;
            if (agVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("text");
            if (agVar.text() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.f26251a;
                if (typeAdapter == null) {
                    typeAdapter = this.f26255e.getAdapter(String.class);
                    this.f26251a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, agVar.text());
            }
            jsonWriter.name("type");
            if (agVar.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.f26251a;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f26255e.getAdapter(String.class);
                    this.f26251a = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, agVar.type());
            }
            jsonWriter.name("abbr");
            if (agVar.abbreviation() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.f26251a;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f26255e.getAdapter(String.class);
                    this.f26251a = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, agVar.abbreviation());
            }
            jsonWriter.name("abbr_priority");
            if (agVar.abbreviationPriority() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter4 = this.f26252b;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.f26255e.getAdapter(Integer.class);
                    this.f26252b = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, agVar.abbreviationPriority());
            }
            jsonWriter.name("imageBaseURL");
            if (agVar.imageBaseUrl() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter5 = this.f26251a;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.f26255e.getAdapter(String.class);
                    this.f26251a = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, agVar.imageBaseUrl());
            }
            jsonWriter.name("directions");
            if (agVar.directions() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<String>> typeAdapter6 = this.f26253c;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.f26255e.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.f26253c = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, agVar.directions());
            }
            jsonWriter.name("active");
            if (agVar.active() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter7 = this.f26254d;
                if (typeAdapter7 == null) {
                    typeAdapter7 = this.f26255e.getAdapter(Boolean.class);
                    this.f26254d = typeAdapter7;
                }
                typeAdapter7.write(jsonWriter, agVar.active());
            }
            jsonWriter.endObject();
        }
    }

    q(String str, String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable List<String> list, @Nullable Boolean bool) {
        super(str, str2, str3, num, str4, list, bool);
    }
}
