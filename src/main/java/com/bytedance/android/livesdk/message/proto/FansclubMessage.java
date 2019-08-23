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
import java.io.IOException;
import okio.ByteString;

public final class FansclubMessage extends Message<FansclubMessage, Builder> {
    public static final ProtoAdapter<FansclubMessage> ADAPTER = new ProtoAdapter_FansclubMessage();
    public static final Integer DEFAULT_ACTION = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer action;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String content;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.FansclubMessage$UpgradePrivilege#ADAPTER", tag = 5)
    public final UpgradePrivilege upgrade_privilege;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 4)
    public final User user;

    public static final class UpgradePrivilege extends Message<UpgradePrivilege, Builder> {
        public static final ProtoAdapter<UpgradePrivilege> ADAPTER = new ProtoAdapter_UpgradePrivilege();
        public static final Integer DEFAULT_BUTTON_TYPE = 0;
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
        public final Integer button_type;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
        public final String content;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
        public final String description;

        public static final class Builder extends Message.Builder<UpgradePrivilege, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public Integer button_type;
            public String content;
            public String description;

            public final UpgradePrivilege build() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11378, new Class[0], UpgradePrivilege.class)) {
                    return new UpgradePrivilege(this.content, this.description, this.button_type, super.buildUnknownFields());
                }
                return (UpgradePrivilege) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11378, new Class[0], UpgradePrivilege.class);
            }

            public final Builder button_type(Integer num) {
                this.button_type = num;
                return this;
            }

            public final Builder content(String str) {
                this.content = str;
                return this;
            }

            public final Builder description(String str) {
                this.description = str;
                return this;
            }
        }

        static final class ProtoAdapter_UpgradePrivilege extends ProtoAdapter<UpgradePrivilege> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_UpgradePrivilege() {
                super(FieldEncoding.LENGTH_DELIMITED, UpgradePrivilege.class);
            }

            public final int encodedSize(UpgradePrivilege upgradePrivilege) {
                int i;
                int i2;
                UpgradePrivilege upgradePrivilege2 = upgradePrivilege;
                int i3 = 0;
                if (PatchProxy.isSupport(new Object[]{upgradePrivilege2}, this, changeQuickRedirect, false, 11379, new Class[]{UpgradePrivilege.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{upgradePrivilege2}, this, changeQuickRedirect, false, 11379, new Class[]{UpgradePrivilege.class}, Integer.TYPE)).intValue();
                }
                if (upgradePrivilege2.content != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, upgradePrivilege2.content);
                } else {
                    i = 0;
                }
                if (upgradePrivilege2.description != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, upgradePrivilege2.description);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (upgradePrivilege2.button_type != null) {
                    i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, upgradePrivilege2.button_type);
                }
                return i4 + i3 + upgradePrivilege.unknownFields().size();
            }

            public final UpgradePrivilege redact(UpgradePrivilege upgradePrivilege) {
                if (PatchProxy.isSupport(new Object[]{upgradePrivilege}, this, changeQuickRedirect, false, 11382, new Class[]{UpgradePrivilege.class}, UpgradePrivilege.class)) {
                    return (UpgradePrivilege) PatchProxy.accessDispatch(new Object[]{upgradePrivilege}, this, changeQuickRedirect, false, 11382, new Class[]{UpgradePrivilege.class}, UpgradePrivilege.class);
                }
                Builder newBuilder = upgradePrivilege.newBuilder();
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final UpgradePrivilege decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11381, new Class[]{ProtoReader.class}, UpgradePrivilege.class)) {
                    return (UpgradePrivilege) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11381, new Class[]{ProtoReader.class}, UpgradePrivilege.class);
                }
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                builder.content((String) ProtoAdapter.STRING.decode(protoReader2));
                                break;
                            case 2:
                                builder.description((String) ProtoAdapter.STRING.decode(protoReader2));
                                break;
                            case 3:
                                builder.button_type((Integer) ProtoAdapter.INT32.decode(protoReader2));
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

            public final void encode(ProtoWriter protoWriter, UpgradePrivilege upgradePrivilege) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                UpgradePrivilege upgradePrivilege2 = upgradePrivilege;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, upgradePrivilege2}, this, changeQuickRedirect, false, 11380, new Class[]{ProtoWriter.class, UpgradePrivilege.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, upgradePrivilege2}, this, changeQuickRedirect, false, 11380, new Class[]{ProtoWriter.class, UpgradePrivilege.class}, Void.TYPE);
                    return;
                }
                if (upgradePrivilege2.content != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, upgradePrivilege2.content);
                }
                if (upgradePrivilege2.description != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, upgradePrivilege2.description);
                }
                if (upgradePrivilege2.button_type != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter2, 3, upgradePrivilege2.button_type);
                }
                protoWriter2.writeBytes(upgradePrivilege.unknownFields());
            }
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11374, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11374, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.content = this.content;
            builder.description = this.description;
            builder.button_type = this.button_type;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11376, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11376, new Class[0], Integer.TYPE)).intValue();
            }
            int i4 = this.hashCode;
            if (i4 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                if (this.content != null) {
                    i = this.content.hashCode();
                } else {
                    i = 0;
                }
                int i5 = (hashCode + i) * 37;
                if (this.description != null) {
                    i2 = this.description.hashCode();
                } else {
                    i2 = 0;
                }
                int i6 = (i5 + i2) * 37;
                if (this.button_type != null) {
                    i3 = this.button_type.hashCode();
                }
                i4 = i6 + i3;
                this.hashCode = i4;
            }
            return i4;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11377, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11377, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (this.content != null) {
                sb.append(", content=");
                sb.append(this.content);
            }
            if (this.description != null) {
                sb.append(", description=");
                sb.append(this.description);
            }
            if (this.button_type != null) {
                sb.append(", button_type=");
                sb.append(this.button_type);
            }
            StringBuilder replace = sb.replace(0, 2, "UpgradePrivilege{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11375, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11375, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof UpgradePrivilege)) {
                    return false;
                }
                UpgradePrivilege upgradePrivilege = (UpgradePrivilege) obj;
                if (!unknownFields().equals(upgradePrivilege.unknownFields()) || !Internal.equals(this.content, upgradePrivilege.content) || !Internal.equals(this.description, upgradePrivilege.description) || !Internal.equals(this.button_type, upgradePrivilege.button_type)) {
                    return false;
                }
                return true;
            }
        }

        public UpgradePrivilege(String str, String str2, Integer num) {
            this(str, str2, num, ByteString.EMPTY);
        }

        public UpgradePrivilege(String str, String str2, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            this.content = str;
            this.description = str2;
            this.button_type = num;
        }
    }

    public static final class Builder extends Message.Builder<FansclubMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Integer action;
        public Common common;
        public String content;
        public UpgradePrivilege upgrade_privilege;
        public User user;

        public final FansclubMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11369, new Class[0], FansclubMessage.class)) {
                return (FansclubMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11369, new Class[0], FansclubMessage.class);
            }
            FansclubMessage fansclubMessage = new FansclubMessage(this.common, this.action, this.content, this.user, this.upgrade_privilege, super.buildUnknownFields());
            return fansclubMessage;
        }

        public final Builder action(Integer num) {
            this.action = num;
            return this;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }

        public final Builder upgrade_privilege(UpgradePrivilege upgradePrivilege) {
            this.upgrade_privilege = upgradePrivilege;
            return this;
        }

        public final Builder user(User user2) {
            this.user = user2;
            return this;
        }
    }

    static final class ProtoAdapter_FansclubMessage extends ProtoAdapter<FansclubMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_FansclubMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, FansclubMessage.class);
        }

        public final FansclubMessage redact(FansclubMessage fansclubMessage) {
            if (PatchProxy.isSupport(new Object[]{fansclubMessage}, this, changeQuickRedirect, false, 11373, new Class[]{FansclubMessage.class}, FansclubMessage.class)) {
                return (FansclubMessage) PatchProxy.accessDispatch(new Object[]{fansclubMessage}, this, changeQuickRedirect, false, 11373, new Class[]{FansclubMessage.class}, FansclubMessage.class);
            }
            Builder newBuilder = fansclubMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.user != null) {
                newBuilder.user = (User) User.ADAPTER.redact(newBuilder.user);
            }
            if (newBuilder.upgrade_privilege != null) {
                newBuilder.upgrade_privilege = (UpgradePrivilege) UpgradePrivilege.ADAPTER.redact(newBuilder.upgrade_privilege);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final FansclubMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11372, new Class[]{ProtoReader.class}, FansclubMessage.class)) {
                return (FansclubMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11372, new Class[]{ProtoReader.class}, FansclubMessage.class);
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
                            builder.action((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 3:
                            builder.content((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 4:
                            builder.user((User) User.ADAPTER.decode(protoReader2));
                            break;
                        case 5:
                            builder.upgrade_privilege((UpgradePrivilege) UpgradePrivilege.ADAPTER.decode(protoReader2));
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

        public final int encodedSize(FansclubMessage fansclubMessage) {
            int i;
            int i2;
            int i3;
            int i4;
            FansclubMessage fansclubMessage2 = fansclubMessage;
            int i5 = 0;
            if (PatchProxy.isSupport(new Object[]{fansclubMessage2}, this, changeQuickRedirect, false, 11370, new Class[]{FansclubMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{fansclubMessage2}, this, changeQuickRedirect, false, 11370, new Class[]{FansclubMessage.class}, Integer.TYPE)).intValue();
            }
            if (fansclubMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, fansclubMessage2.common);
            } else {
                i = 0;
            }
            if (fansclubMessage2.action != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, fansclubMessage2.action);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (fansclubMessage2.content != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, fansclubMessage2.content);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (fansclubMessage2.user != null) {
                i4 = User.ADAPTER.encodedSizeWithTag(4, fansclubMessage2.user);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (fansclubMessage2.upgrade_privilege != null) {
                i5 = UpgradePrivilege.ADAPTER.encodedSizeWithTag(5, fansclubMessage2.upgrade_privilege);
            }
            return i8 + i5 + fansclubMessage.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, FansclubMessage fansclubMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            FansclubMessage fansclubMessage2 = fansclubMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, fansclubMessage2}, this, changeQuickRedirect, false, 11371, new Class[]{ProtoWriter.class, FansclubMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, fansclubMessage2}, this, changeQuickRedirect, false, 11371, new Class[]{ProtoWriter.class, FansclubMessage.class}, Void.TYPE);
                return;
            }
            if (fansclubMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, fansclubMessage2.common);
            }
            if (fansclubMessage2.action != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 2, fansclubMessage2.action);
            }
            if (fansclubMessage2.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, fansclubMessage2.content);
            }
            if (fansclubMessage2.user != null) {
                User.ADAPTER.encodeWithTag(protoWriter2, 4, fansclubMessage2.user);
            }
            if (fansclubMessage2.upgrade_privilege != null) {
                UpgradePrivilege.ADAPTER.encodeWithTag(protoWriter2, 5, fansclubMessage2.upgrade_privilege);
            }
            protoWriter2.writeBytes(fansclubMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11365, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11365, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.action = this.action;
        builder.content = this.content;
        builder.user = this.user;
        builder.upgrade_privilege = this.upgrade_privilege;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11367, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11367, new Class[0], Integer.TYPE)).intValue();
        }
        int i6 = this.hashCode;
        if (i6 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i7 = (hashCode + i) * 37;
            if (this.action != null) {
                i2 = this.action.hashCode();
            } else {
                i2 = 0;
            }
            int i8 = (i7 + i2) * 37;
            if (this.content != null) {
                i3 = this.content.hashCode();
            } else {
                i3 = 0;
            }
            int i9 = (i8 + i3) * 37;
            if (this.user != null) {
                i4 = this.user.hashCode();
            } else {
                i4 = 0;
            }
            int i10 = (i9 + i4) * 37;
            if (this.upgrade_privilege != null) {
                i5 = this.upgrade_privilege.hashCode();
            }
            i6 = i10 + i5;
            this.hashCode = i6;
        }
        return i6;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11368, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11368, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.action != null) {
            sb.append(", action=");
            sb.append(this.action);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.user != null) {
            sb.append(", user=");
            sb.append(this.user);
        }
        if (this.upgrade_privilege != null) {
            sb.append(", upgrade_privilege=");
            sb.append(this.upgrade_privilege);
        }
        StringBuilder replace = sb.replace(0, 2, "FansclubMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11366, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11366, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof FansclubMessage)) {
                return false;
            }
            FansclubMessage fansclubMessage = (FansclubMessage) obj;
            if (!unknownFields().equals(fansclubMessage.unknownFields()) || !Internal.equals(this.common, fansclubMessage.common) || !Internal.equals(this.action, fansclubMessage.action) || !Internal.equals(this.content, fansclubMessage.content) || !Internal.equals(this.user, fansclubMessage.user) || !Internal.equals(this.upgrade_privilege, fansclubMessage.upgrade_privilege)) {
                return false;
            }
            return true;
        }
    }

    public FansclubMessage(Common common2, Integer num, String str, User user2, UpgradePrivilege upgradePrivilege) {
        this(common2, num, str, user2, upgradePrivilege, ByteString.EMPTY);
    }

    public FansclubMessage(Common common2, Integer num, String str, User user2, UpgradePrivilege upgradePrivilege, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.action = num;
        this.content = str;
        this.user = user2;
        this.upgrade_privilege = upgradePrivilege;
    }
}
