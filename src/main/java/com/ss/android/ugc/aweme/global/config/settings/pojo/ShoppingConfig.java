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

public final class ShoppingConfig extends Message<ShoppingConfig, Builder> {
    public static final DefaultValueProtoAdapter<ShoppingConfig> ADAPTER = new ProtoAdapter_ShoppingConfig();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 10)
    public final Integer card_show_duration;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 9)
    public final Boolean disable_card;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 7)
    public final Boolean disable_want;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public final Boolean enable;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 4)
    public final Boolean enable_float_video;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean enable_user;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 5)
    public final Boolean law_window;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.ShoppingLiveConfig#ADAPTER", tag = 6)
    public final ShoppingLiveConfig live;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.ShoppingNewbieHelp#ADAPTER", tag = 8)
    public final ShoppingNewbieHelp newbie_help;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String order_share_intro_url;

    public static final class Builder extends Message.Builder<ShoppingConfig, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Integer card_show_duration;
        public Boolean disable_card;
        public Boolean disable_want;
        public Boolean enable;
        public Boolean enable_float_video;
        public Boolean enable_user;
        public Boolean law_window;
        public ShoppingLiveConfig live;
        public ShoppingNewbieHelp newbie_help;
        public String order_share_intro_url;

        public final ShoppingConfig build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49091, new Class[0], ShoppingConfig.class)) {
                return (ShoppingConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49091, new Class[0], ShoppingConfig.class);
            }
            ShoppingConfig shoppingConfig = new ShoppingConfig(this.enable, this.enable_user, this.order_share_intro_url, this.enable_float_video, this.law_window, this.live, this.disable_want, this.newbie_help, this.disable_card, this.card_show_duration, super.buildUnknownFields());
            return shoppingConfig;
        }

        public final Builder card_show_duration(Integer num) {
            this.card_show_duration = num;
            return this;
        }

        public final Builder disable_card(Boolean bool) {
            this.disable_card = bool;
            return this;
        }

        public final Builder disable_want(Boolean bool) {
            this.disable_want = bool;
            return this;
        }

        public final Builder enable(Boolean bool) {
            this.enable = bool;
            return this;
        }

        public final Builder enable_float_video(Boolean bool) {
            this.enable_float_video = bool;
            return this;
        }

        public final Builder enable_user(Boolean bool) {
            this.enable_user = bool;
            return this;
        }

        public final Builder law_window(Boolean bool) {
            this.law_window = bool;
            return this;
        }

        public final Builder live(ShoppingLiveConfig shoppingLiveConfig) {
            this.live = shoppingLiveConfig;
            return this;
        }

        public final Builder newbie_help(ShoppingNewbieHelp shoppingNewbieHelp) {
            this.newbie_help = shoppingNewbieHelp;
            return this;
        }

        public final Builder order_share_intro_url(String str) {
            this.order_share_intro_url = str;
            return this;
        }
    }

    static final class ProtoAdapter_ShoppingConfig extends DefaultValueProtoAdapter<ShoppingConfig> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final ShoppingConfig redact(ShoppingConfig shoppingConfig) {
            return shoppingConfig;
        }

        public ProtoAdapter_ShoppingConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, ShoppingConfig.class);
        }

        public final ShoppingConfig decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49094, new Class[]{ProtoReader.class}, ShoppingConfig.class)) {
                return decode(protoReader2, (ShoppingConfig) null);
            }
            return (ShoppingConfig) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49094, new Class[]{ProtoReader.class}, ShoppingConfig.class);
        }

        public final int encodedSize(ShoppingConfig shoppingConfig) {
            ShoppingConfig shoppingConfig2 = shoppingConfig;
            if (!PatchProxy.isSupport(new Object[]{shoppingConfig2}, this, changeQuickRedirect, false, 49092, new Class[]{ShoppingConfig.class}, Integer.TYPE)) {
                return ProtoAdapter.BOOL.encodedSizeWithTag(1, shoppingConfig2.enable) + ProtoAdapter.BOOL.encodedSizeWithTag(2, shoppingConfig2.enable_user) + ProtoAdapter.STRING.encodedSizeWithTag(3, shoppingConfig2.order_share_intro_url) + ProtoAdapter.BOOL.encodedSizeWithTag(4, shoppingConfig2.enable_float_video) + ProtoAdapter.BOOL.encodedSizeWithTag(5, shoppingConfig2.law_window) + ShoppingLiveConfig.ADAPTER.encodedSizeWithTag(6, shoppingConfig2.live) + ProtoAdapter.BOOL.encodedSizeWithTag(7, shoppingConfig2.disable_want) + ShoppingNewbieHelp.ADAPTER.encodedSizeWithTag(8, shoppingConfig2.newbie_help) + ProtoAdapter.BOOL.encodedSizeWithTag(9, shoppingConfig2.disable_card) + ProtoAdapter.INT32.encodedSizeWithTag(10, shoppingConfig2.card_show_duration) + shoppingConfig.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{shoppingConfig2}, this, changeQuickRedirect, false, 49092, new Class[]{ShoppingConfig.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, ShoppingConfig shoppingConfig) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            ShoppingConfig shoppingConfig2 = shoppingConfig;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, shoppingConfig2}, this, changeQuickRedirect, false, 49093, new Class[]{ProtoWriter.class, ShoppingConfig.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, shoppingConfig2}, this, changeQuickRedirect, false, 49093, new Class[]{ProtoWriter.class, ShoppingConfig.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1, shoppingConfig2.enable);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 2, shoppingConfig2.enable_user);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, shoppingConfig2.order_share_intro_url);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 4, shoppingConfig2.enable_float_video);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 5, shoppingConfig2.law_window);
            ShoppingLiveConfig.ADAPTER.encodeWithTag(protoWriter2, 6, shoppingConfig2.live);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 7, shoppingConfig2.disable_want);
            ShoppingNewbieHelp.ADAPTER.encodeWithTag(protoWriter2, 8, shoppingConfig2.newbie_help);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 9, shoppingConfig2.disable_card);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 10, shoppingConfig2.card_show_duration);
            protoWriter2.writeBytes(shoppingConfig.unknownFields());
        }

        public final ShoppingConfig decode(ProtoReader protoReader, ShoppingConfig shoppingConfig) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            ShoppingConfig shoppingConfig2 = shoppingConfig;
            if (PatchProxy.isSupport(new Object[]{protoReader2, shoppingConfig2}, this, changeQuickRedirect, false, 49095, new Class[]{ProtoReader.class, ShoppingConfig.class}, ShoppingConfig.class)) {
                return (ShoppingConfig) PatchProxy.accessDispatch(new Object[]{protoReader2, shoppingConfig2}, this, changeQuickRedirect, false, 49095, new Class[]{ProtoReader.class, ShoppingConfig.class}, ShoppingConfig.class);
            }
            ShoppingConfig shoppingConfig3 = (ShoppingConfig) a.a().a(ShoppingConfig.class, shoppingConfig2);
            if (shoppingConfig3 != null) {
                builder = shoppingConfig3.newBuilder();
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
                            builder2.enable((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 2:
                            builder2.enable_user((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 3:
                            builder2.order_share_intro_url((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 4:
                            builder2.enable_float_video((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 5:
                            builder2.law_window((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 6:
                            builder2.live((ShoppingLiveConfig) ShoppingLiveConfig.ADAPTER.decode(protoReader2, builder2.live));
                            break;
                        case e.l:
                            builder2.disable_want((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 8:
                            builder2.newbie_help((ShoppingNewbieHelp) ShoppingNewbieHelp.ADAPTER.decode(protoReader2, builder2.newbie_help));
                            break;
                        case 9:
                            builder2.disable_card((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 10:
                            builder2.card_show_duration((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (shoppingConfig3 != null) {
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
    public final Integer getCardShowDuration() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49086, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49086, new Class[0], Integer.class);
        } else if (this.card_show_duration != null) {
            return this.card_show_duration;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean getDisableCard() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49085, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49085, new Class[0], Boolean.class);
        } else if (this.disable_card != null) {
            return this.disable_card;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean getDisableWant() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49083, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49083, new Class[0], Boolean.class);
        } else if (this.disable_want != null) {
            return this.disable_want;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean getEnable() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49077, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49077, new Class[0], Boolean.class);
        } else if (this.enable != null) {
            return this.enable;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean getEnableFloatVideo() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49080, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49080, new Class[0], Boolean.class);
        } else if (this.enable_float_video != null) {
            return this.enable_float_video;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean getEnableUser() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49078, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49078, new Class[0], Boolean.class);
        } else if (this.enable_user != null) {
            return this.enable_user;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean getLawWindow() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49081, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49081, new Class[0], Boolean.class);
        } else if (this.law_window != null) {
            return this.law_window;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final ShoppingLiveConfig getLive() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49082, new Class[0], ShoppingLiveConfig.class)) {
            return (ShoppingLiveConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49082, new Class[0], ShoppingLiveConfig.class);
        } else if (this.live != null) {
            return this.live;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final ShoppingNewbieHelp getNewbieHelp() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49084, new Class[0], ShoppingNewbieHelp.class)) {
            return (ShoppingNewbieHelp) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49084, new Class[0], ShoppingNewbieHelp.class);
        } else if (this.newbie_help != null) {
            return this.newbie_help;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getOrderShareIntroUrl() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49079, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49079, new Class[0], String.class);
        } else if (this.order_share_intro_url != null) {
            return this.order_share_intro_url;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49087, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49087, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.enable = this.enable;
        builder.enable_user = this.enable_user;
        builder.order_share_intro_url = this.order_share_intro_url;
        builder.enable_float_video = this.enable_float_video;
        builder.law_window = this.law_window;
        builder.live = this.live;
        builder.disable_want = this.disable_want;
        builder.newbie_help = this.newbie_help;
        builder.disable_card = this.disable_card;
        builder.card_show_duration = this.card_show_duration;
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49089, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49089, new Class[0], Integer.TYPE)).intValue();
        }
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.enable != null) {
                i = this.enable.hashCode();
            } else {
                i = 0;
            }
            int i12 = (hashCode + i) * 37;
            if (this.enable_user != null) {
                i2 = this.enable_user.hashCode();
            } else {
                i2 = 0;
            }
            int i13 = (i12 + i2) * 37;
            if (this.order_share_intro_url != null) {
                i3 = this.order_share_intro_url.hashCode();
            } else {
                i3 = 0;
            }
            int i14 = (i13 + i3) * 37;
            if (this.enable_float_video != null) {
                i4 = this.enable_float_video.hashCode();
            } else {
                i4 = 0;
            }
            int i15 = (i14 + i4) * 37;
            if (this.law_window != null) {
                i5 = this.law_window.hashCode();
            } else {
                i5 = 0;
            }
            int i16 = (i15 + i5) * 37;
            if (this.live != null) {
                i6 = this.live.hashCode();
            } else {
                i6 = 0;
            }
            int i17 = (i16 + i6) * 37;
            if (this.disable_want != null) {
                i7 = this.disable_want.hashCode();
            } else {
                i7 = 0;
            }
            int i18 = (i17 + i7) * 37;
            if (this.newbie_help != null) {
                i8 = this.newbie_help.hashCode();
            } else {
                i8 = 0;
            }
            int i19 = (i18 + i8) * 37;
            if (this.disable_card != null) {
                i9 = this.disable_card.hashCode();
            } else {
                i9 = 0;
            }
            int i20 = (i19 + i9) * 37;
            if (this.card_show_duration != null) {
                i10 = this.card_show_duration.hashCode();
            }
            i11 = i20 + i10;
            this.hashCode = i11;
        }
        return i11;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49090, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49090, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.enable != null) {
            sb.append(", enable=");
            sb.append(this.enable);
        }
        if (this.enable_user != null) {
            sb.append(", enable_user=");
            sb.append(this.enable_user);
        }
        if (this.order_share_intro_url != null) {
            sb.append(", order_share_intro_url=");
            sb.append(this.order_share_intro_url);
        }
        if (this.enable_float_video != null) {
            sb.append(", enable_float_video=");
            sb.append(this.enable_float_video);
        }
        if (this.law_window != null) {
            sb.append(", law_window=");
            sb.append(this.law_window);
        }
        if (this.live != null) {
            sb.append(", live=");
            sb.append(this.live);
        }
        if (this.disable_want != null) {
            sb.append(", disable_want=");
            sb.append(this.disable_want);
        }
        if (this.newbie_help != null) {
            sb.append(", newbie_help=");
            sb.append(this.newbie_help);
        }
        if (this.disable_card != null) {
            sb.append(", disable_card=");
            sb.append(this.disable_card);
        }
        if (this.card_show_duration != null) {
            sb.append(", card_show_duration=");
            sb.append(this.card_show_duration);
        }
        StringBuilder replace = sb.replace(0, 2, "ShoppingConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49088, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49088, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof ShoppingConfig)) {
                return false;
            }
            ShoppingConfig shoppingConfig = (ShoppingConfig) obj;
            if (!unknownFields().equals(shoppingConfig.unknownFields()) || !Internal.equals(this.enable, shoppingConfig.enable) || !Internal.equals(this.enable_user, shoppingConfig.enable_user) || !Internal.equals(this.order_share_intro_url, shoppingConfig.order_share_intro_url) || !Internal.equals(this.enable_float_video, shoppingConfig.enable_float_video) || !Internal.equals(this.law_window, shoppingConfig.law_window) || !Internal.equals(this.live, shoppingConfig.live) || !Internal.equals(this.disable_want, shoppingConfig.disable_want) || !Internal.equals(this.newbie_help, shoppingConfig.newbie_help) || !Internal.equals(this.disable_card, shoppingConfig.disable_card) || !Internal.equals(this.card_show_duration, shoppingConfig.card_show_duration)) {
                return false;
            }
            return true;
        }
    }

    public ShoppingConfig(Boolean bool, Boolean bool2, String str, Boolean bool3, Boolean bool4, ShoppingLiveConfig shoppingLiveConfig, Boolean bool5, ShoppingNewbieHelp shoppingNewbieHelp, Boolean bool6, Integer num) {
        this(bool, bool2, str, bool3, bool4, shoppingLiveConfig, bool5, shoppingNewbieHelp, bool6, num, ByteString.EMPTY);
    }

    public ShoppingConfig(Boolean bool, Boolean bool2, String str, Boolean bool3, Boolean bool4, ShoppingLiveConfig shoppingLiveConfig, Boolean bool5, ShoppingNewbieHelp shoppingNewbieHelp, Boolean bool6, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enable = bool;
        this.enable_user = bool2;
        this.order_share_intro_url = str;
        this.enable_float_video = bool3;
        this.law_window = bool4;
        this.live = shoppingLiveConfig;
        this.disable_want = bool5;
        this.newbie_help = shoppingNewbieHelp;
        this.disable_card = bool6;
        this.card_show_duration = num;
    }
}
