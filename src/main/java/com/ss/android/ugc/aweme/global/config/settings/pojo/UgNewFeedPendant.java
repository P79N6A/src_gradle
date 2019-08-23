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

public final class UgNewFeedPendant extends Message<UgNewFeedPendant, Builder> {
    public static final DefaultValueProtoAdapter<UgNewFeedPendant> ADAPTER = new ProtoAdapter_UgNewFeedPendant();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer disappear_after;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String h5_link;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewUser#ADAPTER", tag = 2)
    public final UgNewUser new_user;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel#ADAPTER", label = 2, tag = 1)
    public final List<UrlModel> resource_url;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UgUserLimit#ADAPTER", tag = 5)
    public final UgUserLimit user_limit;

    public static final class Builder extends Message.Builder<UgNewFeedPendant, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Integer disappear_after;
        public String h5_link;
        public UgNewUser new_user;
        public List<UrlModel> resource_url = Internal.newMutableList();
        public UgUserLimit user_limit;

        public final UgNewFeedPendant build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49284, new Class[0], UgNewFeedPendant.class)) {
                return (UgNewFeedPendant) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49284, new Class[0], UgNewFeedPendant.class);
            }
            UgNewFeedPendant ugNewFeedPendant = new UgNewFeedPendant(this.resource_url, this.new_user, this.disappear_after, this.h5_link, this.user_limit, super.buildUnknownFields());
            return ugNewFeedPendant;
        }

        public final Builder disappear_after(Integer num) {
            this.disappear_after = num;
            return this;
        }

        public final Builder h5_link(String str) {
            this.h5_link = str;
            return this;
        }

        public final Builder new_user(UgNewUser ugNewUser) {
            this.new_user = ugNewUser;
            return this;
        }

        public final Builder user_limit(UgUserLimit ugUserLimit) {
            this.user_limit = ugUserLimit;
            return this;
        }

        public final Builder resource_url(List<UrlModel> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 49283, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 49283, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.resource_url = list;
            return this;
        }
    }

    static final class ProtoAdapter_UgNewFeedPendant extends DefaultValueProtoAdapter<UgNewFeedPendant> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final UgNewFeedPendant redact(UgNewFeedPendant ugNewFeedPendant) {
            return ugNewFeedPendant;
        }

        public ProtoAdapter_UgNewFeedPendant() {
            super(FieldEncoding.LENGTH_DELIMITED, UgNewFeedPendant.class);
        }

        public final UgNewFeedPendant decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49287, new Class[]{ProtoReader.class}, UgNewFeedPendant.class)) {
                return decode(protoReader2, (UgNewFeedPendant) null);
            }
            return (UgNewFeedPendant) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49287, new Class[]{ProtoReader.class}, UgNewFeedPendant.class);
        }

        public final int encodedSize(UgNewFeedPendant ugNewFeedPendant) {
            UgNewFeedPendant ugNewFeedPendant2 = ugNewFeedPendant;
            if (!PatchProxy.isSupport(new Object[]{ugNewFeedPendant2}, this, changeQuickRedirect, false, 49285, new Class[]{UgNewFeedPendant.class}, Integer.TYPE)) {
                return UrlModel.ADAPTER.asRepeated().encodedSizeWithTag(1, ugNewFeedPendant2.resource_url) + UgNewUser.ADAPTER.encodedSizeWithTag(2, ugNewFeedPendant2.new_user) + ProtoAdapter.INT32.encodedSizeWithTag(3, ugNewFeedPendant2.disappear_after) + ProtoAdapter.STRING.encodedSizeWithTag(4, ugNewFeedPendant2.h5_link) + UgUserLimit.ADAPTER.encodedSizeWithTag(5, ugNewFeedPendant2.user_limit) + ugNewFeedPendant.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{ugNewFeedPendant2}, this, changeQuickRedirect, false, 49285, new Class[]{UgNewFeedPendant.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, UgNewFeedPendant ugNewFeedPendant) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            UgNewFeedPendant ugNewFeedPendant2 = ugNewFeedPendant;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, ugNewFeedPendant2}, this, changeQuickRedirect, false, 49286, new Class[]{ProtoWriter.class, UgNewFeedPendant.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, ugNewFeedPendant2}, this, changeQuickRedirect, false, 49286, new Class[]{ProtoWriter.class, UgNewFeedPendant.class}, Void.TYPE);
                return;
            }
            UrlModel.ADAPTER.asRepeated().encodeWithTag(protoWriter2, 1, ugNewFeedPendant2.resource_url);
            UgNewUser.ADAPTER.encodeWithTag(protoWriter2, 2, ugNewFeedPendant2.new_user);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 3, ugNewFeedPendant2.disappear_after);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, ugNewFeedPendant2.h5_link);
            UgUserLimit.ADAPTER.encodeWithTag(protoWriter2, 5, ugNewFeedPendant2.user_limit);
            protoWriter2.writeBytes(ugNewFeedPendant.unknownFields());
        }

        public final UgNewFeedPendant decode(ProtoReader protoReader, UgNewFeedPendant ugNewFeedPendant) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            UgNewFeedPendant ugNewFeedPendant2 = ugNewFeedPendant;
            if (PatchProxy.isSupport(new Object[]{protoReader2, ugNewFeedPendant2}, this, changeQuickRedirect, false, 49288, new Class[]{ProtoReader.class, UgNewFeedPendant.class}, UgNewFeedPendant.class)) {
                return (UgNewFeedPendant) PatchProxy.accessDispatch(new Object[]{protoReader2, ugNewFeedPendant2}, this, changeQuickRedirect, false, 49288, new Class[]{ProtoReader.class, UgNewFeedPendant.class}, UgNewFeedPendant.class);
            }
            UgNewFeedPendant ugNewFeedPendant3 = (UgNewFeedPendant) a.a().a(UgNewFeedPendant.class, ugNewFeedPendant2);
            if (ugNewFeedPendant3 != null) {
                builder = ugNewFeedPendant3.newBuilder();
            } else {
                builder = new Builder();
            }
            Builder builder2 = builder;
            List<UrlModel> newMutableList = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            newMutableList.add(UrlModel.ADAPTER.decode(protoReader2, a.a().a(UrlModel.class)));
                            break;
                        case 2:
                            builder2.new_user((UgNewUser) UgNewUser.ADAPTER.decode(protoReader2, builder2.new_user));
                            break;
                        case 3:
                            builder2.disappear_after((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 4:
                            builder2.h5_link((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 5:
                            builder2.user_limit((UgUserLimit) UgUserLimit.ADAPTER.decode(protoReader2, builder2.user_limit));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (ugNewFeedPendant3 != null) {
                                    break;
                                } else {
                                    throw e2;
                                }
                            }
                    }
                } else {
                    protoReader2.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder2.resource_url = newMutableList;
                    }
                    return builder2.build();
                }
            }
        }
    }

    public final List<UrlModel> getResourceUrl() {
        return this.resource_url;
    }

    @KtNullable
    public final Integer getDisappearAfter() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49276, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49276, new Class[0], Integer.class);
        } else if (this.disappear_after != null) {
            return this.disappear_after;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getH5Link() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49277, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49277, new Class[0], String.class);
        } else if (this.h5_link != null) {
            return this.h5_link;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final UgNewUser getNewUser() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49275, new Class[0], UgNewUser.class)) {
            return (UgNewUser) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49275, new Class[0], UgNewUser.class);
        } else if (this.new_user != null) {
            return this.new_user;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final UgUserLimit getUserLimit() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49278, new Class[0], UgUserLimit.class)) {
            return (UgUserLimit) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49278, new Class[0], UgUserLimit.class);
        } else if (this.user_limit != null) {
            return this.user_limit;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49281, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49281, new Class[0], Integer.TYPE)).intValue();
        }
        int i5 = this.hashCode;
        if (i5 == 0) {
            int hashCode = ((unknownFields().hashCode() * 37) + this.resource_url.hashCode()) * 37;
            if (this.new_user != null) {
                i = this.new_user.hashCode();
            } else {
                i = 0;
            }
            int i6 = (hashCode + i) * 37;
            if (this.disappear_after != null) {
                i2 = this.disappear_after.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 37;
            if (this.h5_link != null) {
                i3 = this.h5_link.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 37;
            if (this.user_limit != null) {
                i4 = this.user_limit.hashCode();
            }
            i5 = i8 + i4;
            this.hashCode = i5;
        }
        return i5;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49279, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49279, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.resource_url = Internal.copyOf("resource_url", this.resource_url);
        builder.new_user = this.new_user;
        builder.disappear_after = this.disappear_after;
        builder.h5_link = this.h5_link;
        builder.user_limit = this.user_limit;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49282, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49282, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (!this.resource_url.isEmpty()) {
            sb.append(", resource_url=");
            sb.append(this.resource_url);
        }
        if (this.new_user != null) {
            sb.append(", new_user=");
            sb.append(this.new_user);
        }
        if (this.disappear_after != null) {
            sb.append(", disappear_after=");
            sb.append(this.disappear_after);
        }
        if (this.h5_link != null) {
            sb.append(", h5_link=");
            sb.append(this.h5_link);
        }
        if (this.user_limit != null) {
            sb.append(", user_limit=");
            sb.append(this.user_limit);
        }
        StringBuilder replace = sb.replace(0, 2, "UgNewFeedPendant{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49280, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49280, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof UgNewFeedPendant)) {
                return false;
            }
            UgNewFeedPendant ugNewFeedPendant = (UgNewFeedPendant) obj;
            if (!unknownFields().equals(ugNewFeedPendant.unknownFields()) || !this.resource_url.equals(ugNewFeedPendant.resource_url) || !Internal.equals(this.new_user, ugNewFeedPendant.new_user) || !Internal.equals(this.disappear_after, ugNewFeedPendant.disappear_after) || !Internal.equals(this.h5_link, ugNewFeedPendant.h5_link) || !Internal.equals(this.user_limit, ugNewFeedPendant.user_limit)) {
                return false;
            }
            return true;
        }
    }

    public UgNewFeedPendant(List<UrlModel> list, UgNewUser ugNewUser, Integer num, String str, UgUserLimit ugUserLimit) {
        this(list, ugNewUser, num, str, ugUserLimit, ByteString.EMPTY);
    }

    public UgNewFeedPendant(List<UrlModel> list, UgNewUser ugNewUser, Integer num, String str, UgUserLimit ugUserLimit, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource_url = Internal.immutableCopyOf("resource_url", list);
        this.new_user = ugNewUser;
        this.disappear_after = num;
        this.h5_link = str;
        this.user_limit = ugUserLimit;
    }
}
