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

public final class FollowTabGuideStruct extends Message<FollowTabGuideStruct, Builder> {
    public static final DefaultValueProtoAdapter<FollowTabGuideStruct> ADAPTER = new ProtoAdapter_FollowTabGuideStruct();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer follow_tab_guide_times;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String follow_tab_guide_word;

    public static final class Builder extends Message.Builder<FollowTabGuideStruct, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Integer follow_tab_guide_times;
        public String follow_tab_guide_word;

        public final FollowTabGuideStruct build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47922, new Class[0], FollowTabGuideStruct.class)) {
                return new FollowTabGuideStruct(this.follow_tab_guide_word, this.follow_tab_guide_times, super.buildUnknownFields());
            }
            return (FollowTabGuideStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47922, new Class[0], FollowTabGuideStruct.class);
        }

        public final Builder follow_tab_guide_times(Integer num) {
            this.follow_tab_guide_times = num;
            return this;
        }

        public final Builder follow_tab_guide_word(String str) {
            this.follow_tab_guide_word = str;
            return this;
        }
    }

    static final class ProtoAdapter_FollowTabGuideStruct extends DefaultValueProtoAdapter<FollowTabGuideStruct> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final FollowTabGuideStruct redact(FollowTabGuideStruct followTabGuideStruct) {
            return followTabGuideStruct;
        }

        public ProtoAdapter_FollowTabGuideStruct() {
            super(FieldEncoding.LENGTH_DELIMITED, FollowTabGuideStruct.class);
        }

        public final FollowTabGuideStruct decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47925, new Class[]{ProtoReader.class}, FollowTabGuideStruct.class)) {
                return decode(protoReader2, (FollowTabGuideStruct) null);
            }
            return (FollowTabGuideStruct) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47925, new Class[]{ProtoReader.class}, FollowTabGuideStruct.class);
        }

        public final int encodedSize(FollowTabGuideStruct followTabGuideStruct) {
            FollowTabGuideStruct followTabGuideStruct2 = followTabGuideStruct;
            if (!PatchProxy.isSupport(new Object[]{followTabGuideStruct2}, this, changeQuickRedirect, false, 47923, new Class[]{FollowTabGuideStruct.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, followTabGuideStruct2.follow_tab_guide_word) + ProtoAdapter.INT32.encodedSizeWithTag(2, followTabGuideStruct2.follow_tab_guide_times) + followTabGuideStruct.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{followTabGuideStruct2}, this, changeQuickRedirect, false, 47923, new Class[]{FollowTabGuideStruct.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, FollowTabGuideStruct followTabGuideStruct) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            FollowTabGuideStruct followTabGuideStruct2 = followTabGuideStruct;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, followTabGuideStruct2}, this, changeQuickRedirect, false, 47924, new Class[]{ProtoWriter.class, FollowTabGuideStruct.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, followTabGuideStruct2}, this, changeQuickRedirect, false, 47924, new Class[]{ProtoWriter.class, FollowTabGuideStruct.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, followTabGuideStruct2.follow_tab_guide_word);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 2, followTabGuideStruct2.follow_tab_guide_times);
            protoWriter2.writeBytes(followTabGuideStruct.unknownFields());
        }

        public final FollowTabGuideStruct decode(ProtoReader protoReader, FollowTabGuideStruct followTabGuideStruct) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            FollowTabGuideStruct followTabGuideStruct2 = followTabGuideStruct;
            if (PatchProxy.isSupport(new Object[]{protoReader2, followTabGuideStruct2}, this, changeQuickRedirect, false, 47926, new Class[]{ProtoReader.class, FollowTabGuideStruct.class}, FollowTabGuideStruct.class)) {
                return (FollowTabGuideStruct) PatchProxy.accessDispatch(new Object[]{protoReader2, followTabGuideStruct2}, this, changeQuickRedirect, false, 47926, new Class[]{ProtoReader.class, FollowTabGuideStruct.class}, FollowTabGuideStruct.class);
            }
            FollowTabGuideStruct followTabGuideStruct3 = (FollowTabGuideStruct) a.a().a(FollowTabGuideStruct.class, followTabGuideStruct2);
            if (followTabGuideStruct3 != null) {
                builder = followTabGuideStruct3.newBuilder();
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
                            builder2.follow_tab_guide_word((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 2:
                            builder2.follow_tab_guide_times((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (followTabGuideStruct3 != null) {
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
    public final Integer getFollowTabGuideTimes() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47917, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47917, new Class[0], Integer.class);
        } else if (this.follow_tab_guide_times != null) {
            return this.follow_tab_guide_times;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getFollowTabGuideWord() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47916, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47916, new Class[0], String.class);
        } else if (this.follow_tab_guide_word != null) {
            return this.follow_tab_guide_word;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47918, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47918, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.follow_tab_guide_word = this.follow_tab_guide_word;
        builder.follow_tab_guide_times = this.follow_tab_guide_times;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47920, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47920, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.follow_tab_guide_word != null) {
                i = this.follow_tab_guide_word.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.follow_tab_guide_times != null) {
                i2 = this.follow_tab_guide_times.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47921, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47921, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.follow_tab_guide_word != null) {
            sb.append(", follow_tab_guide_word=");
            sb.append(this.follow_tab_guide_word);
        }
        if (this.follow_tab_guide_times != null) {
            sb.append(", follow_tab_guide_times=");
            sb.append(this.follow_tab_guide_times);
        }
        StringBuilder replace = sb.replace(0, 2, "FollowTabGuideStruct{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47919, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47919, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof FollowTabGuideStruct)) {
                return false;
            }
            FollowTabGuideStruct followTabGuideStruct = (FollowTabGuideStruct) obj;
            if (!unknownFields().equals(followTabGuideStruct.unknownFields()) || !Internal.equals(this.follow_tab_guide_word, followTabGuideStruct.follow_tab_guide_word) || !Internal.equals(this.follow_tab_guide_times, followTabGuideStruct.follow_tab_guide_times)) {
                return false;
            }
            return true;
        }
    }

    public FollowTabGuideStruct(String str, Integer num) {
        this(str, num, ByteString.EMPTY);
    }

    public FollowTabGuideStruct(String str, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.follow_tab_guide_word = str;
        this.follow_tab_guide_times = num;
    }
}
