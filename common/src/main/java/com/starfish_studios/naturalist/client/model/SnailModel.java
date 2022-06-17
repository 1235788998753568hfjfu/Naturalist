package com.starfish_studios.naturalist.client.model;

import com.starfish_studios.naturalist.Naturalist;
import com.starfish_studios.naturalist.entity.Snail;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

@Environment(EnvType.CLIENT)
public class SnailModel extends AnimatedGeoModel<Snail> {
    @Override
    public Identifier getModelResource(Snail snail) {
        return new Identifier(Naturalist.MOD_ID, "geo/snail.geo.json");
    }

    @Override
    public Identifier getTextureResource(Snail snail) {
        return new Identifier(Naturalist.MOD_ID, "textures/entity/snail.png");
    }

    @Override
    public Identifier getAnimationResource(Snail snail) {
        return new Identifier(Naturalist.MOD_ID, "animations/snail.animation.json");
    }
}
