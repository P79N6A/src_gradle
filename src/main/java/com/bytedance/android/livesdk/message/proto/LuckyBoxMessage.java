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
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class LuckyBoxMessage extends Message<LuckyBoxMessage, Builder> {
    public static final ProtoAdapter<LuckyBoxMessage> ADAPTER = new ProtoAdapter_LuckyBoxMessage();
    public static final Long DEFAULT_BOX_ID = 0L;
    public static final Long DEFAULT_BOX_TYPE = 0L;
    public static final Long DEFAULT_DELAY_TIME = 0L;
    public static final Long DEFAULT_DIAMOND_COUNT = 0L;
    public static final Boolean DEFAULT_IS_OFFICIAL = Boolean.FALSE;
    public static final Boolean DEFAULT_LARGE = Boolean.FALSE;
    public static final Long DEFAULT_PRIORITY = 0L;
    public static final Long DEFAULT_SEND_TIME = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 9)
    public final Image background;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long box_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
    public final Long box_type;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public final Long delay_time;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.LuckyBoxMessage$ImgText#ADAPTER", label = WireField.Label.REPEATED, tag = 13)
    public final List<ImgText> description_list;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long diamond_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 10)
    public final Boolean is_official;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 8)
    public final Boolean large;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 14)
    public final Image lucky_icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 11)
    public final Long priority;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long send_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String title;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 12)
    public final User user;

    public static final class ImgText extends Message<ImgText, Builder> {
        public static final ProtoAdapter<ImgText> ADAPTER = new ProtoAdapter_ImgText();
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 1)
        public final Image image;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
        public final String text;

        public static final class Builder extends Message.Builder<ImgText, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public Image image;
            public String text;

            public final ImgText build() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11831, new Class[0], ImgText.class)) {
                    return new ImgText(this.image, this.text, super.buildUnknownFields());
                }
                return (ImgText) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11831, new Class[0], ImgText.class);
            }

            public final Builder image(Image image2) {
                this.image = image2;
                return this;
            }

            public final Builder text(String str) {
                this.text = str;
                return this;
            }
        }

        static final class ProtoAdapter_ImgText extends ProtoAdapter<ImgText> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_ImgText() {
                super(FieldEncoding.LENGTH_DELIMITED, ImgText.class);
            }

            public final int encodedSize(ImgText imgText) {
                int i;
                ImgText imgText2 = imgText;
                int i2 = 0;
                if (PatchProxy.isSupport(new Object[]{imgText2}, this, changeQuickRedirect, false, 11832, new Class[]{ImgText.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{imgText2}, this, changeQuickRedirect, false, 11832, new Class[]{ImgText.class}, Integer.TYPE)).intValue();
                }
                if (imgText2.image != null) {
                    i = Image.ADAPTER.encodedSizeWithTag(1, imgText2.image);
                } else {
                    i = 0;
                }
                if (imgText2.text != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, imgText2.text);
                }
                return i + i2 + imgText.unknownFields().size();
            }

            public final ImgText redact(ImgText imgText) {
                if (PatchProxy.isSupport(new Object[]{imgText}, this, changeQuickRedirect, false, 11835, new Class[]{ImgText.class}, ImgText.class)) {
                    return (ImgText) PatchProxy.accessDispatch(new Object[]{imgText}, this, changeQuickRedirect, false, 11835, new Class[]{ImgText.class}, ImgText.class);
                }
                Builder newBuilder = imgText.newBuilder();
                if (newBuilder.image != null) {
                    newBuilder.image = (Image) Image.ADAPTER.redact(newBuilder.image);
                }
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final ImgText decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11834, new Class[]{ProtoReader.class}, ImgText.class)) {
                    return (ImgText) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11834, new Class[]{ProtoReader.class}, ImgText.class);
                }
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                builder.image((Image) Image.ADAPTER.decode(protoReader2));
                                break;
                            case 2:
                                builder.text((String) ProtoAdapter.STRING.decode(protoReader2));
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

            public final void encode(ProtoWriter protoWriter, ImgText imgText) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                ImgText imgText2 = imgText;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, imgText2}, this, changeQuickRedirect, false, 11833, new Class[]{ProtoWriter.class, ImgText.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, imgText2}, this, changeQuickRedirect, false, 11833, new Class[]{ProtoWriter.class, ImgText.class}, Void.TYPE);
                    return;
                }
                if (imgText2.image != null) {
                    Image.ADAPTER.encodeWithTag(protoWriter2, 1, imgText2.image);
                }
                if (imgText2.text != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, imgText2.text);
                }
                protoWriter2.writeBytes(imgText.unknownFields());
            }
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11827, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11827, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.image = this.image;
            builder.text = this.text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final int hashCode() {
            int i;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11829, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11829, new Class[0], Integer.TYPE)).intValue();
            }
            int i3 = this.hashCode;
            if (i3 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                if (this.image != null) {
                    i = this.image.hashCode();
                } else {
                    i = 0;
                }
                int i4 = (hashCode + i) * 37;
                if (this.text != null) {
                    i2 = this.text.hashCode();
                }
                i3 = i4 + i2;
                this.hashCode = i3;
            }
            return i3;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11830, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11830, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (this.image != null) {
                sb.append(", image=");
                sb.append(this.image);
            }
            if (this.text != null) {
                sb.append(", text=");
                sb.append(this.text);
            }
            StringBuilder replace = sb.replace(0, 2, "ImgText{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11828, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11828, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof ImgText)) {
                    return false;
                }
                ImgText imgText = (ImgText) obj;
                if (!unknownFields().equals(imgText.unknownFields()) || !Internal.equals(this.image, imgText.image) || !Internal.equals(this.text, imgText.text)) {
                    return false;
                }
                return true;
            }
        }

        public ImgText(Image image2, String str) {
            this(image2, str, ByteString.EMPTY);
        }

        public ImgText(Image image2, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.image = image2;
            this.text = str;
        }
    }

    public static final class Builder extends Message.Builder<LuckyBoxMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Image background;
        public Long box_id;
        public Long box_type;
        public Common common;
        public Long delay_time;
        public List<ImgText> description_list = Internal.newMutableList();
        public Long diamond_count;
        public Boolean is_official;
        public Boolean large;
        public Image lucky_icon;
        public Long priority;
        public Long send_time;
        public String title;
        public User user;

        public final LuckyBoxMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11826, new Class[0], LuckyBoxMessage.class)) {
                return (LuckyBoxMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11826, new Class[0], LuckyBoxMessage.class);
            }
            Common common2 = this.common;
            Long l = this.diamond_count;
            Long l2 = this.box_id;
            Long l3 = this.send_time;
            Long l4 = this.delay_time;
            Long l5 = this.box_type;
            String str = this.title;
            Boolean bool = this.large;
            Image image = this.background;
            Boolean bool2 = this.is_official;
            Long l6 = this.priority;
            User user2 = this.user;
            List<ImgText> list = this.description_list;
            Boolean bool3 = bool;
            Image image2 = image;
            Boolean bool4 = bool2;
            Long l7 = l6;
            User user3 = user2;
            List<ImgText> list2 = list;
            LuckyBoxMessage luckyBoxMessage = new LuckyBoxMessage(common2, l, l2, l3, l4, l5, str, bool3, image2, bool4, l7, user3, list2, this.lucky_icon, super.buildUnknownFields());
            return luckyBoxMessage;
        }

        public final Builder background(Image image) {
            this.background = image;
            return this;
        }

        public final Builder box_id(Long l) {
            this.box_id = l;
            return this;
        }

        public final Builder box_type(Long l) {
            this.box_type = l;
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

        public final Builder large(Boolean bool) {
            this.large = bool;
            return this;
        }

        public final Builder lucky_icon(Image image) {
            this.lucky_icon = image;
            return this;
        }

        public final Builder priority(Long l) {
            this.priority = l;
            return this;
        }

        public final Builder send_time(Long l) {
            this.send_time = l;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }

        public final Builder user(User user2) {
            this.user = user2;
            return this;
        }

        public final Builder description_list(List<ImgText> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 11825, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 11825, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.description_list = list;
            return this;
        }
    }

    static final class ProtoAdapter_LuckyBoxMessage extends ProtoAdapter<LuckyBoxMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_LuckyBoxMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, LuckyBoxMessage.class);
        }

        public final LuckyBoxMessage redact(LuckyBoxMessage luckyBoxMessage) {
            if (PatchProxy.isSupport(new Object[]{luckyBoxMessage}, this, changeQuickRedirect, false, 11839, new Class[]{LuckyBoxMessage.class}, LuckyBoxMessage.class)) {
                return (LuckyBoxMessage) PatchProxy.accessDispatch(new Object[]{luckyBoxMessage}, this, changeQuickRedirect, false, 11839, new Class[]{LuckyBoxMessage.class}, LuckyBoxMessage.class);
            }
            Builder newBuilder = luckyBoxMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.background != null) {
                newBuilder.background = (Image) Image.ADAPTER.redact(newBuilder.background);
            }
            if (newBuilder.user != null) {
                newBuilder.user = (User) User.ADAPTER.redact(newBuilder.user);
            }
            Internal.redactElements(newBuilder.description_list, ImgText.ADAPTER);
            if (newBuilder.lucky_icon != null) {
                newBuilder.lucky_icon = (Image) Image.ADAPTER.redact(newBuilder.lucky_icon);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final LuckyBoxMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11838, new Class[]{ProtoReader.class}, LuckyBoxMessage.class)) {
                return (LuckyBoxMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11838, new Class[]{ProtoReader.class}, LuckyBoxMessage.class);
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
                            builder.box_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 4:
                            builder.send_time((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 5:
                            builder.delay_time((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 6:
                            builder.box_type((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case e.l /*7*/:
                            builder.title((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 8:
                            builder.large((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 9:
                            builder.background((Image) Image.ADAPTER.decode(protoReader2));
                            break;
                        case 10:
                            builder.is_official((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 11:
                            builder.priority((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                            builder.user((User) User.ADAPTER.decode(protoReader2));
                            break;
                        case 13:
                            builder.description_list.add(ImgText.ADAPTER.decode(protoReader2));
                            break;
                        case 14:
                            builder.lucky_icon((Image) Image.ADAPTER.decode(protoReader2));
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

        public final int encodedSize(LuckyBoxMessage luckyBoxMessage) {
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
            int i11;
            int i12;
            LuckyBoxMessage luckyBoxMessage2 = luckyBoxMessage;
            int i13 = 0;
            if (PatchProxy.isSupport(new Object[]{luckyBoxMessage2}, this, changeQuickRedirect, false, 11836, new Class[]{LuckyBoxMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{luckyBoxMessage2}, this, changeQuickRedirect, false, 11836, new Class[]{LuckyBoxMessage.class}, Integer.TYPE)).intValue();
            }
            if (luckyBoxMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, luckyBoxMessage2.common);
            } else {
                i = 0;
            }
            if (luckyBoxMessage2.diamond_count != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, luckyBoxMessage2.diamond_count);
            } else {
                i2 = 0;
            }
            int i14 = i + i2;
            if (luckyBoxMessage2.box_id != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, luckyBoxMessage2.box_id);
            } else {
                i3 = 0;
            }
            int i15 = i14 + i3;
            if (luckyBoxMessage2.send_time != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, luckyBoxMessage2.send_time);
            } else {
                i4 = 0;
            }
            int i16 = i15 + i4;
            if (luckyBoxMessage2.delay_time != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, luckyBoxMessage2.delay_time);
            } else {
                i5 = 0;
            }
            int i17 = i16 + i5;
            if (luckyBoxMessage2.box_type != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, luckyBoxMessage2.box_type);
            } else {
                i6 = 0;
            }
            int i18 = i17 + i6;
            if (luckyBoxMessage2.title != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, luckyBoxMessage2.title);
            } else {
                i7 = 0;
            }
            int i19 = i18 + i7;
            if (luckyBoxMessage2.large != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(8, luckyBoxMessage2.large);
            } else {
                i8 = 0;
            }
            int i20 = i19 + i8;
            if (luckyBoxMessage2.background != null) {
                i9 = Image.ADAPTER.encodedSizeWithTag(9, luckyBoxMessage2.background);
            } else {
                i9 = 0;
            }
            int i21 = i20 + i9;
            if (luckyBoxMessage2.is_official != null) {
                i10 = ProtoAdapter.BOOL.encodedSizeWithTag(10, luckyBoxMessage2.is_official);
            } else {
                i10 = 0;
            }
            int i22 = i21 + i10;
            if (luckyBoxMessage2.priority != null) {
                i11 = ProtoAdapter.INT64.encodedSizeWithTag(11, luckyBoxMessage2.priority);
            } else {
                i11 = 0;
            }
            int i23 = i22 + i11;
            if (luckyBoxMessage2.user != null) {
                i12 = User.ADAPTER.encodedSizeWithTag(12, luckyBoxMessage2.user);
            } else {
                i12 = 0;
            }
            int encodedSizeWithTag = i23 + i12 + ImgText.ADAPTER.asRepeated().encodedSizeWithTag(13, luckyBoxMessage2.description_list);
            if (luckyBoxMessage2.lucky_icon != null) {
                i13 = Image.ADAPTER.encodedSizeWithTag(14, luckyBoxMessage2.lucky_icon);
            }
            return encodedSizeWithTag + i13 + luckyBoxMessage.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, LuckyBoxMessage luckyBoxMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            LuckyBoxMessage luckyBoxMessage2 = luckyBoxMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, luckyBoxMessage2}, this, changeQuickRedirect, false, 11837, new Class[]{ProtoWriter.class, LuckyBoxMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, luckyBoxMessage2}, this, changeQuickRedirect, false, 11837, new Class[]{ProtoWriter.class, LuckyBoxMessage.class}, Void.TYPE);
                return;
            }
            if (luckyBoxMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, luckyBoxMessage2.common);
            }
            if (luckyBoxMessage2.diamond_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, luckyBoxMessage2.diamond_count);
            }
            if (luckyBoxMessage2.box_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, luckyBoxMessage2.box_id);
            }
            if (luckyBoxMessage2.send_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, luckyBoxMessage2.send_time);
            }
            if (luckyBoxMessage2.delay_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 5, luckyBoxMessage2.delay_time);
            }
            if (luckyBoxMessage2.box_type != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 6, luckyBoxMessage2.box_type);
            }
            if (luckyBoxMessage2.title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 7, luckyBoxMessage2.title);
            }
            if (luckyBoxMessage2.large != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 8, luckyBoxMessage2.large);
            }
            if (luckyBoxMessage2.background != null) {
                Image.ADAPTER.encodeWithTag(protoWriter2, 9, luckyBoxMessage2.background);
            }
            if (luckyBoxMessage2.is_official != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 10, luckyBoxMessage2.is_official);
            }
            if (luckyBoxMessage2.priority != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 11, luckyBoxMessage2.priority);
            }
            if (luckyBoxMessage2.user != null) {
                User.ADAPTER.encodeWithTag(protoWriter2, 12, luckyBoxMessage2.user);
            }
            ImgText.ADAPTER.asRepeated().encodeWithTag(protoWriter2, 13, luckyBoxMessage2.description_list);
            if (luckyBoxMessage2.lucky_icon != null) {
                Image.ADAPTER.encodeWithTag(protoWriter2, 14, luckyBoxMessage2.lucky_icon);
            }
            protoWriter2.writeBytes(luckyBoxMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11821, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11821, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.diamond_count = this.diamond_count;
        builder.box_id = this.box_id;
        builder.send_time = this.send_time;
        builder.delay_time = this.delay_time;
        builder.box_type = this.box_type;
        builder.title = this.title;
        builder.large = this.large;
        builder.background = this.background;
        builder.is_official = this.is_official;
        builder.priority = this.priority;
        builder.user = this.user;
        builder.description_list = Internal.copyOf("description_list", this.description_list);
        builder.lucky_icon = this.lucky_icon;
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
        int i11;
        int i12;
        int i13 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11823, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11823, new Class[0], Integer.TYPE)).intValue();
        }
        int i14 = this.hashCode;
        if (i14 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i15 = (hashCode + i) * 37;
            if (this.diamond_count != null) {
                i2 = this.diamond_count.hashCode();
            } else {
                i2 = 0;
            }
            int i16 = (i15 + i2) * 37;
            if (this.box_id != null) {
                i3 = this.box_id.hashCode();
            } else {
                i3 = 0;
            }
            int i17 = (i16 + i3) * 37;
            if (this.send_time != null) {
                i4 = this.send_time.hashCode();
            } else {
                i4 = 0;
            }
            int i18 = (i17 + i4) * 37;
            if (this.delay_time != null) {
                i5 = this.delay_time.hashCode();
            } else {
                i5 = 0;
            }
            int i19 = (i18 + i5) * 37;
            if (this.box_type != null) {
                i6 = this.box_type.hashCode();
            } else {
                i6 = 0;
            }
            int i20 = (i19 + i6) * 37;
            if (this.title != null) {
                i7 = this.title.hashCode();
            } else {
                i7 = 0;
            }
            int i21 = (i20 + i7) * 37;
            if (this.large != null) {
                i8 = this.large.hashCode();
            } else {
                i8 = 0;
            }
            int i22 = (i21 + i8) * 37;
            if (this.background != null) {
                i9 = this.background.hashCode();
            } else {
                i9 = 0;
            }
            int i23 = (i22 + i9) * 37;
            if (this.is_official != null) {
                i10 = this.is_official.hashCode();
            } else {
                i10 = 0;
            }
            int i24 = (i23 + i10) * 37;
            if (this.priority != null) {
                i11 = this.priority.hashCode();
            } else {
                i11 = 0;
            }
            int i25 = (i24 + i11) * 37;
            if (this.user != null) {
                i12 = this.user.hashCode();
            } else {
                i12 = 0;
            }
            int hashCode2 = (((i25 + i12) * 37) + this.description_list.hashCode()) * 37;
            if (this.lucky_icon != null) {
                i13 = this.lucky_icon.hashCode();
            }
            i14 = hashCode2 + i13;
            this.hashCode = i14;
        }
        return i14;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11824, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11824, new Class[0], String.class);
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
        if (this.box_id != null) {
            sb.append(", box_id=");
            sb.append(this.box_id);
        }
        if (this.send_time != null) {
            sb.append(", send_time=");
            sb.append(this.send_time);
        }
        if (this.delay_time != null) {
            sb.append(", delay_time=");
            sb.append(this.delay_time);
        }
        if (this.box_type != null) {
            sb.append(", box_type=");
            sb.append(this.box_type);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.large != null) {
            sb.append(", large=");
            sb.append(this.large);
        }
        if (this.background != null) {
            sb.append(", background=");
            sb.append(this.background);
        }
        if (this.is_official != null) {
            sb.append(", is_official=");
            sb.append(this.is_official);
        }
        if (this.priority != null) {
            sb.append(", priority=");
            sb.append(this.priority);
        }
        if (this.user != null) {
            sb.append(", user=");
            sb.append(this.user);
        }
        if (!this.description_list.isEmpty()) {
            sb.append(", description_list=");
            sb.append(this.description_list);
        }
        if (this.lucky_icon != null) {
            sb.append(", lucky_icon=");
            sb.append(this.lucky_icon);
        }
        StringBuilder replace = sb.replace(0, 2, "LuckyBoxMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11822, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11822, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof LuckyBoxMessage)) {
                return false;
            }
            LuckyBoxMessage luckyBoxMessage = (LuckyBoxMessage) obj;
            if (!unknownFields().equals(luckyBoxMessage.unknownFields()) || !Internal.equals(this.common, luckyBoxMessage.common) || !Internal.equals(this.diamond_count, luckyBoxMessage.diamond_count) || !Internal.equals(this.box_id, luckyBoxMessage.box_id) || !Internal.equals(this.send_time, luckyBoxMessage.send_time) || !Internal.equals(this.delay_time, luckyBoxMessage.delay_time) || !Internal.equals(this.box_type, luckyBoxMessage.box_type) || !Internal.equals(this.title, luckyBoxMessage.title) || !Internal.equals(this.large, luckyBoxMessage.large) || !Internal.equals(this.background, luckyBoxMessage.background) || !Internal.equals(this.is_official, luckyBoxMessage.is_official) || !Internal.equals(this.priority, luckyBoxMessage.priority) || !Internal.equals(this.user, luckyBoxMessage.user) || !this.description_list.equals(luckyBoxMessage.description_list) || !Internal.equals(this.lucky_icon, luckyBoxMessage.lucky_icon)) {
                return false;
            }
            return true;
        }
    }

    public LuckyBoxMessage(Common common2, Long l, Long l2, Long l3, Long l4, Long l5, String str, Boolean bool, Image image, Boolean bool2, Long l6, User user2, List<ImgText> list, Image image2) {
        this(common2, l, l2, l3, l4, l5, str, bool, image, bool2, l6, user2, list, image2, ByteString.EMPTY);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LuckyBoxMessage(Common common2, Long l, Long l2, Long l3, Long l4, Long l5, String str, Boolean bool, Image image, Boolean bool2, Long l6, User user2, List<ImgText> list, Image image2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.diamond_count = l;
        this.box_id = l2;
        this.send_time = l3;
        this.delay_time = l4;
        this.box_type = l5;
        this.title = str;
        this.large = bool;
        this.background = image;
        this.is_official = bool2;
        this.priority = l6;
        this.user = user2;
        this.description_list = Internal.immutableCopyOf("description_list", list);
        this.lucky_icon = image2;
    }
}
