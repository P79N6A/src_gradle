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

public final class FlexImageStruct extends Message<FlexImageStruct, Builder> {
    public static final ProtoAdapter<FlexImageStruct> ADAPTER = new ProtoAdapter_FlexImageStruct();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REPEATED, tag = 3)
    public final List<Long> flex_setting;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String uri;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 1)
    public final List<String> url_list;

    public static final class Builder extends Message.Builder<FlexImageStruct, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public List<Long> flex_setting = Internal.newMutableList();
        public String uri;
        public List<String> url_list = Internal.newMutableList();

        public final FlexImageStruct build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11425, new Class[0], FlexImageStruct.class)) {
                return new FlexImageStruct(this.url_list, this.uri, this.flex_setting, super.buildUnknownFields());
            }
            return (FlexImageStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11425, new Class[0], FlexImageStruct.class);
        }

        public final Builder uri(String str) {
            this.uri = str;
            return this;
        }

        public final Builder flex_setting(List<Long> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 11424, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 11424, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.flex_setting = list;
            return this;
        }

        public final Builder url_list(List<String> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 11423, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 11423, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.url_list = list;
            return this;
        }
    }

    static final class ProtoAdapter_FlexImageStruct extends ProtoAdapter<FlexImageStruct> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_FlexImageStruct() {
            super(FieldEncoding.LENGTH_DELIMITED, FlexImageStruct.class);
        }

        public final int encodedSize(FlexImageStruct flexImageStruct) {
            FlexImageStruct flexImageStruct2 = flexImageStruct;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{flexImageStruct2}, this, changeQuickRedirect, false, 11426, new Class[]{FlexImageStruct.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{flexImageStruct2}, this, changeQuickRedirect, false, 11426, new Class[]{FlexImageStruct.class}, Integer.TYPE)).intValue();
            }
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, flexImageStruct2.url_list);
            if (flexImageStruct2.uri != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, flexImageStruct2.uri);
            }
            return encodedSizeWithTag + i + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(3, flexImageStruct2.flex_setting) + flexImageStruct.unknownFields().size();
        }

        public final FlexImageStruct redact(FlexImageStruct flexImageStruct) {
            if (PatchProxy.isSupport(new Object[]{flexImageStruct}, this, changeQuickRedirect, false, 11429, new Class[]{FlexImageStruct.class}, FlexImageStruct.class)) {
                return (FlexImageStruct) PatchProxy.accessDispatch(new Object[]{flexImageStruct}, this, changeQuickRedirect, false, 11429, new Class[]{FlexImageStruct.class}, FlexImageStruct.class);
            }
            Builder newBuilder = flexImageStruct.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final FlexImageStruct decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11428, new Class[]{ProtoReader.class}, FlexImageStruct.class)) {
                return (FlexImageStruct) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11428, new Class[]{ProtoReader.class}, FlexImageStruct.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.url_list.add(ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 2:
                            builder.uri((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 3:
                            builder.flex_setting.add(ProtoAdapter.INT64.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, FlexImageStruct flexImageStruct) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            FlexImageStruct flexImageStruct2 = flexImageStruct;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, flexImageStruct2}, this, changeQuickRedirect, false, 11427, new Class[]{ProtoWriter.class, FlexImageStruct.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, flexImageStruct2}, this, changeQuickRedirect, false, 11427, new Class[]{ProtoWriter.class, FlexImageStruct.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter2, 1, flexImageStruct2.url_list);
            if (flexImageStruct2.uri != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, flexImageStruct2.uri);
            }
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter2, 3, flexImageStruct2.flex_setting);
            protoWriter2.writeBytes(flexImageStruct.unknownFields());
        }
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11421, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11421, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = ((unknownFields().hashCode() * 37) + this.url_list.hashCode()) * 37;
            if (this.uri != null) {
                i = this.uri.hashCode();
            }
            i2 = ((hashCode + i) * 37) + this.flex_setting.hashCode();
            this.hashCode = i2;
        }
        return i2;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11419, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11419, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.url_list = Internal.copyOf("url_list", this.url_list);
        builder.uri = this.uri;
        builder.flex_setting = Internal.copyOf("flex_setting", this.flex_setting);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11422, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11422, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (!this.url_list.isEmpty()) {
            sb.append(", url_list=");
            sb.append(this.url_list);
        }
        if (this.uri != null) {
            sb.append(", uri=");
            sb.append(this.uri);
        }
        if (!this.flex_setting.isEmpty()) {
            sb.append(", flex_setting=");
            sb.append(this.flex_setting);
        }
        StringBuilder replace = sb.replace(0, 2, "FlexImageStruct{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11420, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11420, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof FlexImageStruct)) {
                return false;
            }
            FlexImageStruct flexImageStruct = (FlexImageStruct) obj;
            if (!unknownFields().equals(flexImageStruct.unknownFields()) || !this.url_list.equals(flexImageStruct.url_list) || !Internal.equals(this.uri, flexImageStruct.uri) || !this.flex_setting.equals(flexImageStruct.flex_setting)) {
                return false;
            }
            return true;
        }
    }

    public FlexImageStruct(List<String> list, String str, List<Long> list2) {
        this(list, str, list2, ByteString.EMPTY);
    }

    public FlexImageStruct(List<String> list, String str, List<Long> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.url_list = Internal.immutableCopyOf("url_list", list);
        this.uri = str;
        this.flex_setting = Internal.immutableCopyOf("flex_setting", list2);
    }
}
