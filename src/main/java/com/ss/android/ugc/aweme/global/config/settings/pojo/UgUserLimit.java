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

public final class UgUserLimit extends Message<UgUserLimit, Builder> {
    public static final DefaultValueProtoAdapter<UgUserLimit> ADAPTER = new ProtoAdapter_UgUserLimit();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer active_days;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean show_for_active;

    public static final class Builder extends Message.Builder<UgUserLimit, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Integer active_days;
        public Boolean show_for_active;

        public final UgUserLimit build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49316, new Class[0], UgUserLimit.class)) {
                return new UgUserLimit(this.active_days, this.show_for_active, super.buildUnknownFields());
            }
            return (UgUserLimit) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49316, new Class[0], UgUserLimit.class);
        }

        public final Builder active_days(Integer num) {
            this.active_days = num;
            return this;
        }

        public final Builder show_for_active(Boolean bool) {
            this.show_for_active = bool;
            return this;
        }
    }

    static final class ProtoAdapter_UgUserLimit extends DefaultValueProtoAdapter<UgUserLimit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final UgUserLimit redact(UgUserLimit ugUserLimit) {
            return ugUserLimit;
        }

        public ProtoAdapter_UgUserLimit() {
            super(FieldEncoding.LENGTH_DELIMITED, UgUserLimit.class);
        }

        public final UgUserLimit decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49319, new Class[]{ProtoReader.class}, UgUserLimit.class)) {
                return decode(protoReader2, (UgUserLimit) null);
            }
            return (UgUserLimit) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49319, new Class[]{ProtoReader.class}, UgUserLimit.class);
        }

        public final int encodedSize(UgUserLimit ugUserLimit) {
            UgUserLimit ugUserLimit2 = ugUserLimit;
            if (!PatchProxy.isSupport(new Object[]{ugUserLimit2}, this, changeQuickRedirect, false, 49317, new Class[]{UgUserLimit.class}, Integer.TYPE)) {
                return ProtoAdapter.INT32.encodedSizeWithTag(1, ugUserLimit2.active_days) + ProtoAdapter.BOOL.encodedSizeWithTag(2, ugUserLimit2.show_for_active) + ugUserLimit.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{ugUserLimit2}, this, changeQuickRedirect, false, 49317, new Class[]{UgUserLimit.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, UgUserLimit ugUserLimit) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            UgUserLimit ugUserLimit2 = ugUserLimit;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, ugUserLimit2}, this, changeQuickRedirect, false, 49318, new Class[]{ProtoWriter.class, UgUserLimit.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, ugUserLimit2}, this, changeQuickRedirect, false, 49318, new Class[]{ProtoWriter.class, UgUserLimit.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 1, ugUserLimit2.active_days);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 2, ugUserLimit2.show_for_active);
            protoWriter2.writeBytes(ugUserLimit.unknownFields());
        }

        public final UgUserLimit decode(ProtoReader protoReader, UgUserLimit ugUserLimit) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            UgUserLimit ugUserLimit2 = ugUserLimit;
            if (PatchProxy.isSupport(new Object[]{protoReader2, ugUserLimit2}, this, changeQuickRedirect, false, 49320, new Class[]{ProtoReader.class, UgUserLimit.class}, UgUserLimit.class)) {
                return (UgUserLimit) PatchProxy.accessDispatch(new Object[]{protoReader2, ugUserLimit2}, this, changeQuickRedirect, false, 49320, new Class[]{ProtoReader.class, UgUserLimit.class}, UgUserLimit.class);
            }
            UgUserLimit ugUserLimit3 = (UgUserLimit) a.a().a(UgUserLimit.class, ugUserLimit2);
            if (ugUserLimit3 != null) {
                builder = ugUserLimit3.newBuilder();
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
                            builder2.active_days((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 2:
                            builder2.show_for_active((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (ugUserLimit3 != null) {
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
    public final Integer getActiveDays() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49310, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49310, new Class[0], Integer.class);
        } else if (this.active_days != null) {
            return this.active_days;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean getShowForActive() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49311, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49311, new Class[0], Boolean.class);
        } else if (this.show_for_active != null) {
            return this.show_for_active;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49312, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49312, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.active_days = this.active_days;
        builder.show_for_active = this.show_for_active;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49314, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49314, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.active_days != null) {
                i = this.active_days.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.show_for_active != null) {
                i2 = this.show_for_active.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49315, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49315, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.active_days != null) {
            sb.append(", active_days=");
            sb.append(this.active_days);
        }
        if (this.show_for_active != null) {
            sb.append(", show_for_active=");
            sb.append(this.show_for_active);
        }
        StringBuilder replace = sb.replace(0, 2, "UgUserLimit{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49313, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49313, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof UgUserLimit)) {
                return false;
            }
            UgUserLimit ugUserLimit = (UgUserLimit) obj;
            if (!unknownFields().equals(ugUserLimit.unknownFields()) || !Internal.equals(this.active_days, ugUserLimit.active_days) || !Internal.equals(this.show_for_active, ugUserLimit.show_for_active)) {
                return false;
            }
            return true;
        }
    }

    public UgUserLimit(Integer num, Boolean bool) {
        this(num, bool, ByteString.EMPTY);
    }

    public UgUserLimit(Integer num, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.active_days = num;
        this.show_for_active = bool;
    }
}
