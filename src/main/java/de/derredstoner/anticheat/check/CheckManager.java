package de.derredstoner.anticheat.check;

import de.derredstoner.anticheat.check.impl.combat.autoclicker.*;
import de.derredstoner.anticheat.check.impl.combat.hitbox.*;
import de.derredstoner.anticheat.check.impl.combat.aim.*;
import de.derredstoner.anticheat.check.impl.combat.killaura.*;
import de.derredstoner.anticheat.check.impl.combat.reach.ReachA;
import de.derredstoner.anticheat.check.impl.combat.velocity.*;
import de.derredstoner.anticheat.check.impl.movement.fly.*;
import de.derredstoner.anticheat.check.impl.movement.jesus.*;
import de.derredstoner.anticheat.check.impl.movement.move.*;
import de.derredstoner.anticheat.check.impl.movement.speed.*;
import de.derredstoner.anticheat.check.impl.packet.badpacket.*;
import de.derredstoner.anticheat.check.impl.packet.nofall.*;
import de.derredstoner.anticheat.check.impl.packet.timer.*;
import de.derredstoner.anticheat.check.impl.player.baritone.BaritoneA;
import de.derredstoner.anticheat.check.impl.player.inventory.*;
import de.derredstoner.anticheat.check.impl.player.scaffold.*;
import de.derredstoner.anticheat.data.PlayerData;

import java.util.ArrayList;
import java.util.List;

public class CheckManager {

    public static List<Check> getChecks(PlayerData data) {
        List<Check> checks = new ArrayList<>();

        checks.add(new AimA(data));
        checks.add(new AimB(data));
        checks.add(new AimC(data));
        checks.add(new AimD(data));
        checks.add(new AimE(data));
        checks.add(new AimF(data));

        checks.add(new AutoClickerA(data));
        checks.add(new AutoClickerB(data));
        checks.add(new AutoClickerC(data));
        checks.add(new AutoClickerD(data));

        checks.add(new HitboxA(data));
        checks.add(new HitboxB(data));

        checks.add(new KillAuraA(data));
        checks.add(new KillAuraB(data));
        checks.add(new KillAuraC(data));
        checks.add(new KillAuraD(data));
        checks.add(new KillAuraE(data));
        checks.add(new KillAuraF(data));

        checks.add(new ReachA(data));

        checks.add(new VelocityA(data));
        checks.add(new VelocityB(data));

        checks.add(new FlyA(data));
        checks.add(new FlyB(data));

        checks.add(new JesusA(data));

        checks.add(new MoveA(data));
        checks.add(new MoveB(data));
        checks.add(new MoveC(data));
        checks.add(new MoveD(data));
        checks.add(new MoveE(data));
        checks.add(new MoveF(data));
        checks.add(new MoveG(data));

        checks.add(new SpeedA(data));
        checks.add(new SpeedB(data));

        checks.add(new BadPacketA(data));
        checks.add(new BadPacketB(data));
        checks.add(new BadPacketC(data));
        checks.add(new BadPacketD(data));
        checks.add(new BadPacketE(data));
        checks.add(new BadPacketF(data));
        checks.add(new BadPacketG(data));
        checks.add(new BadPacketH(data));
        checks.add(new BadPacketI(data));
        checks.add(new BadPacketJ(data));

        checks.add(new NoFallA(data));
        checks.add(new NoFallB(data));

        checks.add(new TimerA(data));

        checks.add(new BaritoneA(data));

        checks.add(new InventoryA(data));
        checks.add(new InventoryB(data));
        checks.add(new InventoryC(data));

        checks.add(new ScaffoldA(data));
        checks.add(new ScaffoldB(data));
        checks.add(new ScaffoldC(data));
        checks.add(new ScaffoldD(data));
        checks.add(new ScaffoldE(data));
        checks.add(new ScaffoldF(data));
        checks.add(new ScaffoldG(data));
        checks.add(new ScaffoldH(data));
        checks.add(new ScaffoldI(data));

        return checks;
    }

}
