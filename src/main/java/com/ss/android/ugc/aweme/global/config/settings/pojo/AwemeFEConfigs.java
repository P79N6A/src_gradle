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

public final class AwemeFEConfigs extends Message<AwemeFEConfigs, Builder> {
    public static final DefaultValueProtoAdapter<AwemeFEConfigs> ADAPTER = new ProtoAdapter_AwemeFEConfigs();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.BusinessEC#ADAPTER", tag = 1)
    public final BusinessEC business_ec;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.GoodsReport#ADAPTER", tag = 5)
    public final GoodsReport goods_report;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.LinkPlan#ADAPTER", tag = 3)
    public final LinkPlan link_plan;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.ShopLiveConfig#ADAPTER", tag = 8)
    public final ShopLiveConfig live;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.MpTab#ADAPTER", tag = 6)
    public final MpTab mp_tab;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.PoiConfig#ADAPTER", tag = 4)
    public final PoiConfig poi_error_report;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.Seeding#ADAPTER", tag = 7)
    public final Seeding seeding;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.StarAtlasOrder#ADAPTER", tag = 2)
    public final StarAtlasOrder star_atlas_order;

    public static final class Builder extends Message.Builder<AwemeFEConfigs, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public BusinessEC business_ec;
        public GoodsReport goods_report;
        public LinkPlan link_plan;
        public ShopLiveConfig live;
        public MpTab mp_tab;
        public PoiConfig poi_error_report;
        public Seeding seeding;
        public StarAtlasOrder star_atlas_order;

        public final AwemeFEConfigs build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47706, new Class[0], AwemeFEConfigs.class)) {
                return (AwemeFEConfigs) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47706, new Class[0], AwemeFEConfigs.class);
            }
            AwemeFEConfigs awemeFEConfigs = new AwemeFEConfigs(this.business_ec, this.star_atlas_order, this.link_plan, this.poi_error_report, this.goods_report, this.mp_tab, this.seeding, this.live, super.buildUnknownFields());
            return awemeFEConfigs;
        }

        public final Builder business_ec(BusinessEC businessEC) {
            this.business_ec = businessEC;
            return this;
        }

        public final Builder goods_report(GoodsReport goodsReport) {
            this.goods_report = goodsReport;
            return this;
        }

        public final Builder link_plan(LinkPlan linkPlan) {
            this.link_plan = linkPlan;
            return this;
        }

        public final Builder live(ShopLiveConfig shopLiveConfig) {
            this.live = shopLiveConfig;
            return this;
        }

        public final Builder mp_tab(MpTab mpTab) {
            this.mp_tab = mpTab;
            return this;
        }

        public final Builder poi_error_report(PoiConfig poiConfig) {
            this.poi_error_report = poiConfig;
            return this;
        }

        public final Builder seeding(Seeding seeding2) {
            this.seeding = seeding2;
            return this;
        }

        public final Builder star_atlas_order(StarAtlasOrder starAtlasOrder) {
            this.star_atlas_order = starAtlasOrder;
            return this;
        }
    }

    static final class ProtoAdapter_AwemeFEConfigs extends DefaultValueProtoAdapter<AwemeFEConfigs> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final AwemeFEConfigs redact(AwemeFEConfigs awemeFEConfigs) {
            return awemeFEConfigs;
        }

        public ProtoAdapter_AwemeFEConfigs() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeFEConfigs.class);
        }

        public final AwemeFEConfigs decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47709, new Class[]{ProtoReader.class}, AwemeFEConfigs.class)) {
                return decode(protoReader2, (AwemeFEConfigs) null);
            }
            return (AwemeFEConfigs) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47709, new Class[]{ProtoReader.class}, AwemeFEConfigs.class);
        }

        public final int encodedSize(AwemeFEConfigs awemeFEConfigs) {
            AwemeFEConfigs awemeFEConfigs2 = awemeFEConfigs;
            if (!PatchProxy.isSupport(new Object[]{awemeFEConfigs2}, this, changeQuickRedirect, false, 47707, new Class[]{AwemeFEConfigs.class}, Integer.TYPE)) {
                return BusinessEC.ADAPTER.encodedSizeWithTag(1, awemeFEConfigs2.business_ec) + StarAtlasOrder.ADAPTER.encodedSizeWithTag(2, awemeFEConfigs2.star_atlas_order) + LinkPlan.ADAPTER.encodedSizeWithTag(3, awemeFEConfigs2.link_plan) + PoiConfig.ADAPTER.encodedSizeWithTag(4, awemeFEConfigs2.poi_error_report) + GoodsReport.ADAPTER.encodedSizeWithTag(5, awemeFEConfigs2.goods_report) + MpTab.ADAPTER.encodedSizeWithTag(6, awemeFEConfigs2.mp_tab) + Seeding.ADAPTER.encodedSizeWithTag(7, awemeFEConfigs2.seeding) + ShopLiveConfig.ADAPTER.encodedSizeWithTag(8, awemeFEConfigs2.live) + awemeFEConfigs.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{awemeFEConfigs2}, this, changeQuickRedirect, false, 47707, new Class[]{AwemeFEConfigs.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, AwemeFEConfigs awemeFEConfigs) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            AwemeFEConfigs awemeFEConfigs2 = awemeFEConfigs;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, awemeFEConfigs2}, this, changeQuickRedirect, false, 47708, new Class[]{ProtoWriter.class, AwemeFEConfigs.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, awemeFEConfigs2}, this, changeQuickRedirect, false, 47708, new Class[]{ProtoWriter.class, AwemeFEConfigs.class}, Void.TYPE);
                return;
            }
            BusinessEC.ADAPTER.encodeWithTag(protoWriter2, 1, awemeFEConfigs2.business_ec);
            StarAtlasOrder.ADAPTER.encodeWithTag(protoWriter2, 2, awemeFEConfigs2.star_atlas_order);
            LinkPlan.ADAPTER.encodeWithTag(protoWriter2, 3, awemeFEConfigs2.link_plan);
            PoiConfig.ADAPTER.encodeWithTag(protoWriter2, 4, awemeFEConfigs2.poi_error_report);
            GoodsReport.ADAPTER.encodeWithTag(protoWriter2, 5, awemeFEConfigs2.goods_report);
            MpTab.ADAPTER.encodeWithTag(protoWriter2, 6, awemeFEConfigs2.mp_tab);
            Seeding.ADAPTER.encodeWithTag(protoWriter2, 7, awemeFEConfigs2.seeding);
            ShopLiveConfig.ADAPTER.encodeWithTag(protoWriter2, 8, awemeFEConfigs2.live);
            protoWriter2.writeBytes(awemeFEConfigs.unknownFields());
        }

        public final AwemeFEConfigs decode(ProtoReader protoReader, AwemeFEConfigs awemeFEConfigs) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            AwemeFEConfigs awemeFEConfigs2 = awemeFEConfigs;
            if (PatchProxy.isSupport(new Object[]{protoReader2, awemeFEConfigs2}, this, changeQuickRedirect, false, 47710, new Class[]{ProtoReader.class, AwemeFEConfigs.class}, AwemeFEConfigs.class)) {
                return (AwemeFEConfigs) PatchProxy.accessDispatch(new Object[]{protoReader2, awemeFEConfigs2}, this, changeQuickRedirect, false, 47710, new Class[]{ProtoReader.class, AwemeFEConfigs.class}, AwemeFEConfigs.class);
            }
            AwemeFEConfigs awemeFEConfigs3 = (AwemeFEConfigs) a.a().a(AwemeFEConfigs.class, awemeFEConfigs2);
            if (awemeFEConfigs3 != null) {
                builder = awemeFEConfigs3.newBuilder();
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
                            builder2.business_ec((BusinessEC) BusinessEC.ADAPTER.decode(protoReader2, builder2.business_ec));
                            break;
                        case 2:
                            builder2.star_atlas_order((StarAtlasOrder) StarAtlasOrder.ADAPTER.decode(protoReader2, builder2.star_atlas_order));
                            break;
                        case 3:
                            builder2.link_plan((LinkPlan) LinkPlan.ADAPTER.decode(protoReader2, builder2.link_plan));
                            break;
                        case 4:
                            builder2.poi_error_report((PoiConfig) PoiConfig.ADAPTER.decode(protoReader2, builder2.poi_error_report));
                            break;
                        case 5:
                            builder2.goods_report((GoodsReport) GoodsReport.ADAPTER.decode(protoReader2, builder2.goods_report));
                            break;
                        case 6:
                            builder2.mp_tab((MpTab) MpTab.ADAPTER.decode(protoReader2, builder2.mp_tab));
                            break;
                        case e.l:
                            builder2.seeding((Seeding) Seeding.ADAPTER.decode(protoReader2, builder2.seeding));
                            break;
                        case 8:
                            builder2.live((ShopLiveConfig) ShopLiveConfig.ADAPTER.decode(protoReader2, builder2.live));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (awemeFEConfigs3 != null) {
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
    public final BusinessEC getBusinessEc() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47694, new Class[0], BusinessEC.class)) {
            return (BusinessEC) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47694, new Class[0], BusinessEC.class);
        } else if (this.business_ec != null) {
            return this.business_ec;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final GoodsReport getGoodsReport() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47698, new Class[0], GoodsReport.class)) {
            return (GoodsReport) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47698, new Class[0], GoodsReport.class);
        } else if (this.goods_report != null) {
            return this.goods_report;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final LinkPlan getLinkPlan() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47696, new Class[0], LinkPlan.class)) {
            return (LinkPlan) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47696, new Class[0], LinkPlan.class);
        } else if (this.link_plan != null) {
            return this.link_plan;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final ShopLiveConfig getLive() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47701, new Class[0], ShopLiveConfig.class)) {
            return (ShopLiveConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47701, new Class[0], ShopLiveConfig.class);
        } else if (this.live != null) {
            return this.live;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final MpTab getMpTab() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47699, new Class[0], MpTab.class)) {
            return (MpTab) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47699, new Class[0], MpTab.class);
        } else if (this.mp_tab != null) {
            return this.mp_tab;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final PoiConfig getPoiErrorReport() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47697, new Class[0], PoiConfig.class)) {
            return (PoiConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47697, new Class[0], PoiConfig.class);
        } else if (this.poi_error_report != null) {
            return this.poi_error_report;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Seeding getSeeding() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47700, new Class[0], Seeding.class)) {
            return (Seeding) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47700, new Class[0], Seeding.class);
        } else if (this.seeding != null) {
            return this.seeding;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final StarAtlasOrder getStarAtlasOrder() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47695, new Class[0], StarAtlasOrder.class)) {
            return (StarAtlasOrder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47695, new Class[0], StarAtlasOrder.class);
        } else if (this.star_atlas_order != null) {
            return this.star_atlas_order;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47702, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47702, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.business_ec = this.business_ec;
        builder.star_atlas_order = this.star_atlas_order;
        builder.link_plan = this.link_plan;
        builder.poi_error_report = this.poi_error_report;
        builder.goods_report = this.goods_report;
        builder.mp_tab = this.mp_tab;
        builder.seeding = this.seeding;
        builder.live = this.live;
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47704, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47704, new Class[0], Integer.TYPE)).intValue();
        }
        int i9 = this.hashCode;
        if (i9 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.business_ec != null) {
                i = this.business_ec.hashCode();
            } else {
                i = 0;
            }
            int i10 = (hashCode + i) * 37;
            if (this.star_atlas_order != null) {
                i2 = this.star_atlas_order.hashCode();
            } else {
                i2 = 0;
            }
            int i11 = (i10 + i2) * 37;
            if (this.link_plan != null) {
                i3 = this.link_plan.hashCode();
            } else {
                i3 = 0;
            }
            int i12 = (i11 + i3) * 37;
            if (this.poi_error_report != null) {
                i4 = this.poi_error_report.hashCode();
            } else {
                i4 = 0;
            }
            int i13 = (i12 + i4) * 37;
            if (this.goods_report != null) {
                i5 = this.goods_report.hashCode();
            } else {
                i5 = 0;
            }
            int i14 = (i13 + i5) * 37;
            if (this.mp_tab != null) {
                i6 = this.mp_tab.hashCode();
            } else {
                i6 = 0;
            }
            int i15 = (i14 + i6) * 37;
            if (this.seeding != null) {
                i7 = this.seeding.hashCode();
            } else {
                i7 = 0;
            }
            int i16 = (i15 + i7) * 37;
            if (this.live != null) {
                i8 = this.live.hashCode();
            }
            i9 = i16 + i8;
            this.hashCode = i9;
        }
        return i9;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47705, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47705, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.business_ec != null) {
            sb.append(", business_ec=");
            sb.append(this.business_ec);
        }
        if (this.star_atlas_order != null) {
            sb.append(", star_atlas_order=");
            sb.append(this.star_atlas_order);
        }
        if (this.link_plan != null) {
            sb.append(", link_plan=");
            sb.append(this.link_plan);
        }
        if (this.poi_error_report != null) {
            sb.append(", poi_error_report=");
            sb.append(this.poi_error_report);
        }
        if (this.goods_report != null) {
            sb.append(", goods_report=");
            sb.append(this.goods_report);
        }
        if (this.mp_tab != null) {
            sb.append(", mp_tab=");
            sb.append(this.mp_tab);
        }
        if (this.seeding != null) {
            sb.append(", seeding=");
            sb.append(this.seeding);
        }
        if (this.live != null) {
            sb.append(", live=");
            sb.append(this.live);
        }
        StringBuilder replace = sb.replace(0, 2, "AwemeFEConfigs{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47703, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47703, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof AwemeFEConfigs)) {
                return false;
            }
            AwemeFEConfigs awemeFEConfigs = (AwemeFEConfigs) obj;
            if (!unknownFields().equals(awemeFEConfigs.unknownFields()) || !Internal.equals(this.business_ec, awemeFEConfigs.business_ec) || !Internal.equals(this.star_atlas_order, awemeFEConfigs.star_atlas_order) || !Internal.equals(this.link_plan, awemeFEConfigs.link_plan) || !Internal.equals(this.poi_error_report, awemeFEConfigs.poi_error_report) || !Internal.equals(this.goods_report, awemeFEConfigs.goods_report) || !Internal.equals(this.mp_tab, awemeFEConfigs.mp_tab) || !Internal.equals(this.seeding, awemeFEConfigs.seeding) || !Internal.equals(this.live, awemeFEConfigs.live)) {
                return false;
            }
            return true;
        }
    }

    public AwemeFEConfigs(BusinessEC businessEC, StarAtlasOrder starAtlasOrder, LinkPlan linkPlan, PoiConfig poiConfig, GoodsReport goodsReport, MpTab mpTab, Seeding seeding2, ShopLiveConfig shopLiveConfig) {
        this(businessEC, starAtlasOrder, linkPlan, poiConfig, goodsReport, mpTab, seeding2, shopLiveConfig, ByteString.EMPTY);
    }

    public AwemeFEConfigs(BusinessEC businessEC, StarAtlasOrder starAtlasOrder, LinkPlan linkPlan, PoiConfig poiConfig, GoodsReport goodsReport, MpTab mpTab, Seeding seeding2, ShopLiveConfig shopLiveConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.business_ec = businessEC;
        this.star_atlas_order = starAtlasOrder;
        this.link_plan = linkPlan;
        this.poi_error_report = poiConfig;
        this.goods_report = goodsReport;
        this.mp_tab = mpTab;
        this.seeding = seeding2;
        this.live = shopLiveConfig;
    }
}
