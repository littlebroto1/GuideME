package guideme.libs.micromark;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.UnmodifiableView;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class MapUtils {

    public static <K, V> @UnmodifiableView @NotNull Map<K, V> of(K k1, V v1) {
        HashMap<K,V> temp_map = new HashMap<K, V>();
        temp_map.put(k1, v1);
        return Collections.unmodifiableMap(temp_map);
    }

    public static <K, V> @UnmodifiableView @NotNull Map<K, V> of(K k1, V v1,
                                                                 K k2, V v2) {
        HashMap<K,V> temp_map = new HashMap<K, V>();
        temp_map.put(k1, v1);
        temp_map.put(k2, v2);
        return Collections.unmodifiableMap(temp_map);
    }

    public static <K, V> @UnmodifiableView @NotNull Map<K, V> of(K k1, V v1,
                                                                 K k2, V v2,
                                                                 K k3, V v3) {
        HashMap<K,V> temp_map = new HashMap<K, V>();
        temp_map.put(k1, v1);
        temp_map.put(k2, v2);
        temp_map.put(k3, v3);
        return Collections.unmodifiableMap(temp_map);
    }

    public static <K, V> @UnmodifiableView @NotNull Map<K, V> of(K k1, V v1,
                                                                 K k2, V v2,
                                                                 K k3, V v3,
                                                                 K k4, V v4) {
        HashMap<K,V> temp_map = new HashMap<K, V>();
        temp_map.put(k1, v1);
        temp_map.put(k2, v2);
        temp_map.put(k3, v3);
        temp_map.put(k4, v4);
        return Collections.unmodifiableMap(temp_map);
    }

    public static <K, V> @UnmodifiableView @NotNull Map<K, V> of(K k1, V v1,
                                                                 K k2, V v2,
                                                                 K k3, V v3,
                                                                 K k4, V v4,
                                                                 K k5, V v5) {
        HashMap<K,V> temp_map = new HashMap<K, V>();
        temp_map.put(k1, v1);
        temp_map.put(k2, v2);
        temp_map.put(k3, v3);
        temp_map.put(k4, v4);
        temp_map.put(k5, v5);
        return Collections.unmodifiableMap(temp_map);
    }

    public static <K, V> @UnmodifiableView @NotNull Map<K, V> of(K k1, V v1,
                                                                 K k2, V v2,
                                                                 K k3, V v3,
                                                                 K k4, V v4,
                                                                 K k5, V v5,
                                                                 K k6, V v6) {
        HashMap<K,V> temp_map = new HashMap<K, V>();
        temp_map.put(k1, v1);
        temp_map.put(k2, v2);
        temp_map.put(k3, v3);
        temp_map.put(k4, v4);
        temp_map.put(k5, v5);
        temp_map.put(k6, v6);
        return Collections.unmodifiableMap(temp_map);
    }

    public static <K, V> @UnmodifiableView @NotNull Map<K, V> of(K k1, V v1,
                                                                 K k2, V v2,
                                                                 K k3, V v3,
                                                                 K k4, V v4,
                                                                 K k5, V v5,
                                                                 K k6, V v6,
                                                                 K k7, V v7) {
        HashMap<K,V> temp_map = new HashMap<K, V>();
        temp_map.put(k1, v1);
        temp_map.put(k2, v2);
        temp_map.put(k3, v3);
        temp_map.put(k4, v4);
        temp_map.put(k5, v5);
        temp_map.put(k6, v6);
        temp_map.put(k7, v7);
        return Collections.unmodifiableMap(temp_map);
    }

    public static <K, V> @UnmodifiableView @NotNull Map<K, V> of(K k1, V v1,
                                                                 K k2, V v2,
                                                                 K k3, V v3,
                                                                 K k4, V v4,
                                                                 K k5, V v5,
                                                                 K k6, V v6,
                                                                 K k7, V v7,
                                                                 K k8, V v8) {
        HashMap<K,V> temp_map = new HashMap<K, V>();
        temp_map.put(k1, v1);
        temp_map.put(k2, v2);
        temp_map.put(k3, v3);
        temp_map.put(k4, v4);
        temp_map.put(k5, v5);
        temp_map.put(k6, v6);
        temp_map.put(k7, v7);
        temp_map.put(k8, v8);
        return Collections.unmodifiableMap(temp_map);
    }
}
