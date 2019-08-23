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

public final class Common extends Message<Common, Builder> {
    public static final ProtoAdapter<Common> ADAPTER = new ProtoAdapter_Common();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Boolean DEFAULT_IS_SHOW_MSG = Boolean.FALSE;
    public static final Integer DEFAULT_MONITOR = 0;
    public static final Long DEFAULT_MSG_ID = 0L;
    public static final Long DEFAULT_ROOM_ID = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long create_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String describe;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Text#ADAPTER", tag = 8)
    public final Text display_text;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 6)
    public final Boolean is_show_msg;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String method;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public final Integer monitor;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long msg_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long room_id;

    public static final class Builder extends Message.Builder<Common, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Long create_time;
        public String describe;
        public Text display_text;
        public Boolean is_show_msg;
        public String method;
        public Integer monitor;
        public Long msg_id;
        public Long room_id;

        public final Common build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11250, new Class[0], Common.class)) {
                return (Common) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11250, new Class[0], Common.class);
            }
            Common common = new Common(this.method, this.msg_id, this.room_id, this.create_time, this.monitor, this.is_show_msg, this.describe, this.display_text, super.buildUnknownFields());
            return common;
        }

        public final Builder create_time(Long l) {
            this.create_time = l;
            return this;
        }

        public final Builder describe(String str) {
            this.describe = str;
            return this;
        }

        public final Builder display_text(Text text) {
            this.display_text = text;
            return this;
        }

        public final Builder is_show_msg(Boolean bool) {
            this.is_show_msg = bool;
            return this;
        }

        public final Builder method(String str) {
            this.method = str;
            return this;
        }

        public final Builder monitor(Integer num) {
            this.monitor = num;
            return this;
        }

        public final Builder msg_id(Long l) {
            this.msg_id = l;
            return this;
        }

        public final Builder room_id(Long l) {
            this.room_id = l;
            return this;
        }
    }

    static final class ProtoAdapter_Common extends ProtoAdapter<Common> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_Common() {
            super(FieldEncoding.LENGTH_DELIMITED, Common.class);
        }

        public final Common redact(Common common) {
            if (PatchProxy.isSupport(new Object[]{common}, this, changeQuickRedirect, false, 11254, new Class[]{Common.class}, Common.class)) {
                return (Common) PatchProxy.accessDispatch(new Object[]{common}, this, changeQuickRedirect, false, 11254, new Class[]{Common.class}, Common.class);
            }
            Builder newBuilder = common.newBuilder();
            if (newBuilder.display_text != null) {
                newBuilder.display_text = (Text) Text.ADAPTER.redact(newBuilder.display_text);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final Common decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11253, new Class[]{ProtoReader.class}, Common.class)) {
                return (Common) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11253, new Class[]{ProtoReader.class}, Common.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.method((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 2:
                            builder.msg_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 3:
                            builder.room_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 4:
                            builder.create_time((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 5:
                            builder.monitor((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 6:
                            builder.is_show_msg((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case e.l /*7*/:
                            builder.describe((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 8:
                            builder.display_text((Text) Text.ADAPTER.decode(protoReader2));
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

        public final int encodedSize(Common common) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            Common common2 = common;
            int i8 = 0;
            if (PatchProxy.isSupport(new Object[]{common2}, this, changeQuickRedirect, false, 11251, new Class[]{Common.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{common2}, this, changeQuickRedirect, false, 11251, new Class[]{Common.class}, Integer.TYPE)).intValue();
            }
            if (common2.method != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, common2.method);
            } else {
                i = 0;
            }
            if (common2.msg_id != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, common2.msg_id);
            } else {
                i2 = 0;
            }
            int i9 = i + i2;
            if (common2.room_id != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, common2.room_id);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (common2.create_time != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, common2.create_time);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (common2.monitor != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(5, common2.monitor);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (common2.is_show_msg != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, common2.is_show_msg);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (common2.describe != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, common2.describe);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (common2.display_text != null) {
                i8 = Text.ADAPTER.encodedSizeWithTag(8, common2.display_text);
            }
            return i14 + i8 + common.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, Common common) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            Common common2 = common;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, common2}, this, changeQuickRedirect, false, 11252, new Class[]{ProtoWriter.class, Common.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, common2}, this, changeQuickRedirect, false, 11252, new Class[]{ProtoWriter.class, Common.class}, Void.TYPE);
                return;
            }
            if (common2.method != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, common2.method);
            }
            if (common2.msg_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, common2.msg_id);
            }
            if (common2.room_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, common2.room_id);
            }
            if (common2.create_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, common2.create_time);
            }
            if (common2.monitor != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 5, common2.monitor);
            }
            if (common2.is_show_msg != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 6, common2.is_show_msg);
            }
            if (common2.describe != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 7, common2.describe);
            }
            if (common2.display_text != null) {
                Text.ADAPTER.encodeWithTag(protoWriter2, 8, common2.display_text);
            }
            protoWriter2.writeBytes(common.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11246, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11246, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.method = this.method;
        builder.msg_id = this.msg_id;
        builder.room_id = this.room_id;
        builder.create_time = this.create_time;
        builder.monitor = this.monitor;
        builder.is_show_msg = this.is_show_msg;
        builder.describe = this.describe;
        builder.display_text = this.display_text;
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11248, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11248, new Class[0], Integer.TYPE)).intValue();
        }
        int i9 = this.hashCode;
        if (i9 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.method != null) {
                i = this.method.hashCode();
            } else {
                i = 0;
            }
            int i10 = (hashCode + i) * 37;
            if (this.msg_id != null) {
                i2 = this.msg_id.hashCode();
            } else {
                i2 = 0;
            }
            int i11 = (i10 + i2) * 37;
            if (this.room_id != null) {
                i3 = this.room_id.hashCode();
            } else {
                i3 = 0;
            }
            int i12 = (i11 + i3) * 37;
            if (this.create_time != null) {
                i4 = this.create_time.hashCode();
            } else {
                i4 = 0;
            }
            int i13 = (i12 + i4) * 37;
            if (this.monitor != null) {
                i5 = this.monitor.hashCode();
            } else {
                i5 = 0;
            }
            int i14 = (i13 + i5) * 37;
            if (this.is_show_msg != null) {
                i6 = this.is_show_msg.hashCode();
            } else {
                i6 = 0;
            }
            int i15 = (i14 + i6) * 37;
            if (this.describe != null) {
                i7 = this.describe.hashCode();
            } else {
                i7 = 0;
            }
            int i16 = (i15 + i7) * 37;
            if (this.display_text != null) {
                i8 = this.display_text.hashCode();
            }
            i9 = i16 + i8;
            this.hashCode = i9;
        }
        return i9;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11249, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11249, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.method != null) {
            sb.append(", method=");
            sb.append(this.method);
        }
        if (this.msg_id != null) {
            sb.append(", msg_id=");
            sb.append(this.msg_id);
        }
        if (this.room_id != null) {
            sb.append(", room_id=");
            sb.append(this.room_id);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.monitor != null) {
            sb.append(", monitor=");
            sb.append(this.monitor);
        }
        if (this.is_show_msg != null) {
            sb.append(", is_show_msg=");
            sb.append(this.is_show_msg);
        }
        if (this.describe != null) {
            sb.append(", describe=");
            sb.append(this.describe);
        }
        if (this.display_text != null) {
            sb.append(", display_text=");
            sb.append(this.display_text);
        }
        StringBuilder replace = sb.replace(0, 2, "Common{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11247, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11247, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof Common)) {
                return false;
            }
            Common common = (Common) obj;
            if (!unknownFields().equals(common.unknownFields()) || !Internal.equals(this.method, common.method) || !Internal.equals(this.msg_id, common.msg_id) || !Internal.equals(this.room_id, common.room_id) || !Internal.equals(this.create_time, common.create_time) || !Internal.equals(this.monitor, common.monitor) || !Internal.equals(this.is_show_msg, common.is_show_msg) || !Internal.equals(this.describe, common.describe) || !Internal.equals(this.display_text, common.display_text)) {
                return false;
            }
            return true;
        }
    }

    public Common(String str, Long l, Long l2, Long l3, Integer num, Boolean bool, String str2, Text text) {
        this(str, l, l2, l3, num, bool, str2, text, ByteString.EMPTY);
    }

    public Common(String str, Long l, Long l2, Long l3, Integer num, Boolean bool, String str2, Text text, ByteString byteString) {
        super(ADAPTER, byteString);
        this.method = str;
        this.msg_id = l;
        this.room_id = l2;
        this.create_time = l3;
        this.monitor = num;
        this.is_show_msg = bool;
        this.describe = str2;
        this.display_text = text;
    }
}
