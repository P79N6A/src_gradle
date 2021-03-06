package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.utils.Log;
import java.io.File;

public class WXFileObject implements WXMediaMessage.IMediaObject {
    private int contentLengthLimit = 10485760;
    public byte[] fileData;
    public String filePath;

    public WXFileObject() {
    }

    public WXFileObject(String str) {
        this.filePath = str;
    }

    public WXFileObject(byte[] bArr) {
        this.fileData = bArr;
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
        if ((this.fileData == null || this.fileData.length == 0) && (this.filePath == null || this.filePath.length() == 0)) {
            str2 = "MicroMsg.SDK.WXFileObject";
            str = "checkArgs fail, both arguments is null";
        } else if (this.fileData != null && this.fileData.length > this.contentLengthLimit) {
            str2 = "MicroMsg.SDK.WXFileObject";
            str = "checkArgs fail, fileData is too large";
        } else if (this.filePath == null || getFileSize(this.filePath) <= this.contentLengthLimit) {
            return true;
        } else {
            str2 = "MicroMsg.SDK.WXFileObject";
            str = "checkArgs fail, fileSize is too large";
        }
        Log.e(str2, str);
        return false;
    }

    public void serialize(Bundle bundle) {
        bundle.putByteArray("_wxfileobject_fileData", this.fileData);
        bundle.putString("_wxfileobject_filePath", this.filePath);
    }

    public void setContentLengthLimit(int i) {
        this.contentLengthLimit = i;
    }

    public void setFileData(byte[] bArr) {
        this.fileData = bArr;
    }

    public void setFilePath(String str) {
        this.filePath = str;
    }

    public int type() {
        return 6;
    }

    public void unserialize(Bundle bundle) {
        this.fileData = bundle.getByteArray("_wxfileobject_fileData");
        this.filePath = bundle.getString("_wxfileobject_filePath");
    }
}
