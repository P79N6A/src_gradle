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

public final class FeedbackConf extends Message<FeedbackConf, Builder> {
    public static final DefaultValueProtoAdapter<FeedbackConf> ADAPTER = new ProtoAdapter_FeedbackConf();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String help;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String normal_entry;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String not_logged_in;

    public static final class Builder extends Message.Builder<FeedbackConf, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String help;
        public String normal_entry;
        public String not_logged_in;

        public final FeedbackConf build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47900, new Class[0], FeedbackConf.class)) {
                return new FeedbackConf(this.normal_entry, this.not_logged_in, this.help, super.buildUnknownFields());
            }
            return (FeedbackConf) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47900, new Class[0], FeedbackConf.class);
        }

        public final Builder help(String str) {
            this.help = str;
            return this;
        }

        public final Builder normal_entry(String str) {
            this.normal_entry = str;
            return this;
        }

        public final Builder not_logged_in(String str) {
            this.not_logged_in = str;
            return this;
        }
    }

    static final class ProtoAdapter_FeedbackConf extends DefaultValueProtoAdapter<FeedbackConf> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final FeedbackConf redact(FeedbackConf feedbackConf) {
            return feedbackConf;
        }

        public ProtoAdapter_FeedbackConf() {
            super(FieldEncoding.LENGTH_DELIMITED, FeedbackConf.class);
        }

        public final FeedbackConf decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47903, new Class[]{ProtoReader.class}, FeedbackConf.class)) {
                return decode(protoReader2, (FeedbackConf) null);
            }
            return (FeedbackConf) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47903, new Class[]{ProtoReader.class}, FeedbackConf.class);
        }

        public final int encodedSize(FeedbackConf feedbackConf) {
            FeedbackConf feedbackConf2 = feedbackConf;
            if (!PatchProxy.isSupport(new Object[]{feedbackConf2}, this, changeQuickRedirect, false, 47901, new Class[]{FeedbackConf.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, feedbackConf2.normal_entry) + ProtoAdapter.STRING.encodedSizeWithTag(2, feedbackConf2.not_logged_in) + ProtoAdapter.STRING.encodedSizeWithTag(3, feedbackConf2.help) + feedbackConf.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{feedbackConf2}, this, changeQuickRedirect, false, 47901, new Class[]{FeedbackConf.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, FeedbackConf feedbackConf) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            FeedbackConf feedbackConf2 = feedbackConf;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, feedbackConf2}, this, changeQuickRedirect, false, 47902, new Class[]{ProtoWriter.class, FeedbackConf.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, feedbackConf2}, this, changeQuickRedirect, false, 47902, new Class[]{ProtoWriter.class, FeedbackConf.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, feedbackConf2.normal_entry);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, feedbackConf2.not_logged_in);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, feedbackConf2.help);
            protoWriter2.writeBytes(feedbackConf.unknownFields());
        }

        public final FeedbackConf decode(ProtoReader protoReader, FeedbackConf feedbackConf) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            FeedbackConf feedbackConf2 = feedbackConf;
            if (PatchProxy.isSupport(new Object[]{protoReader2, feedbackConf2}, this, changeQuickRedirect, false, 47904, new Class[]{ProtoReader.class, FeedbackConf.class}, FeedbackConf.class)) {
                return (FeedbackConf) PatchProxy.accessDispatch(new Object[]{protoReader2, feedbackConf2}, this, changeQuickRedirect, false, 47904, new Class[]{ProtoReader.class, FeedbackConf.class}, FeedbackConf.class);
            }
            FeedbackConf feedbackConf3 = (FeedbackConf) a.a().a(FeedbackConf.class, feedbackConf2);
            if (feedbackConf3 != null) {
                builder = feedbackConf3.newBuilder();
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
                            builder2.normal_entry((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 2:
                            builder2.not_logged_in((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 3:
                            builder2.help((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (feedbackConf3 != null) {
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
    public final String getHelp() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47895, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47895, new Class[0], String.class);
        } else if (this.help != null) {
            return this.help;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getNormalEntry() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47893, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47893, new Class[0], String.class);
        } else if (this.normal_entry != null) {
            return this.normal_entry;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getNotLoggedIn() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47894, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47894, new Class[0], String.class);
        } else if (this.not_logged_in != null) {
            return this.not_logged_in;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47898, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47898, new Class[0], Integer.TYPE)).intValue();
        }
        int i4 = this.hashCode;
        if (i4 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.normal_entry != null) {
                i = this.normal_entry.hashCode();
            } else {
                i = 0;
            }
            int i5 = (hashCode + i) * 37;
            if (this.not_logged_in != null) {
                i2 = this.not_logged_in.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 37;
            if (this.help != null) {
                i3 = this.help.hashCode();
            }
            i4 = i6 + i3;
            this.hashCode = i4;
        }
        return i4;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47896, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47896, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.normal_entry = this.normal_entry;
        builder.not_logged_in = this.not_logged_in;
        builder.help = this.help;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47899, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47899, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.normal_entry != null) {
            sb.append(", normal_entry=");
            sb.append(this.normal_entry);
        }
        if (this.not_logged_in != null) {
            sb.append(", not_logged_in=");
            sb.append(this.not_logged_in);
        }
        if (this.help != null) {
            sb.append(", help=");
            sb.append(this.help);
        }
        StringBuilder replace = sb.replace(0, 2, "FeedbackConf{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47897, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47897, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof FeedbackConf)) {
                return false;
            }
            FeedbackConf feedbackConf = (FeedbackConf) obj;
            if (!unknownFields().equals(feedbackConf.unknownFields()) || !Internal.equals(this.normal_entry, feedbackConf.normal_entry) || !Internal.equals(this.not_logged_in, feedbackConf.not_logged_in) || !Internal.equals(this.help, feedbackConf.help)) {
                return false;
            }
            return true;
        }
    }

    public FeedbackConf(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public FeedbackConf(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.normal_entry = str;
        this.not_logged_in = str2;
        this.help = str3;
    }
}
