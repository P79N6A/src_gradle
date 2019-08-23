package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.Point;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import java.io.IOException;
import java.util.List;

public final class ac extends m {

    public static final class a extends TypeAdapter<at> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<String> f26165a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<List<Point>> f26166b;

        /* renamed from: c  reason: collision with root package name */
        private volatile TypeAdapter<Boolean> f26167c;

        /* renamed from: d  reason: collision with root package name */
        private final Gson f26168d;

        public a(Gson gson) {
            this.f26168d = gson;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v40, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v45, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v50, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.Boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v55, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v60, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v65, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: java.lang.Boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v70, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v75, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v80, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: java.lang.Boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v85, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: java.lang.Boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v90, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v95, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v100, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v105, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v110, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object read(com.google.gson.stream.JsonReader r30) throws java.io.IOException {
            /*
                r29 = this;
                r0 = r29
                r1 = r30
                com.google.gson.stream.JsonToken r2 = r30.peek()
                com.google.gson.stream.JsonToken r3 = com.google.gson.stream.JsonToken.NULL
                r4 = 0
                if (r2 != r3) goto L_0x0011
                r30.nextNull()
                return r4
            L_0x0011:
                r30.beginObject()
                r6 = r4
                r7 = r6
                r8 = r7
                r9 = r8
                r10 = r9
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
                r22 = r21
                r23 = r22
                r24 = r23
                r25 = r24
                r26 = r25
                r27 = r26
            L_0x0036:
                boolean r2 = r30.hasNext()
                if (r2 == 0) goto L_0x0366
                java.lang.String r2 = r30.nextName()
                com.google.gson.stream.JsonToken r3 = r30.peek()
                com.google.gson.stream.JsonToken r4 = com.google.gson.stream.JsonToken.NULL
                if (r3 != r4) goto L_0x004c
                r30.nextNull()
                goto L_0x0036
            L_0x004c:
                r3 = -1
                int r4 = r2.hashCode()
                r5 = 1
                r28 = 0
                switch(r4) {
                    case -2131714057: goto L_0x0144;
                    case -1805660570: goto L_0x013a;
                    case -1613589672: goto L_0x0130;
                    case -1524271779: goto L_0x0125;
                    case -1321148966: goto L_0x011a;
                    case -1069211754: goto L_0x010f;
                    case -1042689291: goto L_0x0104;
                    case -961709276: goto L_0x00f9;
                    case -487319823: goto L_0x00ee;
                    case -332625698: goto L_0x00e4;
                    case -309425751: goto L_0x00d9;
                    case -31089472: goto L_0x00ce;
                    case 3599307: goto L_0x00c3;
                    case 109761319: goto L_0x00b7;
                    case 122594497: goto L_0x00ab;
                    case 203916432: goto L_0x009f;
                    case 530115961: goto L_0x0093;
                    case 834525782: goto L_0x0087;
                    case 1150122730: goto L_0x007b;
                    case 1325825669: goto L_0x0070;
                    case 1871919611: goto L_0x0065;
                    case 1943123911: goto L_0x0059;
                    default: goto L_0x0057;
                }
            L_0x0057:
                goto L_0x014e
            L_0x0059:
                java.lang.String r4 = "waypointNames"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x014e
                r3 = 21
                goto L_0x014e
            L_0x0065:
                java.lang.String r4 = "coordinates"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x014e
                r3 = 3
                goto L_0x014e
            L_0x0070:
                java.lang.String r4 = "bearings"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x014e
                r3 = 7
                goto L_0x014e
            L_0x007b:
                java.lang.String r4 = "requestUuid"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x014e
                r3 = 19
                goto L_0x014e
            L_0x0087:
                java.lang.String r4 = "approaches"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x014e
                r3 = 20
                goto L_0x014e
            L_0x0093:
                java.lang.String r4 = "overview"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x014e
                r3 = 11
                goto L_0x014e
            L_0x009f:
                java.lang.String r4 = "geometries"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x014e
                r3 = 10
                goto L_0x014e
            L_0x00ab:
                java.lang.String r4 = "continueStraight"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x014e
                r3 = 8
                goto L_0x014e
            L_0x00b7:
                java.lang.String r4 = "steps"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x014e
                r3 = 12
                goto L_0x014e
            L_0x00c3:
                java.lang.String r4 = "user"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x014e
                r3 = 1
                goto L_0x014e
            L_0x00ce:
                java.lang.String r4 = "radiuses"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x014e
                r3 = 6
                goto L_0x014e
            L_0x00d9:
                java.lang.String r4 = "profile"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x014e
                r3 = 2
                goto L_0x014e
            L_0x00e4:
                java.lang.String r4 = "baseUrl"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x014e
                r3 = 0
                goto L_0x014e
            L_0x00ee:
                java.lang.String r4 = "bannerInstructions"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x014e
                r3 = 16
                goto L_0x014e
            L_0x00f9:
                java.lang.String r4 = "annotations"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x014e
                r3 = 13
                goto L_0x014e
            L_0x0104:
                java.lang.String r4 = "accessToken"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x014e
                r3 = 18
                goto L_0x014e
            L_0x010f:
                java.lang.String r4 = "roundaboutExits"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x014e
                r3 = 9
                goto L_0x014e
            L_0x011a:
                java.lang.String r4 = "exclude"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x014e
                r3 = 14
                goto L_0x014e
            L_0x0125:
                java.lang.String r4 = "voiceUnits"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x014e
                r3 = 17
                goto L_0x014e
            L_0x0130:
                java.lang.String r4 = "language"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x014e
                r3 = 5
                goto L_0x014e
            L_0x013a:
                java.lang.String r4 = "alternatives"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x014e
                r3 = 4
                goto L_0x014e
            L_0x0144:
                java.lang.String r4 = "voiceInstructions"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x014e
                r3 = 15
            L_0x014e:
                switch(r3) {
                    case 0: goto L_0x034f;
                    case 1: goto L_0x0338;
                    case 2: goto L_0x0321;
                    case 3: goto L_0x0300;
                    case 4: goto L_0x02e9;
                    case 5: goto L_0x02d2;
                    case 6: goto L_0x02bb;
                    case 7: goto L_0x02a4;
                    case 8: goto L_0x028d;
                    case 9: goto L_0x0276;
                    case 10: goto L_0x025e;
                    case 11: goto L_0x0246;
                    case 12: goto L_0x022e;
                    case 13: goto L_0x0216;
                    case 14: goto L_0x01fe;
                    case 15: goto L_0x01e6;
                    case 16: goto L_0x01ce;
                    case 17: goto L_0x01b6;
                    case 18: goto L_0x019e;
                    case 19: goto L_0x0186;
                    case 20: goto L_0x016e;
                    case 21: goto L_0x0156;
                    default: goto L_0x0151;
                }
            L_0x0151:
                r30.skipValue()
                goto L_0x0036
            L_0x0156:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26165a
                if (r2 != 0) goto L_0x0164
                com.google.gson.Gson r2 = r0.f26168d
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26165a = r2
            L_0x0164:
                java.lang.Object r2 = r2.read(r1)
                r27 = r2
                java.lang.String r27 = (java.lang.String) r27
                goto L_0x0036
            L_0x016e:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26165a
                if (r2 != 0) goto L_0x017c
                com.google.gson.Gson r2 = r0.f26168d
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26165a = r2
            L_0x017c:
                java.lang.Object r2 = r2.read(r1)
                r26 = r2
                java.lang.String r26 = (java.lang.String) r26
                goto L_0x0036
            L_0x0186:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26165a
                if (r2 != 0) goto L_0x0194
                com.google.gson.Gson r2 = r0.f26168d
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26165a = r2
            L_0x0194:
                java.lang.Object r2 = r2.read(r1)
                r25 = r2
                java.lang.String r25 = (java.lang.String) r25
                goto L_0x0036
            L_0x019e:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26165a
                if (r2 != 0) goto L_0x01ac
                com.google.gson.Gson r2 = r0.f26168d
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26165a = r2
            L_0x01ac:
                java.lang.Object r2 = r2.read(r1)
                r24 = r2
                java.lang.String r24 = (java.lang.String) r24
                goto L_0x0036
            L_0x01b6:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26165a
                if (r2 != 0) goto L_0x01c4
                com.google.gson.Gson r2 = r0.f26168d
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26165a = r2
            L_0x01c4:
                java.lang.Object r2 = r2.read(r1)
                r23 = r2
                java.lang.String r23 = (java.lang.String) r23
                goto L_0x0036
            L_0x01ce:
                com.google.gson.TypeAdapter<java.lang.Boolean> r2 = r0.f26167c
                if (r2 != 0) goto L_0x01dc
                com.google.gson.Gson r2 = r0.f26168d
                java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26167c = r2
            L_0x01dc:
                java.lang.Object r2 = r2.read(r1)
                r22 = r2
                java.lang.Boolean r22 = (java.lang.Boolean) r22
                goto L_0x0036
            L_0x01e6:
                com.google.gson.TypeAdapter<java.lang.Boolean> r2 = r0.f26167c
                if (r2 != 0) goto L_0x01f4
                com.google.gson.Gson r2 = r0.f26168d
                java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26167c = r2
            L_0x01f4:
                java.lang.Object r2 = r2.read(r1)
                r21 = r2
                java.lang.Boolean r21 = (java.lang.Boolean) r21
                goto L_0x0036
            L_0x01fe:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26165a
                if (r2 != 0) goto L_0x020c
                com.google.gson.Gson r2 = r0.f26168d
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26165a = r2
            L_0x020c:
                java.lang.Object r2 = r2.read(r1)
                r20 = r2
                java.lang.String r20 = (java.lang.String) r20
                goto L_0x0036
            L_0x0216:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26165a
                if (r2 != 0) goto L_0x0224
                com.google.gson.Gson r2 = r0.f26168d
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26165a = r2
            L_0x0224:
                java.lang.Object r2 = r2.read(r1)
                r19 = r2
                java.lang.String r19 = (java.lang.String) r19
                goto L_0x0036
            L_0x022e:
                com.google.gson.TypeAdapter<java.lang.Boolean> r2 = r0.f26167c
                if (r2 != 0) goto L_0x023c
                com.google.gson.Gson r2 = r0.f26168d
                java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26167c = r2
            L_0x023c:
                java.lang.Object r2 = r2.read(r1)
                r18 = r2
                java.lang.Boolean r18 = (java.lang.Boolean) r18
                goto L_0x0036
            L_0x0246:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26165a
                if (r2 != 0) goto L_0x0254
                com.google.gson.Gson r2 = r0.f26168d
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26165a = r2
            L_0x0254:
                java.lang.Object r2 = r2.read(r1)
                r17 = r2
                java.lang.String r17 = (java.lang.String) r17
                goto L_0x0036
            L_0x025e:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26165a
                if (r2 != 0) goto L_0x026c
                com.google.gson.Gson r2 = r0.f26168d
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26165a = r2
            L_0x026c:
                java.lang.Object r2 = r2.read(r1)
                r16 = r2
                java.lang.String r16 = (java.lang.String) r16
                goto L_0x0036
            L_0x0276:
                com.google.gson.TypeAdapter<java.lang.Boolean> r2 = r0.f26167c
                if (r2 != 0) goto L_0x0284
                com.google.gson.Gson r2 = r0.f26168d
                java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26167c = r2
            L_0x0284:
                java.lang.Object r2 = r2.read(r1)
                r15 = r2
                java.lang.Boolean r15 = (java.lang.Boolean) r15
                goto L_0x0036
            L_0x028d:
                com.google.gson.TypeAdapter<java.lang.Boolean> r2 = r0.f26167c
                if (r2 != 0) goto L_0x029b
                com.google.gson.Gson r2 = r0.f26168d
                java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26167c = r2
            L_0x029b:
                java.lang.Object r2 = r2.read(r1)
                r14 = r2
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                goto L_0x0036
            L_0x02a4:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26165a
                if (r2 != 0) goto L_0x02b2
                com.google.gson.Gson r2 = r0.f26168d
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26165a = r2
            L_0x02b2:
                java.lang.Object r2 = r2.read(r1)
                r13 = r2
                java.lang.String r13 = (java.lang.String) r13
                goto L_0x0036
            L_0x02bb:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26165a
                if (r2 != 0) goto L_0x02c9
                com.google.gson.Gson r2 = r0.f26168d
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26165a = r2
            L_0x02c9:
                java.lang.Object r2 = r2.read(r1)
                r12 = r2
                java.lang.String r12 = (java.lang.String) r12
                goto L_0x0036
            L_0x02d2:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26165a
                if (r2 != 0) goto L_0x02e0
                com.google.gson.Gson r2 = r0.f26168d
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26165a = r2
            L_0x02e0:
                java.lang.Object r2 = r2.read(r1)
                r11 = r2
                java.lang.String r11 = (java.lang.String) r11
                goto L_0x0036
            L_0x02e9:
                com.google.gson.TypeAdapter<java.lang.Boolean> r2 = r0.f26167c
                if (r2 != 0) goto L_0x02f7
                com.google.gson.Gson r2 = r0.f26168d
                java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26167c = r2
            L_0x02f7:
                java.lang.Object r2 = r2.read(r1)
                r10 = r2
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                goto L_0x0036
            L_0x0300:
                com.google.gson.TypeAdapter<java.util.List<com.mapbox.geojson.Point>> r2 = r0.f26166b
                if (r2 != 0) goto L_0x0318
                com.google.gson.Gson r2 = r0.f26168d
                java.lang.Class<java.util.List> r3 = java.util.List.class
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r5]
                java.lang.Class<com.mapbox.geojson.Point> r5 = com.mapbox.geojson.Point.class
                r4[r28] = r5
                com.google.gson.reflect.TypeToken r3 = com.google.gson.reflect.TypeToken.getParameterized(r3, r4)
                com.google.gson.TypeAdapter r2 = r2.getAdapter((com.google.gson.reflect.TypeToken<T>) r3)
                r0.f26166b = r2
            L_0x0318:
                java.lang.Object r2 = r2.read(r1)
                r9 = r2
                java.util.List r9 = (java.util.List) r9
                goto L_0x0036
            L_0x0321:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26165a
                if (r2 != 0) goto L_0x032f
                com.google.gson.Gson r2 = r0.f26168d
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26165a = r2
            L_0x032f:
                java.lang.Object r2 = r2.read(r1)
                r8 = r2
                java.lang.String r8 = (java.lang.String) r8
                goto L_0x0036
            L_0x0338:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26165a
                if (r2 != 0) goto L_0x0346
                com.google.gson.Gson r2 = r0.f26168d
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26165a = r2
            L_0x0346:
                java.lang.Object r2 = r2.read(r1)
                r7 = r2
                java.lang.String r7 = (java.lang.String) r7
                goto L_0x0036
            L_0x034f:
                com.google.gson.TypeAdapter<java.lang.String> r2 = r0.f26165a
                if (r2 != 0) goto L_0x035d
                com.google.gson.Gson r2 = r0.f26168d
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                com.google.gson.TypeAdapter r2 = r2.getAdapter((java.lang.Class<T>) r3)
                r0.f26165a = r2
            L_0x035d:
                java.lang.Object r2 = r2.read(r1)
                r6 = r2
                java.lang.String r6 = (java.lang.String) r6
                goto L_0x0036
            L_0x0366:
                r30.endObject()
                com.mapbox.api.directions.v5.a.ac r1 = new com.mapbox.api.directions.v5.a.ac
                r5 = r1
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.api.directions.v5.a.ac.a.read(com.google.gson.stream.JsonReader):java.lang.Object");
        }

        public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
            at atVar = (at) obj;
            if (atVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("baseUrl");
            if (atVar.baseUrl() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.f26165a;
                if (typeAdapter == null) {
                    typeAdapter = this.f26168d.getAdapter(String.class);
                    this.f26165a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, atVar.baseUrl());
            }
            jsonWriter.name(AllStoryActivity.f73306b);
            if (atVar.user() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.f26165a;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f26168d.getAdapter(String.class);
                    this.f26165a = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, atVar.user());
            }
            jsonWriter.name("profile");
            if (atVar.profile() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.f26165a;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f26168d.getAdapter(String.class);
                    this.f26165a = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, atVar.profile());
            }
            jsonWriter.name("coordinates");
            if (atVar.coordinates() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Point>> typeAdapter4 = this.f26166b;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.f26168d.getAdapter(TypeToken.getParameterized(List.class, Point.class));
                    this.f26166b = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, atVar.coordinates());
            }
            jsonWriter.name("alternatives");
            if (atVar.alternatives() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter5 = this.f26167c;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.f26168d.getAdapter(Boolean.class);
                    this.f26167c = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, atVar.alternatives());
            }
            jsonWriter.name("language");
            if (atVar.language() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter6 = this.f26165a;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.f26168d.getAdapter(String.class);
                    this.f26165a = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, atVar.language());
            }
            jsonWriter.name("radiuses");
            if (atVar.radiuses() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter7 = this.f26165a;
                if (typeAdapter7 == null) {
                    typeAdapter7 = this.f26168d.getAdapter(String.class);
                    this.f26165a = typeAdapter7;
                }
                typeAdapter7.write(jsonWriter, atVar.radiuses());
            }
            jsonWriter.name("bearings");
            if (atVar.bearings() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter8 = this.f26165a;
                if (typeAdapter8 == null) {
                    typeAdapter8 = this.f26168d.getAdapter(String.class);
                    this.f26165a = typeAdapter8;
                }
                typeAdapter8.write(jsonWriter, atVar.bearings());
            }
            jsonWriter.name("continueStraight");
            if (atVar.continueStraight() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter9 = this.f26167c;
                if (typeAdapter9 == null) {
                    typeAdapter9 = this.f26168d.getAdapter(Boolean.class);
                    this.f26167c = typeAdapter9;
                }
                typeAdapter9.write(jsonWriter, atVar.continueStraight());
            }
            jsonWriter.name("roundaboutExits");
            if (atVar.roundaboutExits() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter10 = this.f26167c;
                if (typeAdapter10 == null) {
                    typeAdapter10 = this.f26168d.getAdapter(Boolean.class);
                    this.f26167c = typeAdapter10;
                }
                typeAdapter10.write(jsonWriter, atVar.roundaboutExits());
            }
            jsonWriter.name("geometries");
            if (atVar.geometries() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter11 = this.f26165a;
                if (typeAdapter11 == null) {
                    typeAdapter11 = this.f26168d.getAdapter(String.class);
                    this.f26165a = typeAdapter11;
                }
                typeAdapter11.write(jsonWriter, atVar.geometries());
            }
            jsonWriter.name("overview");
            if (atVar.overview() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter12 = this.f26165a;
                if (typeAdapter12 == null) {
                    typeAdapter12 = this.f26168d.getAdapter(String.class);
                    this.f26165a = typeAdapter12;
                }
                typeAdapter12.write(jsonWriter, atVar.overview());
            }
            jsonWriter.name("steps");
            if (atVar.steps() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter13 = this.f26167c;
                if (typeAdapter13 == null) {
                    typeAdapter13 = this.f26168d.getAdapter(Boolean.class);
                    this.f26167c = typeAdapter13;
                }
                typeAdapter13.write(jsonWriter, atVar.steps());
            }
            jsonWriter.name("annotations");
            if (atVar.annotations() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter14 = this.f26165a;
                if (typeAdapter14 == null) {
                    typeAdapter14 = this.f26168d.getAdapter(String.class);
                    this.f26165a = typeAdapter14;
                }
                typeAdapter14.write(jsonWriter, atVar.annotations());
            }
            jsonWriter.name("exclude");
            if (atVar.exclude() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter15 = this.f26165a;
                if (typeAdapter15 == null) {
                    typeAdapter15 = this.f26168d.getAdapter(String.class);
                    this.f26165a = typeAdapter15;
                }
                typeAdapter15.write(jsonWriter, atVar.exclude());
            }
            jsonWriter.name("voiceInstructions");
            if (atVar.voiceInstructions() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter16 = this.f26167c;
                if (typeAdapter16 == null) {
                    typeAdapter16 = this.f26168d.getAdapter(Boolean.class);
                    this.f26167c = typeAdapter16;
                }
                typeAdapter16.write(jsonWriter, atVar.voiceInstructions());
            }
            jsonWriter.name("bannerInstructions");
            if (atVar.bannerInstructions() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter17 = this.f26167c;
                if (typeAdapter17 == null) {
                    typeAdapter17 = this.f26168d.getAdapter(Boolean.class);
                    this.f26167c = typeAdapter17;
                }
                typeAdapter17.write(jsonWriter, atVar.bannerInstructions());
            }
            jsonWriter.name("voiceUnits");
            if (atVar.voiceUnits() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter18 = this.f26165a;
                if (typeAdapter18 == null) {
                    typeAdapter18 = this.f26168d.getAdapter(String.class);
                    this.f26165a = typeAdapter18;
                }
                typeAdapter18.write(jsonWriter, atVar.voiceUnits());
            }
            jsonWriter.name("accessToken");
            if (atVar.accessToken() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter19 = this.f26165a;
                if (typeAdapter19 == null) {
                    typeAdapter19 = this.f26168d.getAdapter(String.class);
                    this.f26165a = typeAdapter19;
                }
                typeAdapter19.write(jsonWriter, atVar.accessToken());
            }
            jsonWriter.name("requestUuid");
            if (atVar.requestUuid() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter20 = this.f26165a;
                if (typeAdapter20 == null) {
                    typeAdapter20 = this.f26168d.getAdapter(String.class);
                    this.f26165a = typeAdapter20;
                }
                typeAdapter20.write(jsonWriter, atVar.requestUuid());
            }
            jsonWriter.name("approaches");
            if (atVar.approaches() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter21 = this.f26165a;
                if (typeAdapter21 == null) {
                    typeAdapter21 = this.f26168d.getAdapter(String.class);
                    this.f26165a = typeAdapter21;
                }
                typeAdapter21.write(jsonWriter, atVar.approaches());
            }
            jsonWriter.name("waypointNames");
            if (atVar.waypointNames() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter22 = this.f26165a;
                if (typeAdapter22 == null) {
                    typeAdapter22 = this.f26168d.getAdapter(String.class);
                    this.f26165a = typeAdapter22;
                }
                typeAdapter22.write(jsonWriter, atVar.waypointNames());
            }
            jsonWriter.endObject();
        }
    }

    ac(String str, String str2, String str3, List<Point> list, @Nullable Boolean bool, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool2, @Nullable Boolean bool3, String str7, @Nullable String str8, @Nullable Boolean bool4, @Nullable String str9, @Nullable String str10, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable String str11, String str12, String str13, @Nullable String str14, @Nullable String str15) {
        super(str, str2, str3, list, bool, str4, str5, str6, bool2, bool3, str7, str8, bool4, str9, str10, bool5, bool6, str11, str12, str13, str14, str15);
    }
}
