package com.ss.android.ugc.aweme.im.sdk.k;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

public final class h implements s {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51741a;

    /* renamed from: b  reason: collision with root package name */
    private final Charset f51742b;

    public h(Charset charset) {
        this.f51742b = charset;
    }

    public final String a(byte[] bArr) throws IOException {
        if (!PatchProxy.isSupport(new Object[]{bArr}, this, f51741a, false, 54240, new Class[]{byte[].class}, String.class)) {
            return this.f51742b.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bArr)).toString();
        }
        return (String) PatchProxy.accessDispatch(new Object[]{bArr}, this, f51741a, false, 54240, new Class[]{byte[].class}, String.class);
    }

    public final boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f51741a, false, 54238, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f51741a, false, 54238, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        CharsetEncoder newEncoder = this.f51742b.newEncoder();
        newEncoder.onMalformedInput(CodingErrorAction.REPORT);
        newEncoder.onUnmappableCharacter(CodingErrorAction.REPORT);
        return newEncoder.canEncode(str2);
    }

    public final ByteBuffer b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f51741a, false, 54239, new Class[]{String.class}, ByteBuffer.class)) {
            return (ByteBuffer) PatchProxy.accessDispatch(new Object[]{str}, this, f51741a, false, 54239, new Class[]{String.class}, ByteBuffer.class);
        }
        CharsetEncoder newEncoder = this.f51742b.newEncoder();
        newEncoder.onMalformedInput(CodingErrorAction.REPORT);
        newEncoder.onUnmappableCharacter(CodingErrorAction.REPORT);
        CharBuffer wrap = CharBuffer.wrap(str);
        ByteBuffer allocate = ByteBuffer.allocate(str.length() + ((str.length() + 1) / 2));
        while (true) {
            if (wrap.remaining() <= 0) {
                break;
            }
            CoderResult encode = newEncoder.encode(wrap, allocate, true);
            if (encode.isUnmappable() || encode.isMalformed()) {
                if (encode.length() * 6 > allocate.remaining()) {
                    allocate = t.a(allocate, allocate.position() + (encode.length() * 6));
                }
                for (int i = 0; i < encode.length(); i++) {
                    t.a(allocate, wrap.get());
                }
            } else if (encode.isOverflow()) {
                allocate = t.a(allocate, 0);
            } else if (encode.isUnderflow()) {
                newEncoder.flush(allocate);
                break;
            }
        }
        allocate.limit(allocate.position());
        allocate.rewind();
        return allocate;
    }
}
