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
import java.util.List;
import okio.ByteString;

public final class Response extends Message<Response, Builder> {
    public static final ProtoAdapter<Response> ADAPTER = new ProtoAdapter_Response();
    public static final Long DEFAULT_FETCH_INTERVAL = 0L;
    public static final Long DEFAULT_NOW = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String cursor;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long fetch_interval;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String internal_ext;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Message#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<Message> messages;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long now;

    public static final class Builder extends Message.Builder<Response, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String cursor;
        public Long fetch_interval;
        public String internal_ext;
        public List<Message> messages = Internal.newMutableList();
        public Long now;

        public final Response build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12058, new Class[0], Response.class)) {
                return (Response) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12058, new Class[0], Response.class);
            }
            Response response = new Response(this.messages, this.cursor, this.fetch_interval, this.now, this.internal_ext, super.buildUnknownFields());
            return response;
        }

        public final Builder cursor(String str) {
            this.cursor = str;
            return this;
        }

        public final Builder fetch_interval(Long l) {
            this.fetch_interval = l;
            return this;
        }

        public final Builder internal_ext(String str) {
            this.internal_ext = str;
            return this;
        }

        public final Builder now(Long l) {
            this.now = l;
            return this;
        }

        public final Builder messages(List<Message> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 12057, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 12057, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.messages = list;
            return this;
        }
    }

    static final class ProtoAdapter_Response extends ProtoAdapter<Response> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_Response() {
            super(FieldEncoding.LENGTH_DELIMITED, Response.class);
        }

        public final Response redact(Response response) {
            if (PatchProxy.isSupport(new Object[]{response}, this, changeQuickRedirect, false, 12062, new Class[]{Response.class}, Response.class)) {
                return (Response) PatchProxy.accessDispatch(new Object[]{response}, this, changeQuickRedirect, false, 12062, new Class[]{Response.class}, Response.class);
            }
            Builder newBuilder = response.newBuilder();
            Internal.redactElements(newBuilder.messages, Message.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final Response decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12061, new Class[]{ProtoReader.class}, Response.class)) {
                return (Response) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12061, new Class[]{ProtoReader.class}, Response.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.messages.add(Message.ADAPTER.decode(protoReader2));
                            break;
                        case 2:
                            builder.cursor((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 3:
                            builder.fetch_interval((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 4:
                            builder.now((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 5:
                            builder.internal_ext((String) ProtoAdapter.STRING.decode(protoReader2));
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

        public final int encodedSize(Response response) {
            int i;
            int i2;
            int i3;
            Response response2 = response;
            int i4 = 0;
            if (PatchProxy.isSupport(new Object[]{response2}, this, changeQuickRedirect, false, 12059, new Class[]{Response.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{response2}, this, changeQuickRedirect, false, 12059, new Class[]{Response.class}, Integer.TYPE)).intValue();
            }
            int encodedSizeWithTag = Message.ADAPTER.asRepeated().encodedSizeWithTag(1, response2.messages);
            if (response2.cursor != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, response2.cursor);
            } else {
                i = 0;
            }
            int i5 = encodedSizeWithTag + i;
            if (response2.fetch_interval != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, response2.fetch_interval);
            } else {
                i2 = 0;
            }
            int i6 = i5 + i2;
            if (response2.now != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(4, response2.now);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (response2.internal_ext != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, response2.internal_ext);
            }
            return i7 + i4 + response.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, Response response) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            Response response2 = response;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, response2}, this, changeQuickRedirect, false, 12060, new Class[]{ProtoWriter.class, Response.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, response2}, this, changeQuickRedirect, false, 12060, new Class[]{ProtoWriter.class, Response.class}, Void.TYPE);
                return;
            }
            Message.ADAPTER.asRepeated().encodeWithTag(protoWriter2, 1, response2.messages);
            if (response2.cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, response2.cursor);
            }
            if (response2.fetch_interval != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, response2.fetch_interval);
            }
            if (response2.now != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, response2.now);
            }
            if (response2.internal_ext != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 5, response2.internal_ext);
            }
            protoWriter2.writeBytes(response.unknownFields());
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12055, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12055, new Class[0], Integer.TYPE)).intValue();
        }
        int i5 = this.hashCode;
        if (i5 == 0) {
            int hashCode = ((unknownFields().hashCode() * 37) + this.messages.hashCode()) * 37;
            if (this.cursor != null) {
                i = this.cursor.hashCode();
            } else {
                i = 0;
            }
            int i6 = (hashCode + i) * 37;
            if (this.fetch_interval != null) {
                i2 = this.fetch_interval.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 37;
            if (this.now != null) {
                i3 = this.now.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 37;
            if (this.internal_ext != null) {
                i4 = this.internal_ext.hashCode();
            }
            i5 = i8 + i4;
            this.hashCode = i5;
        }
        return i5;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12053, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12053, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.messages = Internal.copyOf("messages", this.messages);
        builder.cursor = this.cursor;
        builder.fetch_interval = this.fetch_interval;
        builder.now = this.now;
        builder.internal_ext = this.internal_ext;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12056, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12056, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (!this.messages.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.fetch_interval != null) {
            sb.append(", fetch_interval=");
            sb.append(this.fetch_interval);
        }
        if (this.now != null) {
            sb.append(", now=");
            sb.append(this.now);
        }
        if (this.internal_ext != null) {
            sb.append(", internal_ext=");
            sb.append(this.internal_ext);
        }
        StringBuilder replace = sb.replace(0, 2, "Response{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12054, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12054, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof Response)) {
                return false;
            }
            Response response = (Response) obj;
            if (!unknownFields().equals(response.unknownFields()) || !this.messages.equals(response.messages) || !Internal.equals(this.cursor, response.cursor) || !Internal.equals(this.fetch_interval, response.fetch_interval) || !Internal.equals(this.now, response.now) || !Internal.equals(this.internal_ext, response.internal_ext)) {
                return false;
            }
            return true;
        }
    }

    public Response(List<Message> list, String str, Long l, Long l2, String str2) {
        this(list, str, l, l2, str2, ByteString.EMPTY);
    }

    public Response(List<Message> list, String str, Long l, Long l2, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.messages = Internal.immutableCopyOf("messages", list);
        this.cursor = str;
        this.fetch_interval = l;
        this.now = l2;
        this.internal_ext = str2;
    }
}
