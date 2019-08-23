package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.KtNullable;
import com.bytedance.ies.c.a;
import com.bytedance.ies.c.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.io.IOException;
import okio.ByteString;

public final class ShowCreatorLicense extends Message<ShowCreatorLicense, Builder> {
    public static final DefaultValueProtoAdapter<ShowCreatorLicense> ADAPTER = new ProtoAdapter_ShowCreatorLicense();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 9)
    public final Integer click_type;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String popup_content;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer popup_interval;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String popup_linkText;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String popup_msg;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer popup_times_limit;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String popup_title;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public final String popup_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer show;

    public static final class Builder extends Message.Builder<ShowCreatorLicense, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Integer click_type;
        public String popup_content;
        public Integer popup_interval;
        public String popup_linkText;
        public String popup_msg;
        public Integer popup_times_limit;
        public String popup_title;
        public String popup_url;
        public Integer show;

        public final ShowCreatorLicense build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49130, new Class[0], ShowCreatorLicense.class)) {
                return (ShowCreatorLicense) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49130, new Class[0], ShowCreatorLicense.class);
            }
            ShowCreatorLicense showCreatorLicense = new ShowCreatorLicense(this.show, this.popup_times_limit, this.popup_interval, this.popup_title, this.popup_msg, this.popup_content, this.popup_linkText, this.popup_url, this.click_type, super.buildUnknownFields());
            return showCreatorLicense;
        }

        public final Builder click_type(Integer num) {
            this.click_type = num;
            return this;
        }

        public final Builder popup_content(String str) {
            this.popup_content = str;
            return this;
        }

        public final Builder popup_interval(Integer num) {
            this.popup_interval = num;
            return this;
        }

        public final Builder popup_linkText(String str) {
            this.popup_linkText = str;
            return this;
        }

        public final Builder popup_msg(String str) {
            this.popup_msg = str;
            return this;
        }

        public final Builder popup_times_limit(Integer num) {
            this.popup_times_limit = num;
            return this;
        }

        public final Builder popup_title(String str) {
            this.popup_title = str;
            return this;
        }

        public final Builder popup_url(String str) {
            this.popup_url = str;
            return this;
        }

        public final Builder show(Integer num) {
            this.show = num;
            return this;
        }
    }

    static final class ProtoAdapter_ShowCreatorLicense extends DefaultValueProtoAdapter<ShowCreatorLicense> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final ShowCreatorLicense redact(ShowCreatorLicense showCreatorLicense) {
            return showCreatorLicense;
        }

        public ProtoAdapter_ShowCreatorLicense() {
            super(FieldEncoding.LENGTH_DELIMITED, ShowCreatorLicense.class);
        }

        public final ShowCreatorLicense decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49133, new Class[]{ProtoReader.class}, ShowCreatorLicense.class)) {
                return decode(protoReader2, (ShowCreatorLicense) null);
            }
            return (ShowCreatorLicense) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49133, new Class[]{ProtoReader.class}, ShowCreatorLicense.class);
        }

        public final int encodedSize(ShowCreatorLicense showCreatorLicense) {
            ShowCreatorLicense showCreatorLicense2 = showCreatorLicense;
            if (!PatchProxy.isSupport(new Object[]{showCreatorLicense2}, this, changeQuickRedirect, false, 49131, new Class[]{ShowCreatorLicense.class}, Integer.TYPE)) {
                return ProtoAdapter.INT32.encodedSizeWithTag(1, showCreatorLicense2.show) + ProtoAdapter.INT32.encodedSizeWithTag(2, showCreatorLicense2.popup_times_limit) + ProtoAdapter.INT32.encodedSizeWithTag(3, showCreatorLicense2.popup_interval) + ProtoAdapter.STRING.encodedSizeWithTag(4, showCreatorLicense2.popup_title) + ProtoAdapter.STRING.encodedSizeWithTag(5, showCreatorLicense2.popup_msg) + ProtoAdapter.STRING.encodedSizeWithTag(6, showCreatorLicense2.popup_content) + ProtoAdapter.STRING.encodedSizeWithTag(7, showCreatorLicense2.popup_linkText) + ProtoAdapter.STRING.encodedSizeWithTag(8, showCreatorLicense2.popup_url) + ProtoAdapter.INT32.encodedSizeWithTag(9, showCreatorLicense2.click_type) + showCreatorLicense.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{showCreatorLicense2}, this, changeQuickRedirect, false, 49131, new Class[]{ShowCreatorLicense.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, ShowCreatorLicense showCreatorLicense) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            ShowCreatorLicense showCreatorLicense2 = showCreatorLicense;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, showCreatorLicense2}, this, changeQuickRedirect, false, 49132, new Class[]{ProtoWriter.class, ShowCreatorLicense.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, showCreatorLicense2}, this, changeQuickRedirect, false, 49132, new Class[]{ProtoWriter.class, ShowCreatorLicense.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 1, showCreatorLicense2.show);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 2, showCreatorLicense2.popup_times_limit);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 3, showCreatorLicense2.popup_interval);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, showCreatorLicense2.popup_title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 5, showCreatorLicense2.popup_msg);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 6, showCreatorLicense2.popup_content);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 7, showCreatorLicense2.popup_linkText);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 8, showCreatorLicense2.popup_url);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 9, showCreatorLicense2.click_type);
            protoWriter2.writeBytes(showCreatorLicense.unknownFields());
        }

        public final ShowCreatorLicense decode(ProtoReader protoReader, ShowCreatorLicense showCreatorLicense) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            ShowCreatorLicense showCreatorLicense2 = showCreatorLicense;
            if (PatchProxy.isSupport(new Object[]{protoReader2, showCreatorLicense2}, this, changeQuickRedirect, false, 49134, new Class[]{ProtoReader.class, ShowCreatorLicense.class}, ShowCreatorLicense.class)) {
                return (ShowCreatorLicense) PatchProxy.accessDispatch(new Object[]{protoReader2, showCreatorLicense2}, this, changeQuickRedirect, false, 49134, new Class[]{ProtoReader.class, ShowCreatorLicense.class}, ShowCreatorLicense.class);
            }
            ShowCreatorLicense showCreatorLicense3 = (ShowCreatorLicense) a.a().a(ShowCreatorLicense.class, showCreatorLicense2);
            if (showCreatorLicense3 != null) {
                builder = showCreatorLicense3.newBuilder();
            } else {
                builder = new Builder();
            }
            Builder builder2 = builder;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder2.show((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 2:
                            builder2.popup_times_limit((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 3:
                            builder2.popup_interval((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 4:
                            builder2.popup_title((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 5:
                            builder2.popup_msg((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 6:
                            builder2.popup_content((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case e.l:
                            builder2.popup_linkText((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 8:
                            builder2.popup_url((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 9:
                            builder2.click_type((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (showCreatorLicense3 != null) {
                                    break;
                                } else {
                                    throw e2;
                                }
                            }
                    }
                } else {
                    protoReader2.endMessage(beginMessage);
                    return builder2.build();
                }
            }
        }
    }

    @KtNullable
    public final Integer getClickType() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49125, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49125, new Class[0], Integer.class);
        } else if (this.click_type != null) {
            return this.click_type;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getPopupContent() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49122, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49122, new Class[0], String.class);
        } else if (this.popup_content != null) {
            return this.popup_content;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getPopupInterval() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49119, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49119, new Class[0], Integer.class);
        } else if (this.popup_interval != null) {
            return this.popup_interval;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getPopupLinkText() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49123, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49123, new Class[0], String.class);
        } else if (this.popup_linkText != null) {
            return this.popup_linkText;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getPopupMsg() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49121, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49121, new Class[0], String.class);
        } else if (this.popup_msg != null) {
            return this.popup_msg;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getPopupTimesLimit() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49118, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49118, new Class[0], Integer.class);
        } else if (this.popup_times_limit != null) {
            return this.popup_times_limit;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getPopupTitle() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49120, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49120, new Class[0], String.class);
        } else if (this.popup_title != null) {
            return this.popup_title;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getPopupUrl() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49124, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49124, new Class[0], String.class);
        } else if (this.popup_url != null) {
            return this.popup_url;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getShow() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49117, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49117, new Class[0], Integer.class);
        } else if (this.show != null) {
            return this.show;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49126, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49126, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.show = this.show;
        builder.popup_times_limit = this.popup_times_limit;
        builder.popup_interval = this.popup_interval;
        builder.popup_title = this.popup_title;
        builder.popup_msg = this.popup_msg;
        builder.popup_content = this.popup_content;
        builder.popup_linkText = this.popup_linkText;
        builder.popup_url = this.popup_url;
        builder.click_type = this.click_type;
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49128, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49128, new Class[0], Integer.TYPE)).intValue();
        }
        int i10 = this.hashCode;
        if (i10 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.show != null) {
                i = this.show.hashCode();
            } else {
                i = 0;
            }
            int i11 = (hashCode + i) * 37;
            if (this.popup_times_limit != null) {
                i2 = this.popup_times_limit.hashCode();
            } else {
                i2 = 0;
            }
            int i12 = (i11 + i2) * 37;
            if (this.popup_interval != null) {
                i3 = this.popup_interval.hashCode();
            } else {
                i3 = 0;
            }
            int i13 = (i12 + i3) * 37;
            if (this.popup_title != null) {
                i4 = this.popup_title.hashCode();
            } else {
                i4 = 0;
            }
            int i14 = (i13 + i4) * 37;
            if (this.popup_msg != null) {
                i5 = this.popup_msg.hashCode();
            } else {
                i5 = 0;
            }
            int i15 = (i14 + i5) * 37;
            if (this.popup_content != null) {
                i6 = this.popup_content.hashCode();
            } else {
                i6 = 0;
            }
            int i16 = (i15 + i6) * 37;
            if (this.popup_linkText != null) {
                i7 = this.popup_linkText.hashCode();
            } else {
                i7 = 0;
            }
            int i17 = (i16 + i7) * 37;
            if (this.popup_url != null) {
                i8 = this.popup_url.hashCode();
            } else {
                i8 = 0;
            }
            int i18 = (i17 + i8) * 37;
            if (this.click_type != null) {
                i9 = this.click_type.hashCode();
            }
            i10 = i18 + i9;
            this.hashCode = i10;
        }
        return i10;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49129, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49129, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.show != null) {
            sb.append(", show=");
            sb.append(this.show);
        }
        if (this.popup_times_limit != null) {
            sb.append(", popup_times_limit=");
            sb.append(this.popup_times_limit);
        }
        if (this.popup_interval != null) {
            sb.append(", popup_interval=");
            sb.append(this.popup_interval);
        }
        if (this.popup_title != null) {
            sb.append(", popup_title=");
            sb.append(this.popup_title);
        }
        if (this.popup_msg != null) {
            sb.append(", popup_msg=");
            sb.append(this.popup_msg);
        }
        if (this.popup_content != null) {
            sb.append(", popup_content=");
            sb.append(this.popup_content);
        }
        if (this.popup_linkText != null) {
            sb.append(", popup_linkText=");
            sb.append(this.popup_linkText);
        }
        if (this.popup_url != null) {
            sb.append(", popup_url=");
            sb.append(this.popup_url);
        }
        if (this.click_type != null) {
            sb.append(", click_type=");
            sb.append(this.click_type);
        }
        StringBuilder replace = sb.replace(0, 2, "ShowCreatorLicense{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49127, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49127, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof ShowCreatorLicense)) {
                return false;
            }
            ShowCreatorLicense showCreatorLicense = (ShowCreatorLicense) obj;
            if (!unknownFields().equals(showCreatorLicense.unknownFields()) || !Internal.equals(this.show, showCreatorLicense.show) || !Internal.equals(this.popup_times_limit, showCreatorLicense.popup_times_limit) || !Internal.equals(this.popup_interval, showCreatorLicense.popup_interval) || !Internal.equals(this.popup_title, showCreatorLicense.popup_title) || !Internal.equals(this.popup_msg, showCreatorLicense.popup_msg) || !Internal.equals(this.popup_content, showCreatorLicense.popup_content) || !Internal.equals(this.popup_linkText, showCreatorLicense.popup_linkText) || !Internal.equals(this.popup_url, showCreatorLicense.popup_url) || !Internal.equals(this.click_type, showCreatorLicense.click_type)) {
                return false;
            }
            return true;
        }
    }

    public ShowCreatorLicense(Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, Integer num4) {
        this(num, num2, num3, str, str2, str3, str4, str5, num4, ByteString.EMPTY);
    }

    public ShowCreatorLicense(Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, Integer num4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.show = num;
        this.popup_times_limit = num2;
        this.popup_interval = num3;
        this.popup_title = str;
        this.popup_msg = str2;
        this.popup_content = str3;
        this.popup_linkText = str4;
        this.popup_url = str5;
        this.click_type = num4;
    }
}
