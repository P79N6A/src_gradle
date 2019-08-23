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

public final class ControlMessage extends Message<ControlMessage, Builder> {
    public static final ProtoAdapter<ControlMessage> ADAPTER = new ProtoAdapter_ControlMessage();
    public static final Long DEFAULT_ACTION = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long action;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.ControlMessage$Extra#ADAPTER", tag = 4)
    public final Extra extra;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String tips;

    public static final class Extra extends Message<Extra, Builder> {
        public static final ProtoAdapter<Extra> ADAPTER = new ProtoAdapter_Extra();
        public static final Long DEFAULT_REASON_NO = 0L;
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
        public final String ban_info_url;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Text#ADAPTER", tag = 5)
        public final Text content;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
        public final Long reason_no;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Text#ADAPTER", tag = 3)
        public final Text title;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Text#ADAPTER", tag = 4)
        public final Text violation_reason;

        public static final class Builder extends Message.Builder<Extra, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public String ban_info_url;
            public Text content;
            public Long reason_no;
            public Text title;
            public Text violation_reason;

            public final Extra build() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11292, new Class[0], Extra.class)) {
                    return (Extra) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11292, new Class[0], Extra.class);
                }
                Extra extra = new Extra(this.ban_info_url, this.reason_no, this.title, this.violation_reason, this.content, super.buildUnknownFields());
                return extra;
            }

            public final Builder ban_info_url(String str) {
                this.ban_info_url = str;
                return this;
            }

            public final Builder content(Text text) {
                this.content = text;
                return this;
            }

            public final Builder reason_no(Long l) {
                this.reason_no = l;
                return this;
            }

            public final Builder title(Text text) {
                this.title = text;
                return this;
            }

            public final Builder violation_reason(Text text) {
                this.violation_reason = text;
                return this;
            }
        }

        static final class ProtoAdapter_Extra extends ProtoAdapter<Extra> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_Extra() {
                super(FieldEncoding.LENGTH_DELIMITED, Extra.class);
            }

            public final Extra redact(Extra extra) {
                if (PatchProxy.isSupport(new Object[]{extra}, this, changeQuickRedirect, false, 11296, new Class[]{Extra.class}, Extra.class)) {
                    return (Extra) PatchProxy.accessDispatch(new Object[]{extra}, this, changeQuickRedirect, false, 11296, new Class[]{Extra.class}, Extra.class);
                }
                Builder newBuilder = extra.newBuilder();
                if (newBuilder.title != null) {
                    newBuilder.title = (Text) Text.ADAPTER.redact(newBuilder.title);
                }
                if (newBuilder.violation_reason != null) {
                    newBuilder.violation_reason = (Text) Text.ADAPTER.redact(newBuilder.violation_reason);
                }
                if (newBuilder.content != null) {
                    newBuilder.content = (Text) Text.ADAPTER.redact(newBuilder.content);
                }
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final Extra decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11295, new Class[]{ProtoReader.class}, Extra.class)) {
                    return (Extra) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11295, new Class[]{ProtoReader.class}, Extra.class);
                }
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                builder.ban_info_url((String) ProtoAdapter.STRING.decode(protoReader2));
                                break;
                            case 2:
                                builder.reason_no((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 3:
                                builder.title((Text) Text.ADAPTER.decode(protoReader2));
                                break;
                            case 4:
                                builder.violation_reason((Text) Text.ADAPTER.decode(protoReader2));
                                break;
                            case 5:
                                builder.content((Text) Text.ADAPTER.decode(protoReader2));
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

            public final int encodedSize(Extra extra) {
                int i;
                int i2;
                int i3;
                int i4;
                Extra extra2 = extra;
                int i5 = 0;
                if (PatchProxy.isSupport(new Object[]{extra2}, this, changeQuickRedirect, false, 11293, new Class[]{Extra.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{extra2}, this, changeQuickRedirect, false, 11293, new Class[]{Extra.class}, Integer.TYPE)).intValue();
                }
                if (extra2.ban_info_url != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, extra2.ban_info_url);
                } else {
                    i = 0;
                }
                if (extra2.reason_no != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, extra2.reason_no);
                } else {
                    i2 = 0;
                }
                int i6 = i + i2;
                if (extra2.title != null) {
                    i3 = Text.ADAPTER.encodedSizeWithTag(3, extra2.title);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (extra2.violation_reason != null) {
                    i4 = Text.ADAPTER.encodedSizeWithTag(4, extra2.violation_reason);
                } else {
                    i4 = 0;
                }
                int i8 = i7 + i4;
                if (extra2.content != null) {
                    i5 = Text.ADAPTER.encodedSizeWithTag(5, extra2.content);
                }
                return i8 + i5 + extra.unknownFields().size();
            }

            public final void encode(ProtoWriter protoWriter, Extra extra) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                Extra extra2 = extra;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, extra2}, this, changeQuickRedirect, false, 11294, new Class[]{ProtoWriter.class, Extra.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, extra2}, this, changeQuickRedirect, false, 11294, new Class[]{ProtoWriter.class, Extra.class}, Void.TYPE);
                    return;
                }
                if (extra2.ban_info_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, extra2.ban_info_url);
                }
                if (extra2.reason_no != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, extra2.reason_no);
                }
                if (extra2.title != null) {
                    Text.ADAPTER.encodeWithTag(protoWriter2, 3, extra2.title);
                }
                if (extra2.violation_reason != null) {
                    Text.ADAPTER.encodeWithTag(protoWriter2, 4, extra2.violation_reason);
                }
                if (extra2.content != null) {
                    Text.ADAPTER.encodeWithTag(protoWriter2, 5, extra2.content);
                }
                protoWriter2.writeBytes(extra.unknownFields());
            }
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11288, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11288, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.ban_info_url = this.ban_info_url;
            builder.reason_no = this.reason_no;
            builder.title = this.title;
            builder.violation_reason = this.violation_reason;
            builder.content = this.content;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11290, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11290, new Class[0], Integer.TYPE)).intValue();
            }
            int i6 = this.hashCode;
            if (i6 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                if (this.ban_info_url != null) {
                    i = this.ban_info_url.hashCode();
                } else {
                    i = 0;
                }
                int i7 = (hashCode + i) * 37;
                if (this.reason_no != null) {
                    i2 = this.reason_no.hashCode();
                } else {
                    i2 = 0;
                }
                int i8 = (i7 + i2) * 37;
                if (this.title != null) {
                    i3 = this.title.hashCode();
                } else {
                    i3 = 0;
                }
                int i9 = (i8 + i3) * 37;
                if (this.violation_reason != null) {
                    i4 = this.violation_reason.hashCode();
                } else {
                    i4 = 0;
                }
                int i10 = (i9 + i4) * 37;
                if (this.content != null) {
                    i5 = this.content.hashCode();
                }
                i6 = i10 + i5;
                this.hashCode = i6;
            }
            return i6;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11291, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11291, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (this.ban_info_url != null) {
                sb.append(", ban_info_url=");
                sb.append(this.ban_info_url);
            }
            if (this.reason_no != null) {
                sb.append(", reason_no=");
                sb.append(this.reason_no);
            }
            if (this.title != null) {
                sb.append(", title=");
                sb.append(this.title);
            }
            if (this.violation_reason != null) {
                sb.append(", violation_reason=");
                sb.append(this.violation_reason);
            }
            if (this.content != null) {
                sb.append(", content=");
                sb.append(this.content);
            }
            StringBuilder replace = sb.replace(0, 2, "Extra{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11289, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11289, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof Extra)) {
                    return false;
                }
                Extra extra = (Extra) obj;
                if (!unknownFields().equals(extra.unknownFields()) || !Internal.equals(this.ban_info_url, extra.ban_info_url) || !Internal.equals(this.reason_no, extra.reason_no) || !Internal.equals(this.title, extra.title) || !Internal.equals(this.violation_reason, extra.violation_reason) || !Internal.equals(this.content, extra.content)) {
                    return false;
                }
                return true;
            }
        }

        public Extra(String str, Long l, Text text, Text text2, Text text3) {
            this(str, l, text, text2, text3, ByteString.EMPTY);
        }

        public Extra(String str, Long l, Text text, Text text2, Text text3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.ban_info_url = str;
            this.reason_no = l;
            this.title = text;
            this.violation_reason = text2;
            this.content = text3;
        }
    }

    public static final class Builder extends Message.Builder<ControlMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Long action;
        public Common common;
        public Extra extra;
        public String tips;

        public final ControlMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11287, new Class[0], ControlMessage.class)) {
                return (ControlMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11287, new Class[0], ControlMessage.class);
            }
            ControlMessage controlMessage = new ControlMessage(this.common, this.action, this.tips, this.extra, super.buildUnknownFields());
            return controlMessage;
        }

        public final Builder action(Long l) {
            this.action = l;
            return this;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder extra(Extra extra2) {
            this.extra = extra2;
            return this;
        }

        public final Builder tips(String str) {
            this.tips = str;
            return this;
        }
    }

    static final class ProtoAdapter_ControlMessage extends ProtoAdapter<ControlMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_ControlMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, ControlMessage.class);
        }

        public final ControlMessage redact(ControlMessage controlMessage) {
            if (PatchProxy.isSupport(new Object[]{controlMessage}, this, changeQuickRedirect, false, 11300, new Class[]{ControlMessage.class}, ControlMessage.class)) {
                return (ControlMessage) PatchProxy.accessDispatch(new Object[]{controlMessage}, this, changeQuickRedirect, false, 11300, new Class[]{ControlMessage.class}, ControlMessage.class);
            }
            Builder newBuilder = controlMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.extra != null) {
                newBuilder.extra = (Extra) Extra.ADAPTER.redact(newBuilder.extra);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final ControlMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11299, new Class[]{ProtoReader.class}, ControlMessage.class)) {
                return (ControlMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11299, new Class[]{ProtoReader.class}, ControlMessage.class);
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
                            builder.action((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 3:
                            builder.tips((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 4:
                            builder.extra((Extra) Extra.ADAPTER.decode(protoReader2));
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

        public final int encodedSize(ControlMessage controlMessage) {
            int i;
            int i2;
            int i3;
            ControlMessage controlMessage2 = controlMessage;
            int i4 = 0;
            if (PatchProxy.isSupport(new Object[]{controlMessage2}, this, changeQuickRedirect, false, 11297, new Class[]{ControlMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{controlMessage2}, this, changeQuickRedirect, false, 11297, new Class[]{ControlMessage.class}, Integer.TYPE)).intValue();
            }
            if (controlMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, controlMessage2.common);
            } else {
                i = 0;
            }
            if (controlMessage2.action != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, controlMessage2.action);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (controlMessage2.tips != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, controlMessage2.tips);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (controlMessage2.extra != null) {
                i4 = Extra.ADAPTER.encodedSizeWithTag(4, controlMessage2.extra);
            }
            return i6 + i4 + controlMessage.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, ControlMessage controlMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            ControlMessage controlMessage2 = controlMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, controlMessage2}, this, changeQuickRedirect, false, 11298, new Class[]{ProtoWriter.class, ControlMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, controlMessage2}, this, changeQuickRedirect, false, 11298, new Class[]{ProtoWriter.class, ControlMessage.class}, Void.TYPE);
                return;
            }
            if (controlMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, controlMessage2.common);
            }
            if (controlMessage2.action != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, controlMessage2.action);
            }
            if (controlMessage2.tips != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, controlMessage2.tips);
            }
            if (controlMessage2.extra != null) {
                Extra.ADAPTER.encodeWithTag(protoWriter2, 4, controlMessage2.extra);
            }
            protoWriter2.writeBytes(controlMessage.unknownFields());
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11285, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11285, new Class[0], Integer.TYPE)).intValue();
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
            if (this.action != null) {
                i2 = this.action.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 37;
            if (this.tips != null) {
                i3 = this.tips.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 37;
            if (this.extra != null) {
                i4 = this.extra.hashCode();
            }
            i5 = i8 + i4;
            this.hashCode = i5;
        }
        return i5;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11283, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11283, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.action = this.action;
        builder.tips = this.tips;
        builder.extra = this.extra;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11286, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11286, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.action != null) {
            sb.append(", action=");
            sb.append(this.action);
        }
        if (this.tips != null) {
            sb.append(", tips=");
            sb.append(this.tips);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        StringBuilder replace = sb.replace(0, 2, "ControlMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11284, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11284, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof ControlMessage)) {
                return false;
            }
            ControlMessage controlMessage = (ControlMessage) obj;
            if (!unknownFields().equals(controlMessage.unknownFields()) || !Internal.equals(this.common, controlMessage.common) || !Internal.equals(this.action, controlMessage.action) || !Internal.equals(this.tips, controlMessage.tips) || !Internal.equals(this.extra, controlMessage.extra)) {
                return false;
            }
            return true;
        }
    }

    public ControlMessage(Common common2, Long l, String str, Extra extra2) {
        this(common2, l, str, extra2, ByteString.EMPTY);
    }

    public ControlMessage(Common common2, Long l, String str, Extra extra2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.action = l;
        this.tips = str;
        this.extra = extra2;
    }
}
