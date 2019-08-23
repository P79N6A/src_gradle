package org.msgpack;

import java.io.IOException;
import org.msgpack.packer.BufferPacker;
import org.msgpack.packer.MessagePackBufferPacker;
import org.msgpack.template.Template;
import org.msgpack.template.TemplateRegistry;
import org.msgpack.unpacker.BufferUnpacker;
import org.msgpack.unpacker.MessagePackBufferUnpacker;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final a f84179b = new a();

    /* renamed from: a  reason: collision with root package name */
    private TemplateRegistry f84180a = new TemplateRegistry(null);

    private BufferPacker a() {
        return new MessagePackBufferPacker(this);
    }

    private BufferUnpacker a(byte[] bArr) {
        return new MessagePackBufferUnpacker(this).wrap(bArr);
    }

    public final <T> Template<T> a(Class<T> cls) {
        return this.f84180a.lookup(cls);
    }

    public final <T> T a(byte[] bArr, Template<T> template) throws IOException {
        return a(bArr, null, template);
    }

    public final <T> byte[] a(T t, Template<T> template) throws IOException {
        BufferPacker a2 = a();
        template.write(a2, t);
        return a2.toByteArray();
    }

    private <T> T a(byte[] bArr, T t, Template<T> template) throws IOException {
        return template.read(a(bArr), null);
    }
}
