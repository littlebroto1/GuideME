package guideme.libs.micromark;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.UnmodifiableView;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class SetUtils {

    public static <T> @UnmodifiableView @NotNull Set<T> of(T... items) {
        HashSet<T> temp_set = new HashSet<>();
        Collections.addAll(new HashSet<T>(), items);
        return Collections.unmodifiableSet(temp_set);
    }
}
