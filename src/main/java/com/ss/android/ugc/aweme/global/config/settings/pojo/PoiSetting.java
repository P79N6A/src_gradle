package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.KtNullable;
import com.bytedance.ies.c.a;
import com.bytedance.ies.c.b;
import com.bytedance.ies.c.c;
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

public final class PoiSetting extends Message<PoiSetting, Builder> {
    public static final DefaultValueProtoAdapter<PoiSetting> ADAPTER = new ProtoAdapter_PoiSetting();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String life_service_assistant_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = 0, tag = 1)
    public final Integer location_update_interval;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 11)
    public final Integer max_pic_size;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String merchant_management_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String merchant_settle_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = 0, tag = 10)
    public final Integer nearby_location_prompt_interval;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = 0, tag = 9)
    public final Boolean report_at_start;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public final Integer report_bss_max;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = 0, tag = 5)
    public final Boolean report_gps;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = 0, tag = 8)
    public final Integer report_interval_seconds;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public final Integer report_wifi_max;

    public static final class Builder extends Message.Builder<PoiSetting, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String life_service_assistant_url;
        public Integer location_update_interval = 0;
        public Integer max_pic_size;
        public String merchant_management_url;
        public String merchant_settle_url;
        public Integer nearby_location_prompt_interval = 0;
        public Boolean report_at_start = Boolean.TRUE;
        public Integer report_bss_max = 0;
        public Boolean report_gps = Boolean.TRUE;
        public Integer report_interval_seconds = 600;
        public Integer report_wifi_max = 0;

        public final PoiSetting build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48977, new Class[0], PoiSetting.class)) {
                return (PoiSetting) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48977, new Class[0], PoiSetting.class);
            } else if (this.location_update_interval == null || this.report_gps == null || this.report_interval_seconds == null || this.report_at_start == null || this.nearby_location_prompt_interval == null) {
                throw c.a(this.location_update_interval, "location_update_interval", this.report_gps, "report_gps", this.report_interval_seconds, "report_interval_seconds", this.report_at_start, "report_at_start", this.nearby_location_prompt_interval, "nearby_location_prompt_interval");
            } else {
                PoiSetting poiSetting = new PoiSetting(this.location_update_interval, this.merchant_settle_url, this.life_service_assistant_url, this.merchant_management_url, this.report_gps, this.report_bss_max, this.report_wifi_max, this.report_interval_seconds, this.report_at_start, this.nearby_location_prompt_interval, this.max_pic_size, super.buildUnknownFields());
                return poiSetting;
            }
        }

        public final Builder life_service_assistant_url(String str) {
            this.life_service_assistant_url = str;
            return this;
        }

        public final Builder location_update_interval(Integer num) {
            this.location_update_interval = num;
            return this;
        }

        public final Builder max_pic_size(Integer num) {
            this.max_pic_size = num;
            return this;
        }

        public final Builder merchant_management_url(String str) {
            this.merchant_management_url = str;
            return this;
        }

        public final Builder merchant_settle_url(String str) {
            this.merchant_settle_url = str;
            return this;
        }

        public final Builder nearby_location_prompt_interval(Integer num) {
            this.nearby_location_prompt_interval = num;
            return this;
        }

        public final Builder report_at_start(Boolean bool) {
            this.report_at_start = bool;
            return this;
        }

        public final Builder report_bss_max(Integer num) {
            this.report_bss_max = num;
            return this;
        }

        public final Builder report_gps(Boolean bool) {
            this.report_gps = bool;
            return this;
        }

        public final Builder report_interval_seconds(Integer num) {
            this.report_interval_seconds = num;
            return this;
        }

        public final Builder report_wifi_max(Integer num) {
            this.report_wifi_max = num;
            return this;
        }
    }

    static final class ProtoAdapter_PoiSetting extends DefaultValueProtoAdapter<PoiSetting> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final PoiSetting redact(PoiSetting poiSetting) {
            return poiSetting;
        }

        public ProtoAdapter_PoiSetting() {
            super(FieldEncoding.LENGTH_DELIMITED, PoiSetting.class);
        }

        public final PoiSetting decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48980, new Class[]{ProtoReader.class}, PoiSetting.class)) {
                return decode(protoReader2, (PoiSetting) null);
            }
            return (PoiSetting) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48980, new Class[]{ProtoReader.class}, PoiSetting.class);
        }

        public final int encodedSize(PoiSetting poiSetting) {
            PoiSetting poiSetting2 = poiSetting;
            if (!PatchProxy.isSupport(new Object[]{poiSetting2}, this, changeQuickRedirect, false, 48978, new Class[]{PoiSetting.class}, Integer.TYPE)) {
                return ProtoAdapter.INT32.encodedSizeWithTag(1, poiSetting2.location_update_interval) + ProtoAdapter.STRING.encodedSizeWithTag(2, poiSetting2.merchant_settle_url) + ProtoAdapter.STRING.encodedSizeWithTag(3, poiSetting2.life_service_assistant_url) + ProtoAdapter.STRING.encodedSizeWithTag(4, poiSetting2.merchant_management_url) + ProtoAdapter.BOOL.encodedSizeWithTag(5, poiSetting2.report_gps) + ProtoAdapter.INT32.encodedSizeWithTag(6, poiSetting2.report_bss_max) + ProtoAdapter.INT32.encodedSizeWithTag(7, poiSetting2.report_wifi_max) + ProtoAdapter.INT32.encodedSizeWithTag(8, poiSetting2.report_interval_seconds) + ProtoAdapter.BOOL.encodedSizeWithTag(9, poiSetting2.report_at_start) + ProtoAdapter.INT32.encodedSizeWithTag(10, poiSetting2.nearby_location_prompt_interval) + ProtoAdapter.INT32.encodedSizeWithTag(11, poiSetting2.max_pic_size) + poiSetting.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{poiSetting2}, this, changeQuickRedirect, false, 48978, new Class[]{PoiSetting.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, PoiSetting poiSetting) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            PoiSetting poiSetting2 = poiSetting;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, poiSetting2}, this, changeQuickRedirect, false, 48979, new Class[]{ProtoWriter.class, PoiSetting.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, poiSetting2}, this, changeQuickRedirect, false, 48979, new Class[]{ProtoWriter.class, PoiSetting.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 1, poiSetting2.location_update_interval);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, poiSetting2.merchant_settle_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, poiSetting2.life_service_assistant_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, poiSetting2.merchant_management_url);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 5, poiSetting2.report_gps);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 6, poiSetting2.report_bss_max);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 7, poiSetting2.report_wifi_max);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 8, poiSetting2.report_interval_seconds);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 9, poiSetting2.report_at_start);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 10, poiSetting2.nearby_location_prompt_interval);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 11, poiSetting2.max_pic_size);
            protoWriter2.writeBytes(poiSetting.unknownFields());
        }

        public final PoiSetting decode(ProtoReader protoReader, PoiSetting poiSetting) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            PoiSetting poiSetting2 = poiSetting;
            if (PatchProxy.isSupport(new Object[]{protoReader2, poiSetting2}, this, changeQuickRedirect, false, 48981, new Class[]{ProtoReader.class, PoiSetting.class}, PoiSetting.class)) {
                return (PoiSetting) PatchProxy.accessDispatch(new Object[]{protoReader2, poiSetting2}, this, changeQuickRedirect, false, 48981, new Class[]{ProtoReader.class, PoiSetting.class}, PoiSetting.class);
            }
            PoiSetting poiSetting3 = (PoiSetting) a.a().a(PoiSetting.class, poiSetting2);
            if (poiSetting3 != null) {
                builder = poiSetting3.newBuilder();
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
                            builder2.location_update_interval((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 2:
                            builder2.merchant_settle_url((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 3:
                            builder2.life_service_assistant_url((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 4:
                            builder2.merchant_management_url((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 5:
                            builder2.report_gps((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 6:
                            builder2.report_bss_max((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case e.l:
                            builder2.report_wifi_max((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 8:
                            builder2.report_interval_seconds((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 9:
                            builder2.report_at_start((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 10:
                            builder2.nearby_location_prompt_interval((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 11:
                            builder2.max_pic_size((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (poiSetting3 != null) {
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

    public final Integer getLocationUpdateInterval() {
        return this.location_update_interval;
    }

    public final Integer getNearbyLocationPromptInterval() {
        return this.nearby_location_prompt_interval;
    }

    public final Boolean getReportAtStart() {
        return this.report_at_start;
    }

    public final Boolean getReportGps() {
        return this.report_gps;
    }

    public final Integer getReportIntervalSeconds() {
        return this.report_interval_seconds;
    }

    @KtNullable
    public final String getLifeServiceAssistantUrl() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48968, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48968, new Class[0], String.class);
        } else if (this.life_service_assistant_url != null) {
            return this.life_service_assistant_url;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getMaxPicSize() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48972, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48972, new Class[0], Integer.class);
        } else if (this.max_pic_size != null) {
            return this.max_pic_size;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getMerchantManagementUrl() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48969, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48969, new Class[0], String.class);
        } else if (this.merchant_management_url != null) {
            return this.merchant_management_url;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getMerchantSettleUrl() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48967, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48967, new Class[0], String.class);
        } else if (this.merchant_settle_url != null) {
            return this.merchant_settle_url;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getReportBssMax() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48970, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48970, new Class[0], Integer.class);
        } else if (this.report_bss_max != null) {
            return this.report_bss_max;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getReportWifiMax() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48971, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48971, new Class[0], Integer.class);
        } else if (this.report_wifi_max != null) {
            return this.report_wifi_max;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48973, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48973, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.location_update_interval = this.location_update_interval;
        builder.merchant_settle_url = this.merchant_settle_url;
        builder.life_service_assistant_url = this.life_service_assistant_url;
        builder.merchant_management_url = this.merchant_management_url;
        builder.report_gps = this.report_gps;
        builder.report_bss_max = this.report_bss_max;
        builder.report_wifi_max = this.report_wifi_max;
        builder.report_interval_seconds = this.report_interval_seconds;
        builder.report_at_start = this.report_at_start;
        builder.nearby_location_prompt_interval = this.nearby_location_prompt_interval;
        builder.max_pic_size = this.max_pic_size;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48975, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48975, new Class[0], Integer.TYPE)).intValue();
        }
        int i7 = this.hashCode;
        if (i7 == 0) {
            int hashCode = ((unknownFields().hashCode() * 37) + this.location_update_interval.hashCode()) * 37;
            if (this.merchant_settle_url != null) {
                i = this.merchant_settle_url.hashCode();
            } else {
                i = 0;
            }
            int i8 = (hashCode + i) * 37;
            if (this.life_service_assistant_url != null) {
                i2 = this.life_service_assistant_url.hashCode();
            } else {
                i2 = 0;
            }
            int i9 = (i8 + i2) * 37;
            if (this.merchant_management_url != null) {
                i3 = this.merchant_management_url.hashCode();
            } else {
                i3 = 0;
            }
            int hashCode2 = (((i9 + i3) * 37) + this.report_gps.hashCode()) * 37;
            if (this.report_bss_max != null) {
                i4 = this.report_bss_max.hashCode();
            } else {
                i4 = 0;
            }
            int i10 = (hashCode2 + i4) * 37;
            if (this.report_wifi_max != null) {
                i5 = this.report_wifi_max.hashCode();
            } else {
                i5 = 0;
            }
            int hashCode3 = (((((((i10 + i5) * 37) + this.report_interval_seconds.hashCode()) * 37) + this.report_at_start.hashCode()) * 37) + this.nearby_location_prompt_interval.hashCode()) * 37;
            if (this.max_pic_size != null) {
                i6 = this.max_pic_size.hashCode();
            }
            i7 = hashCode3 + i6;
            this.hashCode = i7;
        }
        return i7;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48976, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48976, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(", location_update_interval=");
        sb.append(this.location_update_interval);
        if (this.merchant_settle_url != null) {
            sb.append(", merchant_settle_url=");
            sb.append(this.merchant_settle_url);
        }
        if (this.life_service_assistant_url != null) {
            sb.append(", life_service_assistant_url=");
            sb.append(this.life_service_assistant_url);
        }
        if (this.merchant_management_url != null) {
            sb.append(", merchant_management_url=");
            sb.append(this.merchant_management_url);
        }
        sb.append(", report_gps=");
        sb.append(this.report_gps);
        if (this.report_bss_max != null) {
            sb.append(", report_bss_max=");
            sb.append(this.report_bss_max);
        }
        if (this.report_wifi_max != null) {
            sb.append(", report_wifi_max=");
            sb.append(this.report_wifi_max);
        }
        sb.append(", report_interval_seconds=");
        sb.append(this.report_interval_seconds);
        sb.append(", report_at_start=");
        sb.append(this.report_at_start);
        sb.append(", nearby_location_prompt_interval=");
        sb.append(this.nearby_location_prompt_interval);
        if (this.max_pic_size != null) {
            sb.append(", max_pic_size=");
            sb.append(this.max_pic_size);
        }
        StringBuilder replace = sb.replace(0, 2, "PoiSetting{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 48974, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 48974, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof PoiSetting)) {
                return false;
            }
            PoiSetting poiSetting = (PoiSetting) obj;
            if (!unknownFields().equals(poiSetting.unknownFields()) || !this.location_update_interval.equals(poiSetting.location_update_interval) || !Internal.equals(this.merchant_settle_url, poiSetting.merchant_settle_url) || !Internal.equals(this.life_service_assistant_url, poiSetting.life_service_assistant_url) || !Internal.equals(this.merchant_management_url, poiSetting.merchant_management_url) || !this.report_gps.equals(poiSetting.report_gps) || !Internal.equals(this.report_bss_max, poiSetting.report_bss_max) || !Internal.equals(this.report_wifi_max, poiSetting.report_wifi_max) || !this.report_interval_seconds.equals(poiSetting.report_interval_seconds) || !this.report_at_start.equals(poiSetting.report_at_start) || !this.nearby_location_prompt_interval.equals(poiSetting.nearby_location_prompt_interval) || !Internal.equals(this.max_pic_size, poiSetting.max_pic_size)) {
                return false;
            }
            return true;
        }
    }

    public PoiSetting(Integer num, String str, String str2, String str3, Boolean bool, Integer num2, Integer num3, Integer num4, Boolean bool2, Integer num5, Integer num6) {
        this(num, str, str2, str3, bool, num2, num3, num4, bool2, num5, num6, ByteString.EMPTY);
    }

    public PoiSetting(Integer num, String str, String str2, String str3, Boolean bool, Integer num2, Integer num3, Integer num4, Boolean bool2, Integer num5, Integer num6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.location_update_interval = num;
        this.merchant_settle_url = str;
        this.life_service_assistant_url = str2;
        this.merchant_management_url = str3;
        this.report_gps = bool;
        this.report_bss_max = num2;
        this.report_wifi_max = num3;
        this.report_interval_seconds = num4;
        this.report_at_start = bool2;
        this.nearby_location_prompt_interval = num5;
        this.max_pic_size = num6;
    }
}
