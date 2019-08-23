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

public final class GlobalTips extends Message<GlobalTips, Builder> {
    public static final DefaultValueProtoAdapter<GlobalTips> ADAPTER = new ProtoAdapter_GlobalTips();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String at_too_more;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String draft_publish;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String net_weak;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String not_comment;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String not_has_more;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String not_share;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public final String search_tips;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 9)
    public final String self_see_not_share;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String share_fail;

    public static final class Builder extends Message.Builder<GlobalTips, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String at_too_more;
        public String draft_publish;
        public String net_weak;
        public String not_comment;
        public String not_has_more;
        public String not_share;
        public String search_tips;
        public String self_see_not_share;
        public String share_fail;

        public final GlobalTips build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47981, new Class[0], GlobalTips.class)) {
                return (GlobalTips) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47981, new Class[0], GlobalTips.class);
            }
            GlobalTips globalTips = new GlobalTips(this.not_comment, this.share_fail, this.not_share, this.draft_publish, this.at_too_more, this.net_weak, this.not_has_more, this.search_tips, this.self_see_not_share, super.buildUnknownFields());
            return globalTips;
        }

        public final Builder at_too_more(String str) {
            this.at_too_more = str;
            return this;
        }

        public final Builder draft_publish(String str) {
            this.draft_publish = str;
            return this;
        }

        public final Builder net_weak(String str) {
            this.net_weak = str;
            return this;
        }

        public final Builder not_comment(String str) {
            this.not_comment = str;
            return this;
        }

        public final Builder not_has_more(String str) {
            this.not_has_more = str;
            return this;
        }

        public final Builder not_share(String str) {
            this.not_share = str;
            return this;
        }

        public final Builder search_tips(String str) {
            this.search_tips = str;
            return this;
        }

        public final Builder self_see_not_share(String str) {
            this.self_see_not_share = str;
            return this;
        }

        public final Builder share_fail(String str) {
            this.share_fail = str;
            return this;
        }
    }

    static final class ProtoAdapter_GlobalTips extends DefaultValueProtoAdapter<GlobalTips> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final GlobalTips redact(GlobalTips globalTips) {
            return globalTips;
        }

        public ProtoAdapter_GlobalTips() {
            super(FieldEncoding.LENGTH_DELIMITED, GlobalTips.class);
        }

        public final GlobalTips decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47984, new Class[]{ProtoReader.class}, GlobalTips.class)) {
                return decode(protoReader2, (GlobalTips) null);
            }
            return (GlobalTips) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47984, new Class[]{ProtoReader.class}, GlobalTips.class);
        }

        public final int encodedSize(GlobalTips globalTips) {
            GlobalTips globalTips2 = globalTips;
            if (!PatchProxy.isSupport(new Object[]{globalTips2}, this, changeQuickRedirect, false, 47982, new Class[]{GlobalTips.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, globalTips2.not_comment) + ProtoAdapter.STRING.encodedSizeWithTag(2, globalTips2.share_fail) + ProtoAdapter.STRING.encodedSizeWithTag(3, globalTips2.not_share) + ProtoAdapter.STRING.encodedSizeWithTag(4, globalTips2.draft_publish) + ProtoAdapter.STRING.encodedSizeWithTag(5, globalTips2.at_too_more) + ProtoAdapter.STRING.encodedSizeWithTag(6, globalTips2.net_weak) + ProtoAdapter.STRING.encodedSizeWithTag(7, globalTips2.not_has_more) + ProtoAdapter.STRING.encodedSizeWithTag(8, globalTips2.search_tips) + ProtoAdapter.STRING.encodedSizeWithTag(9, globalTips2.self_see_not_share) + globalTips.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{globalTips2}, this, changeQuickRedirect, false, 47982, new Class[]{GlobalTips.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, GlobalTips globalTips) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            GlobalTips globalTips2 = globalTips;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, globalTips2}, this, changeQuickRedirect, false, 47983, new Class[]{ProtoWriter.class, GlobalTips.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, globalTips2}, this, changeQuickRedirect, false, 47983, new Class[]{ProtoWriter.class, GlobalTips.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, globalTips2.not_comment);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, globalTips2.share_fail);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, globalTips2.not_share);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, globalTips2.draft_publish);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 5, globalTips2.at_too_more);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 6, globalTips2.net_weak);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 7, globalTips2.not_has_more);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 8, globalTips2.search_tips);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 9, globalTips2.self_see_not_share);
            protoWriter2.writeBytes(globalTips.unknownFields());
        }

        public final GlobalTips decode(ProtoReader protoReader, GlobalTips globalTips) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            GlobalTips globalTips2 = globalTips;
            if (PatchProxy.isSupport(new Object[]{protoReader2, globalTips2}, this, changeQuickRedirect, false, 47985, new Class[]{ProtoReader.class, GlobalTips.class}, GlobalTips.class)) {
                return (GlobalTips) PatchProxy.accessDispatch(new Object[]{protoReader2, globalTips2}, this, changeQuickRedirect, false, 47985, new Class[]{ProtoReader.class, GlobalTips.class}, GlobalTips.class);
            }
            GlobalTips globalTips3 = (GlobalTips) a.a().a(GlobalTips.class, globalTips2);
            if (globalTips3 != null) {
                builder = globalTips3.newBuilder();
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
                            builder2.not_comment((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 2:
                            builder2.share_fail((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 3:
                            builder2.not_share((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 4:
                            builder2.draft_publish((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 5:
                            builder2.at_too_more((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 6:
                            builder2.net_weak((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case e.l:
                            builder2.not_has_more((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 8:
                            builder2.search_tips((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 9:
                            builder2.self_see_not_share((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (globalTips3 != null) {
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
    public final String getAtTooMore() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47972, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47972, new Class[0], String.class);
        } else if (this.at_too_more != null) {
            return this.at_too_more;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getDraftPublish() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47971, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47971, new Class[0], String.class);
        } else if (this.draft_publish != null) {
            return this.draft_publish;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getNetWeak() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47973, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47973, new Class[0], String.class);
        } else if (this.net_weak != null) {
            return this.net_weak;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getNotComment() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47968, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47968, new Class[0], String.class);
        } else if (this.not_comment != null) {
            return this.not_comment;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getNotHasMore() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47974, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47974, new Class[0], String.class);
        } else if (this.not_has_more != null) {
            return this.not_has_more;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getNotShare() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47970, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47970, new Class[0], String.class);
        } else if (this.not_share != null) {
            return this.not_share;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getSearchTips() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47975, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47975, new Class[0], String.class);
        } else if (this.search_tips != null) {
            return this.search_tips;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getSelfSeeNotShare() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47976, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47976, new Class[0], String.class);
        } else if (this.self_see_not_share != null) {
            return this.self_see_not_share;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getShareFail() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47969, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47969, new Class[0], String.class);
        } else if (this.share_fail != null) {
            return this.share_fail;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47977, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47977, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.not_comment = this.not_comment;
        builder.share_fail = this.share_fail;
        builder.not_share = this.not_share;
        builder.draft_publish = this.draft_publish;
        builder.at_too_more = this.at_too_more;
        builder.net_weak = this.net_weak;
        builder.not_has_more = this.not_has_more;
        builder.search_tips = this.search_tips;
        builder.self_see_not_share = this.self_see_not_share;
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47979, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47979, new Class[0], Integer.TYPE)).intValue();
        }
        int i10 = this.hashCode;
        if (i10 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.not_comment != null) {
                i = this.not_comment.hashCode();
            } else {
                i = 0;
            }
            int i11 = (hashCode + i) * 37;
            if (this.share_fail != null) {
                i2 = this.share_fail.hashCode();
            } else {
                i2 = 0;
            }
            int i12 = (i11 + i2) * 37;
            if (this.not_share != null) {
                i3 = this.not_share.hashCode();
            } else {
                i3 = 0;
            }
            int i13 = (i12 + i3) * 37;
            if (this.draft_publish != null) {
                i4 = this.draft_publish.hashCode();
            } else {
                i4 = 0;
            }
            int i14 = (i13 + i4) * 37;
            if (this.at_too_more != null) {
                i5 = this.at_too_more.hashCode();
            } else {
                i5 = 0;
            }
            int i15 = (i14 + i5) * 37;
            if (this.net_weak != null) {
                i6 = this.net_weak.hashCode();
            } else {
                i6 = 0;
            }
            int i16 = (i15 + i6) * 37;
            if (this.not_has_more != null) {
                i7 = this.not_has_more.hashCode();
            } else {
                i7 = 0;
            }
            int i17 = (i16 + i7) * 37;
            if (this.search_tips != null) {
                i8 = this.search_tips.hashCode();
            } else {
                i8 = 0;
            }
            int i18 = (i17 + i8) * 37;
            if (this.self_see_not_share != null) {
                i9 = this.self_see_not_share.hashCode();
            }
            i10 = i18 + i9;
            this.hashCode = i10;
        }
        return i10;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47980, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47980, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.not_comment != null) {
            sb.append(", not_comment=");
            sb.append(this.not_comment);
        }
        if (this.share_fail != null) {
            sb.append(", share_fail=");
            sb.append(this.share_fail);
        }
        if (this.not_share != null) {
            sb.append(", not_share=");
            sb.append(this.not_share);
        }
        if (this.draft_publish != null) {
            sb.append(", draft_publish=");
            sb.append(this.draft_publish);
        }
        if (this.at_too_more != null) {
            sb.append(", at_too_more=");
            sb.append(this.at_too_more);
        }
        if (this.net_weak != null) {
            sb.append(", net_weak=");
            sb.append(this.net_weak);
        }
        if (this.not_has_more != null) {
            sb.append(", not_has_more=");
            sb.append(this.not_has_more);
        }
        if (this.search_tips != null) {
            sb.append(", search_tips=");
            sb.append(this.search_tips);
        }
        if (this.self_see_not_share != null) {
            sb.append(", self_see_not_share=");
            sb.append(this.self_see_not_share);
        }
        StringBuilder replace = sb.replace(0, 2, "GlobalTips{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47978, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47978, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof GlobalTips)) {
                return false;
            }
            GlobalTips globalTips = (GlobalTips) obj;
            if (!unknownFields().equals(globalTips.unknownFields()) || !Internal.equals(this.not_comment, globalTips.not_comment) || !Internal.equals(this.share_fail, globalTips.share_fail) || !Internal.equals(this.not_share, globalTips.not_share) || !Internal.equals(this.draft_publish, globalTips.draft_publish) || !Internal.equals(this.at_too_more, globalTips.at_too_more) || !Internal.equals(this.net_weak, globalTips.net_weak) || !Internal.equals(this.not_has_more, globalTips.not_has_more) || !Internal.equals(this.search_tips, globalTips.search_tips) || !Internal.equals(this.self_see_not_share, globalTips.self_see_not_share)) {
                return false;
            }
            return true;
        }
    }

    public GlobalTips(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, ByteString.EMPTY);
    }

    public GlobalTips(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, ByteString byteString) {
        super(ADAPTER, byteString);
        this.not_comment = str;
        this.share_fail = str2;
        this.not_share = str3;
        this.draft_publish = str4;
        this.at_too_more = str5;
        this.net_weak = str6;
        this.not_has_more = str7;
        this.search_tips = str8;
        this.self_see_not_share = str9;
    }
}
