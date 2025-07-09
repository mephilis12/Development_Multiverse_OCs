package net.mephilis.devocs.world.tree;

import net.mephilis.devocs.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSapplingGenerators {
    public static final SaplingGenerator POLY =
            new SaplingGenerator("poly", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(ModConfiguredFeatures.POLY_KEY),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty()
                    );

    }

