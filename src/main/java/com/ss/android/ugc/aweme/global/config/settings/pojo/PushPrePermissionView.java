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

public final class PushPrePermissionView extends Message<PushPrePermissionView, Builder> {
    public static final DefaultValueProtoAdapter<PushPrePermissionView> ADAPTER = new ProtoAdapter_PushPrePermissionView();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String toast_text;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String toast_title;

    public static final class Builder extends Message.Builder<PushPrePermissionView, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String toast_text;
        public String toast_title;

        public final PushPrePermissionView build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49042, new Class[0], PushPrePermissionView.class)) {
                return new PushPrePermissionView(this.toast_title, this.toast_text, super.buildUnknownFields());
            }
            return (PushPrePermissionView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49042, new Class[0], PushPrePermissionView.class);
        }

        public final Builder toast_text(String str) {
            this.toast_text = str;
            return this;
        }

        public final Builder toast_title(String str) {
            this.toast_title = str;
            return this;
        }
    }

    static final class ProtoAdapter_PushPrePermissionView extends DefaultValueProtoAdapter<PushPrePermissionView> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final PushPrePermissionView redact(PushPrePermissionView pushPrePermissionView) {
            return pushPrePermissionView;
        }

        public ProtoAdapter_PushPrePermissionView() {
            super(FieldEncoding.LENGTH_DELIMITED, PushPrePermissionView.class);
        }

        public final PushPrePermissionView decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49045, new Class[]{ProtoReader.class}, PushPrePermissionView.class)) {
                return decode(protoReader2, (PushPrePermissionView) null);
            }
            return (PushPrePermissionView) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49045, new Class[]{ProtoReader.class}, PushPrePermissionView.class);
        }

        public final int encodedSize(PushPrePermissionView pushPrePermissionView) {
            PushPrePermissionView pushPrePermissionView2 = pushPrePermissionView;
            if (!PatchProxy.isSupport(new Object[]{pushPrePermissionView2}, this, changeQuickRedirect, false, 49043, new Class[]{PushPrePermissionView.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, pushPrePermissionView2.toast_title) + ProtoAdapter.STRING.encodedSizeWithTag(2, pushPrePermissionView2.toast_text) + pushPrePermissionView.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{pushPrePermissionView2}, this, changeQuickRedirect, false, 49043, new Class[]{PushPrePermissionView.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, PushPrePermissionView pushPrePermissionView) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            PushPrePermissionView pushPrePermissionView2 = pushPrePermissionView;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, pushPrePermissionView2}, this, changeQuickRedirect, false, 49044, new Class[]{ProtoWriter.class, PushPrePermissionView.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, pushPrePermissionView2}, this, changeQuickRedirect, false, 49044, new Class[]{ProtoWriter.class, PushPrePermissionView.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, pushPrePermissionView2.toast_title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, pushPrePermissionView2.toast_text);
            protoWriter2.writeBytes(pushPrePermissionView.unknownFields());
        }

        public final PushPrePermissionView decode(ProtoReader protoReader, PushPrePermissionView pushPrePermissionView) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            PushPrePermissionView pushPrePermissionView2 = pushPrePermissionView;
            if (PatchProxy.isSupport(new Object[]{protoReader2, pushPrePermissionView2}, this, changeQuickRedirect, false, 49046, new Class[]{ProtoReader.class, PushPrePermissionView.class}, PushPrePermissionView.class)) {
                return (PushPrePermissionView) PatchProxy.accessDispatch(new Object[]{protoReader2, pushPrePermissionView2}, this, changeQuickRedirect, false, 49046, new Class[]{ProtoReader.class, PushPrePermissionView.class}, PushPrePermissionView.class);
            }
            PushPrePermissionView pushPrePermissionView3 = (PushPrePermissionView) a.a().a(PushPrePermissionView.class, pushPrePermissionView2);
            if (pushPrePermissionView3 != null) {
                builder = pushPrePermissionView3.newBuilder();
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
                            builder2.toast_title((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 2:
                            builder2.toast_text((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (pushPrePermissionView3 != null) {
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
    public final String getToastText() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49037, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49037, new Class[0], String.class);
        } else if (this.toast_text != null) {
            return this.toast_text;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getToastTitle() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49036, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49036, new Class[0], String.class);
        } else if (this.toast_title != null) {
            return this.toast_title;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49038, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49038, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.toast_title = this.toast_title;
        builder.toast_text = this.toast_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49040, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49040, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.toast_title != null) {
                i = this.toast_title.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.toast_text != null) {
                i2 = this.toast_text.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49041, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49041, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.toast_title != null) {
            sb.append(", toast_title=");
            sb.append(this.toast_title);
        }
        if (this.toast_text != null) {
            sb.append(", toast_text=");
            sb.append(this.toast_text);
        }
        StringBuilder replace = sb.replace(0, 2, "PushPrePermissionView{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49039, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49039, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof PushPrePermissionView)) {
                return false;
            }
            PushPrePermissionView pushPrePermissionView = (PushPrePermissionView) obj;
            if (!unknownFields().equals(pushPrePermissionView.unknownFields()) || !Internal.equals(this.toast_title, pushPrePermissionView.toast_title) || !Internal.equals(this.toast_text, pushPrePermissionView.toast_text)) {
                return false;
            }
            return true;
        }
    }

    public PushPrePermissionView(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public PushPrePermissionView(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.toast_title = str;
        this.toast_text = str2;
    }
}
