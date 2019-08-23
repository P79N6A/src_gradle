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
import java.util.List;
import okio.ByteString;

public final class AdLandingPageConfig extends Message<AdLandingPageConfig, Builder> {
    public static final DefaultValueProtoAdapter<AdLandingPageConfig> ADAPTER = new ProtoAdapter_AdLandingPageConfig();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 3)
    public final List<String> ad_landing_page_auto_jump_allow_list;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public final Boolean ad_landing_page_auto_jump_control_enabled;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 4)
    public final List<String> ad_landing_page_auto_jump_intercept_list;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean ad_landing_page_click_jump_control_enabled;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public final Integer ad_landing_page_click_jump_interval;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String ad_landing_page_click_jump_interval_tips;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 8)
    public final List<String> ad_landing_page_pause_list;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 11)
    public final Integer ad_landing_page_preload_cache_count;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 9)
    public final List<String> ad_landing_page_preload_common_channel;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 10)
    public final List<String> ad_landing_page_preload_common_prefix;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 7)
    public final Boolean enable_dynamic_navbar;

    public static final class Builder extends Message.Builder<AdLandingPageConfig, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public List<String> ad_landing_page_auto_jump_allow_list = Internal.newMutableList();
        public Boolean ad_landing_page_auto_jump_control_enabled;
        public List<String> ad_landing_page_auto_jump_intercept_list = Internal.newMutableList();
        public Boolean ad_landing_page_click_jump_control_enabled;
        public Integer ad_landing_page_click_jump_interval;
        public String ad_landing_page_click_jump_interval_tips;
        public List<String> ad_landing_page_pause_list = Internal.newMutableList();
        public Integer ad_landing_page_preload_cache_count;
        public List<String> ad_landing_page_preload_common_channel = Internal.newMutableList();
        public List<String> ad_landing_page_preload_common_prefix = Internal.newMutableList();
        public Boolean enable_dynamic_navbar;

        public final AdLandingPageConfig build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47654, new Class[0], AdLandingPageConfig.class)) {
                return (AdLandingPageConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47654, new Class[0], AdLandingPageConfig.class);
            }
            AdLandingPageConfig adLandingPageConfig = new AdLandingPageConfig(this.ad_landing_page_auto_jump_control_enabled, this.ad_landing_page_click_jump_control_enabled, this.ad_landing_page_auto_jump_allow_list, this.ad_landing_page_auto_jump_intercept_list, this.ad_landing_page_click_jump_interval, this.ad_landing_page_click_jump_interval_tips, this.enable_dynamic_navbar, this.ad_landing_page_pause_list, this.ad_landing_page_preload_common_channel, this.ad_landing_page_preload_common_prefix, this.ad_landing_page_preload_cache_count, super.buildUnknownFields());
            return adLandingPageConfig;
        }

        public final Builder ad_landing_page_auto_jump_control_enabled(Boolean bool) {
            this.ad_landing_page_auto_jump_control_enabled = bool;
            return this;
        }

        public final Builder ad_landing_page_click_jump_control_enabled(Boolean bool) {
            this.ad_landing_page_click_jump_control_enabled = bool;
            return this;
        }

        public final Builder ad_landing_page_click_jump_interval(Integer num) {
            this.ad_landing_page_click_jump_interval = num;
            return this;
        }

        public final Builder ad_landing_page_click_jump_interval_tips(String str) {
            this.ad_landing_page_click_jump_interval_tips = str;
            return this;
        }

        public final Builder ad_landing_page_preload_cache_count(Integer num) {
            this.ad_landing_page_preload_cache_count = num;
            return this;
        }

        public final Builder enable_dynamic_navbar(Boolean bool) {
            this.enable_dynamic_navbar = bool;
            return this;
        }

        public final Builder ad_landing_page_auto_jump_allow_list(List<String> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 47649, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 47649, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.ad_landing_page_auto_jump_allow_list = list;
            return this;
        }

        public final Builder ad_landing_page_auto_jump_intercept_list(List<String> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 47650, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 47650, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.ad_landing_page_auto_jump_intercept_list = list;
            return this;
        }

        public final Builder ad_landing_page_pause_list(List<String> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 47651, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 47651, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.ad_landing_page_pause_list = list;
            return this;
        }

        public final Builder ad_landing_page_preload_common_channel(List<String> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 47652, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 47652, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.ad_landing_page_preload_common_channel = list;
            return this;
        }

        public final Builder ad_landing_page_preload_common_prefix(List<String> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 47653, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 47653, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.ad_landing_page_preload_common_prefix = list;
            return this;
        }
    }

    static final class ProtoAdapter_AdLandingPageConfig extends DefaultValueProtoAdapter<AdLandingPageConfig> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final AdLandingPageConfig redact(AdLandingPageConfig adLandingPageConfig) {
            return adLandingPageConfig;
        }

        public ProtoAdapter_AdLandingPageConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, AdLandingPageConfig.class);
        }

        public final AdLandingPageConfig decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47657, new Class[]{ProtoReader.class}, AdLandingPageConfig.class)) {
                return decode(protoReader2, (AdLandingPageConfig) null);
            }
            return (AdLandingPageConfig) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47657, new Class[]{ProtoReader.class}, AdLandingPageConfig.class);
        }

        public final int encodedSize(AdLandingPageConfig adLandingPageConfig) {
            AdLandingPageConfig adLandingPageConfig2 = adLandingPageConfig;
            if (!PatchProxy.isSupport(new Object[]{adLandingPageConfig2}, this, changeQuickRedirect, false, 47655, new Class[]{AdLandingPageConfig.class}, Integer.TYPE)) {
                return ProtoAdapter.BOOL.encodedSizeWithTag(1, adLandingPageConfig2.ad_landing_page_auto_jump_control_enabled) + ProtoAdapter.BOOL.encodedSizeWithTag(2, adLandingPageConfig2.ad_landing_page_click_jump_control_enabled) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, adLandingPageConfig2.ad_landing_page_auto_jump_allow_list) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, adLandingPageConfig2.ad_landing_page_auto_jump_intercept_list) + ProtoAdapter.INT32.encodedSizeWithTag(5, adLandingPageConfig2.ad_landing_page_click_jump_interval) + ProtoAdapter.STRING.encodedSizeWithTag(6, adLandingPageConfig2.ad_landing_page_click_jump_interval_tips) + ProtoAdapter.BOOL.encodedSizeWithTag(7, adLandingPageConfig2.enable_dynamic_navbar) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(8, adLandingPageConfig2.ad_landing_page_pause_list) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(9, adLandingPageConfig2.ad_landing_page_preload_common_channel) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(10, adLandingPageConfig2.ad_landing_page_preload_common_prefix) + ProtoAdapter.INT32.encodedSizeWithTag(11, adLandingPageConfig2.ad_landing_page_preload_cache_count) + adLandingPageConfig.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{adLandingPageConfig2}, this, changeQuickRedirect, false, 47655, new Class[]{AdLandingPageConfig.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, AdLandingPageConfig adLandingPageConfig) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            AdLandingPageConfig adLandingPageConfig2 = adLandingPageConfig;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, adLandingPageConfig2}, this, changeQuickRedirect, false, 47656, new Class[]{ProtoWriter.class, AdLandingPageConfig.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, adLandingPageConfig2}, this, changeQuickRedirect, false, 47656, new Class[]{ProtoWriter.class, AdLandingPageConfig.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1, adLandingPageConfig2.ad_landing_page_auto_jump_control_enabled);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 2, adLandingPageConfig2.ad_landing_page_click_jump_control_enabled);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter2, 3, adLandingPageConfig2.ad_landing_page_auto_jump_allow_list);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter2, 4, adLandingPageConfig2.ad_landing_page_auto_jump_intercept_list);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 5, adLandingPageConfig2.ad_landing_page_click_jump_interval);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 6, adLandingPageConfig2.ad_landing_page_click_jump_interval_tips);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 7, adLandingPageConfig2.enable_dynamic_navbar);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter2, 8, adLandingPageConfig2.ad_landing_page_pause_list);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter2, 9, adLandingPageConfig2.ad_landing_page_preload_common_channel);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter2, 10, adLandingPageConfig2.ad_landing_page_preload_common_prefix);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 11, adLandingPageConfig2.ad_landing_page_preload_cache_count);
            protoWriter2.writeBytes(adLandingPageConfig.unknownFields());
        }

        public final AdLandingPageConfig decode(ProtoReader protoReader, AdLandingPageConfig adLandingPageConfig) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            AdLandingPageConfig adLandingPageConfig2 = adLandingPageConfig;
            if (PatchProxy.isSupport(new Object[]{protoReader2, adLandingPageConfig2}, this, changeQuickRedirect, false, 47658, new Class[]{ProtoReader.class, AdLandingPageConfig.class}, AdLandingPageConfig.class)) {
                return (AdLandingPageConfig) PatchProxy.accessDispatch(new Object[]{protoReader2, adLandingPageConfig2}, this, changeQuickRedirect, false, 47658, new Class[]{ProtoReader.class, AdLandingPageConfig.class}, AdLandingPageConfig.class);
            }
            AdLandingPageConfig adLandingPageConfig3 = (AdLandingPageConfig) a.a().a(AdLandingPageConfig.class, adLandingPageConfig2);
            if (adLandingPageConfig3 != null) {
                builder = adLandingPageConfig3.newBuilder();
            } else {
                builder = new Builder();
            }
            Builder builder2 = builder;
            List<String> newMutableList = Internal.newMutableList();
            List<String> newMutableList2 = Internal.newMutableList();
            List<String> newMutableList3 = Internal.newMutableList();
            List<String> newMutableList4 = Internal.newMutableList();
            List<String> newMutableList5 = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder2.ad_landing_page_auto_jump_control_enabled((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 2:
                            builder2.ad_landing_page_click_jump_control_enabled((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 3:
                            newMutableList.add(ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 4:
                            newMutableList2.add(ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 5:
                            builder2.ad_landing_page_click_jump_interval((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 6:
                            builder2.ad_landing_page_click_jump_interval_tips((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case e.l:
                            builder2.enable_dynamic_navbar((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 8:
                            newMutableList3.add(ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 9:
                            newMutableList4.add(ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 10:
                            newMutableList5.add(ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 11:
                            builder2.ad_landing_page_preload_cache_count((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (adLandingPageConfig3 != null) {
                                    break;
                                } else {
                                    throw e2;
                                }
                            }
                    }
                } else {
                    protoReader2.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder2.ad_landing_page_auto_jump_allow_list = newMutableList;
                    }
                    if (!newMutableList2.isEmpty()) {
                        builder2.ad_landing_page_auto_jump_intercept_list = newMutableList2;
                    }
                    if (!newMutableList3.isEmpty()) {
                        builder2.ad_landing_page_pause_list = newMutableList3;
                    }
                    if (!newMutableList4.isEmpty()) {
                        builder2.ad_landing_page_preload_common_channel = newMutableList4;
                    }
                    if (!newMutableList5.isEmpty()) {
                        builder2.ad_landing_page_preload_common_prefix = newMutableList5;
                    }
                    return builder2.build();
                }
            }
        }
    }

    public final List<String> getAdLandingPageAutoJumpAllowList() {
        return this.ad_landing_page_auto_jump_allow_list;
    }

    public final List<String> getAdLandingPageAutoJumpInterceptList() {
        return this.ad_landing_page_auto_jump_intercept_list;
    }

    public final List<String> getAdLandingPagePauseList() {
        return this.ad_landing_page_pause_list;
    }

    public final List<String> getAdLandingPagePreloadCommonChannel() {
        return this.ad_landing_page_preload_common_channel;
    }

    public final List<String> getAdLandingPagePreloadCommonPrefix() {
        return this.ad_landing_page_preload_common_prefix;
    }

    @KtNullable
    public final Boolean getAdLandingPageAutoJumpControlEnabled() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47639, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47639, new Class[0], Boolean.class);
        } else if (this.ad_landing_page_auto_jump_control_enabled != null) {
            return this.ad_landing_page_auto_jump_control_enabled;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean getAdLandingPageClickJumpControlEnabled() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47640, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47640, new Class[0], Boolean.class);
        } else if (this.ad_landing_page_click_jump_control_enabled != null) {
            return this.ad_landing_page_click_jump_control_enabled;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getAdLandingPageClickJumpInterval() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47641, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47641, new Class[0], Integer.class);
        } else if (this.ad_landing_page_click_jump_interval != null) {
            return this.ad_landing_page_click_jump_interval;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getAdLandingPageClickJumpIntervalTips() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47642, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47642, new Class[0], String.class);
        } else if (this.ad_landing_page_click_jump_interval_tips != null) {
            return this.ad_landing_page_click_jump_interval_tips;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getAdLandingPagePreloadCacheCount() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47644, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47644, new Class[0], Integer.class);
        } else if (this.ad_landing_page_preload_cache_count != null) {
            return this.ad_landing_page_preload_cache_count;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean getEnableDynamicNavbar() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47643, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47643, new Class[0], Boolean.class);
        } else if (this.enable_dynamic_navbar != null) {
            return this.enable_dynamic_navbar;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47645, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47645, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.ad_landing_page_auto_jump_control_enabled = this.ad_landing_page_auto_jump_control_enabled;
        builder.ad_landing_page_click_jump_control_enabled = this.ad_landing_page_click_jump_control_enabled;
        builder.ad_landing_page_auto_jump_allow_list = Internal.copyOf("ad_landing_page_auto_jump_allow_list", this.ad_landing_page_auto_jump_allow_list);
        builder.ad_landing_page_auto_jump_intercept_list = Internal.copyOf("ad_landing_page_auto_jump_intercept_list", this.ad_landing_page_auto_jump_intercept_list);
        builder.ad_landing_page_click_jump_interval = this.ad_landing_page_click_jump_interval;
        builder.ad_landing_page_click_jump_interval_tips = this.ad_landing_page_click_jump_interval_tips;
        builder.enable_dynamic_navbar = this.enable_dynamic_navbar;
        builder.ad_landing_page_pause_list = Internal.copyOf("ad_landing_page_pause_list", this.ad_landing_page_pause_list);
        builder.ad_landing_page_preload_common_channel = Internal.copyOf("ad_landing_page_preload_common_channel", this.ad_landing_page_preload_common_channel);
        builder.ad_landing_page_preload_common_prefix = Internal.copyOf("ad_landing_page_preload_common_prefix", this.ad_landing_page_preload_common_prefix);
        builder.ad_landing_page_preload_cache_count = this.ad_landing_page_preload_cache_count;
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47647, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47647, new Class[0], Integer.TYPE)).intValue();
        }
        int i7 = this.hashCode;
        if (i7 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.ad_landing_page_auto_jump_control_enabled != null) {
                i = this.ad_landing_page_auto_jump_control_enabled.hashCode();
            } else {
                i = 0;
            }
            int i8 = (hashCode + i) * 37;
            if (this.ad_landing_page_click_jump_control_enabled != null) {
                i2 = this.ad_landing_page_click_jump_control_enabled.hashCode();
            } else {
                i2 = 0;
            }
            int hashCode2 = (((((i8 + i2) * 37) + this.ad_landing_page_auto_jump_allow_list.hashCode()) * 37) + this.ad_landing_page_auto_jump_intercept_list.hashCode()) * 37;
            if (this.ad_landing_page_click_jump_interval != null) {
                i3 = this.ad_landing_page_click_jump_interval.hashCode();
            } else {
                i3 = 0;
            }
            int i9 = (hashCode2 + i3) * 37;
            if (this.ad_landing_page_click_jump_interval_tips != null) {
                i4 = this.ad_landing_page_click_jump_interval_tips.hashCode();
            } else {
                i4 = 0;
            }
            int i10 = (i9 + i4) * 37;
            if (this.enable_dynamic_navbar != null) {
                i5 = this.enable_dynamic_navbar.hashCode();
            } else {
                i5 = 0;
            }
            int hashCode3 = (((((((i10 + i5) * 37) + this.ad_landing_page_pause_list.hashCode()) * 37) + this.ad_landing_page_preload_common_channel.hashCode()) * 37) + this.ad_landing_page_preload_common_prefix.hashCode()) * 37;
            if (this.ad_landing_page_preload_cache_count != null) {
                i6 = this.ad_landing_page_preload_cache_count.hashCode();
            }
            i7 = hashCode3 + i6;
            this.hashCode = i7;
        }
        return i7;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47648, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47648, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.ad_landing_page_auto_jump_control_enabled != null) {
            sb.append(", ad_landing_page_auto_jump_control_enabled=");
            sb.append(this.ad_landing_page_auto_jump_control_enabled);
        }
        if (this.ad_landing_page_click_jump_control_enabled != null) {
            sb.append(", ad_landing_page_click_jump_control_enabled=");
            sb.append(this.ad_landing_page_click_jump_control_enabled);
        }
        if (!this.ad_landing_page_auto_jump_allow_list.isEmpty()) {
            sb.append(", ad_landing_page_auto_jump_allow_list=");
            sb.append(this.ad_landing_page_auto_jump_allow_list);
        }
        if (!this.ad_landing_page_auto_jump_intercept_list.isEmpty()) {
            sb.append(", ad_landing_page_auto_jump_intercept_list=");
            sb.append(this.ad_landing_page_auto_jump_intercept_list);
        }
        if (this.ad_landing_page_click_jump_interval != null) {
            sb.append(", ad_landing_page_click_jump_interval=");
            sb.append(this.ad_landing_page_click_jump_interval);
        }
        if (this.ad_landing_page_click_jump_interval_tips != null) {
            sb.append(", ad_landing_page_click_jump_interval_tips=");
            sb.append(this.ad_landing_page_click_jump_interval_tips);
        }
        if (this.enable_dynamic_navbar != null) {
            sb.append(", enable_dynamic_navbar=");
            sb.append(this.enable_dynamic_navbar);
        }
        if (!this.ad_landing_page_pause_list.isEmpty()) {
            sb.append(", ad_landing_page_pause_list=");
            sb.append(this.ad_landing_page_pause_list);
        }
        if (!this.ad_landing_page_preload_common_channel.isEmpty()) {
            sb.append(", ad_landing_page_preload_common_channel=");
            sb.append(this.ad_landing_page_preload_common_channel);
        }
        if (!this.ad_landing_page_preload_common_prefix.isEmpty()) {
            sb.append(", ad_landing_page_preload_common_prefix=");
            sb.append(this.ad_landing_page_preload_common_prefix);
        }
        if (this.ad_landing_page_preload_cache_count != null) {
            sb.append(", ad_landing_page_preload_cache_count=");
            sb.append(this.ad_landing_page_preload_cache_count);
        }
        StringBuilder replace = sb.replace(0, 2, "AdLandingPageConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47646, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47646, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof AdLandingPageConfig)) {
                return false;
            }
            AdLandingPageConfig adLandingPageConfig = (AdLandingPageConfig) obj;
            if (!unknownFields().equals(adLandingPageConfig.unknownFields()) || !Internal.equals(this.ad_landing_page_auto_jump_control_enabled, adLandingPageConfig.ad_landing_page_auto_jump_control_enabled) || !Internal.equals(this.ad_landing_page_click_jump_control_enabled, adLandingPageConfig.ad_landing_page_click_jump_control_enabled) || !this.ad_landing_page_auto_jump_allow_list.equals(adLandingPageConfig.ad_landing_page_auto_jump_allow_list) || !this.ad_landing_page_auto_jump_intercept_list.equals(adLandingPageConfig.ad_landing_page_auto_jump_intercept_list) || !Internal.equals(this.ad_landing_page_click_jump_interval, adLandingPageConfig.ad_landing_page_click_jump_interval) || !Internal.equals(this.ad_landing_page_click_jump_interval_tips, adLandingPageConfig.ad_landing_page_click_jump_interval_tips) || !Internal.equals(this.enable_dynamic_navbar, adLandingPageConfig.enable_dynamic_navbar) || !this.ad_landing_page_pause_list.equals(adLandingPageConfig.ad_landing_page_pause_list) || !this.ad_landing_page_preload_common_channel.equals(adLandingPageConfig.ad_landing_page_preload_common_channel) || !this.ad_landing_page_preload_common_prefix.equals(adLandingPageConfig.ad_landing_page_preload_common_prefix) || !Internal.equals(this.ad_landing_page_preload_cache_count, adLandingPageConfig.ad_landing_page_preload_cache_count)) {
                return false;
            }
            return true;
        }
    }

    public AdLandingPageConfig(Boolean bool, Boolean bool2, List<String> list, List<String> list2, Integer num, String str, Boolean bool3, List<String> list3, List<String> list4, List<String> list5, Integer num2) {
        this(bool, bool2, list, list2, num, str, bool3, list3, list4, list5, num2, ByteString.EMPTY);
    }

    public AdLandingPageConfig(Boolean bool, Boolean bool2, List<String> list, List<String> list2, Integer num, String str, Boolean bool3, List<String> list3, List<String> list4, List<String> list5, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ad_landing_page_auto_jump_control_enabled = bool;
        this.ad_landing_page_click_jump_control_enabled = bool2;
        this.ad_landing_page_auto_jump_allow_list = Internal.immutableCopyOf("ad_landing_page_auto_jump_allow_list", list);
        this.ad_landing_page_auto_jump_intercept_list = Internal.immutableCopyOf("ad_landing_page_auto_jump_intercept_list", list2);
        this.ad_landing_page_click_jump_interval = num;
        this.ad_landing_page_click_jump_interval_tips = str;
        this.enable_dynamic_navbar = bool3;
        this.ad_landing_page_pause_list = Internal.immutableCopyOf("ad_landing_page_pause_list", list3);
        this.ad_landing_page_preload_common_channel = Internal.immutableCopyOf("ad_landing_page_preload_common_channel", list4);
        this.ad_landing_page_preload_common_prefix = Internal.immutableCopyOf("ad_landing_page_preload_common_prefix", list5);
        this.ad_landing_page_preload_cache_count = num2;
    }
}
