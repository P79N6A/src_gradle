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

public final class LotteryCondition extends Message<LotteryCondition, Builder> {
    public static final ProtoAdapter<LotteryCondition> ADAPTER = new ProtoAdapter_LotteryCondition();
    public static final Long DEFAULT_CONDITION_ID = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Integer DEFAULT_TYPE = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long condition_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String content;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String description;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer type;

    public static final class Builder extends Message.Builder<LotteryCondition, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Long condition_id;
        public String content;
        public String description;
        public Integer status;
        public Integer type;

        public final LotteryCondition build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11748, new Class[0], LotteryCondition.class)) {
                return (LotteryCondition) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11748, new Class[0], LotteryCondition.class);
            }
            LotteryCondition lotteryCondition = new LotteryCondition(this.condition_id, this.type, this.content, this.status, this.description, super.buildUnknownFields());
            return lotteryCondition;
        }

        public final Builder condition_id(Long l) {
            this.condition_id = l;
            return this;
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }

        public final Builder description(String str) {
            this.description = str;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }
    }

    static final class ProtoAdapter_LotteryCondition extends ProtoAdapter<LotteryCondition> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_LotteryCondition() {
            super(FieldEncoding.LENGTH_DELIMITED, LotteryCondition.class);
        }

        public final LotteryCondition redact(LotteryCondition lotteryCondition) {
            if (PatchProxy.isSupport(new Object[]{lotteryCondition}, this, changeQuickRedirect, false, 11752, new Class[]{LotteryCondition.class}, LotteryCondition.class)) {
                return (LotteryCondition) PatchProxy.accessDispatch(new Object[]{lotteryCondition}, this, changeQuickRedirect, false, 11752, new Class[]{LotteryCondition.class}, LotteryCondition.class);
            }
            Builder newBuilder = lotteryCondition.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final LotteryCondition decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11751, new Class[]{ProtoReader.class}, LotteryCondition.class)) {
                return (LotteryCondition) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11751, new Class[]{ProtoReader.class}, LotteryCondition.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.condition_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 2:
                            builder.type((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 3:
                            builder.content((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 4:
                            builder.status((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 5:
                            builder.description((String) ProtoAdapter.STRING.decode(protoReader2));
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

        public final int encodedSize(LotteryCondition lotteryCondition) {
            int i;
            int i2;
            int i3;
            int i4;
            LotteryCondition lotteryCondition2 = lotteryCondition;
            int i5 = 0;
            if (PatchProxy.isSupport(new Object[]{lotteryCondition2}, this, changeQuickRedirect, false, 11749, new Class[]{LotteryCondition.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{lotteryCondition2}, this, changeQuickRedirect, false, 11749, new Class[]{LotteryCondition.class}, Integer.TYPE)).intValue();
            }
            if (lotteryCondition2.condition_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, lotteryCondition2.condition_id);
            } else {
                i = 0;
            }
            if (lotteryCondition2.type != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, lotteryCondition2.type);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (lotteryCondition2.content != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, lotteryCondition2.content);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (lotteryCondition2.status != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(4, lotteryCondition2.status);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (lotteryCondition2.description != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, lotteryCondition2.description);
            }
            return i8 + i5 + lotteryCondition.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, LotteryCondition lotteryCondition) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            LotteryCondition lotteryCondition2 = lotteryCondition;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, lotteryCondition2}, this, changeQuickRedirect, false, 11750, new Class[]{ProtoWriter.class, LotteryCondition.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, lotteryCondition2}, this, changeQuickRedirect, false, 11750, new Class[]{ProtoWriter.class, LotteryCondition.class}, Void.TYPE);
                return;
            }
            if (lotteryCondition2.condition_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1, lotteryCondition2.condition_id);
            }
            if (lotteryCondition2.type != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 2, lotteryCondition2.type);
            }
            if (lotteryCondition2.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, lotteryCondition2.content);
            }
            if (lotteryCondition2.status != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 4, lotteryCondition2.status);
            }
            if (lotteryCondition2.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 5, lotteryCondition2.description);
            }
            protoWriter2.writeBytes(lotteryCondition.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11744, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11744, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.condition_id = this.condition_id;
        builder.type = this.type;
        builder.content = this.content;
        builder.status = this.status;
        builder.description = this.description;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11746, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11746, new Class[0], Integer.TYPE)).intValue();
        }
        int i6 = this.hashCode;
        if (i6 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.condition_id != null) {
                i = this.condition_id.hashCode();
            } else {
                i = 0;
            }
            int i7 = (hashCode + i) * 37;
            if (this.type != null) {
                i2 = this.type.hashCode();
            } else {
                i2 = 0;
            }
            int i8 = (i7 + i2) * 37;
            if (this.content != null) {
                i3 = this.content.hashCode();
            } else {
                i3 = 0;
            }
            int i9 = (i8 + i3) * 37;
            if (this.status != null) {
                i4 = this.status.hashCode();
            } else {
                i4 = 0;
            }
            int i10 = (i9 + i4) * 37;
            if (this.description != null) {
                i5 = this.description.hashCode();
            }
            i6 = i10 + i5;
            this.hashCode = i6;
        }
        return i6;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11747, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11747, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.condition_id != null) {
            sb.append(", condition_id=");
            sb.append(this.condition_id);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        StringBuilder replace = sb.replace(0, 2, "LotteryCondition{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11745, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11745, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof LotteryCondition)) {
                return false;
            }
            LotteryCondition lotteryCondition = (LotteryCondition) obj;
            if (!unknownFields().equals(lotteryCondition.unknownFields()) || !Internal.equals(this.condition_id, lotteryCondition.condition_id) || !Internal.equals(this.type, lotteryCondition.type) || !Internal.equals(this.content, lotteryCondition.content) || !Internal.equals(this.status, lotteryCondition.status) || !Internal.equals(this.description, lotteryCondition.description)) {
                return false;
            }
            return true;
        }
    }

    public LotteryCondition(Long l, Integer num, String str, Integer num2, String str2) {
        this(l, num, str, num2, str2, ByteString.EMPTY);
    }

    public LotteryCondition(Long l, Integer num, String str, Integer num2, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.condition_id = l;
        this.type = num;
        this.content = str;
        this.status = num2;
        this.description = str2;
    }
}
