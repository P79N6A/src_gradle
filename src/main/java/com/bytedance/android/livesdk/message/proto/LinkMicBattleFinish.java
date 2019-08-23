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

public final class LinkMicBattleFinish extends Message<LinkMicBattleFinish, Builder> {
    public static final ProtoAdapter<LinkMicBattleFinish> ADAPTER = new ProtoAdapter_LinkMicBattleFinish();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.BattleSettings#ADAPTER", tag = 2)
    public final BattleSettings battle_settings;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;

    public static final class Builder extends Message.Builder<LinkMicBattleFinish, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public BattleSettings battle_settings;
        public Common common;

        public final LinkMicBattleFinish build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11667, new Class[0], LinkMicBattleFinish.class)) {
                return new LinkMicBattleFinish(this.common, this.battle_settings, super.buildUnknownFields());
            }
            return (LinkMicBattleFinish) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11667, new Class[0], LinkMicBattleFinish.class);
        }

        public final Builder battle_settings(BattleSettings battleSettings) {
            this.battle_settings = battleSettings;
            return this;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }
    }

    static final class ProtoAdapter_LinkMicBattleFinish extends ProtoAdapter<LinkMicBattleFinish> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_LinkMicBattleFinish() {
            super(FieldEncoding.LENGTH_DELIMITED, LinkMicBattleFinish.class);
        }

        public final int encodedSize(LinkMicBattleFinish linkMicBattleFinish) {
            int i;
            LinkMicBattleFinish linkMicBattleFinish2 = linkMicBattleFinish;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{linkMicBattleFinish2}, this, changeQuickRedirect, false, 11668, new Class[]{LinkMicBattleFinish.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{linkMicBattleFinish2}, this, changeQuickRedirect, false, 11668, new Class[]{LinkMicBattleFinish.class}, Integer.TYPE)).intValue();
            }
            if (linkMicBattleFinish2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, linkMicBattleFinish2.common);
            } else {
                i = 0;
            }
            if (linkMicBattleFinish2.battle_settings != null) {
                i2 = BattleSettings.ADAPTER.encodedSizeWithTag(2, linkMicBattleFinish2.battle_settings);
            }
            return i + i2 + linkMicBattleFinish.unknownFields().size();
        }

        public final LinkMicBattleFinish redact(LinkMicBattleFinish linkMicBattleFinish) {
            if (PatchProxy.isSupport(new Object[]{linkMicBattleFinish}, this, changeQuickRedirect, false, 11671, new Class[]{LinkMicBattleFinish.class}, LinkMicBattleFinish.class)) {
                return (LinkMicBattleFinish) PatchProxy.accessDispatch(new Object[]{linkMicBattleFinish}, this, changeQuickRedirect, false, 11671, new Class[]{LinkMicBattleFinish.class}, LinkMicBattleFinish.class);
            }
            Builder newBuilder = linkMicBattleFinish.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.battle_settings != null) {
                newBuilder.battle_settings = (BattleSettings) BattleSettings.ADAPTER.redact(newBuilder.battle_settings);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final LinkMicBattleFinish decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11670, new Class[]{ProtoReader.class}, LinkMicBattleFinish.class)) {
                return (LinkMicBattleFinish) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11670, new Class[]{ProtoReader.class}, LinkMicBattleFinish.class);
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

        public final void encode(ProtoWriter protoWriter, LinkMicBattleFinish linkMicBattleFinish) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            LinkMicBattleFinish linkMicBattleFinish2 = linkMicBattleFinish;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, linkMicBattleFinish2}, this, changeQuickRedirect, false, 11669, new Class[]{ProtoWriter.class, LinkMicBattleFinish.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, linkMicBattleFinish2}, this, changeQuickRedirect, false, 11669, new Class[]{ProtoWriter.class, LinkMicBattleFinish.class}, Void.TYPE);
                return;
            }
            if (linkMicBattleFinish2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, linkMicBattleFinish2.common);
            }
            if (linkMicBattleFinish2.battle_settings != null) {
                BattleSettings.ADAPTER.encodeWithTag(protoWriter2, 2, linkMicBattleFinish2.battle_settings);
            }
            protoWriter2.writeBytes(linkMicBattleFinish.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11663, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11663, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.battle_settings = this.battle_settings;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11665, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11665, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.battle_settings != null) {
                i2 = this.battle_settings.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11666, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11666, new Class[0], String.class);
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
        StringBuilder replace = sb.replace(0, 2, "LinkMicBattleFinish{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11664, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11664, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof LinkMicBattleFinish)) {
                return false;
            }
            LinkMicBattleFinish linkMicBattleFinish = (LinkMicBattleFinish) obj;
            if (!unknownFields().equals(linkMicBattleFinish.unknownFields()) || !Internal.equals(this.common, linkMicBattleFinish.common) || !Internal.equals(this.battle_settings, linkMicBattleFinish.battle_settings)) {
                return false;
            }
            return true;
        }
    }

    public LinkMicBattleFinish(Common common2, BattleSettings battleSettings) {
        this(common2, battleSettings, ByteString.EMPTY);
    }

    public LinkMicBattleFinish(Common common2, BattleSettings battleSettings, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.battle_settings = battleSettings;
    }
}
