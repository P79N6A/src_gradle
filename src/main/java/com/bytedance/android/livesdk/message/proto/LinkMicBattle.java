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

public final class LinkMicBattle extends Message<LinkMicBattle, Builder> {
    public static final ProtoAdapter<LinkMicBattle> ADAPTER = new ProtoAdapter_LinkMicBattle();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.BattleMode#ADAPTER", tag = 3)
    public final BattleMode battle_mode;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.BattleSettings#ADAPTER", tag = 2)
    public final BattleSettings battle_settings;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.BattleTask#ADAPTER", tag = 4)
    public final BattleTask battle_task;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;

    public static final class Builder extends Message.Builder<LinkMicBattle, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public BattleMode battle_mode;
        public BattleSettings battle_settings;
        public BattleTask battle_task;
        public Common common;

        public final LinkMicBattle build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11658, new Class[0], LinkMicBattle.class)) {
                return (LinkMicBattle) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11658, new Class[0], LinkMicBattle.class);
            }
            LinkMicBattle linkMicBattle = new LinkMicBattle(this.common, this.battle_settings, this.battle_mode, this.battle_task, super.buildUnknownFields());
            return linkMicBattle;
        }

        public final Builder battle_mode(BattleMode battleMode) {
            this.battle_mode = battleMode;
            return this;
        }

        public final Builder battle_settings(BattleSettings battleSettings) {
            this.battle_settings = battleSettings;
            return this;
        }

        public final Builder battle_task(BattleTask battleTask) {
            this.battle_task = battleTask;
            return this;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }
    }

    static final class ProtoAdapter_LinkMicBattle extends ProtoAdapter<LinkMicBattle> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_LinkMicBattle() {
            super(FieldEncoding.LENGTH_DELIMITED, LinkMicBattle.class);
        }

        public final LinkMicBattle decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11661, new Class[]{ProtoReader.class}, LinkMicBattle.class)) {
                return (LinkMicBattle) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11661, new Class[]{ProtoReader.class}, LinkMicBattle.class);
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
                            builder.battle_settings((BattleSettings) BattleSettings.ADAPTER.decode(protoReader2));
                            break;
                        case 3:
                            builder.battle_mode((BattleMode) BattleMode.ADAPTER.decode(protoReader2));
                            break;
                        case 4:
                            builder.battle_task((BattleTask) BattleTask.ADAPTER.decode(protoReader2));
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

        public final int encodedSize(LinkMicBattle linkMicBattle) {
            int i;
            int i2;
            int i3;
            LinkMicBattle linkMicBattle2 = linkMicBattle;
            int i4 = 0;
            if (PatchProxy.isSupport(new Object[]{linkMicBattle2}, this, changeQuickRedirect, false, 11659, new Class[]{LinkMicBattle.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{linkMicBattle2}, this, changeQuickRedirect, false, 11659, new Class[]{LinkMicBattle.class}, Integer.TYPE)).intValue();
            }
            if (linkMicBattle2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, linkMicBattle2.common);
            } else {
                i = 0;
            }
            if (linkMicBattle2.battle_settings != null) {
                i2 = BattleSettings.ADAPTER.encodedSizeWithTag(2, linkMicBattle2.battle_settings);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (linkMicBattle2.battle_mode != null) {
                i3 = BattleMode.ADAPTER.encodedSizeWithTag(3, linkMicBattle2.battle_mode);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (linkMicBattle2.battle_task != null) {
                i4 = BattleTask.ADAPTER.encodedSizeWithTag(4, linkMicBattle2.battle_task);
            }
            return i6 + i4 + linkMicBattle.unknownFields().size();
        }

        public final LinkMicBattle redact(LinkMicBattle linkMicBattle) {
            if (PatchProxy.isSupport(new Object[]{linkMicBattle}, this, changeQuickRedirect, false, 11662, new Class[]{LinkMicBattle.class}, LinkMicBattle.class)) {
                return (LinkMicBattle) PatchProxy.accessDispatch(new Object[]{linkMicBattle}, this, changeQuickRedirect, false, 11662, new Class[]{LinkMicBattle.class}, LinkMicBattle.class);
            }
            Builder newBuilder = linkMicBattle.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.battle_settings != null) {
                newBuilder.battle_settings = (BattleSettings) BattleSettings.ADAPTER.redact(newBuilder.battle_settings);
            }
            if (newBuilder.battle_mode != null) {
                newBuilder.battle_mode = (BattleMode) BattleMode.ADAPTER.redact(newBuilder.battle_mode);
            }
            if (newBuilder.battle_task != null) {
                newBuilder.battle_task = (BattleTask) BattleTask.ADAPTER.redact(newBuilder.battle_task);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final void encode(ProtoWriter protoWriter, LinkMicBattle linkMicBattle) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            LinkMicBattle linkMicBattle2 = linkMicBattle;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, linkMicBattle2}, this, changeQuickRedirect, false, 11660, new Class[]{ProtoWriter.class, LinkMicBattle.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, linkMicBattle2}, this, changeQuickRedirect, false, 11660, new Class[]{ProtoWriter.class, LinkMicBattle.class}, Void.TYPE);
                return;
            }
            if (linkMicBattle2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, linkMicBattle2.common);
            }
            if (linkMicBattle2.battle_settings != null) {
                BattleSettings.ADAPTER.encodeWithTag(protoWriter2, 2, linkMicBattle2.battle_settings);
            }
            if (linkMicBattle2.battle_mode != null) {
                BattleMode.ADAPTER.encodeWithTag(protoWriter2, 3, linkMicBattle2.battle_mode);
            }
            if (linkMicBattle2.battle_task != null) {
                BattleTask.ADAPTER.encodeWithTag(protoWriter2, 4, linkMicBattle2.battle_task);
            }
            protoWriter2.writeBytes(linkMicBattle.unknownFields());
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11656, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11656, new Class[0], Integer.TYPE)).intValue();
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
            if (this.battle_settings != null) {
                i2 = this.battle_settings.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 37;
            if (this.battle_mode != null) {
                i3 = this.battle_mode.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 37;
            if (this.battle_task != null) {
                i4 = this.battle_task.hashCode();
            }
            i5 = i8 + i4;
            this.hashCode = i5;
        }
        return i5;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11654, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11654, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.battle_settings = this.battle_settings;
        builder.battle_mode = this.battle_mode;
        builder.battle_task = this.battle_task;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11657, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11657, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.battle_settings != null) {
            sb.append(", battle_settings=");
            sb.append(this.battle_settings);
        }
        if (this.battle_mode != null) {
            sb.append(", battle_mode=");
            sb.append(this.battle_mode);
        }
        if (this.battle_task != null) {
            sb.append(", battle_task=");
            sb.append(this.battle_task);
        }
        StringBuilder replace = sb.replace(0, 2, "LinkMicBattle{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11655, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11655, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof LinkMicBattle)) {
                return false;
            }
            LinkMicBattle linkMicBattle = (LinkMicBattle) obj;
            if (!unknownFields().equals(linkMicBattle.unknownFields()) || !Internal.equals(this.common, linkMicBattle.common) || !Internal.equals(this.battle_settings, linkMicBattle.battle_settings) || !Internal.equals(this.battle_mode, linkMicBattle.battle_mode) || !Internal.equals(this.battle_task, linkMicBattle.battle_task)) {
                return false;
            }
            return true;
        }
    }

    public LinkMicBattle(Common common2, BattleSettings battleSettings, BattleMode battleMode, BattleTask battleTask) {
        this(common2, battleSettings, battleMode, battleTask, ByteString.EMPTY);
    }

    public LinkMicBattle(Common common2, BattleSettings battleSettings, BattleMode battleMode, BattleTask battleTask, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.battle_settings = battleSettings;
        this.battle_mode = battleMode;
        this.battle_task = battleTask;
    }
}
