package com.ss.android.ugc.aweme.framework.services;

import com.ss.android.ugc.aweme.tools.bb;
import java.util.List;

public interface IStickerService {

    public static class FaceSticker {
        public bb fileUrl;
        public String hint;
        public bb iconUrl;
        public int id;
        public String localPath;
        public String name;
        public long stickerId;
        public List<String> types;
    }
}
