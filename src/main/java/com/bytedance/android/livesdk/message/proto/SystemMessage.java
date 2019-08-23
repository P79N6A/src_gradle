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

public final class SystemMessage extends Message<SystemMessage, Builder> {
    public static final ProtoAdapter<SystemMessage> ADAPTER = new ProtoAdapter_SystemMessage();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.SystemMessage$Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String content;

    public static final class Common extends Message<Common, Builder> {
        public static final ProtoAdapter<Common> ADAPTER = new ProtoAdapter_Common();
        public static final Long DEFAULT_CREATE_TIME = 0L;
        public static final Integer DEFAULT_MONITOR = 0;
        public static final Long DEFAULT_MSG_ID = 0L;
        public static final Long DEFAULT_ROOM_ID = 0L;
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
        public final Long create_time;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
        public final String method;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
        public final Integer monitor;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
        public final Long msg_id;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
        public final Long room_id;

        public static final class Builder extends Message.Builder<Common, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public Long create_time;
            public String method;
            public Integer monitor;
            public Long msg_id;
            public Long room_id;

            public final Common build() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12192, new Class[0], Common.class)) {
                    return (Common) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12192, new Class[0], Common.class);
                }
                Common common = new Common(this.method, this.msg_id, this.room_id, this.create_time, this.monitor, super.buildUnknownFields());
                return common;
            }

            public final Builder create_time(Long l) {
                this.create_time = l;
                return this;
            }

            public final Builder method(String str) {
                this.method = str;
                return this;
            }

            public final Builder monitor(Integer num) {
                this.monitor = num;
                return this;
            }

            public final Builder msg_id(Long l) {
                this.msg_id = l;
                return this;
            }

            public final Builder room_id(Long l) {
                this.room_id = l;
                return this;
            }
        }

        static final class ProtoAdapter_Common extends ProtoAdapter<Common> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_Common() {
                super(FieldEncoding.LENGTH_DELIMITED, Common.class);
            }

            public final Common redact(Common common) {
                if (PatchProxy.isSupport(new Object[]{common}, this, changeQuickRedirect, false, 12196, new Class[]{Common.class}, Common.class)) {
                    return (Common) PatchProxy.accessDispatch(new Object[]{common}, this, changeQuickRedirect, false, 12196, new Class[]{Common.class}, Common.class);
                }
                Builder newBuilder = common.newBuilder();
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final Common decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12195, new Class[]{ProtoReader.class}, Common.class)) {
                    return (Common) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12195, new Class[]{ProtoReader.class}, Common.class);
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
                                builder.msg_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 3:
                                builder.room_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 4:
                                builder.create_time((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 5:
                                builder.monitor((Integer) ProtoAdapter.INT32.decode(protoReader2));
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

            public final int encodedSize(Common common) {
                int i;
                int i2;
                int i3;
                int i4;
                Common common2 = common;
                int i5 = 0;
                if (PatchProxy.isSupport(new Object[]{common2}, this, changeQuickRedirect, false, 12193, new Class[]{Common.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{common2}, this, changeQuickRedirect, false, 12193, new Class[]{Common.class}, Integer.TYPE)).intValue();
                }
                if (common2.method != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, common2.method);
                } else {
                    i = 0;
                }
                if (common2.msg_id != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, common2.msg_id);
                } else {
                    i2 = 0;
                }
                int i6 = i + i2;
                if (common2.room_id != null) {
                    i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, common2.room_id);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (common2.create_time != null) {
                    i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, common2.create_time);
                } else {
                    i4 = 0;
                }
                int i8 = i7 + i4;
                if (common2.monitor != null) {
                    i5 = ProtoAdapter.INT32.encodedSizeWithTag(5, common2.monitor);
                }
                return i8 + i5 + common.unknownFields().size();
            }

            public final void encode(ProtoWriter protoWriter, Common common) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                Common common2 = common;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, common2}, this, changeQuickRedirect, false, 12194, new Class[]{ProtoWriter.class, Common.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, common2}, this, changeQuickRedirect, false, 12194, new Class[]{ProtoWriter.class, Common.class}, Void.TYPE);
                    return;
                }
                if (common2.method != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, common2.method);
                }
                if (common2.msg_id != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, common2.msg_id);
                }
                if (common2.room_id != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, common2.room_id);
                }
                if (common2.create_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, common2.create_time);
                }
                if (common2.monitor != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter2, 5, common2.monitor);
                }
                protoWriter2.writeBytes(common.unknownFields());
            }
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12188, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12188, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.method = this.method;
            builder.msg_id = this.msg_id;
            builder.room_id = this.room_id;
            builder.create_time = this.create_time;
            builder.monitor = this.monitor;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12190, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12190, new Class[0], Integer.TYPE)).intValue();
            }
            int i6 = this.hashCode;
            if (i6 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                if (this.method != null) {
                    i = this.method.hashCode();
                } else {
                    i = 0;
                }
                int i7 = (hashCode + i) * 37;
                if (this.msg_id != null) {
                    i2 = this.msg_id.hashCode();
                } else {
                    i2 = 0;
                }
                int i8 = (i7 + i2) * 37;
                if (this.room_id != null) {
                    i3 = this.room_id.hashCode();
                } else {
                    i3 = 0;
                }
                int i9 = (i8 + i3) * 37;
                if (this.create_time != null) {
                    i4 = this.create_time.hashCode();
                } else {
                    i4 = 0;
                }
                int i10 = (i9 + i4) * 37;
                if (this.monitor != null) {
                    i5 = this.monitor.hashCode();
                }
                i6 = i10 + i5;
                this.hashCode = i6;
            }
            return i6;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12191, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12191, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (this.method != null) {
                sb.append(", method=");
                sb.append(this.method);
            }
            if (this.msg_id != null) {
                sb.append(", msg_id=");
                sb.append(this.msg_id);
            }
            if (this.room_id != null) {
                sb.append(", room_id=");
                sb.append(this.room_id);
            }
            if (this.create_time != null) {
                sb.append(", create_time=");
                sb.append(this.create_time);
            }
            if (this.monitor != null) {
                sb.append(", monitor=");
                sb.append(this.monitor);
            }
            StringBuilder replace = sb.replace(0, 2, "Common{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12189, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12189, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof Common)) {
                    return false;
                }
                Common common = (Common) obj;
                if (!unknownFields().equals(common.unknownFields()) || !Internal.equals(this.method, common.method) || !Internal.equals(this.msg_id, common.msg_id) || !Internal.equals(this.room_id, common.room_id) || !Internal.equals(this.create_time, common.create_time) || !Internal.equals(this.monitor, common.monitor)) {
                    return false;
                }
                return true;
            }
        }

        public Common(String str, Long l, Long l2, Long l3, Integer num) {
            this(str, l, l2, l3, num, ByteString.EMPTY);
        }

        public Common(String str, Long l, Long l2, Long l3, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            this.method = str;
            this.msg_id = l;
            this.room_id = l2;
            this.create_time = l3;
            this.monitor = num;
        }
    }

    public static final class Builder extends Message.Builder<SystemMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public String content;

        public final SystemMessage build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12187, new Class[0], SystemMessage.class)) {
                return new SystemMessage(this.common, this.content, super.buildUnknownFields());
            }
            return (SystemMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12187, new Class[0], SystemMessage.class);
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

    static final class ProtoAdapter_SystemMessage extends ProtoAdapter<SystemMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_SystemMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, SystemMessage.class);
        }

        public final int encodedSize(SystemMessage systemMessage) {
            int i;
            SystemMessage systemMessage2 = systemMessage;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{systemMessage2}, this, changeQuickRedirect, false, 12197, new Class[]{SystemMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{systemMessage2}, this, changeQuickRedirect, false, 12197, new Class[]{SystemMessage.class}, Integer.TYPE)).intValue();
            }
            if (systemMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, systemMessage2.common);
            } else {
                i = 0;
            }
            if (systemMessage2.content != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, systemMessage2.content);
            }
            return i + i2 + systemMessage.unknownFields().size();
        }

        public final SystemMessage redact(SystemMessage systemMessage) {
            if (PatchProxy.isSupport(new Object[]{systemMessage}, this, changeQuickRedirect, false, 12200, new Class[]{SystemMessage.class}, SystemMessage.class)) {
                return (SystemMessage) PatchProxy.accessDispatch(new Object[]{systemMessage}, this, changeQuickRedirect, false, 12200, new Class[]{SystemMessage.class}, SystemMessage.class);
            }
            Builder newBuilder = systemMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final SystemMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12199, new Class[]{ProtoReader.class}, SystemMessage.class)) {
                return (SystemMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12199, new Class[]{ProtoReader.class}, SystemMessage.class);
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

        public final void encode(ProtoWriter protoWriter, SystemMessage systemMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            SystemMessage systemMessage2 = systemMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, systemMessage2}, this, changeQuickRedirect, false, 12198, new Class[]{ProtoWriter.class, SystemMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, systemMessage2}, this, changeQuickRedirect, false, 12198, new Class[]{ProtoWriter.class, SystemMessage.class}, Void.TYPE);
                return;
            }
            if (systemMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, systemMessage2.common);
            }
            if (systemMessage2.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, systemMessage2.content);
            }
            protoWriter2.writeBytes(systemMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12183, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12183, new Class[0], Builder.class);
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12185, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12185, new Class[0], Integer.TYPE)).intValue();
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12186, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12186, new Class[0], String.class);
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
        StringBuilder replace = sb.replace(0, 2, "SystemMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12184, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12184, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof SystemMessage)) {
                return false;
            }
            SystemMessage systemMessage = (SystemMessage) obj;
            if (!unknownFields().equals(systemMessage.unknownFields()) || !Internal.equals(this.common, systemMessage.common) || !Internal.equals(this.content, systemMessage.content)) {
                return false;
            }
            return true;
        }
    }

    public SystemMessage(Common common2, String str) {
        this(common2, str, ByteString.EMPTY);
    }

    public SystemMessage(Common common2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.content = str;
    }
}
