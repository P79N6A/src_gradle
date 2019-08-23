package com.ss.android.ugc.aweme.shortvideo.upload;

import com.meituan.robust.ChangeQuickRedirect;

public final class e {

    public enum a {
        CONSUME_DONE,
        CONSUME_WAIT_DATA,
        CONSUME_FAIL,
        CONSUME_END;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public enum b {
        GET_HEADER_SIZE_WAIT,
        GET_HEADER_SIZE_DONE;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public enum c {
        UPLOAD_FINISH,
        UPLOAD_CANCEL,
        UPLOADING;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }
}
