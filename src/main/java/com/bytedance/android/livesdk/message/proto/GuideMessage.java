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

public final class GuideMessage extends Message<GuideMessage, Builder> {
    public static final ProtoAdapter<GuideMessage> ADAPTER = new ProtoAdapter_GuideMessage();
    public static final Long DEFAULT_GIFT_ID = 0L;
    public static final Long DEFAULT_GUIDE_TYPE = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String description;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long gift_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long guide_type;

    public static final class Builder extends Message.Builder<GuideMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public String description;
        public Long gift_id;
        public Long guide_type;

        public final GuideMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11562, new Class[0], GuideMessage.class)) {
                return (GuideMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11562, new Class[0], GuideMessage.class);
            }
            GuideMessage guideMessage = new GuideMessage(this.common, this.guide_type, this.gift_id, this.description, super.buildUnknownFields());
            return guideMessage;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder description(String str) {
            this.description = str;
            return this;
        }

        public final Builder gift_id(Long l) {
            this.gift_id = l;
            return this;
        }

        public final Builder guide_type(Long l) {
            this.guide_type = l;
            return this;
        }
    }

    static final class ProtoAdapter_GuideMessage extends ProtoAdapter<GuideMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_GuideMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, GuideMessage.class);
        }

        public final GuideMessage redact(GuideMessage guideMessage) {
            if (PatchProxy.isSupport(new Object[]{guideMessage}, this, changeQuickRedirect, false, 11566, new Class[]{GuideMessage.class}, GuideMessage.class)) {
                return (GuideMessage) PatchProxy.accessDispatch(new Object[]{guideMessage}, this, changeQuickRedirect, false, 11566, new Class[]{GuideMessage.class}, GuideMessage.class);
            }
            Builder newBuilder = guideMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final GuideMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11565, new Class[]{ProtoReader.class}, GuideMessage.class)) {
                return (GuideMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11565, new Class[]{ProtoReader.class}, GuideMessage.class);
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
                            builder.guide_type((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 3:
                            builder.gift_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 4:
                            builder.description((String) ProtoAdapter.STRING.decode(protoReader2));
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

        public final int encodedSize(GuideMessage guideMessage) {
            int i;
            int i2;
            int i3;
            GuideMessage guideMessage2 = guideMessage;
            int i4 = 0;
            if (PatchProxy.isSupport(new Object[]{guideMessage2}, this, changeQuickRedirect, false, 11563, new Class[]{GuideMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{guideMessage2}, this, changeQuickRedirect, false, 11563, new Class[]{GuideMessage.class}, Integer.TYPE)).intValue();
            }
            if (guideMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, guideMessage2.common);
            } else {
                i = 0;
            }
            if (guideMessage2.guide_type != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, guideMessage2.guide_type);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (guideMessage2.gift_id != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, guideMessage2.gift_id);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (guideMessage2.description != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, guideMessage2.description);
            }
            return i6 + i4 + guideMessage.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, GuideMessage guideMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            GuideMessage guideMessage2 = guideMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, guideMessage2}, this, changeQuickRedirect, false, 11564, new Class[]{ProtoWriter.class, GuideMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, guideMessage2}, this, changeQuickRedirect, false, 11564, new Class[]{ProtoWriter.class, GuideMessage.class}, Void.TYPE);
                return;
            }
            if (guideMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, guideMessage2.common);
            }
            if (guideMessage2.guide_type != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, guideMessage2.guide_type);
            }
            if (guideMessage2.gift_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, guideMessage2.gift_id);
            }
            if (guideMessage2.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, guideMessage2.description);
            }
            protoWriter2.writeBytes(guideMessage.unknownFields());
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11560, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11560, new Class[0], Integer.TYPE)).intValue();
        }
        int i5 = this.hashCode;
        if (i5 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i6 = (hashCode + i) * 37;
            if (this.guide_type != null) {
                i2 = this.guide_type.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 37;
            if (this.gift_id != null) {
                i3 = this.gift_id.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 37;
            if (this.description != null) {
                i4 = this.description.hashCode();
            }
            i5 = i8 + i4;
            this.hashCode = i5;
        }
        return i5;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11558, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11558, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.guide_type = this.guide_type;
        builder.gift_id = this.gift_id;
        builder.description = this.description;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11561, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11561, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.guide_type != null) {
            sb.append(", guide_type=");
            sb.append(this.guide_type);
        }
        if (this.gift_id != null) {
            sb.append(", gift_id=");
            sb.append(this.gift_id);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        StringBuilder replace = sb.replace(0, 2, "GuideMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11559, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11559, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof GuideMessage)) {
                return false;
            }
            GuideMessage guideMessage = (GuideMessage) obj;
            if (!unknownFields().equals(guideMessage.unknownFields()) || !Internal.equals(this.common, guideMessage.common) || !Internal.equals(this.guide_type, guideMessage.guide_type) || !Internal.equals(this.gift_id, guideMessage.gift_id) || !Internal.equals(this.description, guideMessage.description)) {
                return false;
            }
            return true;
        }
    }

    public GuideMessage(Common common2, Long l, Long l2, String str) {
        this(common2, l, l2, str, ByteString.EMPTY);
    }

    public GuideMessage(Common common2, Long l, Long l2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.guide_type = l;
        this.gift_id = l2;
        this.description = str;
    }
}
