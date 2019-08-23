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

public final class JsonStubWillConvertToString extends Message<JsonStubWillConvertToString, Builder> {
    public static final DefaultValueProtoAdapter<JsonStubWillConvertToString> ADAPTER = new ProtoAdapter_JsonStubWillConvertToString();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String jsonobj_convert_string;

    public static final class Builder extends Message.Builder<JsonStubWillConvertToString, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String jsonobj_convert_string;

        public final JsonStubWillConvertToString build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48878, new Class[0], JsonStubWillConvertToString.class)) {
                return new JsonStubWillConvertToString(this.jsonobj_convert_string, super.buildUnknownFields());
            }
            return (JsonStubWillConvertToString) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48878, new Class[0], JsonStubWillConvertToString.class);
        }

        public final Builder jsonobj_convert_string(String str) {
            this.jsonobj_convert_string = str;
            return this;
        }
    }

    static final class ProtoAdapter_JsonStubWillConvertToString extends DefaultValueProtoAdapter<JsonStubWillConvertToString> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final JsonStubWillConvertToString redact(JsonStubWillConvertToString jsonStubWillConvertToString) {
            return jsonStubWillConvertToString;
        }

        public ProtoAdapter_JsonStubWillConvertToString() {
            super(FieldEncoding.LENGTH_DELIMITED, JsonStubWillConvertToString.class);
        }

        public final JsonStubWillConvertToString decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48881, new Class[]{ProtoReader.class}, JsonStubWillConvertToString.class)) {
                return decode(protoReader2, (JsonStubWillConvertToString) null);
            }
            return (JsonStubWillConvertToString) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48881, new Class[]{ProtoReader.class}, JsonStubWillConvertToString.class);
        }

        public final int encodedSize(JsonStubWillConvertToString jsonStubWillConvertToString) {
            JsonStubWillConvertToString jsonStubWillConvertToString2 = jsonStubWillConvertToString;
            if (!PatchProxy.isSupport(new Object[]{jsonStubWillConvertToString2}, this, changeQuickRedirect, false, 48879, new Class[]{JsonStubWillConvertToString.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, jsonStubWillConvertToString2.jsonobj_convert_string) + jsonStubWillConvertToString.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{jsonStubWillConvertToString2}, this, changeQuickRedirect, false, 48879, new Class[]{JsonStubWillConvertToString.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, JsonStubWillConvertToString jsonStubWillConvertToString) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            JsonStubWillConvertToString jsonStubWillConvertToString2 = jsonStubWillConvertToString;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, jsonStubWillConvertToString2}, this, changeQuickRedirect, false, 48880, new Class[]{ProtoWriter.class, JsonStubWillConvertToString.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, jsonStubWillConvertToString2}, this, changeQuickRedirect, false, 48880, new Class[]{ProtoWriter.class, JsonStubWillConvertToString.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, jsonStubWillConvertToString2.jsonobj_convert_string);
            protoWriter2.writeBytes(jsonStubWillConvertToString.unknownFields());
        }

        public final JsonStubWillConvertToString decode(ProtoReader protoReader, JsonStubWillConvertToString jsonStubWillConvertToString) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            JsonStubWillConvertToString jsonStubWillConvertToString2 = jsonStubWillConvertToString;
            if (PatchProxy.isSupport(new Object[]{protoReader2, jsonStubWillConvertToString2}, this, changeQuickRedirect, false, 48882, new Class[]{ProtoReader.class, JsonStubWillConvertToString.class}, JsonStubWillConvertToString.class)) {
                return (JsonStubWillConvertToString) PatchProxy.accessDispatch(new Object[]{protoReader2, jsonStubWillConvertToString2}, this, changeQuickRedirect, false, 48882, new Class[]{ProtoReader.class, JsonStubWillConvertToString.class}, JsonStubWillConvertToString.class);
            }
            JsonStubWillConvertToString jsonStubWillConvertToString3 = (JsonStubWillConvertToString) a.a().a(JsonStubWillConvertToString.class, jsonStubWillConvertToString2);
            if (jsonStubWillConvertToString3 != null) {
                builder = jsonStubWillConvertToString3.newBuilder();
            } else {
                builder = new Builder();
            }
            Builder builder2 = builder;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader2.endMessage(beginMessage);
                    return builder2.build();
                } else if (nextTag != 1) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                    } catch (b e2) {
                        if (jsonStubWillConvertToString3 == null) {
                            throw e2;
                        }
                    }
                } else {
                    builder2.jsonobj_convert_string((String) ProtoAdapter.STRING.decode(protoReader2));
                }
            }
        }
    }

    @KtNullable
    public final String getJsonobjConvertString() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48873, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48873, new Class[0], String.class);
        } else if (this.jsonobj_convert_string != null) {
            return this.jsonobj_convert_string;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48874, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48874, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.jsonobj_convert_string = this.jsonobj_convert_string;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48876, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48876, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.jsonobj_convert_string != null) {
                i = this.jsonobj_convert_string.hashCode();
            }
            i2 = hashCode + i;
            this.hashCode = i2;
        }
        return i2;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48877, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48877, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.jsonobj_convert_string != null) {
            sb.append(", jsonobj_convert_string=");
            sb.append(this.jsonobj_convert_string);
        }
        StringBuilder replace = sb.replace(0, 2, "JsonStubWillConvertToString{");
        replace.append('}');
        return replace.toString();
    }

    public JsonStubWillConvertToString(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 48875, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 48875, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof JsonStubWillConvertToString)) {
                return false;
            }
            JsonStubWillConvertToString jsonStubWillConvertToString = (JsonStubWillConvertToString) obj;
            if (!unknownFields().equals(jsonStubWillConvertToString.unknownFields()) || !Internal.equals(this.jsonobj_convert_string, jsonStubWillConvertToString.jsonobj_convert_string)) {
                return false;
            }
            return true;
        }
    }

    public JsonStubWillConvertToString(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.jsonobj_convert_string = str;
    }
}
