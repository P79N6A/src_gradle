package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.c.a;
import com.bytedance.ies.c.b;
import com.bytedance.ies.c.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import java.io.IOException;
import okio.ByteString;

public final class AssociativeEmoticonAll extends Message<AssociativeEmoticonAll, Builder> {
    public static final DefaultValueProtoAdapter<AssociativeEmoticonAll> ADAPTER = new ProtoAdapter_AssociativeEmoticonAll();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = 0, tag = 1)
    public final Integer show;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 0, tag = 2)
    public final String sourceMessage;

    public static final class Builder extends Message.Builder<AssociativeEmoticonAll, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Integer show;
        public String sourceMessage;

        public final AssociativeEmoticonAll build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47689, new Class[0], AssociativeEmoticonAll.class)) {
                return (AssociativeEmoticonAll) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47689, new Class[0], AssociativeEmoticonAll.class);
            } else if (this.show != null && this.sourceMessage != null) {
                return new AssociativeEmoticonAll(this.show, this.sourceMessage, super.buildUnknownFields());
            } else {
                throw c.a(this.show, "show", this.sourceMessage, "sourceMessage");
            }
        }

        public final Builder show(Integer num) {
            this.show = num;
            return this;
        }

        public final Builder sourceMessage(String str) {
            this.sourceMessage = str;
            return this;
        }
    }

    static final class ProtoAdapter_AssociativeEmoticonAll extends DefaultValueProtoAdapter<AssociativeEmoticonAll> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final AssociativeEmoticonAll redact(AssociativeEmoticonAll associativeEmoticonAll) {
            return associativeEmoticonAll;
        }

        public ProtoAdapter_AssociativeEmoticonAll() {
            super(FieldEncoding.LENGTH_DELIMITED, AssociativeEmoticonAll.class);
        }

        public final AssociativeEmoticonAll decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47692, new Class[]{ProtoReader.class}, AssociativeEmoticonAll.class)) {
                return decode(protoReader2, (AssociativeEmoticonAll) null);
            }
            return (AssociativeEmoticonAll) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47692, new Class[]{ProtoReader.class}, AssociativeEmoticonAll.class);
        }

        public final int encodedSize(AssociativeEmoticonAll associativeEmoticonAll) {
            AssociativeEmoticonAll associativeEmoticonAll2 = associativeEmoticonAll;
            if (!PatchProxy.isSupport(new Object[]{associativeEmoticonAll2}, this, changeQuickRedirect, false, 47690, new Class[]{AssociativeEmoticonAll.class}, Integer.TYPE)) {
                return ProtoAdapter.INT32.encodedSizeWithTag(1, associativeEmoticonAll2.show) + ProtoAdapter.STRING.encodedSizeWithTag(2, associativeEmoticonAll2.sourceMessage) + associativeEmoticonAll.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{associativeEmoticonAll2}, this, changeQuickRedirect, false, 47690, new Class[]{AssociativeEmoticonAll.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, AssociativeEmoticonAll associativeEmoticonAll) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            AssociativeEmoticonAll associativeEmoticonAll2 = associativeEmoticonAll;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, associativeEmoticonAll2}, this, changeQuickRedirect, false, 47691, new Class[]{ProtoWriter.class, AssociativeEmoticonAll.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, associativeEmoticonAll2}, this, changeQuickRedirect, false, 47691, new Class[]{ProtoWriter.class, AssociativeEmoticonAll.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 1, associativeEmoticonAll2.show);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, associativeEmoticonAll2.sourceMessage);
            protoWriter2.writeBytes(associativeEmoticonAll.unknownFields());
        }

        public final AssociativeEmoticonAll decode(ProtoReader protoReader, AssociativeEmoticonAll associativeEmoticonAll) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            AssociativeEmoticonAll associativeEmoticonAll2 = associativeEmoticonAll;
            if (PatchProxy.isSupport(new Object[]{protoReader2, associativeEmoticonAll2}, this, changeQuickRedirect, false, 47693, new Class[]{ProtoReader.class, AssociativeEmoticonAll.class}, AssociativeEmoticonAll.class)) {
                return (AssociativeEmoticonAll) PatchProxy.accessDispatch(new Object[]{protoReader2, associativeEmoticonAll2}, this, changeQuickRedirect, false, 47693, new Class[]{ProtoReader.class, AssociativeEmoticonAll.class}, AssociativeEmoticonAll.class);
            }
            AssociativeEmoticonAll associativeEmoticonAll3 = (AssociativeEmoticonAll) a.a().a(AssociativeEmoticonAll.class, associativeEmoticonAll2);
            if (associativeEmoticonAll3 != null) {
                builder = associativeEmoticonAll3.newBuilder();
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
                            builder2.show((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 2:
                            builder2.sourceMessage((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (associativeEmoticonAll3 != null) {
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

    public final Integer getShow() {
        return this.show;
    }

    public final String getSourceMessage() {
        return this.sourceMessage;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47685, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47685, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.show = this.show;
        builder.sourceMessage = this.sourceMessage;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47687, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47687, new Class[0], Integer.TYPE)).intValue();
        }
        int i = this.hashCode;
        if (i == 0) {
            i = (((unknownFields().hashCode() * 37) + this.show.hashCode()) * 37) + this.sourceMessage.hashCode();
            this.hashCode = i;
        }
        return i;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47688, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47688, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(", show=");
        sb.append(this.show);
        sb.append(", sourceMessage=");
        sb.append(this.sourceMessage);
        StringBuilder replace = sb.replace(0, 2, "AssociativeEmoticonAll{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47686, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47686, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof AssociativeEmoticonAll)) {
                return false;
            }
            AssociativeEmoticonAll associativeEmoticonAll = (AssociativeEmoticonAll) obj;
            if (!unknownFields().equals(associativeEmoticonAll.unknownFields()) || !this.show.equals(associativeEmoticonAll.show) || !this.sourceMessage.equals(associativeEmoticonAll.sourceMessage)) {
                return false;
            }
            return true;
        }
    }

    public AssociativeEmoticonAll(Integer num, String str) {
        this(num, str, ByteString.EMPTY);
    }

    public AssociativeEmoticonAll(Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.show = num;
        this.sourceMessage = str;
    }
}
