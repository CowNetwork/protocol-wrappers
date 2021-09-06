package network.cow.protocol.wrappers;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.wrappers.EnumWrappers;

/**
 * @author Benedikt Wüller
 */
public class WrapperPlayClientDig extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.BLOCK_DIG;

    public WrapperPlayClientDig() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayClientDig(PacketContainer packet) {
        super(packet, TYPE);
    }

    public BlockPosition getLocation() {
        return this.handle.getBlockPositionModifier().read(0);
    }

    public void setLocation(final BlockPosition position) {
        this.handle.getBlockPositionModifier().write(0, position);
    }

    public EnumWrappers.Direction getDirection() {
        return this.handle.getDirections().read(0);
    }

    public void setDirection(final EnumWrappers.Direction direction) {
        this.handle.getDirections().write(0, direction);
    }

    public EnumWrappers.PlayerDigType getStatus() {
        return this.handle.getPlayerDigTypes().read(0);
    }

    public void setStatus(final EnumWrappers.PlayerDigType status) {
        this.handle.getPlayerDigTypes().write(0, status);
    }

}
