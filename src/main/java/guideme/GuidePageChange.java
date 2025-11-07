package guideme;

import net.minecraft.resources.ResourceLocation;

import org.jetbrains.annotations.Nullable;

import guideme.compiler.ParsedGuidePage;

public record GuidePageChange(@Nullable String language, ResourceLocation pageId, @Nullable ParsedGuidePage oldPage,
    @Nullable ParsedGuidePage newPage) {

    @Deprecated(forRemoval = true)
    public GuidePageChange(ResourceLocation pageId, @Nullable ParsedGuidePage oldPage,
        @Nullable ParsedGuidePage newPage) {
        this(null, pageId, oldPage, newPage);
    }
}
