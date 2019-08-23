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

public final class BattleSettings extends Message<BattleSettings, Builder> {
    public static final ProtoAdapter<BattleSettings> ADAPTER = new ProtoAdapter_BattleSettings();
    public static final Long DEFAULT_BATTLE_ID = 0L;
    public static final Long DEFAULT_CHANNEL_ID = 0L;
    public static final Long DEFAULT_DURATION = 0L;
    public static final Long DEFAULT_MATCH_TYPE = 0L;
    public static final Long DEFAULT_START_TIME_MS = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long battle_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
    public final Long channel_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long duration;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 7)
    public final Long match_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long start_time_ms;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String theme;

    public static final class Builder extends Message.Builder<BattleSettings, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Long battle_id;
        public Long channel_id;
        public Long duration;
        public Long match_type;
        public Long start_time_ms;
        public String theme;

        public final BattleSettings build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11178, new Class[0], BattleSettings.class)) {
                return (BattleSettings) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11178, new Class[0], BattleSettings.class);
            }
            BattleSettings battleSettings = new BattleSettings(this.battle_id, this.start_time_ms, this.duration, this.theme, this.channel_id, this.match_type, super.buildUnknownFields());
            return battleSettings;
        }

        public final Builder battle_id(Long l) {
            this.battle_id = l;
            return this;
        }

        public final Builder channel_id(Long l) {
            this.channel_id = l;
            return this;
        }

        public final Builder duration(Long l) {
            this.duration = l;
            return this;
        }

        public final Builder match_type(Long l) {
            this.match_type = l;
            return this;
        }

        public final Builder start_time_ms(Long l) {
            this.start_time_ms = l;
            return this;
        }

        public final Builder theme(String str) {
            this.theme = str;
            return this;
        }
    }

    static final class ProtoAdapter_BattleSettings extends ProtoAdapter<BattleSettings> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_BattleSettings() {
            super(FieldEncoding.LENGTH_DELIMITED, BattleSettings.class);
        }

        public final BattleSettings redact(BattleSettings battleSettings) {
            if (PatchProxy.isSupport(new Object[]{battleSettings}, this, changeQuickRedirect, false, 11182, new Class[]{BattleSettings.class}, BattleSettings.class)) {
                return (BattleSettings) PatchProxy.accessDispatch(new Object[]{battleSettings}, this, changeQuickRedirect, false, 11182, new Class[]{BattleSettings.class}, BattleSettings.class);
            }
            Builder newBuilder = battleSettings.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final BattleSettings decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11181, new Class[]{ProtoReader.class}, BattleSettings.class)) {
                return (BattleSettings) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11181, new Class[]{ProtoReader.class}, BattleSettings.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 2:
                            builder.battle_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 3:
                            builder.start_time_ms((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 4:
                            builder.duration((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 5:
                            builder.theme((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 6:
                            builder.channel_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case e.l /*7*/:
                            builder.match_type((Long) ProtoAdapter.INT64.decode(protoReader2));
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

        public final int encodedSize(BattleSettings battleSettings) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            BattleSettings battleSettings2 = battleSettings;
            int i6 = 0;
            if (PatchProxy.isSupport(new Object[]{battleSettings2}, this, changeQuickRedirect, false, 11179, new Class[]{BattleSettings.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{battleSettings2}, this, changeQuickRedirect, false, 11179, new Class[]{BattleSettings.class}, Integer.TYPE)).intValue();
            }
            if (battleSettings2.battle_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(2, battleSettings2.battle_id);
            } else {
                i = 0;
            }
            if (battleSettings2.start_time_ms != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, battleSettings2.start_time_ms);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (battleSettings2.duration != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(4, battleSettings2.duration);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (battleSettings2.theme != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, battleSettings2.theme);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (battleSettings2.channel_id != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(6, battleSettings2.channel_id);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (battleSettings2.match_type != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(7, battleSettings2.match_type);
            }
            return i10 + i6 + battleSettings.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, BattleSettings battleSettings) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            BattleSettings battleSettings2 = battleSettings;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, battleSettings2}, this, changeQuickRedirect, false, 11180, new Class[]{ProtoWriter.class, BattleSettings.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, battleSettings2}, this, changeQuickRedirect, false, 11180, new Class[]{ProtoWriter.class, BattleSettings.class}, Void.TYPE);
                return;
            }
            if (battleSettings2.battle_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, battleSettings2.battle_id);
            }
            if (battleSettings2.start_time_ms != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, battleSettings2.start_time_ms);
            }
            if (battleSettings2.duration != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, battleSettings2.duration);
            }
            if (battleSettings2.theme != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 5, battleSettings2.theme);
            }
            if (battleSettings2.channel_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 6, battleSettings2.channel_id);
            }
            if (battleSettings2.match_type != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 7, battleSettings2.match_type);
            }
            protoWriter2.writeBytes(battleSettings.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11174, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11174, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.battle_id = this.battle_id;
        builder.start_time_ms = this.start_time_ms;
        builder.duration = this.duration;
        builder.theme = this.theme;
        builder.channel_id = this.channel_id;
        builder.match_type = this.match_type;
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11176, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11176, new Class[0], Integer.TYPE)).intValue();
        }
        int i7 = this.hashCode;
        if (i7 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.battle_id != null) {
                i = this.battle_id.hashCode();
            } else {
                i = 0;
            }
            int i8 = (hashCode + i) * 37;
            if (this.start_time_ms != null) {
                i2 = this.start_time_ms.hashCode();
            } else {
                i2 = 0;
            }
            int i9 = (i8 + i2) * 37;
            if (this.duration != null) {
                i3 = this.duration.hashCode();
            } else {
                i3 = 0;
            }
            int i10 = (i9 + i3) * 37;
            if (this.theme != null) {
                i4 = this.theme.hashCode();
            } else {
                i4 = 0;
            }
            int i11 = (i10 + i4) * 37;
            if (this.channel_id != null) {
                i5 = this.channel_id.hashCode();
            } else {
                i5 = 0;
            }
            int i12 = (i11 + i5) * 37;
            if (this.match_type != null) {
                i6 = this.match_type.hashCode();
            }
            i7 = i12 + i6;
            this.hashCode = i7;
        }
        return i7;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11177, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11177, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.battle_id != null) {
            sb.append(", battle_id=");
            sb.append(this.battle_id);
        }
        if (this.start_time_ms != null) {
            sb.append(", start_time_ms=");
            sb.append(this.start_time_ms);
        }
        if (this.duration != null) {
            sb.append(", duration=");
            sb.append(this.duration);
        }
        if (this.theme != null) {
            sb.append(", theme=");
            sb.append(this.theme);
        }
        if (this.channel_id != null) {
            sb.append(", channel_id=");
            sb.append(this.channel_id);
        }
        if (this.match_type != null) {
            sb.append(", match_type=");
            sb.append(this.match_type);
        }
        StringBuilder replace = sb.replace(0, 2, "BattleSettings{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11175, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11175, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof BattleSettings)) {
                return false;
            }
            BattleSettings battleSettings = (BattleSettings) obj;
            if (!unknownFields().equals(battleSettings.unknownFields()) || !Internal.equals(this.battle_id, battleSettings.battle_id) || !Internal.equals(this.start_time_ms, battleSettings.start_time_ms) || !Internal.equals(this.duration, battleSettings.duration) || !Internal.equals(this.theme, battleSettings.theme) || !Internal.equals(this.channel_id, battleSettings.channel_id) || !Internal.equals(this.match_type, battleSettings.match_type)) {
                return false;
            }
            return true;
        }
    }

    public BattleSettings(Long l, Long l2, Long l3, String str, Long l4, Long l5) {
        this(l, l2, l3, str, l4, l5, ByteString.EMPTY);
    }

    public BattleSettings(Long l, Long l2, Long l3, String str, Long l4, Long l5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.battle_id = l;
        this.start_time_ms = l2;
        this.duration = l3;
        this.theme = str;
        this.channel_id = l4;
        this.match_type = l5;
    }
}
