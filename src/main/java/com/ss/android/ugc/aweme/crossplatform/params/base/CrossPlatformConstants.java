package com.ss.android.ugc.aweme.crossplatform.params.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.C0906R;

public interface CrossPlatformConstants {

    public @interface Platform {
    }

    public enum a {
        refresh(C0906R.id.cct, "refresh"),
        copylink(C0906R.id.zw, "copylink"),
        openwithbrowser(C0906R.id.bv5, "openwithbrowser");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public int id;
        public String key;

        private a(int i, String str) {
            this.id = i;
            this.key = str;
        }
    }
}
