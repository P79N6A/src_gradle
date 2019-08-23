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
import java.util.List;
import okio.ByteString;

public final class CommonLuckyMoneyMessage extends Message<CommonLuckyMoneyMessage, Builder> {
    public static final ProtoAdapter<CommonLuckyMoneyMessage> ADAPTER = new ProtoAdapter_CommonLuckyMoneyMessage();
    public static final Long DEFAULT_DELAY_TIME = 0L;
    public static final Long DEFAULT_DIAMOND_COUNT = 0L;
    public static final Boolean DEFAULT_IS_OFFICIAL = Boolean.FALSE;
    public static final Long DEFAULT_LUCKYMONEY_ID = 0L;
    public static final Long DEFAULT_SEND_TIME = 0L;
    public static final Long DEFAULT_STYLE = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 9)
    public final Image background;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public final Long delay_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long diamond_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 10)
    public final Boolean is_official;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.CommonLuckyMoneyMessage$LuckyIcon#ADAPTER", tag = 8)
    public final LuckyIcon lucky_icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long luckymoney_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long send_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 7)
    public final Long style;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 6)
    public final User user;

    public static final class LuckyIcon extends Message<LuckyIcon, Builder> {
        public static final ProtoAdapter<LuckyIcon> ADAPTER = new ProtoAdapter_LuckyIcon();
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
        public final String uri;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 1)
        public final List<String> url_list;

        public static final class Builder extends Message.Builder<LuckyIcon, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public String uri;
            public List<String> url_list = Internal.newMutableList();

            public final LuckyIcon build() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11265, new Class[0], LuckyIcon.class)) {
                    return new LuckyIcon(this.url_list, this.uri, super.buildUnknownFields());
                }
                return (LuckyIcon) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11265, new Class[0], LuckyIcon.class);
            }

            public final Builder uri(String str) {
                this.uri = str;
                return this;
            }

            public final Builder url_list(List<String> list) {
                if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 11264, new Class[]{List.class}, Builder.class)) {
                    return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 11264, new Class[]{List.class}, Builder.class);
                }
                Internal.checkElementsNotNull(list);
                this.url_list = list;
                return this;
            }
        }

        static final class ProtoAdapter_LuckyIcon extends ProtoAdapter<LuckyIcon> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_LuckyIcon() {
                super(FieldEncoding.LENGTH_DELIMITED, LuckyIcon.class);
            }

            public final int encodedSize(LuckyIcon luckyIcon) {
                LuckyIcon luckyIcon2 = luckyIcon;
                int i = 0;
                if (PatchProxy.isSupport(new Object[]{luckyIcon2}, this, changeQuickRedirect, false, 11266, new Class[]{LuckyIcon.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{luckyIcon2}, this, changeQuickRedirect, false, 11266, new Class[]{LuckyIcon.class}, Integer.TYPE)).intValue();
                }
                int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, luckyIcon2.url_list);
                if (luckyIcon2.uri != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, luckyIcon2.uri);
                }
                return encodedSizeWithTag + i + luckyIcon.unknownFields().size();
            }

            public final LuckyIcon redact(LuckyIcon luckyIcon) {
                if (PatchProxy.isSupport(new Object[]{luckyIcon}, this, changeQuickRedirect, false, 11269, new Class[]{LuckyIcon.class}, LuckyIcon.class)) {
                    return (LuckyIcon) PatchProxy.accessDispatch(new Object[]{luckyIcon}, this, changeQuickRedirect, false, 11269, new Class[]{LuckyIcon.class}, LuckyIcon.class);
                }
                Builder newBuilder = luckyIcon.newBuilder();
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final LuckyIcon decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11268, new Class[]{ProtoReader.class}, LuckyIcon.class)) {
                    return (LuckyIcon) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11268, new Class[]{ProtoReader.class}, LuckyIcon.class);
                }
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                builder.url_list.add(ProtoAdapter.STRING.decode(protoReader2));
                                break;
                            case 2:
                                builder.uri((String) ProtoAdapter.STRING.decode(protoReader2));
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

            public final void encode(ProtoWriter protoWriter, LuckyIcon luckyIcon) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                LuckyIcon luckyIcon2 = luckyIcon;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, luckyIcon2}, this, changeQuickRedirect, false, 11267, new Class[]{ProtoWriter.class, LuckyIcon.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, luckyIcon2}, this, changeQuickRedirect, false, 11267, new Class[]{ProtoWriter.class, LuckyIcon.class}, Void.TYPE);
                    return;
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter2, 1, luckyIcon2.url_list);
                if (luckyIcon2.uri != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, luckyIcon2.uri);
                }
                protoWriter2.writeBytes(luckyIcon.unknownFields());
            }
        }

        public final int hashCode() {
            int i = 0;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11262, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11262, new Class[0], Integer.TYPE)).intValue();
            }
            int i2 = this.hashCode;
            if (i2 == 0) {
                int hashCode = ((unknownFields().hashCode() * 37) + this.url_list.hashCode()) * 37;
                if (this.uri != null) {
                    i = this.uri.hashCode();
                }
                i2 = hashCode + i;
                this.hashCode = i2;
            }
            return i2;
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11260, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11260, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.url_list = Internal.copyOf("url_list", this.url_list);
            builder.uri = this.uri;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11263, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11263, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (!this.url_list.isEmpty()) {
                sb.append(", url_list=");
                sb.append(this.url_list);
            }
            if (this.uri != null) {
                sb.append(", uri=");
                sb.append(this.uri);
            }
            StringBuilder replace = sb.replace(0, 2, "LuckyIcon{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11261, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11261, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof LuckyIcon)) {
                    return false;
                }
                LuckyIcon luckyIcon = (LuckyIcon) obj;
                if (!unknownFields().equals(luckyIcon.unknownFields()) || !this.url_list.equals(luckyIcon.url_list) || !Internal.equals(this.uri, luckyIcon.uri)) {
                    return false;
                }
                return true;
            }
        }

        public LuckyIcon(List<String> list, String str) {
            this(list, str, ByteString.EMPTY);
        }

        public LuckyIcon(List<String> list, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.url_list = Internal.immutableCopyOf("url_list", list);
            this.uri = str;
        }
    }

    public static final class Builder extends Message.Builder<CommonLuckyMoneyMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Image background;
        public Common common;
        public Long delay_time;
        public Long diamond_count;
        public Boolean is_official;
        public LuckyIcon lucky_icon;
        public Long luckymoney_id;
        public Long send_time;
        public Long style;
        public User user;

        public final CommonLuckyMoneyMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11259, new Class[0], CommonLuckyMoneyMessage.class)) {
                return (CommonLuckyMoneyMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11259, new Class[0], CommonLuckyMoneyMessage.class);
            }
            CommonLuckyMoneyMessage commonLuckyMoneyMessage = new CommonLuckyMoneyMessage(this.common, this.diamond_count, this.luckymoney_id, this.send_time, this.delay_time, this.user, this.style, this.lucky_icon, this.background, this.is_official, super.buildUnknownFields());
            return commonLuckyMoneyMessage;
        }

        public final Builder background(Image image) {
            this.background = image;
            return this;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder delay_time(Long l) {
            this.delay_time = l;
            return this;
        }

        public final Builder diamond_count(Long l) {
            this.diamond_count = l;
            return this;
        }

        public final Builder is_official(Boolean bool) {
            this.is_official = bool;
            return this;
        }

        public final Builder lucky_icon(LuckyIcon luckyIcon) {
            this.lucky_icon = luckyIcon;
            return this;
        }

        public final Builder luckymoney_id(Long l) {
            this.luckymoney_id = l;
            return this;
        }

        public final Builder send_time(Long l) {
            this.send_time = l;
            return this;
        }

        public final Builder style(Long l) {
            this.style = l;
            return this;
        }

        public final Builder user(User user2) {
            this.user = user2;
            return this;
        }
    }

    static final class ProtoAdapter_CommonLuckyMoneyMessage extends ProtoAdapter<CommonLuckyMoneyMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_CommonLuckyMoneyMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, CommonLuckyMoneyMessage.class);
        }

        public final CommonLuckyMoneyMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11272, new Class[]{ProtoReader.class}, CommonLuckyMoneyMessage.class)) {
                return (CommonLuckyMoneyMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11272, new Class[]{ProtoReader.class}, CommonLuckyMoneyMessage.class);
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
                            builder.diamond_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 3:
                            builder.luckymoney_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 4:
                            builder.send_time((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 5:
                            builder.delay_time((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 6:
                            builder.user((User) User.ADAPTER.decode(protoReader2));
                            break;
                        case e.l /*7*/:
                            builder.style((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 8:
                            builder.lucky_icon((LuckyIcon) LuckyIcon.ADAPTER.decode(protoReader2));
                            break;
                        case 9:
                            builder.background((Image) Image.ADAPTER.decode(protoReader2));
                            break;
                        case 10:
                            builder.is_official((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
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

        public final int encodedSize(CommonLuckyMoneyMessage commonLuckyMoneyMessage) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            CommonLuckyMoneyMessage commonLuckyMoneyMessage2 = commonLuckyMoneyMessage;
            int i10 = 0;
            if (PatchProxy.isSupport(new Object[]{commonLuckyMoneyMessage2}, this, changeQuickRedirect, false, 11270, new Class[]{CommonLuckyMoneyMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{commonLuckyMoneyMessage2}, this, changeQuickRedirect, false, 11270, new Class[]{CommonLuckyMoneyMessage.class}, Integer.TYPE)).intValue();
            }
            if (commonLuckyMoneyMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, commonLuckyMoneyMessage2.common);
            } else {
                i = 0;
            }
            if (commonLuckyMoneyMessage2.diamond_count != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, commonLuckyMoneyMessage2.diamond_count);
            } else {
                i2 = 0;
            }
            int i11 = i + i2;
            if (commonLuckyMoneyMessage2.luckymoney_id != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, commonLuckyMoneyMessage2.luckymoney_id);
            } else {
                i3 = 0;
            }
            int i12 = i11 + i3;
            if (commonLuckyMoneyMessage2.send_time != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, commonLuckyMoneyMessage2.send_time);
            } else {
                i4 = 0;
            }
            int i13 = i12 + i4;
            if (commonLuckyMoneyMessage2.delay_time != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, commonLuckyMoneyMessage2.delay_time);
            } else {
                i5 = 0;
            }
            int i14 = i13 + i5;
            if (commonLuckyMoneyMessage2.user != null) {
                i6 = User.ADAPTER.encodedSizeWithTag(6, commonLuckyMoneyMessage2.user);
            } else {
                i6 = 0;
            }
            int i15 = i14 + i6;
            if (commonLuckyMoneyMessage2.style != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, commonLuckyMoneyMessage2.style);
            } else {
                i7 = 0;
            }
            int i16 = i15 + i7;
            if (commonLuckyMoneyMessage2.lucky_icon != null) {
                i8 = LuckyIcon.ADAPTER.encodedSizeWithTag(8, commonLuckyMoneyMessage2.lucky_icon);
            } else {
                i8 = 0;
            }
            int i17 = i16 + i8;
            if (commonLuckyMoneyMessage2.background != null) {
                i9 = Image.ADAPTER.encodedSizeWithTag(9, commonLuckyMoneyMessage2.background);
            } else {
                i9 = 0;
            }
            int i18 = i17 + i9;
            if (commonLuckyMoneyMessage2.is_official != null) {
                i10 = ProtoAdapter.BOOL.encodedSizeWithTag(10, commonLuckyMoneyMessage2.is_official);
            }
            return i18 + i10 + commonLuckyMoneyMessage.unknownFields().size();
        }

        public final CommonLuckyMoneyMessage redact(CommonLuckyMoneyMessage commonLuckyMoneyMessage) {
            if (PatchProxy.isSupport(new Object[]{commonLuckyMoneyMessage}, this, changeQuickRedirect, false, 11273, new Class[]{CommonLuckyMoneyMessage.class}, CommonLuckyMoneyMessage.class)) {
                return (CommonLuckyMoneyMessage) PatchProxy.accessDispatch(new Object[]{commonLuckyMoneyMessage}, this, changeQuickRedirect, false, 11273, new Class[]{CommonLuckyMoneyMessage.class}, CommonLuckyMoneyMessage.class);
            }
            Builder newBuilder = commonLuckyMoneyMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.user != null) {
                newBuilder.user = (User) User.ADAPTER.redact(newBuilder.user);
            }
            if (newBuilder.lucky_icon != null) {
                newBuilder.lucky_icon = (LuckyIcon) LuckyIcon.ADAPTER.redact(newBuilder.lucky_icon);
            }
            if (newBuilder.background != null) {
                newBuilder.background = (Image) Image.ADAPTER.redact(newBuilder.background);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final void encode(ProtoWriter protoWriter, CommonLuckyMoneyMessage commonLuckyMoneyMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            CommonLuckyMoneyMessage commonLuckyMoneyMessage2 = commonLuckyMoneyMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, commonLuckyMoneyMessage2}, this, changeQuickRedirect, false, 11271, new Class[]{ProtoWriter.class, CommonLuckyMoneyMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, commonLuckyMoneyMessage2}, this, changeQuickRedirect, false, 11271, new Class[]{ProtoWriter.class, CommonLuckyMoneyMessage.class}, Void.TYPE);
                return;
            }
            if (commonLuckyMoneyMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, commonLuckyMoneyMessage2.common);
            }
            if (commonLuckyMoneyMessage2.diamond_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, commonLuckyMoneyMessage2.diamond_count);
            }
            if (commonLuckyMoneyMessage2.luckymoney_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, commonLuckyMoneyMessage2.luckymoney_id);
            }
            if (commonLuckyMoneyMessage2.send_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, commonLuckyMoneyMessage2.send_time);
            }
            if (commonLuckyMoneyMessage2.delay_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 5, commonLuckyMoneyMessage2.delay_time);
            }
            if (commonLuckyMoneyMessage2.user != null) {
                User.ADAPTER.encodeWithTag(protoWriter2, 6, commonLuckyMoneyMessage2.user);
            }
            if (commonLuckyMoneyMessage2.style != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 7, commonLuckyMoneyMessage2.style);
            }
            if (commonLuckyMoneyMessage2.lucky_icon != null) {
                LuckyIcon.ADAPTER.encodeWithTag(protoWriter2, 8, commonLuckyMoneyMessage2.lucky_icon);
            }
            if (commonLuckyMoneyMessage2.background != null) {
                Image.ADAPTER.encodeWithTag(protoWriter2, 9, commonLuckyMoneyMessage2.background);
            }
            if (commonLuckyMoneyMessage2.is_official != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 10, commonLuckyMoneyMessage2.is_official);
            }
            protoWriter2.writeBytes(commonLuckyMoneyMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11255, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11255, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.diamond_count = this.diamond_count;
        builder.luckymoney_id = this.luckymoney_id;
        builder.send_time = this.send_time;
        builder.delay_time = this.delay_time;
        builder.user = this.user;
        builder.style = this.style;
        builder.lucky_icon = this.lucky_icon;
        builder.background = this.background;
        builder.is_official = this.is_official;
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
        int i10 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11257, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11257, new Class[0], Integer.TYPE)).intValue();
        }
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i12 = (hashCode + i) * 37;
            if (this.diamond_count != null) {
                i2 = this.diamond_count.hashCode();
            } else {
                i2 = 0;
            }
            int i13 = (i12 + i2) * 37;
            if (this.luckymoney_id != null) {
                i3 = this.luckymoney_id.hashCode();
            } else {
                i3 = 0;
            }
            int i14 = (i13 + i3) * 37;
            if (this.send_time != null) {
                i4 = this.send_time.hashCode();
            } else {
                i4 = 0;
            }
            int i15 = (i14 + i4) * 37;
            if (this.delay_time != null) {
                i5 = this.delay_time.hashCode();
            } else {
                i5 = 0;
            }
            int i16 = (i15 + i5) * 37;
            if (this.user != null) {
                i6 = this.user.hashCode();
            } else {
                i6 = 0;
            }
            int i17 = (i16 + i6) * 37;
            if (this.style != null) {
                i7 = this.style.hashCode();
            } else {
                i7 = 0;
            }
            int i18 = (i17 + i7) * 37;
            if (this.lucky_icon != null) {
                i8 = this.lucky_icon.hashCode();
            } else {
                i8 = 0;
            }
            int i19 = (i18 + i8) * 37;
            if (this.background != null) {
                i9 = this.background.hashCode();
            } else {
                i9 = 0;
            }
            int i20 = (i19 + i9) * 37;
            if (this.is_official != null) {
                i10 = this.is_official.hashCode();
            }
            i11 = i20 + i10;
            this.hashCode = i11;
        }
        return i11;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11258, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11258, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.diamond_count != null) {
            sb.append(", diamond_count=");
            sb.append(this.diamond_count);
        }
        if (this.luckymoney_id != null) {
            sb.append(", luckymoney_id=");
            sb.append(this.luckymoney_id);
        }
        if (this.send_time != null) {
            sb.append(", send_time=");
            sb.append(this.send_time);
        }
        if (this.delay_time != null) {
            sb.append(", delay_time=");
            sb.append(this.delay_time);
        }
        if (this.user != null) {
            sb.append(", user=");
            sb.append(this.user);
        }
        if (this.style != null) {
            sb.append(", style=");
            sb.append(this.style);
        }
        if (this.lucky_icon != null) {
            sb.append(", lucky_icon=");
            sb.append(this.lucky_icon);
        }
        if (this.background != null) {
            sb.append(", background=");
            sb.append(this.background);
        }
        if (this.is_official != null) {
            sb.append(", is_official=");
            sb.append(this.is_official);
        }
        StringBuilder replace = sb.replace(0, 2, "CommonLuckyMoneyMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11256, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11256, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof CommonLuckyMoneyMessage)) {
                return false;
            }
            CommonLuckyMoneyMessage commonLuckyMoneyMessage = (CommonLuckyMoneyMessage) obj;
            if (!unknownFields().equals(commonLuckyMoneyMessage.unknownFields()) || !Internal.equals(this.common, commonLuckyMoneyMessage.common) || !Internal.equals(this.diamond_count, commonLuckyMoneyMessage.diamond_count) || !Internal.equals(this.luckymoney_id, commonLuckyMoneyMessage.luckymoney_id) || !Internal.equals(this.send_time, commonLuckyMoneyMessage.send_time) || !Internal.equals(this.delay_time, commonLuckyMoneyMessage.delay_time) || !Internal.equals(this.user, commonLuckyMoneyMessage.user) || !Internal.equals(this.style, commonLuckyMoneyMessage.style) || !Internal.equals(this.lucky_icon, commonLuckyMoneyMessage.lucky_icon) || !Internal.equals(this.background, commonLuckyMoneyMessage.background) || !Internal.equals(this.is_official, commonLuckyMoneyMessage.is_official)) {
                return false;
            }
            return true;
        }
    }

    public CommonLuckyMoneyMessage(Common common2, Long l, Long l2, Long l3, Long l4, User user2, Long l5, LuckyIcon luckyIcon, Image image, Boolean bool) {
        this(common2, l, l2, l3, l4, user2, l5, luckyIcon, image, bool, ByteString.EMPTY);
    }

    public CommonLuckyMoneyMessage(Common common2, Long l, Long l2, Long l3, Long l4, User user2, Long l5, LuckyIcon luckyIcon, Image image, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.diamond_count = l;
        this.luckymoney_id = l2;
        this.send_time = l3;
        this.delay_time = l4;
        this.user = user2;
        this.style = l5;
        this.lucky_icon = luckyIcon;
        this.background = image;
        this.is_official = bool;
    }
}
