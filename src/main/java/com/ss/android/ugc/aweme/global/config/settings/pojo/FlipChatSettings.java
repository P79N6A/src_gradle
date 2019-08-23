package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.KtNullable;
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
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class FlipChatSettings extends Message<FlipChatSettings, Builder> {
    public static final DefaultValueProtoAdapter<FlipChatSettings> ADAPTER = new ProtoAdapter_FlipChatSettings();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = 0, tag = 1)
    public final Boolean main_switch;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String msg_cell_avatar_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String msg_cell_name;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = 0, tag = 2)
    public final Boolean show_launch_page_popup;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = 0, tag = 3)
    public final Boolean show_login_icon;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = 0, tag = 4)
    public final Boolean show_msg_cell;

    public static final class Builder extends Message.Builder<FlipChatSettings, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Boolean main_switch;
        public String msg_cell_avatar_url;
        public String msg_cell_name;
        public Boolean show_launch_page_popup;
        public Boolean show_login_icon;
        public Boolean show_msg_cell;

        public final FlipChatSettings build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47911, new Class[0], FlipChatSettings.class)) {
                return (FlipChatSettings) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47911, new Class[0], FlipChatSettings.class);
            } else if (this.main_switch == null || this.show_launch_page_popup == null || this.show_login_icon == null || this.show_msg_cell == null) {
                throw c.a(this.main_switch, "main_switch", this.show_launch_page_popup, "show_launch_page_popup", this.show_login_icon, "show_login_icon", this.show_msg_cell, "show_msg_cell");
            } else {
                FlipChatSettings flipChatSettings = new FlipChatSettings(this.main_switch, this.show_launch_page_popup, this.show_login_icon, this.show_msg_cell, this.msg_cell_name, this.msg_cell_avatar_url, super.buildUnknownFields());
                return flipChatSettings;
            }
        }

        public final Builder main_switch(Boolean bool) {
            this.main_switch = bool;
            return this;
        }

        public final Builder msg_cell_avatar_url(String str) {
            this.msg_cell_avatar_url = str;
            return this;
        }

        public final Builder msg_cell_name(String str) {
            this.msg_cell_name = str;
            return this;
        }

        public final Builder show_launch_page_popup(Boolean bool) {
            this.show_launch_page_popup = bool;
            return this;
        }

        public final Builder show_login_icon(Boolean bool) {
            this.show_login_icon = bool;
            return this;
        }

        public final Builder show_msg_cell(Boolean bool) {
            this.show_msg_cell = bool;
            return this;
        }
    }

    static final class ProtoAdapter_FlipChatSettings extends DefaultValueProtoAdapter<FlipChatSettings> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final FlipChatSettings redact(FlipChatSettings flipChatSettings) {
            return flipChatSettings;
        }

        public ProtoAdapter_FlipChatSettings() {
            super(FieldEncoding.LENGTH_DELIMITED, FlipChatSettings.class);
        }

        public final FlipChatSettings decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47914, new Class[]{ProtoReader.class}, FlipChatSettings.class)) {
                return decode(protoReader2, (FlipChatSettings) null);
            }
            return (FlipChatSettings) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47914, new Class[]{ProtoReader.class}, FlipChatSettings.class);
        }

        public final int encodedSize(FlipChatSettings flipChatSettings) {
            FlipChatSettings flipChatSettings2 = flipChatSettings;
            if (!PatchProxy.isSupport(new Object[]{flipChatSettings2}, this, changeQuickRedirect, false, 47912, new Class[]{FlipChatSettings.class}, Integer.TYPE)) {
                return ProtoAdapter.BOOL.encodedSizeWithTag(1, flipChatSettings2.main_switch) + ProtoAdapter.BOOL.encodedSizeWithTag(2, flipChatSettings2.show_launch_page_popup) + ProtoAdapter.BOOL.encodedSizeWithTag(3, flipChatSettings2.show_login_icon) + ProtoAdapter.BOOL.encodedSizeWithTag(4, flipChatSettings2.show_msg_cell) + ProtoAdapter.STRING.encodedSizeWithTag(5, flipChatSettings2.msg_cell_name) + ProtoAdapter.STRING.encodedSizeWithTag(6, flipChatSettings2.msg_cell_avatar_url) + flipChatSettings.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{flipChatSettings2}, this, changeQuickRedirect, false, 47912, new Class[]{FlipChatSettings.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, FlipChatSettings flipChatSettings) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            FlipChatSettings flipChatSettings2 = flipChatSettings;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, flipChatSettings2}, this, changeQuickRedirect, false, 47913, new Class[]{ProtoWriter.class, FlipChatSettings.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, flipChatSettings2}, this, changeQuickRedirect, false, 47913, new Class[]{ProtoWriter.class, FlipChatSettings.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1, flipChatSettings2.main_switch);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 2, flipChatSettings2.show_launch_page_popup);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 3, flipChatSettings2.show_login_icon);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 4, flipChatSettings2.show_msg_cell);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 5, flipChatSettings2.msg_cell_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 6, flipChatSettings2.msg_cell_avatar_url);
            protoWriter2.writeBytes(flipChatSettings.unknownFields());
        }

        public final FlipChatSettings decode(ProtoReader protoReader, FlipChatSettings flipChatSettings) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            FlipChatSettings flipChatSettings2 = flipChatSettings;
            if (PatchProxy.isSupport(new Object[]{protoReader2, flipChatSettings2}, this, changeQuickRedirect, false, 47915, new Class[]{ProtoReader.class, FlipChatSettings.class}, FlipChatSettings.class)) {
                return (FlipChatSettings) PatchProxy.accessDispatch(new Object[]{protoReader2, flipChatSettings2}, this, changeQuickRedirect, false, 47915, new Class[]{ProtoReader.class, FlipChatSettings.class}, FlipChatSettings.class);
            }
            FlipChatSettings flipChatSettings3 = (FlipChatSettings) a.a().a(FlipChatSettings.class, flipChatSettings2);
            if (flipChatSettings3 != null) {
                builder = flipChatSettings3.newBuilder();
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
                            builder2.main_switch((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 2:
                            builder2.show_launch_page_popup((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 3:
                            builder2.show_login_icon((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 4:
                            builder2.show_msg_cell((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 5:
                            builder2.msg_cell_name((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 6:
                            builder2.msg_cell_avatar_url((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (flipChatSettings3 != null) {
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

    public final Boolean getMainSwitch() {
        return this.main_switch;
    }

    public final Boolean getShowLaunchPagePopup() {
        return this.show_launch_page_popup;
    }

    public final Boolean getShowLoginIcon() {
        return this.show_login_icon;
    }

    public final Boolean getShowMsgCell() {
        return this.show_msg_cell;
    }

    @KtNullable
    public final String getMsgCellAvatarUrl() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47906, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47906, new Class[0], String.class);
        } else if (this.msg_cell_avatar_url != null) {
            return this.msg_cell_avatar_url;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getMsgCellName() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47905, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47905, new Class[0], String.class);
        } else if (this.msg_cell_name != null) {
            return this.msg_cell_name;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47909, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47909, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = ((((((((unknownFields().hashCode() * 37) + this.main_switch.hashCode()) * 37) + this.show_launch_page_popup.hashCode()) * 37) + this.show_login_icon.hashCode()) * 37) + this.show_msg_cell.hashCode()) * 37;
            if (this.msg_cell_name != null) {
                i = this.msg_cell_name.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.msg_cell_avatar_url != null) {
                i2 = this.msg_cell_avatar_url.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47907, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47907, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.main_switch = this.main_switch;
        builder.show_launch_page_popup = this.show_launch_page_popup;
        builder.show_login_icon = this.show_login_icon;
        builder.show_msg_cell = this.show_msg_cell;
        builder.msg_cell_name = this.msg_cell_name;
        builder.msg_cell_avatar_url = this.msg_cell_avatar_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47910, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47910, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(", main_switch=");
        sb.append(this.main_switch);
        sb.append(", show_launch_page_popup=");
        sb.append(this.show_launch_page_popup);
        sb.append(", show_login_icon=");
        sb.append(this.show_login_icon);
        sb.append(", show_msg_cell=");
        sb.append(this.show_msg_cell);
        if (this.msg_cell_name != null) {
            sb.append(", msg_cell_name=");
            sb.append(this.msg_cell_name);
        }
        if (this.msg_cell_avatar_url != null) {
            sb.append(", msg_cell_avatar_url=");
            sb.append(this.msg_cell_avatar_url);
        }
        StringBuilder replace = sb.replace(0, 2, "FlipChatSettings{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47908, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47908, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof FlipChatSettings)) {
                return false;
            }
            FlipChatSettings flipChatSettings = (FlipChatSettings) obj;
            if (!unknownFields().equals(flipChatSettings.unknownFields()) || !this.main_switch.equals(flipChatSettings.main_switch) || !this.show_launch_page_popup.equals(flipChatSettings.show_launch_page_popup) || !this.show_login_icon.equals(flipChatSettings.show_login_icon) || !this.show_msg_cell.equals(flipChatSettings.show_msg_cell) || !Internal.equals(this.msg_cell_name, flipChatSettings.msg_cell_name) || !Internal.equals(this.msg_cell_avatar_url, flipChatSettings.msg_cell_avatar_url)) {
                return false;
            }
            return true;
        }
    }

    public FlipChatSettings(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2) {
        this(bool, bool2, bool3, bool4, str, str2, ByteString.EMPTY);
    }

    public FlipChatSettings(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.main_switch = bool;
        this.show_launch_page_popup = bool2;
        this.show_login_icon = bool3;
        this.show_msg_cell = bool4;
        this.msg_cell_name = str;
        this.msg_cell_avatar_url = str2;
    }
}
