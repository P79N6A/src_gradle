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

public final class AwemeStarAtlasStructV2 extends Message<AwemeStarAtlasStructV2, Builder> {
    @Keep
    public static final ProtoAdapter<AwemeStarAtlasStructV2> ADAPTER = new ProtoAdapter_AwemeStarAtlasStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer review_status;

    public static final class Builder extends Message.Builder<AwemeStarAtlasStructV2, Builder> {
        public Integer review_status;

        public final AwemeStarAtlasStructV2 build() {
            return new AwemeStarAtlasStructV2(this.review_status, super.buildUnknownFields());
        }

        public final Builder review_status(Integer num) {
            this.review_status = num;
            return this;
        }
    }

    static final class ProtoAdapter_AwemeStarAtlasStructV2 extends ProtoAdapter<AwemeStarAtlasStructV2> {
        public ProtoAdapter_AwemeStarAtlasStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeStarAtlasStructV2.class);
        }

        public final int encodedSize(AwemeStarAtlasStructV2 awemeStarAtlasStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, awemeStarAtlasStructV2.review_status) + awemeStarAtlasStructV2.unknownFields().size();
        }

        public final AwemeStarAtlasStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.review_status((Integer) ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, AwemeStarAtlasStructV2 awemeStarAtlasStructV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, awemeStarAtlasStructV2.review_status);
            protoWriter.writeBytes(awemeStarAtlasStructV2.unknownFields());
        }
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        if (this.review_status != null) {
            i = this.review_status.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.review_status = this.review_status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.review_status != null) {
            sb.append(", review_status=");
            sb.append(this.review_status);
        }
        StringBuilder replace = sb.replace(0, 2, "AwemeStarAtlasStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public AwemeStarAtlasStructV2(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeStarAtlasStructV2)) {
            return false;
        }
        AwemeStarAtlasStructV2 awemeStarAtlasStructV2 = (AwemeStarAtlasStructV2) obj;
        if (!unknownFields().equals(awemeStarAtlasStructV2.unknownFields()) || !Internal.equals(this.review_status, awemeStarAtlasStructV2.review_status)) {
            return false;
        }
        return true;
    }

    public AwemeStarAtlasStructV2(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.review_status = num;
    }
}
