package guideme;

import net.minecraft.resources.ResourceLocation;

import org.jetbrains.annotations.ApiStatus;

import guideme.extensions.ExtensionCollection;

@ApiStatus.NonExtendable
public interface Guide extends PageCollection {

    static GuideBuilder builder(ResourceLocation id) {
        return new GuideBuilder(id);
    }

    ResourceLocation getId();

    ResourceLocation getStartPage();

    String getDefaultNamespace();

    String getContentRootFolder();

    ExtensionCollection getExtensions();
}
