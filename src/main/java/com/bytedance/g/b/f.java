package com.bytedance.g.b;

import com.bytedance.g.b;
import com.bytedance.g.c;
import com.bytedance.g.d;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

public final class f implements Serializable, Cloneable {
    public String adSystem;
    public String adTitle;
    public List<a> adVerificationList;
    public List<b> creativeList;
    public String description;
    public Set<String> errorSet;
    public Set<String> impressionSet;
    public Set<String> notViewableSet;
    public String version;
    public Set<String> viewUndeterminedSet;
    public Set<String> viewableSet;

    public final Boolean parseContent(String str, int i) {
        return Boolean.valueOf(new d(this).b(str, i));
    }

    public final Boolean parseUri(String str, int i) {
        return Boolean.valueOf(new d(this).a(str, i));
    }

    public final Boolean parseContent(String str, int i, b bVar) {
        return Boolean.valueOf(new d(this, bVar).b(str, i));
    }

    public final Boolean parseUri(String str, int i, b bVar) {
        return Boolean.valueOf(new d(this, bVar).a(str, i));
    }

    public final Boolean parseContent(String str, int i, b bVar, c cVar) {
        return Boolean.valueOf(new d(this, bVar, cVar).b(str, i));
    }

    public final Boolean parseUri(String str, int i, b bVar, c cVar) {
        return Boolean.valueOf(new d(this, bVar, cVar).a(str, i));
    }
}
