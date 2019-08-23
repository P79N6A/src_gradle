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

public final class LotteryUserCondition extends Message<LotteryUserCondition, Builder> {
    public static final ProtoAdapter<LotteryUserCondition> ADAPTER = new ProtoAdapter_LotteryUserCondition();
    public static final Boolean DEFAULT_HAS_COMMAND = Boolean.FALSE;
    public static final Boolean DEFAULT_HAS_FOLLOW = Boolean.FALSE;
    public static final Boolean DEFAULT_IS_WATCHING = Boolean.FALSE;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean has_command;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public final Boolean has_follow;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public final Boolean is_watching;

    public static final class Builder extends Message.Builder<LotteryUserCondition, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Boolean has_command;
        public Boolean has_follow;
        public Boolean is_watching;

        public final LotteryUserCondition build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11816, new Class[0], LotteryUserCondition.class)) {
                return new LotteryUserCondition(this.is_watching, this.has_command, this.has_follow, super.buildUnknownFields());
            }
            return (LotteryUserCondition) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11816, new Class[0], LotteryUserCondition.class);
        }

        public final Builder has_command(Boolean bool) {
            this.has_command = bool;
            return this;
        }

        public final Builder has_follow(Boolean bool) {
            this.has_follow = bool;
            return this;
        }

        public final Builder is_watching(Boolean bool) {
            this.is_watching = bool;
            return this;
        }
    }

    static final class ProtoAdapter_LotteryUserCondition extends ProtoAdapter<LotteryUserCondition> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_LotteryUserCondition() {
            super(FieldEncoding.LENGTH_DELIMITED, LotteryUserCondition.class);
        }

        public final int encodedSize(LotteryUserCondition lotteryUserCondition) {
            int i;
            int i2;
            LotteryUserCondition lotteryUserCondition2 = lotteryUserCondition;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[]{lotteryUserCondition2}, this, changeQuickRedirect, false, 11817, new Class[]{LotteryUserCondition.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{lotteryUserCondition2}, this, changeQuickRedirect, false, 11817, new Class[]{LotteryUserCondition.class}, Integer.TYPE)).intValue();
            }
            if (lotteryUserCondition2.is_watching != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, lotteryUserCondition2.is_watching);
            } else {
                i = 0;
            }
            if (lotteryUserCondition2.has_command != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, lotteryUserCondition2.has_command);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (lotteryUserCondition2.has_follow != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, lotteryUserCondition2.has_follow);
            }
            return i4 + i3 + lotteryUserCondition.unknownFields().size();
        }

        public final LotteryUserCondition redact(LotteryUserCondition lotteryUserCondition) {
            if (PatchProxy.isSupport(new Object[]{lotteryUserCondition}, this, changeQuickRedirect, false, 11820, new Class[]{LotteryUserCondition.class}, LotteryUserCondition.class)) {
                return (LotteryUserCondition) PatchProxy.accessDispatch(new Object[]{lotteryUserCondition}, this, changeQuickRedirect, false, 11820, new Class[]{LotteryUserCondition.class}, LotteryUserCondition.class);
            }
            Builder newBuilder = lotteryUserCondition.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final LotteryUserCondition decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11819, new Class[]{ProtoReader.class}, LotteryUserCondition.class)) {
                return (LotteryUserCondition) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11819, new Class[]{ProtoReader.class}, LotteryUserCondition.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.is_watching((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 2:
                            builder.has_command((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 3:
                            builder.has_follow((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, LotteryUserCondition lotteryUserCondition) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            LotteryUserCondition lotteryUserCondition2 = lotteryUserCondition;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, lotteryUserCondition2}, this, changeQuickRedirect, false, 11818, new Class[]{ProtoWriter.class, LotteryUserCondition.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, lotteryUserCondition2}, this, changeQuickRedirect, false, 11818, new Class[]{ProtoWriter.class, LotteryUserCondition.class}, Void.TYPE);
                return;
            }
            if (lotteryUserCondition2.is_watching != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1, lotteryUserCondition2.is_watching);
            }
            if (lotteryUserCondition2.has_command != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 2, lotteryUserCondition2.has_command);
            }
            if (lotteryUserCondition2.has_follow != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 3, lotteryUserCondition2.has_follow);
            }
            protoWriter2.writeBytes(lotteryUserCondition.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11812, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11812, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.is_watching = this.is_watching;
        builder.has_command = this.has_command;
        builder.has_follow = this.has_follow;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11814, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11814, new Class[0], Integer.TYPE)).intValue();
        }
        int i4 = this.hashCode;
        if (i4 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.is_watching != null) {
                i = this.is_watching.hashCode();
            } else {
                i = 0;
            }
            int i5 = (hashCode + i) * 37;
            if (this.has_command != null) {
                i2 = this.has_command.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 37;
            if (this.has_follow != null) {
                i3 = this.has_follow.hashCode();
            }
            i4 = i6 + i3;
            this.hashCode = i4;
        }
        return i4;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11815, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11815, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.is_watching != null) {
            sb.append(", is_watching=");
            sb.append(this.is_watching);
        }
        if (this.has_command != null) {
            sb.append(", has_command=");
            sb.append(this.has_command);
        }
        if (this.has_follow != null) {
            sb.append(", has_follow=");
            sb.append(this.has_follow);
        }
        StringBuilder replace = sb.replace(0, 2, "LotteryUserCondition{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11813, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11813, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof LotteryUserCondition)) {
                return false;
            }
            LotteryUserCondition lotteryUserCondition = (LotteryUserCondition) obj;
            if (!unknownFields().equals(lotteryUserCondition.unknownFields()) || !Internal.equals(this.is_watching, lotteryUserCondition.is_watching) || !Internal.equals(this.has_command, lotteryUserCondition.has_command) || !Internal.equals(this.has_follow, lotteryUserCondition.has_follow)) {
                return false;
            }
            return true;
        }
    }

    public LotteryUserCondition(Boolean bool, Boolean bool2, Boolean bool3) {
        this(bool, bool2, bool3, ByteString.EMPTY);
    }

    public LotteryUserCondition(Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_watching = bool;
        this.has_command = bool2;
        this.has_follow = bool3;
    }
}
