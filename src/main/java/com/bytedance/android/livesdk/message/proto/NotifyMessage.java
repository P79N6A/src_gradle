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
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class NotifyMessage extends Message<NotifyMessage, Builder> {
    public static final ProtoAdapter<NotifyMessage> ADAPTER = new ProtoAdapter_NotifyMessage();
    public static final Long DEFAULT_NOTIFY_CLASS = 0L;
    public static final Long DEFAULT_NOTIFY_TYPE = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String content;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.NotifyMessage$Extra#ADAPTER", tag = 6)
    public final Extra extra;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 7)
    public final Long notify_class;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long notify_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String schema;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 5)
    public final User user;

    public static final class Background extends Message<Background, Builder> {
        public static final ProtoAdapter<Background> ADAPTER = new ProtoAdapter_Background();
        public static final Integer DEFAULT_HEIGHT = 0;
        public static final Integer DEFAULT_WIDTH = 0;
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
        public final Integer height;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
        public final String uri;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 3)
        public final List<String> url_list;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
        public final Integer width;

        public static final class Builder extends Message.Builder<Background, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public Integer height;
            public String uri;
            public List<String> url_list = Internal.newMutableList();
            public Integer width;

            public final Background build() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11931, new Class[0], Background.class)) {
                    return (Background) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11931, new Class[0], Background.class);
                }
                Background background = new Background(this.width, this.height, this.url_list, this.uri, super.buildUnknownFields());
                return background;
            }

            public final Builder height(Integer num) {
                this.height = num;
                return this;
            }

            public final Builder uri(String str) {
                this.uri = str;
                return this;
            }

            public final Builder width(Integer num) {
                this.width = num;
                return this;
            }

            public final Builder url_list(List<String> list) {
                if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 11930, new Class[]{List.class}, Builder.class)) {
                    return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 11930, new Class[]{List.class}, Builder.class);
                }
                Internal.checkElementsNotNull(list);
                this.url_list = list;
                return this;
            }
        }

        static final class ProtoAdapter_Background extends ProtoAdapter<Background> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_Background() {
                super(FieldEncoding.LENGTH_DELIMITED, Background.class);
            }

            public final int encodedSize(Background background) {
                int i;
                int i2;
                Background background2 = background;
                int i3 = 0;
                if (PatchProxy.isSupport(new Object[]{background2}, this, changeQuickRedirect, false, 11932, new Class[]{Background.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{background2}, this, changeQuickRedirect, false, 11932, new Class[]{Background.class}, Integer.TYPE)).intValue();
                }
                if (background2.width != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(1, background2.width);
                } else {
                    i = 0;
                }
                if (background2.height != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, background2.height);
                } else {
                    i2 = 0;
                }
                int encodedSizeWithTag = i + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, background2.url_list);
                if (background2.uri != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, background2.uri);
                }
                return encodedSizeWithTag + i3 + background.unknownFields().size();
            }

            public final Background redact(Background background) {
                if (PatchProxy.isSupport(new Object[]{background}, this, changeQuickRedirect, false, 11935, new Class[]{Background.class}, Background.class)) {
                    return (Background) PatchProxy.accessDispatch(new Object[]{background}, this, changeQuickRedirect, false, 11935, new Class[]{Background.class}, Background.class);
                }
                Builder newBuilder = background.newBuilder();
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final Background decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11934, new Class[]{ProtoReader.class}, Background.class)) {
                    return (Background) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11934, new Class[]{ProtoReader.class}, Background.class);
                }
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                builder.width((Integer) ProtoAdapter.INT32.decode(protoReader2));
                                break;
                            case 2:
                                builder.height((Integer) ProtoAdapter.INT32.decode(protoReader2));
                                break;
                            case 3:
                                builder.url_list.add(ProtoAdapter.STRING.decode(protoReader2));
                                break;
                            case 4:
                                builder.uri((String) ProtoAdapter.STRING.decode(protoReader2));
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

            public final void encode(ProtoWriter protoWriter, Background background) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                Background background2 = background;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, background2}, this, changeQuickRedirect, false, 11933, new Class[]{ProtoWriter.class, Background.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, background2}, this, changeQuickRedirect, false, 11933, new Class[]{ProtoWriter.class, Background.class}, Void.TYPE);
                    return;
                }
                if (background2.width != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter2, 1, background2.width);
                }
                if (background2.height != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter2, 2, background2.height);
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter2, 3, background2.url_list);
                if (background2.uri != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, background2.uri);
                }
                protoWriter2.writeBytes(background.unknownFields());
            }
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11928, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11928, new Class[0], Integer.TYPE)).intValue();
            }
            int i4 = this.hashCode;
            if (i4 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                if (this.width != null) {
                    i = this.width.hashCode();
                } else {
                    i = 0;
                }
                int i5 = (hashCode + i) * 37;
                if (this.height != null) {
                    i2 = this.height.hashCode();
                } else {
                    i2 = 0;
                }
                int hashCode2 = (((i5 + i2) * 37) + this.url_list.hashCode()) * 37;
                if (this.uri != null) {
                    i3 = this.uri.hashCode();
                }
                i4 = hashCode2 + i3;
                this.hashCode = i4;
            }
            return i4;
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11926, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11926, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.width = this.width;
            builder.height = this.height;
            builder.url_list = Internal.copyOf("url_list", this.url_list);
            builder.uri = this.uri;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11929, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11929, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (this.width != null) {
                sb.append(", width=");
                sb.append(this.width);
            }
            if (this.height != null) {
                sb.append(", height=");
                sb.append(this.height);
            }
            if (!this.url_list.isEmpty()) {
                sb.append(", url_list=");
                sb.append(this.url_list);
            }
            if (this.uri != null) {
                sb.append(", uri=");
                sb.append(this.uri);
            }
            StringBuilder replace = sb.replace(0, 2, "Background{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11927, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11927, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof Background)) {
                    return false;
                }
                Background background = (Background) obj;
                if (!unknownFields().equals(background.unknownFields()) || !Internal.equals(this.width, background.width) || !Internal.equals(this.height, background.height) || !this.url_list.equals(background.url_list) || !Internal.equals(this.uri, background.uri)) {
                    return false;
                }
                return true;
            }
        }

        public Background(Integer num, Integer num2, List<String> list, String str) {
            this(num, num2, list, str, ByteString.EMPTY);
        }

        public Background(Integer num, Integer num2, List<String> list, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.width = num;
            this.height = num2;
            this.url_list = Internal.immutableCopyOf("url_list", list);
            this.uri = str;
        }
    }

    public static final class Content extends Message<Content, Builder> {
        public static final ProtoAdapter<Content> ADAPTER = new ProtoAdapter_Content();
        public static final Boolean DEFAULT_NEED_HIGH_LIGHT = Boolean.FALSE;
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
        public final String content;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
        public final Boolean need_high_light;

        public static final class Builder extends Message.Builder<Content, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public String content;
            public Boolean need_high_light;

            public final Content build() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11941, new Class[0], Content.class)) {
                    return new Content(this.content, this.need_high_light, super.buildUnknownFields());
                }
                return (Content) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11941, new Class[0], Content.class);
            }

            public final Builder content(String str) {
                this.content = str;
                return this;
            }

            public final Builder need_high_light(Boolean bool) {
                this.need_high_light = bool;
                return this;
            }
        }

        static final class ProtoAdapter_Content extends ProtoAdapter<Content> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_Content() {
                super(FieldEncoding.LENGTH_DELIMITED, Content.class);
            }

            public final int encodedSize(Content content) {
                int i;
                Content content2 = content;
                int i2 = 0;
                if (PatchProxy.isSupport(new Object[]{content2}, this, changeQuickRedirect, false, 11942, new Class[]{Content.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{content2}, this, changeQuickRedirect, false, 11942, new Class[]{Content.class}, Integer.TYPE)).intValue();
                }
                if (content2.content != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, content2.content);
                } else {
                    i = 0;
                }
                if (content2.need_high_light != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, content2.need_high_light);
                }
                return i + i2 + content.unknownFields().size();
            }

            public final Content redact(Content content) {
                if (PatchProxy.isSupport(new Object[]{content}, this, changeQuickRedirect, false, 11945, new Class[]{Content.class}, Content.class)) {
                    return (Content) PatchProxy.accessDispatch(new Object[]{content}, this, changeQuickRedirect, false, 11945, new Class[]{Content.class}, Content.class);
                }
                Builder newBuilder = content.newBuilder();
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final Content decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11944, new Class[]{ProtoReader.class}, Content.class)) {
                    return (Content) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11944, new Class[]{ProtoReader.class}, Content.class);
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
                                builder.need_high_light((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
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

            public final void encode(ProtoWriter protoWriter, Content content) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                Content content2 = content;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, content2}, this, changeQuickRedirect, false, 11943, new Class[]{ProtoWriter.class, Content.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, content2}, this, changeQuickRedirect, false, 11943, new Class[]{ProtoWriter.class, Content.class}, Void.TYPE);
                    return;
                }
                if (content2.content != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, content2.content);
                }
                if (content2.need_high_light != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 2, content2.need_high_light);
                }
                protoWriter2.writeBytes(content.unknownFields());
            }
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11937, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11937, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.content = this.content;
            builder.need_high_light = this.need_high_light;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final int hashCode() {
            int i;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11939, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11939, new Class[0], Integer.TYPE)).intValue();
            }
            int i3 = this.hashCode;
            if (i3 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                if (this.content != null) {
                    i = this.content.hashCode();
                } else {
                    i = 0;
                }
                int i4 = (hashCode + i) * 37;
                if (this.need_high_light != null) {
                    i2 = this.need_high_light.hashCode();
                }
                i3 = i4 + i2;
                this.hashCode = i3;
            }
            return i3;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11940, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11940, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (this.content != null) {
                sb.append(", content=");
                sb.append(this.content);
            }
            if (this.need_high_light != null) {
                sb.append(", need_high_light=");
                sb.append(this.need_high_light);
            }
            StringBuilder replace = sb.replace(0, 2, "Content{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11938, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11938, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof Content)) {
                    return false;
                }
                Content content2 = (Content) obj;
                if (!unknownFields().equals(content2.unknownFields()) || !Internal.equals(this.content, content2.content) || !Internal.equals(this.need_high_light, content2.need_high_light)) {
                    return false;
                }
                return true;
            }
        }

        public Content(String str, Boolean bool) {
            this(str, bool, ByteString.EMPTY);
        }

        public Content(String str, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.content = str;
            this.need_high_light = bool;
        }
    }

    public static final class ContentList extends Message<ContentList, Builder> {
        public static final ProtoAdapter<ContentList> ADAPTER = new ProtoAdapter_ContentList();
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.NotifyMessage$Content#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
        public final List<Content> contents;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
        public final String high_light_color;

        public static final class Builder extends Message.Builder<ContentList, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public List<Content> contents = Internal.newMutableList();
            public String high_light_color;

            public final ContentList build() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11951, new Class[0], ContentList.class)) {
                    return new ContentList(this.contents, this.high_light_color, super.buildUnknownFields());
                }
                return (ContentList) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11951, new Class[0], ContentList.class);
            }

            public final Builder high_light_color(String str) {
                this.high_light_color = str;
                return this;
            }

            public final Builder contents(List<Content> list) {
                if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 11950, new Class[]{List.class}, Builder.class)) {
                    return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 11950, new Class[]{List.class}, Builder.class);
                }
                Internal.checkElementsNotNull(list);
                this.contents = list;
                return this;
            }
        }

        static final class ProtoAdapter_ContentList extends ProtoAdapter<ContentList> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_ContentList() {
                super(FieldEncoding.LENGTH_DELIMITED, ContentList.class);
            }

            public final int encodedSize(ContentList contentList) {
                ContentList contentList2 = contentList;
                int i = 0;
                if (PatchProxy.isSupport(new Object[]{contentList2}, this, changeQuickRedirect, false, 11952, new Class[]{ContentList.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{contentList2}, this, changeQuickRedirect, false, 11952, new Class[]{ContentList.class}, Integer.TYPE)).intValue();
                }
                int encodedSizeWithTag = Content.ADAPTER.asRepeated().encodedSizeWithTag(1, contentList2.contents);
                if (contentList2.high_light_color != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, contentList2.high_light_color);
                }
                return encodedSizeWithTag + i + contentList.unknownFields().size();
            }

            public final ContentList redact(ContentList contentList) {
                if (PatchProxy.isSupport(new Object[]{contentList}, this, changeQuickRedirect, false, 11955, new Class[]{ContentList.class}, ContentList.class)) {
                    return (ContentList) PatchProxy.accessDispatch(new Object[]{contentList}, this, changeQuickRedirect, false, 11955, new Class[]{ContentList.class}, ContentList.class);
                }
                Builder newBuilder = contentList.newBuilder();
                Internal.redactElements(newBuilder.contents, Content.ADAPTER);
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final ContentList decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11954, new Class[]{ProtoReader.class}, ContentList.class)) {
                    return (ContentList) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11954, new Class[]{ProtoReader.class}, ContentList.class);
                }
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                builder.contents.add(Content.ADAPTER.decode(protoReader2));
                                break;
                            case 2:
                                builder.high_light_color((String) ProtoAdapter.STRING.decode(protoReader2));
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

            public final void encode(ProtoWriter protoWriter, ContentList contentList) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                ContentList contentList2 = contentList;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, contentList2}, this, changeQuickRedirect, false, 11953, new Class[]{ProtoWriter.class, ContentList.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, contentList2}, this, changeQuickRedirect, false, 11953, new Class[]{ProtoWriter.class, ContentList.class}, Void.TYPE);
                    return;
                }
                Content.ADAPTER.asRepeated().encodeWithTag(protoWriter2, 1, contentList2.contents);
                if (contentList2.high_light_color != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, contentList2.high_light_color);
                }
                protoWriter2.writeBytes(contentList.unknownFields());
            }
        }

        public final int hashCode() {
            int i = 0;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11948, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11948, new Class[0], Integer.TYPE)).intValue();
            }
            int i2 = this.hashCode;
            if (i2 == 0) {
                int hashCode = ((unknownFields().hashCode() * 37) + this.contents.hashCode()) * 37;
                if (this.high_light_color != null) {
                    i = this.high_light_color.hashCode();
                }
                i2 = hashCode + i;
                this.hashCode = i2;
            }
            return i2;
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11946, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11946, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.contents = Internal.copyOf("contents", this.contents);
            builder.high_light_color = this.high_light_color;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11949, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11949, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (!this.contents.isEmpty()) {
                sb.append(", contents=");
                sb.append(this.contents);
            }
            if (this.high_light_color != null) {
                sb.append(", high_light_color=");
                sb.append(this.high_light_color);
            }
            StringBuilder replace = sb.replace(0, 2, "ContentList{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11947, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11947, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof ContentList)) {
                    return false;
                }
                ContentList contentList = (ContentList) obj;
                if (!unknownFields().equals(contentList.unknownFields()) || !this.contents.equals(contentList.contents) || !Internal.equals(this.high_light_color, contentList.high_light_color)) {
                    return false;
                }
                return true;
            }
        }

        public ContentList(List<Content> list, String str) {
            this(list, str, ByteString.EMPTY);
        }

        public ContentList(List<Content> list, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.contents = Internal.immutableCopyOf("contents", list);
            this.high_light_color = str;
        }
    }

    public static final class Extra extends Message<Extra, Builder> {
        public static final ProtoAdapter<Extra> ADAPTER = new ProtoAdapter_Extra();
        public static final Long DEFAULT_DURATION = 0L;
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.NotifyMessage$Background#ADAPTER", tag = 2)
        public final Background background;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.NotifyMessage$ContentList#ADAPTER", tag = 3)
        public final ContentList content_list;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
        public final Long duration;

        public static final class Builder extends Message.Builder<Extra, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public Background background;
            public ContentList content_list;
            public Long duration;

            public final Extra build() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11960, new Class[0], Extra.class)) {
                    return new Extra(this.duration, this.background, this.content_list, super.buildUnknownFields());
                }
                return (Extra) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11960, new Class[0], Extra.class);
            }

            public final Builder background(Background background2) {
                this.background = background2;
                return this;
            }

            public final Builder content_list(ContentList contentList) {
                this.content_list = contentList;
                return this;
            }

            public final Builder duration(Long l) {
                this.duration = l;
                return this;
            }
        }

        static final class ProtoAdapter_Extra extends ProtoAdapter<Extra> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_Extra() {
                super(FieldEncoding.LENGTH_DELIMITED, Extra.class);
            }

            public final int encodedSize(Extra extra) {
                int i;
                int i2;
                Extra extra2 = extra;
                int i3 = 0;
                if (PatchProxy.isSupport(new Object[]{extra2}, this, changeQuickRedirect, false, 11961, new Class[]{Extra.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{extra2}, this, changeQuickRedirect, false, 11961, new Class[]{Extra.class}, Integer.TYPE)).intValue();
                }
                if (extra2.duration != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, extra2.duration);
                } else {
                    i = 0;
                }
                if (extra2.background != null) {
                    i2 = Background.ADAPTER.encodedSizeWithTag(2, extra2.background);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (extra2.content_list != null) {
                    i3 = ContentList.ADAPTER.encodedSizeWithTag(3, extra2.content_list);
                }
                return i4 + i3 + extra.unknownFields().size();
            }

            public final Extra redact(Extra extra) {
                if (PatchProxy.isSupport(new Object[]{extra}, this, changeQuickRedirect, false, 11964, new Class[]{Extra.class}, Extra.class)) {
                    return (Extra) PatchProxy.accessDispatch(new Object[]{extra}, this, changeQuickRedirect, false, 11964, new Class[]{Extra.class}, Extra.class);
                }
                Builder newBuilder = extra.newBuilder();
                if (newBuilder.background != null) {
                    newBuilder.background = (Background) Background.ADAPTER.redact(newBuilder.background);
                }
                if (newBuilder.content_list != null) {
                    newBuilder.content_list = (ContentList) ContentList.ADAPTER.redact(newBuilder.content_list);
                }
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final Extra decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11963, new Class[]{ProtoReader.class}, Extra.class)) {
                    return (Extra) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11963, new Class[]{ProtoReader.class}, Extra.class);
                }
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                builder.duration((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 2:
                                builder.background((Background) Background.ADAPTER.decode(protoReader2));
                                break;
                            case 3:
                                builder.content_list((ContentList) ContentList.ADAPTER.decode(protoReader2));
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

            public final void encode(ProtoWriter protoWriter, Extra extra) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                Extra extra2 = extra;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, extra2}, this, changeQuickRedirect, false, 11962, new Class[]{ProtoWriter.class, Extra.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, extra2}, this, changeQuickRedirect, false, 11962, new Class[]{ProtoWriter.class, Extra.class}, Void.TYPE);
                    return;
                }
                if (extra2.duration != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1, extra2.duration);
                }
                if (extra2.background != null) {
                    Background.ADAPTER.encodeWithTag(protoWriter2, 2, extra2.background);
                }
                if (extra2.content_list != null) {
                    ContentList.ADAPTER.encodeWithTag(protoWriter2, 3, extra2.content_list);
                }
                protoWriter2.writeBytes(extra.unknownFields());
            }
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11956, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11956, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.duration = this.duration;
            builder.background = this.background;
            builder.content_list = this.content_list;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11958, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11958, new Class[0], Integer.TYPE)).intValue();
            }
            int i4 = this.hashCode;
            if (i4 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                if (this.duration != null) {
                    i = this.duration.hashCode();
                } else {
                    i = 0;
                }
                int i5 = (hashCode + i) * 37;
                if (this.background != null) {
                    i2 = this.background.hashCode();
                } else {
                    i2 = 0;
                }
                int i6 = (i5 + i2) * 37;
                if (this.content_list != null) {
                    i3 = this.content_list.hashCode();
                }
                i4 = i6 + i3;
                this.hashCode = i4;
            }
            return i4;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11959, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11959, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (this.duration != null) {
                sb.append(", duration=");
                sb.append(this.duration);
            }
            if (this.background != null) {
                sb.append(", background=");
                sb.append(this.background);
            }
            if (this.content_list != null) {
                sb.append(", content_list=");
                sb.append(this.content_list);
            }
            StringBuilder replace = sb.replace(0, 2, "Extra{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11957, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11957, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof Extra)) {
                    return false;
                }
                Extra extra = (Extra) obj;
                if (!unknownFields().equals(extra.unknownFields()) || !Internal.equals(this.duration, extra.duration) || !Internal.equals(this.background, extra.background) || !Internal.equals(this.content_list, extra.content_list)) {
                    return false;
                }
                return true;
            }
        }

        public Extra(Long l, Background background2, ContentList contentList) {
            this(l, background2, contentList, ByteString.EMPTY);
        }

        public Extra(Long l, Background background2, ContentList contentList, ByteString byteString) {
            super(ADAPTER, byteString);
            this.duration = l;
            this.background = background2;
            this.content_list = contentList;
        }
    }

    public static final class Builder extends Message.Builder<NotifyMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public String content;
        public Extra extra;
        public Long notify_class;
        public Long notify_type;
        public String schema;
        public User user;

        public final NotifyMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11936, new Class[0], NotifyMessage.class)) {
                return (NotifyMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11936, new Class[0], NotifyMessage.class);
            }
            NotifyMessage notifyMessage = new NotifyMessage(this.common, this.schema, this.notify_type, this.content, this.user, this.extra, this.notify_class, super.buildUnknownFields());
            return notifyMessage;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }

        public final Builder extra(Extra extra2) {
            this.extra = extra2;
            return this;
        }

        public final Builder notify_class(Long l) {
            this.notify_class = l;
            return this;
        }

        public final Builder notify_type(Long l) {
            this.notify_type = l;
            return this;
        }

        public final Builder schema(String str) {
            this.schema = str;
            return this;
        }

        public final Builder user(User user2) {
            this.user = user2;
            return this;
        }
    }

    static final class ProtoAdapter_NotifyMessage extends ProtoAdapter<NotifyMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_NotifyMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, NotifyMessage.class);
        }

        public final NotifyMessage redact(NotifyMessage notifyMessage) {
            if (PatchProxy.isSupport(new Object[]{notifyMessage}, this, changeQuickRedirect, false, 11968, new Class[]{NotifyMessage.class}, NotifyMessage.class)) {
                return (NotifyMessage) PatchProxy.accessDispatch(new Object[]{notifyMessage}, this, changeQuickRedirect, false, 11968, new Class[]{NotifyMessage.class}, NotifyMessage.class);
            }
            Builder newBuilder = notifyMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.user != null) {
                newBuilder.user = (User) User.ADAPTER.redact(newBuilder.user);
            }
            if (newBuilder.extra != null) {
                newBuilder.extra = (Extra) Extra.ADAPTER.redact(newBuilder.extra);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final NotifyMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11967, new Class[]{ProtoReader.class}, NotifyMessage.class)) {
                return (NotifyMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11967, new Class[]{ProtoReader.class}, NotifyMessage.class);
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
                            builder.schema((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 3:
                            builder.notify_type((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 4:
                            builder.content((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 5:
                            builder.user((User) User.ADAPTER.decode(protoReader2));
                            break;
                        case 6:
                            builder.extra((Extra) Extra.ADAPTER.decode(protoReader2));
                            break;
                        case e.l /*7*/:
                            builder.notify_class((Long) ProtoAdapter.INT64.decode(protoReader2));
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

        public final int encodedSize(NotifyMessage notifyMessage) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            NotifyMessage notifyMessage2 = notifyMessage;
            int i7 = 0;
            if (PatchProxy.isSupport(new Object[]{notifyMessage2}, this, changeQuickRedirect, false, 11965, new Class[]{NotifyMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{notifyMessage2}, this, changeQuickRedirect, false, 11965, new Class[]{NotifyMessage.class}, Integer.TYPE)).intValue();
            }
            if (notifyMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, notifyMessage2.common);
            } else {
                i = 0;
            }
            if (notifyMessage2.schema != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, notifyMessage2.schema);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (notifyMessage2.notify_type != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, notifyMessage2.notify_type);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (notifyMessage2.content != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, notifyMessage2.content);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (notifyMessage2.user != null) {
                i5 = User.ADAPTER.encodedSizeWithTag(5, notifyMessage2.user);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (notifyMessage2.extra != null) {
                i6 = Extra.ADAPTER.encodedSizeWithTag(6, notifyMessage2.extra);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (notifyMessage2.notify_class != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, notifyMessage2.notify_class);
            }
            return i12 + i7 + notifyMessage.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, NotifyMessage notifyMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            NotifyMessage notifyMessage2 = notifyMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, notifyMessage2}, this, changeQuickRedirect, false, 11966, new Class[]{ProtoWriter.class, NotifyMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, notifyMessage2}, this, changeQuickRedirect, false, 11966, new Class[]{ProtoWriter.class, NotifyMessage.class}, Void.TYPE);
                return;
            }
            if (notifyMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, notifyMessage2.common);
            }
            if (notifyMessage2.schema != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, notifyMessage2.schema);
            }
            if (notifyMessage2.notify_type != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, notifyMessage2.notify_type);
            }
            if (notifyMessage2.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, notifyMessage2.content);
            }
            if (notifyMessage2.user != null) {
                User.ADAPTER.encodeWithTag(protoWriter2, 5, notifyMessage2.user);
            }
            if (notifyMessage2.extra != null) {
                Extra.ADAPTER.encodeWithTag(protoWriter2, 6, notifyMessage2.extra);
            }
            if (notifyMessage2.notify_class != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 7, notifyMessage2.notify_class);
            }
            protoWriter2.writeBytes(notifyMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11922, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11922, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.schema = this.schema;
        builder.notify_type = this.notify_type;
        builder.content = this.content;
        builder.user = this.user;
        builder.extra = this.extra;
        builder.notify_class = this.notify_class;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11924, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11924, new Class[0], Integer.TYPE)).intValue();
        }
        int i8 = this.hashCode;
        if (i8 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i9 = (hashCode + i) * 37;
            if (this.schema != null) {
                i2 = this.schema.hashCode();
            } else {
                i2 = 0;
            }
            int i10 = (i9 + i2) * 37;
            if (this.notify_type != null) {
                i3 = this.notify_type.hashCode();
            } else {
                i3 = 0;
            }
            int i11 = (i10 + i3) * 37;
            if (this.content != null) {
                i4 = this.content.hashCode();
            } else {
                i4 = 0;
            }
            int i12 = (i11 + i4) * 37;
            if (this.user != null) {
                i5 = this.user.hashCode();
            } else {
                i5 = 0;
            }
            int i13 = (i12 + i5) * 37;
            if (this.extra != null) {
                i6 = this.extra.hashCode();
            } else {
                i6 = 0;
            }
            int i14 = (i13 + i6) * 37;
            if (this.notify_class != null) {
                i7 = this.notify_class.hashCode();
            }
            i8 = i14 + i7;
            this.hashCode = i8;
        }
        return i8;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11925, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11925, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.schema != null) {
            sb.append(", schema=");
            sb.append(this.schema);
        }
        if (this.notify_type != null) {
            sb.append(", notify_type=");
            sb.append(this.notify_type);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.user != null) {
            sb.append(", user=");
            sb.append(this.user);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        if (this.notify_class != null) {
            sb.append(", notify_class=");
            sb.append(this.notify_class);
        }
        StringBuilder replace = sb.replace(0, 2, "NotifyMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11923, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11923, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof NotifyMessage)) {
                return false;
            }
            NotifyMessage notifyMessage = (NotifyMessage) obj;
            if (!unknownFields().equals(notifyMessage.unknownFields()) || !Internal.equals(this.common, notifyMessage.common) || !Internal.equals(this.schema, notifyMessage.schema) || !Internal.equals(this.notify_type, notifyMessage.notify_type) || !Internal.equals(this.content, notifyMessage.content) || !Internal.equals(this.user, notifyMessage.user) || !Internal.equals(this.extra, notifyMessage.extra) || !Internal.equals(this.notify_class, notifyMessage.notify_class)) {
                return false;
            }
            return true;
        }
    }

    public NotifyMessage(Common common2, String str, Long l, String str2, User user2, Extra extra2, Long l2) {
        this(common2, str, l, str2, user2, extra2, l2, ByteString.EMPTY);
    }

    public NotifyMessage(Common common2, String str, Long l, String str2, User user2, Extra extra2, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.schema = str;
        this.notify_type = l;
        this.content = str2;
        this.user = user2;
        this.extra = extra2;
        this.notify_class = l2;
    }
}
