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

public final class TurntableBurstMessage extends Message<TurntableBurstMessage, Builder> {
    public static final ProtoAdapter<TurntableBurstMessage> ADAPTER = new ProtoAdapter_TurntableBurstMessage();
    public static final Long DEFAULT_BURST_TIME_REMAIN_SECONDS = 0L;
    public static final Long DEFAULT_MULTIPLE = 0L;
    public static final Long DEFAULT_PROPERTY_DEFINITION_ID = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long burst_time_remain_seconds;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long multiple;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long property_definition_id;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 5)
    public final Image property_icon;

    public static final class Builder extends Message.Builder<TurntableBurstMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Long burst_time_remain_seconds;
        public Common common;
        public Long multiple;
        public Long property_definition_id;
        public Image property_icon;

        public final TurntableBurstMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12269, new Class[0], TurntableBurstMessage.class)) {
                return (TurntableBurstMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12269, new Class[0], TurntableBurstMessage.class);
            }
            TurntableBurstMessage turntableBurstMessage = new TurntableBurstMessage(this.common, this.burst_time_remain_seconds, this.multiple, this.property_definition_id, this.property_icon, super.buildUnknownFields());
            return turntableBurstMessage;
        }

        public final Builder burst_time_remain_seconds(Long l) {
            this.burst_time_remain_seconds = l;
            return this;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder multiple(Long l) {
            this.multiple = l;
            return this;
        }

        public final Builder property_definition_id(Long l) {
            this.property_definition_id = l;
            return this;
        }

        public final Builder property_icon(Image image) {
            this.property_icon = image;
            return this;
        }
    }

    static final class ProtoAdapter_TurntableBurstMessage extends ProtoAdapter<TurntableBurstMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_TurntableBurstMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, TurntableBurstMessage.class);
        }

        public final TurntableBurstMessage redact(TurntableBurstMessage turntableBurstMessage) {
            if (PatchProxy.isSupport(new Object[]{turntableBurstMessage}, this, changeQuickRedirect, false, 12273, new Class[]{TurntableBurstMessage.class}, TurntableBurstMessage.class)) {
                return (TurntableBurstMessage) PatchProxy.accessDispatch(new Object[]{turntableBurstMessage}, this, changeQuickRedirect, false, 12273, new Class[]{TurntableBurstMessage.class}, TurntableBurstMessage.class);
            }
            Builder newBuilder = turntableBurstMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.property_icon != null) {
                newBuilder.property_icon = (Image) Image.ADAPTER.redact(newBuilder.property_icon);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final TurntableBurstMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12272, new Class[]{ProtoReader.class}, TurntableBurstMessage.class)) {
                return (TurntableBurstMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12272, new Class[]{ProtoReader.class}, TurntableBurstMessage.class);
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
                            builder.burst_time_remain_seconds((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 3:
                            builder.multiple((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 4:
                            builder.property_definition_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 5:
                            builder.property_icon((Image) Image.ADAPTER.decode(protoReader2));
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

        public final int encodedSize(TurntableBurstMessage turntableBurstMessage) {
            int i;
            int i2;
            int i3;
            int i4;
            TurntableBurstMessage turntableBurstMessage2 = turntableBurstMessage;
            int i5 = 0;
            if (PatchProxy.isSupport(new Object[]{turntableBurstMessage2}, this, changeQuickRedirect, false, 12270, new Class[]{TurntableBurstMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{turntableBurstMessage2}, this, changeQuickRedirect, false, 12270, new Class[]{TurntableBurstMessage.class}, Integer.TYPE)).intValue();
            }
            if (turntableBurstMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, turntableBurstMessage2.common);
            } else {
                i = 0;
            }
            if (turntableBurstMessage2.burst_time_remain_seconds != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, turntableBurstMessage2.burst_time_remain_seconds);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (turntableBurstMessage2.multiple != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, turntableBurstMessage2.multiple);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (turntableBurstMessage2.property_definition_id != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, turntableBurstMessage2.property_definition_id);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (turntableBurstMessage2.property_icon != null) {
                i5 = Image.ADAPTER.encodedSizeWithTag(5, turntableBurstMessage2.property_icon);
            }
            return i8 + i5 + turntableBurstMessage.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, TurntableBurstMessage turntableBurstMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            TurntableBurstMessage turntableBurstMessage2 = turntableBurstMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, turntableBurstMessage2}, this, changeQuickRedirect, false, 12271, new Class[]{ProtoWriter.class, TurntableBurstMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, turntableBurstMessage2}, this, changeQuickRedirect, false, 12271, new Class[]{ProtoWriter.class, TurntableBurstMessage.class}, Void.TYPE);
                return;
            }
            if (turntableBurstMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, turntableBurstMessage2.common);
            }
            if (turntableBurstMessage2.burst_time_remain_seconds != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, turntableBurstMessage2.burst_time_remain_seconds);
            }
            if (turntableBurstMessage2.multiple != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, turntableBurstMessage2.multiple);
            }
            if (turntableBurstMessage2.property_definition_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, turntableBurstMessage2.property_definition_id);
            }
            if (turntableBurstMessage2.property_icon != null) {
                Image.ADAPTER.encodeWithTag(protoWriter2, 5, turntableBurstMessage2.property_icon);
            }
            protoWriter2.writeBytes(turntableBurstMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12265, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12265, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.burst_time_remain_seconds = this.burst_time_remain_seconds;
        builder.multiple = this.multiple;
        builder.property_definition_id = this.property_definition_id;
        builder.property_icon = this.property_icon;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12267, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12267, new Class[0], Integer.TYPE)).intValue();
        }
        int i6 = this.hashCode;
        if (i6 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i7 = (hashCode + i) * 37;
            if (this.burst_time_remain_seconds != null) {
                i2 = this.burst_time_remain_seconds.hashCode();
            } else {
                i2 = 0;
            }
            int i8 = (i7 + i2) * 37;
            if (this.multiple != null) {
                i3 = this.multiple.hashCode();
            } else {
                i3 = 0;
            }
            int i9 = (i8 + i3) * 37;
            if (this.property_definition_id != null) {
                i4 = this.property_definition_id.hashCode();
            } else {
                i4 = 0;
            }
            int i10 = (i9 + i4) * 37;
            if (this.property_icon != null) {
                i5 = this.property_icon.hashCode();
            }
            i6 = i10 + i5;
            this.hashCode = i6;
        }
        return i6;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12268, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12268, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.burst_time_remain_seconds != null) {
            sb.append(", burst_time_remain_seconds=");
            sb.append(this.burst_time_remain_seconds);
        }
        if (this.multiple != null) {
            sb.append(", multiple=");
            sb.append(this.multiple);
        }
        if (this.property_definition_id != null) {
            sb.append(", property_definition_id=");
            sb.append(this.property_definition_id);
        }
        if (this.property_icon != null) {
            sb.append(", property_icon=");
            sb.append(this.property_icon);
        }
        StringBuilder replace = sb.replace(0, 2, "TurntableBurstMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12266, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12266, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof TurntableBurstMessage)) {
                return false;
            }
            TurntableBurstMessage turntableBurstMessage = (TurntableBurstMessage) obj;
            if (!unknownFields().equals(turntableBurstMessage.unknownFields()) || !Internal.equals(this.common, turntableBurstMessage.common) || !Internal.equals(this.burst_time_remain_seconds, turntableBurstMessage.burst_time_remain_seconds) || !Internal.equals(this.multiple, turntableBurstMessage.multiple) || !Internal.equals(this.property_definition_id, turntableBurstMessage.property_definition_id) || !Internal.equals(this.property_icon, turntableBurstMessage.property_icon)) {
                return false;
            }
            return true;
        }
    }

    public TurntableBurstMessage(Common common2, Long l, Long l2, Long l3, Image image) {
        this(common2, l, l2, l3, image, ByteString.EMPTY);
    }

    public TurntableBurstMessage(Common common2, Long l, Long l2, Long l3, Image image, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.burst_time_remain_seconds = l;
        this.multiple = l2;
        this.property_definition_id = l3;
        this.property_icon = image;
    }
}
