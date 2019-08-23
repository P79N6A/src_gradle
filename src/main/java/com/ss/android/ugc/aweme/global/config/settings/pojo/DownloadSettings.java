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

public final class DownloadSettings extends Message<DownloadSettings, Builder> {
    public static final DefaultValueProtoAdapter<DownloadSettings> ADAPTER = new ProtoAdapter_DownloadSettings();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.DownloadDialogSettings#ADAPTER", tag = 1)
    public final DownloadDialogSettings download_dialog_config;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer download_lib_switch;

    public static final class Builder extends Message.Builder<DownloadSettings, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public DownloadDialogSettings download_dialog_config;
        public Integer download_lib_switch;

        public final DownloadSettings build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47844, new Class[0], DownloadSettings.class)) {
                return new DownloadSettings(this.download_dialog_config, this.download_lib_switch, super.buildUnknownFields());
            }
            return (DownloadSettings) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47844, new Class[0], DownloadSettings.class);
        }

        public final Builder download_dialog_config(DownloadDialogSettings downloadDialogSettings) {
            this.download_dialog_config = downloadDialogSettings;
            return this;
        }

        public final Builder download_lib_switch(Integer num) {
            this.download_lib_switch = num;
            return this;
        }
    }

    static final class ProtoAdapter_DownloadSettings extends DefaultValueProtoAdapter<DownloadSettings> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final DownloadSettings redact(DownloadSettings downloadSettings) {
            return downloadSettings;
        }

        public ProtoAdapter_DownloadSettings() {
            super(FieldEncoding.LENGTH_DELIMITED, DownloadSettings.class);
        }

        public final DownloadSettings decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47847, new Class[]{ProtoReader.class}, DownloadSettings.class)) {
                return decode(protoReader2, (DownloadSettings) null);
            }
            return (DownloadSettings) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47847, new Class[]{ProtoReader.class}, DownloadSettings.class);
        }

        public final int encodedSize(DownloadSettings downloadSettings) {
            DownloadSettings downloadSettings2 = downloadSettings;
            if (!PatchProxy.isSupport(new Object[]{downloadSettings2}, this, changeQuickRedirect, false, 47845, new Class[]{DownloadSettings.class}, Integer.TYPE)) {
                return DownloadDialogSettings.ADAPTER.encodedSizeWithTag(1, downloadSettings2.download_dialog_config) + ProtoAdapter.INT32.encodedSizeWithTag(2, downloadSettings2.download_lib_switch) + downloadSettings.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{downloadSettings2}, this, changeQuickRedirect, false, 47845, new Class[]{DownloadSettings.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, DownloadSettings downloadSettings) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            DownloadSettings downloadSettings2 = downloadSettings;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, downloadSettings2}, this, changeQuickRedirect, false, 47846, new Class[]{ProtoWriter.class, DownloadSettings.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, downloadSettings2}, this, changeQuickRedirect, false, 47846, new Class[]{ProtoWriter.class, DownloadSettings.class}, Void.TYPE);
                return;
            }
            DownloadDialogSettings.ADAPTER.encodeWithTag(protoWriter2, 1, downloadSettings2.download_dialog_config);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 2, downloadSettings2.download_lib_switch);
            protoWriter2.writeBytes(downloadSettings.unknownFields());
        }

        public final DownloadSettings decode(ProtoReader protoReader, DownloadSettings downloadSettings) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            DownloadSettings downloadSettings2 = downloadSettings;
            if (PatchProxy.isSupport(new Object[]{protoReader2, downloadSettings2}, this, changeQuickRedirect, false, 47848, new Class[]{ProtoReader.class, DownloadSettings.class}, DownloadSettings.class)) {
                return (DownloadSettings) PatchProxy.accessDispatch(new Object[]{protoReader2, downloadSettings2}, this, changeQuickRedirect, false, 47848, new Class[]{ProtoReader.class, DownloadSettings.class}, DownloadSettings.class);
            }
            DownloadSettings downloadSettings3 = (DownloadSettings) a.a().a(DownloadSettings.class, downloadSettings2);
            if (downloadSettings3 != null) {
                builder = downloadSettings3.newBuilder();
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
                            builder2.download_dialog_config((DownloadDialogSettings) DownloadDialogSettings.ADAPTER.decode(protoReader2, builder2.download_dialog_config));
                            break;
                        case 2:
                            builder2.download_lib_switch((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (downloadSettings3 != null) {
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
    public final DownloadDialogSettings getDownloadDialogConfig() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47838, new Class[0], DownloadDialogSettings.class)) {
            return (DownloadDialogSettings) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47838, new Class[0], DownloadDialogSettings.class);
        } else if (this.download_dialog_config != null) {
            return this.download_dialog_config;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getDownloadLibSwitch() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47839, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47839, new Class[0], Integer.class);
        } else if (this.download_lib_switch != null) {
            return this.download_lib_switch;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47840, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47840, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.download_dialog_config = this.download_dialog_config;
        builder.download_lib_switch = this.download_lib_switch;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47842, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47842, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.download_dialog_config != null) {
                i = this.download_dialog_config.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.download_lib_switch != null) {
                i2 = this.download_lib_switch.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47843, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47843, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.download_dialog_config != null) {
            sb.append(", download_dialog_config=");
            sb.append(this.download_dialog_config);
        }
        if (this.download_lib_switch != null) {
            sb.append(", download_lib_switch=");
            sb.append(this.download_lib_switch);
        }
        StringBuilder replace = sb.replace(0, 2, "DownloadSettings{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47841, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47841, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof DownloadSettings)) {
                return false;
            }
            DownloadSettings downloadSettings = (DownloadSettings) obj;
            if (!unknownFields().equals(downloadSettings.unknownFields()) || !Internal.equals(this.download_dialog_config, downloadSettings.download_dialog_config) || !Internal.equals(this.download_lib_switch, downloadSettings.download_lib_switch)) {
                return false;
            }
            return true;
        }
    }

    public DownloadSettings(DownloadDialogSettings downloadDialogSettings, Integer num) {
        this(downloadDialogSettings, num, ByteString.EMPTY);
    }

    public DownloadSettings(DownloadDialogSettings downloadDialogSettings, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.download_dialog_config = downloadDialogSettings;
        this.download_lib_switch = num;
    }
}
