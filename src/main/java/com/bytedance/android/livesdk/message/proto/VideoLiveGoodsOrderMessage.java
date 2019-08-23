package com.bytedance.android.livesdk.message.proto;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class VideoLiveGoodsOrderMessage extends Message<VideoLiveGoodsOrderMessage, Builder> {
    public static final ProtoAdapter<VideoLiveGoodsOrderMessage> ADAPTER = new ProtoAdapter_VideoLiveGoodsOrderMessage();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.VideoLiveGoodsOrderMessage$GoodsOrder#ADAPTER", tag = 3)
    public final GoodsOrder goods_order;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 2)
    public final User user;

    public static final class GoodsOrder extends Message<GoodsOrder, Builder> {
        public static final ProtoAdapter<GoodsOrder> ADAPTER = new ProtoAdapter_GoodsOrder();
        public static final Long DEFAULT_GOODS_ROOM_ORDER = 0L;
        public static final Long DEFAULT_ORDER_MONEY = 0L;
        public static final Long DEFAULT_ORDER_NUM = 0L;
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
        public final Long goods_room_order;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
        public final String order_id;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
        public final Long order_money;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
        public final Long order_num;

        public static final class Builder extends Message.Builder<GoodsOrder, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public Long goods_room_order;
            public String order_id;
            public Long order_money;
            public Long order_num;

            public final GoodsOrder build() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12472, new Class[0], GoodsOrder.class)) {
                    return (GoodsOrder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12472, new Class[0], GoodsOrder.class);
                }
                GoodsOrder goodsOrder = new GoodsOrder(this.goods_room_order, this.order_num, this.order_money, this.order_id, super.buildUnknownFields());
                return goodsOrder;
            }

            public final Builder goods_room_order(Long l) {
                this.goods_room_order = l;
                return this;
            }

            public final Builder order_id(String str) {
                this.order_id = str;
                return this;
            }

            public final Builder order_money(Long l) {
                this.order_money = l;
                return this;
            }

            public final Builder order_num(Long l) {
                this.order_num = l;
                return this;
            }
        }

        static final class ProtoAdapter_GoodsOrder extends ProtoAdapter<GoodsOrder> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_GoodsOrder() {
                super(FieldEncoding.LENGTH_DELIMITED, GoodsOrder.class);
            }

            public final GoodsOrder redact(GoodsOrder goodsOrder) {
                if (PatchProxy.isSupport(new Object[]{goodsOrder}, this, changeQuickRedirect, false, 12476, new Class[]{GoodsOrder.class}, GoodsOrder.class)) {
                    return (GoodsOrder) PatchProxy.accessDispatch(new Object[]{goodsOrder}, this, changeQuickRedirect, false, 12476, new Class[]{GoodsOrder.class}, GoodsOrder.class);
                }
                Builder newBuilder = goodsOrder.newBuilder();
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final GoodsOrder decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12475, new Class[]{ProtoReader.class}, GoodsOrder.class)) {
                    return (GoodsOrder) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12475, new Class[]{ProtoReader.class}, GoodsOrder.class);
                }
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                builder.goods_room_order((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 2:
                                builder.order_num((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 3:
                                builder.order_money((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 4:
                                builder.order_id((String) ProtoAdapter.STRING.decode(protoReader2));
                                break;
                            default:
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                        }
                    } else {
                        protoReader2.endMessage(beginMessage);
                        return builder.build();
                    }
                }
            }

            public final int encodedSize(GoodsOrder goodsOrder) {
                int i;
                int i2;
                int i3;
                GoodsOrder goodsOrder2 = goodsOrder;
                int i4 = 0;
                if (PatchProxy.isSupport(new Object[]{goodsOrder2}, this, changeQuickRedirect, false, 12473, new Class[]{GoodsOrder.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{goodsOrder2}, this, changeQuickRedirect, false, 12473, new Class[]{GoodsOrder.class}, Integer.TYPE)).intValue();
                }
                if (goodsOrder2.goods_room_order != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, goodsOrder2.goods_room_order);
                } else {
                    i = 0;
                }
                if (goodsOrder2.order_num != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, goodsOrder2.order_num);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (goodsOrder2.order_money != null) {
                    i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, goodsOrder2.order_money);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (goodsOrder2.order_id != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, goodsOrder2.order_id);
                }
                return i6 + i4 + goodsOrder.unknownFields().size();
            }

            public final void encode(ProtoWriter protoWriter, GoodsOrder goodsOrder) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                GoodsOrder goodsOrder2 = goodsOrder;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, goodsOrder2}, this, changeQuickRedirect, false, 12474, new Class[]{ProtoWriter.class, GoodsOrder.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, goodsOrder2}, this, changeQuickRedirect, false, 12474, new Class[]{ProtoWriter.class, GoodsOrder.class}, Void.TYPE);
                    return;
                }
                if (goodsOrder2.goods_room_order != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1, goodsOrder2.goods_room_order);
                }
                if (goodsOrder2.order_num != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, goodsOrder2.order_num);
                }
                if (goodsOrder2.order_money != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, goodsOrder2.order_money);
                }
                if (goodsOrder2.order_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, goodsOrder2.order_id);
                }
                protoWriter2.writeBytes(goodsOrder.unknownFields());
            }
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12470, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12470, new Class[0], Integer.TYPE)).intValue();
            }
            int i5 = this.hashCode;
            if (i5 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                if (this.goods_room_order != null) {
                    i = this.goods_room_order.hashCode();
                } else {
                    i = 0;
                }
                int i6 = (hashCode + i) * 37;
                if (this.order_num != null) {
                    i2 = this.order_num.hashCode();
                } else {
                    i2 = 0;
                }
                int i7 = (i6 + i2) * 37;
                if (this.order_money != null) {
                    i3 = this.order_money.hashCode();
                } else {
                    i3 = 0;
                }
                int i8 = (i7 + i3) * 37;
                if (this.order_id != null) {
                    i4 = this.order_id.hashCode();
                }
                i5 = i8 + i4;
                this.hashCode = i5;
            }
            return i5;
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12468, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12468, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.goods_room_order = this.goods_room_order;
            builder.order_num = this.order_num;
            builder.order_money = this.order_money;
            builder.order_id = this.order_id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12471, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12471, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (this.goods_room_order != null) {
                sb.append(", goods_room_order=");
                sb.append(this.goods_room_order);
            }
            if (this.order_num != null) {
                sb.append(", order_num=");
                sb.append(this.order_num);
            }
            if (this.order_money != null) {
                sb.append(", order_money=");
                sb.append(this.order_money);
            }
            if (this.order_id != null) {
                sb.append(", order_id=");
                sb.append(this.order_id);
            }
            StringBuilder replace = sb.replace(0, 2, "GoodsOrder{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12469, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12469, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof GoodsOrder)) {
                    return false;
                }
                GoodsOrder goodsOrder = (GoodsOrder) obj;
                if (!unknownFields().equals(goodsOrder.unknownFields()) || !Internal.equals(this.goods_room_order, goodsOrder.goods_room_order) || !Internal.equals(this.order_num, goodsOrder.order_num) || !Internal.equals(this.order_money, goodsOrder.order_money) || !Internal.equals(this.order_id, goodsOrder.order_id)) {
                    return false;
                }
                return true;
            }
        }

        public GoodsOrder(Long l, Long l2, Long l3, String str) {
            this(l, l2, l3, str, ByteString.EMPTY);
        }

        public GoodsOrder(Long l, Long l2, Long l3, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.goods_room_order = l;
            this.order_num = l2;
            this.order_money = l3;
            this.order_id = str;
        }
    }

    public static final class Builder extends Message.Builder<VideoLiveGoodsOrderMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public GoodsOrder goods_order;
        public User user;

        public final VideoLiveGoodsOrderMessage build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12467, new Class[0], VideoLiveGoodsOrderMessage.class)) {
                return new VideoLiveGoodsOrderMessage(this.common, this.user, this.goods_order, super.buildUnknownFields());
            }
            return (VideoLiveGoodsOrderMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12467, new Class[0], VideoLiveGoodsOrderMessage.class);
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder goods_order(GoodsOrder goodsOrder) {
            this.goods_order = goodsOrder;
            return this;
        }

        public final Builder user(User user2) {
            this.user = user2;
            return this;
        }
    }

    static final class ProtoAdapter_VideoLiveGoodsOrderMessage extends ProtoAdapter<VideoLiveGoodsOrderMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_VideoLiveGoodsOrderMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoLiveGoodsOrderMessage.class);
        }

        public final int encodedSize(VideoLiveGoodsOrderMessage videoLiveGoodsOrderMessage) {
            int i;
            int i2;
            VideoLiveGoodsOrderMessage videoLiveGoodsOrderMessage2 = videoLiveGoodsOrderMessage;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[]{videoLiveGoodsOrderMessage2}, this, changeQuickRedirect, false, 12477, new Class[]{VideoLiveGoodsOrderMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{videoLiveGoodsOrderMessage2}, this, changeQuickRedirect, false, 12477, new Class[]{VideoLiveGoodsOrderMessage.class}, Integer.TYPE)).intValue();
            }
            if (videoLiveGoodsOrderMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, videoLiveGoodsOrderMessage2.common);
            } else {
                i = 0;
            }
            if (videoLiveGoodsOrderMessage2.user != null) {
                i2 = User.ADAPTER.encodedSizeWithTag(2, videoLiveGoodsOrderMessage2.user);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (videoLiveGoodsOrderMessage2.goods_order != null) {
                i3 = GoodsOrder.ADAPTER.encodedSizeWithTag(3, videoLiveGoodsOrderMessage2.goods_order);
            }
            return i4 + i3 + videoLiveGoodsOrderMessage.unknownFields().size();
        }

        public final VideoLiveGoodsOrderMessage redact(VideoLiveGoodsOrderMessage videoLiveGoodsOrderMessage) {
            if (PatchProxy.isSupport(new Object[]{videoLiveGoodsOrderMessage}, this, changeQuickRedirect, false, 12480, new Class[]{VideoLiveGoodsOrderMessage.class}, VideoLiveGoodsOrderMessage.class)) {
                return (VideoLiveGoodsOrderMessage) PatchProxy.accessDispatch(new Object[]{videoLiveGoodsOrderMessage}, this, changeQuickRedirect, false, 12480, new Class[]{VideoLiveGoodsOrderMessage.class}, VideoLiveGoodsOrderMessage.class);
            }
            Builder newBuilder = videoLiveGoodsOrderMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.user != null) {
                newBuilder.user = (User) User.ADAPTER.redact(newBuilder.user);
            }
            if (newBuilder.goods_order != null) {
                newBuilder.goods_order = (GoodsOrder) GoodsOrder.ADAPTER.redact(newBuilder.goods_order);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final VideoLiveGoodsOrderMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12479, new Class[]{ProtoReader.class}, VideoLiveGoodsOrderMessage.class)) {
                return (VideoLiveGoodsOrderMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12479, new Class[]{ProtoReader.class}, VideoLiveGoodsOrderMessage.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.common((Common) Common.ADAPTER.decode(protoReader2));
                            break;
                        case 2:
                            builder.user((User) User.ADAPTER.decode(protoReader2));
                            break;
                        case 3:
                            builder.goods_order((GoodsOrder) GoodsOrder.ADAPTER.decode(protoReader2));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                            break;
                    }
                } else {
                    protoReader2.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, VideoLiveGoodsOrderMessage videoLiveGoodsOrderMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            VideoLiveGoodsOrderMessage videoLiveGoodsOrderMessage2 = videoLiveGoodsOrderMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, videoLiveGoodsOrderMessage2}, this, changeQuickRedirect, false, 12478, new Class[]{ProtoWriter.class, VideoLiveGoodsOrderMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, videoLiveGoodsOrderMessage2}, this, changeQuickRedirect, false, 12478, new Class[]{ProtoWriter.class, VideoLiveGoodsOrderMessage.class}, Void.TYPE);
                return;
            }
            if (videoLiveGoodsOrderMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, videoLiveGoodsOrderMessage2.common);
            }
            if (videoLiveGoodsOrderMessage2.user != null) {
                User.ADAPTER.encodeWithTag(protoWriter2, 2, videoLiveGoodsOrderMessage2.user);
            }
            if (videoLiveGoodsOrderMessage2.goods_order != null) {
                GoodsOrder.ADAPTER.encodeWithTag(protoWriter2, 3, videoLiveGoodsOrderMessage2.goods_order);
            }
            protoWriter2.writeBytes(videoLiveGoodsOrderMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12463, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12463, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.user = this.user;
        builder.goods_order = this.goods_order;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12465, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12465, new Class[0], Integer.TYPE)).intValue();
        }
        int i4 = this.hashCode;
        if (i4 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i5 = (hashCode + i) * 37;
            if (this.user != null) {
                i2 = this.user.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 37;
            if (this.goods_order != null) {
                i3 = this.goods_order.hashCode();
            }
            i4 = i6 + i3;
            this.hashCode = i4;
        }
        return i4;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12466, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12466, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.user != null) {
            sb.append(", user=");
            sb.append(this.user);
        }
        if (this.goods_order != null) {
            sb.append(", goods_order=");
            sb.append(this.goods_order);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoLiveGoodsOrderMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12464, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12464, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof VideoLiveGoodsOrderMessage)) {
                return false;
            }
            VideoLiveGoodsOrderMessage videoLiveGoodsOrderMessage = (VideoLiveGoodsOrderMessage) obj;
            if (!unknownFields().equals(videoLiveGoodsOrderMessage.unknownFields()) || !Internal.equals(this.common, videoLiveGoodsOrderMessage.common) || !Internal.equals(this.user, videoLiveGoodsOrderMessage.user) || !Internal.equals(this.goods_order, videoLiveGoodsOrderMessage.goods_order)) {
                return false;
            }
            return true;
        }
    }

    public VideoLiveGoodsOrderMessage(Common common2, User user2, GoodsOrder goodsOrder) {
        this(common2, user2, goodsOrder, ByteString.EMPTY);
    }

    public VideoLiveGoodsOrderMessage(Common common2, User user2, GoodsOrder goodsOrder, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.user = user2;
        this.goods_order = goodsOrder;
    }
}
