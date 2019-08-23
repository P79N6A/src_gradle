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

public final class CommerceConfigDataV2 extends Message<CommerceConfigDataV2, Builder> {
    @Keep
    public static final ProtoAdapter<CommerceConfigDataV2> ADAPTER = new ProtoAdapter_CommerceConfigDataV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.ItemLikeEggDataV2#ADAPTER", tag = 3)
    public ItemLikeEggDataV2 item_like_egg;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer priority;
    @WireField(adapter = "com.ss.ugc.aweme.proto.StickerPendantStructV2#ADAPTER", tag = 4)
    public StickerPendantStructV2 sticker_pendant;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer type;

    public static final class Builder extends Message.Builder<CommerceConfigDataV2, Builder> {
        public ItemLikeEggDataV2 item_like_egg;
        public Integer priority;
        public StickerPendantStructV2 sticker_pendant;
        public Integer type;

        public final CommerceConfigDataV2 build() {
            CommerceConfigDataV2 commerceConfigDataV2 = new CommerceConfigDataV2(this.type, this.priority, this.item_like_egg, this.sticker_pendant, super.buildUnknownFields());
            return commerceConfigDataV2;
        }

        public final Builder item_like_egg(ItemLikeEggDataV2 itemLikeEggDataV2) {
            this.item_like_egg = itemLikeEggDataV2;
            return this;
        }

        public final Builder priority(Integer num) {
            this.priority = num;
            return this;
        }

        public final Builder sticker_pendant(StickerPendantStructV2 stickerPendantStructV2) {
            this.sticker_pendant = stickerPendantStructV2;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }
    }

    static final class ProtoAdapter_CommerceConfigDataV2 extends ProtoAdapter<CommerceConfigDataV2> {
        public ProtoAdapter_CommerceConfigDataV2() {
            super(FieldEncoding.LENGTH_DELIMITED, CommerceConfigDataV2.class);
        }

        public final int encodedSize(CommerceConfigDataV2 commerceConfigDataV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, commerceConfigDataV2.type) + ProtoAdapter.INT32.encodedSizeWithTag(2, commerceConfigDataV2.priority) + ItemLikeEggDataV2.ADAPTER.encodedSizeWithTag(3, commerceConfigDataV2.item_like_egg) + StickerPendantStructV2.ADAPTER.encodedSizeWithTag(4, commerceConfigDataV2.sticker_pendant) + commerceConfigDataV2.unknownFields().size();
        }

        public final CommerceConfigDataV2 decode(ProtoReader protoReader) throws IOException {
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
                            builder.priority((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.item_like_egg((ItemLikeEggDataV2) ItemLikeEggDataV2.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.sticker_pendant((StickerPendantStructV2) StickerPendantStructV2.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, CommerceConfigDataV2 commerceConfigDataV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, commerceConfigDataV2.type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, commerceConfigDataV2.priority);
            ItemLikeEggDataV2.ADAPTER.encodeWithTag(protoWriter, 3, commerceConfigDataV2.item_like_egg);
            StickerPendantStructV2.ADAPTER.encodeWithTag(protoWriter, 4, commerceConfigDataV2.sticker_pendant);
            protoWriter.writeBytes(commerceConfigDataV2.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.priority = this.priority;
        builder.item_like_egg = this.item_like_egg;
        builder.sticker_pendant = this.sticker_pendant;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i5 = 0;
        if (this.type != null) {
            i = this.type.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.priority != null) {
            i2 = this.priority.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.item_like_egg != null) {
            i3 = this.item_like_egg.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.sticker_pendant != null) {
            i5 = this.sticker_pendant.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.priority != null) {
            sb.append(", priority=");
            sb.append(this.priority);
        }
        if (this.item_like_egg != null) {
            sb.append(", item_like_egg=");
            sb.append(this.item_like_egg);
        }
        if (this.sticker_pendant != null) {
            sb.append(", sticker_pendant=");
            sb.append(this.sticker_pendant);
        }
        StringBuilder replace = sb.replace(0, 2, "CommerceConfigDataV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommerceConfigDataV2)) {
            return false;
        }
        CommerceConfigDataV2 commerceConfigDataV2 = (CommerceConfigDataV2) obj;
        if (!unknownFields().equals(commerceConfigDataV2.unknownFields()) || !Internal.equals(this.type, commerceConfigDataV2.type) || !Internal.equals(this.priority, commerceConfigDataV2.priority) || !Internal.equals(this.item_like_egg, commerceConfigDataV2.item_like_egg) || !Internal.equals(this.sticker_pendant, commerceConfigDataV2.sticker_pendant)) {
            return false;
        }
        return true;
    }

    public CommerceConfigDataV2(Integer num, Integer num2, ItemLikeEggDataV2 itemLikeEggDataV2, StickerPendantStructV2 stickerPendantStructV2) {
        this(num, num2, itemLikeEggDataV2, stickerPendantStructV2, ByteString.EMPTY);
    }

    public CommerceConfigDataV2(Integer num, Integer num2, ItemLikeEggDataV2 itemLikeEggDataV2, StickerPendantStructV2 stickerPendantStructV2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = num;
        this.priority = num2;
        this.item_like_egg = itemLikeEggDataV2;
        this.sticker_pendant = stickerPendantStructV2;
    }
}
