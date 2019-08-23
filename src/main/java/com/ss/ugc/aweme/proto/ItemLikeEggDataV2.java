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

public final class ItemLikeEggDataV2 extends Message<ItemLikeEggDataV2, Builder> {
    @Keep
    public static final ProtoAdapter<ItemLikeEggDataV2> ADAPTER = new ProtoAdapter_ItemLikeEggDataV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String material_url;

    public static final class Builder extends Message.Builder<ItemLikeEggDataV2, Builder> {
        public String material_url;

        public final ItemLikeEggDataV2 build() {
            return new ItemLikeEggDataV2(this.material_url, super.buildUnknownFields());
        }

        public final Builder material_url(String str) {
            this.material_url = str;
            return this;
        }
    }

    static final class ProtoAdapter_ItemLikeEggDataV2 extends ProtoAdapter<ItemLikeEggDataV2> {
        public ProtoAdapter_ItemLikeEggDataV2() {
            super(FieldEncoding.LENGTH_DELIMITED, ItemLikeEggDataV2.class);
        }

        public final int encodedSize(ItemLikeEggDataV2 itemLikeEggDataV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, itemLikeEggDataV2.material_url) + itemLikeEggDataV2.unknownFields().size();
        }

        public final ItemLikeEggDataV2 decode(ProtoReader protoReader) throws IOException {
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
                    builder.material_url((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ItemLikeEggDataV2 itemLikeEggDataV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, itemLikeEggDataV2.material_url);
            protoWriter.writeBytes(itemLikeEggDataV2.unknownFields());
        }
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        if (this.material_url != null) {
            i = this.material_url.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.material_url = this.material_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.material_url != null) {
            sb.append(", material_url=");
            sb.append(this.material_url);
        }
        StringBuilder replace = sb.replace(0, 2, "ItemLikeEggDataV2{");
        replace.append('}');
        return replace.toString();
    }

    public ItemLikeEggDataV2(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ItemLikeEggDataV2)) {
            return false;
        }
        ItemLikeEggDataV2 itemLikeEggDataV2 = (ItemLikeEggDataV2) obj;
        if (!unknownFields().equals(itemLikeEggDataV2.unknownFields()) || !Internal.equals(this.material_url, itemLikeEggDataV2.material_url)) {
            return false;
        }
        return true;
    }

    public ItemLikeEggDataV2(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.material_url = str;
    }
}
