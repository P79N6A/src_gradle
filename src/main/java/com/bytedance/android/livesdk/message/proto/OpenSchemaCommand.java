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

public final class OpenSchemaCommand extends Message<OpenSchemaCommand, Builder> {
    public static final ProtoAdapter<OpenSchemaCommand> ADAPTER = new ProtoAdapter_OpenSchemaCommand();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String url;

    public static final class Builder extends Message.Builder<OpenSchemaCommand, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String url;

        public final OpenSchemaCommand build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11973, new Class[0], OpenSchemaCommand.class)) {
                return new OpenSchemaCommand(this.url, super.buildUnknownFields());
            }
            return (OpenSchemaCommand) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11973, new Class[0], OpenSchemaCommand.class);
        }

        public final Builder url(String str) {
            this.url = str;
            return this;
        }
    }

    static final class ProtoAdapter_OpenSchemaCommand extends ProtoAdapter<OpenSchemaCommand> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_OpenSchemaCommand() {
            super(FieldEncoding.LENGTH_DELIMITED, OpenSchemaCommand.class);
        }

        public final OpenSchemaCommand decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11976, new Class[]{ProtoReader.class}, OpenSchemaCommand.class)) {
                return (OpenSchemaCommand) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11976, new Class[]{ProtoReader.class}, OpenSchemaCommand.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader2.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                } else {
                    builder.url((String) ProtoAdapter.STRING.decode(protoReader2));
                }
            }
        }

        public final int encodedSize(OpenSchemaCommand openSchemaCommand) {
            OpenSchemaCommand openSchemaCommand2 = openSchemaCommand;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{openSchemaCommand2}, this, changeQuickRedirect, false, 11974, new Class[]{OpenSchemaCommand.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{openSchemaCommand2}, this, changeQuickRedirect, false, 11974, new Class[]{OpenSchemaCommand.class}, Integer.TYPE)).intValue();
            }
            if (openSchemaCommand2.url != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, openSchemaCommand2.url);
            }
            return i + openSchemaCommand.unknownFields().size();
        }

        public final OpenSchemaCommand redact(OpenSchemaCommand openSchemaCommand) {
            if (PatchProxy.isSupport(new Object[]{openSchemaCommand}, this, changeQuickRedirect, false, 11977, new Class[]{OpenSchemaCommand.class}, OpenSchemaCommand.class)) {
                return (OpenSchemaCommand) PatchProxy.accessDispatch(new Object[]{openSchemaCommand}, this, changeQuickRedirect, false, 11977, new Class[]{OpenSchemaCommand.class}, OpenSchemaCommand.class);
            }
            Builder newBuilder = openSchemaCommand.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final void encode(ProtoWriter protoWriter, OpenSchemaCommand openSchemaCommand) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            OpenSchemaCommand openSchemaCommand2 = openSchemaCommand;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, openSchemaCommand2}, this, changeQuickRedirect, false, 11975, new Class[]{ProtoWriter.class, OpenSchemaCommand.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, openSchemaCommand2}, this, changeQuickRedirect, false, 11975, new Class[]{ProtoWriter.class, OpenSchemaCommand.class}, Void.TYPE);
                return;
            }
            if (openSchemaCommand2.url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, openSchemaCommand2.url);
            }
            protoWriter2.writeBytes(openSchemaCommand.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11969, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11969, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.url = this.url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11971, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11971, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.url != null) {
                i = this.url.hashCode();
            }
            i2 = hashCode + i;
            this.hashCode = i2;
        }
        return i2;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11972, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11972, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        StringBuilder replace = sb.replace(0, 2, "OpenSchemaCommand{");
        replace.append('}');
        return replace.toString();
    }

    public OpenSchemaCommand(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11970, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11970, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof OpenSchemaCommand)) {
                return false;
            }
            OpenSchemaCommand openSchemaCommand = (OpenSchemaCommand) obj;
            if (!unknownFields().equals(openSchemaCommand.unknownFields()) || !Internal.equals(this.url, openSchemaCommand.url)) {
                return false;
            }
            return true;
        }
    }

    public OpenSchemaCommand(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.url = str;
    }
}
