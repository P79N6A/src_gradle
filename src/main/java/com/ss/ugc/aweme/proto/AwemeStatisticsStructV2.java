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

public final class AwemeStatisticsStructV2 extends Message<AwemeStatisticsStructV2, Builder> {
    @Keep
    public static final ProtoAdapter<AwemeStatisticsStructV2> ADAPTER = new ProtoAdapter_AwemeStatisticsStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String aweme_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer comment_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer digg_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer download_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public Integer forward_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public Integer play_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public Integer share_count;

    public static final class Builder extends Message.Builder<AwemeStatisticsStructV2, Builder> {
        public String aweme_id;
        public Integer comment_count;
        public Integer digg_count;
        public Integer download_count;
        public Integer forward_count;
        public Integer play_count;
        public Integer share_count;

        public final AwemeStatisticsStructV2 build() {
            AwemeStatisticsStructV2 awemeStatisticsStructV2 = new AwemeStatisticsStructV2(this.aweme_id, this.comment_count, this.digg_count, this.download_count, this.play_count, this.share_count, this.forward_count, super.buildUnknownFields());
            return awemeStatisticsStructV2;
        }

        public final Builder aweme_id(String str) {
            this.aweme_id = str;
            return this;
        }

        public final Builder comment_count(Integer num) {
            this.comment_count = num;
            return this;
        }

        public final Builder digg_count(Integer num) {
            this.digg_count = num;
            return this;
        }

        public final Builder download_count(Integer num) {
            this.download_count = num;
            return this;
        }

        public final Builder forward_count(Integer num) {
            this.forward_count = num;
            return this;
        }

        public final Builder play_count(Integer num) {
            this.play_count = num;
            return this;
        }

        public final Builder share_count(Integer num) {
            this.share_count = num;
            return this;
        }
    }

    static final class ProtoAdapter_AwemeStatisticsStructV2 extends ProtoAdapter<AwemeStatisticsStructV2> {
        public ProtoAdapter_AwemeStatisticsStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeStatisticsStructV2.class);
        }

        public final int encodedSize(AwemeStatisticsStructV2 awemeStatisticsStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, awemeStatisticsStructV2.aweme_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, awemeStatisticsStructV2.comment_count) + ProtoAdapter.INT32.encodedSizeWithTag(3, awemeStatisticsStructV2.digg_count) + ProtoAdapter.INT32.encodedSizeWithTag(4, awemeStatisticsStructV2.download_count) + ProtoAdapter.INT32.encodedSizeWithTag(5, awemeStatisticsStructV2.play_count) + ProtoAdapter.INT32.encodedSizeWithTag(6, awemeStatisticsStructV2.share_count) + ProtoAdapter.INT32.encodedSizeWithTag(7, awemeStatisticsStructV2.forward_count) + awemeStatisticsStructV2.unknownFields().size();
        }

        public final AwemeStatisticsStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.aweme_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.comment_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.digg_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.download_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 5:
                            builder.play_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 6:
                            builder.share_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case e.l /*?: ONE_ARG  (7 int)*/:
                            builder.forward_count((Integer) ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, AwemeStatisticsStructV2 awemeStatisticsStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, awemeStatisticsStructV2.aweme_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, awemeStatisticsStructV2.comment_count);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, awemeStatisticsStructV2.digg_count);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, awemeStatisticsStructV2.download_count);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, awemeStatisticsStructV2.play_count);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, awemeStatisticsStructV2.share_count);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, awemeStatisticsStructV2.forward_count);
            protoWriter.writeBytes(awemeStatisticsStructV2.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.aweme_id = this.aweme_id;
        builder.comment_count = this.comment_count;
        builder.digg_count = this.digg_count;
        builder.download_count = this.download_count;
        builder.play_count = this.play_count;
        builder.share_count = this.share_count;
        builder.forward_count = this.forward_count;
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
        if (this.aweme_id != null) {
            i = this.aweme_id.hashCode();
        } else {
            i = 0;
        }
        int i9 = (hashCode + i) * 37;
        if (this.comment_count != null) {
            i2 = this.comment_count.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = (i9 + i2) * 37;
        if (this.digg_count != null) {
            i3 = this.digg_count.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 37;
        if (this.download_count != null) {
            i4 = this.download_count.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 37;
        if (this.play_count != null) {
            i5 = this.play_count.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 37;
        if (this.share_count != null) {
            i6 = this.share_count.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 37;
        if (this.forward_count != null) {
            i8 = this.forward_count.hashCode();
        }
        int i15 = i14 + i8;
        this.hashCode = i15;
        return i15;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.aweme_id != null) {
            sb.append(", aweme_id=");
            sb.append(this.aweme_id);
        }
        if (this.comment_count != null) {
            sb.append(", comment_count=");
            sb.append(this.comment_count);
        }
        if (this.digg_count != null) {
            sb.append(", digg_count=");
            sb.append(this.digg_count);
        }
        if (this.download_count != null) {
            sb.append(", download_count=");
            sb.append(this.download_count);
        }
        if (this.play_count != null) {
            sb.append(", play_count=");
            sb.append(this.play_count);
        }
        if (this.share_count != null) {
            sb.append(", share_count=");
            sb.append(this.share_count);
        }
        if (this.forward_count != null) {
            sb.append(", forward_count=");
            sb.append(this.forward_count);
        }
        StringBuilder replace = sb.replace(0, 2, "AwemeStatisticsStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeStatisticsStructV2)) {
            return false;
        }
        AwemeStatisticsStructV2 awemeStatisticsStructV2 = (AwemeStatisticsStructV2) obj;
        if (!unknownFields().equals(awemeStatisticsStructV2.unknownFields()) || !Internal.equals(this.aweme_id, awemeStatisticsStructV2.aweme_id) || !Internal.equals(this.comment_count, awemeStatisticsStructV2.comment_count) || !Internal.equals(this.digg_count, awemeStatisticsStructV2.digg_count) || !Internal.equals(this.download_count, awemeStatisticsStructV2.download_count) || !Internal.equals(this.play_count, awemeStatisticsStructV2.play_count) || !Internal.equals(this.share_count, awemeStatisticsStructV2.share_count) || !Internal.equals(this.forward_count, awemeStatisticsStructV2.forward_count)) {
            return false;
        }
        return true;
    }

    public AwemeStatisticsStructV2(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        this(str, num, num2, num3, num4, num5, num6, ByteString.EMPTY);
    }

    public AwemeStatisticsStructV2(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.aweme_id = str;
        this.comment_count = num;
        this.digg_count = num2;
        this.download_count = num3;
        this.play_count = num4;
        this.share_count = num5;
        this.forward_count = num6;
    }
}
