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

public final class PropertyNoticeMessage extends Message<PropertyNoticeMessage, Builder> {
    public static final ProtoAdapter<PropertyNoticeMessage> ADAPTER = new ProtoAdapter_PropertyNoticeMessage();
    public static final Long DEFAULT_PROPERTY_EVENT_TYPE = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String content;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long property_event_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long user_id;

    public static final class Builder extends Message.Builder<PropertyNoticeMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public String content;
        public Long property_event_type;
        public Long user_id;

        public final PropertyNoticeMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12003, new Class[0], PropertyNoticeMessage.class)) {
                return (PropertyNoticeMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12003, new Class[0], PropertyNoticeMessage.class);
            }
            PropertyNoticeMessage propertyNoticeMessage = new PropertyNoticeMessage(this.common, this.content, this.user_id, this.property_event_type, super.buildUnknownFields());
            return propertyNoticeMessage;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }

        public final Builder property_event_type(Long l) {
            this.property_event_type = l;
            return this;
        }

        public final Builder user_id(Long l) {
            this.user_id = l;
            return this;
        }
    }

    static final class ProtoAdapter_PropertyNoticeMessage extends ProtoAdapter<PropertyNoticeMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_PropertyNoticeMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, PropertyNoticeMessage.class);
        }

        public final PropertyNoticeMessage redact(PropertyNoticeMessage propertyNoticeMessage) {
            if (PatchProxy.isSupport(new Object[]{propertyNoticeMessage}, this, changeQuickRedirect, false, 12007, new Class[]{PropertyNoticeMessage.class}, PropertyNoticeMessage.class)) {
                return (PropertyNoticeMessage) PatchProxy.accessDispatch(new Object[]{propertyNoticeMessage}, this, changeQuickRedirect, false, 12007, new Class[]{PropertyNoticeMessage.class}, PropertyNoticeMessage.class);
            }
            Builder newBuilder = propertyNoticeMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final PropertyNoticeMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12006, new Class[]{ProtoReader.class}, PropertyNoticeMessage.class)) {
                return (PropertyNoticeMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12006, new Class[]{ProtoReader.class}, PropertyNoticeMessage.class);
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
                            builder.content((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 3:
                            builder.user_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 4:
                            builder.property_event_type((Long) ProtoAdapter.INT64.decode(protoReader2));
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

        public final int encodedSize(PropertyNoticeMessage propertyNoticeMessage) {
            int i;
            int i2;
            int i3;
            PropertyNoticeMessage propertyNoticeMessage2 = propertyNoticeMessage;
            int i4 = 0;
            if (PatchProxy.isSupport(new Object[]{propertyNoticeMessage2}, this, changeQuickRedirect, false, 12004, new Class[]{PropertyNoticeMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{propertyNoticeMessage2}, this, changeQuickRedirect, false, 12004, new Class[]{PropertyNoticeMessage.class}, Integer.TYPE)).intValue();
            }
            if (propertyNoticeMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, propertyNoticeMessage2.common);
            } else {
                i = 0;
            }
            if (propertyNoticeMessage2.content != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, propertyNoticeMessage2.content);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (propertyNoticeMessage2.user_id != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, propertyNoticeMessage2.user_id);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (propertyNoticeMessage2.property_event_type != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, propertyNoticeMessage2.property_event_type);
            }
            return i6 + i4 + propertyNoticeMessage.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, PropertyNoticeMessage propertyNoticeMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            PropertyNoticeMessage propertyNoticeMessage2 = propertyNoticeMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, propertyNoticeMessage2}, this, changeQuickRedirect, false, 12005, new Class[]{ProtoWriter.class, PropertyNoticeMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, propertyNoticeMessage2}, this, changeQuickRedirect, false, 12005, new Class[]{ProtoWriter.class, PropertyNoticeMessage.class}, Void.TYPE);
                return;
            }
            if (propertyNoticeMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, propertyNoticeMessage2.common);
            }
            if (propertyNoticeMessage2.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, propertyNoticeMessage2.content);
            }
            if (propertyNoticeMessage2.user_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, propertyNoticeMessage2.user_id);
            }
            if (propertyNoticeMessage2.property_event_type != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, propertyNoticeMessage2.property_event_type);
            }
            protoWriter2.writeBytes(propertyNoticeMessage.unknownFields());
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12001, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12001, new Class[0], Integer.TYPE)).intValue();
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
            if (this.content != null) {
                i2 = this.content.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 37;
            if (this.user_id != null) {
                i3 = this.user_id.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 37;
            if (this.property_event_type != null) {
                i4 = this.property_event_type.hashCode();
            }
            i5 = i8 + i4;
            this.hashCode = i5;
        }
        return i5;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11999, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11999, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.content = this.content;
        builder.user_id = this.user_id;
        builder.property_event_type = this.property_event_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12002, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12002, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.property_event_type != null) {
            sb.append(", property_event_type=");
            sb.append(this.property_event_type);
        }
        StringBuilder replace = sb.replace(0, 2, "PropertyNoticeMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12000, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12000, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof PropertyNoticeMessage)) {
                return false;
            }
            PropertyNoticeMessage propertyNoticeMessage = (PropertyNoticeMessage) obj;
            if (!unknownFields().equals(propertyNoticeMessage.unknownFields()) || !Internal.equals(this.common, propertyNoticeMessage.common) || !Internal.equals(this.content, propertyNoticeMessage.content) || !Internal.equals(this.user_id, propertyNoticeMessage.user_id) || !Internal.equals(this.property_event_type, propertyNoticeMessage.property_event_type)) {
                return false;
            }
            return true;
        }
    }

    public PropertyNoticeMessage(Common common2, String str, Long l, Long l2) {
        this(common2, str, l, l2, ByteString.EMPTY);
    }

    public PropertyNoticeMessage(Common common2, String str, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.content = str;
        this.user_id = l;
        this.property_event_type = l2;
    }
}
