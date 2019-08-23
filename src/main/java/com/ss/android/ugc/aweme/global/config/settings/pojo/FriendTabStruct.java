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

public final class FriendTabStruct extends Message<FriendTabStruct, Builder> {
    public static final DefaultValueProtoAdapter<FriendTabStruct> ADAPTER = new ProtoAdapter_FriendTabStruct();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean default_follow_tab;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String friend_tab_desc;

    public static final class Builder extends Message.Builder<FriendTabStruct, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Boolean default_follow_tab;
        public String friend_tab_desc;

        public final FriendTabStruct build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47949, new Class[0], FriendTabStruct.class)) {
                return new FriendTabStruct(this.friend_tab_desc, this.default_follow_tab, super.buildUnknownFields());
            }
            return (FriendTabStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47949, new Class[0], FriendTabStruct.class);
        }

        public final Builder default_follow_tab(Boolean bool) {
            this.default_follow_tab = bool;
            return this;
        }

        public final Builder friend_tab_desc(String str) {
            this.friend_tab_desc = str;
            return this;
        }
    }

    static final class ProtoAdapter_FriendTabStruct extends DefaultValueProtoAdapter<FriendTabStruct> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final FriendTabStruct redact(FriendTabStruct friendTabStruct) {
            return friendTabStruct;
        }

        public ProtoAdapter_FriendTabStruct() {
            super(FieldEncoding.LENGTH_DELIMITED, FriendTabStruct.class);
        }

        public final FriendTabStruct decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47952, new Class[]{ProtoReader.class}, FriendTabStruct.class)) {
                return decode(protoReader2, (FriendTabStruct) null);
            }
            return (FriendTabStruct) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47952, new Class[]{ProtoReader.class}, FriendTabStruct.class);
        }

        public final int encodedSize(FriendTabStruct friendTabStruct) {
            FriendTabStruct friendTabStruct2 = friendTabStruct;
            if (!PatchProxy.isSupport(new Object[]{friendTabStruct2}, this, changeQuickRedirect, false, 47950, new Class[]{FriendTabStruct.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, friendTabStruct2.friend_tab_desc) + ProtoAdapter.BOOL.encodedSizeWithTag(2, friendTabStruct2.default_follow_tab) + friendTabStruct.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{friendTabStruct2}, this, changeQuickRedirect, false, 47950, new Class[]{FriendTabStruct.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, FriendTabStruct friendTabStruct) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            FriendTabStruct friendTabStruct2 = friendTabStruct;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, friendTabStruct2}, this, changeQuickRedirect, false, 47951, new Class[]{ProtoWriter.class, FriendTabStruct.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, friendTabStruct2}, this, changeQuickRedirect, false, 47951, new Class[]{ProtoWriter.class, FriendTabStruct.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, friendTabStruct2.friend_tab_desc);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 2, friendTabStruct2.default_follow_tab);
            protoWriter2.writeBytes(friendTabStruct.unknownFields());
        }

        public final FriendTabStruct decode(ProtoReader protoReader, FriendTabStruct friendTabStruct) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            FriendTabStruct friendTabStruct2 = friendTabStruct;
            if (PatchProxy.isSupport(new Object[]{protoReader2, friendTabStruct2}, this, changeQuickRedirect, false, 47953, new Class[]{ProtoReader.class, FriendTabStruct.class}, FriendTabStruct.class)) {
                return (FriendTabStruct) PatchProxy.accessDispatch(new Object[]{protoReader2, friendTabStruct2}, this, changeQuickRedirect, false, 47953, new Class[]{ProtoReader.class, FriendTabStruct.class}, FriendTabStruct.class);
            }
            FriendTabStruct friendTabStruct3 = (FriendTabStruct) a.a().a(FriendTabStruct.class, friendTabStruct2);
            if (friendTabStruct3 != null) {
                builder = friendTabStruct3.newBuilder();
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
                            builder2.friend_tab_desc((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 2:
                            builder2.default_follow_tab((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (friendTabStruct3 != null) {
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
    public final Boolean getDefaultFollowTab() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47944, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47944, new Class[0], Boolean.class);
        } else if (this.default_follow_tab != null) {
            return this.default_follow_tab;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getFriendTabDesc() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47943, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47943, new Class[0], String.class);
        } else if (this.friend_tab_desc != null) {
            return this.friend_tab_desc;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47945, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47945, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.friend_tab_desc = this.friend_tab_desc;
        builder.default_follow_tab = this.default_follow_tab;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47947, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47947, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.friend_tab_desc != null) {
                i = this.friend_tab_desc.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.default_follow_tab != null) {
                i2 = this.default_follow_tab.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47948, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47948, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.friend_tab_desc != null) {
            sb.append(", friend_tab_desc=");
            sb.append(this.friend_tab_desc);
        }
        if (this.default_follow_tab != null) {
            sb.append(", default_follow_tab=");
            sb.append(this.default_follow_tab);
        }
        StringBuilder replace = sb.replace(0, 2, "FriendTabStruct{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47946, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47946, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof FriendTabStruct)) {
                return false;
            }
            FriendTabStruct friendTabStruct = (FriendTabStruct) obj;
            if (!unknownFields().equals(friendTabStruct.unknownFields()) || !Internal.equals(this.friend_tab_desc, friendTabStruct.friend_tab_desc) || !Internal.equals(this.default_follow_tab, friendTabStruct.default_follow_tab)) {
                return false;
            }
            return true;
        }
    }

    public FriendTabStruct(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public FriendTabStruct(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.friend_tab_desc = str;
        this.default_follow_tab = bool;
    }
}
