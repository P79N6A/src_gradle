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
import java.io.IOException;
import okio.ByteString;

public final class BattleMode extends Message<BattleMode, Builder> {
    public static final ProtoAdapter<BattleMode> ADAPTER = new ProtoAdapter_BattleMode();
    public static final Integer DEFAULT_MODE = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer mode;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.BattleMode$StealTowerData#ADAPTER", tag = 2)
    public final StealTowerData steal_tower_data;

    public static final class StealTowerData extends Message<StealTowerData, Builder> {
        public static final ProtoAdapter<StealTowerData> ADAPTER = new ProtoAdapter_StealTowerData();
        public static final Long DEFAULT_TRIGGER_TIME = 0L;
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
        public final Long trigger_time;

        public static final class Builder extends Message.Builder<StealTowerData, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public Long trigger_time;

            public final StealTowerData build() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11151, new Class[0], StealTowerData.class)) {
                    return new StealTowerData(this.trigger_time, super.buildUnknownFields());
                }
                return (StealTowerData) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11151, new Class[0], StealTowerData.class);
            }

            public final Builder trigger_time(Long l) {
                this.trigger_time = l;
                return this;
            }
        }

        static final class ProtoAdapter_StealTowerData extends ProtoAdapter<StealTowerData> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_StealTowerData() {
                super(FieldEncoding.LENGTH_DELIMITED, StealTowerData.class);
            }

            public final StealTowerData decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11154, new Class[]{ProtoReader.class}, StealTowerData.class)) {
                    return (StealTowerData) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11154, new Class[]{ProtoReader.class}, StealTowerData.class);
                }
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader2.endMessage(beginMessage);
                        return builder.build();
                    } else if (nextTag != 1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                    } else {
                        builder.trigger_time((Long) ProtoAdapter.INT64.decode(protoReader2));
                    }
                }
            }

            public final int encodedSize(StealTowerData stealTowerData) {
                StealTowerData stealTowerData2 = stealTowerData;
                int i = 0;
                if (PatchProxy.isSupport(new Object[]{stealTowerData2}, this, changeQuickRedirect, false, 11152, new Class[]{StealTowerData.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{stealTowerData2}, this, changeQuickRedirect, false, 11152, new Class[]{StealTowerData.class}, Integer.TYPE)).intValue();
                }
                if (stealTowerData2.trigger_time != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, stealTowerData2.trigger_time);
                }
                return i + stealTowerData.unknownFields().size();
            }

            public final StealTowerData redact(StealTowerData stealTowerData) {
                if (PatchProxy.isSupport(new Object[]{stealTowerData}, this, changeQuickRedirect, false, 11155, new Class[]{StealTowerData.class}, StealTowerData.class)) {
                    return (StealTowerData) PatchProxy.accessDispatch(new Object[]{stealTowerData}, this, changeQuickRedirect, false, 11155, new Class[]{StealTowerData.class}, StealTowerData.class);
                }
                Builder newBuilder = stealTowerData.newBuilder();
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final void encode(ProtoWriter protoWriter, StealTowerData stealTowerData) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                StealTowerData stealTowerData2 = stealTowerData;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, stealTowerData2}, this, changeQuickRedirect, false, 11153, new Class[]{ProtoWriter.class, StealTowerData.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, stealTowerData2}, this, changeQuickRedirect, false, 11153, new Class[]{ProtoWriter.class, StealTowerData.class}, Void.TYPE);
                    return;
                }
                if (stealTowerData2.trigger_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1, stealTowerData2.trigger_time);
                }
                protoWriter2.writeBytes(stealTowerData.unknownFields());
            }
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11147, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11147, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.trigger_time = this.trigger_time;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final int hashCode() {
            int i = 0;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11149, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11149, new Class[0], Integer.TYPE)).intValue();
            }
            int i2 = this.hashCode;
            if (i2 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                if (this.trigger_time != null) {
                    i = this.trigger_time.hashCode();
                }
                i2 = hashCode + i;
                this.hashCode = i2;
            }
            return i2;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11150, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11150, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (this.trigger_time != null) {
                sb.append(", trigger_time=");
                sb.append(this.trigger_time);
            }
            StringBuilder replace = sb.replace(0, 2, "StealTowerData{");
            replace.append('}');
            return replace.toString();
        }

        public StealTowerData(Long l) {
            this(l, ByteString.EMPTY);
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11148, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11148, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof StealTowerData)) {
                    return false;
                }
                StealTowerData stealTowerData = (StealTowerData) obj;
                if (!unknownFields().equals(stealTowerData.unknownFields()) || !Internal.equals(this.trigger_time, stealTowerData.trigger_time)) {
                    return false;
                }
                return true;
            }
        }

        public StealTowerData(Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            this.trigger_time = l;
        }
    }

    public static final class Builder extends Message.Builder<BattleMode, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Integer mode;
        public StealTowerData steal_tower_data;

        public final BattleMode build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11142, new Class[0], BattleMode.class)) {
                return new BattleMode(this.mode, this.steal_tower_data, super.buildUnknownFields());
            }
            return (BattleMode) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11142, new Class[0], BattleMode.class);
        }

        public final Builder mode(Integer num) {
            this.mode = num;
            return this;
        }

        public final Builder steal_tower_data(StealTowerData stealTowerData) {
            this.steal_tower_data = stealTowerData;
            return this;
        }
    }

    static final class ProtoAdapter_BattleMode extends ProtoAdapter<BattleMode> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_BattleMode() {
            super(FieldEncoding.LENGTH_DELIMITED, BattleMode.class);
        }

        public final int encodedSize(BattleMode battleMode) {
            int i;
            BattleMode battleMode2 = battleMode;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{battleMode2}, this, changeQuickRedirect, false, 11143, new Class[]{BattleMode.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{battleMode2}, this, changeQuickRedirect, false, 11143, new Class[]{BattleMode.class}, Integer.TYPE)).intValue();
            }
            if (battleMode2.mode != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, battleMode2.mode);
            } else {
                i = 0;
            }
            if (battleMode2.steal_tower_data != null) {
                i2 = StealTowerData.ADAPTER.encodedSizeWithTag(2, battleMode2.steal_tower_data);
            }
            return i + i2 + battleMode.unknownFields().size();
        }

        public final BattleMode redact(BattleMode battleMode) {
            if (PatchProxy.isSupport(new Object[]{battleMode}, this, changeQuickRedirect, false, 11146, new Class[]{BattleMode.class}, BattleMode.class)) {
                return (BattleMode) PatchProxy.accessDispatch(new Object[]{battleMode}, this, changeQuickRedirect, false, 11146, new Class[]{BattleMode.class}, BattleMode.class);
            }
            Builder newBuilder = battleMode.newBuilder();
            if (newBuilder.steal_tower_data != null) {
                newBuilder.steal_tower_data = (StealTowerData) StealTowerData.ADAPTER.redact(newBuilder.steal_tower_data);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final BattleMode decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11145, new Class[]{ProtoReader.class}, BattleMode.class)) {
                return (BattleMode) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11145, new Class[]{ProtoReader.class}, BattleMode.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.mode((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 2:
                            builder.steal_tower_data((StealTowerData) StealTowerData.ADAPTER.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, BattleMode battleMode) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            BattleMode battleMode2 = battleMode;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, battleMode2}, this, changeQuickRedirect, false, 11144, new Class[]{ProtoWriter.class, BattleMode.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, battleMode2}, this, changeQuickRedirect, false, 11144, new Class[]{ProtoWriter.class, BattleMode.class}, Void.TYPE);
                return;
            }
            if (battleMode2.mode != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 1, battleMode2.mode);
            }
            if (battleMode2.steal_tower_data != null) {
                StealTowerData.ADAPTER.encodeWithTag(protoWriter2, 2, battleMode2.steal_tower_data);
            }
            protoWriter2.writeBytes(battleMode.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11138, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11138, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.mode = this.mode;
        builder.steal_tower_data = this.steal_tower_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11140, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11140, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.mode != null) {
                i = this.mode.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.steal_tower_data != null) {
                i2 = this.steal_tower_data.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11141, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11141, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.mode != null) {
            sb.append(", mode=");
            sb.append(this.mode);
        }
        if (this.steal_tower_data != null) {
            sb.append(", steal_tower_data=");
            sb.append(this.steal_tower_data);
        }
        StringBuilder replace = sb.replace(0, 2, "BattleMode{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11139, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11139, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof BattleMode)) {
                return false;
            }
            BattleMode battleMode = (BattleMode) obj;
            if (!unknownFields().equals(battleMode.unknownFields()) || !Internal.equals(this.mode, battleMode.mode) || !Internal.equals(this.steal_tower_data, battleMode.steal_tower_data)) {
                return false;
            }
            return true;
        }
    }

    public BattleMode(Integer num, StealTowerData stealTowerData) {
        this(num, stealTowerData, ByteString.EMPTY);
    }

    public BattleMode(Integer num, StealTowerData stealTowerData, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mode = num;
        this.steal_tower_data = stealTowerData;
    }
}
