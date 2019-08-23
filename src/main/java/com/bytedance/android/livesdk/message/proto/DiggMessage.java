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

public final class DiggMessage extends Message<DiggMessage, Builder> {
    public static final ProtoAdapter<DiggMessage> ADAPTER = new ProtoAdapter_DiggMessage();
    public static final Long DEFAULT_COLOR = 0L;
    public static final Long DEFAULT_DIGG_COUNT = 0L;
    public static final Long DEFAULT_DURATION = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long color;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long digg_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long duration;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String icon;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 5)
    public final User user;

    public static final class Builder extends Message.Builder<DiggMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Long color;
        public Common common;
        public Long digg_count;
        public Long duration;
        public String icon;
        public User user;

        public final DiggMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11333, new Class[0], DiggMessage.class)) {
                return (DiggMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11333, new Class[0], DiggMessage.class);
            }
            DiggMessage diggMessage = new DiggMessage(this.common, this.digg_count, this.duration, this.color, this.user, this.icon, super.buildUnknownFields());
            return diggMessage;
        }

        public final Builder color(Long l) {
            this.color = l;
            return this;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder digg_count(Long l) {
            this.digg_count = l;
            return this;
        }

        public final Builder duration(Long l) {
            this.duration = l;
            return this;
        }

        public final Builder icon(String str) {
            this.icon = str;
            return this;
        }

        public final Builder user(User user2) {
            this.user = user2;
            return this;
        }
    }

    static final class ProtoAdapter_DiggMessage extends ProtoAdapter<DiggMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_DiggMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, DiggMessage.class);
        }

        public final DiggMessage redact(DiggMessage diggMessage) {
            if (PatchProxy.isSupport(new Object[]{diggMessage}, this, changeQuickRedirect, false, 11337, new Class[]{DiggMessage.class}, DiggMessage.class)) {
                return (DiggMessage) PatchProxy.accessDispatch(new Object[]{diggMessage}, this, changeQuickRedirect, false, 11337, new Class[]{DiggMessage.class}, DiggMessage.class);
            }
            Builder newBuilder = diggMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.user != null) {
                newBuilder.user = (User) User.ADAPTER.redact(newBuilder.user);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final DiggMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11336, new Class[]{ProtoReader.class}, DiggMessage.class)) {
                return (DiggMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11336, new Class[]{ProtoReader.class}, DiggMessage.class);
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
                            builder.digg_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 3:
                            builder.duration((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 4:
                            builder.color((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 5:
                            builder.user((User) User.ADAPTER.decode(protoReader2));
                            break;
                        case 6:
                            builder.icon((String) ProtoAdapter.STRING.decode(protoReader2));
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

        public final int encodedSize(DiggMessage diggMessage) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            DiggMessage diggMessage2 = diggMessage;
            int i6 = 0;
            if (PatchProxy.isSupport(new Object[]{diggMessage2}, this, changeQuickRedirect, false, 11334, new Class[]{DiggMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{diggMessage2}, this, changeQuickRedirect, false, 11334, new Class[]{DiggMessage.class}, Integer.TYPE)).intValue();
            }
            if (diggMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, diggMessage2.common);
            } else {
                i = 0;
            }
            if (diggMessage2.digg_count != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, diggMessage2.digg_count);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (diggMessage2.duration != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, diggMessage2.duration);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (diggMessage2.color != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, diggMessage2.color);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (diggMessage2.user != null) {
                i5 = User.ADAPTER.encodedSizeWithTag(5, diggMessage2.user);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (diggMessage2.icon != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, diggMessage2.icon);
            }
            return i10 + i6 + diggMessage.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, DiggMessage diggMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            DiggMessage diggMessage2 = diggMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, diggMessage2}, this, changeQuickRedirect, false, 11335, new Class[]{ProtoWriter.class, DiggMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, diggMessage2}, this, changeQuickRedirect, false, 11335, new Class[]{ProtoWriter.class, DiggMessage.class}, Void.TYPE);
                return;
            }
            if (diggMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, diggMessage2.common);
            }
            if (diggMessage2.digg_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, diggMessage2.digg_count);
            }
            if (diggMessage2.duration != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, diggMessage2.duration);
            }
            if (diggMessage2.color != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, diggMessage2.color);
            }
            if (diggMessage2.user != null) {
                User.ADAPTER.encodeWithTag(protoWriter2, 5, diggMessage2.user);
            }
            if (diggMessage2.icon != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 6, diggMessage2.icon);
            }
            protoWriter2.writeBytes(diggMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11329, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11329, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.digg_count = this.digg_count;
        builder.duration = this.duration;
        builder.color = this.color;
        builder.user = this.user;
        builder.icon = this.icon;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11331, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11331, new Class[0], Integer.TYPE)).intValue();
        }
        int i7 = this.hashCode;
        if (i7 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i8 = (hashCode + i) * 37;
            if (this.digg_count != null) {
                i2 = this.digg_count.hashCode();
            } else {
                i2 = 0;
            }
            int i9 = (i8 + i2) * 37;
            if (this.duration != null) {
                i3 = this.duration.hashCode();
            } else {
                i3 = 0;
            }
            int i10 = (i9 + i3) * 37;
            if (this.color != null) {
                i4 = this.color.hashCode();
            } else {
                i4 = 0;
            }
            int i11 = (i10 + i4) * 37;
            if (this.user != null) {
                i5 = this.user.hashCode();
            } else {
                i5 = 0;
            }
            int i12 = (i11 + i5) * 37;
            if (this.icon != null) {
                i6 = this.icon.hashCode();
            }
            i7 = i12 + i6;
            this.hashCode = i7;
        }
        return i7;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11332, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11332, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.digg_count != null) {
            sb.append(", digg_count=");
            sb.append(this.digg_count);
        }
        if (this.duration != null) {
            sb.append(", duration=");
            sb.append(this.duration);
        }
        if (this.color != null) {
            sb.append(", color=");
            sb.append(this.color);
        }
        if (this.user != null) {
            sb.append(", user=");
            sb.append(this.user);
        }
        if (this.icon != null) {
            sb.append(", icon=");
            sb.append(this.icon);
        }
        StringBuilder replace = sb.replace(0, 2, "DiggMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11330, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11330, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof DiggMessage)) {
                return false;
            }
            DiggMessage diggMessage = (DiggMessage) obj;
            if (!unknownFields().equals(diggMessage.unknownFields()) || !Internal.equals(this.common, diggMessage.common) || !Internal.equals(this.digg_count, diggMessage.digg_count) || !Internal.equals(this.duration, diggMessage.duration) || !Internal.equals(this.color, diggMessage.color) || !Internal.equals(this.user, diggMessage.user) || !Internal.equals(this.icon, diggMessage.icon)) {
                return false;
            }
            return true;
        }
    }

    public DiggMessage(Common common2, Long l, Long l2, Long l3, User user2, String str) {
        this(common2, l, l2, l3, user2, str, ByteString.EMPTY);
    }

    public DiggMessage(Common common2, Long l, Long l2, Long l3, User user2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.digg_count = l;
        this.duration = l2;
        this.color = l3;
        this.user = user2;
        this.icon = str;
    }
}
