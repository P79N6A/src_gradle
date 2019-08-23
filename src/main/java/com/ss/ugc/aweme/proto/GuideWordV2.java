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

public final class GuideWordV2 extends Message<GuideWordV2, Builder> {
    @Keep
    public static final ProtoAdapter<GuideWordV2> ADAPTER = new ProtoAdapter_GuideWordV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String search_word;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String word;

    public static final class Builder extends Message.Builder<GuideWordV2, Builder> {
        public String search_word;
        public Integer type;
        public String word;

        public final GuideWordV2 build() {
            return new GuideWordV2(this.word, this.search_word, this.type, super.buildUnknownFields());
        }

        public final Builder search_word(String str) {
            this.search_word = str;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }

        public final Builder word(String str) {
            this.word = str;
            return this;
        }
    }

    static final class ProtoAdapter_GuideWordV2 extends ProtoAdapter<GuideWordV2> {
        public ProtoAdapter_GuideWordV2() {
            super(FieldEncoding.LENGTH_DELIMITED, GuideWordV2.class);
        }

        public final int encodedSize(GuideWordV2 guideWordV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, guideWordV2.word) + ProtoAdapter.STRING.encodedSizeWithTag(2, guideWordV2.search_word) + ProtoAdapter.INT32.encodedSizeWithTag(3, guideWordV2.type) + guideWordV2.unknownFields().size();
        }

        public final GuideWordV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.word((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.search_word((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.type((Integer) ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, GuideWordV2 guideWordV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, guideWordV2.word);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, guideWordV2.search_word);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, guideWordV2.type);
            protoWriter.writeBytes(guideWordV2.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.word = this.word;
        builder.search_word = this.search_word;
        builder.type = this.type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i4 = 0;
        if (this.word != null) {
            i = this.word.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.search_word != null) {
            i2 = this.search_word.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.type != null) {
            i4 = this.type.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.word != null) {
            sb.append(", word=");
            sb.append(this.word);
        }
        if (this.search_word != null) {
            sb.append(", search_word=");
            sb.append(this.search_word);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        StringBuilder replace = sb.replace(0, 2, "GuideWordV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GuideWordV2)) {
            return false;
        }
        GuideWordV2 guideWordV2 = (GuideWordV2) obj;
        if (!unknownFields().equals(guideWordV2.unknownFields()) || !Internal.equals(this.word, guideWordV2.word) || !Internal.equals(this.search_word, guideWordV2.search_word) || !Internal.equals(this.type, guideWordV2.type)) {
            return false;
        }
        return true;
    }

    public GuideWordV2(String str, String str2, Integer num) {
        this(str, str2, num, ByteString.EMPTY);
    }

    public GuideWordV2(String str, String str2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.word = str;
        this.search_word = str2;
        this.type = num;
    }
}
