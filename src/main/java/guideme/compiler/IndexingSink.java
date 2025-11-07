package guideme.compiler;

import org.jetbrains.annotations.ApiStatus;

import guideme.libs.unist.UnistNode;

/**
 * Sink for indexing page content.
 */
@ApiStatus.NonExtendable
public interface IndexingSink {

    void appendText(UnistNode parent, String text);

    void appendBreak();
}
