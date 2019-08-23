package com.bytedance.im.core.b.e;

import android.text.TextUtils;
import com.bytedance.im.core.a.c;
import com.bytedance.im.core.c.d;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;

public final class h {
    private static String a(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("\t");
        }
        return sb.toString();
    }

    private static String a(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (i > 0 && 10 == sb.charAt(sb.length() - 1)) {
                sb.append(a(i));
            }
            if (charAt != ',') {
                if (charAt != '[') {
                    if (charAt != ']') {
                        if (charAt != '{') {
                            if (charAt != '}') {
                                sb.append(charAt);
                            }
                        }
                    }
                    sb.append("\n");
                    i--;
                    sb.append(a(i));
                    sb.append(charAt);
                }
                sb.append(charAt);
                sb.append("\n");
                i++;
            } else {
                sb.append(charAt);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static void a(String str, Object obj) {
        try {
            if (d.f21249a != null) {
                d.f21249a.a(obj);
            }
            if (d.a()) {
                if (!TextUtils.isEmpty(str)) {
                    d.b(str);
                }
                if (c.a().b().f20896b == 0) {
                    d.b(obj.toString());
                    return;
                }
                String json = c.f21187a.toJson(obj);
                if (c.a().b().f20896b == 2) {
                    int length = json.length();
                    StringBuilder sb = new StringBuilder(length);
                    int i = 0;
                    while (i < length) {
                        int i2 = i + 1;
                        char charAt = json.charAt(i);
                        if (charAt == '\\') {
                            i = i2 + 1;
                            char charAt2 = json.charAt(i2);
                            if (charAt2 == 'u') {
                                i2 = i;
                                int i3 = 0;
                                int i4 = 0;
                                while (i3 < 4) {
                                    int i5 = i2 + 1;
                                    char charAt3 = json.charAt(i2);
                                    switch (charAt3) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            i4 = ((i4 << 4) + charAt3) - 48;
                                            break;
                                        default:
                                            switch (charAt3) {
                                                case 'A':
                                                case 'B':
                                                case 'C':
                                                case 'D':
                                                case 'E':
                                                case 'F':
                                                    i4 = (((i4 << 4) + 10) + charAt3) - 65;
                                                    break;
                                                default:
                                                    switch (charAt3) {
                                                        case 'a':
                                                        case 'b':
                                                        case 'c':
                                                        case 'd':
                                                        case BaseLoginOrRegisterActivity.o /*101*/:
                                                        case 'f':
                                                            i4 = (((i4 << 4) + 10) + charAt3) - 97;
                                                            break;
                                                        default:
                                                            throw new IllegalArgumentException("Malformed   \\uxxxx   encoding.");
                                                    }
                                            }
                                    }
                                    i3++;
                                    i2 = i5;
                                }
                                sb.append((char) i4);
                            } else {
                                if (charAt2 == 't') {
                                    charAt2 = 9;
                                } else if (charAt2 == 'r') {
                                    charAt2 = 13;
                                } else if (charAt2 == 'n') {
                                    charAt2 = 10;
                                } else if (charAt2 == 'f') {
                                    charAt2 = 12;
                                }
                                sb.append(charAt2);
                            }
                        } else {
                            sb.append(charAt);
                        }
                        i = i2;
                    }
                    json = a(sb.toString());
                }
                while (json.length() > 1996) {
                    d.b(json.substring(0, 1996));
                    json = json.substring(1996);
                }
                d.b(json);
            }
        } catch (Exception unused) {
        }
    }
}
