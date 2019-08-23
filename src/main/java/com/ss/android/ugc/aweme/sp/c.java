package com.ss.android.ugc.aweme.sp;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.xmlpull.v1.XmlSerializer;

public final class c implements XmlSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4055a;

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f4056b = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};

    /* renamed from: c  reason: collision with root package name */
    private final char[] f4057c = new char[8192];

    /* renamed from: d  reason: collision with root package name */
    private int f4058d;

    /* renamed from: e  reason: collision with root package name */
    private Writer f4059e;

    /* renamed from: f  reason: collision with root package name */
    private OutputStream f4060f;
    private CharsetEncoder g;
    private ByteBuffer h = ByteBuffer.allocate(8192);
    private boolean i;

    public final void endDocument() throws IOException, IllegalArgumentException, IllegalStateException {
        if (PatchProxy.isSupport(new Object[0], this, f4055a, false, 81691, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4055a, false, 81691, new Class[0], Void.TYPE);
            return;
        }
        flush();
    }

    public final int getDepth() {
        if (PatchProxy.isSupport(new Object[0], this, f4055a, false, 81696, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f4055a, false, 81696, new Class[0], Integer.TYPE)).intValue();
        }
        throw new UnsupportedOperationException();
    }

    public final String getName() {
        if (PatchProxy.isSupport(new Object[0], this, f4055a, false, 81698, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f4055a, false, 81698, new Class[0], String.class);
        }
        throw new UnsupportedOperationException();
    }

    public final String getNamespace() {
        if (PatchProxy.isSupport(new Object[0], this, f4055a, false, 81699, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f4055a, false, 81699, new Class[0], String.class);
        }
        throw new UnsupportedOperationException();
    }

    private void a() throws IOException {
        if (PatchProxy.isSupport(new Object[0], this, f4055a, false, 81694, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4055a, false, 81694, new Class[0], Void.TYPE);
            return;
        }
        int position = this.h.position();
        if (position > 0) {
            this.h.flip();
            this.f4060f.write(this.h.array(), 0, position);
            this.h.clear();
        }
    }

    public final void flush() throws IOException {
        if (PatchProxy.isSupport(new Object[0], this, f4055a, false, 81695, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4055a, false, 81695, new Class[0], Void.TYPE);
            return;
        }
        if (this.f4058d > 0) {
            if (this.f4060f != null) {
                CharBuffer wrap = CharBuffer.wrap(this.f4057c, 0, this.f4058d);
                CoderResult encode = this.g.encode(wrap, this.h, true);
                while (!encode.isError()) {
                    if (encode.isOverflow()) {
                        a();
                        encode = this.g.encode(wrap, this.h, true);
                    } else {
                        a();
                        this.f4060f.flush();
                    }
                }
                throw new IOException(encode.toString());
            }
            this.f4059e.write(this.f4057c, 0, this.f4058d);
            this.f4059e.flush();
            this.f4058d = 0;
        }
    }

    public final void setOutput(Writer writer) throws IOException, IllegalArgumentException, IllegalStateException {
        this.f4059e = writer;
    }

    private void a(String str) throws IOException {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f4055a, false, 81684, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f4055a, false, 81684, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a(str2, 0, str.length());
    }

    public final void cdsect(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        if (PatchProxy.isSupport(new Object[]{str}, this, f4055a, false, 81688, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f4055a, false, 81688, new Class[]{String.class}, Void.TYPE);
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void comment(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        if (PatchProxy.isSupport(new Object[]{str}, this, f4055a, false, 81689, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f4055a, false, 81689, new Class[]{String.class}, Void.TYPE);
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void docdecl(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        if (PatchProxy.isSupport(new Object[]{str}, this, f4055a, false, 81690, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f4055a, false, 81690, new Class[]{String.class}, Void.TYPE);
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void entityRef(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        if (PatchProxy.isSupport(new Object[]{str}, this, f4055a, false, 81693, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f4055a, false, 81693, new Class[]{String.class}, Void.TYPE);
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final Object getProperty(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f4055a, false, 81701, new Class[]{String.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{str}, this, f4055a, false, 81701, new Class[]{String.class}, Object.class);
        }
        throw new UnsupportedOperationException();
    }

    public final void ignorableWhitespace(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        if (PatchProxy.isSupport(new Object[]{str}, this, f4055a, false, 81702, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f4055a, false, 81702, new Class[]{String.class}, Void.TYPE);
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void processingInstruction(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        if (PatchProxy.isSupport(new Object[]{str}, this, f4055a, false, 81703, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f4055a, false, 81703, new Class[]{String.class}, Void.TYPE);
            return;
        }
        throw new UnsupportedOperationException();
    }

    private void b(String str) throws IOException {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{str}, this, f4055a, false, 81685, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f4055a, false, 81685, new Class[]{String.class}, Void.TYPE);
            return;
        }
        int length = str.length();
        char length2 = (char) f4056b.length;
        String[] strArr = f4056b;
        int i3 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt < length2) {
                String str2 = strArr[charAt];
                if (str2 != null) {
                    if (i3 < i2) {
                        a(str, i3, i2 - i3);
                    }
                    i3 = i2 + 1;
                    a(str2);
                }
            }
            i2++;
        }
        if (i3 < i2) {
            a(str, i3, i2 - i3);
        }
    }

    public final boolean getFeature(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f4055a, false, 81697, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f4055a, false, 81697, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        throw new UnsupportedOperationException();
    }

    public final XmlSerializer text(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        if (PatchProxy.isSupport(new Object[]{str}, this, f4055a, false, 81711, new Class[]{String.class}, XmlSerializer.class)) {
            return (XmlSerializer) PatchProxy.accessDispatch(new Object[]{str}, this, f4055a, false, 81711, new Class[]{String.class}, XmlSerializer.class);
        }
        if (this.i) {
            a(">");
            this.i = false;
        }
        b(str);
        return this;
    }

    private void a(char c2) throws IOException {
        if (PatchProxy.isSupport(new Object[]{Character.valueOf(c2)}, this, f4055a, false, 81681, new Class[]{Character.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Character.valueOf(c2)}, this, f4055a, false, 81681, new Class[]{Character.TYPE}, Void.TYPE);
            return;
        }
        int i2 = this.f4058d;
        if (i2 >= 8191) {
            flush();
            i2 = this.f4058d;
        }
        this.f4057c[i2] = c2;
        this.f4058d = i2 + 1;
    }

    public final XmlSerializer endTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f4055a, false, 81692, new Class[]{String.class, String.class}, XmlSerializer.class)) {
            return (XmlSerializer) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f4055a, false, 81692, new Class[]{String.class, String.class}, XmlSerializer.class);
        }
        if (this.i) {
            a(" />\n");
        } else {
            a("</");
            if (str != null) {
                a(str);
                a(':');
            }
            a(str2);
            a(">\n");
        }
        this.i = false;
        return this;
    }

    public final String getPrefix(String str, boolean z) throws IllegalArgumentException {
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f4055a, false, 81700, new Class[]{String.class, Boolean.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f4055a, false, 81700, new Class[]{String.class, Boolean.TYPE}, String.class);
        }
        throw new UnsupportedOperationException();
    }

    public final void setFeature(String str, boolean z) throws IllegalArgumentException, IllegalStateException {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f4055a, false, 81704, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, this, f4055a, false, 81704, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
        } else if (!str2.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
            throw new UnsupportedOperationException();
        }
    }

    public final void setOutput(OutputStream outputStream, String str) throws IOException, IllegalArgumentException, IllegalStateException {
        if (PatchProxy.isSupport(new Object[]{outputStream, str}, this, f4055a, false, 81705, new Class[]{OutputStream.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{outputStream, str}, this, f4055a, false, 81705, new Class[]{OutputStream.class, String.class}, Void.TYPE);
        } else if (outputStream != null) {
            try {
                this.g = Charset.forName(str).newEncoder();
                this.f4060f = outputStream;
            } catch (IllegalCharsetNameException e2) {
                throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e2));
            } catch (UnsupportedCharsetException e3) {
                throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e3));
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final void setPrefix(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f4055a, false, 81706, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f4055a, false, 81706, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void setProperty(String str, Object obj) throws IllegalArgumentException, IllegalStateException {
        if (PatchProxy.isSupport(new Object[]{str, obj}, this, f4055a, false, 81707, new Class[]{String.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, obj}, this, f4055a, false, 81707, new Class[]{String.class, Object.class}, Void.TYPE);
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void startDocument(String str, Boolean bool) throws IOException, IllegalArgumentException, IllegalStateException {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str, bool}, this, f4055a, false, 81708, new Class[]{String.class, Boolean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, bool}, this, f4055a, false, 81708, new Class[]{String.class, Boolean.class}, Void.TYPE);
            return;
        }
        StringBuilder sb = new StringBuilder("<?xml version='1.0' encoding='utf-8' standalone='");
        if (bool.booleanValue()) {
            str2 = "yes";
        } else {
            str2 = "no";
        }
        sb.append(str2);
        sb.append("' ?>\n");
        a(sb.toString());
    }

    public final XmlSerializer startTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f4055a, false, 81709, new Class[]{String.class, String.class}, XmlSerializer.class)) {
            return (XmlSerializer) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f4055a, false, 81709, new Class[]{String.class, String.class}, XmlSerializer.class);
        }
        if (this.i) {
            a(">\n");
        }
        a('<');
        if (str != null) {
            a(str);
            a(':');
        }
        a(str2);
        this.i = true;
        return this;
    }

    public final XmlSerializer attribute(String str, String str2, String str3) throws IOException, IllegalArgumentException, IllegalStateException {
        String str4 = str2;
        String str5 = str3;
        if (PatchProxy.isSupport(new Object[]{str, str4, str5}, this, f4055a, false, 81687, new Class[]{String.class, String.class, String.class}, XmlSerializer.class)) {
            return (XmlSerializer) PatchProxy.accessDispatch(new Object[]{str, str4, str5}, this, f4055a, false, 81687, new Class[]{String.class, String.class, String.class}, XmlSerializer.class);
        }
        a(' ');
        if (str != null) {
            a(str);
            a(':');
        }
        a(str4);
        a("=\"");
        b(str5);
        a('\"');
        return this;
    }

    private void b(char[] cArr, int i2, int i3) throws IOException {
        char[] cArr2 = cArr;
        if (PatchProxy.isSupport(new Object[]{cArr2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f4055a, false, 81686, new Class[]{char[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cArr2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f4055a, false, 81686, new Class[]{char[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        char length = (char) f4056b.length;
        String[] strArr = f4056b;
        int i4 = i2 + i3;
        int i5 = i2;
        int i6 = i5;
        while (i5 < i4) {
            char c2 = cArr2[i5];
            if (c2 < length) {
                String str = strArr[c2];
                if (str != null) {
                    if (i6 < i5) {
                        a(cArr, i6, i5 - i6);
                    }
                    i6 = i5 + 1;
                    a(str);
                }
            }
            i5++;
        }
        if (i6 < i5) {
            a(cArr, i6, i5 - i6);
        }
    }

    public final XmlSerializer text(char[] cArr, int i2, int i3) throws IOException, IllegalArgumentException, IllegalStateException {
        if (PatchProxy.isSupport(new Object[]{cArr, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f4055a, false, 81710, new Class[]{char[].class, Integer.TYPE, Integer.TYPE}, XmlSerializer.class)) {
            return (XmlSerializer) PatchProxy.accessDispatch(new Object[]{cArr, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f4055a, false, 81710, new Class[]{char[].class, Integer.TYPE, Integer.TYPE}, XmlSerializer.class);
        }
        if (this.i) {
            a(">");
            this.i = false;
        }
        b(cArr, i2, i3);
        return this;
    }

    private void a(String str, int i2, int i3) throws IOException {
        int i4;
        String str2 = str;
        int i5 = i2;
        int i6 = i3;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f4055a, false, 81682, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f4055a, false, 81682, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (i6 > 8192) {
            int i7 = i5 + i6;
            while (i5 < i7) {
                int i8 = i5 + 8192;
                if (i8 < i7) {
                    i4 = 8192;
                } else {
                    i4 = i7 - i5;
                }
                a(str2, i5, i4);
                i5 = i8;
            }
        } else {
            int i9 = this.f4058d;
            if (i9 + i6 > 8192) {
                flush();
                i9 = this.f4058d;
            }
            str2.getChars(i5, i5 + i6, this.f4057c, i9);
            this.f4058d = i9 + i6;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(char[] r16, int r17, int r18) throws java.io.IOException {
        /*
            r15 = this;
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = 3
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r12 = 0
            r0[r12] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r13 = 1
            r0[r13] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r14 = 2
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f4055a
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<char[]> r1 = char[].class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 81683(0x13f13, float:1.14462E-40)
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0063
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r0[r13] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f4055a
            r3 = 0
            r4 = 81683(0x13f13, float:1.14462E-40)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<char[]> r1 = char[].class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0063:
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r10 <= r0) goto L_0x007a
            int r1 = r9 + r10
        L_0x0069:
            if (r9 >= r1) goto L_0x0079
            int r2 = r9 + 8192
            if (r2 >= r1) goto L_0x0072
            r3 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0074
        L_0x0072:
            int r3 = r1 - r9
        L_0x0074:
            r15.a((char[]) r8, (int) r9, (int) r3)
            r9 = r2
            goto L_0x0069
        L_0x0079:
            return
        L_0x007a:
            int r1 = r7.f4058d
            int r2 = r1 + r10
            if (r2 <= r0) goto L_0x0085
            r15.flush()
            int r1 = r7.f4058d
        L_0x0085:
            char[] r0 = r7.f4057c
            java.lang.System.arraycopy(r8, r9, r0, r1, r10)
            int r1 = r1 + r10
            r7.f4058d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sp.c.a(char[], int, int):void");
    }
}
