package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.KtNullable;
import com.bytedance.ies.c.a;
import com.bytedance.ies.c.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class LiveFEConfigs extends Message<LiveFEConfigs, Builder> {
    public static final DefaultValueProtoAdapter<LiveFEConfigs> ADAPTER = new ProtoAdapter_LiveFEConfigs();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.HonorLevel#ADAPTER", tag = 1)
    public final HonorLevel honor_level;

    public static final class Builder extends Message.Builder<LiveFEConfigs, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public HonorLevel honor_level;

        public final LiveFEConfigs build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48899, new Class[0], LiveFEConfigs.class)) {
                return new LiveFEConfigs(this.honor_level, super.buildUnknownFields());
            }
            return (LiveFEConfigs) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48899, new Class[0], LiveFEConfigs.class);
        }

        public final Builder honor_level(HonorLevel honorLevel) {
            this.honor_level = honorLevel;
            return this;
        }
    }

    static final class ProtoAdapter_LiveFEConfigs extends DefaultValueProtoAdapter<LiveFEConfigs> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final LiveFEConfigs redact(LiveFEConfigs liveFEConfigs) {
            return liveFEConfigs;
        }

        public ProtoAdapter_LiveFEConfigs() {
            super(FieldEncoding.LENGTH_DELIMITED, LiveFEConfigs.class);
        }

        public final LiveFEConfigs decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48902, new Class[]{ProtoReader.class}, LiveFEConfigs.class)) {
                return decode(protoReader2, (LiveFEConfigs) null);
            }
            return (LiveFEConfigs) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48902, new Class[]{ProtoReader.class}, LiveFEConfigs.class);
        }

        public final int encodedSize(LiveFEConfigs liveFEConfigs) {
            LiveFEConfigs liveFEConfigs2 = liveFEConfigs;
            if (!PatchProxy.isSupport(new Object[]{liveFEConfigs2}, this, changeQuickRedirect, false, 48900, new Class[]{LiveFEConfigs.class}, Integer.TYPE)) {
                return HonorLevel.ADAPTER.encodedSizeWithTag(1, liveFEConfigs2.honor_level) + liveFEConfigs.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{liveFEConfigs2}, this, changeQuickRedirect, false, 48900, new Class[]{LiveFEConfigs.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, LiveFEConfigs liveFEConfigs) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            LiveFEConfigs liveFEConfigs2 = liveFEConfigs;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, liveFEConfigs2}, this, changeQuickRedirect, false, 48901, new Class[]{ProtoWriter.class, LiveFEConfigs.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, liveFEConfigs2}, this, changeQuickRedirect, false, 48901, new Class[]{ProtoWriter.class, LiveFEConfigs.class}, Void.TYPE);
                return;
            }
            HonorLevel.ADAPTER.encodeWithTag(protoWriter2, 1, liveFEConfigs2.honor_level);
            protoWriter2.writeBytes(liveFEConfigs.unknownFields());
        }

        public final LiveFEConfigs decode(ProtoReader protoReader, LiveFEConfigs liveFEConfigs) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            LiveFEConfigs liveFEConfigs2 = liveFEConfigs;
            if (PatchProxy.isSupport(new Object[]{protoReader2, liveFEConfigs2}, this, changeQuickRedirect, false, 48903, new Class[]{ProtoReader.class, LiveFEConfigs.class}, LiveFEConfigs.class)) {
                return (LiveFEConfigs) PatchProxy.accessDispatch(new Object[]{protoReader2, liveFEConfigs2}, this, changeQuickRedirect, false, 48903, new Class[]{ProtoReader.class, LiveFEConfigs.class}, LiveFEConfigs.class);
            }
            LiveFEConfigs liveFEConfigs3 = (LiveFEConfigs) a.a().a(LiveFEConfigs.class, liveFEConfigs2);
            if (liveFEConfigs3 != null) {
                builder = liveFEConfigs3.newBuilder();
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
                        if (liveFEConfigs3 == null) {
                            throw e2;
                        }
                    }
                } else {
                    builder2.honor_level((HonorLevel) HonorLevel.ADAPTER.decode(protoReader2, builder2.honor_level));
                }
            }
        }
    }

    @KtNullable
    public final HonorLevel getHonorLevel() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48894, new Class[0], HonorLevel.class)) {
            return (HonorLevel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48894, new Class[0], HonorLevel.class);
        } else if (this.honor_level != null) {
            return this.honor_level;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48895, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48895, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.honor_level = this.honor_level;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48897, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48897, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.honor_level != null) {
                i = this.honor_level.hashCode();
            }
            i2 = hashCode + i;
            this.hashCode = i2;
        }
        return i2;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48898, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48898, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.honor_level != null) {
            sb.append(", honor_level=");
            sb.append(this.honor_level);
        }
        StringBuilder replace = sb.replace(0, 2, "LiveFEConfigs{");
        replace.append('}');
        return replace.toString();
    }

    public LiveFEConfigs(HonorLevel honorLevel) {
        this(honorLevel, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 48896, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 48896, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof LiveFEConfigs)) {
                return false;
            }
            LiveFEConfigs liveFEConfigs = (LiveFEConfigs) obj;
            if (!unknownFields().equals(liveFEConfigs.unknownFields()) || !Internal.equals(this.honor_level, liveFEConfigs.honor_level)) {
                return false;
            }
            return true;
        }
    }

    public LiveFEConfigs(HonorLevel honorLevel, ByteString byteString) {
        super(ADAPTER, byteString);
        this.honor_level = honorLevel;
    }
}
