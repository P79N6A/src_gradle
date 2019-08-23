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

public final class CommerceUserStructV2 extends Message<CommerceUserStructV2, Builder> {
    @Keep
    public static final ProtoAdapter<CommerceUserStructV2> ADAPTER = new ProtoAdapter_CommerceUserStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public Boolean show_star_atlas_cooperation;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer star_atlas;

    public static final class Builder extends Message.Builder<CommerceUserStructV2, Builder> {
        public Boolean show_star_atlas_cooperation;
        public Integer star_atlas;

        public final CommerceUserStructV2 build() {
            return new CommerceUserStructV2(this.star_atlas, this.show_star_atlas_cooperation, super.buildUnknownFields());
        }

        public final Builder show_star_atlas_cooperation(Boolean bool) {
            this.show_star_atlas_cooperation = bool;
            return this;
        }

        public final Builder star_atlas(Integer num) {
            this.star_atlas = num;
            return this;
        }
    }

    static final class ProtoAdapter_CommerceUserStructV2 extends ProtoAdapter<CommerceUserStructV2> {
        public ProtoAdapter_CommerceUserStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, CommerceUserStructV2.class);
        }

        public final int encodedSize(CommerceUserStructV2 commerceUserStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, commerceUserStructV2.star_atlas) + ProtoAdapter.BOOL.encodedSizeWithTag(2, commerceUserStructV2.show_star_atlas_cooperation) + commerceUserStructV2.unknownFields().size();
        }

        public final CommerceUserStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.star_atlas((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.show_star_atlas_cooperation((Boolean) ProtoAdapter.BOOL.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, CommerceUserStructV2 commerceUserStructV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, commerceUserStructV2.star_atlas);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, commerceUserStructV2.show_star_atlas_cooperation);
            protoWriter.writeBytes(commerceUserStructV2.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.star_atlas = this.star_atlas;
        builder.show_star_atlas_cooperation = this.show_star_atlas_cooperation;
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
        if (this.star_atlas != null) {
            i = this.star_atlas.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.show_star_atlas_cooperation != null) {
            i3 = this.show_star_atlas_cooperation.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.star_atlas != null) {
            sb.append(", star_atlas=");
            sb.append(this.star_atlas);
        }
        if (this.show_star_atlas_cooperation != null) {
            sb.append(", show_star_atlas_cooperation=");
            sb.append(this.show_star_atlas_cooperation);
        }
        StringBuilder replace = sb.replace(0, 2, "CommerceUserStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommerceUserStructV2)) {
            return false;
        }
        CommerceUserStructV2 commerceUserStructV2 = (CommerceUserStructV2) obj;
        if (!unknownFields().equals(commerceUserStructV2.unknownFields()) || !Internal.equals(this.star_atlas, commerceUserStructV2.star_atlas) || !Internal.equals(this.show_star_atlas_cooperation, commerceUserStructV2.show_star_atlas_cooperation)) {
            return false;
        }
        return true;
    }

    public CommerceUserStructV2(Integer num, Boolean bool) {
        this(num, bool, ByteString.EMPTY);
    }

    public CommerceUserStructV2(Integer num, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.star_atlas = num;
        this.show_star_atlas_cooperation = bool;
    }
}
