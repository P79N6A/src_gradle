package com.ss.ugc.aweme.proto;

import android.support.annotation.Keep;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class DouplusToastStructV2 extends Message<DouplusToastStructV2, Builder> {
    @Keep
    public static final ProtoAdapter<DouplusToastStructV2> ADAPTER = new ProtoAdapter_DouplusToastStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String toast;

    public static final class Builder extends Message.Builder<DouplusToastStructV2, Builder> {
        public Integer id;
        public String toast;

        public final DouplusToastStructV2 build() {
            return new DouplusToastStructV2(this.id, this.toast, super.buildUnknownFields());
        }

        public final Builder id(Integer num) {
            this.id = num;
            return this;
        }

        public final Builder toast(String str) {
            this.toast = str;
            return this;
        }
    }

    static final class ProtoAdapter_DouplusToastStructV2 extends ProtoAdapter<DouplusToastStructV2> {
        public ProtoAdapter_DouplusToastStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, DouplusToastStructV2.class);
        }

        public final int encodedSize(DouplusToastStructV2 douplusToastStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, douplusToastStructV2.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, douplusToastStructV2.toast) + douplusToastStructV2.unknownFields().size();
        }

        public final DouplusToastStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.id((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.toast((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, DouplusToastStructV2 douplusToastStructV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, douplusToastStructV2.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, douplusToastStructV2.toast);
            protoWriter.writeBytes(douplusToastStructV2.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.toast = this.toast;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i3 = 0;
        if (this.id != null) {
            i = this.id.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.toast != null) {
            i3 = this.toast.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.toast != null) {
            sb.append(", toast=");
            sb.append(this.toast);
        }
        StringBuilder replace = sb.replace(0, 2, "DouplusToastStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DouplusToastStructV2)) {
            return false;
        }
        DouplusToastStructV2 douplusToastStructV2 = (DouplusToastStructV2) obj;
        if (!unknownFields().equals(douplusToastStructV2.unknownFields()) || !Internal.equals(this.id, douplusToastStructV2.id) || !Internal.equals(this.toast, douplusToastStructV2.toast)) {
            return false;
        }
        return true;
    }

    public DouplusToastStructV2(Integer num, String str) {
        this(num, str, ByteString.EMPTY);
    }

    public DouplusToastStructV2(Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = num;
        this.toast = str;
    }
}
