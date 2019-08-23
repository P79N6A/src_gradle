package com.ss.android.ugc.aweme.global.config.settings._default;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.AssociativeEmoticonAll;
import com.ss.android.ugc.aweme.global.config.settings.pojo.FlipChatSettings;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;

public class SettingsGroup extends AbstractSettingsGroup {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void addOptionalObjectDefaultValue() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47607, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47607, new Class[0], Void.TYPE);
            return;
        }
        registerDefaultValue(new FlipChatSettings.Builder().main_switch(Boolean.FALSE).show_launch_page_popup(Boolean.FALSE).show_login_icon(Boolean.FALSE).show_msg_cell(Boolean.FALSE).build());
    }

    public void addDefaultValues(IESSettings.Builder builder) {
        IESSettings.Builder builder2 = builder;
        if (PatchProxy.isSupport(new Object[]{builder2}, this, changeQuickRedirect, false, 47606, new Class[]{IESSettings.Builder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{builder2}, this, changeQuickRedirect, false, 47606, new Class[]{IESSettings.Builder.class}, Void.TYPE);
            return;
        }
        builder2.add_device_fingerprint_open(1);
        builder2.fresh_animation(Boolean.FALSE);
        builder2.refresh_feed_del_history(Boolean.FALSE);
        builder2.close_login_agreement(0);
        builder2.anti_addiction_separation(0);
        builder2.anti_addiction_day_time(0);
        builder2.anti_addiction_night_time(0);
        builder2.anti_addiction_toast_time(0);
        builder2.show_prevent_download(Boolean.FALSE);
        builder2.has_weixin_suppress(Boolean.FALSE);
        builder2.show_creator_rewards(0);
        builder2.with_douplus_entry(Boolean.FALSE);
        builder2.close_sync_to_helo_entry(0);
        builder2.use_new_splash_view(Boolean.FALSE);
        builder2.im_associative_emoticon_all(new AssociativeEmoticonAll.Builder().show(0).sourceMessage("").build());
    }
}
