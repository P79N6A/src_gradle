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

public final class UgAwemeActivitySetting extends Message<UgAwemeActivitySetting, Builder> {
    public static final DefaultValueProtoAdapter<UgAwemeActivitySetting> ADAPTER = new ProtoAdapter_UgAwemeActivitySetting();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long activity_end_time;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String activity_id;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long activity_start_time;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UgActivityTasks#ADAPTER", label = 2, tag = 10)
    public final List<UgActivityTasks> activity_tasks;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup#ADAPTER", tag = 7)
    public final UgChannelPopup channel_popup;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 5)
    public final Boolean is_new_user;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UgLoginBanner#ADAPTER", tag = 8)
    public final UgLoginBanner login_banner;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant#ADAPTER", tag = 6)
    public final UgNewFeedPendant new_feed_pendant;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 4)
    public final Boolean overall_switch;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileTabGuide#ADAPTER", tag = 9)
    public final UgProfileTabGuide profile_tab_guide;

    public static final class Builder extends Message.Builder<UgAwemeActivitySetting, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Long activity_end_time;
        public String activity_id;
        public Long activity_start_time;
        public List<UgActivityTasks> activity_tasks = Internal.newMutableList();
        public UgChannelPopup channel_popup;
        public Boolean is_new_user;
        public UgLoginBanner login_banner;
        public UgNewFeedPendant new_feed_pendant;
        public Boolean overall_switch;
        public UgProfileTabGuide profile_tab_guide;

        public final UgAwemeActivitySetting build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49231, new Class[0], UgAwemeActivitySetting.class)) {
                return (UgAwemeActivitySetting) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49231, new Class[0], UgAwemeActivitySetting.class);
            }
            UgAwemeActivitySetting ugAwemeActivitySetting = new UgAwemeActivitySetting(this.activity_id, this.activity_start_time, this.activity_end_time, this.overall_switch, this.is_new_user, this.new_feed_pendant, this.channel_popup, this.login_banner, this.profile_tab_guide, this.activity_tasks, super.buildUnknownFields());
            return ugAwemeActivitySetting;
        }

        public final Builder activity_end_time(Long l) {
            this.activity_end_time = l;
            return this;
        }

        public final Builder activity_id(String str) {
            this.activity_id = str;
            return this;
        }

        public final Builder activity_start_time(Long l) {
            this.activity_start_time = l;
            return this;
        }

        public final Builder channel_popup(UgChannelPopup ugChannelPopup) {
            this.channel_popup = ugChannelPopup;
            return this;
        }

        public final Builder is_new_user(Boolean bool) {
            this.is_new_user = bool;
            return this;
        }

        public final Builder login_banner(UgLoginBanner ugLoginBanner) {
            this.login_banner = ugLoginBanner;
            return this;
        }

        public final Builder new_feed_pendant(UgNewFeedPendant ugNewFeedPendant) {
            this.new_feed_pendant = ugNewFeedPendant;
            return this;
        }

        public final Builder overall_switch(Boolean bool) {
            this.overall_switch = bool;
            return this;
        }

        public final Builder profile_tab_guide(UgProfileTabGuide ugProfileTabGuide) {
            this.profile_tab_guide = ugProfileTabGuide;
            return this;
        }

        public final Builder activity_tasks(List<UgActivityTasks> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 49230, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 49230, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.activity_tasks = list;
            return this;
        }
    }

    static final class ProtoAdapter_UgAwemeActivitySetting extends DefaultValueProtoAdapter<UgAwemeActivitySetting> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final UgAwemeActivitySetting redact(UgAwemeActivitySetting ugAwemeActivitySetting) {
            return ugAwemeActivitySetting;
        }

        public ProtoAdapter_UgAwemeActivitySetting() {
            super(FieldEncoding.LENGTH_DELIMITED, UgAwemeActivitySetting.class);
        }

        public final UgAwemeActivitySetting decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49234, new Class[]{ProtoReader.class}, UgAwemeActivitySetting.class)) {
                return decode(protoReader2, (UgAwemeActivitySetting) null);
            }
            return (UgAwemeActivitySetting) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49234, new Class[]{ProtoReader.class}, UgAwemeActivitySetting.class);
        }

        public final int encodedSize(UgAwemeActivitySetting ugAwemeActivitySetting) {
            UgAwemeActivitySetting ugAwemeActivitySetting2 = ugAwemeActivitySetting;
            if (!PatchProxy.isSupport(new Object[]{ugAwemeActivitySetting2}, this, changeQuickRedirect, false, 49232, new Class[]{UgAwemeActivitySetting.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, ugAwemeActivitySetting2.activity_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, ugAwemeActivitySetting2.activity_start_time) + ProtoAdapter.INT64.encodedSizeWithTag(3, ugAwemeActivitySetting2.activity_end_time) + ProtoAdapter.BOOL.encodedSizeWithTag(4, ugAwemeActivitySetting2.overall_switch) + ProtoAdapter.BOOL.encodedSizeWithTag(5, ugAwemeActivitySetting2.is_new_user) + UgNewFeedPendant.ADAPTER.encodedSizeWithTag(6, ugAwemeActivitySetting2.new_feed_pendant) + UgChannelPopup.ADAPTER.encodedSizeWithTag(7, ugAwemeActivitySetting2.channel_popup) + UgLoginBanner.ADAPTER.encodedSizeWithTag(8, ugAwemeActivitySetting2.login_banner) + UgProfileTabGuide.ADAPTER.encodedSizeWithTag(9, ugAwemeActivitySetting2.profile_tab_guide) + UgActivityTasks.ADAPTER.asRepeated().encodedSizeWithTag(10, ugAwemeActivitySetting2.activity_tasks) + ugAwemeActivitySetting.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{ugAwemeActivitySetting2}, this, changeQuickRedirect, false, 49232, new Class[]{UgAwemeActivitySetting.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, UgAwemeActivitySetting ugAwemeActivitySetting) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            UgAwemeActivitySetting ugAwemeActivitySetting2 = ugAwemeActivitySetting;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, ugAwemeActivitySetting2}, this, changeQuickRedirect, false, 49233, new Class[]{ProtoWriter.class, UgAwemeActivitySetting.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, ugAwemeActivitySetting2}, this, changeQuickRedirect, false, 49233, new Class[]{ProtoWriter.class, UgAwemeActivitySetting.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, ugAwemeActivitySetting2.activity_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, ugAwemeActivitySetting2.activity_start_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, ugAwemeActivitySetting2.activity_end_time);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 4, ugAwemeActivitySetting2.overall_switch);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 5, ugAwemeActivitySetting2.is_new_user);
            UgNewFeedPendant.ADAPTER.encodeWithTag(protoWriter2, 6, ugAwemeActivitySetting2.new_feed_pendant);
            UgChannelPopup.ADAPTER.encodeWithTag(protoWriter2, 7, ugAwemeActivitySetting2.channel_popup);
            UgLoginBanner.ADAPTER.encodeWithTag(protoWriter2, 8, ugAwemeActivitySetting2.login_banner);
            UgProfileTabGuide.ADAPTER.encodeWithTag(protoWriter2, 9, ugAwemeActivitySetting2.profile_tab_guide);
            UgActivityTasks.ADAPTER.asRepeated().encodeWithTag(protoWriter2, 10, ugAwemeActivitySetting2.activity_tasks);
            protoWriter2.writeBytes(ugAwemeActivitySetting.unknownFields());
        }

        public final UgAwemeActivitySetting decode(ProtoReader protoReader, UgAwemeActivitySetting ugAwemeActivitySetting) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            UgAwemeActivitySetting ugAwemeActivitySetting2 = ugAwemeActivitySetting;
            if (PatchProxy.isSupport(new Object[]{protoReader2, ugAwemeActivitySetting2}, this, changeQuickRedirect, false, 49235, new Class[]{ProtoReader.class, UgAwemeActivitySetting.class}, UgAwemeActivitySetting.class)) {
                return (UgAwemeActivitySetting) PatchProxy.accessDispatch(new Object[]{protoReader2, ugAwemeActivitySetting2}, this, changeQuickRedirect, false, 49235, new Class[]{ProtoReader.class, UgAwemeActivitySetting.class}, UgAwemeActivitySetting.class);
            }
            UgAwemeActivitySetting ugAwemeActivitySetting3 = (UgAwemeActivitySetting) a.a().a(UgAwemeActivitySetting.class, ugAwemeActivitySetting2);
            if (ugAwemeActivitySetting3 != null) {
                builder = ugAwemeActivitySetting3.newBuilder();
            } else {
                builder = new Builder();
            }
            Builder builder2 = builder;
            List<UgActivityTasks> newMutableList = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder2.activity_id((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 2:
                            builder2.activity_start_time((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 3:
                            builder2.activity_end_time((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 4:
                            builder2.overall_switch((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 5:
                            builder2.is_new_user((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 6:
                            builder2.new_feed_pendant((UgNewFeedPendant) UgNewFeedPendant.ADAPTER.decode(protoReader2, builder2.new_feed_pendant));
                            break;
                        case e.l:
                            builder2.channel_popup((UgChannelPopup) UgChannelPopup.ADAPTER.decode(protoReader2, builder2.channel_popup));
                            break;
                        case 8:
                            builder2.login_banner((UgLoginBanner) UgLoginBanner.ADAPTER.decode(protoReader2, builder2.login_banner));
                            break;
                        case 9:
                            builder2.profile_tab_guide((UgProfileTabGuide) UgProfileTabGuide.ADAPTER.decode(protoReader2, builder2.profile_tab_guide));
                            break;
                        case 10:
                            newMutableList.add(UgActivityTasks.ADAPTER.decode(protoReader2, a.a().a(UgActivityTasks.class)));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (ugAwemeActivitySetting3 != null) {
                                    break;
                                } else {
                                    throw e2;
                                }
                            }
                    }
                } else {
                    protoReader2.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder2.activity_tasks = newMutableList;
                    }
                    return builder2.build();
                }
            }
        }
    }

    public final List<UgActivityTasks> getActivityTasks() {
        return this.activity_tasks;
    }

    @KtNullable
    public final Long getActivityEndTime() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49219, new Class[0], Long.class)) {
            return (Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49219, new Class[0], Long.class);
        } else if (this.activity_end_time != null) {
            return this.activity_end_time;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getActivityId() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49217, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49217, new Class[0], String.class);
        } else if (this.activity_id != null) {
            return this.activity_id;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Long getActivityStartTime() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49218, new Class[0], Long.class)) {
            return (Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49218, new Class[0], Long.class);
        } else if (this.activity_start_time != null) {
            return this.activity_start_time;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final UgChannelPopup getChannelPopup() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49223, new Class[0], UgChannelPopup.class)) {
            return (UgChannelPopup) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49223, new Class[0], UgChannelPopup.class);
        } else if (this.channel_popup != null) {
            return this.channel_popup;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean getIsNewUser() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49221, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49221, new Class[0], Boolean.class);
        } else if (this.is_new_user != null) {
            return this.is_new_user;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final UgLoginBanner getLoginBanner() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49224, new Class[0], UgLoginBanner.class)) {
            return (UgLoginBanner) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49224, new Class[0], UgLoginBanner.class);
        } else if (this.login_banner != null) {
            return this.login_banner;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final UgNewFeedPendant getNewFeedPendant() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49222, new Class[0], UgNewFeedPendant.class)) {
            return (UgNewFeedPendant) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49222, new Class[0], UgNewFeedPendant.class);
        } else if (this.new_feed_pendant != null) {
            return this.new_feed_pendant;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean getOverallSwitch() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49220, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49220, new Class[0], Boolean.class);
        } else if (this.overall_switch != null) {
            return this.overall_switch;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final UgProfileTabGuide getProfileTabGuide() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49225, new Class[0], UgProfileTabGuide.class)) {
            return (UgProfileTabGuide) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49225, new Class[0], UgProfileTabGuide.class);
        } else if (this.profile_tab_guide != null) {
            return this.profile_tab_guide;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49226, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49226, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.activity_id = this.activity_id;
        builder.activity_start_time = this.activity_start_time;
        builder.activity_end_time = this.activity_end_time;
        builder.overall_switch = this.overall_switch;
        builder.is_new_user = this.is_new_user;
        builder.new_feed_pendant = this.new_feed_pendant;
        builder.channel_popup = this.channel_popup;
        builder.login_banner = this.login_banner;
        builder.profile_tab_guide = this.profile_tab_guide;
        builder.activity_tasks = Internal.copyOf("activity_tasks", this.activity_tasks);
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49228, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49228, new Class[0], Integer.TYPE)).intValue();
        }
        int i10 = this.hashCode;
        if (i10 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.activity_id != null) {
                i = this.activity_id.hashCode();
            } else {
                i = 0;
            }
            int i11 = (hashCode + i) * 37;
            if (this.activity_start_time != null) {
                i2 = this.activity_start_time.hashCode();
            } else {
                i2 = 0;
            }
            int i12 = (i11 + i2) * 37;
            if (this.activity_end_time != null) {
                i3 = this.activity_end_time.hashCode();
            } else {
                i3 = 0;
            }
            int i13 = (i12 + i3) * 37;
            if (this.overall_switch != null) {
                i4 = this.overall_switch.hashCode();
            } else {
                i4 = 0;
            }
            int i14 = (i13 + i4) * 37;
            if (this.is_new_user != null) {
                i5 = this.is_new_user.hashCode();
            } else {
                i5 = 0;
            }
            int i15 = (i14 + i5) * 37;
            if (this.new_feed_pendant != null) {
                i6 = this.new_feed_pendant.hashCode();
            } else {
                i6 = 0;
            }
            int i16 = (i15 + i6) * 37;
            if (this.channel_popup != null) {
                i7 = this.channel_popup.hashCode();
            } else {
                i7 = 0;
            }
            int i17 = (i16 + i7) * 37;
            if (this.login_banner != null) {
                i8 = this.login_banner.hashCode();
            } else {
                i8 = 0;
            }
            int i18 = (i17 + i8) * 37;
            if (this.profile_tab_guide != null) {
                i9 = this.profile_tab_guide.hashCode();
            }
            i10 = ((i18 + i9) * 37) + this.activity_tasks.hashCode();
            this.hashCode = i10;
        }
        return i10;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49229, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49229, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.activity_id != null) {
            sb.append(", activity_id=");
            sb.append(this.activity_id);
        }
        if (this.activity_start_time != null) {
            sb.append(", activity_start_time=");
            sb.append(this.activity_start_time);
        }
        if (this.activity_end_time != null) {
            sb.append(", activity_end_time=");
            sb.append(this.activity_end_time);
        }
        if (this.overall_switch != null) {
            sb.append(", overall_switch=");
            sb.append(this.overall_switch);
        }
        if (this.is_new_user != null) {
            sb.append(", is_new_user=");
            sb.append(this.is_new_user);
        }
        if (this.new_feed_pendant != null) {
            sb.append(", new_feed_pendant=");
            sb.append(this.new_feed_pendant);
        }
        if (this.channel_popup != null) {
            sb.append(", channel_popup=");
            sb.append(this.channel_popup);
        }
        if (this.login_banner != null) {
            sb.append(", login_banner=");
            sb.append(this.login_banner);
        }
        if (this.profile_tab_guide != null) {
            sb.append(", profile_tab_guide=");
            sb.append(this.profile_tab_guide);
        }
        if (!this.activity_tasks.isEmpty()) {
            sb.append(", activity_tasks=");
            sb.append(this.activity_tasks);
        }
        StringBuilder replace = sb.replace(0, 2, "UgAwemeActivitySetting{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49227, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49227, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof UgAwemeActivitySetting)) {
                return false;
            }
            UgAwemeActivitySetting ugAwemeActivitySetting = (UgAwemeActivitySetting) obj;
            if (!unknownFields().equals(ugAwemeActivitySetting.unknownFields()) || !Internal.equals(this.activity_id, ugAwemeActivitySetting.activity_id) || !Internal.equals(this.activity_start_time, ugAwemeActivitySetting.activity_start_time) || !Internal.equals(this.activity_end_time, ugAwemeActivitySetting.activity_end_time) || !Internal.equals(this.overall_switch, ugAwemeActivitySetting.overall_switch) || !Internal.equals(this.is_new_user, ugAwemeActivitySetting.is_new_user) || !Internal.equals(this.new_feed_pendant, ugAwemeActivitySetting.new_feed_pendant) || !Internal.equals(this.channel_popup, ugAwemeActivitySetting.channel_popup) || !Internal.equals(this.login_banner, ugAwemeActivitySetting.login_banner) || !Internal.equals(this.profile_tab_guide, ugAwemeActivitySetting.profile_tab_guide) || !this.activity_tasks.equals(ugAwemeActivitySetting.activity_tasks)) {
                return false;
            }
            return true;
        }
    }

    public UgAwemeActivitySetting(String str, Long l, Long l2, Boolean bool, Boolean bool2, UgNewFeedPendant ugNewFeedPendant, UgChannelPopup ugChannelPopup, UgLoginBanner ugLoginBanner, UgProfileTabGuide ugProfileTabGuide, List<UgActivityTasks> list) {
        this(str, l, l2, bool, bool2, ugNewFeedPendant, ugChannelPopup, ugLoginBanner, ugProfileTabGuide, list, ByteString.EMPTY);
    }

    public UgAwemeActivitySetting(String str, Long l, Long l2, Boolean bool, Boolean bool2, UgNewFeedPendant ugNewFeedPendant, UgChannelPopup ugChannelPopup, UgLoginBanner ugLoginBanner, UgProfileTabGuide ugProfileTabGuide, List<UgActivityTasks> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.activity_id = str;
        this.activity_start_time = l;
        this.activity_end_time = l2;
        this.overall_switch = bool;
        this.is_new_user = bool2;
        this.new_feed_pendant = ugNewFeedPendant;
        this.channel_popup = ugChannelPopup;
        this.login_banner = ugLoginBanner;
        this.profile_tab_guide = ugProfileTabGuide;
        this.activity_tasks = Internal.immutableCopyOf("activity_tasks", list);
    }
}
