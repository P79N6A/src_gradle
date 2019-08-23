package com.ss.android.ugc.aweme.sp;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4107a;

    private static void a(Set set, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        String str2 = str;
        XmlSerializer xmlSerializer2 = xmlSerializer;
        if (PatchProxy.isSupport(new Object[]{set, str2, xmlSerializer2}, null, f4107a, true, 81799, new Class[]{Set.class, String.class, XmlSerializer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{set, str2, xmlSerializer2}, null, f4107a, true, 81799, new Class[]{Set.class, String.class, XmlSerializer.class}, Void.TYPE);
        } else if (set == null) {
            xmlSerializer2.startTag(null, "null");
            xmlSerializer2.endTag(null, "null");
        } else {
            xmlSerializer2.startTag(null, "set");
            if (str2 != null) {
                xmlSerializer2.attribute(null, "name", str2);
            }
            for (Object a2 : set) {
                a(a2, (String) null, xmlSerializer2);
            }
            xmlSerializer2.endTag(null, "set");
        }
    }

    private static void a(byte[] bArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        byte[] bArr2 = bArr;
        String str2 = str;
        XmlSerializer xmlSerializer2 = xmlSerializer;
        if (PatchProxy.isSupport(new Object[]{bArr2, str2, xmlSerializer2}, null, f4107a, true, 81800, new Class[]{byte[].class, String.class, XmlSerializer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bArr2, str2, xmlSerializer2}, null, f4107a, true, 81800, new Class[]{byte[].class, String.class, XmlSerializer.class}, Void.TYPE);
        } else if (bArr2 == null) {
            xmlSerializer2.startTag(null, "null");
            xmlSerializer2.endTag(null, "null");
        } else {
            xmlSerializer2.startTag(null, "byte-array");
            if (str2 != null) {
                xmlSerializer2.attribute(null, "name", str2);
            }
            xmlSerializer2.attribute(null, "num", Integer.toString(r1));
            StringBuilder sb = new StringBuilder(bArr2.length * 2);
            for (byte b2 : bArr2) {
                int i = b2 >> 4;
                sb.append(i >= 10 ? (i + 97) - 10 : i + 48);
                byte b3 = b2 & 255;
                sb.append(b3 >= 10 ? (b3 + 97) - 10 : b3 + 48);
            }
            xmlSerializer2.text(sb.toString());
            xmlSerializer2.endTag(null, "byte-array");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(int[] r21, java.lang.String r22, org.xmlpull.v1.XmlSerializer r23) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f4107a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<int[]> r5 = int[].class
            r9[r11] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r12] = r5
            java.lang.Class<org.xmlpull.v1.XmlSerializer> r5 = org.xmlpull.v1.XmlSerializer.class
            r9[r13] = r5
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = 0
            r7 = 1
            r8 = 81801(0x13f89, float:1.14628E-40)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0055
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            r14[r13] = r2
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f4107a
            r17 = 1
            r18 = 81801(0x13f89, float:1.14628E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<int[]> r1 = int[].class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<org.xmlpull.v1.XmlSerializer> r1 = org.xmlpull.v1.XmlSerializer.class
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Void.TYPE
            r19 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x0055:
            r3 = 0
            if (r0 != 0) goto L_0x0063
            java.lang.String r0 = "null"
            r2.startTag(r3, r0)
            java.lang.String r0 = "null"
            r2.endTag(r3, r0)
            return
        L_0x0063:
            java.lang.String r4 = "int-array"
            r2.startTag(r3, r4)
            if (r1 == 0) goto L_0x006f
            java.lang.String r4 = "name"
            r2.attribute(r3, r4, r1)
        L_0x006f:
            int r1 = r0.length
            java.lang.String r4 = "num"
            java.lang.String r5 = java.lang.Integer.toString(r1)
            r2.attribute(r3, r4, r5)
        L_0x0079:
            if (r11 >= r1) goto L_0x0093
            java.lang.String r4 = "item"
            r2.startTag(r3, r4)
            java.lang.String r4 = "value"
            r5 = r0[r11]
            java.lang.String r5 = java.lang.Integer.toString(r5)
            r2.attribute(r3, r4, r5)
            java.lang.String r4 = "item"
            r2.endTag(r3, r4)
            int r11 = r11 + 1
            goto L_0x0079
        L_0x0093:
            java.lang.String r0 = "int-array"
            r2.endTag(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sp.i.a(int[], java.lang.String, org.xmlpull.v1.XmlSerializer):void");
    }

    public static final Object a(XmlPullParser xmlPullParser, String[] strArr) throws XmlPullParserException, IOException {
        if (PatchProxy.isSupport(new Object[]{xmlPullParser, strArr}, null, f4107a, true, 81810, new Class[]{XmlPullParser.class, String[].class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{xmlPullParser, strArr}, null, f4107a, true, 81810, new Class[]{XmlPullParser.class, String[].class}, Object.class);
        }
        int eventType = xmlPullParser.getEventType();
        while (eventType != 2) {
            if (eventType == 3) {
                throw new XmlPullParserException("Unexpected end tag at: " + xmlPullParser.getName());
            } else if (eventType != 4) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    throw new XmlPullParserException("Unexpected end of document");
                }
            } else {
                throw new XmlPullParserException("Unexpected text: " + xmlPullParser.getText());
            }
        }
        return b(xmlPullParser, strArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object b(org.xmlpull.v1.XmlPullParser r19, java.lang.String[] r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f4107a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<org.xmlpull.v1.XmlPullParser> r4 = org.xmlpull.v1.XmlPullParser.class
            r8[r10] = r4
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r11] = r4
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            r4 = 0
            r6 = 1
            r7 = 81811(0x13f93, float:1.14642E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0048
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f4107a
            r15 = 1
            r16 = 81811(0x13f93, float:1.14642E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<org.xmlpull.v1.XmlPullParser> r1 = org.xmlpull.v1.XmlPullParser.class
            r0[r10] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r11] = r1
            java.lang.Class<java.lang.Object> r18 = java.lang.Object.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = (java.lang.Object) r0
            return r0
        L_0x0048:
            java.lang.String r3 = "name"
            r4 = 0
            java.lang.String r3 = r0.getAttributeValue(r4, r3)
            java.lang.String r5 = r19.getName()
            java.lang.String r6 = "null"
            boolean r6 = r5.equals(r6)
            r7 = 4
            r8 = 3
            if (r6 == 0) goto L_0x005f
            goto L_0x0133
        L_0x005f:
            java.lang.String r6 = "string"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x00d1
            java.lang.String r4 = ""
        L_0x0069:
            int r5 = r19.next()
            if (r5 == r11) goto L_0x00c9
            if (r5 != r8) goto L_0x0098
            java.lang.String r2 = r19.getName()
            java.lang.String r5 = "string"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0080
            r1[r10] = r3
            return r4
        L_0x0080:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected end tag in <string>: "
            r2.<init>(r3)
            java.lang.String r0 = r19.getName()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0098:
            if (r5 != r7) goto L_0x00ae
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = r19.getText()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            goto L_0x0069
        L_0x00ae:
            if (r5 == r2) goto L_0x00b1
            goto L_0x0069
        L_0x00b1:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected start tag in <string>: "
            r2.<init>(r3)
            java.lang.String r0 = r19.getName()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x00c9:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "Unexpected end of document in <string>"
            r0.<init>(r1)
            throw r0
        L_0x00d1:
            java.lang.String r6 = "int"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x00e8
            java.lang.String r6 = "value"
            java.lang.String r4 = r0.getAttributeValue(r4, r6)
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0133
        L_0x00e8:
            java.lang.String r6 = "long"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x00fb
            java.lang.String r6 = "value"
            java.lang.String r4 = r0.getAttributeValue(r4, r6)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x0133
        L_0x00fb:
            java.lang.String r6 = "float"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x010e
            java.lang.String r6 = "value"
            java.lang.String r4 = r0.getAttributeValue(r4, r6)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L_0x0133
        L_0x010e:
            java.lang.String r6 = "double"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0121
            java.lang.String r6 = "value"
            java.lang.String r4 = r0.getAttributeValue(r4, r6)
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            goto L_0x0133
        L_0x0121:
            java.lang.String r6 = "boolean"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x01c6
            java.lang.String r6 = "value"
            java.lang.String r4 = r0.getAttributeValue(r4, r6)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
        L_0x0133:
            int r6 = r19.next()
            if (r6 == r11) goto L_0x01ad
            if (r6 != r8) goto L_0x0168
            java.lang.String r2 = r19.getName()
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0148
            r1[r10] = r3
            return r4
        L_0x0148:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected end tag in <"
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r3 = ">: "
            r2.append(r3)
            java.lang.String r0 = r19.getName()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0168:
            if (r6 == r7) goto L_0x018d
            if (r6 == r2) goto L_0x016d
            goto L_0x0133
        L_0x016d:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected start tag in <"
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r3 = ">: "
            r2.append(r3)
            java.lang.String r0 = r19.getName()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x018d:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected text in <"
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r3 = ">: "
            r2.append(r3)
            java.lang.String r0 = r19.getName()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x01ad:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected end of document in <"
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r2 = ">"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01c6:
            java.lang.String r2 = "int-array"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x01da
            r19.next()
            java.lang.String r2 = "int-array"
            int[] r0 = d(r0, r2, r1)
            r1[r10] = r3
            return r0
        L_0x01da:
            java.lang.String r2 = "map"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x01ee
            r19.next()
            java.lang.String r2 = "map"
            java.util.HashMap r0 = a((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r2, (java.lang.String[]) r1)
            r1[r10] = r3
            return r0
        L_0x01ee:
            java.lang.String r2 = "list"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0202
            r19.next()
            java.lang.String r2 = "list"
            java.util.ArrayList r0 = b(r0, r2, r1)
            r1[r10] = r3
            return r0
        L_0x0202:
            java.lang.String r2 = "set"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0216
            r19.next()
            java.lang.String r2 = "set"
            java.util.HashSet r0 = c(r0, r2, r1)
            r1[r10] = r3
            return r0
        L_0x0216:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown tag: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sp.i.b(org.xmlpull.v1.XmlPullParser, java.lang.String[]):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList b(org.xmlpull.v1.XmlPullParser r21, java.lang.String r22, java.lang.String[] r23) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f4107a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<org.xmlpull.v1.XmlPullParser> r5 = org.xmlpull.v1.XmlPullParser.class
            r9[r11] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r12] = r5
            java.lang.Class<java.lang.String[]> r5 = java.lang.String[].class
            r9[r13] = r5
            java.lang.Class<java.util.ArrayList> r10 = java.util.ArrayList.class
            r5 = 0
            r7 = 1
            r8 = 81807(0x13f8f, float:1.14636E-40)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0058
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            r14[r13] = r2
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f4107a
            r17 = 1
            r18 = 81807(0x13f8f, float:1.14636E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<org.xmlpull.v1.XmlPullParser> r1 = org.xmlpull.v1.XmlPullParser.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r13] = r1
            java.lang.Class<java.util.ArrayList> r20 = java.util.ArrayList.class
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            return r0
        L_0x0058:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r21.getEventType()
        L_0x0061:
            if (r5 != r13) goto L_0x006b
            java.lang.Object r5 = b(r0, r2)
            r4.add(r5)
            goto L_0x0098
        L_0x006b:
            if (r5 != r3) goto L_0x0098
            java.lang.String r2 = r21.getName()
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0078
            return r4
        L_0x0078:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Expected "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " end tag at: "
            r3.append(r1)
            java.lang.String r0 = r21.getName()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x0098:
            int r5 = r21.next()
            if (r5 == r12) goto L_0x009f
            goto L_0x0061
        L_0x009f:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Document ended before "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " end tag"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sp.i.b(org.xmlpull.v1.XmlPullParser, java.lang.String, java.lang.String[]):java.util.ArrayList");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.HashSet c(org.xmlpull.v1.XmlPullParser r21, java.lang.String r22, java.lang.String[] r23) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f4107a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<org.xmlpull.v1.XmlPullParser> r5 = org.xmlpull.v1.XmlPullParser.class
            r9[r11] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r12] = r5
            java.lang.Class<java.lang.String[]> r5 = java.lang.String[].class
            r9[r13] = r5
            java.lang.Class<java.util.HashSet> r10 = java.util.HashSet.class
            r5 = 0
            r7 = 1
            r8 = 81808(0x13f90, float:1.14637E-40)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0058
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            r14[r13] = r2
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f4107a
            r17 = 1
            r18 = 81808(0x13f90, float:1.14637E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<org.xmlpull.v1.XmlPullParser> r1 = org.xmlpull.v1.XmlPullParser.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r13] = r1
            java.lang.Class<java.util.HashSet> r20 = java.util.HashSet.class
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.util.HashSet r0 = (java.util.HashSet) r0
            return r0
        L_0x0058:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            int r5 = r21.getEventType()
        L_0x0061:
            if (r5 != r13) goto L_0x006b
            java.lang.Object r5 = b(r0, r2)
            r4.add(r5)
            goto L_0x0098
        L_0x006b:
            if (r5 != r3) goto L_0x0098
            java.lang.String r2 = r21.getName()
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0078
            return r4
        L_0x0078:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Expected "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " end tag at: "
            r3.append(r1)
            java.lang.String r0 = r21.getName()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x0098:
            int r5 = r21.next()
            if (r5 == r12) goto L_0x009f
            goto L_0x0061
        L_0x009f:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Document ended before "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " end tag"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sp.i.c(org.xmlpull.v1.XmlPullParser, java.lang.String, java.lang.String[]):java.util.HashSet");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.HashMap a(org.xmlpull.v1.XmlPullParser r21, java.lang.String r22, java.lang.String[] r23) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f4107a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<org.xmlpull.v1.XmlPullParser> r5 = org.xmlpull.v1.XmlPullParser.class
            r9[r11] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r12] = r5
            java.lang.Class<java.lang.String[]> r5 = java.lang.String[].class
            r9[r13] = r5
            java.lang.Class<java.util.HashMap> r10 = java.util.HashMap.class
            r5 = 0
            r7 = 1
            r8 = 81806(0x13f8e, float:1.14635E-40)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0058
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            r14[r13] = r2
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f4107a
            r17 = 1
            r18 = 81806(0x13f8e, float:1.14635E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<org.xmlpull.v1.XmlPullParser> r1 = org.xmlpull.v1.XmlPullParser.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r13] = r1
            java.lang.Class<java.util.HashMap> r20 = java.util.HashMap.class
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.util.HashMap r0 = (java.util.HashMap) r0
            return r0
        L_0x0058:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            int r5 = r21.getEventType()
        L_0x0061:
            if (r5 != r13) goto L_0x0089
            java.lang.Object r5 = b(r0, r2)
            r6 = r2[r11]
            if (r6 == 0) goto L_0x0071
            r6 = r2[r11]
            r4.put(r6, r5)
            goto L_0x00b6
        L_0x0071:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Map value without name attribute: "
            r2.<init>(r3)
            java.lang.String r0 = r21.getName()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0089:
            if (r5 != r3) goto L_0x00b6
            java.lang.String r2 = r21.getName()
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0096
            return r4
        L_0x0096:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Expected "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " end tag at: "
            r3.append(r1)
            java.lang.String r0 = r21.getName()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x00b6:
            int r5 = r21.next()
            if (r5 == r12) goto L_0x00bd
            goto L_0x0061
        L_0x00bd:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Document ended before "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " end tag"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sp.i.a(org.xmlpull.v1.XmlPullParser, java.lang.String, java.lang.String[]):java.util.HashMap");
    }

    private static int[] d(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String str2 = str;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{xmlPullParser2, str2, strArr}, null, f4107a, true, 81809, new Class[]{XmlPullParser.class, String.class, String[].class}, int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[]{xmlPullParser2, str2, strArr}, null, f4107a, true, 81809, new Class[]{XmlPullParser.class, String.class, String[].class}, int[].class);
        }
        try {
            int[] iArr = new int[Integer.parseInt(xmlPullParser2.getAttributeValue(null, "num"))];
            int eventType = xmlPullParser.getEventType();
            do {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("item")) {
                        try {
                            iArr[i] = Integer.parseInt(xmlPullParser2.getAttributeValue(null, "value"));
                        } catch (NullPointerException unused) {
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException unused2) {
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    } else {
                        throw new XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str2)) {
                        return iArr;
                    }
                    if (xmlPullParser.getName().equals("item")) {
                        i++;
                    } else {
                        throw new XmlPullParserException("Expected " + str2 + " end tag at: " + xmlPullParser.getName());
                    }
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str2 + " end tag");
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in byte-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in byte-array");
        }
    }

    private static void a(Object obj, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        String str2;
        Object obj2 = obj;
        String str3 = str;
        XmlSerializer xmlSerializer2 = xmlSerializer;
        if (PatchProxy.isSupport(new Object[]{obj2, str3, xmlSerializer2}, null, f4107a, true, 81802, new Class[]{Object.class, String.class, XmlSerializer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj2, str3, xmlSerializer2}, null, f4107a, true, 81802, new Class[]{Object.class, String.class, XmlSerializer.class}, Void.TYPE);
        } else if (obj2 == null) {
            xmlSerializer2.startTag(null, "null");
            if (str3 != null) {
                xmlSerializer2.attribute(null, "name", str3);
            }
            xmlSerializer2.endTag(null, "null");
        } else if (obj2 instanceof String) {
            xmlSerializer2.startTag(null, "string");
            if (str3 != null) {
                xmlSerializer2.attribute(null, "name", str3);
            }
            xmlSerializer2.text(obj.toString());
            xmlSerializer2.endTag(null, "string");
        } else {
            if (obj2 instanceof Integer) {
                str2 = "int";
            } else if (obj2 instanceof Long) {
                str2 = "long";
            } else if (obj2 instanceof Float) {
                str2 = "float";
            } else if (obj2 instanceof Double) {
                str2 = "double";
            } else if (obj2 instanceof Boolean) {
                str2 = "boolean";
            } else if (obj2 instanceof byte[]) {
                a((byte[]) obj2, str3, xmlSerializer2);
                return;
            } else if (obj2 instanceof int[]) {
                a((int[]) obj2, str3, xmlSerializer2);
                return;
            } else if (obj2 instanceof Map) {
                a((Map) obj2, str3, xmlSerializer2);
                return;
            } else if (obj2 instanceof List) {
                a((List) obj2, str3, xmlSerializer2);
                return;
            } else if (obj2 instanceof Set) {
                a((Set) obj2, str3, xmlSerializer2);
                return;
            } else if (obj2 instanceof CharSequence) {
                xmlSerializer2.startTag(null, "string");
                if (str3 != null) {
                    xmlSerializer2.attribute(null, "name", str3);
                }
                xmlSerializer2.text(obj.toString());
                xmlSerializer2.endTag(null, "string");
                return;
            } else {
                throw new RuntimeException("writeValueXml: unable to write value " + obj2);
            }
            xmlSerializer2.startTag(null, str2);
            if (str3 != null) {
                xmlSerializer2.attribute(null, "name", str3);
            }
            xmlSerializer2.attribute(null, "value", obj.toString());
            xmlSerializer2.endTag(null, str2);
        }
    }

    private static void a(List list, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        List list2 = list;
        String str2 = str;
        XmlSerializer xmlSerializer2 = xmlSerializer;
        if (PatchProxy.isSupport(new Object[]{list2, str2, xmlSerializer2}, null, f4107a, true, 81798, new Class[]{List.class, String.class, XmlSerializer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, str2, xmlSerializer2}, null, f4107a, true, 81798, new Class[]{List.class, String.class, XmlSerializer.class}, Void.TYPE);
        } else if (list2 == null) {
            xmlSerializer2.startTag(null, "null");
            xmlSerializer2.endTag(null, "null");
        } else {
            xmlSerializer2.startTag(null, "list");
            if (str2 != null) {
                xmlSerializer2.attribute(null, "name", str2);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                a(list2.get(i), (String) null, xmlSerializer2);
            }
            xmlSerializer2.endTag(null, "list");
        }
    }

    public static final void a(Map map, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        String str2 = str;
        XmlSerializer xmlSerializer2 = xmlSerializer;
        if (PatchProxy.isSupport(new Object[]{map, str2, xmlSerializer2}, null, f4107a, true, 81797, new Class[]{Map.class, String.class, XmlSerializer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map, str2, xmlSerializer2}, null, f4107a, true, 81797, new Class[]{Map.class, String.class, XmlSerializer.class}, Void.TYPE);
        } else if (map == null) {
            xmlSerializer2.startTag(null, "null");
            xmlSerializer2.endTag(null, "null");
        } else {
            xmlSerializer2.startTag(null, "map");
            if (str2 != null) {
                xmlSerializer2.attribute(null, "name", str2);
            }
            for (Map.Entry entry : map.entrySet()) {
                a(entry.getValue(), (String) entry.getKey(), xmlSerializer2);
            }
            xmlSerializer2.endTag(null, "map");
        }
    }
}
