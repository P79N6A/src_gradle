package com.ss.android.ugc.effectmanager.link.model.host;

import com.ss.android.ugc.effectmanager.link.model.blackRoom.BlackRoomItem;
import java.net.URI;

public class Host extends BlackRoomItem {
    public String host;
    public int port = -1;
    public String schema;
    public long sortTime;
    public long weightTime;

    public long getSortTime() {
        return this.sortTime + this.weightTime;
    }

    public String getItemName() {
        String str = this.schema + "://" + this.host;
        if (this.port == -1) {
            return str;
        }
        return str + ":" + this.port;
    }

    public String toString() {
        return "Host{weightTime=" + this.weightTime + ", schema='" + this.schema + '\'' + ", host='" + this.host + '\'' + '}';
    }

    public Host(String str) {
        URI create = URI.create(str);
        this.host = create.getHost();
        this.schema = create.getScheme();
        this.port = create.getPort();
    }

    public boolean hostEquals(Host host2) {
        if (host2 != null && host2.host.equals(this.host) && host2.schema.equals(this.schema)) {
            return true;
        }
        return false;
    }

    public Host(URI uri) {
        this.host = uri.getHost();
        this.schema = uri.getScheme();
    }

    public Host(String str, String str2) {
        this.host = str;
        this.schema = str2;
    }

    public Host(String str, String str2, long j) {
        this.host = str;
        this.schema = str2;
        this.weightTime = j;
    }
}
