package com.bytedance.im.core.d;

import android.net.Uri;
import com.bytedance.im.core.b.e.b;
import java.io.File;
import java.io.Serializable;
import java.util.Map;

public final class a implements Serializable {
    private String displayType;
    private Map<String, String> ext;
    private String hash;
    private int index;
    private long length;
    private String localPath;
    private String mimeType;
    private String msgUuid;
    private String remoteUrl;
    private int status;
    private String type;
    private int uploadProgress;

    public final String getDisplayType() {
        return this.displayType;
    }

    public final Map<String, String> getExt() {
        return this.ext;
    }

    public final String getHash() {
        return this.hash;
    }

    public final int getIndex() {
        return this.index;
    }

    public final long getLength() {
        return this.length;
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getMsgUuid() {
        return this.msgUuid;
    }

    public final String getRemoteUrl() {
        return this.remoteUrl;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getType() {
        return this.type;
    }

    public final int getUploadProgress() {
        return this.uploadProgress;
    }

    public final String getExtStr() {
        return b.a(this.ext);
    }

    public final Uri getLocalUri() {
        return Uri.fromFile(new File(this.localPath));
    }

    public final String toString() {
        return "Attachment{msgUuid='" + this.msgUuid + '\'' + ", localPath='" + this.localPath + '\'' + ", remoteUrl='" + this.remoteUrl + '\'' + ", length=" + this.length + ", type='" + this.type + '\'' + ", index=" + this.index + ", uploadProgress=" + this.uploadProgress + ", ext=" + this.ext + ", status=" + this.status + ", hash='" + this.hash + '\'' + ", displayType='" + this.displayType + '\'' + ", mimeType='" + this.mimeType + '\'' + '}';
    }

    public final void setDisplayType(String str) {
        this.displayType = str;
    }

    public final void setExt(Map<String, String> map) {
        this.ext = map;
    }

    public final void setHash(String str) {
        this.hash = str;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setLength(long j) {
        this.length = j;
    }

    public final void setLocalPath(String str) {
        this.localPath = str;
    }

    public final void setMimeType(String str) {
        this.mimeType = str;
    }

    public final void setMsgUuid(String str) {
        this.msgUuid = str;
    }

    public final void setRemoteUrl(String str) {
        this.remoteUrl = str;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setUploadProgress(int i) {
        this.uploadProgress = i;
    }

    public final void setExtStr(String str) {
        this.ext = b.a(str);
    }

    public final void setLocalUri(Uri uri) {
        String str;
        if (uri != null) {
            str = uri.getPath();
        } else {
            str = "";
        }
        this.localPath = str;
    }
}
