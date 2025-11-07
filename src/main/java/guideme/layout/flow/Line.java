package guideme.layout.flow;

import java.util.Objects;
import java.util.stream.Stream;

import guideme.document.LytRect;

record Line(LytRect bounds, LineElement firstElement) {

    Stream<LineElement> elements() {
        return Stream.iterate(firstElement, Objects::nonNull, el -> el.next);
    }
}
