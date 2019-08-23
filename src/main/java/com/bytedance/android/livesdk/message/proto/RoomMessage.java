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

public final class RoomMessage extends Message<RoomMessage, Builder> {
    public static final ProtoAdapter<RoomMessage> ADAPTER = new ProtoAdapter_RoomMessage();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String content;

    public static final class Builder extends Message.Builder<RoomMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public String content;

        public final RoomMessage build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12085, new Class[0], RoomMessage.class)) {
                return new RoomMessage(this.common, this.content, super.buildUnknownFields());
            }
            return (RoomMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12085, new Class[0], RoomMessage.class);
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }
    }

    static final class ProtoAdapter_RoomMessage extends ProtoAdapter<RoomMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_RoomMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, RoomMessage.class);
        }

        public final int encodedSize(RoomMessage roomMessage) {
            int i;
            RoomMessage roomMessage2 = roomMessage;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{roomMessage2}, this, changeQuickRedirect, false, 12086, new Class[]{RoomMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{roomMessage2}, this, changeQuickRedirect, false, 12086, new Class[]{RoomMessage.class}, Integer.TYPE)).intValue();
            }
            if (roomMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, roomMessage2.common);
            } else {
                i = 0;
            }
            if (roomMessage2.content != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, roomMessage2.content);
            }
            return i + i2 + roomMessage.unknownFields().size();
        }

        public final RoomMessage redact(RoomMessage roomMessage) {
            if (PatchProxy.isSupport(new Object[]{roomMessage}, this, changeQuickRedirect, false, 12089, new Class[]{RoomMessage.class}, RoomMessage.class)) {
                return (RoomMessage) PatchProxy.accessDispatch(new Object[]{roomMessage}, this, changeQuickRedirect, false, 12089, new Class[]{RoomMessage.class}, RoomMessage.class);
            }
            Builder newBuilder = roomMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final RoomMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12088, new Class[]{ProtoReader.class}, RoomMessage.class)) {
                return (RoomMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12088, new Class[]{ProtoReader.class}, RoomMessage.class);
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
                            builder.content((String) ProtoAdapter.STRING.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, RoomMessage roomMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            RoomMessage roomMessage2 = roomMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, roomMessage2}, this, changeQuickRedirect, false, 12087, new Class[]{ProtoWriter.class, RoomMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, roomMessage2}, this, changeQuickRedirect, false, 12087, new Class[]{ProtoWriter.class, RoomMessage.class}, Void.TYPE);
                return;
            }
            if (roomMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, roomMessage2.common);
            }
            if (roomMessage2.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, roomMessage2.content);
            }
            protoWriter2.writeBytes(roomMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12081, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12081, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.content = this.content;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12083, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12083, new Class[0], Integer.TYPE)).intValue();
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
            if (this.content != null) {
                i2 = this.content.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12084, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12084, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        StringBuilder replace = sb.replace(0, 2, "RoomMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12082, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12082, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof RoomMessage)) {
                return false;
            }
            RoomMessage roomMessage = (RoomMessage) obj;
            if (!unknownFields().equals(roomMessage.unknownFields()) || !Internal.equals(this.common, roomMessage.common) || !Internal.equals(this.content, roomMessage.content)) {
                return false;
            }
            return true;
        }
    }

    public RoomMessage(Common common2, String str) {
        this(common2, str, ByteString.EMPTY);
    }

    public RoomMessage(Common common2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.content = str;
    }
}