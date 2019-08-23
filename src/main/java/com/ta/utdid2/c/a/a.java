package com.ta.utdid2.c.a;

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

public class a implements XmlSerializer {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f78858a;

    /* renamed from: a  reason: collision with other field name */
    private OutputStream f43a;

    /* renamed from: a  reason: collision with other field name */
    private Writer f44a;

    /* renamed from: a  reason: collision with other field name */
    private ByteBuffer f45a = ByteBuffer.allocate(8192);

    /* renamed from: a  reason: collision with other field name */
    private CharsetEncoder f46a;

    /* renamed from: a  reason: collision with other field name */
    private final char[] f47a = new char[8192];

    /* renamed from: f  reason: collision with root package name */
    private boolean f78859f;
    private int mPos;

    public void endDocument() throws IOException, IllegalArgumentException, IllegalStateException {
        flush();
    }

    public int getDepth() {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getNamespace() {
        throw new UnsupportedOperationException();
    }

    a() {
    }

    static {
        String[] strArr = new String[64];
        strArr[34] = "&quot;";
        strArr[38] = "&amp;";
        strArr[60] = "&lt;";
        strArr[62] = "&gt;";
        f78858a = strArr;
    }

    private void b() throws IOException {
        int position = this.f45a.position();
        if (position > 0) {
            this.f45a.flip();
            this.f43a.write(this.f45a.array(), 0, position);
            this.f45a.clear();
        }
    }

    public void flush() throws IOException {
        if (this.mPos > 0) {
            if (this.f43a != null) {
                CharBuffer wrap = CharBuffer.wrap(this.f47a, 0, this.mPos);
                CoderResult encode = this.f46a.encode(wrap, this.f45a, true);
                while (!encode.isError()) {
                    if (encode.isOverflow()) {
                        b();
                        encode = this.f46a.encode(wrap, this.f45a, true);
                    } else {
                        b();
                        this.f43a.flush();
                    }
                }
                throw new IOException(encode.toString());
            }
            this.f44a.write(this.f47a, 0, this.mPos);
            this.f44a.flush();
            this.mPos = 0;
        }
    }

    public void setOutput(Writer writer) throws IOException, IllegalArgumentException, IllegalStateException {
        this.f44a = writer;
    }

    public void cdsect(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void comment(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void docdecl(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void entityRef(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public boolean getFeature(String str) {
        throw new UnsupportedOperationException();
    }

    public Object getProperty(String str) {
        throw new UnsupportedOperationException();
    }

    public void ignorableWhitespace(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void processingInstruction(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    private void append(String str) throws IOException {
        a(str, 0, str.length());
    }

    public XmlSerializer text(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        if (this.f78859f) {
            append(">");
            this.f78859f = false;
        }
        a(str);
        return this;
    }

    private void append(char c2) throws IOException {
        int i = this.mPos;
        if (i >= 8191) {
            flush();
            i = this.mPos;
        }
        this.f47a[i] = c2;
        this.mPos = i + 1;
    }

    private void a(String str) throws IOException {
        int length = str.length();
        char length2 = (char) f78858a.length;
        String[] strArr = f78858a;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < length2) {
                String str2 = strArr[charAt];
                if (str2 != null) {
                    if (i2 < i) {
                        a(str, i2, i - i2);
                    }
                    i2 = i + 1;
                    append(str2);
                }
            }
            i++;
        }
        if (i2 < i) {
            a(str, i2, i - i2);
        }
    }

    public String getPrefix(String str, boolean z) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public void setPrefix(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void setProperty(String str, Object obj) throws IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void setFeature(String str, boolean z) throws IllegalArgumentException, IllegalStateException {
        if (!str.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
            throw new UnsupportedOperationException();
        }
    }

    public XmlSerializer startTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        if (this.f78859f) {
            append(">\n");
        }
        append('<');
        if (str != null) {
            append(str);
            append(':');
        }
        append(str2);
        this.f78859f = true;
        return this;
    }

    public XmlSerializer endTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        if (this.f78859f) {
            append(" />\n");
        } else {
            append("</");
            if (str != null) {
                append(str);
                append(':');
            }
            append(str2);
            append(">\n");
        }
        this.f78859f = false;
        return this;
    }

    public void setOutput(OutputStream outputStream, String str) throws IOException, IllegalArgumentException, IllegalStateException {
        if (outputStream != null) {
            try {
                this.f46a = Charset.forName(str).newEncoder();
                this.f43a = outputStream;
            } catch (IllegalCharsetNameException e2) {
                throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e2));
            } catch (UnsupportedCharsetException e3) {
                throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e3));
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void startDocument(String str, Boolean bool) throws IOException, IllegalArgumentException, IllegalStateException {
        String str2;
        StringBuilder sb = new StringBuilder("<?xml version='1.0' encoding='utf-8' standalone='");
        if (bool.booleanValue()) {
            str2 = "yes";
        } else {
            str2 = "no";
        }
        sb.append(str2);
        sb.append("' ?>\n");
        append(sb.toString());
    }

    public XmlSerializer attribute(String str, String str2, String str3) throws IOException, IllegalArgumentException, IllegalStateException {
        append(' ');
        if (str != null) {
            append(str);
            append(':');
        }
        append(str2);
        append("=\"");
        a(str3);
        append('\"');
        return this;
    }

    public XmlSerializer text(char[] cArr, int i, int i2) throws IOException, IllegalArgumentException, IllegalStateException {
        if (this.f78859f) {
            append(">");
            this.f78859f = false;
        }
        a(cArr, i, i2);
        return this;
    }

    private void append(char[] cArr, int i, int i2) throws IOException {
        int i3;
        if (i2 > 8192) {
            int i4 = i + i2;
            while (i < i4) {
                int i5 = i + 8192;
                if (i5 < i4) {
                    i3 = 8192;
                } else {
                    i3 = i4 - i;
                }
                append(cArr, i, i3);
                i = i5;
            }
            return;
        }
        int i6 = this.mPos;
        if (i6 + i2 > 8192) {
            flush();
            i6 = this.mPos;
        }
        System.arraycopy(cArr, i, this.f47a, i6, i2);
        this.mPos = i6 + i2;
    }

    private void a(String str, int i, int i2) throws IOException {
        int i3;
        if (i2 > 8192) {
            int i4 = i + i2;
            while (i < i4) {
                int i5 = i + 8192;
                if (i5 < i4) {
                    i3 = 8192;
                } else {
                    i3 = i4 - i;
                }
                a(str, i, i3);
                i = i5;
            }
            return;
        }
        int i6 = this.mPos;
        if (i6 + i2 > 8192) {
            flush();
            i6 = this.mPos;
        }
        str.getChars(i, i + i2, this.f47a, i6);
        this.mPos = i6 + i2;
    }

    private void a(char[] cArr, int i, int i2) throws IOException {
        char length = (char) f78858a.length;
        String[] strArr = f78858a;
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            char c2 = cArr[i];
            if (c2 < length) {
                String str = strArr[c2];
                if (str != null) {
                    if (i4 < i) {
                        append(cArr, i4, i - i4);
                    }
                    i4 = i + 1;
                    append(str);
                }
            }
            i++;
        }
        if (i4 < i) {
            append(cArr, i4, i - i4);
        }
    }
}
