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
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.c;
import java.io.IOException;
import okio.ByteString;

public final class IMXPlanSetting extends Message<IMXPlanSetting, Builder> {
    public static final DefaultValueProtoAdapter<IMXPlanSetting> ADAPTER = new ProtoAdapter_IMXPlanSetting();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String alert_install_title;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanUrlModel#ADAPTER", tag = 13)
    public final IMXPlanUrlModel b_chat_icon;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String chat_installed_x_button_title;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 11)
    public final String chat_msg_fixed_subtitle;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 12)
    public final Integer chat_msg_list_style;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String chat_no_installed_x_button_title;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanUrlModel#ADAPTER", tag = 9)
    public final IMXPlanUrlModel chat_no_unread_msg_icon;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public final String chat_no_unread_msg_title;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 10)
    public final Integer chat_subtitle_style;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String download_x_url;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanUrlModel#ADAPTER", tag = 14)
    public final IMXPlanUrlModel extra_icon_1;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanUrlModel#ADAPTER", tag = 15)
    public final IMXPlanUrlModel extra_icon_2;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanUrlModel#ADAPTER", tag = 16)
    public final IMXPlanUrlModel extra_icon_3;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanUrlModel#ADAPTER", tag = 17)
    public final IMXPlanUrlModel extra_icon_4;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanUrlModel#ADAPTER", tag = 18)
    public final IMXPlanUrlModel extra_icon_5;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanUrlModel#ADAPTER", tag = 19)
    public final IMXPlanUrlModel extra_icon_6;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanUrlModel#ADAPTER", tag = 20)
    public final IMXPlanUrlModel extra_icon_7;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanUrlModel#ADAPTER", tag = 21)
    public final IMXPlanUrlModel extra_icon_8;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String extra_str_1;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 30)
    public final String extra_str_10;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 22)
    public final String extra_str_2;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 23)
    public final String extra_str_3;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 24)
    public final String extra_str_4;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 25)
    public final String extra_str_5;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 26)
    public final String extra_str_6;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 27)
    public final String extra_str_7;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 28)
    public final String extra_str_8;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 29)
    public final String extra_str_9;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanUrlModel#ADAPTER", tag = 7)
    public final IMXPlanUrlModel profile_detail_msg_icon;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanUrlModel#ADAPTER", tag = 6)
    public final IMXPlanUrlModel profile_msg_icon;

    public static final class Builder extends Message.Builder<IMXPlanSetting, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String alert_install_title;
        public IMXPlanUrlModel b_chat_icon;
        public String chat_installed_x_button_title;
        public String chat_msg_fixed_subtitle;
        public Integer chat_msg_list_style;
        public String chat_no_installed_x_button_title;
        public IMXPlanUrlModel chat_no_unread_msg_icon;
        public String chat_no_unread_msg_title;
        public Integer chat_subtitle_style;
        public String download_x_url;
        public IMXPlanUrlModel extra_icon_1;
        public IMXPlanUrlModel extra_icon_2;
        public IMXPlanUrlModel extra_icon_3;
        public IMXPlanUrlModel extra_icon_4;
        public IMXPlanUrlModel extra_icon_5;
        public IMXPlanUrlModel extra_icon_6;
        public IMXPlanUrlModel extra_icon_7;
        public IMXPlanUrlModel extra_icon_8;
        public String extra_str_1;
        public String extra_str_10;
        public String extra_str_2;
        public String extra_str_3;
        public String extra_str_4;
        public String extra_str_5;
        public String extra_str_6;
        public String extra_str_7;
        public String extra_str_8;
        public String extra_str_9;
        public IMXPlanUrlModel profile_detail_msg_icon;
        public IMXPlanUrlModel profile_msg_icon;

        public final IMXPlanSetting build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48846, new Class[0], IMXPlanSetting.class)) {
                return new IMXPlanSetting(this, super.buildUnknownFields());
            }
            return (IMXPlanSetting) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48846, new Class[0], IMXPlanSetting.class);
        }

        public final Builder alert_install_title(String str) {
            this.alert_install_title = str;
            return this;
        }

        public final Builder b_chat_icon(IMXPlanUrlModel iMXPlanUrlModel) {
            this.b_chat_icon = iMXPlanUrlModel;
            return this;
        }

        public final Builder chat_installed_x_button_title(String str) {
            this.chat_installed_x_button_title = str;
            return this;
        }

        public final Builder chat_msg_fixed_subtitle(String str) {
            this.chat_msg_fixed_subtitle = str;
            return this;
        }

        public final Builder chat_msg_list_style(Integer num) {
            this.chat_msg_list_style = num;
            return this;
        }

        public final Builder chat_no_installed_x_button_title(String str) {
            this.chat_no_installed_x_button_title = str;
            return this;
        }

        public final Builder chat_no_unread_msg_icon(IMXPlanUrlModel iMXPlanUrlModel) {
            this.chat_no_unread_msg_icon = iMXPlanUrlModel;
            return this;
        }

        public final Builder chat_no_unread_msg_title(String str) {
            this.chat_no_unread_msg_title = str;
            return this;
        }

        public final Builder chat_subtitle_style(Integer num) {
            this.chat_subtitle_style = num;
            return this;
        }

        public final Builder download_x_url(String str) {
            this.download_x_url = str;
            return this;
        }

        public final Builder extra_icon_1(IMXPlanUrlModel iMXPlanUrlModel) {
            this.extra_icon_1 = iMXPlanUrlModel;
            return this;
        }

        public final Builder extra_icon_2(IMXPlanUrlModel iMXPlanUrlModel) {
            this.extra_icon_2 = iMXPlanUrlModel;
            return this;
        }

        public final Builder extra_icon_3(IMXPlanUrlModel iMXPlanUrlModel) {
            this.extra_icon_3 = iMXPlanUrlModel;
            return this;
        }

        public final Builder extra_icon_4(IMXPlanUrlModel iMXPlanUrlModel) {
            this.extra_icon_4 = iMXPlanUrlModel;
            return this;
        }

        public final Builder extra_icon_5(IMXPlanUrlModel iMXPlanUrlModel) {
            this.extra_icon_5 = iMXPlanUrlModel;
            return this;
        }

        public final Builder extra_icon_6(IMXPlanUrlModel iMXPlanUrlModel) {
            this.extra_icon_6 = iMXPlanUrlModel;
            return this;
        }

        public final Builder extra_icon_7(IMXPlanUrlModel iMXPlanUrlModel) {
            this.extra_icon_7 = iMXPlanUrlModel;
            return this;
        }

        public final Builder extra_icon_8(IMXPlanUrlModel iMXPlanUrlModel) {
            this.extra_icon_8 = iMXPlanUrlModel;
            return this;
        }

        public final Builder extra_str_1(String str) {
            this.extra_str_1 = str;
            return this;
        }

        public final Builder extra_str_10(String str) {
            this.extra_str_10 = str;
            return this;
        }

        public final Builder extra_str_2(String str) {
            this.extra_str_2 = str;
            return this;
        }

        public final Builder extra_str_3(String str) {
            this.extra_str_3 = str;
            return this;
        }

        public final Builder extra_str_4(String str) {
            this.extra_str_4 = str;
            return this;
        }

        public final Builder extra_str_5(String str) {
            this.extra_str_5 = str;
            return this;
        }

        public final Builder extra_str_6(String str) {
            this.extra_str_6 = str;
            return this;
        }

        public final Builder extra_str_7(String str) {
            this.extra_str_7 = str;
            return this;
        }

        public final Builder extra_str_8(String str) {
            this.extra_str_8 = str;
            return this;
        }

        public final Builder extra_str_9(String str) {
            this.extra_str_9 = str;
            return this;
        }

        public final Builder profile_detail_msg_icon(IMXPlanUrlModel iMXPlanUrlModel) {
            this.profile_detail_msg_icon = iMXPlanUrlModel;
            return this;
        }

        public final Builder profile_msg_icon(IMXPlanUrlModel iMXPlanUrlModel) {
            this.profile_msg_icon = iMXPlanUrlModel;
            return this;
        }
    }

    static final class ProtoAdapter_IMXPlanSetting extends DefaultValueProtoAdapter<IMXPlanSetting> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final IMXPlanSetting redact(IMXPlanSetting iMXPlanSetting) {
            return iMXPlanSetting;
        }

        public ProtoAdapter_IMXPlanSetting() {
            super(FieldEncoding.LENGTH_DELIMITED, IMXPlanSetting.class);
        }

        public final IMXPlanSetting decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48849, new Class[]{ProtoReader.class}, IMXPlanSetting.class)) {
                return decode(protoReader2, (IMXPlanSetting) null);
            }
            return (IMXPlanSetting) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48849, new Class[]{ProtoReader.class}, IMXPlanSetting.class);
        }

        public final int encodedSize(IMXPlanSetting iMXPlanSetting) {
            IMXPlanSetting iMXPlanSetting2 = iMXPlanSetting;
            if (!PatchProxy.isSupport(new Object[]{iMXPlanSetting2}, this, changeQuickRedirect, false, 48847, new Class[]{IMXPlanSetting.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, iMXPlanSetting2.extra_str_1) + ProtoAdapter.STRING.encodedSizeWithTag(2, iMXPlanSetting2.alert_install_title) + ProtoAdapter.STRING.encodedSizeWithTag(3, iMXPlanSetting2.download_x_url) + ProtoAdapter.STRING.encodedSizeWithTag(4, iMXPlanSetting2.chat_installed_x_button_title) + ProtoAdapter.STRING.encodedSizeWithTag(5, iMXPlanSetting2.chat_no_installed_x_button_title) + IMXPlanUrlModel.ADAPTER.encodedSizeWithTag(6, iMXPlanSetting2.profile_msg_icon) + IMXPlanUrlModel.ADAPTER.encodedSizeWithTag(7, iMXPlanSetting2.profile_detail_msg_icon) + ProtoAdapter.STRING.encodedSizeWithTag(8, iMXPlanSetting2.chat_no_unread_msg_title) + IMXPlanUrlModel.ADAPTER.encodedSizeWithTag(9, iMXPlanSetting2.chat_no_unread_msg_icon) + ProtoAdapter.INT32.encodedSizeWithTag(10, iMXPlanSetting2.chat_subtitle_style) + ProtoAdapter.STRING.encodedSizeWithTag(11, iMXPlanSetting2.chat_msg_fixed_subtitle) + ProtoAdapter.INT32.encodedSizeWithTag(12, iMXPlanSetting2.chat_msg_list_style) + IMXPlanUrlModel.ADAPTER.encodedSizeWithTag(13, iMXPlanSetting2.b_chat_icon) + IMXPlanUrlModel.ADAPTER.encodedSizeWithTag(14, iMXPlanSetting2.extra_icon_1) + IMXPlanUrlModel.ADAPTER.encodedSizeWithTag(15, iMXPlanSetting2.extra_icon_2) + IMXPlanUrlModel.ADAPTER.encodedSizeWithTag(16, iMXPlanSetting2.extra_icon_3) + IMXPlanUrlModel.ADAPTER.encodedSizeWithTag(17, iMXPlanSetting2.extra_icon_4) + IMXPlanUrlModel.ADAPTER.encodedSizeWithTag(18, iMXPlanSetting2.extra_icon_5) + IMXPlanUrlModel.ADAPTER.encodedSizeWithTag(19, iMXPlanSetting2.extra_icon_6) + IMXPlanUrlModel.ADAPTER.encodedSizeWithTag(20, iMXPlanSetting2.extra_icon_7) + IMXPlanUrlModel.ADAPTER.encodedSizeWithTag(21, iMXPlanSetting2.extra_icon_8) + ProtoAdapter.STRING.encodedSizeWithTag(22, iMXPlanSetting2.extra_str_2) + ProtoAdapter.STRING.encodedSizeWithTag(23, iMXPlanSetting2.extra_str_3) + ProtoAdapter.STRING.encodedSizeWithTag(24, iMXPlanSetting2.extra_str_4) + ProtoAdapter.STRING.encodedSizeWithTag(25, iMXPlanSetting2.extra_str_5) + ProtoAdapter.STRING.encodedSizeWithTag(26, iMXPlanSetting2.extra_str_6) + ProtoAdapter.STRING.encodedSizeWithTag(27, iMXPlanSetting2.extra_str_7) + ProtoAdapter.STRING.encodedSizeWithTag(28, iMXPlanSetting2.extra_str_8) + ProtoAdapter.STRING.encodedSizeWithTag(29, iMXPlanSetting2.extra_str_9) + ProtoAdapter.STRING.encodedSizeWithTag(30, iMXPlanSetting2.extra_str_10) + iMXPlanSetting.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{iMXPlanSetting2}, this, changeQuickRedirect, false, 48847, new Class[]{IMXPlanSetting.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, IMXPlanSetting iMXPlanSetting) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            IMXPlanSetting iMXPlanSetting2 = iMXPlanSetting;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, iMXPlanSetting2}, this, changeQuickRedirect, false, 48848, new Class[]{ProtoWriter.class, IMXPlanSetting.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, iMXPlanSetting2}, this, changeQuickRedirect, false, 48848, new Class[]{ProtoWriter.class, IMXPlanSetting.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, iMXPlanSetting2.extra_str_1);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, iMXPlanSetting2.alert_install_title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, iMXPlanSetting2.download_x_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, iMXPlanSetting2.chat_installed_x_button_title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 5, iMXPlanSetting2.chat_no_installed_x_button_title);
            IMXPlanUrlModel.ADAPTER.encodeWithTag(protoWriter2, 6, iMXPlanSetting2.profile_msg_icon);
            IMXPlanUrlModel.ADAPTER.encodeWithTag(protoWriter2, 7, iMXPlanSetting2.profile_detail_msg_icon);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 8, iMXPlanSetting2.chat_no_unread_msg_title);
            IMXPlanUrlModel.ADAPTER.encodeWithTag(protoWriter2, 9, iMXPlanSetting2.chat_no_unread_msg_icon);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 10, iMXPlanSetting2.chat_subtitle_style);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 11, iMXPlanSetting2.chat_msg_fixed_subtitle);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 12, iMXPlanSetting2.chat_msg_list_style);
            IMXPlanUrlModel.ADAPTER.encodeWithTag(protoWriter2, 13, iMXPlanSetting2.b_chat_icon);
            IMXPlanUrlModel.ADAPTER.encodeWithTag(protoWriter2, 14, iMXPlanSetting2.extra_icon_1);
            IMXPlanUrlModel.ADAPTER.encodeWithTag(protoWriter2, 15, iMXPlanSetting2.extra_icon_2);
            IMXPlanUrlModel.ADAPTER.encodeWithTag(protoWriter2, 16, iMXPlanSetting2.extra_icon_3);
            IMXPlanUrlModel.ADAPTER.encodeWithTag(protoWriter2, 17, iMXPlanSetting2.extra_icon_4);
            IMXPlanUrlModel.ADAPTER.encodeWithTag(protoWriter2, 18, iMXPlanSetting2.extra_icon_5);
            IMXPlanUrlModel.ADAPTER.encodeWithTag(protoWriter2, 19, iMXPlanSetting2.extra_icon_6);
            IMXPlanUrlModel.ADAPTER.encodeWithTag(protoWriter2, 20, iMXPlanSetting2.extra_icon_7);
            IMXPlanUrlModel.ADAPTER.encodeWithTag(protoWriter2, 21, iMXPlanSetting2.extra_icon_8);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 22, iMXPlanSetting2.extra_str_2);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 23, iMXPlanSetting2.extra_str_3);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 24, iMXPlanSetting2.extra_str_4);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 25, iMXPlanSetting2.extra_str_5);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 26, iMXPlanSetting2.extra_str_6);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 27, iMXPlanSetting2.extra_str_7);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 28, iMXPlanSetting2.extra_str_8);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 29, iMXPlanSetting2.extra_str_9);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 30, iMXPlanSetting2.extra_str_10);
            protoWriter2.writeBytes(iMXPlanSetting.unknownFields());
        }

        public final IMXPlanSetting decode(ProtoReader protoReader, IMXPlanSetting iMXPlanSetting) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            IMXPlanSetting iMXPlanSetting2 = iMXPlanSetting;
            if (PatchProxy.isSupport(new Object[]{protoReader2, iMXPlanSetting2}, this, changeQuickRedirect, false, 48850, new Class[]{ProtoReader.class, IMXPlanSetting.class}, IMXPlanSetting.class)) {
                return (IMXPlanSetting) PatchProxy.accessDispatch(new Object[]{protoReader2, iMXPlanSetting2}, this, changeQuickRedirect, false, 48850, new Class[]{ProtoReader.class, IMXPlanSetting.class}, IMXPlanSetting.class);
            }
            IMXPlanSetting iMXPlanSetting3 = (IMXPlanSetting) a.a().a(IMXPlanSetting.class, iMXPlanSetting2);
            if (iMXPlanSetting3 != null) {
                builder = iMXPlanSetting3.newBuilder();
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
                            builder2.extra_str_1((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 2:
                            builder2.alert_install_title((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 3:
                            builder2.download_x_url((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 4:
                            builder2.chat_installed_x_button_title((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 5:
                            builder2.chat_no_installed_x_button_title((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 6:
                            builder2.profile_msg_icon((IMXPlanUrlModel) IMXPlanUrlModel.ADAPTER.decode(protoReader2, builder2.profile_msg_icon));
                            break;
                        case e.l:
                            builder2.profile_detail_msg_icon((IMXPlanUrlModel) IMXPlanUrlModel.ADAPTER.decode(protoReader2, builder2.profile_detail_msg_icon));
                            break;
                        case 8:
                            builder2.chat_no_unread_msg_title((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 9:
                            builder2.chat_no_unread_msg_icon((IMXPlanUrlModel) IMXPlanUrlModel.ADAPTER.decode(protoReader2, builder2.chat_no_unread_msg_icon));
                            break;
                        case 10:
                            builder2.chat_subtitle_style((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 11:
                            builder2.chat_msg_fixed_subtitle((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case SearchNilInfo.HIT_TYPE_SENSITIVE:
                            builder2.chat_msg_list_style((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 13:
                            builder2.b_chat_icon((IMXPlanUrlModel) IMXPlanUrlModel.ADAPTER.decode(protoReader2, builder2.b_chat_icon));
                            break;
                        case 14:
                            builder2.extra_icon_1((IMXPlanUrlModel) IMXPlanUrlModel.ADAPTER.decode(protoReader2, builder2.extra_icon_1));
                            break;
                        case 15:
                            builder2.extra_icon_2((IMXPlanUrlModel) IMXPlanUrlModel.ADAPTER.decode(protoReader2, builder2.extra_icon_2));
                            break;
                        case SearchJediMixFeedAdapter.f42514c:
                            builder2.extra_icon_3((IMXPlanUrlModel) IMXPlanUrlModel.ADAPTER.decode(protoReader2, builder2.extra_icon_3));
                            break;
                        case 17:
                            builder2.extra_icon_4((IMXPlanUrlModel) IMXPlanUrlModel.ADAPTER.decode(protoReader2, builder2.extra_icon_4));
                            break;
                        case 18:
                            builder2.extra_icon_5((IMXPlanUrlModel) IMXPlanUrlModel.ADAPTER.decode(protoReader2, builder2.extra_icon_5));
                            break;
                        case 19:
                            builder2.extra_icon_6((IMXPlanUrlModel) IMXPlanUrlModel.ADAPTER.decode(protoReader2, builder2.extra_icon_6));
                            break;
                        case 20:
                            builder2.extra_icon_7((IMXPlanUrlModel) IMXPlanUrlModel.ADAPTER.decode(protoReader2, builder2.extra_icon_7));
                            break;
                        case 21:
                            builder2.extra_icon_8((IMXPlanUrlModel) IMXPlanUrlModel.ADAPTER.decode(protoReader2, builder2.extra_icon_8));
                            break;
                        case 22:
                            builder2.extra_str_2((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 23:
                            builder2.extra_str_3((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 24:
                            builder2.extra_str_4((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 25:
                            builder2.extra_str_5((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 26:
                            builder2.extra_str_6((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 27:
                            builder2.extra_str_7((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 28:
                            builder2.extra_str_8((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 29:
                            builder2.extra_str_9((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case c.f69366e /*?: ONE_ARG  (30 int)*/:
                            builder2.extra_str_10((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (iMXPlanSetting3 != null) {
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
    public final String getAlertInstallTitle() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48813, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48813, new Class[0], String.class);
        } else if (this.alert_install_title != null) {
            return this.alert_install_title;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final IMXPlanUrlModel getBChatIcon() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48824, new Class[0], IMXPlanUrlModel.class)) {
            return (IMXPlanUrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48824, new Class[0], IMXPlanUrlModel.class);
        } else if (this.b_chat_icon != null) {
            return this.b_chat_icon;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getChatInstalledXButtonTitle() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48815, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48815, new Class[0], String.class);
        } else if (this.chat_installed_x_button_title != null) {
            return this.chat_installed_x_button_title;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getChatMsgFixedSubtitle() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48822, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48822, new Class[0], String.class);
        } else if (this.chat_msg_fixed_subtitle != null) {
            return this.chat_msg_fixed_subtitle;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getChatMsgListStyle() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48823, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48823, new Class[0], Integer.class);
        } else if (this.chat_msg_list_style != null) {
            return this.chat_msg_list_style;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getChatNoInstalledXButtonTitle() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48816, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48816, new Class[0], String.class);
        } else if (this.chat_no_installed_x_button_title != null) {
            return this.chat_no_installed_x_button_title;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final IMXPlanUrlModel getChatNoUnreadMsgIcon() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48820, new Class[0], IMXPlanUrlModel.class)) {
            return (IMXPlanUrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48820, new Class[0], IMXPlanUrlModel.class);
        } else if (this.chat_no_unread_msg_icon != null) {
            return this.chat_no_unread_msg_icon;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getChatNoUnreadMsgTitle() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48819, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48819, new Class[0], String.class);
        } else if (this.chat_no_unread_msg_title != null) {
            return this.chat_no_unread_msg_title;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getChatSubtitleStyle() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48821, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48821, new Class[0], Integer.class);
        } else if (this.chat_subtitle_style != null) {
            return this.chat_subtitle_style;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getDownloadXUrl() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48814, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48814, new Class[0], String.class);
        } else if (this.download_x_url != null) {
            return this.download_x_url;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final IMXPlanUrlModel getExtraIcon1() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48825, new Class[0], IMXPlanUrlModel.class)) {
            return (IMXPlanUrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48825, new Class[0], IMXPlanUrlModel.class);
        } else if (this.extra_icon_1 != null) {
            return this.extra_icon_1;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final IMXPlanUrlModel getExtraIcon2() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48826, new Class[0], IMXPlanUrlModel.class)) {
            return (IMXPlanUrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48826, new Class[0], IMXPlanUrlModel.class);
        } else if (this.extra_icon_2 != null) {
            return this.extra_icon_2;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final IMXPlanUrlModel getExtraIcon3() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48827, new Class[0], IMXPlanUrlModel.class)) {
            return (IMXPlanUrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48827, new Class[0], IMXPlanUrlModel.class);
        } else if (this.extra_icon_3 != null) {
            return this.extra_icon_3;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final IMXPlanUrlModel getExtraIcon4() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48828, new Class[0], IMXPlanUrlModel.class)) {
            return (IMXPlanUrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48828, new Class[0], IMXPlanUrlModel.class);
        } else if (this.extra_icon_4 != null) {
            return this.extra_icon_4;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final IMXPlanUrlModel getExtraIcon5() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48829, new Class[0], IMXPlanUrlModel.class)) {
            return (IMXPlanUrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48829, new Class[0], IMXPlanUrlModel.class);
        } else if (this.extra_icon_5 != null) {
            return this.extra_icon_5;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final IMXPlanUrlModel getExtraIcon6() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48830, new Class[0], IMXPlanUrlModel.class)) {
            return (IMXPlanUrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48830, new Class[0], IMXPlanUrlModel.class);
        } else if (this.extra_icon_6 != null) {
            return this.extra_icon_6;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final IMXPlanUrlModel getExtraIcon7() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48831, new Class[0], IMXPlanUrlModel.class)) {
            return (IMXPlanUrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48831, new Class[0], IMXPlanUrlModel.class);
        } else if (this.extra_icon_7 != null) {
            return this.extra_icon_7;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final IMXPlanUrlModel getExtraIcon8() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48832, new Class[0], IMXPlanUrlModel.class)) {
            return (IMXPlanUrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48832, new Class[0], IMXPlanUrlModel.class);
        } else if (this.extra_icon_8 != null) {
            return this.extra_icon_8;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getExtraStr1() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48812, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48812, new Class[0], String.class);
        } else if (this.extra_str_1 != null) {
            return this.extra_str_1;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getExtraStr10() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48841, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48841, new Class[0], String.class);
        } else if (this.extra_str_10 != null) {
            return this.extra_str_10;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getExtraStr2() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48833, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48833, new Class[0], String.class);
        } else if (this.extra_str_2 != null) {
            return this.extra_str_2;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getExtraStr3() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48834, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48834, new Class[0], String.class);
        } else if (this.extra_str_3 != null) {
            return this.extra_str_3;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getExtraStr4() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48835, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48835, new Class[0], String.class);
        } else if (this.extra_str_4 != null) {
            return this.extra_str_4;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getExtraStr5() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48836, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48836, new Class[0], String.class);
        } else if (this.extra_str_5 != null) {
            return this.extra_str_5;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getExtraStr6() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48837, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48837, new Class[0], String.class);
        } else if (this.extra_str_6 != null) {
            return this.extra_str_6;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getExtraStr7() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48838, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48838, new Class[0], String.class);
        } else if (this.extra_str_7 != null) {
            return this.extra_str_7;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getExtraStr8() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48839, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48839, new Class[0], String.class);
        } else if (this.extra_str_8 != null) {
            return this.extra_str_8;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getExtraStr9() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48840, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48840, new Class[0], String.class);
        } else if (this.extra_str_9 != null) {
            return this.extra_str_9;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final IMXPlanUrlModel getProfileDetailMsgIcon() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48818, new Class[0], IMXPlanUrlModel.class)) {
            return (IMXPlanUrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48818, new Class[0], IMXPlanUrlModel.class);
        } else if (this.profile_detail_msg_icon != null) {
            return this.profile_detail_msg_icon;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final IMXPlanUrlModel getProfileMsgIcon() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48817, new Class[0], IMXPlanUrlModel.class)) {
            return (IMXPlanUrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48817, new Class[0], IMXPlanUrlModel.class);
        } else if (this.profile_msg_icon != null) {
            return this.profile_msg_icon;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48842, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48842, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.extra_str_1 = this.extra_str_1;
        builder.alert_install_title = this.alert_install_title;
        builder.download_x_url = this.download_x_url;
        builder.chat_installed_x_button_title = this.chat_installed_x_button_title;
        builder.chat_no_installed_x_button_title = this.chat_no_installed_x_button_title;
        builder.profile_msg_icon = this.profile_msg_icon;
        builder.profile_detail_msg_icon = this.profile_detail_msg_icon;
        builder.chat_no_unread_msg_title = this.chat_no_unread_msg_title;
        builder.chat_no_unread_msg_icon = this.chat_no_unread_msg_icon;
        builder.chat_subtitle_style = this.chat_subtitle_style;
        builder.chat_msg_fixed_subtitle = this.chat_msg_fixed_subtitle;
        builder.chat_msg_list_style = this.chat_msg_list_style;
        builder.b_chat_icon = this.b_chat_icon;
        builder.extra_icon_1 = this.extra_icon_1;
        builder.extra_icon_2 = this.extra_icon_2;
        builder.extra_icon_3 = this.extra_icon_3;
        builder.extra_icon_4 = this.extra_icon_4;
        builder.extra_icon_5 = this.extra_icon_5;
        builder.extra_icon_6 = this.extra_icon_6;
        builder.extra_icon_7 = this.extra_icon_7;
        builder.extra_icon_8 = this.extra_icon_8;
        builder.extra_str_2 = this.extra_str_2;
        builder.extra_str_3 = this.extra_str_3;
        builder.extra_str_4 = this.extra_str_4;
        builder.extra_str_5 = this.extra_str_5;
        builder.extra_str_6 = this.extra_str_6;
        builder.extra_str_7 = this.extra_str_7;
        builder.extra_str_8 = this.extra_str_8;
        builder.extra_str_9 = this.extra_str_9;
        builder.extra_str_10 = this.extra_str_10;
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
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48844, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48844, new Class[0], Integer.TYPE)).intValue();
        }
        int i31 = this.hashCode;
        if (i31 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.extra_str_1 != null) {
                i = this.extra_str_1.hashCode();
            } else {
                i = 0;
            }
            int i32 = (hashCode + i) * 37;
            if (this.alert_install_title != null) {
                i2 = this.alert_install_title.hashCode();
            } else {
                i2 = 0;
            }
            int i33 = (i32 + i2) * 37;
            if (this.download_x_url != null) {
                i3 = this.download_x_url.hashCode();
            } else {
                i3 = 0;
            }
            int i34 = (i33 + i3) * 37;
            if (this.chat_installed_x_button_title != null) {
                i4 = this.chat_installed_x_button_title.hashCode();
            } else {
                i4 = 0;
            }
            int i35 = (i34 + i4) * 37;
            if (this.chat_no_installed_x_button_title != null) {
                i5 = this.chat_no_installed_x_button_title.hashCode();
            } else {
                i5 = 0;
            }
            int i36 = (i35 + i5) * 37;
            if (this.profile_msg_icon != null) {
                i6 = this.profile_msg_icon.hashCode();
            } else {
                i6 = 0;
            }
            int i37 = (i36 + i6) * 37;
            if (this.profile_detail_msg_icon != null) {
                i7 = this.profile_detail_msg_icon.hashCode();
            } else {
                i7 = 0;
            }
            int i38 = (i37 + i7) * 37;
            if (this.chat_no_unread_msg_title != null) {
                i8 = this.chat_no_unread_msg_title.hashCode();
            } else {
                i8 = 0;
            }
            int i39 = (i38 + i8) * 37;
            if (this.chat_no_unread_msg_icon != null) {
                i9 = this.chat_no_unread_msg_icon.hashCode();
            } else {
                i9 = 0;
            }
            int i40 = (i39 + i9) * 37;
            if (this.chat_subtitle_style != null) {
                i10 = this.chat_subtitle_style.hashCode();
            } else {
                i10 = 0;
            }
            int i41 = (i40 + i10) * 37;
            if (this.chat_msg_fixed_subtitle != null) {
                i11 = this.chat_msg_fixed_subtitle.hashCode();
            } else {
                i11 = 0;
            }
            int i42 = (i41 + i11) * 37;
            if (this.chat_msg_list_style != null) {
                i12 = this.chat_msg_list_style.hashCode();
            } else {
                i12 = 0;
            }
            int i43 = (i42 + i12) * 37;
            if (this.b_chat_icon != null) {
                i13 = this.b_chat_icon.hashCode();
            } else {
                i13 = 0;
            }
            int i44 = (i43 + i13) * 37;
            if (this.extra_icon_1 != null) {
                i14 = this.extra_icon_1.hashCode();
            } else {
                i14 = 0;
            }
            int i45 = (i44 + i14) * 37;
            if (this.extra_icon_2 != null) {
                i15 = this.extra_icon_2.hashCode();
            } else {
                i15 = 0;
            }
            int i46 = (i45 + i15) * 37;
            if (this.extra_icon_3 != null) {
                i16 = this.extra_icon_3.hashCode();
            } else {
                i16 = 0;
            }
            int i47 = (i46 + i16) * 37;
            if (this.extra_icon_4 != null) {
                i17 = this.extra_icon_4.hashCode();
            } else {
                i17 = 0;
            }
            int i48 = (i47 + i17) * 37;
            if (this.extra_icon_5 != null) {
                i18 = this.extra_icon_5.hashCode();
            } else {
                i18 = 0;
            }
            int i49 = (i48 + i18) * 37;
            if (this.extra_icon_6 != null) {
                i19 = this.extra_icon_6.hashCode();
            } else {
                i19 = 0;
            }
            int i50 = (i49 + i19) * 37;
            if (this.extra_icon_7 != null) {
                i20 = this.extra_icon_7.hashCode();
            } else {
                i20 = 0;
            }
            int i51 = (i50 + i20) * 37;
            if (this.extra_icon_8 != null) {
                i21 = this.extra_icon_8.hashCode();
            } else {
                i21 = 0;
            }
            int i52 = (i51 + i21) * 37;
            if (this.extra_str_2 != null) {
                i22 = this.extra_str_2.hashCode();
            } else {
                i22 = 0;
            }
            int i53 = (i52 + i22) * 37;
            if (this.extra_str_3 != null) {
                i23 = this.extra_str_3.hashCode();
            } else {
                i23 = 0;
            }
            int i54 = (i53 + i23) * 37;
            if (this.extra_str_4 != null) {
                i24 = this.extra_str_4.hashCode();
            } else {
                i24 = 0;
            }
            int i55 = (i54 + i24) * 37;
            if (this.extra_str_5 != null) {
                i25 = this.extra_str_5.hashCode();
            } else {
                i25 = 0;
            }
            int i56 = (i55 + i25) * 37;
            if (this.extra_str_6 != null) {
                i26 = this.extra_str_6.hashCode();
            } else {
                i26 = 0;
            }
            int i57 = (i56 + i26) * 37;
            if (this.extra_str_7 != null) {
                i27 = this.extra_str_7.hashCode();
            } else {
                i27 = 0;
            }
            int i58 = (i57 + i27) * 37;
            if (this.extra_str_8 != null) {
                i28 = this.extra_str_8.hashCode();
            } else {
                i28 = 0;
            }
            int i59 = (i58 + i28) * 37;
            if (this.extra_str_9 != null) {
                i29 = this.extra_str_9.hashCode();
            } else {
                i29 = 0;
            }
            int i60 = (i59 + i29) * 37;
            if (this.extra_str_10 != null) {
                i30 = this.extra_str_10.hashCode();
            }
            i31 = i60 + i30;
            this.hashCode = i31;
        }
        return i31;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48845, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48845, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.extra_str_1 != null) {
            sb.append(", extra_str_1=");
            sb.append(this.extra_str_1);
        }
        if (this.alert_install_title != null) {
            sb.append(", alert_install_title=");
            sb.append(this.alert_install_title);
        }
        if (this.download_x_url != null) {
            sb.append(", download_x_url=");
            sb.append(this.download_x_url);
        }
        if (this.chat_installed_x_button_title != null) {
            sb.append(", chat_installed_x_button_title=");
            sb.append(this.chat_installed_x_button_title);
        }
        if (this.chat_no_installed_x_button_title != null) {
            sb.append(", chat_no_installed_x_button_title=");
            sb.append(this.chat_no_installed_x_button_title);
        }
        if (this.profile_msg_icon != null) {
            sb.append(", profile_msg_icon=");
            sb.append(this.profile_msg_icon);
        }
        if (this.profile_detail_msg_icon != null) {
            sb.append(", profile_detail_msg_icon=");
            sb.append(this.profile_detail_msg_icon);
        }
        if (this.chat_no_unread_msg_title != null) {
            sb.append(", chat_no_unread_msg_title=");
            sb.append(this.chat_no_unread_msg_title);
        }
        if (this.chat_no_unread_msg_icon != null) {
            sb.append(", chat_no_unread_msg_icon=");
            sb.append(this.chat_no_unread_msg_icon);
        }
        if (this.chat_subtitle_style != null) {
            sb.append(", chat_subtitle_style=");
            sb.append(this.chat_subtitle_style);
        }
        if (this.chat_msg_fixed_subtitle != null) {
            sb.append(", chat_msg_fixed_subtitle=");
            sb.append(this.chat_msg_fixed_subtitle);
        }
        if (this.chat_msg_list_style != null) {
            sb.append(", chat_msg_list_style=");
            sb.append(this.chat_msg_list_style);
        }
        if (this.b_chat_icon != null) {
            sb.append(", b_chat_icon=");
            sb.append(this.b_chat_icon);
        }
        if (this.extra_icon_1 != null) {
            sb.append(", extra_icon_1=");
            sb.append(this.extra_icon_1);
        }
        if (this.extra_icon_2 != null) {
            sb.append(", extra_icon_2=");
            sb.append(this.extra_icon_2);
        }
        if (this.extra_icon_3 != null) {
            sb.append(", extra_icon_3=");
            sb.append(this.extra_icon_3);
        }
        if (this.extra_icon_4 != null) {
            sb.append(", extra_icon_4=");
            sb.append(this.extra_icon_4);
        }
        if (this.extra_icon_5 != null) {
            sb.append(", extra_icon_5=");
            sb.append(this.extra_icon_5);
        }
        if (this.extra_icon_6 != null) {
            sb.append(", extra_icon_6=");
            sb.append(this.extra_icon_6);
        }
        if (this.extra_icon_7 != null) {
            sb.append(", extra_icon_7=");
            sb.append(this.extra_icon_7);
        }
        if (this.extra_icon_8 != null) {
            sb.append(", extra_icon_8=");
            sb.append(this.extra_icon_8);
        }
        if (this.extra_str_2 != null) {
            sb.append(", extra_str_2=");
            sb.append(this.extra_str_2);
        }
        if (this.extra_str_3 != null) {
            sb.append(", extra_str_3=");
            sb.append(this.extra_str_3);
        }
        if (this.extra_str_4 != null) {
            sb.append(", extra_str_4=");
            sb.append(this.extra_str_4);
        }
        if (this.extra_str_5 != null) {
            sb.append(", extra_str_5=");
            sb.append(this.extra_str_5);
        }
        if (this.extra_str_6 != null) {
            sb.append(", extra_str_6=");
            sb.append(this.extra_str_6);
        }
        if (this.extra_str_7 != null) {
            sb.append(", extra_str_7=");
            sb.append(this.extra_str_7);
        }
        if (this.extra_str_8 != null) {
            sb.append(", extra_str_8=");
            sb.append(this.extra_str_8);
        }
        if (this.extra_str_9 != null) {
            sb.append(", extra_str_9=");
            sb.append(this.extra_str_9);
        }
        if (this.extra_str_10 != null) {
            sb.append(", extra_str_10=");
            sb.append(this.extra_str_10);
        }
        StringBuilder replace = sb.replace(0, 2, "IMXPlanSetting{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 48843, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 48843, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof IMXPlanSetting)) {
                return false;
            }
            IMXPlanSetting iMXPlanSetting = (IMXPlanSetting) obj;
            if (!unknownFields().equals(iMXPlanSetting.unknownFields()) || !Internal.equals(this.extra_str_1, iMXPlanSetting.extra_str_1) || !Internal.equals(this.alert_install_title, iMXPlanSetting.alert_install_title) || !Internal.equals(this.download_x_url, iMXPlanSetting.download_x_url) || !Internal.equals(this.chat_installed_x_button_title, iMXPlanSetting.chat_installed_x_button_title) || !Internal.equals(this.chat_no_installed_x_button_title, iMXPlanSetting.chat_no_installed_x_button_title) || !Internal.equals(this.profile_msg_icon, iMXPlanSetting.profile_msg_icon) || !Internal.equals(this.profile_detail_msg_icon, iMXPlanSetting.profile_detail_msg_icon) || !Internal.equals(this.chat_no_unread_msg_title, iMXPlanSetting.chat_no_unread_msg_title) || !Internal.equals(this.chat_no_unread_msg_icon, iMXPlanSetting.chat_no_unread_msg_icon) || !Internal.equals(this.chat_subtitle_style, iMXPlanSetting.chat_subtitle_style) || !Internal.equals(this.chat_msg_fixed_subtitle, iMXPlanSetting.chat_msg_fixed_subtitle) || !Internal.equals(this.chat_msg_list_style, iMXPlanSetting.chat_msg_list_style) || !Internal.equals(this.b_chat_icon, iMXPlanSetting.b_chat_icon) || !Internal.equals(this.extra_icon_1, iMXPlanSetting.extra_icon_1) || !Internal.equals(this.extra_icon_2, iMXPlanSetting.extra_icon_2) || !Internal.equals(this.extra_icon_3, iMXPlanSetting.extra_icon_3) || !Internal.equals(this.extra_icon_4, iMXPlanSetting.extra_icon_4) || !Internal.equals(this.extra_icon_5, iMXPlanSetting.extra_icon_5) || !Internal.equals(this.extra_icon_6, iMXPlanSetting.extra_icon_6) || !Internal.equals(this.extra_icon_7, iMXPlanSetting.extra_icon_7) || !Internal.equals(this.extra_icon_8, iMXPlanSetting.extra_icon_8) || !Internal.equals(this.extra_str_2, iMXPlanSetting.extra_str_2) || !Internal.equals(this.extra_str_3, iMXPlanSetting.extra_str_3) || !Internal.equals(this.extra_str_4, iMXPlanSetting.extra_str_4) || !Internal.equals(this.extra_str_5, iMXPlanSetting.extra_str_5) || !Internal.equals(this.extra_str_6, iMXPlanSetting.extra_str_6) || !Internal.equals(this.extra_str_7, iMXPlanSetting.extra_str_7) || !Internal.equals(this.extra_str_8, iMXPlanSetting.extra_str_8) || !Internal.equals(this.extra_str_9, iMXPlanSetting.extra_str_9) || !Internal.equals(this.extra_str_10, iMXPlanSetting.extra_str_10)) {
                return false;
            }
            return true;
        }
    }

    public IMXPlanSetting(Builder builder, ByteString byteString) {
        super(ADAPTER, byteString);
        this.extra_str_1 = builder.extra_str_1;
        this.alert_install_title = builder.alert_install_title;
        this.download_x_url = builder.download_x_url;
        this.chat_installed_x_button_title = builder.chat_installed_x_button_title;
        this.chat_no_installed_x_button_title = builder.chat_no_installed_x_button_title;
        this.profile_msg_icon = builder.profile_msg_icon;
        this.profile_detail_msg_icon = builder.profile_detail_msg_icon;
        this.chat_no_unread_msg_title = builder.chat_no_unread_msg_title;
        this.chat_no_unread_msg_icon = builder.chat_no_unread_msg_icon;
        this.chat_subtitle_style = builder.chat_subtitle_style;
        this.chat_msg_fixed_subtitle = builder.chat_msg_fixed_subtitle;
        this.chat_msg_list_style = builder.chat_msg_list_style;
        this.b_chat_icon = builder.b_chat_icon;
        this.extra_icon_1 = builder.extra_icon_1;
        this.extra_icon_2 = builder.extra_icon_2;
        this.extra_icon_3 = builder.extra_icon_3;
        this.extra_icon_4 = builder.extra_icon_4;
        this.extra_icon_5 = builder.extra_icon_5;
        this.extra_icon_6 = builder.extra_icon_6;
        this.extra_icon_7 = builder.extra_icon_7;
        this.extra_icon_8 = builder.extra_icon_8;
        this.extra_str_2 = builder.extra_str_2;
        this.extra_str_3 = builder.extra_str_3;
        this.extra_str_4 = builder.extra_str_4;
        this.extra_str_5 = builder.extra_str_5;
        this.extra_str_6 = builder.extra_str_6;
        this.extra_str_7 = builder.extra_str_7;
        this.extra_str_8 = builder.extra_str_8;
        this.extra_str_9 = builder.extra_str_9;
        this.extra_str_10 = builder.extra_str_10;
    }
}
