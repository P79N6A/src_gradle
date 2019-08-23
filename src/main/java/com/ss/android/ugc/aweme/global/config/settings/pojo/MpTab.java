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

public final class MpTab extends Message<MpTab, Builder> {
    public static final DefaultValueProtoAdapter<MpTab> ADAPTER = new ProtoAdapter_MpTab();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String publish;

    public static final class Builder extends Message.Builder<MpTab, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String publish;

        public final MpTab build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48943, new Class[0], MpTab.class)) {
                return new MpTab(this.publish, super.buildUnknownFields());
            }
            return (MpTab) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48943, new Class[0], MpTab.class);
        }

        public final Builder publish(String str) {
            this.publish = str;
            return this;
        }
    }

    static final class ProtoAdapter_MpTab extends DefaultValueProtoAdapter<MpTab> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final MpTab redact(MpTab mpTab) {
            return mpTab;
        }

        public ProtoAdapter_MpTab() {
            super(FieldEncoding.LENGTH_DELIMITED, MpTab.class);
        }

        public final MpTab decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48946, new Class[]{ProtoReader.class}, MpTab.class)) {
                return decode(protoReader2, (MpTab) null);
            }
            return (MpTab) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48946, new Class[]{ProtoReader.class}, MpTab.class);
        }

        public final int encodedSize(MpTab mpTab) {
            MpTab mpTab2 = mpTab;
            if (!PatchProxy.isSupport(new Object[]{mpTab2}, this, changeQuickRedirect, false, 48944, new Class[]{MpTab.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, mpTab2.publish) + mpTab.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{mpTab2}, this, changeQuickRedirect, false, 48944, new Class[]{MpTab.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, MpTab mpTab) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            MpTab mpTab2 = mpTab;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, mpTab2}, this, changeQuickRedirect, false, 48945, new Class[]{ProtoWriter.class, MpTab.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, mpTab2}, this, changeQuickRedirect, false, 48945, new Class[]{ProtoWriter.class, MpTab.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, mpTab2.publish);
            protoWriter2.writeBytes(mpTab.unknownFields());
        }

        public final MpTab decode(ProtoReader protoReader, MpTab mpTab) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            MpTab mpTab2 = mpTab;
            if (PatchProxy.isSupport(new Object[]{protoReader2, mpTab2}, this, changeQuickRedirect, false, 48947, new Class[]{ProtoReader.class, MpTab.class}, MpTab.class)) {
                return (MpTab) PatchProxy.accessDispatch(new Object[]{protoReader2, mpTab2}, this, changeQuickRedirect, false, 48947, new Class[]{ProtoReader.class, MpTab.class}, MpTab.class);
            }
            MpTab mpTab3 = (MpTab) a.a().a(MpTab.class, mpTab2);
            if (mpTab3 != null) {
                builder = mpTab3.newBuilder();
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
                        if (mpTab3 == null) {
                            throw e2;
                        }
                    }
                } else {
                    builder2.publish((String) ProtoAdapter.STRING.decode(protoReader2));
                }
            }
        }
    }

    @KtNullable
    public final String getPublish() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48938, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48938, new Class[0], String.class);
        } else if (this.publish != null) {
            return this.publish;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48939, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48939, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.publish = this.publish;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48941, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48941, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.publish != null) {
                i = this.publish.hashCode();
            }
            i2 = hashCode + i;
            this.hashCode = i2;
        }
        return i2;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48942, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48942, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.publish != null) {
            sb.append(", publish=");
            sb.append(this.publish);
        }
        StringBuilder replace = sb.replace(0, 2, "MpTab{");
        replace.append('}');
        return replace.toString();
    }

    public MpTab(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 48940, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 48940, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof MpTab)) {
                return false;
            }
            MpTab mpTab = (MpTab) obj;
            if (!unknownFields().equals(mpTab.unknownFields()) || !Internal.equals(this.publish, mpTab.publish)) {
                return false;
            }
            return true;
        }
    }

    public MpTab(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.publish = str;
    }
}
