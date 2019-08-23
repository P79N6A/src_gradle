package org.msgpack.template;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.msgpack.c;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class MapTemplate<K, V> extends AbstractTemplate<Map<K, V>> {
    private Template<K> keyTemplate;
    private Template<V> valueTemplate;

    public MapTemplate(Template<K> template, Template<V> template2) {
        this.keyTemplate = template;
        this.valueTemplate = template2;
    }

    public Map<K, V> read(Unpacker unpacker, Map<K, V> map, boolean z) throws IOException {
        if (!z && unpacker.trySkipNil()) {
            return null;
        }
        int readMapBegin = unpacker.readMapBegin();
        if (map != null) {
            map.clear();
        } else {
            map = new HashMap<>(readMapBegin);
        }
        for (int i = 0; i < readMapBegin; i++) {
            map.put(this.keyTemplate.read(unpacker, null), this.valueTemplate.read(unpacker, null));
        }
        unpacker.readMapEnd();
        return map;
    }

    public void write(Packer packer, Map<K, V> map, boolean z) throws IOException {
        if (map instanceof Map) {
            packer.writeMapBegin(map.size());
            for (Map.Entry next : map.entrySet()) {
                this.keyTemplate.write(packer, next.getKey());
                this.valueTemplate.write(packer, next.getValue());
            }
            packer.writeMapEnd();
        } else if (map != null) {
            throw new c("Target is not a Map but " + map.getClass());
        } else if (!z) {
            packer.writeNil();
        } else {
            throw new c("Attempted to write null");
        }
    }
}
