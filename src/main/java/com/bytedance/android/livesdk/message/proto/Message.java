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

public final class Message extends com.squareup.wire.Message<Message, Builder> {
    public static final ProtoAdapter<Message> ADAPTER = new ProtoAdapter_Message();
    public static final ByteString DEFAULT_PAYLOAD = ByteString.EMPTY;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String method;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 2)
    public final ByteString payload;

    public static final class Builder extends Message.Builder<Message, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String method;
        public ByteString payload;

        public final Message build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11908, new Class[0], Message.class)) {
                return new Message(this.method, this.payload, super.buildUnknownFields());
            }
            return (Message) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11908, new Class[0], Message.class);
        }

        public final Builder method(String str) {
            this.method = str;
            return this;
        }

        public final Builder payload(ByteString byteString) {
            this.payload = byteString;
            return this;
        }
    }

    static final class ProtoAdapter_Message extends ProtoAdapter<Message> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_Message() {
            super(FieldEncoding.LENGTH_DELIMITED, Message.class);
        }

        public final int encodedSize(Message message) {
            int i;
            Message message2 = message;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{message2}, this, changeQuickRedirect, false, 11909, new Class[]{Message.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{message2}, this, changeQuickRedirect, false, 11909, new Class[]{Message.class}, Integer.TYPE)).intValue();
            }
            if (message2.method != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, message2.method);
            } else {
                i = 0;
            }
            if (message2.payload != null) {
                i2 = ProtoAdapter.BYTES.encodedSizeWithTag(2, message2.payload);
            }
            return i + i2 + message.unknownFields().size();
        }

        public final Message redact(Message message) {
            if (PatchProxy.isSupport(new Object[]{message}, this, changeQuickRedirect, false, 11912, new Class[]{Message.class}, Message.class)) {
                return (Message) PatchProxy.accessDispatch(new Object[]{message}, this, changeQuickRedirect, false, 11912, new Class[]{Message.class}, Message.class);
            }
            Builder newBuilder = message.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final Message decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11911, new Class[]{ProtoReader.class}, Message.class)) {
                return (Message) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11911, new Class[]{ProtoReader.class}, Message.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.method((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 2:
                            builder.payload((ByteString) ProtoAdapter.BYTES.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, Message message) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            Message message2 = message;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, message2}, this, changeQuickRedirect, false, 11910, new Class[]{ProtoWriter.class, Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, message2}, this, changeQuickRedirect, false, 11910, new Class[]{ProtoWriter.class, Message.class}, Void.TYPE);
                return;
            }
            if (message2.method != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, message2.method);
            }
            if (message2.payload != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter2, 2, message2.payload);
            }
            protoWriter2.writeBytes(message.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11904, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11904, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.method = this.method;
        builder.payload = this.payload;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11906, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11906, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.method != null) {
                i = this.method.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.payload != null) {
                i2 = this.payload.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11907, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11907, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.method != null) {
            sb.append(", method=");
            sb.append(this.method);
        }
        if (this.payload != null) {
            sb.append(", payload=");
            sb.append(this.payload);
        }
        StringBuilder replace = sb.replace(0, 2, "Message{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11905, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11905, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof Message)) {
                return false;
            }
            Message message = (Message) obj;
            if (!unknownFields().equals(message.unknownFields()) || !Internal.equals(this.method, message.method) || !Internal.equals(this.payload, message.payload)) {
                return false;
            }
            return true;
        }
    }

    public Message(String str, ByteString byteString) {
        this(str, byteString, ByteString.EMPTY);
    }

    public Message(String str, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.method = str;
        this.payload = byteString;
    }
}
