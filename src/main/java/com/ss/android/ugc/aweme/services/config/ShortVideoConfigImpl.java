package com.ss.android.ugc.aweme.services.config;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.services.IShortVideoConfig;
import com.ss.android.ugc.aweme.shortvideo.ea;
import com.ss.android.ugc.aweme.shortvideo.ff;

public class ShortVideoConfigImpl implements IShortVideoConfig {
    public static ChangeQuickRedirect changeQuickRedirect;

    public long maxDuetVideoTime() {
        return 60500;
    }

    public long maxRecordingTime() {
        return ea.f66827f;
    }

    public String suffixMix() {
        return "-mix-concat-a";
    }

    public String cacheDir() {
        return ff.p;
    }

    public String compatMusDraftDir() {
        return ff.z;
    }

    public String filterDir() {
        return ff.s;
    }

    public String musicDir() {
        return ff.u;
    }

    public String shortVideoRootDir() {
        return ff.f67717f;
    }

    public String stickerDir() {
        return ff.f67713b;
    }

    public String tempDir() {
        return ff.g;
    }
}
