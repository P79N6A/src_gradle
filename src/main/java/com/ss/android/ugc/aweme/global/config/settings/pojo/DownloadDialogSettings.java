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

public final class DownloadDialogSettings extends Message<DownloadDialogSettings, Builder> {
    public static final DefaultValueProtoAdapter<DownloadDialogSettings> ADAPTER = new ProtoAdapter_DownloadDialogSettings();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer is_enable_back_dialog;

    public static final class Builder extends Message.Builder<DownloadDialogSettings, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Integer is_enable_back_dialog;

        public final DownloadDialogSettings build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47833, new Class[0], DownloadDialogSettings.class)) {
                return new DownloadDialogSettings(this.is_enable_back_dialog, super.buildUnknownFields());
            }
            return (DownloadDialogSettings) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47833, new Class[0], DownloadDialogSettings.class);
        }

        public final Builder is_enable_back_dialog(Integer num) {
            this.is_enable_back_dialog = num;
            return this;
        }
    }

    static final class ProtoAdapter_DownloadDialogSettings extends DefaultValueProtoAdapter<DownloadDialogSettings> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final DownloadDialogSettings redact(DownloadDialogSettings downloadDialogSettings) {
            return downloadDialogSettings;
        }

        public ProtoAdapter_DownloadDialogSettings() {
            super(FieldEncoding.LENGTH_DELIMITED, DownloadDialogSettings.class);
        }

        public final DownloadDialogSettings decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47836, new Class[]{ProtoReader.class}, DownloadDialogSettings.class)) {
                return decode(protoReader2, (DownloadDialogSettings) null);
            }
            return (DownloadDialogSettings) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47836, new Class[]{ProtoReader.class}, DownloadDialogSettings.class);
        }

        public final int encodedSize(DownloadDialogSettings downloadDialogSettings) {
            DownloadDialogSettings downloadDialogSettings2 = downloadDialogSettings;
            if (!PatchProxy.isSupport(new Object[]{downloadDialogSettings2}, this, changeQuickRedirect, false, 47834, new Class[]{DownloadDialogSettings.class}, Integer.TYPE)) {
                return ProtoAdapter.INT32.encodedSizeWithTag(1, downloadDialogSettings2.is_enable_back_dialog) + downloadDialogSettings.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{downloadDialogSettings2}, this, changeQuickRedirect, false, 47834, new Class[]{DownloadDialogSettings.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, DownloadDialogSettings downloadDialogSettings) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            DownloadDialogSettings downloadDialogSettings2 = downloadDialogSettings;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, downloadDialogSettings2}, this, changeQuickRedirect, false, 47835, new Class[]{ProtoWriter.class, DownloadDialogSettings.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, downloadDialogSettings2}, this, changeQuickRedirect, false, 47835, new Class[]{ProtoWriter.class, DownloadDialogSettings.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 1, downloadDialogSettings2.is_enable_back_dialog);
            protoWriter2.writeBytes(downloadDialogSettings.unknownFields());
        }

        public final DownloadDialogSettings decode(ProtoReader protoReader, DownloadDialogSettings downloadDialogSettings) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            DownloadDialogSettings downloadDialogSettings2 = downloadDialogSettings;
            if (PatchProxy.isSupport(new Object[]{protoReader2, downloadDialogSettings2}, this, changeQuickRedirect, false, 47837, new Class[]{ProtoReader.class, DownloadDialogSettings.class}, DownloadDialogSettings.class)) {
                return (DownloadDialogSettings) PatchProxy.accessDispatch(new Object[]{protoReader2, downloadDialogSettings2}, this, changeQuickRedirect, false, 47837, new Class[]{ProtoReader.class, DownloadDialogSettings.class}, DownloadDialogSettings.class);
            }
            DownloadDialogSettings downloadDialogSettings3 = (DownloadDialogSettings) a.a().a(DownloadDialogSettings.class, downloadDialogSettings2);
            if (downloadDialogSettings3 != null) {
                builder = downloadDialogSettings3.newBuilder();
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
                        if (downloadDialogSettings3 == null) {
                            throw e2;
                        }
                    }
                } else {
                    builder2.is_enable_back_dialog((Integer) ProtoAdapter.INT32.decode(protoReader2));
                }
            }
        }
    }

    @KtNullable
    public final Integer getIsEnableBackDialog() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47828, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47828, new Class[0], Integer.class);
        } else if (this.is_enable_back_dialog != null) {
            return this.is_enable_back_dialog;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47829, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47829, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.is_enable_back_dialog = this.is_enable_back_dialog;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47831, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47831, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.is_enable_back_dialog != null) {
                i = this.is_enable_back_dialog.hashCode();
            }
            i2 = hashCode + i;
            this.hashCode = i2;
        }
        return i2;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47832, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47832, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.is_enable_back_dialog != null) {
            sb.append(", is_enable_back_dialog=");
            sb.append(this.is_enable_back_dialog);
        }
        StringBuilder replace = sb.replace(0, 2, "DownloadDialogSettings{");
        replace.append('}');
        return replace.toString();
    }

    public DownloadDialogSettings(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47830, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47830, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof DownloadDialogSettings)) {
                return false;
            }
            DownloadDialogSettings downloadDialogSettings = (DownloadDialogSettings) obj;
            if (!unknownFields().equals(downloadDialogSettings.unknownFields()) || !Internal.equals(this.is_enable_back_dialog, downloadDialogSettings.is_enable_back_dialog)) {
                return false;
            }
            return true;
        }
    }

    public DownloadDialogSettings(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_enable_back_dialog = num;
    }
}
