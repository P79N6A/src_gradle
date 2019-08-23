package com.bytedance.frameworks.baselib.network.http.d;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Locale;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    Hashtable f19851a = new Hashtable();

    public c() {
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.ensureCapacity(this.f19851a.size() * 16);
        Enumeration keys = this.f19851a.keys();
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            stringBuffer.append("; ");
            stringBuffer.append(str);
            stringBuffer.append('=');
            stringBuffer.append(b((String) this.f19851a.get(str)));
        }
        return stringBuffer.toString();
    }

    public c(String str) throws d {
        a(str);
    }

    private static boolean a(char c2) {
        if (c2 <= ' ' || c2 >= 127 || "()<>@,;:/[]?=\\\"".indexOf(c2) >= 0) {
            return false;
        }
        return true;
    }

    private static String c(String str) {
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.ensureCapacity(length);
        boolean z = false;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (!z && charAt != '\\') {
                stringBuffer.append(charAt);
            } else if (z) {
                stringBuffer.append(charAt);
                z = false;
            } else {
                z = true;
            }
        }
        return stringBuffer.toString();
    }

    private static String b(String str) {
        int length = str.length();
        boolean z = false;
        for (int i = 0; i < length && !z; i++) {
            z = !a(str.charAt(i));
        }
        if (!z) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        double d2 = (double) length;
        Double.isNaN(d2);
        stringBuffer.ensureCapacity((int) (d2 * 1.5d));
        stringBuffer.append('\"');
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '\\' || charAt == '\"') {
                stringBuffer.append('\\');
            }
            stringBuffer.append(charAt);
        }
        stringBuffer.append('\"');
        return stringBuffer.toString();
    }

    private void a(String str) throws d {
        int i;
        String str2;
        if (str != null) {
            int length = str.length();
            if (length > 0) {
                int a2 = a(str, 0);
                while (a2 < length && str.charAt(a2) == ';') {
                    int a3 = a(str, a2 + 1);
                    if (a3 < length) {
                        int i2 = a3;
                        while (i2 < length && a(str.charAt(i2))) {
                            i2++;
                        }
                        String lowerCase = str.substring(a3, i2).toLowerCase(Locale.ENGLISH);
                        int a4 = a(str, i2);
                        if (a4 >= length || str.charAt(a4) != '=') {
                            throw new d("Couldn't find the '=' that separates a parameter name from its value.");
                        }
                        int a5 = a(str, a4 + 1);
                        if (a5 < length) {
                            char charAt = str.charAt(a5);
                            if (charAt == '\"') {
                                int i3 = a5 + 1;
                                if (i3 < length) {
                                    char c2 = charAt;
                                    int i4 = i3;
                                    while (i4 < length) {
                                        c2 = str.charAt(i4);
                                        if (c2 == '\"') {
                                            break;
                                        }
                                        if (c2 == '\\') {
                                            i4++;
                                        }
                                        i4++;
                                    }
                                    if (c2 == '\"') {
                                        str2 = c(str.substring(i3, i4));
                                        i = i4 + 1;
                                    } else {
                                        throw new d("Encountered unterminated quoted parameter value.");
                                    }
                                } else {
                                    throw new d("Encountered unterminated quoted parameter value.");
                                }
                            } else if (a(charAt)) {
                                i = a5;
                                while (i < length && a(str.charAt(i))) {
                                    i++;
                                }
                                str2 = str.substring(a5, i);
                            } else {
                                throw new d("Unexpected character encountered at index " + a5);
                            }
                            this.f19851a.put(lowerCase, str2);
                            a2 = a(str, i);
                        } else {
                            throw new d("Couldn't find a value for parameter named " + lowerCase);
                        }
                    } else {
                        return;
                    }
                }
                if (a2 < length) {
                    throw new d("More characters encountered in input than expected.");
                }
            }
        }
    }

    private static int a(String str, int i) {
        int length = str.length();
        while (i < length && Character.isWhitespace(str.charAt(i))) {
            i++;
        }
        return i;
    }
}
