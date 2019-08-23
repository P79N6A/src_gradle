package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public final class ae extends o {

    public static final class a extends TypeAdapter<av> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<double[]> f26175a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<Double> f26176b;

        /* renamed from: c  reason: collision with root package name */
        private volatile TypeAdapter<String> f26177c;

        /* renamed from: d  reason: collision with root package name */
        private volatile TypeAdapter<Integer> f26178d;

        /* renamed from: e  reason: collision with root package name */
        private final Gson f26179e;

        public a(Gson gson) {
            this.f26179e = gson;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: double[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Double} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Double} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Integer} */
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
                r10 = r9
            L_0x0017:
                boolean r0 = r12.hasNext()
                if (r0 == 0) goto L_0x0123
                java.lang.String r0 = r12.nextName()
                com.google.gson.stream.JsonToken r1 = r12.peek()
                com.google.gson.stream.JsonToken r2 = com.google.gson.stream.JsonToken.NULL
                if (r1 != r2) goto L_0x002d
                r12.nextNull()
                goto L_0x0017
            L_0x002d:
                r1 = -1
                int r2 = r0.hashCode()
                switch(r2) {
                    case -901094096: goto L_0x0072;
                    case -615513385: goto L_0x0068;
                    case -307042805: goto L_0x005e;
                    case 3127582: goto L_0x0054;
                    case 3575610: goto L_0x004a;
                    case 301526158: goto L_0x0040;
                    case 1901043637: goto L_0x0036;
                    default: goto L_0x0035;
                }
            L_0x0035:
                goto L_0x007b
            L_0x0036:
                java.lang.String r2 = "location"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x007b
                r1 = 0
                goto L_0x007b
            L_0x0040:
                java.lang.String r2 = "instruction"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x007b
                r1 = 3
                goto L_0x007b
            L_0x004a:
                java.lang.String r2 = "type"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x007b
                r1 = 4
                goto L_0x007b
            L_0x0054:
                java.lang.String r2 = "exit"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x007b
                r1 = 6
                goto L_0x007b
            L_0x005e:
                java.lang.String r2 = "bearing_after"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x007b
                r1 = 2
                goto L_0x007b
            L_0x0068:
                java.lang.String r2 = "modifier"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x007b
                r1 = 5
                goto L_0x007b
            L_0x0072:
                java.lang.String r2 = "bearing_before"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x007b
                r1 = 1
            L_0x007b:
                switch(r1) {
                    case 0: goto L_0x010c;
                    case 1: goto L_0x00f5;
                    case 2: goto L_0x00de;
                    case 3: goto L_0x00c7;
                    case 4: goto L_0x00b0;
                    case 5: goto L_0x0099;
                    case 6: goto L_0x0082;
                    default: goto L_0x007e;
                }
            L_0x007e:
                r12.skipValue()
                goto L_0x0017
            L_0x0082:
                com.google.gson.TypeAdapter<java.lang.Integer> r0 = r11.f26178d
                if (r0 != 0) goto L_0x0090
                com.google.gson.Gson r0 = r11.f26179e
                java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r11.f26178d = r0
            L_0x0090:
                java.lang.Object r0 = r0.read(r12)
                r10 = r0
                java.lang.Integer r10 = (java.lang.Integer) r10
                goto L_0x0017
            L_0x0099:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r11.f26177c
                if (r0 != 0) goto L_0x00a7
                com.google.gson.Gson r0 = r11.f26179e
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r11.f26177c = r0
            L_0x00a7:
                java.lang.Object r0 = r0.read(r12)
                r9 = r0
                java.lang.String r9 = (java.lang.String) r9
                goto L_0x0017
            L_0x00b0:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r11.f26177c
                if (r0 != 0) goto L_0x00be
                com.google.gson.Gson r0 = r11.f26179e
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r11.f26177c = r0
            L_0x00be:
                java.lang.Object r0 = r0.read(r12)
                r8 = r0
                java.lang.String r8 = (java.lang.String) r8
                goto L_0x0017
            L_0x00c7:
                com.google.gson.TypeAdapter<java.lang.String> r0 = r11.f26177c
                if (r0 != 0) goto L_0x00d5
                com.google.gson.Gson r0 = r11.f26179e
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r11.f26177c = r0
            L_0x00d5:
                java.lang.Object r0 = r0.read(r12)
                r7 = r0
                java.lang.String r7 = (java.lang.String) r7
                goto L_0x0017
            L_0x00de:
                com.google.gson.TypeAdapter<java.lang.Double> r0 = r11.f26176b
                if (r0 != 0) goto L_0x00ec
                com.google.gson.Gson r0 = r11.f26179e
                java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r11.f26176b = r0
            L_0x00ec:
                java.lang.Object r0 = r0.read(r12)
                r6 = r0
                java.lang.Double r6 = (java.lang.Double) r6
                goto L_0x0017
            L_0x00f5:
                com.google.gson.TypeAdapter<java.lang.Double> r0 = r11.f26176b
                if (r0 != 0) goto L_0x0103
                com.google.gson.Gson r0 = r11.f26179e
                java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r11.f26176b = r0
            L_0x0103:
                java.lang.Object r0 = r0.read(r12)
                r5 = r0
                java.lang.Double r5 = (java.lang.Double) r5
                goto L_0x0017
            L_0x010c:
                com.google.gson.TypeAdapter<double[]> r0 = r11.f26175a
                if (r0 != 0) goto L_0x011a
                com.google.gson.Gson r0 = r11.f26179e
                java.lang.Class<double[]> r1 = double[].class
                com.google.gson.TypeAdapter r0 = r0.getAdapter((java.lang.Class<T>) r1)
                r11.f26175a = r0
            L_0x011a:
                java.lang.Object r0 = r0.read(r12)
                r4 = r0
                double[] r4 = (double[]) r4
                goto L_0x0017
            L_0x0123:
                r12.endObject()
                com.mapbox.api.directions.v5.a.ae r12 = new com.mapbox.api.directions.v5.a.ae
                r3 = r12
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.api.directions.v5.a.ae.a.read(com.google.gson.stream.JsonReader):java.lang.Object");
        }

        public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
            av avVar = (av) obj;
            if (avVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("location");
            if (avVar.a() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<double[]> typeAdapter = this.f26175a;
                if (typeAdapter == null) {
                    typeAdapter = this.f26179e.getAdapter(double[].class);
                    this.f26175a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, avVar.a());
            }
            jsonWriter.name("bearing_before");
            if (avVar.bearingBefore() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter2 = this.f26176b;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f26179e.getAdapter(Double.class);
                    this.f26176b = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, avVar.bearingBefore());
            }
            jsonWriter.name("bearing_after");
            if (avVar.bearingAfter() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> typeAdapter3 = this.f26176b;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f26179e.getAdapter(Double.class);
                    this.f26176b = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, avVar.bearingAfter());
            }
            jsonWriter.name("instruction");
            if (avVar.instruction() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter4 = this.f26177c;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.f26179e.getAdapter(String.class);
                    this.f26177c = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, avVar.instruction());
            }
            jsonWriter.name("type");
            if (avVar.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter5 = this.f26177c;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.f26179e.getAdapter(String.class);
                    this.f26177c = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, avVar.type());
            }
            jsonWriter.name("modifier");
            if (avVar.modifier() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter6 = this.f26177c;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.f26179e.getAdapter(String.class);
                    this.f26177c = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, avVar.modifier());
            }
            jsonWriter.name("exit");
            if (avVar.exit() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter7 = this.f26178d;
                if (typeAdapter7 == null) {
                    typeAdapter7 = this.f26179e.getAdapter(Integer.class);
                    this.f26178d = typeAdapter7;
                }
                typeAdapter7.write(jsonWriter, avVar.exit());
            }
            jsonWriter.endObject();
        }
    }

    ae(double[] dArr, @Nullable Double d2, @Nullable Double d3, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num) {
        super(dArr, d2, d3, str, str2, str3, num);
    }
}
