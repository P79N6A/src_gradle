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

public final class AppStoreMessage extends Message<AppStoreMessage, Builder> {
    public static final DefaultValueProtoAdapter<AppStoreMessage> ADAPTER = new ProtoAdapter_AppStoreMessage();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer section;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer switcher;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String text;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer threshold;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String title;

    public static final class Builder extends Message.Builder<AppStoreMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Integer section;
        public Integer switcher;
        public String text;
        public Integer threshold;
        public String title;

        public final AppStoreMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47668, new Class[0], AppStoreMessage.class)) {
                return (AppStoreMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47668, new Class[0], AppStoreMessage.class);
            }
            AppStoreMessage appStoreMessage = new AppStoreMessage(this.switcher, this.section, this.threshold, this.title, this.text, super.buildUnknownFields());
            return appStoreMessage;
        }

        public final Builder section(Integer num) {
            this.section = num;
            return this;
        }

        public final Builder switcher(Integer num) {
            this.switcher = num;
            return this;
        }

        public final Builder text(String str) {
            this.text = str;
            return this;
        }

        public final Builder threshold(Integer num) {
            this.threshold = num;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }
    }

    static final class ProtoAdapter_AppStoreMessage extends DefaultValueProtoAdapter<AppStoreMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final AppStoreMessage redact(AppStoreMessage appStoreMessage) {
            return appStoreMessage;
        }

        public ProtoAdapter_AppStoreMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, AppStoreMessage.class);
        }

        public final AppStoreMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47671, new Class[]{ProtoReader.class}, AppStoreMessage.class)) {
                return decode(protoReader2, (AppStoreMessage) null);
            }
            return (AppStoreMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47671, new Class[]{ProtoReader.class}, AppStoreMessage.class);
        }

        public final int encodedSize(AppStoreMessage appStoreMessage) {
            AppStoreMessage appStoreMessage2 = appStoreMessage;
            if (!PatchProxy.isSupport(new Object[]{appStoreMessage2}, this, changeQuickRedirect, false, 47669, new Class[]{AppStoreMessage.class}, Integer.TYPE)) {
                return ProtoAdapter.INT32.encodedSizeWithTag(1, appStoreMessage2.switcher) + ProtoAdapter.INT32.encodedSizeWithTag(2, appStoreMessage2.section) + ProtoAdapter.INT32.encodedSizeWithTag(3, appStoreMessage2.threshold) + ProtoAdapter.STRING.encodedSizeWithTag(4, appStoreMessage2.title) + ProtoAdapter.STRING.encodedSizeWithTag(5, appStoreMessage2.text) + appStoreMessage.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{appStoreMessage2}, this, changeQuickRedirect, false, 47669, new Class[]{AppStoreMessage.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, AppStoreMessage appStoreMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            AppStoreMessage appStoreMessage2 = appStoreMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, appStoreMessage2}, this, changeQuickRedirect, false, 47670, new Class[]{ProtoWriter.class, AppStoreMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, appStoreMessage2}, this, changeQuickRedirect, false, 47670, new Class[]{ProtoWriter.class, AppStoreMessage.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 1, appStoreMessage2.switcher);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 2, appStoreMessage2.section);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 3, appStoreMessage2.threshold);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, appStoreMessage2.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 5, appStoreMessage2.text);
            protoWriter2.writeBytes(appStoreMessage.unknownFields());
        }

        public final AppStoreMessage decode(ProtoReader protoReader, AppStoreMessage appStoreMessage) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            AppStoreMessage appStoreMessage2 = appStoreMessage;
            if (PatchProxy.isSupport(new Object[]{protoReader2, appStoreMessage2}, this, changeQuickRedirect, false, 47672, new Class[]{ProtoReader.class, AppStoreMessage.class}, AppStoreMessage.class)) {
                return (AppStoreMessage) PatchProxy.accessDispatch(new Object[]{protoReader2, appStoreMessage2}, this, changeQuickRedirect, false, 47672, new Class[]{ProtoReader.class, AppStoreMessage.class}, AppStoreMessage.class);
            }
            AppStoreMessage appStoreMessage3 = (AppStoreMessage) a.a().a(AppStoreMessage.class, appStoreMessage2);
            if (appStoreMessage3 != null) {
                builder = appStoreMessage3.newBuilder();
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
                            builder2.switcher((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 2:
                            builder2.section((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 3:
                            builder2.threshold((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 4:
                            builder2.title((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 5:
                            builder2.text((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (appStoreMessage3 != null) {
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
    public final Integer getSection() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47660, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47660, new Class[0], Integer.class);
        } else if (this.section != null) {
            return this.section;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getSwitcher() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47659, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47659, new Class[0], Integer.class);
        } else if (this.switcher != null) {
            return this.switcher;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getText() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47663, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47663, new Class[0], String.class);
        } else if (this.text != null) {
            return this.text;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getThreshold() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47661, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47661, new Class[0], Integer.class);
        } else if (this.threshold != null) {
            return this.threshold;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getTitle() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47662, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47662, new Class[0], String.class);
        } else if (this.title != null) {
            return this.title;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47664, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47664, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.switcher = this.switcher;
        builder.section = this.section;
        builder.threshold = this.threshold;
        builder.title = this.title;
        builder.text = this.text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47666, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47666, new Class[0], Integer.TYPE)).intValue();
        }
        int i6 = this.hashCode;
        if (i6 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.switcher != null) {
                i = this.switcher.hashCode();
            } else {
                i = 0;
            }
            int i7 = (hashCode + i) * 37;
            if (this.section != null) {
                i2 = this.section.hashCode();
            } else {
                i2 = 0;
            }
            int i8 = (i7 + i2) * 37;
            if (this.threshold != null) {
                i3 = this.threshold.hashCode();
            } else {
                i3 = 0;
            }
            int i9 = (i8 + i3) * 37;
            if (this.title != null) {
                i4 = this.title.hashCode();
            } else {
                i4 = 0;
            }
            int i10 = (i9 + i4) * 37;
            if (this.text != null) {
                i5 = this.text.hashCode();
            }
            i6 = i10 + i5;
            this.hashCode = i6;
        }
        return i6;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47667, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47667, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.switcher != null) {
            sb.append(", switcher=");
            sb.append(this.switcher);
        }
        if (this.section != null) {
            sb.append(", section=");
            sb.append(this.section);
        }
        if (this.threshold != null) {
            sb.append(", threshold=");
            sb.append(this.threshold);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        StringBuilder replace = sb.replace(0, 2, "AppStoreMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47665, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47665, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof AppStoreMessage)) {
                return false;
            }
            AppStoreMessage appStoreMessage = (AppStoreMessage) obj;
            if (!unknownFields().equals(appStoreMessage.unknownFields()) || !Internal.equals(this.switcher, appStoreMessage.switcher) || !Internal.equals(this.section, appStoreMessage.section) || !Internal.equals(this.threshold, appStoreMessage.threshold) || !Internal.equals(this.title, appStoreMessage.title) || !Internal.equals(this.text, appStoreMessage.text)) {
                return false;
            }
            return true;
        }
    }

    public AppStoreMessage(Integer num, Integer num2, Integer num3, String str, String str2) {
        this(num, num2, num3, str, str2, ByteString.EMPTY);
    }

    public AppStoreMessage(Integer num, Integer num2, Integer num3, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.switcher = num;
        this.section = num2;
        this.threshold = num3;
        this.title = str;
        this.text = str2;
    }
}
