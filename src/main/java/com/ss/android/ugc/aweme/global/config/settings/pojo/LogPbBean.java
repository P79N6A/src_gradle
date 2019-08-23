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

public final class LogPbBean extends Message<LogPbBean, Builder> {
    public static final DefaultValueProtoAdapter<LogPbBean> ADAPTER = new ProtoAdapter_LogPbBean();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String impr_id;

    public static final class Builder extends Message.Builder<LogPbBean, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String impr_id;

        public final LogPbBean build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48921, new Class[0], LogPbBean.class)) {
                return new LogPbBean(this.impr_id, super.buildUnknownFields());
            }
            return (LogPbBean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48921, new Class[0], LogPbBean.class);
        }

        public final Builder impr_id(String str) {
            this.impr_id = str;
            return this;
        }
    }

    static final class ProtoAdapter_LogPbBean extends DefaultValueProtoAdapter<LogPbBean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final LogPbBean redact(LogPbBean logPbBean) {
            return logPbBean;
        }

        public ProtoAdapter_LogPbBean() {
            super(FieldEncoding.LENGTH_DELIMITED, LogPbBean.class);
        }

        public final LogPbBean decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48924, new Class[]{ProtoReader.class}, LogPbBean.class)) {
                return decode(protoReader2, (LogPbBean) null);
            }
            return (LogPbBean) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48924, new Class[]{ProtoReader.class}, LogPbBean.class);
        }

        public final int encodedSize(LogPbBean logPbBean) {
            LogPbBean logPbBean2 = logPbBean;
            if (!PatchProxy.isSupport(new Object[]{logPbBean2}, this, changeQuickRedirect, false, 48922, new Class[]{LogPbBean.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, logPbBean2.impr_id) + logPbBean.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{logPbBean2}, this, changeQuickRedirect, false, 48922, new Class[]{LogPbBean.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, LogPbBean logPbBean) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            LogPbBean logPbBean2 = logPbBean;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, logPbBean2}, this, changeQuickRedirect, false, 48923, new Class[]{ProtoWriter.class, LogPbBean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, logPbBean2}, this, changeQuickRedirect, false, 48923, new Class[]{ProtoWriter.class, LogPbBean.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, logPbBean2.impr_id);
            protoWriter2.writeBytes(logPbBean.unknownFields());
        }

        public final LogPbBean decode(ProtoReader protoReader, LogPbBean logPbBean) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            LogPbBean logPbBean2 = logPbBean;
            if (PatchProxy.isSupport(new Object[]{protoReader2, logPbBean2}, this, changeQuickRedirect, false, 48925, new Class[]{ProtoReader.class, LogPbBean.class}, LogPbBean.class)) {
                return (LogPbBean) PatchProxy.accessDispatch(new Object[]{protoReader2, logPbBean2}, this, changeQuickRedirect, false, 48925, new Class[]{ProtoReader.class, LogPbBean.class}, LogPbBean.class);
            }
            LogPbBean logPbBean3 = (LogPbBean) a.a().a(LogPbBean.class, logPbBean2);
            if (logPbBean3 != null) {
                builder = logPbBean3.newBuilder();
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
                        if (logPbBean3 == null) {
                            throw e2;
                        }
                    }
                } else {
                    builder2.impr_id((String) ProtoAdapter.STRING.decode(protoReader2));
                }
            }
        }
    }

    @KtNullable
    public final String getImprId() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48916, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48916, new Class[0], String.class);
        } else if (this.impr_id != null) {
            return this.impr_id;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48917, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48917, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.impr_id = this.impr_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48919, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48919, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.impr_id != null) {
                i = this.impr_id.hashCode();
            }
            i2 = hashCode + i;
            this.hashCode = i2;
        }
        return i2;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48920, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48920, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.impr_id != null) {
            sb.append(", impr_id=");
            sb.append(this.impr_id);
        }
        StringBuilder replace = sb.replace(0, 2, "LogPbBean{");
        replace.append('}');
        return replace.toString();
    }

    public LogPbBean(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 48918, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 48918, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof LogPbBean)) {
                return false;
            }
            LogPbBean logPbBean = (LogPbBean) obj;
            if (!unknownFields().equals(logPbBean.unknownFields()) || !Internal.equals(this.impr_id, logPbBean.impr_id)) {
                return false;
            }
            return true;
        }
    }

    public LogPbBean(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.impr_id = str;
    }
}
