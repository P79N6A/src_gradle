package com.mapbox.api.optimization.v1.models;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public final class d extends b {

    public static final class a extends TypeAdapter<f> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<Integer> f26375a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<String> f26376b;

        /* renamed from: c  reason: collision with root package name */
        private volatile TypeAdapter<double[]> f26377c;

        /* renamed from: d  reason: collision with root package name */
        private final Gson f26378d;

        public a(Gson gson) {
            this.f26378d = gson;
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0075  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x008a  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00a0  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00ba  */
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
                r3 = r2
                r4 = r3
                r1 = 0
                r2 = 0
            L_0x0015:
                boolean r5 = r10.hasNext()
                if (r5 == 0) goto L_0x00d4
                java.lang.String r5 = r10.nextName()
                com.google.gson.stream.JsonToken r6 = r10.peek()
                com.google.gson.stream.JsonToken r7 = com.google.gson.stream.JsonToken.NULL
                if (r6 != r7) goto L_0x002b
                r10.nextNull()
                goto L_0x0015
            L_0x002b:
                r6 = -1
                int r7 = r5.hashCode()
                r8 = -294735295(0xffffffffee6eb241, float:-1.8468232E28)
                if (r7 == r8) goto L_0x0063
                r8 = 3373707(0x337a8b, float:4.72757E-39)
                if (r7 == r8) goto L_0x0059
                r8 = 601411348(0x23d8cf14, float:2.3506468E-17)
                if (r7 == r8) goto L_0x004f
                r8 = 1901043637(0x714f9fb5, float:1.0281035E30)
                if (r7 == r8) goto L_0x0045
                goto L_0x006d
            L_0x0045:
                java.lang.String r7 = "location"
                boolean r5 = r5.equals(r7)
                if (r5 == 0) goto L_0x006d
                r5 = 3
                goto L_0x006e
            L_0x004f:
                java.lang.String r7 = "waypoint_index"
                boolean r5 = r5.equals(r7)
                if (r5 == 0) goto L_0x006d
                r5 = 0
                goto L_0x006e
            L_0x0059:
                java.lang.String r7 = "name"
                boolean r5 = r5.equals(r7)
                if (r5 == 0) goto L_0x006d
                r5 = 2
                goto L_0x006e
            L_0x0063:
                java.lang.String r7 = "trips_index"
                boolean r5 = r5.equals(r7)
                if (r5 == 0) goto L_0x006d
                r5 = 1
                goto L_0x006e
            L_0x006d:
                r5 = -1
            L_0x006e:
                switch(r5) {
                    case 0: goto L_0x00ba;
                    case 1: goto L_0x00a0;
                    case 2: goto L_0x008a;
                    case 3: goto L_0x0075;
                    default: goto L_0x0071;
                }
            L_0x0071:
                r10.skipValue()
                goto L_0x0015
            L_0x0075:
                com.google.gson.TypeAdapter<double[]> r4 = r9.f26377c
                if (r4 != 0) goto L_0x0083
                com.google.gson.Gson r4 = r9.f26378d
                java.lang.Class<double[]> r5 = double[].class
                com.google.gson.TypeAdapter r4 = r4.getAdapter((java.lang.Class<T>) r5)
                r9.f26377c = r4
            L_0x0083:
                java.lang.Object r4 = r4.read(r10)
                double[] r4 = (double[]) r4
                goto L_0x0015
            L_0x008a:
                com.google.gson.TypeAdapter<java.lang.String> r3 = r9.f26376b
                if (r3 != 0) goto L_0x0098
                com.google.gson.Gson r3 = r9.f26378d
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                com.google.gson.TypeAdapter r3 = r3.getAdapter((java.lang.Class<T>) r5)
                r9.f26376b = r3
            L_0x0098:
                java.lang.Object r3 = r3.read(r10)
                java.lang.String r3 = (java.lang.String) r3
                goto L_0x0015
            L_0x00a0:
                com.google.gson.TypeAdapter<java.lang.Integer> r2 = r9.f26375a
                if (r2 != 0) goto L_0x00ae
                com.google.gson.Gson r2 = r9.f26378d
                java.lang.Class<java.lang.Integer> r5 = java.lang.Integer.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r5)
                r9.f26375a = r2
            L_0x00ae:
                java.lang.Object r2 = r2.read(r10)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                goto L_0x0015
            L_0x00ba:
                com.google.gson.TypeAdapter<java.lang.Integer> r1 = r9.f26375a
                if (r1 != 0) goto L_0x00c8
                com.google.gson.Gson r1 = r9.f26378d
                java.lang.Class<java.lang.Integer> r5 = java.lang.Integer.class
                com.google.gson.TypeAdapter r1 = r1.getAdapter((java.lang.Class<T>) r5)
                r9.f26375a = r1
            L_0x00c8:
                java.lang.Object r1 = r1.read(r10)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                goto L_0x0015
            L_0x00d4:
                r10.endObject()
                com.mapbox.api.optimization.v1.models.d r10 = new com.mapbox.api.optimization.v1.models.d
                r10.<init>(r1, r2, r3, r4)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.api.optimization.v1.models.d.a.read(com.google.gson.stream.JsonReader):java.lang.Object");
        }

        public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
            f fVar = (f) obj;
            if (fVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("waypoint_index");
            TypeAdapter<Integer> typeAdapter = this.f26375a;
            if (typeAdapter == null) {
                typeAdapter = this.f26378d.getAdapter(Integer.class);
                this.f26375a = typeAdapter;
            }
            typeAdapter.write(jsonWriter, Integer.valueOf(fVar.waypointIndex()));
            jsonWriter.name("trips_index");
            TypeAdapter<Integer> typeAdapter2 = this.f26375a;
            if (typeAdapter2 == null) {
                typeAdapter2 = this.f26378d.getAdapter(Integer.class);
                this.f26375a = typeAdapter2;
            }
            typeAdapter2.write(jsonWriter, Integer.valueOf(fVar.tripsIndex()));
            jsonWriter.name("name");
            if (fVar.name() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.f26376b;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f26378d.getAdapter(String.class);
                    this.f26376b = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, fVar.name());
            }
            jsonWriter.name("location");
            if (fVar.a() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<double[]> typeAdapter4 = this.f26377c;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.f26378d.getAdapter(double[].class);
                    this.f26377c = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, fVar.a());
            }
            jsonWriter.endObject();
        }
    }

    d(int i, int i2, @Nullable String str, @Nullable double[] dArr) {
        super(i, i2, str, dArr);
    }
}
