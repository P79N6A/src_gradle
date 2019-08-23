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

public final class ProAccountEnableDetailInfo extends Message<ProAccountEnableDetailInfo, Builder> {
    public static final DefaultValueProtoAdapter<ProAccountEnableDetailInfo> ADAPTER = new ProtoAdapter_ProAccountEnableDetailInfo();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct#ADAPTER", label = 2, tag = 3)
    public final List<CategoryStruct> category_list;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryPageTextStruct#ADAPTER", tag = 2)
    public final CategoryPageTextStruct category_page_text;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer is_proaccount_display;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.WelcomePageTextStruct#ADAPTER", label = 2, tag = 1)
    public final List<WelcomePageTextStruct> welcome_page_list;

    public static final class Builder extends Message.Builder<ProAccountEnableDetailInfo, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public List<CategoryStruct> category_list = Internal.newMutableList();
        public CategoryPageTextStruct category_page_text;
        public Integer is_proaccount_display;
        public List<WelcomePageTextStruct> welcome_page_list = Internal.newMutableList();

        public final ProAccountEnableDetailInfo build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48990, new Class[0], ProAccountEnableDetailInfo.class)) {
                return (ProAccountEnableDetailInfo) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48990, new Class[0], ProAccountEnableDetailInfo.class);
            }
            ProAccountEnableDetailInfo proAccountEnableDetailInfo = new ProAccountEnableDetailInfo(this.welcome_page_list, this.category_page_text, this.category_list, this.is_proaccount_display, super.buildUnknownFields());
            return proAccountEnableDetailInfo;
        }

        public final Builder category_page_text(CategoryPageTextStruct categoryPageTextStruct) {
            this.category_page_text = categoryPageTextStruct;
            return this;
        }

        public final Builder is_proaccount_display(Integer num) {
            this.is_proaccount_display = num;
            return this;
        }

        public final Builder category_list(List<CategoryStruct> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 48989, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 48989, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.category_list = list;
            return this;
        }

        public final Builder welcome_page_list(List<WelcomePageTextStruct> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 48988, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 48988, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.welcome_page_list = list;
            return this;
        }
    }

    static final class ProtoAdapter_ProAccountEnableDetailInfo extends DefaultValueProtoAdapter<ProAccountEnableDetailInfo> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final ProAccountEnableDetailInfo redact(ProAccountEnableDetailInfo proAccountEnableDetailInfo) {
            return proAccountEnableDetailInfo;
        }

        public ProtoAdapter_ProAccountEnableDetailInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, ProAccountEnableDetailInfo.class);
        }

        public final ProAccountEnableDetailInfo decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48993, new Class[]{ProtoReader.class}, ProAccountEnableDetailInfo.class)) {
                return decode(protoReader2, (ProAccountEnableDetailInfo) null);
            }
            return (ProAccountEnableDetailInfo) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48993, new Class[]{ProtoReader.class}, ProAccountEnableDetailInfo.class);
        }

        public final int encodedSize(ProAccountEnableDetailInfo proAccountEnableDetailInfo) {
            ProAccountEnableDetailInfo proAccountEnableDetailInfo2 = proAccountEnableDetailInfo;
            if (!PatchProxy.isSupport(new Object[]{proAccountEnableDetailInfo2}, this, changeQuickRedirect, false, 48991, new Class[]{ProAccountEnableDetailInfo.class}, Integer.TYPE)) {
                return WelcomePageTextStruct.ADAPTER.asRepeated().encodedSizeWithTag(1, proAccountEnableDetailInfo2.welcome_page_list) + CategoryPageTextStruct.ADAPTER.encodedSizeWithTag(2, proAccountEnableDetailInfo2.category_page_text) + CategoryStruct.ADAPTER.asRepeated().encodedSizeWithTag(3, proAccountEnableDetailInfo2.category_list) + ProtoAdapter.INT32.encodedSizeWithTag(4, proAccountEnableDetailInfo2.is_proaccount_display) + proAccountEnableDetailInfo.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{proAccountEnableDetailInfo2}, this, changeQuickRedirect, false, 48991, new Class[]{ProAccountEnableDetailInfo.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, ProAccountEnableDetailInfo proAccountEnableDetailInfo) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            ProAccountEnableDetailInfo proAccountEnableDetailInfo2 = proAccountEnableDetailInfo;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, proAccountEnableDetailInfo2}, this, changeQuickRedirect, false, 48992, new Class[]{ProtoWriter.class, ProAccountEnableDetailInfo.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, proAccountEnableDetailInfo2}, this, changeQuickRedirect, false, 48992, new Class[]{ProtoWriter.class, ProAccountEnableDetailInfo.class}, Void.TYPE);
                return;
            }
            WelcomePageTextStruct.ADAPTER.asRepeated().encodeWithTag(protoWriter2, 1, proAccountEnableDetailInfo2.welcome_page_list);
            CategoryPageTextStruct.ADAPTER.encodeWithTag(protoWriter2, 2, proAccountEnableDetailInfo2.category_page_text);
            CategoryStruct.ADAPTER.asRepeated().encodeWithTag(protoWriter2, 3, proAccountEnableDetailInfo2.category_list);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 4, proAccountEnableDetailInfo2.is_proaccount_display);
            protoWriter2.writeBytes(proAccountEnableDetailInfo.unknownFields());
        }

        public final ProAccountEnableDetailInfo decode(ProtoReader protoReader, ProAccountEnableDetailInfo proAccountEnableDetailInfo) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            ProAccountEnableDetailInfo proAccountEnableDetailInfo2 = proAccountEnableDetailInfo;
            if (PatchProxy.isSupport(new Object[]{protoReader2, proAccountEnableDetailInfo2}, this, changeQuickRedirect, false, 48994, new Class[]{ProtoReader.class, ProAccountEnableDetailInfo.class}, ProAccountEnableDetailInfo.class)) {
                return (ProAccountEnableDetailInfo) PatchProxy.accessDispatch(new Object[]{protoReader2, proAccountEnableDetailInfo2}, this, changeQuickRedirect, false, 48994, new Class[]{ProtoReader.class, ProAccountEnableDetailInfo.class}, ProAccountEnableDetailInfo.class);
            }
            ProAccountEnableDetailInfo proAccountEnableDetailInfo3 = (ProAccountEnableDetailInfo) a.a().a(ProAccountEnableDetailInfo.class, proAccountEnableDetailInfo2);
            if (proAccountEnableDetailInfo3 != null) {
                builder = proAccountEnableDetailInfo3.newBuilder();
            } else {
                builder = new Builder();
            }
            Builder builder2 = builder;
            List<WelcomePageTextStruct> newMutableList = Internal.newMutableList();
            List<CategoryStruct> newMutableList2 = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            newMutableList.add(WelcomePageTextStruct.ADAPTER.decode(protoReader2, a.a().a(WelcomePageTextStruct.class)));
                            break;
                        case 2:
                            builder2.category_page_text((CategoryPageTextStruct) CategoryPageTextStruct.ADAPTER.decode(protoReader2, builder2.category_page_text));
                            break;
                        case 3:
                            newMutableList2.add(CategoryStruct.ADAPTER.decode(protoReader2, a.a().a(CategoryStruct.class)));
                            break;
                        case 4:
                            builder2.is_proaccount_display((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (proAccountEnableDetailInfo3 != null) {
                                    break;
                                } else {
                                    throw e2;
                                }
                            }
                    }
                } else {
                    protoReader2.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder2.welcome_page_list = newMutableList;
                    }
                    if (!newMutableList2.isEmpty()) {
                        builder2.category_list = newMutableList2;
                    }
                    return builder2.build();
                }
            }
        }
    }

    public final List<CategoryStruct> getCategoryList() {
        return this.category_list;
    }

    public final List<WelcomePageTextStruct> getWelcomePageList() {
        return this.welcome_page_list;
    }

    @KtNullable
    public final CategoryPageTextStruct getCategoryPageText() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48982, new Class[0], CategoryPageTextStruct.class)) {
            return (CategoryPageTextStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48982, new Class[0], CategoryPageTextStruct.class);
        } else if (this.category_page_text != null) {
            return this.category_page_text;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getIsProaccountDisplay() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48983, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48983, new Class[0], Integer.class);
        } else if (this.is_proaccount_display != null) {
            return this.is_proaccount_display;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48986, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48986, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = ((unknownFields().hashCode() * 37) + this.welcome_page_list.hashCode()) * 37;
            if (this.category_page_text != null) {
                i = this.category_page_text.hashCode();
            } else {
                i = 0;
            }
            int hashCode2 = (((hashCode + i) * 37) + this.category_list.hashCode()) * 37;
            if (this.is_proaccount_display != null) {
                i2 = this.is_proaccount_display.hashCode();
            }
            i3 = hashCode2 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48984, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48984, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.welcome_page_list = Internal.copyOf("welcome_page_list", this.welcome_page_list);
        builder.category_page_text = this.category_page_text;
        builder.category_list = Internal.copyOf("category_list", this.category_list);
        builder.is_proaccount_display = this.is_proaccount_display;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48987, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48987, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (!this.welcome_page_list.isEmpty()) {
            sb.append(", welcome_page_list=");
            sb.append(this.welcome_page_list);
        }
        if (this.category_page_text != null) {
            sb.append(", category_page_text=");
            sb.append(this.category_page_text);
        }
        if (!this.category_list.isEmpty()) {
            sb.append(", category_list=");
            sb.append(this.category_list);
        }
        if (this.is_proaccount_display != null) {
            sb.append(", is_proaccount_display=");
            sb.append(this.is_proaccount_display);
        }
        StringBuilder replace = sb.replace(0, 2, "ProAccountEnableDetailInfo{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 48985, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 48985, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof ProAccountEnableDetailInfo)) {
                return false;
            }
            ProAccountEnableDetailInfo proAccountEnableDetailInfo = (ProAccountEnableDetailInfo) obj;
            if (!unknownFields().equals(proAccountEnableDetailInfo.unknownFields()) || !this.welcome_page_list.equals(proAccountEnableDetailInfo.welcome_page_list) || !Internal.equals(this.category_page_text, proAccountEnableDetailInfo.category_page_text) || !this.category_list.equals(proAccountEnableDetailInfo.category_list) || !Internal.equals(this.is_proaccount_display, proAccountEnableDetailInfo.is_proaccount_display)) {
                return false;
            }
            return true;
        }
    }

    public ProAccountEnableDetailInfo(List<WelcomePageTextStruct> list, CategoryPageTextStruct categoryPageTextStruct, List<CategoryStruct> list2, Integer num) {
        this(list, categoryPageTextStruct, list2, num, ByteString.EMPTY);
    }

    public ProAccountEnableDetailInfo(List<WelcomePageTextStruct> list, CategoryPageTextStruct categoryPageTextStruct, List<CategoryStruct> list2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.welcome_page_list = Internal.immutableCopyOf("welcome_page_list", list);
        this.category_page_text = categoryPageTextStruct;
        this.category_list = Internal.immutableCopyOf("category_list", list2);
        this.is_proaccount_display = num;
    }
}
