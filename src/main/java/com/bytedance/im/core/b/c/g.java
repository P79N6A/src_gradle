package com.bytedance.im.core.b.c;

import android.util.Pair;
import com.bytedance.im.core.a.c;
import com.bytedance.im.core.a.e;
import com.bytedance.im.core.b.e.d;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.Response;
import net.jpountz.lz4.LZ4Factory;

public final class g {
    public static Pair<String, byte[]> a(Request request) throws a {
        if (request == null || request.cmd.intValue() <= IMCMD.IMCMD_NOT_USED.getValue()) {
            throw new a(-2002);
        }
        e b2 = c.a().b();
        byte[] encode = request.encode();
        float length = (float) encode.length;
        if (b2 == null) {
            throw new a(-2001);
        } else if (encode.length <= b2.h) {
            return new Pair<>("pb", encode);
        } else {
            byte[] compress = LZ4Factory.fastestInstance().fastCompressor().compress(encode);
            d.a("compress rate = " + (((float) compress.length) / length));
            if (compress.length <= b2.g) {
                return new Pair<>("__lz4", compress);
            }
            throw new a(-2004);
        }
    }

    public static Response a(String str, byte[] bArr) throws a {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            if ("__lz4".equals(str)) {
                bArr = LZ4Factory.fastestInstance().safeDecompressor().decompress(bArr, bArr.length * 3);
            }
            return (Response) Response.ADAPTER.decode(bArr);
        } catch (Exception unused) {
            throw new a(-2003);
        }
    }
}
