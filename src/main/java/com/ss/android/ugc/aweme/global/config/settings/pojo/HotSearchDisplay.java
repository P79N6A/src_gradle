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

public final class HotSearchDisplay extends Message<HotSearchDisplay, Builder> {
    public static final DefaultValueProtoAdapter<HotSearchDisplay> ADAPTER = new ProtoAdapter_HotSearchDisplay();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer most_display_times;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long one_display_intervals;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer op_most_display_times;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long op_one_display_intervals;

    public static final class Builder extends Message.Builder<HotSearchDisplay, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Integer most_display_times;
        public Long one_display_intervals;
        public Integer op_most_display_times;
        public Long op_one_display_intervals;

        public final HotSearchDisplay build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48014, new Class[0], HotSearchDisplay.class)) {
                return (HotSearchDisplay) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48014, new Class[0], HotSearchDisplay.class);
            }
            HotSearchDisplay hotSearchDisplay = new HotSearchDisplay(this.most_display_times, this.one_display_intervals, this.op_most_display_times, this.op_one_display_intervals, super.buildUnknownFields());
            return hotSearchDisplay;
        }

        public final Builder most_display_times(Integer num) {
            this.most_display_times = num;
            return this;
        }

        public final Builder one_display_intervals(Long l) {
            this.one_display_intervals = l;
            return this;
        }

        public final Builder op_most_display_times(Integer num) {
            this.op_most_display_times = num;
            return this;
        }

        public final Builder op_one_display_intervals(Long l) {
            this.op_one_display_intervals = l;
            return this;
        }
    }

    static final class ProtoAdapter_HotSearchDisplay extends DefaultValueProtoAdapter<HotSearchDisplay> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final HotSearchDisplay redact(HotSearchDisplay hotSearchDisplay) {
            return hotSearchDisplay;
        }

        public ProtoAdapter_HotSearchDisplay() {
            super(FieldEncoding.LENGTH_DELIMITED, HotSearchDisplay.class);
        }

        public final HotSearchDisplay decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48017, new Class[]{ProtoReader.class}, HotSearchDisplay.class)) {
                return decode(protoReader2, (HotSearchDisplay) null);
            }
            return (HotSearchDisplay) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48017, new Class[]{ProtoReader.class}, HotSearchDisplay.class);
        }

        public final int encodedSize(HotSearchDisplay hotSearchDisplay) {
            HotSearchDisplay hotSearchDisplay2 = hotSearchDisplay;
            if (!PatchProxy.isSupport(new Object[]{hotSearchDisplay2}, this, changeQuickRedirect, false, 48015, new Class[]{HotSearchDisplay.class}, Integer.TYPE)) {
                return ProtoAdapter.INT32.encodedSizeWithTag(1, hotSearchDisplay2.most_display_times) + ProtoAdapter.INT64.encodedSizeWithTag(2, hotSearchDisplay2.one_display_intervals) + ProtoAdapter.INT32.encodedSizeWithTag(3, hotSearchDisplay2.op_most_display_times) + ProtoAdapter.INT64.encodedSizeWithTag(4, hotSearchDisplay2.op_one_display_intervals) + hotSearchDisplay.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{hotSearchDisplay2}, this, changeQuickRedirect, false, 48015, new Class[]{HotSearchDisplay.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, HotSearchDisplay hotSearchDisplay) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            HotSearchDisplay hotSearchDisplay2 = hotSearchDisplay;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, hotSearchDisplay2}, this, changeQuickRedirect, false, 48016, new Class[]{ProtoWriter.class, HotSearchDisplay.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, hotSearchDisplay2}, this, changeQuickRedirect, false, 48016, new Class[]{ProtoWriter.class, HotSearchDisplay.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 1, hotSearchDisplay2.most_display_times);
            ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, hotSearchDisplay2.one_display_intervals);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 3, hotSearchDisplay2.op_most_display_times);
            ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, hotSearchDisplay2.op_one_display_intervals);
            protoWriter2.writeBytes(hotSearchDisplay.unknownFields());
        }

        public final HotSearchDisplay decode(ProtoReader protoReader, HotSearchDisplay hotSearchDisplay) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            HotSearchDisplay hotSearchDisplay2 = hotSearchDisplay;
            if (PatchProxy.isSupport(new Object[]{protoReader2, hotSearchDisplay2}, this, changeQuickRedirect, false, 48018, new Class[]{ProtoReader.class, HotSearchDisplay.class}, HotSearchDisplay.class)) {
                return (HotSearchDisplay) PatchProxy.accessDispatch(new Object[]{protoReader2, hotSearchDisplay2}, this, changeQuickRedirect, false, 48018, new Class[]{ProtoReader.class, HotSearchDisplay.class}, HotSearchDisplay.class);
            }
            HotSearchDisplay hotSearchDisplay3 = (HotSearchDisplay) a.a().a(HotSearchDisplay.class, hotSearchDisplay2);
            if (hotSearchDisplay3 != null) {
                builder = hotSearchDisplay3.newBuilder();
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
                            builder2.one_display_intervals((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 3:
                            builder2.op_most_display_times((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 4:
                            builder2.op_one_display_intervals((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (hotSearchDisplay3 != null) {
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
    public final Integer getMostDisplayTimes() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48006, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48006, new Class[0], Integer.class);
        } else if (this.most_display_times != null) {
            return this.most_display_times;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Long getOneDisplayIntervals() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48007, new Class[0], Long.class)) {
            return (Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48007, new Class[0], Long.class);
        } else if (this.one_display_intervals != null) {
            return this.one_display_intervals;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getOpMostDisplayTimes() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48008, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48008, new Class[0], Integer.class);
        } else if (this.op_most_display_times != null) {
            return this.op_most_display_times;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Long getOpOneDisplayIntervals() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48009, new Class[0], Long.class)) {
            return (Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48009, new Class[0], Long.class);
        } else if (this.op_one_display_intervals != null) {
            return this.op_one_display_intervals;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48012, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48012, new Class[0], Integer.TYPE)).intValue();
        }
        int i5 = this.hashCode;
        if (i5 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.most_display_times != null) {
                i = this.most_display_times.hashCode();
            } else {
                i = 0;
            }
            int i6 = (hashCode + i) * 37;
            if (this.one_display_intervals != null) {
                i2 = this.one_display_intervals.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 37;
            if (this.op_most_display_times != null) {
                i3 = this.op_most_display_times.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 37;
            if (this.op_one_display_intervals != null) {
                i4 = this.op_one_display_intervals.hashCode();
            }
            i5 = i8 + i4;
            this.hashCode = i5;
        }
        return i5;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48010, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48010, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.most_display_times = this.most_display_times;
        builder.one_display_intervals = this.one_display_intervals;
        builder.op_most_display_times = this.op_most_display_times;
        builder.op_one_display_intervals = this.op_one_display_intervals;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48013, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48013, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.most_display_times != null) {
            sb.append(", most_display_times=");
            sb.append(this.most_display_times);
        }
        if (this.one_display_intervals != null) {
            sb.append(", one_display_intervals=");
            sb.append(this.one_display_intervals);
        }
        if (this.op_most_display_times != null) {
            sb.append(", op_most_display_times=");
            sb.append(this.op_most_display_times);
        }
        if (this.op_one_display_intervals != null) {
            sb.append(", op_one_display_intervals=");
            sb.append(this.op_one_display_intervals);
        }
        StringBuilder replace = sb.replace(0, 2, "HotSearchDisplay{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 48011, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 48011, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof HotSearchDisplay)) {
                return false;
            }
            HotSearchDisplay hotSearchDisplay = (HotSearchDisplay) obj;
            if (!unknownFields().equals(hotSearchDisplay.unknownFields()) || !Internal.equals(this.most_display_times, hotSearchDisplay.most_display_times) || !Internal.equals(this.one_display_intervals, hotSearchDisplay.one_display_intervals) || !Internal.equals(this.op_most_display_times, hotSearchDisplay.op_most_display_times) || !Internal.equals(this.op_one_display_intervals, hotSearchDisplay.op_one_display_intervals)) {
                return false;
            }
            return true;
        }
    }

    public HotSearchDisplay(Integer num, Long l, Integer num2, Long l2) {
        this(num, l, num2, l2, ByteString.EMPTY);
    }

    public HotSearchDisplay(Integer num, Long l, Integer num2, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.most_display_times = num;
        this.one_display_intervals = l;
        this.op_most_display_times = num2;
        this.op_one_display_intervals = l2;
    }
}
