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
import java.io.IOException;
import okio.ByteString;

public final class LiveLabelDisplaySettings extends Message<LiveLabelDisplaySettings, Builder> {
    public static final DefaultValueProtoAdapter<LiveLabelDisplaySettings> ADAPTER = new ProtoAdapter_LiveLabelDisplaySettings();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long display_duration;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long display_intervals;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer most_display_times;

    public static final class Builder extends Message.Builder<LiveLabelDisplaySettings, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Long display_duration;
        public Long display_intervals;
        public Integer most_display_times;

        public final LiveLabelDisplaySettings build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48911, new Class[0], LiveLabelDisplaySettings.class)) {
                return new LiveLabelDisplaySettings(this.most_display_times, this.display_duration, this.display_intervals, super.buildUnknownFields());
            }
            return (LiveLabelDisplaySettings) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48911, new Class[0], LiveLabelDisplaySettings.class);
        }

        public final Builder display_duration(Long l) {
            this.display_duration = l;
            return this;
        }

        public final Builder display_intervals(Long l) {
            this.display_intervals = l;
            return this;
        }

        public final Builder most_display_times(Integer num) {
            this.most_display_times = num;
            return this;
        }
    }

    static final class ProtoAdapter_LiveLabelDisplaySettings extends DefaultValueProtoAdapter<LiveLabelDisplaySettings> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final LiveLabelDisplaySettings redact(LiveLabelDisplaySettings liveLabelDisplaySettings) {
            return liveLabelDisplaySettings;
        }

        public ProtoAdapter_LiveLabelDisplaySettings() {
            super(FieldEncoding.LENGTH_DELIMITED, LiveLabelDisplaySettings.class);
        }

        public final LiveLabelDisplaySettings decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48914, new Class[]{ProtoReader.class}, LiveLabelDisplaySettings.class)) {
                return decode(protoReader2, (LiveLabelDisplaySettings) null);
            }
            return (LiveLabelDisplaySettings) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48914, new Class[]{ProtoReader.class}, LiveLabelDisplaySettings.class);
        }

        public final int encodedSize(LiveLabelDisplaySettings liveLabelDisplaySettings) {
            LiveLabelDisplaySettings liveLabelDisplaySettings2 = liveLabelDisplaySettings;
            if (!PatchProxy.isSupport(new Object[]{liveLabelDisplaySettings2}, this, changeQuickRedirect, false, 48912, new Class[]{LiveLabelDisplaySettings.class}, Integer.TYPE)) {
                return ProtoAdapter.INT32.encodedSizeWithTag(1, liveLabelDisplaySettings2.most_display_times) + ProtoAdapter.INT64.encodedSizeWithTag(2, liveLabelDisplaySettings2.display_duration) + ProtoAdapter.INT64.encodedSizeWithTag(3, liveLabelDisplaySettings2.display_intervals) + liveLabelDisplaySettings.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{liveLabelDisplaySettings2}, this, changeQuickRedirect, false, 48912, new Class[]{LiveLabelDisplaySettings.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, LiveLabelDisplaySettings liveLabelDisplaySettings) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            LiveLabelDisplaySettings liveLabelDisplaySettings2 = liveLabelDisplaySettings;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, liveLabelDisplaySettings2}, this, changeQuickRedirect, false, 48913, new Class[]{ProtoWriter.class, LiveLabelDisplaySettings.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, liveLabelDisplaySettings2}, this, changeQuickRedirect, false, 48913, new Class[]{ProtoWriter.class, LiveLabelDisplaySettings.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 1, liveLabelDisplaySettings2.most_display_times);
            ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, liveLabelDisplaySettings2.display_duration);
            ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, liveLabelDisplaySettings2.display_intervals);
            protoWriter2.writeBytes(liveLabelDisplaySettings.unknownFields());
        }

        public final LiveLabelDisplaySettings decode(ProtoReader protoReader, LiveLabelDisplaySettings liveLabelDisplaySettings) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            LiveLabelDisplaySettings liveLabelDisplaySettings2 = liveLabelDisplaySettings;
            if (PatchProxy.isSupport(new Object[]{protoReader2, liveLabelDisplaySettings2}, this, changeQuickRedirect, false, 48915, new Class[]{ProtoReader.class, LiveLabelDisplaySettings.class}, LiveLabelDisplaySettings.class)) {
                return (LiveLabelDisplaySettings) PatchProxy.accessDispatch(new Object[]{protoReader2, liveLabelDisplaySettings2}, this, changeQuickRedirect, false, 48915, new Class[]{ProtoReader.class, LiveLabelDisplaySettings.class}, LiveLabelDisplaySettings.class);
            }
            LiveLabelDisplaySettings liveLabelDisplaySettings3 = (LiveLabelDisplaySettings) a.a().a(LiveLabelDisplaySettings.class, liveLabelDisplaySettings2);
            if (liveLabelDisplaySettings3 != null) {
                builder = liveLabelDisplaySettings3.newBuilder();
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
                            builder2.most_display_times((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 2:
                            builder2.display_duration((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 3:
                            builder2.display_intervals((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (liveLabelDisplaySettings3 != null) {
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
    public final Long getDisplayDuration() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48905, new Class[0], Long.class)) {
            return (Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48905, new Class[0], Long.class);
        } else if (this.display_duration != null) {
            return this.display_duration;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Long getDisplayIntervals() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48906, new Class[0], Long.class)) {
            return (Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48906, new Class[0], Long.class);
        } else if (this.display_intervals != null) {
            return this.display_intervals;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getMostDisplayTimes() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48904, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48904, new Class[0], Integer.class);
        } else if (this.most_display_times != null) {
            return this.most_display_times;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48909, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48909, new Class[0], Integer.TYPE)).intValue();
        }
        int i4 = this.hashCode;
        if (i4 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.most_display_times != null) {
                i = this.most_display_times.hashCode();
            } else {
                i = 0;
            }
            int i5 = (hashCode + i) * 37;
            if (this.display_duration != null) {
                i2 = this.display_duration.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 37;
            if (this.display_intervals != null) {
                i3 = this.display_intervals.hashCode();
            }
            i4 = i6 + i3;
            this.hashCode = i4;
        }
        return i4;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48907, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48907, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.most_display_times = this.most_display_times;
        builder.display_duration = this.display_duration;
        builder.display_intervals = this.display_intervals;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48910, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48910, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.most_display_times != null) {
            sb.append(", most_display_times=");
            sb.append(this.most_display_times);
        }
        if (this.display_duration != null) {
            sb.append(", display_duration=");
            sb.append(this.display_duration);
        }
        if (this.display_intervals != null) {
            sb.append(", display_intervals=");
            sb.append(this.display_intervals);
        }
        StringBuilder replace = sb.replace(0, 2, "LiveLabelDisplaySettings{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 48908, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 48908, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof LiveLabelDisplaySettings)) {
                return false;
            }
            LiveLabelDisplaySettings liveLabelDisplaySettings = (LiveLabelDisplaySettings) obj;
            if (!unknownFields().equals(liveLabelDisplaySettings.unknownFields()) || !Internal.equals(this.most_display_times, liveLabelDisplaySettings.most_display_times) || !Internal.equals(this.display_duration, liveLabelDisplaySettings.display_duration) || !Internal.equals(this.display_intervals, liveLabelDisplaySettings.display_intervals)) {
                return false;
            }
            return true;
        }
    }

    public LiveLabelDisplaySettings(Integer num, Long l, Long l2) {
        this(num, l, l2, ByteString.EMPTY);
    }

    public LiveLabelDisplaySettings(Integer num, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.most_display_times = num;
        this.display_duration = l;
        this.display_intervals = l2;
    }
}
