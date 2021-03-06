package com.github.alexthe666.alexsmobs.entity;

import com.github.alexthe666.alexsmobs.AlexsMobs;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.tags.ITag;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.lang.reflect.Field;
import java.util.Random;
import java.util.function.Predicate;

@Mod.EventBusSubscriber(modid = AlexsMobs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AMEntityRegistry {

    public static final EntityType<EntityGrizzlyBear> GRIZZLY_BEAR = registerEntity(EntityType.Builder.create(EntityGrizzlyBear::new, EntityClassification.CREATURE).size(1.45F, 1.75F), "grizzly_bear");
    public static final EntityType<EntityRoadrunner> ROADRUNNER = registerEntity(EntityType.Builder.create(EntityRoadrunner::new, EntityClassification.CREATURE).size(0.45F, 0.75F), "roadrunner");
    public static final EntityType<EntityBoneSerpent> BONE_SERPENT = registerEntity(EntityType.Builder.create(EntityBoneSerpent::new, EntityClassification.MONSTER).size(1.2F, 1.15F).immuneToFire(), "bone_serpent");
    public static final EntityType<EntityBoneSerpentPart> BONE_SERPENT_PART = registerEntity(EntityType.Builder.create(EntityBoneSerpentPart::new, EntityClassification.MONSTER).size(1F, 1F).immuneToFire(), "bone_serpent_part");
    public static final EntityType<EntityGazelle> GAZELLE = registerEntity(EntityType.Builder.create(EntityGazelle::new, EntityClassification.CREATURE).size(0.85F, 1.25F), "gazelle");
    public static final EntityType<EntityCrocodile> CROCODILE = registerEntity(EntityType.Builder.create(EntityCrocodile::new, EntityClassification.WATER_CREATURE).size(2.15F, 0.75F), "crocodile");
    public static final EntityType<EntityFly> FLY = registerEntity(EntityType.Builder.create(EntityFly::new, EntityClassification.CREATURE).size(0.35F, 0.35F), "fly");
    public static final EntityType<EntityHummingbird> HUMMINGBIRD = registerEntity(EntityType.Builder.create(EntityHummingbird::new, EntityClassification.CREATURE).size(0.45F, 0.45F), "hummingbird");
    public static final EntityType<EntityOrca> ORCA = registerEntity(EntityType.Builder.create(EntityOrca::new, EntityClassification.WATER_CREATURE).size(3.75F, 1.75F), "orca");
    public static final EntityType<EntitySunbird> SUNBIRD = registerEntity(EntityType.Builder.create(EntitySunbird::new, EntityClassification.CREATURE).size(1.75F, 0.75F).immuneToFire().setTrackingRange(10).setShouldReceiveVelocityUpdates(true).setUpdateInterval(1), "sunbird");
    public static final EntityType<EntityGorilla> GORILLA = registerEntity(EntityType.Builder.create(EntityGorilla::new, EntityClassification.CREATURE).size(1.15F, 1.35F), "gorilla");
    public static final EntityType<EntityCrimsonMosquito> CRIMSON_MOSQUITO = registerEntity(EntityType.Builder.create(EntityCrimsonMosquito::new, EntityClassification.CREATURE).size(1.25F, 1.15F).immuneToFire(), "crimson_mosquito");
    public static final EntityType<EntityMosquitoSpit> MOSQUITO_SPIT = registerEntity(EntityType.Builder.create(EntityMosquitoSpit::new, EntityClassification.MISC).size(0.5F, 0.5F).setCustomClientFactory(EntityMosquitoSpit::new).immuneToFire(), "mosquito_spit");
    public static final EntityType<EntityRattlesnake> RATTLESNAKE = registerEntity(EntityType.Builder.create(EntityRattlesnake::new, EntityClassification.CREATURE).size(0.95F, 0.35F), "rattlesnake");
    public static final EntityType<EntityEndergrade> ENDERGRADE = registerEntity(EntityType.Builder.create(EntityEndergrade::new, EntityClassification.CREATURE).size(0.95F, 0.85F), "endergrade");
    public static final EntityType<EntityHammerheadShark> HAMMERHEAD_SHARK = registerEntity(EntityType.Builder.create(EntityHammerheadShark::new, EntityClassification.CREATURE).size(2.4F, 1.25F), "hammerhead_shark");
    public static final EntityType<EntitySharkToothArrow> SHARK_TOOTH_ARROW = registerEntity(EntityType.Builder.create(EntitySharkToothArrow::new, EntityClassification.MISC).size(0.5F, 0.5F).setCustomClientFactory(EntitySharkToothArrow::new), "shark_tooth_arrow");
    public static final EntityType<EntityLobster> LOBSTER = registerEntity(EntityType.Builder.create(EntityLobster::new, EntityClassification.WATER_AMBIENT).size(0.7F, 0.4F), "lobster");
    public static final EntityType<EntityKomodoDragon> KOMODO_DRAGON = registerEntity(EntityType.Builder.create(EntityKomodoDragon::new, EntityClassification.CREATURE).size(2.15F, 0.75F), "komodo_dragon");
    public static final EntityType<EntityCapuchinMonkey> CAPUCHIN_MONKEY = registerEntity(EntityType.Builder.create(EntityCapuchinMonkey::new, EntityClassification.CREATURE).size(0.65F, 0.75F), "capuchin_monkey");
    public static final EntityType<EntityTossedItem> TOSSED_ITEM = registerEntity(EntityType.Builder.create(EntityTossedItem::new, EntityClassification.MISC).size(0.5F, 0.5F).setCustomClientFactory(EntityTossedItem::new).immuneToFire(), "tossed_item");
    public static final EntityType<EntityCentipedeHead> CENTIPEDE_HEAD = registerEntity(EntityType.Builder.create(EntityCentipedeHead::new, EntityClassification.CREATURE).size(0.9F, 0.9F), "centipede_head");
    public static final EntityType<EntityCentipedeBody> CENTIPEDE_BODY = registerEntity(EntityType.Builder.create(EntityCentipedeBody::new, EntityClassification.CREATURE).size(0.9F, 0.9F).immuneToFire(), "centipede_body");
    public static final EntityType<EntityCentipedeTail> CENTIPEDE_TAIL = registerEntity(EntityType.Builder.create(EntityCentipedeTail::new, EntityClassification.CREATURE).size(0.9F, 0.9F).immuneToFire(), "centipede_tail");
    public static final EntityType<EntityWarpedToad> WARPED_TOAD = registerEntity(EntityType.Builder.create(EntityWarpedToad::new, EntityClassification.CREATURE).size(0.9F, 1.4F).immuneToFire().setShouldReceiveVelocityUpdates(true).setUpdateInterval(1), "warped_toad");
    public static final EntityType<EntityMoose> MOOSE = registerEntity(EntityType.Builder.create(EntityMoose::new, EntityClassification.CREATURE).size(1.7F, 2.4F), "moose");
    public static final EntityType<EntityMimicube> MIMICUBE = registerEntity(EntityType.Builder.create(EntityMimicube::new, EntityClassification.MONSTER).size(0.9F, 0.9F), "mimicube");
    public static final EntityType<EntityRaccoon> RACCOON = registerEntity(EntityType.Builder.create(EntityRaccoon::new, EntityClassification.CREATURE).size(0.8F, 0.9F), "raccoon");
    public static final EntityType<EntityBlobfish> BLOBFISH = registerEntity(EntityType.Builder.create(EntityBlobfish::new, EntityClassification.WATER_AMBIENT).size(0.7F, 0.45F), "blobfish");
    public static final EntityType<EntitySeal> SEAL = registerEntity(EntityType.Builder.create(EntitySeal::new, EntityClassification.CREATURE).size(1.3F, 0.7F), "seal");
    public static final EntityType<EntityCockroach> COCKROACH = registerEntity(EntityType.Builder.create(EntityCockroach::new, EntityClassification.AMBIENT).size(0.7F, 0.3F), "cockroach");
    public static final EntityType<EntityCockroachEgg> COCKROACH_EGG = registerEntity(EntityType.Builder.create(EntityCockroachEgg::new, EntityClassification.MISC).size(0.5F, 0.5F).setCustomClientFactory(EntityCockroachEgg::new).immuneToFire(), "cockroach_egg");
    public static final EntityType<EntityShoebill> SHOEBILL = registerEntity(EntityType.Builder.create(EntityShoebill::new, EntityClassification.CREATURE).size(0.8F, 1.5F).setUpdateInterval(1), "shoebill");
    public static final EntityType<EntityElephant> ELEPHANT = registerEntity(EntityType.Builder.create(EntityElephant::new, EntityClassification.CREATURE).size(2.1F, 2.5F).setUpdateInterval(1), "elephant");
    public static final EntityType<EntitySoulVulture> SOUL_VULTURE = registerEntity(EntityType.Builder.create(EntitySoulVulture::new, EntityClassification.MONSTER).size(0.9F, 1.3F).setUpdateInterval(1).immuneToFire(), "soul_vulture");
    public static final EntityType<EntitySnowLeopard> SNOW_LEOPARD = registerEntity(EntityType.Builder.create(EntitySnowLeopard::new, EntityClassification.CREATURE).size(1.2F, 1.3F), "snow_leopard");
    public static final EntityType<EntitySpectre> SPECTRE = registerEntity(EntityType.Builder.create(EntitySpectre::new, EntityClassification.CREATURE).size(3.15F, 0.8F).immuneToFire().setTrackingRange(10).setShouldReceiveVelocityUpdates(true).setUpdateInterval(1), "spectre");
    public static final EntityType<EntityCrow> CROW = registerEntity(EntityType.Builder.create(EntityCrow::new, EntityClassification.CREATURE).size(0.45F, 0.45F), "crow");
    public static final EntityType<EntityAlligatorSnappingTurtle> ALLIGATOR_SNAPPING_TURTLE = registerEntity(EntityType.Builder.create(EntityAlligatorSnappingTurtle::new, EntityClassification.CREATURE).size(1.25F, 0.65F), "alligator_snapping_turtle");
    public static final EntityType<EntityMungus> MUNGUS = registerEntity(EntityType.Builder.create(EntityMungus::new, EntityClassification.CREATURE).size(0.75F, 1.45F), "mungus");
    public static final EntityType<EntityMantisShrimp> MANTIS_SHRIMP = registerEntity(EntityType.Builder.create(EntityMantisShrimp::new, EntityClassification.WATER_CREATURE).size(1.25F, 1.2F), "mantis_shrimp");

    private static final EntityType registerEntity(EntityType.Builder builder, String entityName) {
        ResourceLocation nameLoc = new ResourceLocation(AlexsMobs.MODID, entityName);
        return (EntityType) builder.build(entityName).setRegistryName(nameLoc);
    }

    static {
        EntitySpawnPlacementRegistry.register(GRIZZLY_BEAR, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);
        EntitySpawnPlacementRegistry.register(ROADRUNNER, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, EntityRoadrunner::canRoadrunnerSpawn);
        EntitySpawnPlacementRegistry.register(BONE_SERPENT, EntitySpawnPlacementRegistry.PlacementType.IN_LAVA, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, EntityBoneSerpent::canBoneSerpentSpawn);
        EntitySpawnPlacementRegistry.register(GAZELLE, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);
        EntitySpawnPlacementRegistry.register(CROCODILE, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, EntityCrocodile::canCrocodileSpawn);
        EntitySpawnPlacementRegistry.register(FLY, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, EntityFly::canFlySpawn);
        EntitySpawnPlacementRegistry.register(HUMMINGBIRD, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING, EntityHummingbird::canHummingbirdSpawn);
        EntitySpawnPlacementRegistry.register(ORCA, EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, EntityOrca::canOrcaSpawn);
        EntitySpawnPlacementRegistry.register(SUNBIRD, EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, EntitySunbird::canSunbirdSpawn);
        EntitySpawnPlacementRegistry.register(GORILLA, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING, EntityGorilla::canGorillaSpawn);
        EntitySpawnPlacementRegistry.register(CRIMSON_MOSQUITO, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, EntityCrimsonMosquito::canMosquitoSpawn);
        EntitySpawnPlacementRegistry.register(RATTLESNAKE, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, EntityRattlesnake::canRattlesnakeSpawn);
        EntitySpawnPlacementRegistry.register(ENDERGRADE, EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, EntityEndergrade::canEndergradeSpawn);
        EntitySpawnPlacementRegistry.register(HAMMERHEAD_SHARK, EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, EntityHammerheadShark::canHammerheadSharkSpawn);
        EntitySpawnPlacementRegistry.register(LOBSTER, EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, EntityLobster::canLobsterSpawn);
        EntitySpawnPlacementRegistry.register(KOMODO_DRAGON, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, EntityKomodoDragon::canKomodoDragonSpawn);
        EntitySpawnPlacementRegistry.register(CAPUCHIN_MONKEY, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING, EntityCapuchinMonkey::canCapuchinSpawn);
        EntitySpawnPlacementRegistry.register(CENTIPEDE_HEAD, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, EntityCentipedeHead::canCentipedeSpawn);
        EntitySpawnPlacementRegistry.register(WARPED_TOAD, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING, EntityWarpedToad::canWarpedToadSpawn);
        EntitySpawnPlacementRegistry.register(MOOSE, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, EntityMoose::canMooseSpawn);
        EntitySpawnPlacementRegistry.register(MIMICUBE, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MobEntity::canSpawnOn);
        EntitySpawnPlacementRegistry.register(RACCOON, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);
        EntitySpawnPlacementRegistry.register(BLOBFISH, EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, EntityBlobfish::canBlobfishSpawn);
        EntitySpawnPlacementRegistry.register(SEAL, EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, EntitySeal::canSealSpawn);
        EntitySpawnPlacementRegistry.register(COCKROACH, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, EntityCockroach::canCockroachSpawn);
        EntitySpawnPlacementRegistry.register(SHOEBILL, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);
        EntitySpawnPlacementRegistry.register(ELEPHANT, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);
        EntitySpawnPlacementRegistry.register(SOUL_VULTURE, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, EntitySoulVulture::canVultureSpawn);
        EntitySpawnPlacementRegistry.register(ALLIGATOR_SNAPPING_TURTLE, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, EntityAlligatorSnappingTurtle::canTurtleSpawn);
        EntitySpawnPlacementRegistry.register(MUNGUS, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, EntityMungus::canMungusSpawn);
        EntitySpawnPlacementRegistry.register(MANTIS_SHRIMP, EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, EntityMantisShrimp::canMantisShrimpSpawn);
    }

        @SubscribeEvent
    public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) {
        try {
            for (Field f : AMEntityRegistry.class.getDeclaredFields()) {
                Object obj = f.get(null);
                if (obj instanceof EntityType) {
                    event.getRegistry().register((EntityType) obj);
                } else if (obj instanceof EntityType[]) {
                    for (EntityType type : (EntityType[]) obj) {
                        event.getRegistry().register(type);
                    }
                }
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        initializeAttributes();
    }

    private static void initializeAttributes() {
        GlobalEntityTypeAttributes.put(GRIZZLY_BEAR, EntityGrizzlyBear.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(ROADRUNNER, EntityRoadrunner.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(BONE_SERPENT, EntityBoneSerpent.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(BONE_SERPENT_PART, EntityBoneSerpentPart.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(GAZELLE, EntityGazelle.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(CROCODILE, EntityCrocodile.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(FLY, EntityFly.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(HUMMINGBIRD, EntityHummingbird.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(ORCA, EntityOrca.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(SUNBIRD, EntitySunbird.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(GORILLA, EntityGorilla.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(CRIMSON_MOSQUITO, EntityCrimsonMosquito.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(RATTLESNAKE, EntityRattlesnake.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(ENDERGRADE, EntityEndergrade.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(HAMMERHEAD_SHARK, EntityHammerheadShark.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(LOBSTER, EntityLobster.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(KOMODO_DRAGON, EntityKomodoDragon.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(CAPUCHIN_MONKEY, EntityCapuchinMonkey.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(CENTIPEDE_HEAD, EntityCentipedeHead.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(CENTIPEDE_BODY, EntityCentipedeBody.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(CENTIPEDE_TAIL, EntityCentipedeTail.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(WARPED_TOAD, EntityWarpedToad.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(MOOSE, EntityMoose.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(MIMICUBE, EntityMimicube.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(RACCOON, EntityRaccoon.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(BLOBFISH, EntityBlobfish.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(SEAL, EntitySeal.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(COCKROACH, EntityCockroach.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(SHOEBILL, EntityShoebill.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(ELEPHANT, EntityElephant.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(SOUL_VULTURE, EntitySoulVulture.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(SNOW_LEOPARD, EntitySnowLeopard.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(SPECTRE, EntitySpectre.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(CROW, EntityCrow.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(ALLIGATOR_SNAPPING_TURTLE, EntityAlligatorSnappingTurtle.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(MUNGUS, EntityMungus.bakeAttributes().create());
        GlobalEntityTypeAttributes.put(MANTIS_SHRIMP, EntityMantisShrimp.bakeAttributes().create());
    }

    public static Predicate<LivingEntity> buildPredicateFromTag(ITag entityTag){
        return (com.google.common.base.Predicate<LivingEntity>) e -> e.isAlive() && e.getType().isContained(entityTag);
    }

    public static boolean rollSpawn(int rolls, Random random, SpawnReason reason){
        if(reason == SpawnReason.SPAWNER){
            return true;
        }else{
            return rolls <= 0 || random.nextInt(rolls) == 0;
        }
    }

}
