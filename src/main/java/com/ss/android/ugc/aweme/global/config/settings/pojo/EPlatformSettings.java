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

public final class EPlatformSettings extends Message<EPlatformSettings, Builder> {
    public static final DefaultValueProtoAdapter<EPlatformSettings> ADAPTER = new ProtoAdapter_EPlatformSettings();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String block_hint;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public final Integer block_mode;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 2)
    public final List<String> jump_block_list;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String jump_redirect_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String lite_link;

    public static final class Builder extends Message.Builder<EPlatformSettings, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String block_hint;
        public Integer block_mode;
        public List<String> jump_block_list = Internal.newMutableList();
        public String jump_redirect_url;
        public String lite_link;

        public final EPlatformSettings build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47858, new Class[0], EPlatformSettings.class)) {
                return (EPlatformSettings) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47858, new Class[0], EPlatformSettings.class);
            }
            EPlatformSettings ePlatformSettings = new EPlatformSettings(this.lite_link, this.jump_block_list, this.jump_redirect_url, this.block_hint, this.block_mode, super.buildUnknownFields());
            return ePlatformSettings;
        }

        public final Builder block_hint(String str) {
            this.block_hint = str;
            return this;
        }

        public final Builder block_mode(Integer num) {
            this.block_mode = num;
            return this;
        }

        public final Builder jump_redirect_url(String str) {
            this.jump_redirect_url = str;
            return this;
        }

        public final Builder lite_link(String str) {
            this.lite_link = str;
            return this;
        }

        public final Builder jump_block_list(List<String> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 47857, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 47857, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.jump_block_list = list;
            return this;
        }
    }

    static final class ProtoAdapter_EPlatformSettings extends DefaultValueProtoAdapter<EPlatformSettings> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final EPlatformSettings redact(EPlatformSettings ePlatformSettings) {
            return ePlatformSettings;
        }

        public ProtoAdapter_EPlatformSettings() {
            super(FieldEncoding.LENGTH_DELIMITED, EPlatformSettings.class);
        }

        public final EPlatformSettings decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47861, new Class[]{ProtoReader.class}, EPlatformSettings.class)) {
                return decode(protoReader2, (EPlatformSettings) null);
            }
            return (EPlatformSettings) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47861, new Class[]{ProtoReader.class}, EPlatformSettings.class);
        }

        public final int encodedSize(EPlatformSettings ePlatformSettings) {
            EPlatformSettings ePlatformSettings2 = ePlatformSettings;
            if (!PatchProxy.isSupport(new Object[]{ePlatformSettings2}, this, changeQuickRedirect, false, 47859, new Class[]{EPlatformSettings.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, ePlatformSettings2.lite_link) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, ePlatformSettings2.jump_block_list) + ProtoAdapter.STRING.encodedSizeWithTag(3, ePlatformSettings2.jump_redirect_url) + ProtoAdapter.STRING.encodedSizeWithTag(4, ePlatformSettings2.block_hint) + ProtoAdapter.INT32.encodedSizeWithTag(5, ePlatformSettings2.block_mode) + ePlatformSettings.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{ePlatformSettings2}, this, changeQuickRedirect, false, 47859, new Class[]{EPlatformSettings.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, EPlatformSettings ePlatformSettings) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            EPlatformSettings ePlatformSettings2 = ePlatformSettings;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, ePlatformSettings2}, this, changeQuickRedirect, false, 47860, new Class[]{ProtoWriter.class, EPlatformSettings.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, ePlatformSettings2}, this, changeQuickRedirect, false, 47860, new Class[]{ProtoWriter.class, EPlatformSettings.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, ePlatformSettings2.lite_link);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter2, 2, ePlatformSettings2.jump_block_list);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, ePlatformSettings2.jump_redirect_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, ePlatformSettings2.block_hint);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 5, ePlatformSettings2.block_mode);
            protoWriter2.writeBytes(ePlatformSettings.unknownFields());
        }

        public final EPlatformSettings decode(ProtoReader protoReader, EPlatformSettings ePlatformSettings) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            EPlatformSettings ePlatformSettings2 = ePlatformSettings;
            if (PatchProxy.isSupport(new Object[]{protoReader2, ePlatformSettings2}, this, changeQuickRedirect, false, 47862, new Class[]{ProtoReader.class, EPlatformSettings.class}, EPlatformSettings.class)) {
                return (EPlatformSettings) PatchProxy.accessDispatch(new Object[]{protoReader2, ePlatformSettings2}, this, changeQuickRedirect, false, 47862, new Class[]{ProtoReader.class, EPlatformSettings.class}, EPlatformSettings.class);
            }
            EPlatformSettings ePlatformSettings3 = (EPlatformSettings) a.a().a(EPlatformSettings.class, ePlatformSettings2);
            if (ePlatformSettings3 != null) {
                builder = ePlatformSettings3.newBuilder();
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
                            builder2.lite_link((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 2:
                            newMutableList.add(ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 3:
                            builder2.jump_redirect_url((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 4:
                            builder2.block_hint((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 5:
                            builder2.block_mode((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (ePlatformSettings3 != null) {
                                    break;
                                } else {
                                    throw e2;
                                }
                            }
                    }
                } else {
                    protoReader2.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder2.jump_block_list = newMutableList;
                    }
                    return builder2.build();
                }
            }
        }
    }

    public final List<String> getJumpBlockList() {
        return this.jump_block_list;
    }

    @KtNullable
    public final String getBlockHint() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47851, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47851, new Class[0], String.class);
        } else if (this.block_hint != null) {
            return this.block_hint;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getBlockMode() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47852, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47852, new Class[0], Integer.class);
        } else if (this.block_mode != null) {
            return this.block_mode;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getJumpRedirectUrl() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47850, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47850, new Class[0], String.class);
        } else if (this.jump_redirect_url != null) {
            return this.jump_redirect_url;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getLiteLink() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47849, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47849, new Class[0], String.class);
        } else if (this.lite_link != null) {
            return this.lite_link;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47855, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47855, new Class[0], Integer.TYPE)).intValue();
        }
        int i5 = this.hashCode;
        if (i5 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.lite_link != null) {
                i = this.lite_link.hashCode();
            } else {
                i = 0;
            }
            int hashCode2 = (((hashCode + i) * 37) + this.jump_block_list.hashCode()) * 37;
            if (this.jump_redirect_url != null) {
                i2 = this.jump_redirect_url.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (hashCode2 + i2) * 37;
            if (this.block_hint != null) {
                i3 = this.block_hint.hashCode();
            } else {
                i3 = 0;
            }
            int i7 = (i6 + i3) * 37;
            if (this.block_mode != null) {
                i4 = this.block_mode.hashCode();
            }
            i5 = i7 + i4;
            this.hashCode = i5;
        }
        return i5;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47853, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47853, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.lite_link = this.lite_link;
        builder.jump_block_list = Internal.copyOf("jump_block_list", this.jump_block_list);
        builder.jump_redirect_url = this.jump_redirect_url;
        builder.block_hint = this.block_hint;
        builder.block_mode = this.block_mode;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47856, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47856, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.lite_link != null) {
            sb.append(", lite_link=");
            sb.append(this.lite_link);
        }
        if (!this.jump_block_list.isEmpty()) {
            sb.append(", jump_block_list=");
            sb.append(this.jump_block_list);
        }
        if (this.jump_redirect_url != null) {
            sb.append(", jump_redirect_url=");
            sb.append(this.jump_redirect_url);
        }
        if (this.block_hint != null) {
            sb.append(", block_hint=");
            sb.append(this.block_hint);
        }
        if (this.block_mode != null) {
            sb.append(", block_mode=");
            sb.append(this.block_mode);
        }
        StringBuilder replace = sb.replace(0, 2, "EPlatformSettings{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47854, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47854, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof EPlatformSettings)) {
                return false;
            }
            EPlatformSettings ePlatformSettings = (EPlatformSettings) obj;
            if (!unknownFields().equals(ePlatformSettings.unknownFields()) || !Internal.equals(this.lite_link, ePlatformSettings.lite_link) || !this.jump_block_list.equals(ePlatformSettings.jump_block_list) || !Internal.equals(this.jump_redirect_url, ePlatformSettings.jump_redirect_url) || !Internal.equals(this.block_hint, ePlatformSettings.block_hint) || !Internal.equals(this.block_mode, ePlatformSettings.block_mode)) {
                return false;
            }
            return true;
        }
    }

    public EPlatformSettings(String str, List<String> list, String str2, String str3, Integer num) {
        this(str, list, str2, str3, num, ByteString.EMPTY);
    }

    public EPlatformSettings(String str, List<String> list, String str2, String str3, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.lite_link = str;
        this.jump_block_list = Internal.immutableCopyOf("jump_block_list", list);
        this.jump_redirect_url = str2;
        this.block_hint = str3;
        this.block_mode = num;
    }
}
