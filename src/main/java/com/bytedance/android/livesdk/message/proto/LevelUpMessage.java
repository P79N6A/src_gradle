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

public final class LevelUpMessage extends Message<LevelUpMessage, Builder> {
    public static final ProtoAdapter<LevelUpMessage> ADAPTER = new ProtoAdapter_LevelUpMessage();
    public static final Integer DEFAULT_CURRENT_LEVEL = 0;
    public static final Integer DEFAULT_PRE_LEVEL = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer current_level;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer pre_level;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 2)
    public final User user;

    public static final class Builder extends Message.Builder<LevelUpMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public Integer current_level;
        public Integer pre_level;
        public User user;

        public final LevelUpMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11620, new Class[0], LevelUpMessage.class)) {
                return (LevelUpMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11620, new Class[0], LevelUpMessage.class);
            }
            LevelUpMessage levelUpMessage = new LevelUpMessage(this.common, this.user, this.pre_level, this.current_level, super.buildUnknownFields());
            return levelUpMessage;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder current_level(Integer num) {
            this.current_level = num;
            return this;
        }

        public final Builder pre_level(Integer num) {
            this.pre_level = num;
            return this;
        }

        public final Builder user(User user2) {
            this.user = user2;
            return this;
        }
    }

    static final class ProtoAdapter_LevelUpMessage extends ProtoAdapter<LevelUpMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_LevelUpMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, LevelUpMessage.class);
        }

        public final LevelUpMessage redact(LevelUpMessage levelUpMessage) {
            if (PatchProxy.isSupport(new Object[]{levelUpMessage}, this, changeQuickRedirect, false, 11624, new Class[]{LevelUpMessage.class}, LevelUpMessage.class)) {
                return (LevelUpMessage) PatchProxy.accessDispatch(new Object[]{levelUpMessage}, this, changeQuickRedirect, false, 11624, new Class[]{LevelUpMessage.class}, LevelUpMessage.class);
            }
            Builder newBuilder = levelUpMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.user != null) {
                newBuilder.user = (User) User.ADAPTER.redact(newBuilder.user);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final LevelUpMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11623, new Class[]{ProtoReader.class}, LevelUpMessage.class)) {
                return (LevelUpMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11623, new Class[]{ProtoReader.class}, LevelUpMessage.class);
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
                            builder.user((User) User.ADAPTER.decode(protoReader2));
                            break;
                        case 3:
                            builder.pre_level((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 4:
                            builder.current_level((Integer) ProtoAdapter.INT32.decode(protoReader2));
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

        public final int encodedSize(LevelUpMessage levelUpMessage) {
            int i;
            int i2;
            int i3;
            LevelUpMessage levelUpMessage2 = levelUpMessage;
            int i4 = 0;
            if (PatchProxy.isSupport(new Object[]{levelUpMessage2}, this, changeQuickRedirect, false, 11621, new Class[]{LevelUpMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{levelUpMessage2}, this, changeQuickRedirect, false, 11621, new Class[]{LevelUpMessage.class}, Integer.TYPE)).intValue();
            }
            if (levelUpMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, levelUpMessage2.common);
            } else {
                i = 0;
            }
            if (levelUpMessage2.user != null) {
                i2 = User.ADAPTER.encodedSizeWithTag(2, levelUpMessage2.user);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (levelUpMessage2.pre_level != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, levelUpMessage2.pre_level);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (levelUpMessage2.current_level != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(4, levelUpMessage2.current_level);
            }
            return i6 + i4 + levelUpMessage.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, LevelUpMessage levelUpMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            LevelUpMessage levelUpMessage2 = levelUpMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, levelUpMessage2}, this, changeQuickRedirect, false, 11622, new Class[]{ProtoWriter.class, LevelUpMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, levelUpMessage2}, this, changeQuickRedirect, false, 11622, new Class[]{ProtoWriter.class, LevelUpMessage.class}, Void.TYPE);
                return;
            }
            if (levelUpMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, levelUpMessage2.common);
            }
            if (levelUpMessage2.user != null) {
                User.ADAPTER.encodeWithTag(protoWriter2, 2, levelUpMessage2.user);
            }
            if (levelUpMessage2.pre_level != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 3, levelUpMessage2.pre_level);
            }
            if (levelUpMessage2.current_level != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 4, levelUpMessage2.current_level);
            }
            protoWriter2.writeBytes(levelUpMessage.unknownFields());
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11618, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11618, new Class[0], Integer.TYPE)).intValue();
        }
        int i5 = this.hashCode;
        if (i5 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i6 = (hashCode + i) * 37;
            if (this.user != null) {
                i2 = this.user.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 37;
            if (this.pre_level != null) {
                i3 = this.pre_level.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 37;
            if (this.current_level != null) {
                i4 = this.current_level.hashCode();
            }
            i5 = i8 + i4;
            this.hashCode = i5;
        }
        return i5;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11616, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11616, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.user = this.user;
        builder.pre_level = this.pre_level;
        builder.current_level = this.current_level;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11619, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11619, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.user != null) {
            sb.append(", user=");
            sb.append(this.user);
        }
        if (this.pre_level != null) {
            sb.append(", pre_level=");
            sb.append(this.pre_level);
        }
        if (this.current_level != null) {
            sb.append(", current_level=");
            sb.append(this.current_level);
        }
        StringBuilder replace = sb.replace(0, 2, "LevelUpMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11617, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11617, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof LevelUpMessage)) {
                return false;
            }
            LevelUpMessage levelUpMessage = (LevelUpMessage) obj;
            if (!unknownFields().equals(levelUpMessage.unknownFields()) || !Internal.equals(this.common, levelUpMessage.common) || !Internal.equals(this.user, levelUpMessage.user) || !Internal.equals(this.pre_level, levelUpMessage.pre_level) || !Internal.equals(this.current_level, levelUpMessage.current_level)) {
                return false;
            }
            return true;
        }
    }

    public LevelUpMessage(Common common2, User user2, Integer num, Integer num2) {
        this(common2, user2, num, num2, ByteString.EMPTY);
    }

    public LevelUpMessage(Common common2, User user2, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.user = user2;
        this.pre_level = num;
        this.current_level = num2;
    }
}
