package com.squareup.wire;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import java.io.IOException;

public abstract class EnumAdapter<E extends WireEnum> extends ProtoAdapter<E> {
    /* access modifiers changed from: protected */
    public abstract E fromValue(int i);

    protected EnumAdapter(Class<E> cls) {
        super(FieldEncoding.VARINT, cls);
    }

    public final int encodedSize(E e2) {
        return ProtoWriter.varint32Size(e2.getValue());
    }

    public final E decode(ProtoReader protoReader) throws IOException {
        int readVarint32 = protoReader.readVarint32();
        E fromValue = fromValue(readVarint32);
        if (fromValue != null) {
            return fromValue;
        }
        throw new ProtoAdapter.EnumConstantNotFoundException(readVarint32, this.javaType);
    }

    public final void encode(ProtoWriter protoWriter, E e2) throws IOException {
        protoWriter.writeVarint32(e2.getValue());
    }
}
