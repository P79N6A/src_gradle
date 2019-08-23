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

public final class OpenPlatformStructV2 extends Message<OpenPlatformStructV2, Builder> {
    @Keep
    public static final ProtoAdapter<OpenPlatformStructV2> ADAPTER = new ProtoAdapter_OpenPlatformStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String link;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String name;

    public static final class Builder extends Message.Builder<OpenPlatformStructV2, Builder> {
        public String icon;
        public String link;
        public String name;

        public final OpenPlatformStructV2 build() {
            return new OpenPlatformStructV2(this.name, this.icon, this.link, super.buildUnknownFields());
        }

        public final Builder icon(String str) {
            this.icon = str;
            return this;
        }

        public final Builder link(String str) {
            this.link = str;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }
    }

    static final class ProtoAdapter_OpenPlatformStructV2 extends ProtoAdapter<OpenPlatformStructV2> {
        public ProtoAdapter_OpenPlatformStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, OpenPlatformStructV2.class);
        }

        public final int encodedSize(OpenPlatformStructV2 openPlatformStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, openPlatformStructV2.name) + ProtoAdapter.STRING.encodedSizeWithTag(2, openPlatformStructV2.icon) + ProtoAdapter.STRING.encodedSizeWithTag(3, openPlatformStructV2.link) + openPlatformStructV2.unknownFields().size();
        }

        public final OpenPlatformStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.icon((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.link((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, OpenPlatformStructV2 openPlatformStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, openPlatformStructV2.name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, openPlatformStructV2.icon);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, openPlatformStructV2.link);
            protoWriter.writeBytes(openPlatformStructV2.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.name = this.name;
        builder.icon = this.icon;
        builder.link = this.link;
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
        if (this.name != null) {
            i = this.name.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.icon != null) {
            i2 = this.icon.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.link != null) {
            i4 = this.link.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.icon != null) {
            sb.append(", icon=");
            sb.append(this.icon);
        }
        if (this.link != null) {
            sb.append(", link=");
            sb.append(this.link);
        }
        StringBuilder replace = sb.replace(0, 2, "OpenPlatformStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OpenPlatformStructV2)) {
            return false;
        }
        OpenPlatformStructV2 openPlatformStructV2 = (OpenPlatformStructV2) obj;
        if (!unknownFields().equals(openPlatformStructV2.unknownFields()) || !Internal.equals(this.name, openPlatformStructV2.name) || !Internal.equals(this.icon, openPlatformStructV2.icon) || !Internal.equals(this.link, openPlatformStructV2.link)) {
            return false;
        }
        return true;
    }

    public OpenPlatformStructV2(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public OpenPlatformStructV2(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.icon = str2;
        this.link = str3;
    }
}
