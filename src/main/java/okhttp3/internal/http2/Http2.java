package okhttp3.internal.http2;

import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.io.IOException;
import okhttp3.internal.Util;
import okio.ByteString;

public final class Http2 {
    static final String[] BINARY = new String[256];
    static final ByteString CONNECTION_PREFACE = ByteString.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    static final String[] FLAGS = new String[64];
    private static final String[] FRAME_NAMES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    private Http2() {
    }

    static {
        for (int i = 0; i < BINARY.length; i++) {
            BINARY[i] = Util.format("%8s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        FLAGS[0] = "";
        FLAGS[1] = "END_STREAM";
        int[] iArr = {1};
        FLAGS[8] = "PADDED";
        for (int i2 = 0; i2 <= 0; i2++) {
            int i3 = iArr[i2];
            FLAGS[i3 | 8] = FLAGS[i3] + "|PADDED";
        }
        FLAGS[4] = "END_HEADERS";
        FLAGS[32] = "PRIORITY";
        FLAGS[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            for (int i6 = 0; i6 <= 0; i6++) {
                int i7 = iArr[i6];
                String[] strArr = FLAGS;
                int i8 = i7 | i5;
                strArr[i8] = FLAGS[i7] + '|' + FLAGS[i5];
                FLAGS[i8 | 8] = FLAGS[i7] + '|' + FLAGS[i5] + "|PADDED";
            }
        }
        for (int i9 = 0; i9 < FLAGS.length; i9++) {
            if (FLAGS[i9] == null) {
                FLAGS[i9] = BINARY[i9];
            }
        }
    }

    static IllegalArgumentException illegalArgument(String str, Object... objArr) {
        throw new IllegalArgumentException(Util.format(str, objArr));
    }

    static IOException ioException(String str, Object... objArr) throws IOException {
        throw new IOException(Util.format(str, objArr));
    }

    static String formatFlags(byte b2, byte b3) {
        String str;
        if (b3 == 0) {
            return "";
        }
        switch (b2) {
            case 2:
            case 3:
            case e.l:
            case 8:
                return BINARY[b3];
            case 4:
            case 6:
                if (b3 == 1) {
                    return "ACK";
                }
                return BINARY[b3];
            default:
                if (b3 < FLAGS.length) {
                    str = FLAGS[b3];
                } else {
                    str = BINARY[b3];
                }
                if (b2 == 5 && (b3 & 4) != 0) {
                    return str.replace("HEADERS", "PUSH_PROMISE");
                }
                if (b2 != 0 || (b3 & 32) == 0) {
                    return str;
                }
                return str.replace("PRIORITY", "COMPRESSED");
        }
    }

    static String frameLog(boolean z, int i, int i2, byte b2, byte b3) {
        String str;
        String str2;
        if (b2 < FRAME_NAMES.length) {
            str = FRAME_NAMES[b2];
        } else {
            str = Util.format("0x%02x", Byte.valueOf(b2));
        }
        String formatFlags = formatFlags(b2, b3);
        Object[] objArr = new Object[5];
        if (z) {
            str2 = "<<";
        } else {
            str2 = ">>";
        }
        objArr[0] = str2;
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = str;
        objArr[4] = formatFlags;
        return Util.format("%s 0x%08x %5d %-13s %s", objArr);
    }
}
