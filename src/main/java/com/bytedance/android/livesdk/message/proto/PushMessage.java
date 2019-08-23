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

public final class PushMessage extends Message<PushMessage, Builder> {
    public static final ProtoAdapter<PushMessage> ADAPTER = new ProtoAdapter_PushMessage();
    public static final Long DEFAULT_ACTION_TYPE = 0L;
    public static final Long DEFAULT_PUSH_MESSAGE_DISPLAY_TIME = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String action_content;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 10)
    public final Image action_icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 7)
    public final Long action_type;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.FlexImageStruct#ADAPTER", tag = 9)
    public final FlexImageStruct background_image;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String color;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String content;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 5)
    public final Image icon;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.FlexImageStruct#ADAPTER", tag = 11)
    public final FlexImageStruct new_background_image;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 8)
    public final Long push_message_display_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String traceid;

    public static final class Builder extends Message.Builder<PushMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String action_content;
        public Image action_icon;
        public Long action_type;
        public FlexImageStruct background_image;
        public String color;
        public Common common;
        public String content;
        public Image icon;
        public FlexImageStruct new_background_image;
        public Long push_message_display_time;
        public String traceid;

        public final PushMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12012, new Class[0], PushMessage.class)) {
                return (PushMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12012, new Class[0], PushMessage.class);
            }
            PushMessage pushMessage = new PushMessage(this.common, this.content, this.color, this.traceid, this.icon, this.action_content, this.action_type, this.push_message_display_time, this.background_image, this.action_icon, this.new_background_image, super.buildUnknownFields());
            return pushMessage;
        }

        public final Builder action_content(String str) {
            this.action_content = str;
            return this;
        }

        public final Builder action_icon(Image image) {
            this.action_icon = image;
            return this;
        }

        public final Builder action_type(Long l) {
            this.action_type = l;
            return this;
        }

        public final Builder background_image(FlexImageStruct flexImageStruct) {
            this.background_image = flexImageStruct;
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

        public final Builder new_background_image(FlexImageStruct flexImageStruct) {
            this.new_background_image = flexImageStruct;
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

    static final class ProtoAdapter_PushMessage extends ProtoAdapter<PushMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_PushMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, PushMessage.class);
        }

        public final int encodedSize(PushMessage pushMessage) {
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
            PushMessage pushMessage2 = pushMessage;
            int i11 = 0;
            if (PatchProxy.isSupport(new Object[]{pushMessage2}, this, changeQuickRedirect, false, 12013, new Class[]{PushMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{pushMessage2}, this, changeQuickRedirect, false, 12013, new Class[]{PushMessage.class}, Integer.TYPE)).intValue();
            }
            if (pushMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, pushMessage2.common);
            } else {
                i = 0;
            }
            if (pushMessage2.content != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, pushMessage2.content);
            } else {
                i2 = 0;
            }
            int i12 = i + i2;
            if (pushMessage2.color != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, pushMessage2.color);
            } else {
                i3 = 0;
            }
            int i13 = i12 + i3;
            if (pushMessage2.traceid != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, pushMessage2.traceid);
            } else {
                i4 = 0;
            }
            int i14 = i13 + i4;
            if (pushMessage2.icon != null) {
                i5 = Image.ADAPTER.encodedSizeWithTag(5, pushMessage2.icon);
            } else {
                i5 = 0;
            }
            int i15 = i14 + i5;
            if (pushMessage2.action_content != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, pushMessage2.action_content);
            } else {
                i6 = 0;
            }
            int i16 = i15 + i6;
            if (pushMessage2.action_type != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, pushMessage2.action_type);
            } else {
                i7 = 0;
            }
            int i17 = i16 + i7;
            if (pushMessage2.push_message_display_time != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(8, pushMessage2.push_message_display_time);
            } else {
                i8 = 0;
            }
            int i18 = i17 + i8;
            if (pushMessage2.background_image != null) {
                i9 = FlexImageStruct.ADAPTER.encodedSizeWithTag(9, pushMessage2.background_image);
            } else {
                i9 = 0;
            }
            int i19 = i18 + i9;
            if (pushMessage2.action_icon != null) {
                i10 = Image.ADAPTER.encodedSizeWithTag(10, pushMessage2.action_icon);
            } else {
                i10 = 0;
            }
            int i20 = i19 + i10;
            if (pushMessage2.new_background_image != null) {
                i11 = FlexImageStruct.ADAPTER.encodedSizeWithTag(11, pushMessage2.new_background_image);
            }
            return i20 + i11 + pushMessage.unknownFields().size();
        }

        public final PushMessage redact(PushMessage pushMessage) {
            if (PatchProxy.isSupport(new Object[]{pushMessage}, this, changeQuickRedirect, false, 12016, new Class[]{PushMessage.class}, PushMessage.class)) {
                return (PushMessage) PatchProxy.accessDispatch(new Object[]{pushMessage}, this, changeQuickRedirect, false, 12016, new Class[]{PushMessage.class}, PushMessage.class);
            }
            Builder newBuilder = pushMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.icon != null) {
                newBuilder.icon = (Image) Image.ADAPTER.redact(newBuilder.icon);
            }
            if (newBuilder.background_image != null) {
                newBuilder.background_image = (FlexImageStruct) FlexImageStruct.ADAPTER.redact(newBuilder.background_image);
            }
            if (newBuilder.action_icon != null) {
                newBuilder.action_icon = (Image) Image.ADAPTER.redact(newBuilder.action_icon);
            }
            if (newBuilder.new_background_image != null) {
                newBuilder.new_background_image = (FlexImageStruct) FlexImageStruct.ADAPTER.redact(newBuilder.new_background_image);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final PushMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12015, new Class[]{ProtoReader.class}, PushMessage.class)) {
                return (PushMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12015, new Class[]{ProtoReader.class}, PushMessage.class);
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
                        case 9:
                            builder.background_image((FlexImageStruct) FlexImageStruct.ADAPTER.decode(protoReader2));
                            break;
                        case 10:
                            builder.action_icon((Image) Image.ADAPTER.decode(protoReader2));
                            break;
                        case 11:
                            builder.new_background_image((FlexImageStruct) FlexImageStruct.ADAPTER.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, PushMessage pushMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            PushMessage pushMessage2 = pushMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, pushMessage2}, this, changeQuickRedirect, false, 12014, new Class[]{ProtoWriter.class, PushMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, pushMessage2}, this, changeQuickRedirect, false, 12014, new Class[]{ProtoWriter.class, PushMessage.class}, Void.TYPE);
                return;
            }
            if (pushMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, pushMessage2.common);
            }
            if (pushMessage2.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, pushMessage2.content);
            }
            if (pushMessage2.color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, pushMessage2.color);
            }
            if (pushMessage2.traceid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, pushMessage2.traceid);
            }
            if (pushMessage2.icon != null) {
                Image.ADAPTER.encodeWithTag(protoWriter2, 5, pushMessage2.icon);
            }
            if (pushMessage2.action_content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 6, pushMessage2.action_content);
            }
            if (pushMessage2.action_type != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 7, pushMessage2.action_type);
            }
            if (pushMessage2.push_message_display_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 8, pushMessage2.push_message_display_time);
            }
            if (pushMessage2.background_image != null) {
                FlexImageStruct.ADAPTER.encodeWithTag(protoWriter2, 9, pushMessage2.background_image);
            }
            if (pushMessage2.action_icon != null) {
                Image.ADAPTER.encodeWithTag(protoWriter2, 10, pushMessage2.action_icon);
            }
            if (pushMessage2.new_background_image != null) {
                FlexImageStruct.ADAPTER.encodeWithTag(protoWriter2, 11, pushMessage2.new_background_image);
            }
            protoWriter2.writeBytes(pushMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12008, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12008, new Class[0], Builder.class);
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
        builder.background_image = this.background_image;
        builder.action_icon = this.action_icon;
        builder.new_background_image = this.new_background_image;
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
        int i11 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12010, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12010, new Class[0], Integer.TYPE)).intValue();
        }
        int i12 = this.hashCode;
        if (i12 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i13 = (hashCode + i) * 37;
            if (this.content != null) {
                i2 = this.content.hashCode();
            } else {
                i2 = 0;
            }
            int i14 = (i13 + i2) * 37;
            if (this.color != null) {
                i3 = this.color.hashCode();
            } else {
                i3 = 0;
            }
            int i15 = (i14 + i3) * 37;
            if (this.traceid != null) {
                i4 = this.traceid.hashCode();
            } else {
                i4 = 0;
            }
            int i16 = (i15 + i4) * 37;
            if (this.icon != null) {
                i5 = this.icon.hashCode();
            } else {
                i5 = 0;
            }
            int i17 = (i16 + i5) * 37;
            if (this.action_content != null) {
                i6 = this.action_content.hashCode();
            } else {
                i6 = 0;
            }
            int i18 = (i17 + i6) * 37;
            if (this.action_type != null) {
                i7 = this.action_type.hashCode();
            } else {
                i7 = 0;
            }
            int i19 = (i18 + i7) * 37;
            if (this.push_message_display_time != null) {
                i8 = this.push_message_display_time.hashCode();
            } else {
                i8 = 0;
            }
            int i20 = (i19 + i8) * 37;
            if (this.background_image != null) {
                i9 = this.background_image.hashCode();
            } else {
                i9 = 0;
            }
            int i21 = (i20 + i9) * 37;
            if (this.action_icon != null) {
                i10 = this.action_icon.hashCode();
            } else {
                i10 = 0;
            }
            int i22 = (i21 + i10) * 37;
            if (this.new_background_image != null) {
                i11 = this.new_background_image.hashCode();
            }
            i12 = i22 + i11;
            this.hashCode = i12;
        }
        return i12;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12011, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12011, new Class[0], String.class);
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
        if (this.background_image != null) {
            sb.append(", background_image=");
            sb.append(this.background_image);
        }
        if (this.action_icon != null) {
            sb.append(", action_icon=");
            sb.append(this.action_icon);
        }
        if (this.new_background_image != null) {
            sb.append(", new_background_image=");
            sb.append(this.new_background_image);
        }
        StringBuilder replace = sb.replace(0, 2, "PushMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12009, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12009, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof PushMessage)) {
                return false;
            }
            PushMessage pushMessage = (PushMessage) obj;
            if (!unknownFields().equals(pushMessage.unknownFields()) || !Internal.equals(this.common, pushMessage.common) || !Internal.equals(this.content, pushMessage.content) || !Internal.equals(this.color, pushMessage.color) || !Internal.equals(this.traceid, pushMessage.traceid) || !Internal.equals(this.icon, pushMessage.icon) || !Internal.equals(this.action_content, pushMessage.action_content) || !Internal.equals(this.action_type, pushMessage.action_type) || !Internal.equals(this.push_message_display_time, pushMessage.push_message_display_time) || !Internal.equals(this.background_image, pushMessage.background_image) || !Internal.equals(this.action_icon, pushMessage.action_icon) || !Internal.equals(this.new_background_image, pushMessage.new_background_image)) {
                return false;
            }
            return true;
        }
    }

    public PushMessage(Common common2, String str, String str2, String str3, Image image, String str4, Long l, Long l2, FlexImageStruct flexImageStruct, Image image2, FlexImageStruct flexImageStruct2) {
        this(common2, str, str2, str3, image, str4, l, l2, flexImageStruct, image2, flexImageStruct2, ByteString.EMPTY);
    }

    public PushMessage(Common common2, String str, String str2, String str3, Image image, String str4, Long l, Long l2, FlexImageStruct flexImageStruct, Image image2, FlexImageStruct flexImageStruct2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.content = str;
        this.color = str2;
        this.traceid = str3;
        this.icon = image;
        this.action_content = str4;
        this.action_type = l;
        this.push_message_display_time = l2;
        this.background_image = flexImageStruct;
        this.action_icon = image2;
        this.new_background_image = flexImageStruct2;
    }
}
