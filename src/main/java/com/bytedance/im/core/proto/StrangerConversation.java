package com.bytedance.im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class StrangerConversation extends Message<StrangerConversation, Builder> {
    public static final ProtoAdapter<StrangerConversation> ADAPTER = new ProtoAdapter_StrangerConversation();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_UNREAD = 0;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String conversation_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long conversation_short_id;
    @WireField(adapter = "com.bytedance.im.core.proto.MessageBody#ADAPTER", tag = 3)
    public final MessageBody last_message;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer unread;

    public static final class Builder extends Message.Builder<StrangerConversation, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public MessageBody last_message;
        public Integer unread;

        public final StrangerConversation build() {
            StrangerConversation strangerConversation = new StrangerConversation(this.conversation_short_id, this.unread, this.last_message, this.conversation_id, super.buildUnknownFields());
            return strangerConversation;
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_short_id(Long l) {
            this.conversation_short_id = l;
            return this;
        }

        public final Builder last_message(MessageBody messageBody) {
            this.last_message = messageBody;
            return this;
        }

        public final Builder unread(Integer num) {
            this.unread = num;
            return this;
        }
    }

    static final class ProtoAdapter_StrangerConversation extends ProtoAdapter<StrangerConversation> {
        public ProtoAdapter_StrangerConversation() {
            super(FieldEncoding.LENGTH_DELIMITED, StrangerConversation.class);
        }

        public final StrangerConversation redact(StrangerConversation strangerConversation) {
            Builder newBuilder = strangerConversation.newBuilder();
            if (newBuilder.last_message != null) {
                newBuilder.last_message = (MessageBody) MessageBody.ADAPTER.redact(newBuilder.last_message);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(StrangerConversation strangerConversation) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, strangerConversation.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, strangerConversation.unread) + MessageBody.ADAPTER.encodedSizeWithTag(3, strangerConversation.last_message) + ProtoAdapter.STRING.encodedSizeWithTag(4, strangerConversation.conversation_id) + strangerConversation.unknownFields().size();
        }

        public final StrangerConversation decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conversation_short_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.unread((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.last_message((MessageBody) MessageBody.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.conversation_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, StrangerConversation strangerConversation) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, strangerConversation.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, strangerConversation.unread);
            MessageBody.ADAPTER.encodeWithTag(protoWriter, 3, strangerConversation.last_message);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, strangerConversation.conversation_id);
            protoWriter.writeBytes(strangerConversation.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_short_id = this.conversation_short_id;
        builder.unread = this.unread;
        builder.last_message = this.last_message;
        builder.conversation_id = this.conversation_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i5 = 0;
        if (this.conversation_short_id != null) {
            i = this.conversation_short_id.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.unread != null) {
            i2 = this.unread.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.last_message != null) {
            i3 = this.last_message.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.conversation_id != null) {
            i5 = this.conversation_id.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.unread != null) {
            sb.append(", unread=");
            sb.append(this.unread);
        }
        if (this.last_message != null) {
            sb.append(", last_message=");
            sb.append(this.last_message);
        }
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        StringBuilder replace = sb.replace(0, 2, "StrangerConversation{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StrangerConversation)) {
            return false;
        }
        StrangerConversation strangerConversation = (StrangerConversation) obj;
        if (!unknownFields().equals(strangerConversation.unknownFields()) || !Internal.equals(this.conversation_short_id, strangerConversation.conversation_short_id) || !Internal.equals(this.unread, strangerConversation.unread) || !Internal.equals(this.last_message, strangerConversation.last_message) || !Internal.equals(this.conversation_id, strangerConversation.conversation_id)) {
            return false;
        }
        return true;
    }

    public StrangerConversation(Long l, Integer num, MessageBody messageBody, String str) {
        this(l, num, messageBody, str, ByteString.EMPTY);
    }

    public StrangerConversation(Long l, Integer num, MessageBody messageBody, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_short_id = l;
        this.unread = num;
        this.last_message = messageBody;
        this.conversation_id = str;
    }
}
