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

public final class InstantCommandMessage extends Message<InstantCommandMessage, Builder> {
    public static final ProtoAdapter<InstantCommandMessage> ADAPTER = new ProtoAdapter_InstantCommandMessage();
    public static final Integer DEFAULT_COMMAND_TYPE = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer command_type;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.OpenSchemaCommand#ADAPTER", tag = 11)
    public final OpenSchemaCommand open_schema_command;

    public static final class Builder extends Message.Builder<InstantCommandMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Integer command_type;
        public Common common;
        public OpenSchemaCommand open_schema_command;

        public final InstantCommandMessage build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11611, new Class[0], InstantCommandMessage.class)) {
                return new InstantCommandMessage(this.common, this.command_type, this.open_schema_command, super.buildUnknownFields());
            }
            return (InstantCommandMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11611, new Class[0], InstantCommandMessage.class);
        }

        public final Builder command_type(Integer num) {
            this.command_type = num;
            return this;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder open_schema_command(OpenSchemaCommand openSchemaCommand) {
            this.open_schema_command = openSchemaCommand;
            return this;
        }
    }

    static final class ProtoAdapter_InstantCommandMessage extends ProtoAdapter<InstantCommandMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_InstantCommandMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, InstantCommandMessage.class);
        }

        public final int encodedSize(InstantCommandMessage instantCommandMessage) {
            int i;
            int i2;
            InstantCommandMessage instantCommandMessage2 = instantCommandMessage;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[]{instantCommandMessage2}, this, changeQuickRedirect, false, 11612, new Class[]{InstantCommandMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{instantCommandMessage2}, this, changeQuickRedirect, false, 11612, new Class[]{InstantCommandMessage.class}, Integer.TYPE)).intValue();
            }
            if (instantCommandMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, instantCommandMessage2.common);
            } else {
                i = 0;
            }
            if (instantCommandMessage2.command_type != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, instantCommandMessage2.command_type);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (instantCommandMessage2.open_schema_command != null) {
                i3 = OpenSchemaCommand.ADAPTER.encodedSizeWithTag(11, instantCommandMessage2.open_schema_command);
            }
            return i4 + i3 + instantCommandMessage.unknownFields().size();
        }

        public final InstantCommandMessage redact(InstantCommandMessage instantCommandMessage) {
            if (PatchProxy.isSupport(new Object[]{instantCommandMessage}, this, changeQuickRedirect, false, 11615, new Class[]{InstantCommandMessage.class}, InstantCommandMessage.class)) {
                return (InstantCommandMessage) PatchProxy.accessDispatch(new Object[]{instantCommandMessage}, this, changeQuickRedirect, false, 11615, new Class[]{InstantCommandMessage.class}, InstantCommandMessage.class);
            }
            Builder newBuilder = instantCommandMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.open_schema_command != null) {
                newBuilder.open_schema_command = (OpenSchemaCommand) OpenSchemaCommand.ADAPTER.redact(newBuilder.open_schema_command);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final InstantCommandMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11614, new Class[]{ProtoReader.class}, InstantCommandMessage.class)) {
                return (InstantCommandMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11614, new Class[]{ProtoReader.class}, InstantCommandMessage.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader2.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 11) {
                    switch (nextTag) {
                        case 1:
                            builder.common((Common) Common.ADAPTER.decode(protoReader2));
                            break;
                        case 2:
                            builder.command_type((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                            break;
                    }
                } else {
                    builder.open_schema_command((OpenSchemaCommand) OpenSchemaCommand.ADAPTER.decode(protoReader2));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, InstantCommandMessage instantCommandMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            InstantCommandMessage instantCommandMessage2 = instantCommandMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, instantCommandMessage2}, this, changeQuickRedirect, false, 11613, new Class[]{ProtoWriter.class, InstantCommandMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, instantCommandMessage2}, this, changeQuickRedirect, false, 11613, new Class[]{ProtoWriter.class, InstantCommandMessage.class}, Void.TYPE);
                return;
            }
            if (instantCommandMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, instantCommandMessage2.common);
            }
            if (instantCommandMessage2.command_type != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 2, instantCommandMessage2.command_type);
            }
            if (instantCommandMessage2.open_schema_command != null) {
                OpenSchemaCommand.ADAPTER.encodeWithTag(protoWriter2, 11, instantCommandMessage2.open_schema_command);
            }
            protoWriter2.writeBytes(instantCommandMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11607, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11607, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.command_type = this.command_type;
        builder.open_schema_command = this.open_schema_command;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11609, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11609, new Class[0], Integer.TYPE)).intValue();
        }
        int i4 = this.hashCode;
        if (i4 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i5 = (hashCode + i) * 37;
            if (this.command_type != null) {
                i2 = this.command_type.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 37;
            if (this.open_schema_command != null) {
                i3 = this.open_schema_command.hashCode();
            }
            i4 = i6 + i3;
            this.hashCode = i4;
        }
        return i4;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11610, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11610, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.command_type != null) {
            sb.append(", command_type=");
            sb.append(this.command_type);
        }
        if (this.open_schema_command != null) {
            sb.append(", open_schema_command=");
            sb.append(this.open_schema_command);
        }
        StringBuilder replace = sb.replace(0, 2, "InstantCommandMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11608, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11608, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof InstantCommandMessage)) {
                return false;
            }
            InstantCommandMessage instantCommandMessage = (InstantCommandMessage) obj;
            if (!unknownFields().equals(instantCommandMessage.unknownFields()) || !Internal.equals(this.common, instantCommandMessage.common) || !Internal.equals(this.command_type, instantCommandMessage.command_type) || !Internal.equals(this.open_schema_command, instantCommandMessage.open_schema_command)) {
                return false;
            }
            return true;
        }
    }

    public InstantCommandMessage(Common common2, Integer num, OpenSchemaCommand openSchemaCommand) {
        this(common2, num, openSchemaCommand, ByteString.EMPTY);
    }

    public InstantCommandMessage(Common common2, Integer num, OpenSchemaCommand openSchemaCommand, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.command_type = num;
        this.open_schema_command = openSchemaCommand;
    }
}
