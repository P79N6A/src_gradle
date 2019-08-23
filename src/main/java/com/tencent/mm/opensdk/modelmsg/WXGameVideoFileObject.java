package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.utils.Log;
import java.io.File;

public class WXGameVideoFileObject implements WXMediaMessage.IMediaObject {
    public String filePath;
    public String thumbUrl;
    public String videoUrl;

    public WXGameVideoFileObject() {
    }

    public WXGameVideoFileObject(String str, String str2, String str3) {
        this.filePath = str;
        this.videoUrl = str2;
        this.thumbUrl = str3;
    }

    private int getFileSize(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        File file = new File(str);
        if (!file.exists()) {
            return 0;
        }
        return (int) file.length();
    }

    public boolean checkArgs() {
        String str;
        String str2;
        if (this.filePath == null || this.filePath.length() == 0) {
            str = "MicroMsg.SDK.WXGameVideoFileObject";
            str2 = "checkArgs fail, filePath is null";
        } else if (getFileSize(this.filePath) > 10485760) {
            str = "MicroMsg.SDK.WXGameVideoFileObject";
            str2 = "checkArgs fail, video file size is too large";
        } else if (this.videoUrl != null && this.videoUrl.length() > 10240) {
            str = "MicroMsg.SDK.WXGameVideoFileObject";
            str2 = "checkArgs fail, videoUrl is too long";
        } else if (this.thumbUrl == null || this.thumbUrl.length() <= 10240) {
            return true;
        } else {
            str = "MicroMsg.SDK.WXGameVideoFileObject";
            str2 = "checkArgs fail, thumbUrl is too long";
        }
        Log.e(str, str2);
        return false;
    }

    public void serialize(Bundle bundle) {
        bundle.putString("_wxvideofileobject_filePath", this.filePath);
        bundle.putString("_wxvideofileobject_cdnUrl", this.videoUrl);
        bundle.putString("_wxvideofileobject_thumbUrl", this.thumbUrl);
    }

    public int type() {
        return 39;
    }

    public void unserialize(Bundle bundle) {
        this.filePath = bundle.getString("_wxvideofileobject_filePath");
        this.videoUrl = bundle.getString("_wxvideofileobject_cdnUrl");
        this.thumbUrl = bundle.getString("_wxvideofileobject_thumbUrl");
    }
}
