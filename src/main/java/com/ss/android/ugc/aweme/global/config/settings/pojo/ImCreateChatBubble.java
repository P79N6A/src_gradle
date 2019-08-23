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

public final class ImCreateChatBubble extends Message<ImCreateChatBubble, Builder> {
    public static final DefaultValueProtoAdapter<ImCreateChatBubble> ADAPTER = new ProtoAdapter_ImCreateChatBubble();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer show_flag;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer time_interval;

    public static final class Builder extends Message.Builder<ImCreateChatBubble, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Integer show_flag;
        public Integer time_interval;

        public final ImCreateChatBubble build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48868, new Class[0], ImCreateChatBubble.class)) {
                return new ImCreateChatBubble(this.show_flag, this.time_interval, super.buildUnknownFields());
            }
            return (ImCreateChatBubble) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48868, new Class[0], ImCreateChatBubble.class);
        }

        public final Builder show_flag(Integer num) {
            this.show_flag = num;
            return this;
        }

        public final Builder time_interval(Integer num) {
            this.time_interval = num;
            return this;
        }
    }

    static final class ProtoAdapter_ImCreateChatBubble extends DefaultValueProtoAdapter<ImCreateChatBubble> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final ImCreateChatBubble redact(ImCreateChatBubble imCreateChatBubble) {
            return imCreateChatBubble;
        }

        public ProtoAdapter_ImCreateChatBubble() {
            super(FieldEncoding.LENGTH_DELIMITED, ImCreateChatBubble.class);
        }

        public final ImCreateChatBubble decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48871, new Class[]{ProtoReader.class}, ImCreateChatBubble.class)) {
                return decode(protoReader2, (ImCreateChatBubble) null);
            }
            return (ImCreateChatBubble) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48871, new Class[]{ProtoReader.class}, ImCreateChatBubble.class);
        }

        public final int encodedSize(ImCreateChatBubble imCreateChatBubble) {
            ImCreateChatBubble imCreateChatBubble2 = imCreateChatBubble;
            if (!PatchProxy.isSupport(new Object[]{imCreateChatBubble2}, this, changeQuickRedirect, false, 48869, new Class[]{ImCreateChatBubble.class}, Integer.TYPE)) {
                return ProtoAdapter.INT32.encodedSizeWithTag(1, imCreateChatBubble2.show_flag) + ProtoAdapter.INT32.encodedSizeWithTag(2, imCreateChatBubble2.time_interval) + imCreateChatBubble.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{imCreateChatBubble2}, this, changeQuickRedirect, false, 48869, new Class[]{ImCreateChatBubble.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, ImCreateChatBubble imCreateChatBubble) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            ImCreateChatBubble imCreateChatBubble2 = imCreateChatBubble;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, imCreateChatBubble2}, this, changeQuickRedirect, false, 48870, new Class[]{ProtoWriter.class, ImCreateChatBubble.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, imCreateChatBubble2}, this, changeQuickRedirect, false, 48870, new Class[]{ProtoWriter.class, ImCreateChatBubble.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 1, imCreateChatBubble2.show_flag);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 2, imCreateChatBubble2.time_interval);
            protoWriter2.writeBytes(imCreateChatBubble.unknownFields());
        }

        public final ImCreateChatBubble decode(ProtoReader protoReader, ImCreateChatBubble imCreateChatBubble) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            ImCreateChatBubble imCreateChatBubble2 = imCreateChatBubble;
            if (PatchProxy.isSupport(new Object[]{protoReader2, imCreateChatBubble2}, this, changeQuickRedirect, false, 48872, new Class[]{ProtoReader.class, ImCreateChatBubble.class}, ImCreateChatBubble.class)) {
                return (ImCreateChatBubble) PatchProxy.accessDispatch(new Object[]{protoReader2, imCreateChatBubble2}, this, changeQuickRedirect, false, 48872, new Class[]{ProtoReader.class, ImCreateChatBubble.class}, ImCreateChatBubble.class);
            }
            ImCreateChatBubble imCreateChatBubble3 = (ImCreateChatBubble) a.a().a(ImCreateChatBubble.class, imCreateChatBubble2);
            if (imCreateChatBubble3 != null) {
                builder = imCreateChatBubble3.newBuilder();
            } else {
                builder = new Builder();
            }
            Builder builder2 = builder;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder2.show_flag((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 2:
                            builder2.time_interval((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (imCreateChatBubble3 != null) {
                                    break;
                                } else {
                                    throw e2;
                                }
                            }
                    }
                } else {
                    protoReader2.endMessage(beginMessage);
                    return builder2.build();
                }
            }
        }
    }

    @KtNullable
    public final Integer getShowFlag() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48862, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48862, new Class[0], Integer.class);
        } else if (this.show_flag != null) {
            return this.show_flag;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getTimeInterval() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48863, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48863, new Class[0], Integer.class);
        } else if (this.time_interval != null) {
            return this.time_interval;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48864, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48864, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.show_flag = this.show_flag;
        builder.time_interval = this.time_interval;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48866, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48866, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.show_flag != null) {
                i = this.show_flag.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.time_interval != null) {
                i2 = this.time_interval.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48867, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48867, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.show_flag != null) {
            sb.append(", show_flag=");
            sb.append(this.show_flag);
        }
        if (this.time_interval != null) {
            sb.append(", time_interval=");
            sb.append(this.time_interval);
        }
        StringBuilder replace = sb.replace(0, 2, "ImCreateChatBubble{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 48865, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 48865, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof ImCreateChatBubble)) {
                return false;
            }
            ImCreateChatBubble imCreateChatBubble = (ImCreateChatBubble) obj;
            if (!unknownFields().equals(imCreateChatBubble.unknownFields()) || !Internal.equals(this.show_flag, imCreateChatBubble.show_flag) || !Internal.equals(this.time_interval, imCreateChatBubble.time_interval)) {
                return false;
            }
            return true;
        }
    }

    public ImCreateChatBubble(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public ImCreateChatBubble(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.show_flag = num;
        this.time_interval = num2;
    }
}
