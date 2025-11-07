package guideme;

import net.minecraft.resources.ResourceLocation;

import guideme.document.block.LytDocument;

public record GuidePage(String sourcePack, ResourceLocation id, LytDocument document) {}
