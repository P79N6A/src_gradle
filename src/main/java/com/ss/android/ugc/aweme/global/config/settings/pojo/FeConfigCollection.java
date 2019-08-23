package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.KtNullable;
import com.bytedance.ies.c.a;
import com.bytedance.ies.c.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.io.IOException;
import okio.ByteString;

public final class FeConfigCollection extends Message<FeConfigCollection, Builder> {
    public static final DefaultValueProtoAdapter<FeConfigCollection> ADAPTER = new ProtoAdapter_FeConfigCollection();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig#ADAPTER", tag = 6)
    public final FEConfig billboard_fans;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig#ADAPTER", tag = 3)
    public final FEConfig billboard_star;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig#ADAPTER", tag = 5)
    public final FEConfig brand_rank;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig#ADAPTER", tag = 2)
    public final FEConfig douyincard;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig#ADAPTER", tag = 8)
    public final FEConfig guardian_child;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig#ADAPTER", tag = 7)
    public final FEConfig guardian_parent;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig#ADAPTER", tag = 9)
    public final FEConfig judgment_clause;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig#ADAPTER", tag = 10)
    public final FEConfig music_faq;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig#ADAPTER", tag = 1)
    public final FEConfig ringtone;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig#ADAPTER", tag = 4)
    public final FEConfig teen_protection;

    public static final class Builder extends Message.Builder<FeConfigCollection, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public FEConfig billboard_fans;
        public FEConfig billboard_star;
        public FEConfig brand_rank;
        public FEConfig douyincard;
        public FEConfig guardian_child;
        public FEConfig guardian_parent;
        public FEConfig judgment_clause;
        public FEConfig music_faq;
        public FEConfig ringtone;
        public FEConfig teen_protection;

        public final FeConfigCollection build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47888, new Class[0], FeConfigCollection.class)) {
                return (FeConfigCollection) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47888, new Class[0], FeConfigCollection.class);
            }
            FeConfigCollection feConfigCollection = new FeConfigCollection(this.ringtone, this.douyincard, this.billboard_star, this.teen_protection, this.brand_rank, this.billboard_fans, this.guardian_parent, this.guardian_child, this.judgment_clause, this.music_faq, super.buildUnknownFields());
            return feConfigCollection;
        }

        public final Builder billboard_fans(FEConfig fEConfig) {
            this.billboard_fans = fEConfig;
            return this;
        }

        public final Builder billboard_star(FEConfig fEConfig) {
            this.billboard_star = fEConfig;
            return this;
        }

        public final Builder brand_rank(FEConfig fEConfig) {
            this.brand_rank = fEConfig;
            return this;
        }

        public final Builder douyincard(FEConfig fEConfig) {
            this.douyincard = fEConfig;
            return this;
        }

        public final Builder guardian_child(FEConfig fEConfig) {
            this.guardian_child = fEConfig;
            return this;
        }

        public final Builder guardian_parent(FEConfig fEConfig) {
            this.guardian_parent = fEConfig;
            return this;
        }

        public final Builder judgment_clause(FEConfig fEConfig) {
            this.judgment_clause = fEConfig;
            return this;
        }

        public final Builder music_faq(FEConfig fEConfig) {
            this.music_faq = fEConfig;
            return this;
        }

        public final Builder ringtone(FEConfig fEConfig) {
            this.ringtone = fEConfig;
            return this;
        }

        public final Builder teen_protection(FEConfig fEConfig) {
            this.teen_protection = fEConfig;
            return this;
        }
    }

    static final class ProtoAdapter_FeConfigCollection extends DefaultValueProtoAdapter<FeConfigCollection> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final FeConfigCollection redact(FeConfigCollection feConfigCollection) {
            return feConfigCollection;
        }

        public ProtoAdapter_FeConfigCollection() {
            super(FieldEncoding.LENGTH_DELIMITED, FeConfigCollection.class);
        }

        public final FeConfigCollection decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47891, new Class[]{ProtoReader.class}, FeConfigCollection.class)) {
                return decode(protoReader2, (FeConfigCollection) null);
            }
            return (FeConfigCollection) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47891, new Class[]{ProtoReader.class}, FeConfigCollection.class);
        }

        public final int encodedSize(FeConfigCollection feConfigCollection) {
            FeConfigCollection feConfigCollection2 = feConfigCollection;
            if (!PatchProxy.isSupport(new Object[]{feConfigCollection2}, this, changeQuickRedirect, false, 47889, new Class[]{FeConfigCollection.class}, Integer.TYPE)) {
                return FEConfig.ADAPTER.encodedSizeWithTag(1, feConfigCollection2.ringtone) + FEConfig.ADAPTER.encodedSizeWithTag(2, feConfigCollection2.douyincard) + FEConfig.ADAPTER.encodedSizeWithTag(3, feConfigCollection2.billboard_star) + FEConfig.ADAPTER.encodedSizeWithTag(4, feConfigCollection2.teen_protection) + FEConfig.ADAPTER.encodedSizeWithTag(5, feConfigCollection2.brand_rank) + FEConfig.ADAPTER.encodedSizeWithTag(6, feConfigCollection2.billboard_fans) + FEConfig.ADAPTER.encodedSizeWithTag(7, feConfigCollection2.guardian_parent) + FEConfig.ADAPTER.encodedSizeWithTag(8, feConfigCollection2.guardian_child) + FEConfig.ADAPTER.encodedSizeWithTag(9, feConfigCollection2.judgment_clause) + FEConfig.ADAPTER.encodedSizeWithTag(10, feConfigCollection2.music_faq) + feConfigCollection.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{feConfigCollection2}, this, changeQuickRedirect, false, 47889, new Class[]{FeConfigCollection.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, FeConfigCollection feConfigCollection) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            FeConfigCollection feConfigCollection2 = feConfigCollection;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, feConfigCollection2}, this, changeQuickRedirect, false, 47890, new Class[]{ProtoWriter.class, FeConfigCollection.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, feConfigCollection2}, this, changeQuickRedirect, false, 47890, new Class[]{ProtoWriter.class, FeConfigCollection.class}, Void.TYPE);
                return;
            }
            FEConfig.ADAPTER.encodeWithTag(protoWriter2, 1, feConfigCollection2.ringtone);
            FEConfig.ADAPTER.encodeWithTag(protoWriter2, 2, feConfigCollection2.douyincard);
            FEConfig.ADAPTER.encodeWithTag(protoWriter2, 3, feConfigCollection2.billboard_star);
            FEConfig.ADAPTER.encodeWithTag(protoWriter2, 4, feConfigCollection2.teen_protection);
            FEConfig.ADAPTER.encodeWithTag(protoWriter2, 5, feConfigCollection2.brand_rank);
            FEConfig.ADAPTER.encodeWithTag(protoWriter2, 6, feConfigCollection2.billboard_fans);
            FEConfig.ADAPTER.encodeWithTag(protoWriter2, 7, feConfigCollection2.guardian_parent);
            FEConfig.ADAPTER.encodeWithTag(protoWriter2, 8, feConfigCollection2.guardian_child);
            FEConfig.ADAPTER.encodeWithTag(protoWriter2, 9, feConfigCollection2.judgment_clause);
            FEConfig.ADAPTER.encodeWithTag(protoWriter2, 10, feConfigCollection2.music_faq);
            protoWriter2.writeBytes(feConfigCollection.unknownFields());
        }

        public final FeConfigCollection decode(ProtoReader protoReader, FeConfigCollection feConfigCollection) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            FeConfigCollection feConfigCollection2 = feConfigCollection;
            if (PatchProxy.isSupport(new Object[]{protoReader2, feConfigCollection2}, this, changeQuickRedirect, false, 47892, new Class[]{ProtoReader.class, FeConfigCollection.class}, FeConfigCollection.class)) {
                return (FeConfigCollection) PatchProxy.accessDispatch(new Object[]{protoReader2, feConfigCollection2}, this, changeQuickRedirect, false, 47892, new Class[]{ProtoReader.class, FeConfigCollection.class}, FeConfigCollection.class);
            }
            FeConfigCollection feConfigCollection3 = (FeConfigCollection) a.a().a(FeConfigCollection.class, feConfigCollection2);
            if (feConfigCollection3 != null) {
                builder = feConfigCollection3.newBuilder();
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
                            builder2.ringtone((FEConfig) FEConfig.ADAPTER.decode(protoReader2, builder2.ringtone));
                            break;
                        case 2:
                            builder2.douyincard((FEConfig) FEConfig.ADAPTER.decode(protoReader2, builder2.douyincard));
                            break;
                        case 3:
                            builder2.billboard_star((FEConfig) FEConfig.ADAPTER.decode(protoReader2, builder2.billboard_star));
                            break;
                        case 4:
                            builder2.teen_protection((FEConfig) FEConfig.ADAPTER.decode(protoReader2, builder2.teen_protection));
                            break;
                        case 5:
                            builder2.brand_rank((FEConfig) FEConfig.ADAPTER.decode(protoReader2, builder2.brand_rank));
                            break;
                        case 6:
                            builder2.billboard_fans((FEConfig) FEConfig.ADAPTER.decode(protoReader2, builder2.billboard_fans));
                            break;
                        case e.l:
                            builder2.guardian_parent((FEConfig) FEConfig.ADAPTER.decode(protoReader2, builder2.guardian_parent));
                            break;
                        case 8:
                            builder2.guardian_child((FEConfig) FEConfig.ADAPTER.decode(protoReader2, builder2.guardian_child));
                            break;
                        case 9:
                            builder2.judgment_clause((FEConfig) FEConfig.ADAPTER.decode(protoReader2, builder2.judgment_clause));
                            break;
                        case 10:
                            builder2.music_faq((FEConfig) FEConfig.ADAPTER.decode(protoReader2, builder2.music_faq));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (feConfigCollection3 != null) {
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
    public final FEConfig getBillboardFans() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47879, new Class[0], FEConfig.class)) {
            return (FEConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47879, new Class[0], FEConfig.class);
        } else if (this.billboard_fans != null) {
            return this.billboard_fans;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final FEConfig getBillboardStar() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47876, new Class[0], FEConfig.class)) {
            return (FEConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47876, new Class[0], FEConfig.class);
        } else if (this.billboard_star != null) {
            return this.billboard_star;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final FEConfig getBrandRank() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47878, new Class[0], FEConfig.class)) {
            return (FEConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47878, new Class[0], FEConfig.class);
        } else if (this.brand_rank != null) {
            return this.brand_rank;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final FEConfig getDouyincard() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47875, new Class[0], FEConfig.class)) {
            return (FEConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47875, new Class[0], FEConfig.class);
        } else if (this.douyincard != null) {
            return this.douyincard;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final FEConfig getGuardianChild() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47881, new Class[0], FEConfig.class)) {
            return (FEConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47881, new Class[0], FEConfig.class);
        } else if (this.guardian_child != null) {
            return this.guardian_child;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final FEConfig getGuardianParent() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47880, new Class[0], FEConfig.class)) {
            return (FEConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47880, new Class[0], FEConfig.class);
        } else if (this.guardian_parent != null) {
            return this.guardian_parent;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final FEConfig getJudgmentClause() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47882, new Class[0], FEConfig.class)) {
            return (FEConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47882, new Class[0], FEConfig.class);
        } else if (this.judgment_clause != null) {
            return this.judgment_clause;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final FEConfig getMusicFaq() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47883, new Class[0], FEConfig.class)) {
            return (FEConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47883, new Class[0], FEConfig.class);
        } else if (this.music_faq != null) {
            return this.music_faq;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final FEConfig getRingtone() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47874, new Class[0], FEConfig.class)) {
            return (FEConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47874, new Class[0], FEConfig.class);
        } else if (this.ringtone != null) {
            return this.ringtone;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final FEConfig getTeenProtection() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47877, new Class[0], FEConfig.class)) {
            return (FEConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47877, new Class[0], FEConfig.class);
        } else if (this.teen_protection != null) {
            return this.teen_protection;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47884, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47884, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.ringtone = this.ringtone;
        builder.douyincard = this.douyincard;
        builder.billboard_star = this.billboard_star;
        builder.teen_protection = this.teen_protection;
        builder.brand_rank = this.brand_rank;
        builder.billboard_fans = this.billboard_fans;
        builder.guardian_parent = this.guardian_parent;
        builder.guardian_child = this.guardian_child;
        builder.judgment_clause = this.judgment_clause;
        builder.music_faq = this.music_faq;
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47886, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47886, new Class[0], Integer.TYPE)).intValue();
        }
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.ringtone != null) {
                i = this.ringtone.hashCode();
            } else {
                i = 0;
            }
            int i12 = (hashCode + i) * 37;
            if (this.douyincard != null) {
                i2 = this.douyincard.hashCode();
            } else {
                i2 = 0;
            }
            int i13 = (i12 + i2) * 37;
            if (this.billboard_star != null) {
                i3 = this.billboard_star.hashCode();
            } else {
                i3 = 0;
            }
            int i14 = (i13 + i3) * 37;
            if (this.teen_protection != null) {
                i4 = this.teen_protection.hashCode();
            } else {
                i4 = 0;
            }
            int i15 = (i14 + i4) * 37;
            if (this.brand_rank != null) {
                i5 = this.brand_rank.hashCode();
            } else {
                i5 = 0;
            }
            int i16 = (i15 + i5) * 37;
            if (this.billboard_fans != null) {
                i6 = this.billboard_fans.hashCode();
            } else {
                i6 = 0;
            }
            int i17 = (i16 + i6) * 37;
            if (this.guardian_parent != null) {
                i7 = this.guardian_parent.hashCode();
            } else {
                i7 = 0;
            }
            int i18 = (i17 + i7) * 37;
            if (this.guardian_child != null) {
                i8 = this.guardian_child.hashCode();
            } else {
                i8 = 0;
            }
            int i19 = (i18 + i8) * 37;
            if (this.judgment_clause != null) {
                i9 = this.judgment_clause.hashCode();
            } else {
                i9 = 0;
            }
            int i20 = (i19 + i9) * 37;
            if (this.music_faq != null) {
                i10 = this.music_faq.hashCode();
            }
            i11 = i20 + i10;
            this.hashCode = i11;
        }
        return i11;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47887, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47887, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.ringtone != null) {
            sb.append(", ringtone=");
            sb.append(this.ringtone);
        }
        if (this.douyincard != null) {
            sb.append(", douyincard=");
            sb.append(this.douyincard);
        }
        if (this.billboard_star != null) {
            sb.append(", billboard_star=");
            sb.append(this.billboard_star);
        }
        if (this.teen_protection != null) {
            sb.append(", teen_protection=");
            sb.append(this.teen_protection);
        }
        if (this.brand_rank != null) {
            sb.append(", brand_rank=");
            sb.append(this.brand_rank);
        }
        if (this.billboard_fans != null) {
            sb.append(", billboard_fans=");
            sb.append(this.billboard_fans);
        }
        if (this.guardian_parent != null) {
            sb.append(", guardian_parent=");
            sb.append(this.guardian_parent);
        }
        if (this.guardian_child != null) {
            sb.append(", guardian_child=");
            sb.append(this.guardian_child);
        }
        if (this.judgment_clause != null) {
            sb.append(", judgment_clause=");
            sb.append(this.judgment_clause);
        }
        if (this.music_faq != null) {
            sb.append(", music_faq=");
            sb.append(this.music_faq);
        }
        StringBuilder replace = sb.replace(0, 2, "FeConfigCollection{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47885, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47885, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof FeConfigCollection)) {
                return false;
            }
            FeConfigCollection feConfigCollection = (FeConfigCollection) obj;
            if (!unknownFields().equals(feConfigCollection.unknownFields()) || !Internal.equals(this.ringtone, feConfigCollection.ringtone) || !Internal.equals(this.douyincard, feConfigCollection.douyincard) || !Internal.equals(this.billboard_star, feConfigCollection.billboard_star) || !Internal.equals(this.teen_protection, feConfigCollection.teen_protection) || !Internal.equals(this.brand_rank, feConfigCollection.brand_rank) || !Internal.equals(this.billboard_fans, feConfigCollection.billboard_fans) || !Internal.equals(this.guardian_parent, feConfigCollection.guardian_parent) || !Internal.equals(this.guardian_child, feConfigCollection.guardian_child) || !Internal.equals(this.judgment_clause, feConfigCollection.judgment_clause) || !Internal.equals(this.music_faq, feConfigCollection.music_faq)) {
                return false;
            }
            return true;
        }
    }

    public FeConfigCollection(FEConfig fEConfig, FEConfig fEConfig2, FEConfig fEConfig3, FEConfig fEConfig4, FEConfig fEConfig5, FEConfig fEConfig6, FEConfig fEConfig7, FEConfig fEConfig8, FEConfig fEConfig9, FEConfig fEConfig10) {
        this(fEConfig, fEConfig2, fEConfig3, fEConfig4, fEConfig5, fEConfig6, fEConfig7, fEConfig8, fEConfig9, fEConfig10, ByteString.EMPTY);
    }

    public FeConfigCollection(FEConfig fEConfig, FEConfig fEConfig2, FEConfig fEConfig3, FEConfig fEConfig4, FEConfig fEConfig5, FEConfig fEConfig6, FEConfig fEConfig7, FEConfig fEConfig8, FEConfig fEConfig9, FEConfig fEConfig10, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ringtone = fEConfig;
        this.douyincard = fEConfig2;
        this.billboard_star = fEConfig3;
        this.teen_protection = fEConfig4;
        this.brand_rank = fEConfig5;
        this.billboard_fans = fEConfig6;
        this.guardian_parent = fEConfig7;
        this.guardian_child = fEConfig8;
        this.judgment_clause = fEConfig9;
        this.music_faq = fEConfig10;
    }
}
