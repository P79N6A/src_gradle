package com.bytedance.android.livesdk.message.proto;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.io.IOException;
import okio.ByteString;

public final class AssetMessage extends Message<AssetMessage, Builder> {
    public static final ProtoAdapter<AssetMessage> ADAPTER = new ProtoAdapter_AssetMessage();
    public static final Long DEFAULT_ASSET_ID = 0L;
    public static final Boolean DEFAULT_SHOW_MESSAGE = Boolean.FALSE;
    public static final Boolean DEFAULT_SHOW_PANEL = Boolean.FALSE;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long asset_id;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Text#ADAPTER", tag = 3)
    public final Text panel_display_text;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 4)
    public final Boolean show_message;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 5)
    public final Boolean show_panel;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 7)
    public final User to_user;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 6)
    public final User user;

    public static final class Builder extends Message.Builder<AssetMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Long asset_id;
        public Common common;
        public Text panel_display_text;
        public Boolean show_message;
        public Boolean show_panel;
        public User to_user;
        public User user;

        public final AssetMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11115, new Class[0], AssetMessage.class)) {
                return (AssetMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11115, new Class[0], AssetMessage.class);
            }
            AssetMessage assetMessage = new AssetMessage(this.common, this.asset_id, this.panel_display_text, this.show_message, this.show_panel, this.user, this.to_user, super.buildUnknownFields());
            return assetMessage;
        }

        public final Builder asset_id(Long l) {
            this.asset_id = l;
            return this;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder panel_display_text(Text text) {
            this.panel_display_text = text;
            return this;
        }

        public final Builder show_message(Boolean bool) {
            this.show_message = bool;
            return this;
        }

        public final Builder show_panel(Boolean bool) {
            this.show_panel = bool;
            return this;
        }

        public final Builder to_user(User user2) {
            this.to_user = user2;
            return this;
        }

        public final Builder user(User user2) {
            this.user = user2;
            return this;
        }
    }

    static final class ProtoAdapter_AssetMessage extends ProtoAdapter<AssetMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_AssetMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, AssetMessage.class);
        }

        public final AssetMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11118, new Class[]{ProtoReader.class}, AssetMessage.class)) {
                return (AssetMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11118, new Class[]{ProtoReader.class}, AssetMessage.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.common((Common) Common.ADAPTER.decode(protoReader2));
                            break;
                        case 2:
                            builder.asset_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 3:
                            builder.panel_display_text((Text) Text.ADAPTER.decode(protoReader2));
                            break;
                        case 4:
                            builder.show_message((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 5:
                            builder.show_panel((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 6:
                            builder.user((User) User.ADAPTER.decode(protoReader2));
                            break;
                        case e.l /*7*/:
                            builder.to_user((User) User.ADAPTER.decode(protoReader2));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                            break;
                    }
                } else {
                    protoReader2.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final int encodedSize(AssetMessage assetMessage) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            AssetMessage assetMessage2 = assetMessage;
            int i7 = 0;
            if (PatchProxy.isSupport(new Object[]{assetMessage2}, this, changeQuickRedirect, false, 11116, new Class[]{AssetMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{assetMessage2}, this, changeQuickRedirect, false, 11116, new Class[]{AssetMessage.class}, Integer.TYPE)).intValue();
            }
            if (assetMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, assetMessage2.common);
            } else {
                i = 0;
            }
            if (assetMessage2.asset_id != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, assetMessage2.asset_id);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (assetMessage2.panel_display_text != null) {
                i3 = Text.ADAPTER.encodedSizeWithTag(3, assetMessage2.panel_display_text);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (assetMessage2.show_message != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, assetMessage2.show_message);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (assetMessage2.show_panel != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, assetMessage2.show_panel);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (assetMessage2.user != null) {
                i6 = User.ADAPTER.encodedSizeWithTag(6, assetMessage2.user);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (assetMessage2.to_user != null) {
                i7 = User.ADAPTER.encodedSizeWithTag(7, assetMessage2.to_user);
            }
            return i12 + i7 + assetMessage.unknownFields().size();
        }

        public final AssetMessage redact(AssetMessage assetMessage) {
            if (PatchProxy.isSupport(new Object[]{assetMessage}, this, changeQuickRedirect, false, 11119, new Class[]{AssetMessage.class}, AssetMessage.class)) {
                return (AssetMessage) PatchProxy.accessDispatch(new Object[]{assetMessage}, this, changeQuickRedirect, false, 11119, new Class[]{AssetMessage.class}, AssetMessage.class);
            }
            Builder newBuilder = assetMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.panel_display_text != null) {
                newBuilder.panel_display_text = (Text) Text.ADAPTER.redact(newBuilder.panel_display_text);
            }
            if (newBuilder.user != null) {
                newBuilder.user = (User) User.ADAPTER.redact(newBuilder.user);
            }
            if (newBuilder.to_user != null) {
                newBuilder.to_user = (User) User.ADAPTER.redact(newBuilder.to_user);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final void encode(ProtoWriter protoWriter, AssetMessage assetMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            AssetMessage assetMessage2 = assetMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, assetMessage2}, this, changeQuickRedirect, false, 11117, new Class[]{ProtoWriter.class, AssetMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, assetMessage2}, this, changeQuickRedirect, false, 11117, new Class[]{ProtoWriter.class, AssetMessage.class}, Void.TYPE);
                return;
            }
            if (assetMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, assetMessage2.common);
            }
            if (assetMessage2.asset_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, assetMessage2.asset_id);
            }
            if (assetMessage2.panel_display_text != null) {
                Text.ADAPTER.encodeWithTag(protoWriter2, 3, assetMessage2.panel_display_text);
            }
            if (assetMessage2.show_message != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 4, assetMessage2.show_message);
            }
            if (assetMessage2.show_panel != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 5, assetMessage2.show_panel);
            }
            if (assetMessage2.user != null) {
                User.ADAPTER.encodeWithTag(protoWriter2, 6, assetMessage2.user);
            }
            if (assetMessage2.to_user != null) {
                User.ADAPTER.encodeWithTag(protoWriter2, 7, assetMessage2.to_user);
            }
            protoWriter2.writeBytes(assetMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11111, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11111, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.asset_id = this.asset_id;
        builder.panel_display_text = this.panel_display_text;
        builder.show_message = this.show_message;
        builder.show_panel = this.show_panel;
        builder.user = this.user;
        builder.to_user = this.to_user;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11113, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11113, new Class[0], Integer.TYPE)).intValue();
        }
        int i8 = this.hashCode;
        if (i8 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i9 = (hashCode + i) * 37;
            if (this.asset_id != null) {
                i2 = this.asset_id.hashCode();
            } else {
                i2 = 0;
            }
            int i10 = (i9 + i2) * 37;
            if (this.panel_display_text != null) {
                i3 = this.panel_display_text.hashCode();
            } else {
                i3 = 0;
            }
            int i11 = (i10 + i3) * 37;
            if (this.show_message != null) {
                i4 = this.show_message.hashCode();
            } else {
                i4 = 0;
            }
            int i12 = (i11 + i4) * 37;
            if (this.show_panel != null) {
                i5 = this.show_panel.hashCode();
            } else {
                i5 = 0;
            }
            int i13 = (i12 + i5) * 37;
            if (this.user != null) {
                i6 = this.user.hashCode();
            } else {
                i6 = 0;
            }
            int i14 = (i13 + i6) * 37;
            if (this.to_user != null) {
                i7 = this.to_user.hashCode();
            }
            i8 = i14 + i7;
            this.hashCode = i8;
        }
        return i8;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11114, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11114, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.asset_id != null) {
            sb.append(", asset_id=");
            sb.append(this.asset_id);
        }
        if (this.panel_display_text != null) {
            sb.append(", panel_display_text=");
            sb.append(this.panel_display_text);
        }
        if (this.show_message != null) {
            sb.append(", show_message=");
            sb.append(this.show_message);
        }
        if (this.show_panel != null) {
            sb.append(", show_panel=");
            sb.append(this.show_panel);
        }
        if (this.user != null) {
            sb.append(", user=");
            sb.append(this.user);
        }
        if (this.to_user != null) {
            sb.append(", to_user=");
            sb.append(this.to_user);
        }
        StringBuilder replace = sb.replace(0, 2, "AssetMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11112, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11112, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof AssetMessage)) {
                return false;
            }
            AssetMessage assetMessage = (AssetMessage) obj;
            if (!unknownFields().equals(assetMessage.unknownFields()) || !Internal.equals(this.common, assetMessage.common) || !Internal.equals(this.asset_id, assetMessage.asset_id) || !Internal.equals(this.panel_display_text, assetMessage.panel_display_text) || !Internal.equals(this.show_message, assetMessage.show_message) || !Internal.equals(this.show_panel, assetMessage.show_panel) || !Internal.equals(this.user, assetMessage.user) || !Internal.equals(this.to_user, assetMessage.to_user)) {
                return false;
            }
            return true;
        }
    }

    public AssetMessage(Common common2, Long l, Text text, Boolean bool, Boolean bool2, User user2, User user3) {
        this(common2, l, text, bool, bool2, user2, user3, ByteString.EMPTY);
    }

    public AssetMessage(Common common2, Long l, Text text, Boolean bool, Boolean bool2, User user2, User user3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.asset_id = l;
        this.panel_display_text = text;
        this.show_message = bool;
        this.show_panel = bool2;
        this.user = user2;
        this.to_user = user3;
    }
}
