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
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.io.IOException;
import okio.ByteString;

public final class SpecialPushMessage extends Message<SpecialPushMessage, Builder> {
    public static final ProtoAdapter<SpecialPushMessage> ADAPTER = new ProtoAdapter_SpecialPushMessage();
    public static final Long DEFAULT_ACTION_TYPE = 0L;
    public static final Long DEFAULT_PUSH_MESSAGE_DISPLAY_TIME = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String action_content;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 7)
    public final Long action_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String color;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String content;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 5)
    public final Image icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 8)
    public final Long push_message_display_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String traceid;

    public static final class Builder extends Message.Builder<SpecialPushMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String action_content;
        public Long action_type;
        public String color;
        public Common common;
        public String content;
        public Image icon;
        public Long push_message_display_time;
        public String traceid;

        public final SpecialPushMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12169, new Class[0], SpecialPushMessage.class)) {
                return (SpecialPushMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12169, new Class[0], SpecialPushMessage.class);
            }
            SpecialPushMessage specialPushMessage = new SpecialPushMessage(this.common, this.content, this.color, this.traceid, this.icon, this.action_content, this.action_type, this.push_message_display_time, super.buildUnknownFields());
            return specialPushMessage;
        }

        public final Builder action_content(String str) {
            this.action_content = str;
            return this;
        }

        public final Builder action_type(Long l) {
            this.action_type = l;
            return this;
        }

        public final Builder color(String str) {
            this.color = str;
            return this;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }

        public final Builder icon(Image image) {
            this.icon = image;
            return this;
        }

        public final Builder push_message_display_time(Long l) {
            this.push_message_display_time = l;
            return this;
        }

        public final Builder traceid(String str) {
            this.traceid = str;
            return this;
        }
    }

    static final class ProtoAdapter_SpecialPushMessage extends ProtoAdapter<SpecialPushMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_SpecialPushMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, SpecialPushMessage.class);
        }

        public final SpecialPushMessage redact(SpecialPushMessage specialPushMessage) {
            if (PatchProxy.isSupport(new Object[]{specialPushMessage}, this, changeQuickRedirect, false, 12173, new Class[]{SpecialPushMessage.class}, SpecialPushMessage.class)) {
                return (SpecialPushMessage) PatchProxy.accessDispatch(new Object[]{specialPushMessage}, this, changeQuickRedirect, false, 12173, new Class[]{SpecialPushMessage.class}, SpecialPushMessage.class);
            }
            Builder newBuilder = specialPushMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.icon != null) {
                newBuilder.icon = (Image) Image.ADAPTER.redact(newBuilder.icon);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final SpecialPushMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12172, new Class[]{ProtoReader.class}, SpecialPushMessage.class)) {
                return (SpecialPushMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12172, new Class[]{ProtoReader.class}, SpecialPushMessage.class);
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
                            builder.color((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 4:
                            builder.traceid((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 5:
                            builder.icon((Image) Image.ADAPTER.decode(protoReader2));
                            break;
                        case 6:
                            builder.action_content((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case e.l /*7*/:
                            builder.action_type((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 8:
                            builder.push_message_display_time((Long) ProtoAdapter.INT64.decode(protoReader2));
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

        public final int encodedSize(SpecialPushMessage specialPushMessage) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            SpecialPushMessage specialPushMessage2 = specialPushMessage;
            int i8 = 0;
            if (PatchProxy.isSupport(new Object[]{specialPushMessage2}, this, changeQuickRedirect, false, 12170, new Class[]{SpecialPushMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{specialPushMessage2}, this, changeQuickRedirect, false, 12170, new Class[]{SpecialPushMessage.class}, Integer.TYPE)).intValue();
            }
            if (specialPushMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, specialPushMessage2.common);
            } else {
                i = 0;
            }
            if (specialPushMessage2.content != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, specialPushMessage2.content);
            } else {
                i2 = 0;
            }
            int i9 = i + i2;
            if (specialPushMessage2.color != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, specialPushMessage2.color);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (specialPushMessage2.traceid != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, specialPushMessage2.traceid);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (specialPushMessage2.icon != null) {
                i5 = Image.ADAPTER.encodedSizeWithTag(5, specialPushMessage2.icon);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (specialPushMessage2.action_content != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, specialPushMessage2.action_content);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (specialPushMessage2.action_type != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, specialPushMessage2.action_type);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (specialPushMessage2.push_message_display_time != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(8, specialPushMessage2.push_message_display_time);
            }
            return i14 + i8 + specialPushMessage.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, SpecialPushMessage specialPushMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            SpecialPushMessage specialPushMessage2 = specialPushMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, specialPushMessage2}, this, changeQuickRedirect, false, 12171, new Class[]{ProtoWriter.class, SpecialPushMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, specialPushMessage2}, this, changeQuickRedirect, false, 12171, new Class[]{ProtoWriter.class, SpecialPushMessage.class}, Void.TYPE);
                return;
            }
            if (specialPushMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, specialPushMessage2.common);
            }
            if (specialPushMessage2.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, specialPushMessage2.content);
            }
            if (specialPushMessage2.color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, specialPushMessage2.color);
            }
            if (specialPushMessage2.traceid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, specialPushMessage2.traceid);
            }
            if (specialPushMessage2.icon != null) {
                Image.ADAPTER.encodeWithTag(protoWriter2, 5, specialPushMessage2.icon);
            }
            if (specialPushMessage2.action_content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 6, specialPushMessage2.action_content);
            }
            if (specialPushMessage2.action_type != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 7, specialPushMessage2.action_type);
            }
            if (specialPushMessage2.push_message_display_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 8, specialPushMessage2.push_message_display_time);
            }
            protoWriter2.writeBytes(specialPushMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12165, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12165, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.content = this.content;
        builder.color = this.color;
        builder.traceid = this.traceid;
        builder.icon = this.icon;
        builder.action_content = this.action_content;
        builder.action_type = this.action_type;
        builder.push_message_display_time = this.push_message_display_time;
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
        int i8 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12167, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12167, new Class[0], Integer.TYPE)).intValue();
        }
        int i9 = this.hashCode;
        if (i9 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i10 = (hashCode + i) * 37;
            if (this.content != null) {
                i2 = this.content.hashCode();
            } else {
                i2 = 0;
            }
            int i11 = (i10 + i2) * 37;
            if (this.color != null) {
                i3 = this.color.hashCode();
            } else {
                i3 = 0;
            }
            int i12 = (i11 + i3) * 37;
            if (this.traceid != null) {
                i4 = this.traceid.hashCode();
            } else {
                i4 = 0;
            }
            int i13 = (i12 + i4) * 37;
            if (this.icon != null) {
                i5 = this.icon.hashCode();
            } else {
                i5 = 0;
            }
            int i14 = (i13 + i5) * 37;
            if (this.action_content != null) {
                i6 = this.action_content.hashCode();
            } else {
                i6 = 0;
            }
            int i15 = (i14 + i6) * 37;
            if (this.action_type != null) {
                i7 = this.action_type.hashCode();
            } else {
                i7 = 0;
            }
            int i16 = (i15 + i7) * 37;
            if (this.push_message_display_time != null) {
                i8 = this.push_message_display_time.hashCode();
            }
            i9 = i16 + i8;
            this.hashCode = i9;
        }
        return i9;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12168, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12168, new Class[0], String.class);
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
        if (this.color != null) {
            sb.append(", color=");
            sb.append(this.color);
        }
        if (this.traceid != null) {
            sb.append(", traceid=");
            sb.append(this.traceid);
        }
        if (this.icon != null) {
            sb.append(", icon=");
            sb.append(this.icon);
        }
        if (this.action_content != null) {
            sb.append(", action_content=");
            sb.append(this.action_content);
        }
        if (this.action_type != null) {
            sb.append(", action_type=");
            sb.append(this.action_type);
        }
        if (this.push_message_display_time != null) {
            sb.append(", push_message_display_time=");
            sb.append(this.push_message_display_time);
        }
        StringBuilder replace = sb.replace(0, 2, "SpecialPushMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12166, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12166, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof SpecialPushMessage)) {
                return false;
            }
            SpecialPushMessage specialPushMessage = (SpecialPushMessage) obj;
            if (!unknownFields().equals(specialPushMessage.unknownFields()) || !Internal.equals(this.common, specialPushMessage.common) || !Internal.equals(this.content, specialPushMessage.content) || !Internal.equals(this.color, specialPushMessage.color) || !Internal.equals(this.traceid, specialPushMessage.traceid) || !Internal.equals(this.icon, specialPushMessage.icon) || !Internal.equals(this.action_content, specialPushMessage.action_content) || !Internal.equals(this.action_type, specialPushMessage.action_type) || !Internal.equals(this.push_message_display_time, specialPushMessage.push_message_display_time)) {
                return false;
            }
            return true;
        }
    }

    public SpecialPushMessage(Common common2, String str, String str2, String str3, Image image, String str4, Long l, Long l2) {
        this(common2, str, str2, str3, image, str4, l, l2, ByteString.EMPTY);
    }

    public SpecialPushMessage(Common common2, String str, String str2, String str3, Image image, String str4, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.content = str;
        this.color = str2;
        this.traceid = str3;
        this.icon = image;
        this.action_content = str4;
        this.action_type = l;
        this.push_message_display_time = l2;
    }
}
