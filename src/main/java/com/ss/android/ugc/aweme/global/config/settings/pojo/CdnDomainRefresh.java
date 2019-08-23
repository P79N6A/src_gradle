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

public final class CdnDomainRefresh extends Message<CdnDomainRefresh, Builder> {
    public static final DefaultValueProtoAdapter<CdnDomainRefresh> ADAPTER = new ProtoAdapter_CdnDomainRefresh();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer keepalive_timeout;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer refresh_interval;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public final Boolean refresh_switch;

    public static final class Builder extends Message.Builder<CdnDomainRefresh, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Integer keepalive_timeout;
        public Integer refresh_interval;
        public Boolean refresh_switch;

        public final CdnDomainRefresh build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47765, new Class[0], CdnDomainRefresh.class)) {
                return new CdnDomainRefresh(this.refresh_switch, this.refresh_interval, this.keepalive_timeout, super.buildUnknownFields());
            }
            return (CdnDomainRefresh) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47765, new Class[0], CdnDomainRefresh.class);
        }

        public final Builder keepalive_timeout(Integer num) {
            this.keepalive_timeout = num;
            return this;
        }

        public final Builder refresh_interval(Integer num) {
            this.refresh_interval = num;
            return this;
        }

        public final Builder refresh_switch(Boolean bool) {
            this.refresh_switch = bool;
            return this;
        }
    }

    static final class ProtoAdapter_CdnDomainRefresh extends DefaultValueProtoAdapter<CdnDomainRefresh> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final CdnDomainRefresh redact(CdnDomainRefresh cdnDomainRefresh) {
            return cdnDomainRefresh;
        }

        public ProtoAdapter_CdnDomainRefresh() {
            super(FieldEncoding.LENGTH_DELIMITED, CdnDomainRefresh.class);
        }

        public final CdnDomainRefresh decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47768, new Class[]{ProtoReader.class}, CdnDomainRefresh.class)) {
                return decode(protoReader2, (CdnDomainRefresh) null);
            }
            return (CdnDomainRefresh) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47768, new Class[]{ProtoReader.class}, CdnDomainRefresh.class);
        }

        public final int encodedSize(CdnDomainRefresh cdnDomainRefresh) {
            CdnDomainRefresh cdnDomainRefresh2 = cdnDomainRefresh;
            if (!PatchProxy.isSupport(new Object[]{cdnDomainRefresh2}, this, changeQuickRedirect, false, 47766, new Class[]{CdnDomainRefresh.class}, Integer.TYPE)) {
                return ProtoAdapter.BOOL.encodedSizeWithTag(1, cdnDomainRefresh2.refresh_switch) + ProtoAdapter.INT32.encodedSizeWithTag(2, cdnDomainRefresh2.refresh_interval) + ProtoAdapter.INT32.encodedSizeWithTag(3, cdnDomainRefresh2.keepalive_timeout) + cdnDomainRefresh.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{cdnDomainRefresh2}, this, changeQuickRedirect, false, 47766, new Class[]{CdnDomainRefresh.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, CdnDomainRefresh cdnDomainRefresh) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            CdnDomainRefresh cdnDomainRefresh2 = cdnDomainRefresh;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, cdnDomainRefresh2}, this, changeQuickRedirect, false, 47767, new Class[]{ProtoWriter.class, CdnDomainRefresh.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, cdnDomainRefresh2}, this, changeQuickRedirect, false, 47767, new Class[]{ProtoWriter.class, CdnDomainRefresh.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1, cdnDomainRefresh2.refresh_switch);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 2, cdnDomainRefresh2.refresh_interval);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 3, cdnDomainRefresh2.keepalive_timeout);
            protoWriter2.writeBytes(cdnDomainRefresh.unknownFields());
        }

        public final CdnDomainRefresh decode(ProtoReader protoReader, CdnDomainRefresh cdnDomainRefresh) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            CdnDomainRefresh cdnDomainRefresh2 = cdnDomainRefresh;
            if (PatchProxy.isSupport(new Object[]{protoReader2, cdnDomainRefresh2}, this, changeQuickRedirect, false, 47769, new Class[]{ProtoReader.class, CdnDomainRefresh.class}, CdnDomainRefresh.class)) {
                return (CdnDomainRefresh) PatchProxy.accessDispatch(new Object[]{protoReader2, cdnDomainRefresh2}, this, changeQuickRedirect, false, 47769, new Class[]{ProtoReader.class, CdnDomainRefresh.class}, CdnDomainRefresh.class);
            }
            CdnDomainRefresh cdnDomainRefresh3 = (CdnDomainRefresh) a.a().a(CdnDomainRefresh.class, cdnDomainRefresh2);
            if (cdnDomainRefresh3 != null) {
                builder = cdnDomainRefresh3.newBuilder();
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
                            builder2.refresh_switch((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 2:
                            builder2.refresh_interval((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 3:
                            builder2.keepalive_timeout((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (cdnDomainRefresh3 != null) {
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
    public final Integer getKeepaliveTimeout() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47760, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47760, new Class[0], Integer.class);
        } else if (this.keepalive_timeout != null) {
            return this.keepalive_timeout;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getRefreshInterval() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47759, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47759, new Class[0], Integer.class);
        } else if (this.refresh_interval != null) {
            return this.refresh_interval;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean getRefreshSwitch() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47758, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47758, new Class[0], Boolean.class);
        } else if (this.refresh_switch != null) {
            return this.refresh_switch;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47763, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47763, new Class[0], Integer.TYPE)).intValue();
        }
        int i4 = this.hashCode;
        if (i4 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.refresh_switch != null) {
                i = this.refresh_switch.hashCode();
            } else {
                i = 0;
            }
            int i5 = (hashCode + i) * 37;
            if (this.refresh_interval != null) {
                i2 = this.refresh_interval.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 37;
            if (this.keepalive_timeout != null) {
                i3 = this.keepalive_timeout.hashCode();
            }
            i4 = i6 + i3;
            this.hashCode = i4;
        }
        return i4;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47761, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47761, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.refresh_switch = this.refresh_switch;
        builder.refresh_interval = this.refresh_interval;
        builder.keepalive_timeout = this.keepalive_timeout;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47764, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47764, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.refresh_switch != null) {
            sb.append(", refresh_switch=");
            sb.append(this.refresh_switch);
        }
        if (this.refresh_interval != null) {
            sb.append(", refresh_interval=");
            sb.append(this.refresh_interval);
        }
        if (this.keepalive_timeout != null) {
            sb.append(", keepalive_timeout=");
            sb.append(this.keepalive_timeout);
        }
        StringBuilder replace = sb.replace(0, 2, "CdnDomainRefresh{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47762, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47762, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof CdnDomainRefresh)) {
                return false;
            }
            CdnDomainRefresh cdnDomainRefresh = (CdnDomainRefresh) obj;
            if (!unknownFields().equals(cdnDomainRefresh.unknownFields()) || !Internal.equals(this.refresh_switch, cdnDomainRefresh.refresh_switch) || !Internal.equals(this.refresh_interval, cdnDomainRefresh.refresh_interval) || !Internal.equals(this.keepalive_timeout, cdnDomainRefresh.keepalive_timeout)) {
                return false;
            }
            return true;
        }
    }

    public CdnDomainRefresh(Boolean bool, Integer num, Integer num2) {
        this(bool, num, num2, ByteString.EMPTY);
    }

    public CdnDomainRefresh(Boolean bool, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.refresh_switch = bool;
        this.refresh_interval = num;
        this.keepalive_timeout = num2;
    }
}
