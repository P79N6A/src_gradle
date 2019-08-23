package com.alibaba.sdk.android.httpdns.a;

import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.util.ArrayList;
import java.util.Iterator;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<g> f5085a;
    public long id;
    public String j;
    public String k;
    public String l;

    public String toString() {
        StringBuilder sb = new StringBuilder(SearchJediMixFeedAdapter.f42517f);
        sb.append("[HostRecord] ");
        sb.append("id:");
        sb.append(this.id);
        sb.append("|");
        sb.append("host:");
        sb.append(this.j);
        sb.append("|");
        sb.append("sp:");
        sb.append(this.k);
        sb.append("|");
        sb.append("time:");
        sb.append(this.l);
        sb.append("|");
        sb.append("ips:");
        if (this.f5085a != null && this.f5085a.size() > 0) {
            Iterator<g> it2 = this.f5085a.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next());
            }
        }
        sb.append("|");
        return sb.toString();
    }
}
