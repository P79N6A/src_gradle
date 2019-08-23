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

public final class HotSearchWitch extends Message<HotSearchWitch, Builder> {
    public static final DefaultValueProtoAdapter<HotSearchWitch> ADAPTER = new ProtoAdapter_HotSearchWitch();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public final Boolean hotsearch_aweme_billboard_switch;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public final Boolean hotsearch_billboard_switch;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean hotsearch_music_billboard_switch;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 4)
    public final Boolean hotsearch_positive_energy_billboard_switch;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 5)
    public final Boolean hotsearch_star_billboard_switch;

    public static final class Builder extends Message.Builder<HotSearchWitch, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Boolean hotsearch_aweme_billboard_switch;
        public Boolean hotsearch_billboard_switch;
        public Boolean hotsearch_music_billboard_switch;
        public Boolean hotsearch_positive_energy_billboard_switch;
        public Boolean hotsearch_star_billboard_switch;

        public final HotSearchWitch build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48028, new Class[0], HotSearchWitch.class)) {
                return (HotSearchWitch) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48028, new Class[0], HotSearchWitch.class);
            }
            HotSearchWitch hotSearchWitch = new HotSearchWitch(this.hotsearch_billboard_switch, this.hotsearch_music_billboard_switch, this.hotsearch_aweme_billboard_switch, this.hotsearch_positive_energy_billboard_switch, this.hotsearch_star_billboard_switch, super.buildUnknownFields());
            return hotSearchWitch;
        }

        public final Builder hotsearch_aweme_billboard_switch(Boolean bool) {
            this.hotsearch_aweme_billboard_switch = bool;
            return this;
        }

        public final Builder hotsearch_billboard_switch(Boolean bool) {
            this.hotsearch_billboard_switch = bool;
            return this;
        }

        public final Builder hotsearch_music_billboard_switch(Boolean bool) {
            this.hotsearch_music_billboard_switch = bool;
            return this;
        }

        public final Builder hotsearch_positive_energy_billboard_switch(Boolean bool) {
            this.hotsearch_positive_energy_billboard_switch = bool;
            return this;
        }

        public final Builder hotsearch_star_billboard_switch(Boolean bool) {
            this.hotsearch_star_billboard_switch = bool;
            return this;
        }
    }

    static final class ProtoAdapter_HotSearchWitch extends DefaultValueProtoAdapter<HotSearchWitch> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final HotSearchWitch redact(HotSearchWitch hotSearchWitch) {
            return hotSearchWitch;
        }

        public ProtoAdapter_HotSearchWitch() {
            super(FieldEncoding.LENGTH_DELIMITED, HotSearchWitch.class);
        }

        public final HotSearchWitch decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48031, new Class[]{ProtoReader.class}, HotSearchWitch.class)) {
                return decode(protoReader2, (HotSearchWitch) null);
            }
            return (HotSearchWitch) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48031, new Class[]{ProtoReader.class}, HotSearchWitch.class);
        }

        public final int encodedSize(HotSearchWitch hotSearchWitch) {
            HotSearchWitch hotSearchWitch2 = hotSearchWitch;
            if (!PatchProxy.isSupport(new Object[]{hotSearchWitch2}, this, changeQuickRedirect, false, 48029, new Class[]{HotSearchWitch.class}, Integer.TYPE)) {
                return ProtoAdapter.BOOL.encodedSizeWithTag(1, hotSearchWitch2.hotsearch_billboard_switch) + ProtoAdapter.BOOL.encodedSizeWithTag(2, hotSearchWitch2.hotsearch_music_billboard_switch) + ProtoAdapter.BOOL.encodedSizeWithTag(3, hotSearchWitch2.hotsearch_aweme_billboard_switch) + ProtoAdapter.BOOL.encodedSizeWithTag(4, hotSearchWitch2.hotsearch_positive_energy_billboard_switch) + ProtoAdapter.BOOL.encodedSizeWithTag(5, hotSearchWitch2.hotsearch_star_billboard_switch) + hotSearchWitch.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{hotSearchWitch2}, this, changeQuickRedirect, false, 48029, new Class[]{HotSearchWitch.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, HotSearchWitch hotSearchWitch) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            HotSearchWitch hotSearchWitch2 = hotSearchWitch;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, hotSearchWitch2}, this, changeQuickRedirect, false, 48030, new Class[]{ProtoWriter.class, HotSearchWitch.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, hotSearchWitch2}, this, changeQuickRedirect, false, 48030, new Class[]{ProtoWriter.class, HotSearchWitch.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1, hotSearchWitch2.hotsearch_billboard_switch);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 2, hotSearchWitch2.hotsearch_music_billboard_switch);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 3, hotSearchWitch2.hotsearch_aweme_billboard_switch);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 4, hotSearchWitch2.hotsearch_positive_energy_billboard_switch);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 5, hotSearchWitch2.hotsearch_star_billboard_switch);
            protoWriter2.writeBytes(hotSearchWitch.unknownFields());
        }

        public final HotSearchWitch decode(ProtoReader protoReader, HotSearchWitch hotSearchWitch) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            HotSearchWitch hotSearchWitch2 = hotSearchWitch;
            if (PatchProxy.isSupport(new Object[]{protoReader2, hotSearchWitch2}, this, changeQuickRedirect, false, 48032, new Class[]{ProtoReader.class, HotSearchWitch.class}, HotSearchWitch.class)) {
                return (HotSearchWitch) PatchProxy.accessDispatch(new Object[]{protoReader2, hotSearchWitch2}, this, changeQuickRedirect, false, 48032, new Class[]{ProtoReader.class, HotSearchWitch.class}, HotSearchWitch.class);
            }
            HotSearchWitch hotSearchWitch3 = (HotSearchWitch) a.a().a(HotSearchWitch.class, hotSearchWitch2);
            if (hotSearchWitch3 != null) {
                builder = hotSearchWitch3.newBuilder();
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
                            builder2.hotsearch_billboard_switch((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 2:
                            builder2.hotsearch_music_billboard_switch((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 3:
                            builder2.hotsearch_aweme_billboard_switch((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 4:
                            builder2.hotsearch_positive_energy_billboard_switch((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 5:
                            builder2.hotsearch_star_billboard_switch((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (hotSearchWitch3 != null) {
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
    public final Boolean getHotsearchAwemeBillboardSwitch() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48021, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48021, new Class[0], Boolean.class);
        } else if (this.hotsearch_aweme_billboard_switch != null) {
            return this.hotsearch_aweme_billboard_switch;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean getHotsearchBillboardSwitch() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48019, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48019, new Class[0], Boolean.class);
        } else if (this.hotsearch_billboard_switch != null) {
            return this.hotsearch_billboard_switch;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean getHotsearchMusicBillboardSwitch() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48020, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48020, new Class[0], Boolean.class);
        } else if (this.hotsearch_music_billboard_switch != null) {
            return this.hotsearch_music_billboard_switch;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean getHotsearchPositiveEnergyBillboardSwitch() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48022, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48022, new Class[0], Boolean.class);
        } else if (this.hotsearch_positive_energy_billboard_switch != null) {
            return this.hotsearch_positive_energy_billboard_switch;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean getHotsearchStarBillboardSwitch() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48023, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48023, new Class[0], Boolean.class);
        } else if (this.hotsearch_star_billboard_switch != null) {
            return this.hotsearch_star_billboard_switch;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48024, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48024, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.hotsearch_billboard_switch = this.hotsearch_billboard_switch;
        builder.hotsearch_music_billboard_switch = this.hotsearch_music_billboard_switch;
        builder.hotsearch_aweme_billboard_switch = this.hotsearch_aweme_billboard_switch;
        builder.hotsearch_positive_energy_billboard_switch = this.hotsearch_positive_energy_billboard_switch;
        builder.hotsearch_star_billboard_switch = this.hotsearch_star_billboard_switch;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48026, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48026, new Class[0], Integer.TYPE)).intValue();
        }
        int i6 = this.hashCode;
        if (i6 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.hotsearch_billboard_switch != null) {
                i = this.hotsearch_billboard_switch.hashCode();
            } else {
                i = 0;
            }
            int i7 = (hashCode + i) * 37;
            if (this.hotsearch_music_billboard_switch != null) {
                i2 = this.hotsearch_music_billboard_switch.hashCode();
            } else {
                i2 = 0;
            }
            int i8 = (i7 + i2) * 37;
            if (this.hotsearch_aweme_billboard_switch != null) {
                i3 = this.hotsearch_aweme_billboard_switch.hashCode();
            } else {
                i3 = 0;
            }
            int i9 = (i8 + i3) * 37;
            if (this.hotsearch_positive_energy_billboard_switch != null) {
                i4 = this.hotsearch_positive_energy_billboard_switch.hashCode();
            } else {
                i4 = 0;
            }
            int i10 = (i9 + i4) * 37;
            if (this.hotsearch_star_billboard_switch != null) {
                i5 = this.hotsearch_star_billboard_switch.hashCode();
            }
            i6 = i10 + i5;
            this.hashCode = i6;
        }
        return i6;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48027, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48027, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.hotsearch_billboard_switch != null) {
            sb.append(", hotsearch_billboard_switch=");
            sb.append(this.hotsearch_billboard_switch);
        }
        if (this.hotsearch_music_billboard_switch != null) {
            sb.append(", hotsearch_music_billboard_switch=");
            sb.append(this.hotsearch_music_billboard_switch);
        }
        if (this.hotsearch_aweme_billboard_switch != null) {
            sb.append(", hotsearch_aweme_billboard_switch=");
            sb.append(this.hotsearch_aweme_billboard_switch);
        }
        if (this.hotsearch_positive_energy_billboard_switch != null) {
            sb.append(", hotsearch_positive_energy_billboard_switch=");
            sb.append(this.hotsearch_positive_energy_billboard_switch);
        }
        if (this.hotsearch_star_billboard_switch != null) {
            sb.append(", hotsearch_star_billboard_switch=");
            sb.append(this.hotsearch_star_billboard_switch);
        }
        StringBuilder replace = sb.replace(0, 2, "HotSearchWitch{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 48025, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 48025, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof HotSearchWitch)) {
                return false;
            }
            HotSearchWitch hotSearchWitch = (HotSearchWitch) obj;
            if (!unknownFields().equals(hotSearchWitch.unknownFields()) || !Internal.equals(this.hotsearch_billboard_switch, hotSearchWitch.hotsearch_billboard_switch) || !Internal.equals(this.hotsearch_music_billboard_switch, hotSearchWitch.hotsearch_music_billboard_switch) || !Internal.equals(this.hotsearch_aweme_billboard_switch, hotSearchWitch.hotsearch_aweme_billboard_switch) || !Internal.equals(this.hotsearch_positive_energy_billboard_switch, hotSearchWitch.hotsearch_positive_energy_billboard_switch) || !Internal.equals(this.hotsearch_star_billboard_switch, hotSearchWitch.hotsearch_star_billboard_switch)) {
                return false;
            }
            return true;
        }
    }

    public HotSearchWitch(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        this(bool, bool2, bool3, bool4, bool5, ByteString.EMPTY);
    }

    public HotSearchWitch(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.hotsearch_billboard_switch = bool;
        this.hotsearch_music_billboard_switch = bool2;
        this.hotsearch_aweme_billboard_switch = bool3;
        this.hotsearch_positive_energy_billboard_switch = bool4;
        this.hotsearch_star_billboard_switch = bool5;
    }
}
