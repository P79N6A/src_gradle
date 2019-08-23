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

public final class RelativeUserStructV2 extends Message<RelativeUserStructV2, Builder> {
    @Keep
    public static final ProtoAdapter<RelativeUserStructV2> ADAPTER = new ProtoAdapter_RelativeUserStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 2)
    public UrlStructV2 avatar;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long uid;

    public static final class Builder extends Message.Builder<RelativeUserStructV2, Builder> {
        public UrlStructV2 avatar;
        public Long uid;

        public final RelativeUserStructV2 build() {
            return new RelativeUserStructV2(this.uid, this.avatar, super.buildUnknownFields());
        }

        public final Builder avatar(UrlStructV2 urlStructV2) {
            this.avatar = urlStructV2;
            return this;
        }

        public final Builder uid(Long l) {
            this.uid = l;
            return this;
        }
    }

    static final class ProtoAdapter_RelativeUserStructV2 extends ProtoAdapter<RelativeUserStructV2> {
        public ProtoAdapter_RelativeUserStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, RelativeUserStructV2.class);
        }

        public final int encodedSize(RelativeUserStructV2 relativeUserStructV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, relativeUserStructV2.uid) + UrlStructV2.ADAPTER.encodedSizeWithTag(2, relativeUserStructV2.avatar) + relativeUserStructV2.unknownFields().size();
        }

        public final RelativeUserStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.uid((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.avatar((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, RelativeUserStructV2 relativeUserStructV2) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, relativeUserStructV2.uid);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 2, relativeUserStructV2.avatar);
            protoWriter.writeBytes(relativeUserStructV2.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.uid = this.uid;
        builder.avatar = this.avatar;
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
        if (this.uid != null) {
            i = this.uid.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.avatar != null) {
            i3 = this.avatar.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.uid != null) {
            sb.append(", uid=");
            sb.append(this.uid);
        }
        if (this.avatar != null) {
            sb.append(", avatar=");
            sb.append(this.avatar);
        }
        StringBuilder replace = sb.replace(0, 2, "RelativeUserStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RelativeUserStructV2)) {
            return false;
        }
        RelativeUserStructV2 relativeUserStructV2 = (RelativeUserStructV2) obj;
        if (!unknownFields().equals(relativeUserStructV2.unknownFields()) || !Internal.equals(this.uid, relativeUserStructV2.uid) || !Internal.equals(this.avatar, relativeUserStructV2.avatar)) {
            return false;
        }
        return true;
    }

    public RelativeUserStructV2(Long l, UrlStructV2 urlStructV2) {
        this(l, urlStructV2, ByteString.EMPTY);
    }

    public RelativeUserStructV2(Long l, UrlStructV2 urlStructV2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.uid = l;
        this.avatar = urlStructV2;
    }
}
