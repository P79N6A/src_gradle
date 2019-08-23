package anet.channel;

import anet.channel.entity.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final Map<SessionRequest, List<Session>> f1182a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final ReentrantReadWriteLock f1183b = new ReentrantReadWriteLock();

    /* renamed from: c  reason: collision with root package name */
    private final ReentrantReadWriteLock.ReadLock f1184c = this.f1183b.readLock();

    /* renamed from: d  reason: collision with root package name */
    private final ReentrantReadWriteLock.WriteLock f1185d = this.f1183b.writeLock();

    d() {
    }

    public List<SessionRequest> a() {
        List<SessionRequest> list = Collections.EMPTY_LIST;
        this.f1184c.lock();
        try {
            if (this.f1182a.isEmpty()) {
                return list;
            }
            ArrayList arrayList = new ArrayList(this.f1182a.keySet());
            this.f1184c.unlock();
            return arrayList;
        } finally {
            this.f1184c.unlock();
        }
    }

    public List<Session> a(SessionRequest sessionRequest) {
        this.f1184c.lock();
        try {
            List list = this.f1182a.get(sessionRequest);
            if (list != null) {
                ArrayList arrayList = new ArrayList(list);
                return arrayList;
            }
            List<Session> list2 = Collections.EMPTY_LIST;
            this.f1184c.unlock();
            return list2;
        } finally {
            this.f1184c.unlock();
        }
    }

    public void b(SessionRequest sessionRequest, Session session) {
        this.f1185d.lock();
        try {
            List list = this.f1182a.get(sessionRequest);
            if (list != null) {
                list.remove(session);
                if (list.size() == 0) {
                    this.f1182a.remove(sessionRequest);
                }
                this.f1185d.unlock();
            }
        } finally {
            this.f1185d.unlock();
        }
    }

    public boolean c(SessionRequest sessionRequest, Session session) {
        this.f1184c.lock();
        try {
            List list = this.f1182a.get(sessionRequest);
            boolean z = false;
            if (list != null) {
                if (list.indexOf(session) != -1) {
                    z = true;
                }
            }
            return z;
        } finally {
            this.f1184c.unlock();
        }
    }

    public Session a(SessionRequest sessionRequest, int i) {
        this.f1184c.lock();
        try {
            List list = this.f1182a.get(sessionRequest);
            Session session = null;
            if (list != null) {
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Session session2 = (Session) it2.next();
                        if (session2 != null && session2.isAvailable()) {
                            if (i == c.f1213c || session2.j.getType() == i) {
                                session = session2;
                            }
                        }
                    }
                    this.f1184c.unlock();
                    return session;
                }
            }
            return null;
        } finally {
            this.f1184c.unlock();
        }
    }

    public void a(SessionRequest sessionRequest, Session session) {
        if (sessionRequest != null && sessionRequest.a() != null && session != null) {
            this.f1185d.lock();
            try {
                List list = this.f1182a.get(sessionRequest);
                if (list == null) {
                    list = new ArrayList();
                    this.f1182a.put(sessionRequest, list);
                }
                if (list.indexOf(session) == -1) {
                    list.add(session);
                    Collections.sort(list);
                    this.f1185d.unlock();
                }
            } finally {
                this.f1185d.unlock();
            }
        }
    }
}
