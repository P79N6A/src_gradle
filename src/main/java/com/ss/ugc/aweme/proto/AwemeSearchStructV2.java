package com.ss.ugc.aweme.proto;

import android.support.annotation.Keep;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.io.IOException;
import okio.ByteString;

public final class AwemeSearchStructV2 extends Message<AwemeSearchStructV2, Builder> {
    @Keep
    public static final ProtoAdapter<AwemeSearchStructV2> ADAPTER = new ProtoAdapter_AwemeSearchStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String challenge_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public Integer rank;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String search_word;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String sentence;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public Long value;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public Integer vb_rank;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
    public Long vb_rank_value;

    public static final class Builder extends Message.Builder<AwemeSearchStructV2, Builder> {
        public String challenge_id;
        public Integer rank;
        public String search_word;
        public String sentence;
        public Long value;
        public Integer vb_rank;
        public Long vb_rank_value;

        public final AwemeSearchStructV2 build() {
            AwemeSearchStructV2 awemeSearchStructV2 = new AwemeSearchStructV2(this.sentence, this.challenge_id, this.search_word, this.value, this.vb_rank, this.vb_rank_value, this.rank, super.buildUnknownFields());
            return awemeSearchStructV2;
        }

        public final Builder challenge_id(String str) {
            this.challenge_id = str;
            return this;
        }

        public final Builder rank(Integer num) {
            this.rank = num;
            return this;
        }

        public final Builder search_word(String str) {
            this.search_word = str;
            return this;
        }

        public final Builder sentence(String str) {
            this.sentence = str;
            return this;
        }

        public final Builder value(Long l) {
            this.value = l;
            return this;
        }

        public final Builder vb_rank(Integer num) {
            this.vb_rank = num;
            return this;
        }

        public final Builder vb_rank_value(Long l) {
            this.vb_rank_value = l;
            return this;
        }
    }

    static final class ProtoAdapter_AwemeSearchStructV2 extends ProtoAdapter<AwemeSearchStructV2> {
        public ProtoAdapter_AwemeSearchStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeSearchStructV2.class);
        }

        public final int encodedSize(AwemeSearchStructV2 awemeSearchStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, awemeSearchStructV2.sentence) + ProtoAdapter.STRING.encodedSizeWithTag(2, awemeSearchStructV2.challenge_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, awemeSearchStructV2.search_word) + ProtoAdapter.INT64.encodedSizeWithTag(4, awemeSearchStructV2.value) + ProtoAdapter.INT32.encodedSizeWithTag(5, awemeSearchStructV2.vb_rank) + ProtoAdapter.INT64.encodedSizeWithTag(6, awemeSearchStructV2.vb_rank_value) + ProtoAdapter.INT32.encodedSizeWithTag(7, awemeSearchStructV2.rank) + awemeSearchStructV2.unknownFields().size();
        }

        public final AwemeSearchStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.sentence((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.challenge_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.search_word((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.value((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 5:
                            builder.vb_rank((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 6:
                            builder.vb_rank_value((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case e.l /*?: ONE_ARG  (7 int)*/:
                            builder.rank((Integer) ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, AwemeSearchStructV2 awemeSearchStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, awemeSearchStructV2.sentence);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, awemeSearchStructV2.challenge_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, awemeSearchStructV2.search_word);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, awemeSearchStructV2.value);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, awemeSearchStructV2.vb_rank);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, awemeSearchStructV2.vb_rank_value);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, awemeSearchStructV2.rank);
            protoWriter.writeBytes(awemeSearchStructV2.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.sentence = this.sentence;
        builder.challenge_id = this.challenge_id;
        builder.search_word = this.search_word;
        builder.value = this.value;
        builder.vb_rank = this.vb_rank;
        builder.vb_rank_value = this.vb_rank_value;
        builder.rank = this.rank;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.hashCode;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i8 = 0;
        if (this.sentence != null) {
            i = this.sentence.hashCode();
        } else {
            i = 0;
        }
        int i9 = (hashCode + i) * 37;
        if (this.challenge_id != null) {
            i2 = this.challenge_id.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = (i9 + i2) * 37;
        if (this.search_word != null) {
            i3 = this.search_word.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 37;
        if (this.value != null) {
            i4 = this.value.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 37;
        if (this.vb_rank != null) {
            i5 = this.vb_rank.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 37;
        if (this.vb_rank_value != null) {
            i6 = this.vb_rank_value.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 37;
        if (this.rank != null) {
            i8 = this.rank.hashCode();
        }
        int i15 = i14 + i8;
        this.hashCode = i15;
        return i15;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.sentence != null) {
            sb.append(", sentence=");
            sb.append(this.sentence);
        }
        if (this.challenge_id != null) {
            sb.append(", challenge_id=");
            sb.append(this.challenge_id);
        }
        if (this.search_word != null) {
            sb.append(", search_word=");
            sb.append(this.search_word);
        }
        if (this.value != null) {
            sb.append(", value=");
            sb.append(this.value);
        }
        if (this.vb_rank != null) {
            sb.append(", vb_rank=");
            sb.append(this.vb_rank);
        }
        if (this.vb_rank_value != null) {
            sb.append(", vb_rank_value=");
            sb.append(this.vb_rank_value);
        }
        if (this.rank != null) {
            sb.append(", rank=");
            sb.append(this.rank);
        }
        StringBuilder replace = sb.replace(0, 2, "AwemeSearchStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeSearchStructV2)) {
            return false;
        }
        AwemeSearchStructV2 awemeSearchStructV2 = (AwemeSearchStructV2) obj;
        if (!unknownFields().equals(awemeSearchStructV2.unknownFields()) || !Internal.equals(this.sentence, awemeSearchStructV2.sentence) || !Internal.equals(this.challenge_id, awemeSearchStructV2.challenge_id) || !Internal.equals(this.search_word, awemeSearchStructV2.search_word) || !Internal.equals(this.value, awemeSearchStructV2.value) || !Internal.equals(this.vb_rank, awemeSearchStructV2.vb_rank) || !Internal.equals(this.vb_rank_value, awemeSearchStructV2.vb_rank_value) || !Internal.equals(this.rank, awemeSearchStructV2.rank)) {
            return false;
        }
        return true;
    }

    public AwemeSearchStructV2(String str, String str2, String str3, Long l, Integer num, Long l2, Integer num2) {
        this(str, str2, str3, l, num, l2, num2, ByteString.EMPTY);
    }

    public AwemeSearchStructV2(String str, String str2, String str3, Long l, Integer num, Long l2, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sentence = str;
        this.challenge_id = str2;
        this.search_word = str3;
        this.value = l;
        this.vb_rank = num;
        this.vb_rank_value = l2;
        this.rank = num2;
    }
}
