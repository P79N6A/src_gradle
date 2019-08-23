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
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.io.IOException;
import okio.ByteString;

public final class aweme_v2_feed_request extends Message<aweme_v2_feed_request, Builder> {
    @Keep
    public static final ProtoAdapter<aweme_v2_feed_request> ADAPTER = new ProtoAdapter_aweme_v2_feed_request();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 10)
    public Integer address_book_access;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
    public Long aweme_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 13)
    public String content_language;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public Integer feed_style;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 11)
    public Integer gps_access;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long max_cursor;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public Long min_cursor;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 9)
    public Integer need_relieve_aweme;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public Integer pull_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 12)
    public String top_view_cid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public String volume;

    public static final class Builder extends Message.Builder<aweme_v2_feed_request, Builder> {
        public Integer address_book_access;
        public Long aweme_id;
        public String content_language;
        public Integer count;
        public Integer feed_style;
        public Integer gps_access;
        public Long max_cursor;
        public Long min_cursor;
        public Integer need_relieve_aweme;
        public Integer pull_type;
        public String top_view_cid;
        public Integer type;
        public String volume;

        public final aweme_v2_feed_request build() {
            aweme_v2_feed_request aweme_v2_feed_request = new aweme_v2_feed_request(this.type, this.max_cursor, this.min_cursor, this.count, this.feed_style, this.aweme_id, this.pull_type, this.volume, this.need_relieve_aweme, this.address_book_access, this.gps_access, this.top_view_cid, this.content_language, super.buildUnknownFields());
            return aweme_v2_feed_request;
        }

        public final Builder address_book_access(Integer num) {
            this.address_book_access = num;
            return this;
        }

        public final Builder aweme_id(Long l) {
            this.aweme_id = l;
            return this;
        }

        public final Builder content_language(String str) {
            this.content_language = str;
            return this;
        }

        public final Builder count(Integer num) {
            this.count = num;
            return this;
        }

        public final Builder feed_style(Integer num) {
            this.feed_style = num;
            return this;
        }

        public final Builder gps_access(Integer num) {
            this.gps_access = num;
            return this;
        }

        public final Builder max_cursor(Long l) {
            this.max_cursor = l;
            return this;
        }

        public final Builder min_cursor(Long l) {
            this.min_cursor = l;
            return this;
        }

        public final Builder need_relieve_aweme(Integer num) {
            this.need_relieve_aweme = num;
            return this;
        }

        public final Builder pull_type(Integer num) {
            this.pull_type = num;
            return this;
        }

        public final Builder top_view_cid(String str) {
            this.top_view_cid = str;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }

        public final Builder volume(String str) {
            this.volume = str;
            return this;
        }
    }

    static final class ProtoAdapter_aweme_v2_feed_request extends ProtoAdapter<aweme_v2_feed_request> {
        public ProtoAdapter_aweme_v2_feed_request() {
            super(FieldEncoding.LENGTH_DELIMITED, aweme_v2_feed_request.class);
        }

        public final aweme_v2_feed_request decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.max_cursor((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.min_cursor((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 5:
                            builder.feed_style((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 6:
                            builder.aweme_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case e.l /*?: ONE_ARG  (7 int)*/:
                            builder.pull_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 8:
                            builder.volume((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            builder.need_relieve_aweme((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 10:
                            builder.address_book_access((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 11:
                            builder.gps_access((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                            builder.top_view_cid((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 13:
                            builder.content_language((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final int encodedSize(aweme_v2_feed_request aweme_v2_feed_request) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, aweme_v2_feed_request.type) + ProtoAdapter.INT64.encodedSizeWithTag(2, aweme_v2_feed_request.max_cursor) + ProtoAdapter.INT64.encodedSizeWithTag(3, aweme_v2_feed_request.min_cursor) + ProtoAdapter.INT32.encodedSizeWithTag(4, aweme_v2_feed_request.count) + ProtoAdapter.INT32.encodedSizeWithTag(5, aweme_v2_feed_request.feed_style) + ProtoAdapter.INT64.encodedSizeWithTag(6, aweme_v2_feed_request.aweme_id) + ProtoAdapter.INT32.encodedSizeWithTag(7, aweme_v2_feed_request.pull_type) + ProtoAdapter.STRING.encodedSizeWithTag(8, aweme_v2_feed_request.volume) + ProtoAdapter.INT32.encodedSizeWithTag(9, aweme_v2_feed_request.need_relieve_aweme) + ProtoAdapter.INT32.encodedSizeWithTag(10, aweme_v2_feed_request.address_book_access) + ProtoAdapter.INT32.encodedSizeWithTag(11, aweme_v2_feed_request.gps_access) + ProtoAdapter.STRING.encodedSizeWithTag(12, aweme_v2_feed_request.top_view_cid) + ProtoAdapter.STRING.encodedSizeWithTag(13, aweme_v2_feed_request.content_language) + aweme_v2_feed_request.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, aweme_v2_feed_request aweme_v2_feed_request) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, aweme_v2_feed_request.type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, aweme_v2_feed_request.max_cursor);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, aweme_v2_feed_request.min_cursor);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, aweme_v2_feed_request.count);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, aweme_v2_feed_request.feed_style);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, aweme_v2_feed_request.aweme_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, aweme_v2_feed_request.pull_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, aweme_v2_feed_request.volume);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, aweme_v2_feed_request.need_relieve_aweme);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, aweme_v2_feed_request.address_book_access);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, aweme_v2_feed_request.gps_access);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, aweme_v2_feed_request.top_view_cid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, aweme_v2_feed_request.content_language);
            protoWriter.writeBytes(aweme_v2_feed_request.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.max_cursor = this.max_cursor;
        builder.min_cursor = this.min_cursor;
        builder.count = this.count;
        builder.feed_style = this.feed_style;
        builder.aweme_id = this.aweme_id;
        builder.pull_type = this.pull_type;
        builder.volume = this.volume;
        builder.need_relieve_aweme = this.need_relieve_aweme;
        builder.address_book_access = this.address_book_access;
        builder.gps_access = this.gps_access;
        builder.top_view_cid = this.top_view_cid;
        builder.content_language = this.content_language;
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
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i14 = 0;
        if (this.type != null) {
            i = this.type.hashCode();
        } else {
            i = 0;
        }
        int i15 = (hashCode + i) * 37;
        if (this.max_cursor != null) {
            i2 = this.max_cursor.hashCode();
        } else {
            i2 = 0;
        }
        int i16 = (i15 + i2) * 37;
        if (this.min_cursor != null) {
            i3 = this.min_cursor.hashCode();
        } else {
            i3 = 0;
        }
        int i17 = (i16 + i3) * 37;
        if (this.count != null) {
            i4 = this.count.hashCode();
        } else {
            i4 = 0;
        }
        int i18 = (i17 + i4) * 37;
        if (this.feed_style != null) {
            i5 = this.feed_style.hashCode();
        } else {
            i5 = 0;
        }
        int i19 = (i18 + i5) * 37;
        if (this.aweme_id != null) {
            i6 = this.aweme_id.hashCode();
        } else {
            i6 = 0;
        }
        int i20 = (i19 + i6) * 37;
        if (this.pull_type != null) {
            i7 = this.pull_type.hashCode();
        } else {
            i7 = 0;
        }
        int i21 = (i20 + i7) * 37;
        if (this.volume != null) {
            i8 = this.volume.hashCode();
        } else {
            i8 = 0;
        }
        int i22 = (i21 + i8) * 37;
        if (this.need_relieve_aweme != null) {
            i9 = this.need_relieve_aweme.hashCode();
        } else {
            i9 = 0;
        }
        int i23 = (i22 + i9) * 37;
        if (this.address_book_access != null) {
            i10 = this.address_book_access.hashCode();
        } else {
            i10 = 0;
        }
        int i24 = (i23 + i10) * 37;
        if (this.gps_access != null) {
            i11 = this.gps_access.hashCode();
        } else {
            i11 = 0;
        }
        int i25 = (i24 + i11) * 37;
        if (this.top_view_cid != null) {
            i12 = this.top_view_cid.hashCode();
        } else {
            i12 = 0;
        }
        int i26 = (i25 + i12) * 37;
        if (this.content_language != null) {
            i14 = this.content_language.hashCode();
        }
        int i27 = i26 + i14;
        this.hashCode = i27;
        return i27;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.max_cursor != null) {
            sb.append(", max_cursor=");
            sb.append(this.max_cursor);
        }
        if (this.min_cursor != null) {
            sb.append(", min_cursor=");
            sb.append(this.min_cursor);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.feed_style != null) {
            sb.append(", feed_style=");
            sb.append(this.feed_style);
        }
        if (this.aweme_id != null) {
            sb.append(", aweme_id=");
            sb.append(this.aweme_id);
        }
        if (this.pull_type != null) {
            sb.append(", pull_type=");
            sb.append(this.pull_type);
        }
        if (this.volume != null) {
            sb.append(", volume=");
            sb.append(this.volume);
        }
        if (this.need_relieve_aweme != null) {
            sb.append(", need_relieve_aweme=");
            sb.append(this.need_relieve_aweme);
        }
        if (this.address_book_access != null) {
            sb.append(", address_book_access=");
            sb.append(this.address_book_access);
        }
        if (this.gps_access != null) {
            sb.append(", gps_access=");
            sb.append(this.gps_access);
        }
        if (this.top_view_cid != null) {
            sb.append(", top_view_cid=");
            sb.append(this.top_view_cid);
        }
        if (this.content_language != null) {
            sb.append(", content_language=");
            sb.append(this.content_language);
        }
        StringBuilder replace = sb.replace(0, 2, "aweme_v2_feed_request{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aweme_v2_feed_request)) {
            return false;
        }
        aweme_v2_feed_request aweme_v2_feed_request = (aweme_v2_feed_request) obj;
        if (!unknownFields().equals(aweme_v2_feed_request.unknownFields()) || !Internal.equals(this.type, aweme_v2_feed_request.type) || !Internal.equals(this.max_cursor, aweme_v2_feed_request.max_cursor) || !Internal.equals(this.min_cursor, aweme_v2_feed_request.min_cursor) || !Internal.equals(this.count, aweme_v2_feed_request.count) || !Internal.equals(this.feed_style, aweme_v2_feed_request.feed_style) || !Internal.equals(this.aweme_id, aweme_v2_feed_request.aweme_id) || !Internal.equals(this.pull_type, aweme_v2_feed_request.pull_type) || !Internal.equals(this.volume, aweme_v2_feed_request.volume) || !Internal.equals(this.need_relieve_aweme, aweme_v2_feed_request.need_relieve_aweme) || !Internal.equals(this.address_book_access, aweme_v2_feed_request.address_book_access) || !Internal.equals(this.gps_access, aweme_v2_feed_request.gps_access) || !Internal.equals(this.top_view_cid, aweme_v2_feed_request.top_view_cid) || !Internal.equals(this.content_language, aweme_v2_feed_request.content_language)) {
            return false;
        }
        return true;
    }

    public aweme_v2_feed_request(Integer num, Long l, Long l2, Integer num2, Integer num3, Long l3, Integer num4, String str, Integer num5, Integer num6, Integer num7, String str2, String str3) {
        this(num, l, l2, num2, num3, l3, num4, str, num5, num6, num7, str2, str3, ByteString.EMPTY);
    }

    public aweme_v2_feed_request(Integer num, Long l, Long l2, Integer num2, Integer num3, Long l3, Integer num4, String str, Integer num5, Integer num6, Integer num7, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = num;
        this.max_cursor = l;
        this.min_cursor = l2;
        this.count = num2;
        this.feed_style = num3;
        this.aweme_id = l3;
        this.pull_type = num4;
        this.volume = str;
        this.need_relieve_aweme = num5;
        this.address_book_access = num6;
        this.gps_access = num7;
        this.top_view_cid = str2;
        this.content_language = str3;
    }
}
