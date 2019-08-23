package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;

public final class x extends h {

    public static final class a extends TypeAdapter<ao> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<Boolean> f26277a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<List<String>> f26278b;

        /* renamed from: c  reason: collision with root package name */
        private final Gson f26279c;

        public a(Gson gson) {
            this.f26279c = gson;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Boolean} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object read(com.google.gson.stream.JsonReader r9) throws java.io.IOException {
            /*
                r8 = this;
                com.google.gson.stream.JsonToken r0 = r9.peek()
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                r2 = 0
                if (r0 != r1) goto L_0x000d
                r9.nextNull()
                return r2
            L_0x000d:
                r9.beginObject()
                r0 = r2
            L_0x0011:
                boolean r1 = r9.hasNext()
                if (r1 == 0) goto L_0x0088
                java.lang.String r1 = r9.nextName()
                com.google.gson.stream.JsonToken r3 = r9.peek()
                com.google.gson.stream.JsonToken r4 = com.google.gson.stream.JsonToken.NULL
                if (r3 != r4) goto L_0x0027
                r9.nextNull()
                goto L_0x0011
            L_0x0027:
                r3 = -1
                int r4 = r1.hashCode()
                r5 = -1332363625(0xffffffffb095be97, float:-1.0895346E-9)
                r6 = 0
                r7 = 1
                if (r4 == r5) goto L_0x0043
                r5 = 111972348(0x6ac8ffc, float:6.4910775E-35)
                if (r4 == r5) goto L_0x0039
                goto L_0x004c
            L_0x0039:
                java.lang.String r4 = "valid"
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L_0x004c
                r3 = 0
                goto L_0x004c
            L_0x0043:
                java.lang.String r4 = "indications"
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L_0x004c
                r3 = 1
            L_0x004c:
                switch(r3) {
                    case 0: goto L_0x0072;
                    case 1: goto L_0x0053;
                    default: goto L_0x004f;
                }
            L_0x004f:
                r9.skipValue()
                goto L_0x0011
            L_0x0053:
                com.google.gson.TypeAdapter<java.util.List<java.lang.String>> r0 = r8.f26278b
                if (r0 != 0) goto L_0x006b
                com.google.gson.Gson r0 = r8.f26279c
                java.lang.Class<java.util.List> r1 = java.util.List.class
                java.lang.reflect.Type[] r3 = new java.lang.reflect.Type[r7]
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                r3[r6] = r4
                com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.getParameterized(r1, r3)
                com.google.gson.TypeAdapter r0 = r0.getAdapter((com.google.gson.reflect.TypeToken<T>) r1)
                r8.f26278b = r0
            L_0x006b:
                java.lang.Object r0 = r0.read(r9)
                java.util.List r0 = (java.util.List) r0
                goto L_0x0011
            L_0x0072:
                com.google.gson.TypeAdapter<java.lang.Boolean> r1 = r8.f26277a
                if (r1 != 0) goto L_0x0080
                com.google.gson.Gson r1 = r8.f26279c
                java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
                com.google.gson.TypeAdapter r1 = r1.getAdapter((java.lang.Class<T>) r2)
                r8.f26277a = r1
            L_0x0080:
                java.lang.Object r1 = r1.read(r9)
                r2 = r1
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                goto L_0x0011
            L_0x0088:
                r9.endObject()
                com.mapbox.api.directions.v5.a.x r9 = new com.mapbox.api.directions.v5.a.x
                r9.<init>(r2, r0)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.api.directions.v5.a.x.a.read(com.google.gson.stream.JsonReader):java.lang.Object");
        }

        public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
            ao aoVar = (ao) obj;
            if (aoVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("valid");
            if (aoVar.valid() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter = this.f26277a;
                if (typeAdapter == null) {
                    typeAdapter = this.f26279c.getAdapter(Boolean.class);
                    this.f26277a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, aoVar.valid());
            }
            jsonWriter.name("indications");
            if (aoVar.indications() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<String>> typeAdapter2 = this.f26278b;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f26279c.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.f26278b = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, aoVar.indications());
            }
            jsonWriter.endObject();
        }
    }

    x(@Nullable Boolean bool, @Nullable List<String> list) {
        super(bool, list);
    }
}
