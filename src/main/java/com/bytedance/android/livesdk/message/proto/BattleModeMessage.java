package com.bytedance.android.livesdk.message.proto;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.io.IOException;
import okio.ByteString;

public final class BattleModeMessage extends Message<BattleModeMessage, Builder> {
    public static final ProtoAdapter<BattleModeMessage> ADAPTER = new ProtoAdapter_BattleModeMessage();
    public static final Long DEFAULT_MODE = 0L;
    public static final Long DEFAULT_NOW = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long mode;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long now;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.BattleModeMessage$StealTowerData#ADAPTER", tag = 3)
    public final StealTowerData steal_tower_data;

    public static final class StealTowerData extends Message<StealTowerData, Builder> {
        public static final ProtoAdapter<StealTowerData> ADAPTER = new ProtoAdapter_StealTowerData();
        public static final Long DEFAULT_ATTACKER_ID = 0L;
        public static final Long DEFAULT_COUNT = 0L;
        public static final Long DEFAULT_DURATION = 0L;
        public static final Boolean DEFAULT_FINISH = Boolean.FALSE;
        public static final Long DEFAULT_FINISH_TIME = 0L;
        public static final Long DEFAULT_OPEN_SCORE = 0L;
        public static final Long DEFAULT_START_TIME = 0L;
        public static final Long DEFAULT_TARGET_SCORE = 0L;
        public static final Long DEFAULT_WIN = 0L;
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
        public final Long attacker_id;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 9)
        public final Long count;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
        public final Long duration;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 6)
        public final Boolean finish;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
        public final Long finish_time;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 8)
        public final Long open_score;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
        public final Long start_time;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
        public final Long target_score;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 7)
        public final Long win;

        public static final class Builder extends Message.Builder<StealTowerData, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public Long attacker_id;
            public Long count;
            public Long duration;
            public Boolean finish;
            public Long finish_time;
            public Long open_score;
            public Long start_time;
            public Long target_score;
            public Long win;

            public final StealTowerData build() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11169, new Class[0], StealTowerData.class)) {
                    return (StealTowerData) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11169, new Class[0], StealTowerData.class);
                }
                StealTowerData stealTowerData = new StealTowerData(this.start_time, this.finish_time, this.duration, this.target_score, this.attacker_id, this.finish, this.win, this.open_score, this.count, super.buildUnknownFields());
                return stealTowerData;
            }

            public final Builder attacker_id(Long l) {
                this.attacker_id = l;
                return this;
            }

            public final Builder count(Long l) {
                this.count = l;
                return this;
            }

            public final Builder duration(Long l) {
                this.duration = l;
                return this;
            }

            public final Builder finish(Boolean bool) {
                this.finish = bool;
                return this;
            }

            public final Builder finish_time(Long l) {
                this.finish_time = l;
                return this;
            }

            public final Builder open_score(Long l) {
                this.open_score = l;
                return this;
            }

            public final Builder start_time(Long l) {
                this.start_time = l;
                return this;
            }

            public final Builder target_score(Long l) {
                this.target_score = l;
                return this;
            }

            public final Builder win(Long l) {
                this.win = l;
                return this;
            }
        }

        static final class ProtoAdapter_StealTowerData extends ProtoAdapter<StealTowerData> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_StealTowerData() {
                super(FieldEncoding.LENGTH_DELIMITED, StealTowerData.class);
            }

            public final StealTowerData redact(StealTowerData stealTowerData) {
                if (PatchProxy.isSupport(new Object[]{stealTowerData}, this, changeQuickRedirect, false, 11173, new Class[]{StealTowerData.class}, StealTowerData.class)) {
                    return (StealTowerData) PatchProxy.accessDispatch(new Object[]{stealTowerData}, this, changeQuickRedirect, false, 11173, new Class[]{StealTowerData.class}, StealTowerData.class);
                }
                Builder newBuilder = stealTowerData.newBuilder();
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final StealTowerData decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11172, new Class[]{ProtoReader.class}, StealTowerData.class)) {
                    return (StealTowerData) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11172, new Class[]{ProtoReader.class}, StealTowerData.class);
                }
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                builder.start_time((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 2:
                                builder.finish_time((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 3:
                                builder.duration((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 4:
                                builder.target_score((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 5:
                                builder.attacker_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 6:
                                builder.finish((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                break;
                            case e.l /*7*/:
                                builder.win((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 8:
                                builder.open_score((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 9:
                                builder.count((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            default:
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                        }
                    } else {
                        protoReader2.endMessage(beginMessage);
                        return builder.build();
                    }
                }
            }

            public final int encodedSize(StealTowerData stealTowerData) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                StealTowerData stealTowerData2 = stealTowerData;
                int i9 = 0;
                if (PatchProxy.isSupport(new Object[]{stealTowerData2}, this, changeQuickRedirect, false, 11170, new Class[]{StealTowerData.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{stealTowerData2}, this, changeQuickRedirect, false, 11170, new Class[]{StealTowerData.class}, Integer.TYPE)).intValue();
                }
                if (stealTowerData2.start_time != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, stealTowerData2.start_time);
                } else {
                    i = 0;
                }
                if (stealTowerData2.finish_time != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, stealTowerData2.finish_time);
                } else {
                    i2 = 0;
                }
                int i10 = i + i2;
                if (stealTowerData2.duration != null) {
                    i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, stealTowerData2.duration);
                } else {
                    i3 = 0;
                }
                int i11 = i10 + i3;
                if (stealTowerData2.target_score != null) {
                    i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, stealTowerData2.target_score);
                } else {
                    i4 = 0;
                }
                int i12 = i11 + i4;
                if (stealTowerData2.attacker_id != null) {
                    i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, stealTowerData2.attacker_id);
                } else {
                    i5 = 0;
                }
                int i13 = i12 + i5;
                if (stealTowerData2.finish != null) {
                    i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, stealTowerData2.finish);
                } else {
                    i6 = 0;
                }
                int i14 = i13 + i6;
                if (stealTowerData2.win != null) {
                    i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, stealTowerData2.win);
                } else {
                    i7 = 0;
                }
                int i15 = i14 + i7;
                if (stealTowerData2.open_score != null) {
                    i8 = ProtoAdapter.INT64.encodedSizeWithTag(8, stealTowerData2.open_score);
                } else {
                    i8 = 0;
                }
                int i16 = i15 + i8;
                if (stealTowerData2.count != null) {
                    i9 = ProtoAdapter.INT64.encodedSizeWithTag(9, stealTowerData2.count);
                }
                return i16 + i9 + stealTowerData.unknownFields().size();
            }

            public final void encode(ProtoWriter protoWriter, StealTowerData stealTowerData) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                StealTowerData stealTowerData2 = stealTowerData;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, stealTowerData2}, this, changeQuickRedirect, false, 11171, new Class[]{ProtoWriter.class, StealTowerData.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, stealTowerData2}, this, changeQuickRedirect, false, 11171, new Class[]{ProtoWriter.class, StealTowerData.class}, Void.TYPE);
                    return;
                }
                if (stealTowerData2.start_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1, stealTowerData2.start_time);
                }
                if (stealTowerData2.finish_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, stealTowerData2.finish_time);
                }
                if (stealTowerData2.duration != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, stealTowerData2.duration);
                }
                if (stealTowerData2.target_score != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, stealTowerData2.target_score);
                }
                if (stealTowerData2.attacker_id != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 5, stealTowerData2.attacker_id);
                }
                if (stealTowerData2.finish != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 6, stealTowerData2.finish);
                }
                if (stealTowerData2.win != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 7, stealTowerData2.win);
                }
                if (stealTowerData2.open_score != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 8, stealTowerData2.open_score);
                }
                if (stealTowerData2.count != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 9, stealTowerData2.count);
                }
                protoWriter2.writeBytes(stealTowerData.unknownFields());
            }
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11165, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11165, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.start_time = this.start_time;
            builder.finish_time = this.finish_time;
            builder.duration = this.duration;
            builder.target_score = this.target_score;
            builder.attacker_id = this.attacker_id;
            builder.finish = this.finish;
            builder.win = this.win;
            builder.open_score = this.open_score;
            builder.count = this.count;
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
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11167, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11167, new Class[0], Integer.TYPE)).intValue();
            }
            int i10 = this.hashCode;
            if (i10 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                if (this.start_time != null) {
                    i = this.start_time.hashCode();
                } else {
                    i = 0;
                }
                int i11 = (hashCode + i) * 37;
                if (this.finish_time != null) {
                    i2 = this.finish_time.hashCode();
                } else {
                    i2 = 0;
                }
                int i12 = (i11 + i2) * 37;
                if (this.duration != null) {
                    i3 = this.duration.hashCode();
                } else {
                    i3 = 0;
                }
                int i13 = (i12 + i3) * 37;
                if (this.target_score != null) {
                    i4 = this.target_score.hashCode();
                } else {
                    i4 = 0;
                }
                int i14 = (i13 + i4) * 37;
                if (this.attacker_id != null) {
                    i5 = this.attacker_id.hashCode();
                } else {
                    i5 = 0;
                }
                int i15 = (i14 + i5) * 37;
                if (this.finish != null) {
                    i6 = this.finish.hashCode();
                } else {
                    i6 = 0;
                }
                int i16 = (i15 + i6) * 37;
                if (this.win != null) {
                    i7 = this.win.hashCode();
                } else {
                    i7 = 0;
                }
                int i17 = (i16 + i7) * 37;
                if (this.open_score != null) {
                    i8 = this.open_score.hashCode();
                } else {
                    i8 = 0;
                }
                int i18 = (i17 + i8) * 37;
                if (this.count != null) {
                    i9 = this.count.hashCode();
                }
                i10 = i18 + i9;
                this.hashCode = i10;
            }
            return i10;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11168, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11168, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (this.start_time != null) {
                sb.append(", start_time=");
                sb.append(this.start_time);
            }
            if (this.finish_time != null) {
                sb.append(", finish_time=");
                sb.append(this.finish_time);
            }
            if (this.duration != null) {
                sb.append(", duration=");
                sb.append(this.duration);
            }
            if (this.target_score != null) {
                sb.append(", target_score=");
                sb.append(this.target_score);
            }
            if (this.attacker_id != null) {
                sb.append(", attacker_id=");
                sb.append(this.attacker_id);
            }
            if (this.finish != null) {
                sb.append(", finish=");
                sb.append(this.finish);
            }
            if (this.win != null) {
                sb.append(", win=");
                sb.append(this.win);
            }
            if (this.open_score != null) {
                sb.append(", open_score=");
                sb.append(this.open_score);
            }
            if (this.count != null) {
                sb.append(", count=");
                sb.append(this.count);
            }
            StringBuilder replace = sb.replace(0, 2, "StealTowerData{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11166, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11166, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof StealTowerData)) {
                    return false;
                }
                StealTowerData stealTowerData = (StealTowerData) obj;
                if (!unknownFields().equals(stealTowerData.unknownFields()) || !Internal.equals(this.start_time, stealTowerData.start_time) || !Internal.equals(this.finish_time, stealTowerData.finish_time) || !Internal.equals(this.duration, stealTowerData.duration) || !Internal.equals(this.target_score, stealTowerData.target_score) || !Internal.equals(this.attacker_id, stealTowerData.attacker_id) || !Internal.equals(this.finish, stealTowerData.finish) || !Internal.equals(this.win, stealTowerData.win) || !Internal.equals(this.open_score, stealTowerData.open_score) || !Internal.equals(this.count, stealTowerData.count)) {
                    return false;
                }
                return true;
            }
        }

        public StealTowerData(Long l, Long l2, Long l3, Long l4, Long l5, Boolean bool, Long l6, Long l7, Long l8) {
            this(l, l2, l3, l4, l5, bool, l6, l7, l8, ByteString.EMPTY);
        }

        public StealTowerData(Long l, Long l2, Long l3, Long l4, Long l5, Boolean bool, Long l6, Long l7, Long l8, ByteString byteString) {
            super(ADAPTER, byteString);
            this.start_time = l;
            this.finish_time = l2;
            this.duration = l3;
            this.target_score = l4;
            this.attacker_id = l5;
            this.finish = bool;
            this.win = l6;
            this.open_score = l7;
            this.count = l8;
        }
    }

    public static final class Builder extends Message.Builder<BattleModeMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public Long mode;
        public Long now;
        public StealTowerData steal_tower_data;

        public final BattleModeMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11160, new Class[0], BattleModeMessage.class)) {
                return (BattleModeMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11160, new Class[0], BattleModeMessage.class);
            }
            BattleModeMessage battleModeMessage = new BattleModeMessage(this.common, this.mode, this.steal_tower_data, this.now, super.buildUnknownFields());
            return battleModeMessage;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder mode(Long l) {
            this.mode = l;
            return this;
        }

        public final Builder now(Long l) {
            this.now = l;
            return this;
        }

        public final Builder steal_tower_data(StealTowerData stealTowerData) {
            this.steal_tower_data = stealTowerData;
            return this;
        }
    }

    static final class ProtoAdapter_BattleModeMessage extends ProtoAdapter<BattleModeMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_BattleModeMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, BattleModeMessage.class);
        }

        public final BattleModeMessage redact(BattleModeMessage battleModeMessage) {
            if (PatchProxy.isSupport(new Object[]{battleModeMessage}, this, changeQuickRedirect, false, 11164, new Class[]{BattleModeMessage.class}, BattleModeMessage.class)) {
                return (BattleModeMessage) PatchProxy.accessDispatch(new Object[]{battleModeMessage}, this, changeQuickRedirect, false, 11164, new Class[]{BattleModeMessage.class}, BattleModeMessage.class);
            }
            Builder newBuilder = battleModeMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.steal_tower_data != null) {
                newBuilder.steal_tower_data = (StealTowerData) StealTowerData.ADAPTER.redact(newBuilder.steal_tower_data);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final BattleModeMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11163, new Class[]{ProtoReader.class}, BattleModeMessage.class)) {
                return (BattleModeMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11163, new Class[]{ProtoReader.class}, BattleModeMessage.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.common((Common) Common.ADAPTER.decode(protoReader2));
                            break;
                        case 2:
                            builder.mode((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 3:
                            builder.steal_tower_data((StealTowerData) StealTowerData.ADAPTER.decode(protoReader2));
                            break;
                        case 4:
                            builder.now((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                            break;
                    }
                } else {
                    protoReader2.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final int encodedSize(BattleModeMessage battleModeMessage) {
            int i;
            int i2;
            int i3;
            BattleModeMessage battleModeMessage2 = battleModeMessage;
            int i4 = 0;
            if (PatchProxy.isSupport(new Object[]{battleModeMessage2}, this, changeQuickRedirect, false, 11161, new Class[]{BattleModeMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{battleModeMessage2}, this, changeQuickRedirect, false, 11161, new Class[]{BattleModeMessage.class}, Integer.TYPE)).intValue();
            }
            if (battleModeMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, battleModeMessage2.common);
            } else {
                i = 0;
            }
            if (battleModeMessage2.mode != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, battleModeMessage2.mode);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (battleModeMessage2.steal_tower_data != null) {
                i3 = StealTowerData.ADAPTER.encodedSizeWithTag(3, battleModeMessage2.steal_tower_data);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (battleModeMessage2.now != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, battleModeMessage2.now);
            }
            return i6 + i4 + battleModeMessage.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, BattleModeMessage battleModeMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            BattleModeMessage battleModeMessage2 = battleModeMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, battleModeMessage2}, this, changeQuickRedirect, false, 11162, new Class[]{ProtoWriter.class, BattleModeMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, battleModeMessage2}, this, changeQuickRedirect, false, 11162, new Class[]{ProtoWriter.class, BattleModeMessage.class}, Void.TYPE);
                return;
            }
            if (battleModeMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, battleModeMessage2.common);
            }
            if (battleModeMessage2.mode != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, battleModeMessage2.mode);
            }
            if (battleModeMessage2.steal_tower_data != null) {
                StealTowerData.ADAPTER.encodeWithTag(protoWriter2, 3, battleModeMessage2.steal_tower_data);
            }
            if (battleModeMessage2.now != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, battleModeMessage2.now);
            }
            protoWriter2.writeBytes(battleModeMessage.unknownFields());
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11158, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11158, new Class[0], Integer.TYPE)).intValue();
        }
        int i5 = this.hashCode;
        if (i5 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i6 = (hashCode + i) * 37;
            if (this.mode != null) {
                i2 = this.mode.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 37;
            if (this.steal_tower_data != null) {
                i3 = this.steal_tower_data.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 37;
            if (this.now != null) {
                i4 = this.now.hashCode();
            }
            i5 = i8 + i4;
            this.hashCode = i5;
        }
        return i5;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11156, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11156, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.mode = this.mode;
        builder.steal_tower_data = this.steal_tower_data;
        builder.now = this.now;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11159, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11159, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.mode != null) {
            sb.append(", mode=");
            sb.append(this.mode);
        }
        if (this.steal_tower_data != null) {
            sb.append(", steal_tower_data=");
            sb.append(this.steal_tower_data);
        }
        if (this.now != null) {
            sb.append(", now=");
            sb.append(this.now);
        }
        StringBuilder replace = sb.replace(0, 2, "BattleModeMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11157, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11157, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof BattleModeMessage)) {
                return false;
            }
            BattleModeMessage battleModeMessage = (BattleModeMessage) obj;
            if (!unknownFields().equals(battleModeMessage.unknownFields()) || !Internal.equals(this.common, battleModeMessage.common) || !Internal.equals(this.mode, battleModeMessage.mode) || !Internal.equals(this.steal_tower_data, battleModeMessage.steal_tower_data) || !Internal.equals(this.now, battleModeMessage.now)) {
                return false;
            }
            return true;
        }
    }

    public BattleModeMessage(Common common2, Long l, StealTowerData stealTowerData, Long l2) {
        this(common2, l, stealTowerData, l2, ByteString.EMPTY);
    }

    public BattleModeMessage(Common common2, Long l, StealTowerData stealTowerData, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.mode = l;
        this.steal_tower_data = stealTowerData;
        this.now = l2;
    }
}
