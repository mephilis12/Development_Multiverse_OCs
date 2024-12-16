package net.mephilis.devocs.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class StephanBlock extends Block {
    public StephanBlock(Settings settings) {
        super(settings);
    }
    public static final DirectionProperty HORIZONTAL_FACING = DirectionProperty.of("facing", Direction.Type.HORIZONTAL);

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return Block.createCuboidShape(0,0,0,0,2,0);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {

            if (state.get(HORIZONTAL_FACING) == Direction.NORTH){
                return VoxelShapes.union(
                        VoxelShapes.cuboid(0, 0, 0, 1, 2, 1)
                );
            }
            if (state.get(HORIZONTAL_FACING) == Direction.SOUTH){
                return VoxelShapes.union(
                        VoxelShapes.cuboid(0, 0, 0, 1, 2, 1)
                );
            }
            if (state.get(HORIZONTAL_FACING) == Direction.WEST){
                return VoxelShapes.union(
                        VoxelShapes.cuboid(0, 0, 0, 1, 2, 1)
                );
            }
            if (state.get(HORIZONTAL_FACING) == Direction.EAST){
                return VoxelShapes.union(
                        VoxelShapes.cuboid(0, 0, 0, 1, 2, 1)
                );
            }
            return VoxelShapes.union(
                    VoxelShapes.cuboid(0, 0, 0, 1, 2, 1)
            );
        }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(HORIZONTAL_FACING);
    }
}

