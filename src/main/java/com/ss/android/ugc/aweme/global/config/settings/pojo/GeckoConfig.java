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
import java.util.List;
import okio.ByteString;

public final class GeckoConfig extends Message<GeckoConfig, Builder> {
    public static final DefaultValueProtoAdapter<GeckoConfig> ADAPTER = new ProtoAdapter_GeckoConfig();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 1)
    public final List<String> initial_channel;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer rn_context_create_timeout;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public final Boolean rn_preload_context;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 5)
    public final Boolean rn_use_snapshot;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 4)
    public final Boolean use_new_package_now;

    public static final class Builder extends Message.Builder<GeckoConfig, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public List<String> initial_channel = Internal.newMutableList();
        public Integer rn_context_create_timeout;
        public Boolean rn_preload_context;
        public Boolean rn_use_snapshot;
        public Boolean use_new_package_now;

        public final GeckoConfig build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47963, new Class[0], GeckoConfig.class)) {
                return (GeckoConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47963, new Class[0], GeckoConfig.class);
            }
            GeckoConfig geckoConfig = new GeckoConfig(this.initial_channel, this.rn_context_create_timeout, this.rn_preload_context, this.use_new_package_now, this.rn_use_snapshot, super.buildUnknownFields());
            return geckoConfig;
        }

        public final Builder rn_context_create_timeout(Integer num) {
            this.rn_context_create_timeout = num;
            return this;
        }

        public final Builder rn_preload_context(Boolean bool) {
            this.rn_preload_context = bool;
            return this;
        }

        public final Builder rn_use_snapshot(Boolean bool) {
            this.rn_use_snapshot = bool;
            return this;
        }

        public final Builder use_new_package_now(Boolean bool) {
            this.use_new_package_now = bool;
            return this;
        }

        public final Builder initial_channel(List<String> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 47962, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 47962, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.initial_channel = list;
            return this;
        }
    }

    static final class ProtoAdapter_GeckoConfig extends DefaultValueProtoAdapter<GeckoConfig> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final GeckoConfig redact(GeckoConfig geckoConfig) {
            return geckoConfig;
        }

        public ProtoAdapter_GeckoConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, GeckoConfig.class);
        }

        public final GeckoConfig decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47966, new Class[]{ProtoReader.class}, GeckoConfig.class)) {
                return decode(protoReader2, (GeckoConfig) null);
            }
            return (GeckoConfig) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47966, new Class[]{ProtoReader.class}, GeckoConfig.class);
        }

        public final int encodedSize(GeckoConfig geckoConfig) {
            GeckoConfig geckoConfig2 = geckoConfig;
            if (!PatchProxy.isSupport(new Object[]{geckoConfig2}, this, changeQuickRedirect, false, 47964, new Class[]{GeckoConfig.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, geckoConfig2.initial_channel) + ProtoAdapter.INT32.encodedSizeWithTag(2, geckoConfig2.rn_context_create_timeout) + ProtoAdapter.BOOL.encodedSizeWithTag(3, geckoConfig2.rn_preload_context) + ProtoAdapter.BOOL.encodedSizeWithTag(4, geckoConfig2.use_new_package_now) + ProtoAdapter.BOOL.encodedSizeWithTag(5, geckoConfig2.rn_use_snapshot) + geckoConfig.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{geckoConfig2}, this, changeQuickRedirect, false, 47964, new Class[]{GeckoConfig.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, GeckoConfig geckoConfig) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            GeckoConfig geckoConfig2 = geckoConfig;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, geckoConfig2}, this, changeQuickRedirect, false, 47965, new Class[]{ProtoWriter.class, GeckoConfig.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, geckoConfig2}, this, changeQuickRedirect, false, 47965, new Class[]{ProtoWriter.class, GeckoConfig.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter2, 1, geckoConfig2.initial_channel);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 2, geckoConfig2.rn_context_create_timeout);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 3, geckoConfig2.rn_preload_context);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 4, geckoConfig2.use_new_package_now);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 5, geckoConfig2.rn_use_snapshot);
            protoWriter2.writeBytes(geckoConfig.unknownFields());
        }

        public final GeckoConfig decode(ProtoReader protoReader, GeckoConfig geckoConfig) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            GeckoConfig geckoConfig2 = geckoConfig;
            if (PatchProxy.isSupport(new Object[]{protoReader2, geckoConfig2}, this, changeQuickRedirect, false, 47967, new Class[]{ProtoReader.class, GeckoConfig.class}, GeckoConfig.class)) {
                return (GeckoConfig) PatchProxy.accessDispatch(new Object[]{protoReader2, geckoConfig2}, this, changeQuickRedirect, false, 47967, new Class[]{ProtoReader.class, GeckoConfig.class}, GeckoConfig.class);
            }
            GeckoConfig geckoConfig3 = (GeckoConfig) a.a().a(GeckoConfig.class, geckoConfig2);
            if (geckoConfig3 != null) {
                builder = geckoConfig3.newBuilder();
            } else {
                builder = new Builder();
            }
            Builder builder2 = builder;
            List<String> newMutableList = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            newMutableList.add(ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 2:
                            builder2.rn_context_create_timeout((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 3:
                            builder2.rn_preload_context((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 4:
                            builder2.use_new_package_now((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 5:
                            builder2.rn_use_snapshot((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (geckoConfig3 != null) {
                                    break;
                                } else {
                                    throw e2;
                                }
                            }
                    }
                } else {
                    protoReader2.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder2.initial_channel = newMutableList;
                    }
                    return builder2.build();
                }
            }
        }
    }

    public final List<String> getInitialChannel() {
        return this.initial_channel;
    }

    @KtNullable
    public final Integer getRnContextCreateTimeout() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47954, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47954, new Class[0], Integer.class);
        } else if (this.rn_context_create_timeout != null) {
            return this.rn_context_create_timeout;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean getRnPreloadContext() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47955, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47955, new Class[0], Boolean.class);
        } else if (this.rn_preload_context != null) {
            return this.rn_preload_context;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean getRnUseSnapshot() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47957, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47957, new Class[0], Boolean.class);
        } else if (this.rn_use_snapshot != null) {
            return this.rn_use_snapshot;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean getUseNewPackageNow() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47956, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47956, new Class[0], Boolean.class);
        } else if (this.use_new_package_now != null) {
            return this.use_new_package_now;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47960, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47960, new Class[0], Integer.TYPE)).intValue();
        }
        int i5 = this.hashCode;
        if (i5 == 0) {
            int hashCode = ((unknownFields().hashCode() * 37) + this.initial_channel.hashCode()) * 37;
            if (this.rn_context_create_timeout != null) {
                i = this.rn_context_create_timeout.hashCode();
            } else {
                i = 0;
            }
            int i6 = (hashCode + i) * 37;
            if (this.rn_preload_context != null) {
                i2 = this.rn_preload_context.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 37;
            if (this.use_new_package_now != null) {
                i3 = this.use_new_package_now.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 37;
            if (this.rn_use_snapshot != null) {
                i4 = this.rn_use_snapshot.hashCode();
            }
            i5 = i8 + i4;
            this.hashCode = i5;
        }
        return i5;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47958, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47958, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.initial_channel = Internal.copyOf("initial_channel", this.initial_channel);
        builder.rn_context_create_timeout = this.rn_context_create_timeout;
        builder.rn_preload_context = this.rn_preload_context;
        builder.use_new_package_now = this.use_new_package_now;
        builder.rn_use_snapshot = this.rn_use_snapshot;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47961, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47961, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (!this.initial_channel.isEmpty()) {
            sb.append(", initial_channel=");
            sb.append(this.initial_channel);
        }
        if (this.rn_context_create_timeout != null) {
            sb.append(", rn_context_create_timeout=");
            sb.append(this.rn_context_create_timeout);
        }
        if (this.rn_preload_context != null) {
            sb.append(", rn_preload_context=");
            sb.append(this.rn_preload_context);
        }
        if (this.use_new_package_now != null) {
            sb.append(", use_new_package_now=");
            sb.append(this.use_new_package_now);
        }
        if (this.rn_use_snapshot != null) {
            sb.append(", rn_use_snapshot=");
            sb.append(this.rn_use_snapshot);
        }
        StringBuilder replace = sb.replace(0, 2, "GeckoConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47959, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47959, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof GeckoConfig)) {
                return false;
            }
            GeckoConfig geckoConfig = (GeckoConfig) obj;
            if (!unknownFields().equals(geckoConfig.unknownFields()) || !this.initial_channel.equals(geckoConfig.initial_channel) || !Internal.equals(this.rn_context_create_timeout, geckoConfig.rn_context_create_timeout) || !Internal.equals(this.rn_preload_context, geckoConfig.rn_preload_context) || !Internal.equals(this.use_new_package_now, geckoConfig.use_new_package_now) || !Internal.equals(this.rn_use_snapshot, geckoConfig.rn_use_snapshot)) {
                return false;
            }
            return true;
        }
    }

    public GeckoConfig(List<String> list, Integer num, Boolean bool, Boolean bool2, Boolean bool3) {
        this(list, num, bool, bool2, bool3, ByteString.EMPTY);
    }

    public GeckoConfig(List<String> list, Integer num, Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.initial_channel = Internal.immutableCopyOf("initial_channel", list);
        this.rn_context_create_timeout = num;
        this.rn_preload_context = bool;
        this.use_new_package_now = bool2;
        this.rn_use_snapshot = bool3;
    }
}
