package com.ss.android.ugc.aweme.global.config.settings.pojo;

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

public final class WhiteList extends Message<WhiteList, Builder> {
    public static final DefaultValueProtoAdapter<WhiteList> ADAPTER = new ProtoAdapter_WhiteList();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 2)
    public final List<String> long_whitelist;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 1)
    public final List<String> short_whitelist;

    public static final class Builder extends Message.Builder<WhiteList, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public List<String> long_whitelist = Internal.newMutableList();
        public List<String> short_whitelist = Internal.newMutableList();

        public final WhiteList build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49437, new Class[0], WhiteList.class)) {
                return new WhiteList(this.short_whitelist, this.long_whitelist, super.buildUnknownFields());
            }
            return (WhiteList) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49437, new Class[0], WhiteList.class);
        }

        public final Builder long_whitelist(List<String> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 49436, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 49436, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.long_whitelist = list;
            return this;
        }

        public final Builder short_whitelist(List<String> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 49435, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 49435, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.short_whitelist = list;
            return this;
        }
    }

    static final class ProtoAdapter_WhiteList extends DefaultValueProtoAdapter<WhiteList> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final WhiteList redact(WhiteList whiteList) {
            return whiteList;
        }

        public ProtoAdapter_WhiteList() {
            super(FieldEncoding.LENGTH_DELIMITED, WhiteList.class);
        }

        public final WhiteList decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49440, new Class[]{ProtoReader.class}, WhiteList.class)) {
                return decode(protoReader2, (WhiteList) null);
            }
            return (WhiteList) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49440, new Class[]{ProtoReader.class}, WhiteList.class);
        }

        public final int encodedSize(WhiteList whiteList) {
            WhiteList whiteList2 = whiteList;
            if (!PatchProxy.isSupport(new Object[]{whiteList2}, this, changeQuickRedirect, false, 49438, new Class[]{WhiteList.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, whiteList2.short_whitelist) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, whiteList2.long_whitelist) + whiteList.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{whiteList2}, this, changeQuickRedirect, false, 49438, new Class[]{WhiteList.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, WhiteList whiteList) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            WhiteList whiteList2 = whiteList;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, whiteList2}, this, changeQuickRedirect, false, 49439, new Class[]{ProtoWriter.class, WhiteList.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, whiteList2}, this, changeQuickRedirect, false, 49439, new Class[]{ProtoWriter.class, WhiteList.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter2, 1, whiteList2.short_whitelist);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter2, 2, whiteList2.long_whitelist);
            protoWriter2.writeBytes(whiteList.unknownFields());
        }

        public final WhiteList decode(ProtoReader protoReader, WhiteList whiteList) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            WhiteList whiteList2 = whiteList;
            if (PatchProxy.isSupport(new Object[]{protoReader2, whiteList2}, this, changeQuickRedirect, false, 49441, new Class[]{ProtoReader.class, WhiteList.class}, WhiteList.class)) {
                return (WhiteList) PatchProxy.accessDispatch(new Object[]{protoReader2, whiteList2}, this, changeQuickRedirect, false, 49441, new Class[]{ProtoReader.class, WhiteList.class}, WhiteList.class);
            }
            WhiteList whiteList3 = (WhiteList) a.a().a(WhiteList.class, whiteList2);
            if (whiteList3 != null) {
                builder = whiteList3.newBuilder();
            } else {
                builder = new Builder();
            }
            Builder builder2 = builder;
            List<String> newMutableList = Internal.newMutableList();
            List<String> newMutableList2 = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            newMutableList.add(ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 2:
                            newMutableList2.add(ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (whiteList3 != null) {
                                    break;
                                } else {
                                    throw e2;
                                }
                            }
                    }
                } else {
                    protoReader2.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder2.short_whitelist = newMutableList;
                    }
                    if (!newMutableList2.isEmpty()) {
                        builder2.long_whitelist = newMutableList2;
                    }
                    return builder2.build();
                }
            }
        }
    }

    public final List<String> getLongWhitelist() {
        return this.long_whitelist;
    }

    public final List<String> getShortWhitelist() {
        return this.short_whitelist;
    }

    public final int hashCode() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49433, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49433, new Class[0], Integer.TYPE)).intValue();
        }
        int i = this.hashCode;
        if (i == 0) {
            i = (((unknownFields().hashCode() * 37) + this.short_whitelist.hashCode()) * 37) + this.long_whitelist.hashCode();
            this.hashCode = i;
        }
        return i;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49431, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49431, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.short_whitelist = Internal.copyOf("short_whitelist", this.short_whitelist);
        builder.long_whitelist = Internal.copyOf("long_whitelist", this.long_whitelist);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49434, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49434, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (!this.short_whitelist.isEmpty()) {
            sb.append(", short_whitelist=");
            sb.append(this.short_whitelist);
        }
        if (!this.long_whitelist.isEmpty()) {
            sb.append(", long_whitelist=");
            sb.append(this.long_whitelist);
        }
        StringBuilder replace = sb.replace(0, 2, "WhiteList{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49432, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49432, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof WhiteList)) {
                return false;
            }
            WhiteList whiteList = (WhiteList) obj;
            if (!unknownFields().equals(whiteList.unknownFields()) || !this.short_whitelist.equals(whiteList.short_whitelist) || !this.long_whitelist.equals(whiteList.long_whitelist)) {
                return false;
            }
            return true;
        }
    }

    public WhiteList(List<String> list, List<String> list2) {
        this(list, list2, ByteString.EMPTY);
    }

    public WhiteList(List<String> list, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.short_whitelist = Internal.immutableCopyOf("short_whitelist", list);
        this.long_whitelist = Internal.immutableCopyOf("long_whitelist", list2);
    }
}
