package com.ss.android.ugc.aweme.global.config.settings.pojo;

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
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.io.IOException;
import okio.ByteString;

public final class NewAnchorShowBubbleSettings extends Message<NewAnchorShowBubbleSettings, Builder> {
    public static final DefaultValueProtoAdapter<NewAnchorShowBubbleSettings> ADAPTER = new ProtoAdapter_NewAnchorShowBubbleSettings();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 0, tag = 7)
    public final String activity_bubble_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 0, tag = 4)
    public final String bubble_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = 0, tag = 1)
    public final Integer daily_trigger_times;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = 0, tag = 5)
    public final Boolean force_trigger;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = 0, tag = 2)
    public final Integer lifecycle_trigger_times;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = 0, tag = 6)
    public final Boolean new_anchor_show_bubble;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = 0, tag = 3)
    public final Integer trigger_interval_minute;

    public static final class Builder extends Message.Builder<NewAnchorShowBubbleSettings, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String activity_bubble_url = "";
        public String bubble_url = "";
        public Integer daily_trigger_times = 1;
        public Boolean force_trigger = Boolean.FALSE;
        public Integer lifecycle_trigger_times = 1;
        public Boolean new_anchor_show_bubble = Boolean.FALSE;
        public Integer trigger_interval_minute = 1440;

        public final NewAnchorShowBubbleSettings build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48952, new Class[0], NewAnchorShowBubbleSettings.class)) {
                return (NewAnchorShowBubbleSettings) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48952, new Class[0], NewAnchorShowBubbleSettings.class);
            } else if (this.daily_trigger_times == null || this.lifecycle_trigger_times == null || this.trigger_interval_minute == null || this.bubble_url == null || this.force_trigger == null || this.new_anchor_show_bubble == null || this.activity_bubble_url == null) {
                throw c.a(this.daily_trigger_times, "daily_trigger_times", this.lifecycle_trigger_times, "lifecycle_trigger_times", this.trigger_interval_minute, "trigger_interval_minute", this.bubble_url, "bubble_url", this.force_trigger, "force_trigger", this.new_anchor_show_bubble, "new_anchor_show_bubble", this.activity_bubble_url, "activity_bubble_url");
            } else {
                NewAnchorShowBubbleSettings newAnchorShowBubbleSettings = new NewAnchorShowBubbleSettings(this.daily_trigger_times, this.lifecycle_trigger_times, this.trigger_interval_minute, this.bubble_url, this.force_trigger, this.new_anchor_show_bubble, this.activity_bubble_url, super.buildUnknownFields());
                return newAnchorShowBubbleSettings;
            }
        }

        public final Builder activity_bubble_url(String str) {
            this.activity_bubble_url = str;
            return this;
        }

        public final Builder bubble_url(String str) {
            this.bubble_url = str;
            return this;
        }

        public final Builder daily_trigger_times(Integer num) {
            this.daily_trigger_times = num;
            return this;
        }

        public final Builder force_trigger(Boolean bool) {
            this.force_trigger = bool;
            return this;
        }

        public final Builder lifecycle_trigger_times(Integer num) {
            this.lifecycle_trigger_times = num;
            return this;
        }

        public final Builder new_anchor_show_bubble(Boolean bool) {
            this.new_anchor_show_bubble = bool;
            return this;
        }

        public final Builder trigger_interval_minute(Integer num) {
            this.trigger_interval_minute = num;
            return this;
        }
    }

    static final class ProtoAdapter_NewAnchorShowBubbleSettings extends DefaultValueProtoAdapter<NewAnchorShowBubbleSettings> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final NewAnchorShowBubbleSettings redact(NewAnchorShowBubbleSettings newAnchorShowBubbleSettings) {
            return newAnchorShowBubbleSettings;
        }

        public ProtoAdapter_NewAnchorShowBubbleSettings() {
            super(FieldEncoding.LENGTH_DELIMITED, NewAnchorShowBubbleSettings.class);
        }

        public final NewAnchorShowBubbleSettings decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48955, new Class[]{ProtoReader.class}, NewAnchorShowBubbleSettings.class)) {
                return decode(protoReader2, (NewAnchorShowBubbleSettings) null);
            }
            return (NewAnchorShowBubbleSettings) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48955, new Class[]{ProtoReader.class}, NewAnchorShowBubbleSettings.class);
        }

        public final int encodedSize(NewAnchorShowBubbleSettings newAnchorShowBubbleSettings) {
            NewAnchorShowBubbleSettings newAnchorShowBubbleSettings2 = newAnchorShowBubbleSettings;
            if (!PatchProxy.isSupport(new Object[]{newAnchorShowBubbleSettings2}, this, changeQuickRedirect, false, 48953, new Class[]{NewAnchorShowBubbleSettings.class}, Integer.TYPE)) {
                return ProtoAdapter.INT32.encodedSizeWithTag(1, newAnchorShowBubbleSettings2.daily_trigger_times) + ProtoAdapter.INT32.encodedSizeWithTag(2, newAnchorShowBubbleSettings2.lifecycle_trigger_times) + ProtoAdapter.INT32.encodedSizeWithTag(3, newAnchorShowBubbleSettings2.trigger_interval_minute) + ProtoAdapter.STRING.encodedSizeWithTag(4, newAnchorShowBubbleSettings2.bubble_url) + ProtoAdapter.BOOL.encodedSizeWithTag(5, newAnchorShowBubbleSettings2.force_trigger) + ProtoAdapter.BOOL.encodedSizeWithTag(6, newAnchorShowBubbleSettings2.new_anchor_show_bubble) + ProtoAdapter.STRING.encodedSizeWithTag(7, newAnchorShowBubbleSettings2.activity_bubble_url) + newAnchorShowBubbleSettings.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{newAnchorShowBubbleSettings2}, this, changeQuickRedirect, false, 48953, new Class[]{NewAnchorShowBubbleSettings.class}, Integer.TYPE)).intValue();
        }

        public final NewAnchorShowBubbleSettings decode(ProtoReader protoReader, NewAnchorShowBubbleSettings newAnchorShowBubbleSettings) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            NewAnchorShowBubbleSettings newAnchorShowBubbleSettings2 = newAnchorShowBubbleSettings;
            if (PatchProxy.isSupport(new Object[]{protoReader2, newAnchorShowBubbleSettings2}, this, changeQuickRedirect, false, 48956, new Class[]{ProtoReader.class, NewAnchorShowBubbleSettings.class}, NewAnchorShowBubbleSettings.class)) {
                return (NewAnchorShowBubbleSettings) PatchProxy.accessDispatch(new Object[]{protoReader2, newAnchorShowBubbleSettings2}, this, changeQuickRedirect, false, 48956, new Class[]{ProtoReader.class, NewAnchorShowBubbleSettings.class}, NewAnchorShowBubbleSettings.class);
            }
            NewAnchorShowBubbleSettings newAnchorShowBubbleSettings3 = (NewAnchorShowBubbleSettings) a.a().a(NewAnchorShowBubbleSettings.class, newAnchorShowBubbleSettings2);
            if (newAnchorShowBubbleSettings3 != null) {
                builder = newAnchorShowBubbleSettings3.newBuilder();
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
                            builder2.daily_trigger_times((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 2:
                            builder2.lifecycle_trigger_times((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 3:
                            builder2.trigger_interval_minute((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 4:
                            builder2.bubble_url((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 5:
                            builder2.force_trigger((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 6:
                            builder2.new_anchor_show_bubble((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case e.l:
                            builder2.activity_bubble_url((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (newAnchorShowBubbleSettings3 != null) {
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

        public final void encode(ProtoWriter protoWriter, NewAnchorShowBubbleSettings newAnchorShowBubbleSettings) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            NewAnchorShowBubbleSettings newAnchorShowBubbleSettings2 = newAnchorShowBubbleSettings;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, newAnchorShowBubbleSettings2}, this, changeQuickRedirect, false, 48954, new Class[]{ProtoWriter.class, NewAnchorShowBubbleSettings.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, newAnchorShowBubbleSettings2}, this, changeQuickRedirect, false, 48954, new Class[]{ProtoWriter.class, NewAnchorShowBubbleSettings.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 1, newAnchorShowBubbleSettings2.daily_trigger_times);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 2, newAnchorShowBubbleSettings2.lifecycle_trigger_times);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 3, newAnchorShowBubbleSettings2.trigger_interval_minute);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, newAnchorShowBubbleSettings2.bubble_url);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 5, newAnchorShowBubbleSettings2.force_trigger);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 6, newAnchorShowBubbleSettings2.new_anchor_show_bubble);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 7, newAnchorShowBubbleSettings2.activity_bubble_url);
            protoWriter2.writeBytes(newAnchorShowBubbleSettings.unknownFields());
        }
    }

    public final String getActivityBubbleUrl() {
        return this.activity_bubble_url;
    }

    public final String getBubbleUrl() {
        return this.bubble_url;
    }

    public final Integer getDailyTriggerTimes() {
        return this.daily_trigger_times;
    }

    public final Boolean getForceTrigger() {
        return this.force_trigger;
    }

    public final Integer getLifecycleTriggerTimes() {
        return this.lifecycle_trigger_times;
    }

    public final Boolean getNewAnchorShowBubble() {
        return this.new_anchor_show_bubble;
    }

    public final Integer getTriggerIntervalMinute() {
        return this.trigger_interval_minute;
    }

    public final int hashCode() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48950, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48950, new Class[0], Integer.TYPE)).intValue();
        }
        int i = this.hashCode;
        if (i == 0) {
            i = (((((((((((((unknownFields().hashCode() * 37) + this.daily_trigger_times.hashCode()) * 37) + this.lifecycle_trigger_times.hashCode()) * 37) + this.trigger_interval_minute.hashCode()) * 37) + this.bubble_url.hashCode()) * 37) + this.force_trigger.hashCode()) * 37) + this.new_anchor_show_bubble.hashCode()) * 37) + this.activity_bubble_url.hashCode();
            this.hashCode = i;
        }
        return i;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48948, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48948, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.daily_trigger_times = this.daily_trigger_times;
        builder.lifecycle_trigger_times = this.lifecycle_trigger_times;
        builder.trigger_interval_minute = this.trigger_interval_minute;
        builder.bubble_url = this.bubble_url;
        builder.force_trigger = this.force_trigger;
        builder.new_anchor_show_bubble = this.new_anchor_show_bubble;
        builder.activity_bubble_url = this.activity_bubble_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48951, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48951, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(", daily_trigger_times=");
        sb.append(this.daily_trigger_times);
        sb.append(", lifecycle_trigger_times=");
        sb.append(this.lifecycle_trigger_times);
        sb.append(", trigger_interval_minute=");
        sb.append(this.trigger_interval_minute);
        sb.append(", bubble_url=");
        sb.append(this.bubble_url);
        sb.append(", force_trigger=");
        sb.append(this.force_trigger);
        sb.append(", new_anchor_show_bubble=");
        sb.append(this.new_anchor_show_bubble);
        sb.append(", activity_bubble_url=");
        sb.append(this.activity_bubble_url);
        StringBuilder replace = sb.replace(0, 2, "NewAnchorShowBubbleSettings{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 48949, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 48949, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof NewAnchorShowBubbleSettings)) {
                return false;
            }
            NewAnchorShowBubbleSettings newAnchorShowBubbleSettings = (NewAnchorShowBubbleSettings) obj;
            if (!unknownFields().equals(newAnchorShowBubbleSettings.unknownFields()) || !this.daily_trigger_times.equals(newAnchorShowBubbleSettings.daily_trigger_times) || !this.lifecycle_trigger_times.equals(newAnchorShowBubbleSettings.lifecycle_trigger_times) || !this.trigger_interval_minute.equals(newAnchorShowBubbleSettings.trigger_interval_minute) || !this.bubble_url.equals(newAnchorShowBubbleSettings.bubble_url) || !this.force_trigger.equals(newAnchorShowBubbleSettings.force_trigger) || !this.new_anchor_show_bubble.equals(newAnchorShowBubbleSettings.new_anchor_show_bubble) || !this.activity_bubble_url.equals(newAnchorShowBubbleSettings.activity_bubble_url)) {
                return false;
            }
            return true;
        }
    }

    public NewAnchorShowBubbleSettings(Integer num, Integer num2, Integer num3, String str, Boolean bool, Boolean bool2, String str2) {
        this(num, num2, num3, str, bool, bool2, str2, ByteString.EMPTY);
    }

    public NewAnchorShowBubbleSettings(Integer num, Integer num2, Integer num3, String str, Boolean bool, Boolean bool2, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.daily_trigger_times = num;
        this.lifecycle_trigger_times = num2;
        this.trigger_interval_minute = num3;
        this.bubble_url = str;
        this.force_trigger = bool;
        this.new_anchor_show_bubble = bool2;
        this.activity_bubble_url = str2;
    }
}
