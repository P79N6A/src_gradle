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

public final class CompleteProfilePolicy extends Message<CompleteProfilePolicy, Builder> {
    public static final DefaultValueProtoAdapter<CompleteProfilePolicy> ADAPTER = new ProtoAdapter_CompleteProfilePolicy();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer interval;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer times;

    public static final class Builder extends Message.Builder<CompleteProfilePolicy, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Integer interval;
        public Integer times;

        public final CompleteProfilePolicy build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47776, new Class[0], CompleteProfilePolicy.class)) {
                return new CompleteProfilePolicy(this.times, this.interval, super.buildUnknownFields());
            }
            return (CompleteProfilePolicy) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47776, new Class[0], CompleteProfilePolicy.class);
        }

        public final Builder interval(Integer num) {
            this.interval = num;
            return this;
        }

        public final Builder times(Integer num) {
            this.times = num;
            return this;
        }
    }

    static final class ProtoAdapter_CompleteProfilePolicy extends DefaultValueProtoAdapter<CompleteProfilePolicy> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final CompleteProfilePolicy redact(CompleteProfilePolicy completeProfilePolicy) {
            return completeProfilePolicy;
        }

        public ProtoAdapter_CompleteProfilePolicy() {
            super(FieldEncoding.LENGTH_DELIMITED, CompleteProfilePolicy.class);
        }

        public final CompleteProfilePolicy decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47779, new Class[]{ProtoReader.class}, CompleteProfilePolicy.class)) {
                return decode(protoReader2, (CompleteProfilePolicy) null);
            }
            return (CompleteProfilePolicy) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47779, new Class[]{ProtoReader.class}, CompleteProfilePolicy.class);
        }

        public final int encodedSize(CompleteProfilePolicy completeProfilePolicy) {
            CompleteProfilePolicy completeProfilePolicy2 = completeProfilePolicy;
            if (!PatchProxy.isSupport(new Object[]{completeProfilePolicy2}, this, changeQuickRedirect, false, 47777, new Class[]{CompleteProfilePolicy.class}, Integer.TYPE)) {
                return ProtoAdapter.INT32.encodedSizeWithTag(1, completeProfilePolicy2.times) + ProtoAdapter.INT32.encodedSizeWithTag(2, completeProfilePolicy2.interval) + completeProfilePolicy.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{completeProfilePolicy2}, this, changeQuickRedirect, false, 47777, new Class[]{CompleteProfilePolicy.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, CompleteProfilePolicy completeProfilePolicy) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            CompleteProfilePolicy completeProfilePolicy2 = completeProfilePolicy;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, completeProfilePolicy2}, this, changeQuickRedirect, false, 47778, new Class[]{ProtoWriter.class, CompleteProfilePolicy.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, completeProfilePolicy2}, this, changeQuickRedirect, false, 47778, new Class[]{ProtoWriter.class, CompleteProfilePolicy.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 1, completeProfilePolicy2.times);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 2, completeProfilePolicy2.interval);
            protoWriter2.writeBytes(completeProfilePolicy.unknownFields());
        }

        public final CompleteProfilePolicy decode(ProtoReader protoReader, CompleteProfilePolicy completeProfilePolicy) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            CompleteProfilePolicy completeProfilePolicy2 = completeProfilePolicy;
            if (PatchProxy.isSupport(new Object[]{protoReader2, completeProfilePolicy2}, this, changeQuickRedirect, false, 47780, new Class[]{ProtoReader.class, CompleteProfilePolicy.class}, CompleteProfilePolicy.class)) {
                return (CompleteProfilePolicy) PatchProxy.accessDispatch(new Object[]{protoReader2, completeProfilePolicy2}, this, changeQuickRedirect, false, 47780, new Class[]{ProtoReader.class, CompleteProfilePolicy.class}, CompleteProfilePolicy.class);
            }
            CompleteProfilePolicy completeProfilePolicy3 = (CompleteProfilePolicy) a.a().a(CompleteProfilePolicy.class, completeProfilePolicy2);
            if (completeProfilePolicy3 != null) {
                builder = completeProfilePolicy3.newBuilder();
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
                            builder2.times((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 2:
                            builder2.interval((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (completeProfilePolicy3 != null) {
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
    public final Integer getInterval() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47771, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47771, new Class[0], Integer.class);
        } else if (this.interval != null) {
            return this.interval;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getTimes() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47770, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47770, new Class[0], Integer.class);
        } else if (this.times != null) {
            return this.times;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47772, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47772, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.times = this.times;
        builder.interval = this.interval;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47774, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47774, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.times != null) {
                i = this.times.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.interval != null) {
                i2 = this.interval.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47775, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47775, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.times != null) {
            sb.append(", times=");
            sb.append(this.times);
        }
        if (this.interval != null) {
            sb.append(", interval=");
            sb.append(this.interval);
        }
        StringBuilder replace = sb.replace(0, 2, "CompleteProfilePolicy{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47773, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47773, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof CompleteProfilePolicy)) {
                return false;
            }
            CompleteProfilePolicy completeProfilePolicy = (CompleteProfilePolicy) obj;
            if (!unknownFields().equals(completeProfilePolicy.unknownFields()) || !Internal.equals(this.times, completeProfilePolicy.times) || !Internal.equals(this.interval, completeProfilePolicy.interval)) {
                return false;
            }
            return true;
        }
    }

    public CompleteProfilePolicy(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public CompleteProfilePolicy(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.times = num;
        this.interval = num2;
    }
}
