package org.android.spdy;

public class SessionInfo {
    private static int INVALID_PUBLIC_SEQNUM = -1;
    private String certHost;
    private int connTimeoutMs = -1;
    private String domain;
    private String host;
    private int mode;
    private int port;
    private String proxyHost;
    private int proxyPort;
    private int pubkey_seqnum = INVALID_PUBLIC_SEQNUM;
    private SessionCb sessionCb;
    private Object sessionUserData;

    /* access modifiers changed from: package-private */
    public int getConnectionTimeoutMs() {
        return this.connTimeoutMs;
    }

    /* access modifiers changed from: package-private */
    public String getDomain() {
        return this.domain;
    }

    /* access modifiers changed from: package-private */
    public int getMode() {
        return this.mode;
    }

    /* access modifiers changed from: package-private */
    public int getPubKeySeqNum() {
        return this.pubkey_seqnum;
    }

    /* access modifiers changed from: package-private */
    public SessionCb getSessionCb() {
        return this.sessionCb;
    }

    /* access modifiers changed from: package-private */
    public Object getSessonUserData() {
        return this.sessionUserData;
    }

    /* access modifiers changed from: package-private */
    public String getCertHost() {
        if (this.pubkey_seqnum != INVALID_PUBLIC_SEQNUM) {
            return null;
        }
        return this.certHost;
    }

    /* access modifiers changed from: package-private */
    public String getAuthority() {
        if (this.proxyHost == null || this.proxyPort == 0) {
            return this.host + ":" + this.port;
        }
        return this.host + ":" + this.port + "/" + this.proxyHost + ":" + this.proxyPort;
    }

    public void setCertHost(String str) {
        this.certHost = str;
    }

    public void setConnectionTimeoutMs(int i) {
        this.connTimeoutMs = i;
    }

    public void setPubKeySeqNum(int i) {
        this.pubkey_seqnum = i;
    }

    public SessionInfo(String str, int i, String str2, String str3, int i2, Object obj, SessionCb sessionCb2, int i3) {
        this.host = str;
        this.port = i;
        this.domain = str2;
        this.proxyHost = str3;
        this.proxyPort = i2;
        this.sessionUserData = obj;
        this.sessionCb = sessionCb2;
        this.mode = i3;
    }
}
