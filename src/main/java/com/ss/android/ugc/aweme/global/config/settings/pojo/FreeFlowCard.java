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

public final class FreeFlowCard extends Message<FreeFlowCard, Builder> {
    public static final DefaultValueProtoAdapter<FreeFlowCard> ADAPTER = new ProtoAdapter_FreeFlowCard();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String entry_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String entry_url_text;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String toast_slogan;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String toast_title;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public final Integer toast_type;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String toast_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String toast_url_text;

    public static final class Builder extends Message.Builder<FreeFlowCard, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String entry_url;
        public String entry_url_text;
        public String toast_slogan;
        public String toast_title;
        public Integer toast_type;
        public String toast_url;
        public String toast_url_text;

        public final FreeFlowCard build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47938, new Class[0], FreeFlowCard.class)) {
                return (FreeFlowCard) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47938, new Class[0], FreeFlowCard.class);
            }
            FreeFlowCard freeFlowCard = new FreeFlowCard(this.toast_url, this.entry_url_text, this.entry_url, this.toast_title, this.toast_url_text, this.toast_type, this.toast_slogan, super.buildUnknownFields());
            return freeFlowCard;
        }

        public final Builder entry_url(String str) {
            this.entry_url = str;
            return this;
        }

        public final Builder entry_url_text(String str) {
            this.entry_url_text = str;
            return this;
        }

        public final Builder toast_slogan(String str) {
            this.toast_slogan = str;
            return this;
        }

        public final Builder toast_title(String str) {
            this.toast_title = str;
            return this;
        }

        public final Builder toast_type(Integer num) {
            this.toast_type = num;
            return this;
        }

        public final Builder toast_url(String str) {
            this.toast_url = str;
            return this;
        }

        public final Builder toast_url_text(String str) {
            this.toast_url_text = str;
            return this;
        }
    }

    static final class ProtoAdapter_FreeFlowCard extends DefaultValueProtoAdapter<FreeFlowCard> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final FreeFlowCard redact(FreeFlowCard freeFlowCard) {
            return freeFlowCard;
        }

        public ProtoAdapter_FreeFlowCard() {
            super(FieldEncoding.LENGTH_DELIMITED, FreeFlowCard.class);
        }

        public final FreeFlowCard decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47941, new Class[]{ProtoReader.class}, FreeFlowCard.class)) {
                return decode(protoReader2, (FreeFlowCard) null);
            }
            return (FreeFlowCard) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47941, new Class[]{ProtoReader.class}, FreeFlowCard.class);
        }

        public final int encodedSize(FreeFlowCard freeFlowCard) {
            FreeFlowCard freeFlowCard2 = freeFlowCard;
            if (!PatchProxy.isSupport(new Object[]{freeFlowCard2}, this, changeQuickRedirect, false, 47939, new Class[]{FreeFlowCard.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, freeFlowCard2.toast_url) + ProtoAdapter.STRING.encodedSizeWithTag(2, freeFlowCard2.entry_url_text) + ProtoAdapter.STRING.encodedSizeWithTag(3, freeFlowCard2.entry_url) + ProtoAdapter.STRING.encodedSizeWithTag(4, freeFlowCard2.toast_title) + ProtoAdapter.STRING.encodedSizeWithTag(5, freeFlowCard2.toast_url_text) + ProtoAdapter.INT32.encodedSizeWithTag(6, freeFlowCard2.toast_type) + ProtoAdapter.STRING.encodedSizeWithTag(7, freeFlowCard2.toast_slogan) + freeFlowCard.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{freeFlowCard2}, this, changeQuickRedirect, false, 47939, new Class[]{FreeFlowCard.class}, Integer.TYPE)).intValue();
        }

        public final FreeFlowCard decode(ProtoReader protoReader, FreeFlowCard freeFlowCard) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            FreeFlowCard freeFlowCard2 = freeFlowCard;
            if (PatchProxy.isSupport(new Object[]{protoReader2, freeFlowCard2}, this, changeQuickRedirect, false, 47942, new Class[]{ProtoReader.class, FreeFlowCard.class}, FreeFlowCard.class)) {
                return (FreeFlowCard) PatchProxy.accessDispatch(new Object[]{protoReader2, freeFlowCard2}, this, changeQuickRedirect, false, 47942, new Class[]{ProtoReader.class, FreeFlowCard.class}, FreeFlowCard.class);
            }
            FreeFlowCard freeFlowCard3 = (FreeFlowCard) a.a().a(FreeFlowCard.class, freeFlowCard2);
            if (freeFlowCard3 != null) {
                builder = freeFlowCard3.newBuilder();
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
                            builder2.toast_url((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 2:
                            builder2.entry_url_text((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 3:
                            builder2.entry_url((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 4:
                            builder2.toast_title((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 5:
                            builder2.toast_url_text((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 6:
                            builder2.toast_type((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case e.l:
                            builder2.toast_slogan((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (freeFlowCard3 != null) {
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

        public final void encode(ProtoWriter protoWriter, FreeFlowCard freeFlowCard) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            FreeFlowCard freeFlowCard2 = freeFlowCard;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, freeFlowCard2}, this, changeQuickRedirect, false, 47940, new Class[]{ProtoWriter.class, FreeFlowCard.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, freeFlowCard2}, this, changeQuickRedirect, false, 47940, new Class[]{ProtoWriter.class, FreeFlowCard.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, freeFlowCard2.toast_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, freeFlowCard2.entry_url_text);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, freeFlowCard2.entry_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, freeFlowCard2.toast_title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 5, freeFlowCard2.toast_url_text);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 6, freeFlowCard2.toast_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 7, freeFlowCard2.toast_slogan);
            protoWriter2.writeBytes(freeFlowCard.unknownFields());
        }
    }

    @KtNullable
    public final String getEntryUrl() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47929, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47929, new Class[0], String.class);
        } else if (this.entry_url != null) {
            return this.entry_url;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getEntryUrlText() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47928, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47928, new Class[0], String.class);
        } else if (this.entry_url_text != null) {
            return this.entry_url_text;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getToastSlogan() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47933, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47933, new Class[0], String.class);
        } else if (this.toast_slogan != null) {
            return this.toast_slogan;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getToastTitle() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47930, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47930, new Class[0], String.class);
        } else if (this.toast_title != null) {
            return this.toast_title;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getToastType() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47932, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47932, new Class[0], Integer.class);
        } else if (this.toast_type != null) {
            return this.toast_type;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getToastUrl() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47927, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47927, new Class[0], String.class);
        } else if (this.toast_url != null) {
            return this.toast_url;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getToastUrlText() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47931, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47931, new Class[0], String.class);
        } else if (this.toast_url_text != null) {
            return this.toast_url_text;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47934, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47934, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.toast_url = this.toast_url;
        builder.entry_url_text = this.entry_url_text;
        builder.entry_url = this.entry_url;
        builder.toast_title = this.toast_title;
        builder.toast_url_text = this.toast_url_text;
        builder.toast_type = this.toast_type;
        builder.toast_slogan = this.toast_slogan;
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
        int i7 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47936, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47936, new Class[0], Integer.TYPE)).intValue();
        }
        int i8 = this.hashCode;
        if (i8 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.toast_url != null) {
                i = this.toast_url.hashCode();
            } else {
                i = 0;
            }
            int i9 = (hashCode + i) * 37;
            if (this.entry_url_text != null) {
                i2 = this.entry_url_text.hashCode();
            } else {
                i2 = 0;
            }
            int i10 = (i9 + i2) * 37;
            if (this.entry_url != null) {
                i3 = this.entry_url.hashCode();
            } else {
                i3 = 0;
            }
            int i11 = (i10 + i3) * 37;
            if (this.toast_title != null) {
                i4 = this.toast_title.hashCode();
            } else {
                i4 = 0;
            }
            int i12 = (i11 + i4) * 37;
            if (this.toast_url_text != null) {
                i5 = this.toast_url_text.hashCode();
            } else {
                i5 = 0;
            }
            int i13 = (i12 + i5) * 37;
            if (this.toast_type != null) {
                i6 = this.toast_type.hashCode();
            } else {
                i6 = 0;
            }
            int i14 = (i13 + i6) * 37;
            if (this.toast_slogan != null) {
                i7 = this.toast_slogan.hashCode();
            }
            i8 = i14 + i7;
            this.hashCode = i8;
        }
        return i8;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47937, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47937, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.toast_url != null) {
            sb.append(", toast_url=");
            sb.append(this.toast_url);
        }
        if (this.entry_url_text != null) {
            sb.append(", entry_url_text=");
            sb.append(this.entry_url_text);
        }
        if (this.entry_url != null) {
            sb.append(", entry_url=");
            sb.append(this.entry_url);
        }
        if (this.toast_title != null) {
            sb.append(", toast_title=");
            sb.append(this.toast_title);
        }
        if (this.toast_url_text != null) {
            sb.append(", toast_url_text=");
            sb.append(this.toast_url_text);
        }
        if (this.toast_type != null) {
            sb.append(", toast_type=");
            sb.append(this.toast_type);
        }
        if (this.toast_slogan != null) {
            sb.append(", toast_slogan=");
            sb.append(this.toast_slogan);
        }
        StringBuilder replace = sb.replace(0, 2, "FreeFlowCard{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47935, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47935, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof FreeFlowCard)) {
                return false;
            }
            FreeFlowCard freeFlowCard = (FreeFlowCard) obj;
            if (!unknownFields().equals(freeFlowCard.unknownFields()) || !Internal.equals(this.toast_url, freeFlowCard.toast_url) || !Internal.equals(this.entry_url_text, freeFlowCard.entry_url_text) || !Internal.equals(this.entry_url, freeFlowCard.entry_url) || !Internal.equals(this.toast_title, freeFlowCard.toast_title) || !Internal.equals(this.toast_url_text, freeFlowCard.toast_url_text) || !Internal.equals(this.toast_type, freeFlowCard.toast_type) || !Internal.equals(this.toast_slogan, freeFlowCard.toast_slogan)) {
                return false;
            }
            return true;
        }
    }

    public FreeFlowCard(String str, String str2, String str3, String str4, String str5, Integer num, String str6) {
        this(str, str2, str3, str4, str5, num, str6, ByteString.EMPTY);
    }

    public FreeFlowCard(String str, String str2, String str3, String str4, String str5, Integer num, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.toast_url = str;
        this.entry_url_text = str2;
        this.entry_url = str3;
        this.toast_title = str4;
        this.toast_url_text = str5;
        this.toast_type = num;
        this.toast_slogan = str6;
    }
}
