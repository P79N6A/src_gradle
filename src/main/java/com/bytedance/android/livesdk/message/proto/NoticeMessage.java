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

public final class NoticeMessage extends Message<NoticeMessage, Builder> {
    public static final ProtoAdapter<NoticeMessage> ADAPTER = new ProtoAdapter_NoticeMessage();
    public static final Long DEFAULT_NOTICE_TYPE = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String content;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Text#ADAPTER", tag = 7)
    public final Text display_text;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long notice_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String style;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Text#ADAPTER", tag = 8)
    public final Text tips_title;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 9)
    public final String tips_url;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Text#ADAPTER", tag = 5)
    public final Text title;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Text#ADAPTER", tag = 6)
    public final Text violation_reason;

    public static final class Builder extends Message.Builder<NoticeMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public String content;
        public Text display_text;
        public Long notice_type;
        public String style;
        public Text tips_title;
        public String tips_url;
        public Text title;
        public Text violation_reason;

        public final NoticeMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11917, new Class[0], NoticeMessage.class)) {
                return (NoticeMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11917, new Class[0], NoticeMessage.class);
            }
            NoticeMessage noticeMessage = new NoticeMessage(this.common, this.content, this.notice_type, this.style, this.title, this.violation_reason, this.display_text, this.tips_title, this.tips_url, super.buildUnknownFields());
            return noticeMessage;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }

        public final Builder display_text(Text text) {
            this.display_text = text;
            return this;
        }

        public final Builder notice_type(Long l) {
            this.notice_type = l;
            return this;
        }

        public final Builder style(String str) {
            this.style = str;
            return this;
        }

        public final Builder tips_title(Text text) {
            this.tips_title = text;
            return this;
        }

        public final Builder tips_url(String str) {
            this.tips_url = str;
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

    static final class ProtoAdapter_NoticeMessage extends ProtoAdapter<NoticeMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_NoticeMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, NoticeMessage.class);
        }

        public final NoticeMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11920, new Class[]{ProtoReader.class}, NoticeMessage.class)) {
                return (NoticeMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11920, new Class[]{ProtoReader.class}, NoticeMessage.class);
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
                            builder.notice_type((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 4:
                            builder.style((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 5:
                            builder.title((Text) Text.ADAPTER.decode(protoReader2));
                            break;
                        case 6:
                            builder.violation_reason((Text) Text.ADAPTER.decode(protoReader2));
                            break;
                        case e.l /*7*/:
                            builder.display_text((Text) Text.ADAPTER.decode(protoReader2));
                            break;
                        case 8:
                            builder.tips_title((Text) Text.ADAPTER.decode(protoReader2));
                            break;
                        case 9:
                            builder.tips_url((String) ProtoAdapter.STRING.decode(protoReader2));
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

        public final int encodedSize(NoticeMessage noticeMessage) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            NoticeMessage noticeMessage2 = noticeMessage;
            int i9 = 0;
            if (PatchProxy.isSupport(new Object[]{noticeMessage2}, this, changeQuickRedirect, false, 11918, new Class[]{NoticeMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{noticeMessage2}, this, changeQuickRedirect, false, 11918, new Class[]{NoticeMessage.class}, Integer.TYPE)).intValue();
            }
            if (noticeMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, noticeMessage2.common);
            } else {
                i = 0;
            }
            if (noticeMessage2.content != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, noticeMessage2.content);
            } else {
                i2 = 0;
            }
            int i10 = i + i2;
            if (noticeMessage2.notice_type != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, noticeMessage2.notice_type);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (noticeMessage2.style != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, noticeMessage2.style);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (noticeMessage2.title != null) {
                i5 = Text.ADAPTER.encodedSizeWithTag(5, noticeMessage2.title);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (noticeMessage2.violation_reason != null) {
                i6 = Text.ADAPTER.encodedSizeWithTag(6, noticeMessage2.violation_reason);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (noticeMessage2.display_text != null) {
                i7 = Text.ADAPTER.encodedSizeWithTag(7, noticeMessage2.display_text);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (noticeMessage2.tips_title != null) {
                i8 = Text.ADAPTER.encodedSizeWithTag(8, noticeMessage2.tips_title);
            } else {
                i8 = 0;
            }
            int i16 = i15 + i8;
            if (noticeMessage2.tips_url != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(9, noticeMessage2.tips_url);
            }
            return i16 + i9 + noticeMessage.unknownFields().size();
        }

        public final NoticeMessage redact(NoticeMessage noticeMessage) {
            if (PatchProxy.isSupport(new Object[]{noticeMessage}, this, changeQuickRedirect, false, 11921, new Class[]{NoticeMessage.class}, NoticeMessage.class)) {
                return (NoticeMessage) PatchProxy.accessDispatch(new Object[]{noticeMessage}, this, changeQuickRedirect, false, 11921, new Class[]{NoticeMessage.class}, NoticeMessage.class);
            }
            Builder newBuilder = noticeMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.title != null) {
                newBuilder.title = (Text) Text.ADAPTER.redact(newBuilder.title);
            }
            if (newBuilder.violation_reason != null) {
                newBuilder.violation_reason = (Text) Text.ADAPTER.redact(newBuilder.violation_reason);
            }
            if (newBuilder.display_text != null) {
                newBuilder.display_text = (Text) Text.ADAPTER.redact(newBuilder.display_text);
            }
            if (newBuilder.tips_title != null) {
                newBuilder.tips_title = (Text) Text.ADAPTER.redact(newBuilder.tips_title);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final void encode(ProtoWriter protoWriter, NoticeMessage noticeMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            NoticeMessage noticeMessage2 = noticeMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, noticeMessage2}, this, changeQuickRedirect, false, 11919, new Class[]{ProtoWriter.class, NoticeMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, noticeMessage2}, this, changeQuickRedirect, false, 11919, new Class[]{ProtoWriter.class, NoticeMessage.class}, Void.TYPE);
                return;
            }
            if (noticeMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, noticeMessage2.common);
            }
            if (noticeMessage2.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, noticeMessage2.content);
            }
            if (noticeMessage2.notice_type != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, noticeMessage2.notice_type);
            }
            if (noticeMessage2.style != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, noticeMessage2.style);
            }
            if (noticeMessage2.title != null) {
                Text.ADAPTER.encodeWithTag(protoWriter2, 5, noticeMessage2.title);
            }
            if (noticeMessage2.violation_reason != null) {
                Text.ADAPTER.encodeWithTag(protoWriter2, 6, noticeMessage2.violation_reason);
            }
            if (noticeMessage2.display_text != null) {
                Text.ADAPTER.encodeWithTag(protoWriter2, 7, noticeMessage2.display_text);
            }
            if (noticeMessage2.tips_title != null) {
                Text.ADAPTER.encodeWithTag(protoWriter2, 8, noticeMessage2.tips_title);
            }
            if (noticeMessage2.tips_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 9, noticeMessage2.tips_url);
            }
            protoWriter2.writeBytes(noticeMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11913, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11913, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.content = this.content;
        builder.notice_type = this.notice_type;
        builder.style = this.style;
        builder.title = this.title;
        builder.violation_reason = this.violation_reason;
        builder.display_text = this.display_text;
        builder.tips_title = this.tips_title;
        builder.tips_url = this.tips_url;
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
        int i9 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11915, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11915, new Class[0], Integer.TYPE)).intValue();
        }
        int i10 = this.hashCode;
        if (i10 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i11 = (hashCode + i) * 37;
            if (this.content != null) {
                i2 = this.content.hashCode();
            } else {
                i2 = 0;
            }
            int i12 = (i11 + i2) * 37;
            if (this.notice_type != null) {
                i3 = this.notice_type.hashCode();
            } else {
                i3 = 0;
            }
            int i13 = (i12 + i3) * 37;
            if (this.style != null) {
                i4 = this.style.hashCode();
            } else {
                i4 = 0;
            }
            int i14 = (i13 + i4) * 37;
            if (this.title != null) {
                i5 = this.title.hashCode();
            } else {
                i5 = 0;
            }
            int i15 = (i14 + i5) * 37;
            if (this.violation_reason != null) {
                i6 = this.violation_reason.hashCode();
            } else {
                i6 = 0;
            }
            int i16 = (i15 + i6) * 37;
            if (this.display_text != null) {
                i7 = this.display_text.hashCode();
            } else {
                i7 = 0;
            }
            int i17 = (i16 + i7) * 37;
            if (this.tips_title != null) {
                i8 = this.tips_title.hashCode();
            } else {
                i8 = 0;
            }
            int i18 = (i17 + i8) * 37;
            if (this.tips_url != null) {
                i9 = this.tips_url.hashCode();
            }
            i10 = i18 + i9;
            this.hashCode = i10;
        }
        return i10;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11916, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11916, new Class[0], String.class);
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
        if (this.notice_type != null) {
            sb.append(", notice_type=");
            sb.append(this.notice_type);
        }
        if (this.style != null) {
            sb.append(", style=");
            sb.append(this.style);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.violation_reason != null) {
            sb.append(", violation_reason=");
            sb.append(this.violation_reason);
        }
        if (this.display_text != null) {
            sb.append(", display_text=");
            sb.append(this.display_text);
        }
        if (this.tips_title != null) {
            sb.append(", tips_title=");
            sb.append(this.tips_title);
        }
        if (this.tips_url != null) {
            sb.append(", tips_url=");
            sb.append(this.tips_url);
        }
        StringBuilder replace = sb.replace(0, 2, "NoticeMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11914, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11914, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof NoticeMessage)) {
                return false;
            }
            NoticeMessage noticeMessage = (NoticeMessage) obj;
            if (!unknownFields().equals(noticeMessage.unknownFields()) || !Internal.equals(this.common, noticeMessage.common) || !Internal.equals(this.content, noticeMessage.content) || !Internal.equals(this.notice_type, noticeMessage.notice_type) || !Internal.equals(this.style, noticeMessage.style) || !Internal.equals(this.title, noticeMessage.title) || !Internal.equals(this.violation_reason, noticeMessage.violation_reason) || !Internal.equals(this.display_text, noticeMessage.display_text) || !Internal.equals(this.tips_title, noticeMessage.tips_title) || !Internal.equals(this.tips_url, noticeMessage.tips_url)) {
                return false;
            }
            return true;
        }
    }

    public NoticeMessage(Common common2, String str, Long l, String str2, Text text, Text text2, Text text3, Text text4, String str3) {
        this(common2, str, l, str2, text, text2, text3, text4, str3, ByteString.EMPTY);
    }

    public NoticeMessage(Common common2, String str, Long l, String str2, Text text, Text text2, Text text3, Text text4, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.content = str;
        this.notice_type = l;
        this.style = str2;
        this.title = text;
        this.violation_reason = text2;
        this.display_text = text3;
        this.tips_title = text4;
        this.tips_url = str3;
    }
}
