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

public final class FreeGift extends Message<FreeGift, Builder> {
    public static final ProtoAdapter<FreeGift> ADAPTER = new ProtoAdapter_FreeGift();
    public static final Long DEFAULT_COUNT = 0L;
    public static final Long DEFAULT_FAN_TICKETS = 0L;
    public static final Long DEFAULT_GROUP_ID = 0L;
    public static final Long DEFAULT_ID = 0L;
    public static final Long DEFAULT_REPEAT_COUNT = 0L;
    public static final Long DEFAULT_WATERWMLON = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String content;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
    public final Long fan_tickets;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long group_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public final Long repeat_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 7)
    public final Long waterwmlon;

    public static final class Builder extends Message.Builder<FreeGift, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String content;
        public Long count;
        public Long fan_tickets;
        public Long group_id;
        public Long id;
        public Long repeat_count;
        public Long waterwmlon;

        public final FreeGift build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11470, new Class[0], FreeGift.class)) {
                return (FreeGift) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11470, new Class[0], FreeGift.class);
            }
            FreeGift freeGift = new FreeGift(this.id, this.count, this.content, this.group_id, this.repeat_count, this.fan_tickets, this.waterwmlon, super.buildUnknownFields());
            return freeGift;
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }

        public final Builder count(Long l) {
            this.count = l;
            return this;
        }

        public final Builder fan_tickets(Long l) {
            this.fan_tickets = l;
            return this;
        }

        public final Builder group_id(Long l) {
            this.group_id = l;
            return this;
        }

        public final Builder id(Long l) {
            this.id = l;
            return this;
        }

        public final Builder repeat_count(Long l) {
            this.repeat_count = l;
            return this;
        }

        public final Builder waterwmlon(Long l) {
            this.waterwmlon = l;
            return this;
        }
    }

    static final class ProtoAdapter_FreeGift extends ProtoAdapter<FreeGift> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_FreeGift() {
            super(FieldEncoding.LENGTH_DELIMITED, FreeGift.class);
        }

        public final FreeGift redact(FreeGift freeGift) {
            if (PatchProxy.isSupport(new Object[]{freeGift}, this, changeQuickRedirect, false, 11474, new Class[]{FreeGift.class}, FreeGift.class)) {
                return (FreeGift) PatchProxy.accessDispatch(new Object[]{freeGift}, this, changeQuickRedirect, false, 11474, new Class[]{FreeGift.class}, FreeGift.class);
            }
            Builder newBuilder = freeGift.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final FreeGift decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11473, new Class[]{ProtoReader.class}, FreeGift.class)) {
                return (FreeGift) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11473, new Class[]{ProtoReader.class}, FreeGift.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 2:
                            builder.count((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 3:
                            builder.content((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 4:
                            builder.group_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 5:
                            builder.repeat_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 6:
                            builder.fan_tickets((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case e.l /*7*/:
                            builder.waterwmlon((Long) ProtoAdapter.INT64.decode(protoReader2));
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

        public final int encodedSize(FreeGift freeGift) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            FreeGift freeGift2 = freeGift;
            int i7 = 0;
            if (PatchProxy.isSupport(new Object[]{freeGift2}, this, changeQuickRedirect, false, 11471, new Class[]{FreeGift.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{freeGift2}, this, changeQuickRedirect, false, 11471, new Class[]{FreeGift.class}, Integer.TYPE)).intValue();
            }
            if (freeGift2.id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, freeGift2.id);
            } else {
                i = 0;
            }
            if (freeGift2.count != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, freeGift2.count);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (freeGift2.content != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, freeGift2.content);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (freeGift2.group_id != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, freeGift2.group_id);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (freeGift2.repeat_count != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, freeGift2.repeat_count);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (freeGift2.fan_tickets != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, freeGift2.fan_tickets);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (freeGift2.waterwmlon != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, freeGift2.waterwmlon);
            }
            return i12 + i7 + freeGift.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, FreeGift freeGift) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            FreeGift freeGift2 = freeGift;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, freeGift2}, this, changeQuickRedirect, false, 11472, new Class[]{ProtoWriter.class, FreeGift.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, freeGift2}, this, changeQuickRedirect, false, 11472, new Class[]{ProtoWriter.class, FreeGift.class}, Void.TYPE);
                return;
            }
            if (freeGift2.id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1, freeGift2.id);
            }
            if (freeGift2.count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, freeGift2.count);
            }
            if (freeGift2.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, freeGift2.content);
            }
            if (freeGift2.group_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, freeGift2.group_id);
            }
            if (freeGift2.repeat_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 5, freeGift2.repeat_count);
            }
            if (freeGift2.fan_tickets != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 6, freeGift2.fan_tickets);
            }
            if (freeGift2.waterwmlon != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 7, freeGift2.waterwmlon);
            }
            protoWriter2.writeBytes(freeGift.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11466, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11466, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.id = this.id;
        builder.count = this.count;
        builder.content = this.content;
        builder.group_id = this.group_id;
        builder.repeat_count = this.repeat_count;
        builder.fan_tickets = this.fan_tickets;
        builder.waterwmlon = this.waterwmlon;
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
        int i7 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11468, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11468, new Class[0], Integer.TYPE)).intValue();
        }
        int i8 = this.hashCode;
        if (i8 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.id != null) {
                i = this.id.hashCode();
            } else {
                i = 0;
            }
            int i9 = (hashCode + i) * 37;
            if (this.count != null) {
                i2 = this.count.hashCode();
            } else {
                i2 = 0;
            }
            int i10 = (i9 + i2) * 37;
            if (this.content != null) {
                i3 = this.content.hashCode();
            } else {
                i3 = 0;
            }
            int i11 = (i10 + i3) * 37;
            if (this.group_id != null) {
                i4 = this.group_id.hashCode();
            } else {
                i4 = 0;
            }
            int i12 = (i11 + i4) * 37;
            if (this.repeat_count != null) {
                i5 = this.repeat_count.hashCode();
            } else {
                i5 = 0;
            }
            int i13 = (i12 + i5) * 37;
            if (this.fan_tickets != null) {
                i6 = this.fan_tickets.hashCode();
            } else {
                i6 = 0;
            }
            int i14 = (i13 + i6) * 37;
            if (this.waterwmlon != null) {
                i7 = this.waterwmlon.hashCode();
            }
            i8 = i14 + i7;
            this.hashCode = i8;
        }
        return i8;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11469, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11469, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.group_id != null) {
            sb.append(", group_id=");
            sb.append(this.group_id);
        }
        if (this.repeat_count != null) {
            sb.append(", repeat_count=");
            sb.append(this.repeat_count);
        }
        if (this.fan_tickets != null) {
            sb.append(", fan_tickets=");
            sb.append(this.fan_tickets);
        }
        if (this.waterwmlon != null) {
            sb.append(", waterwmlon=");
            sb.append(this.waterwmlon);
        }
        StringBuilder replace = sb.replace(0, 2, "FreeGift{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11467, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11467, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof FreeGift)) {
                return false;
            }
            FreeGift freeGift = (FreeGift) obj;
            if (!unknownFields().equals(freeGift.unknownFields()) || !Internal.equals(this.id, freeGift.id) || !Internal.equals(this.count, freeGift.count) || !Internal.equals(this.content, freeGift.content) || !Internal.equals(this.group_id, freeGift.group_id) || !Internal.equals(this.repeat_count, freeGift.repeat_count) || !Internal.equals(this.fan_tickets, freeGift.fan_tickets) || !Internal.equals(this.waterwmlon, freeGift.waterwmlon)) {
                return false;
            }
            return true;
        }
    }

    public FreeGift(Long l, Long l2, String str, Long l3, Long l4, Long l5, Long l6) {
        this(l, l2, str, l3, l4, l5, l6, ByteString.EMPTY);
    }

    public FreeGift(Long l, Long l2, String str, Long l3, Long l4, Long l5, Long l6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = l;
        this.count = l2;
        this.content = str;
        this.group_id = l3;
        this.repeat_count = l4;
        this.fan_tickets = l5;
        this.waterwmlon = l6;
    }
}
