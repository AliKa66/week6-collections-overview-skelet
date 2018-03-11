package be.pxl.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class SolarSystemApp {
    public static void main(String[] args) {
        Set<HeavenlyBody> planets = new HashSet<>();

        planets.add(new HeavenlyBody("Mercury", 88));
        planets.add(new HeavenlyBody("Venus", 225));
        HeavenlyBody earth = new HeavenlyBody("Earth", 365);
        earth.addMoon(new HeavenlyBody("Moon", 27));
        planets.add(earth);

        HeavenlyBody jupiter = new HeavenlyBody("Jupiter", 4332);
        jupiter.addMoon(new HeavenlyBody("Io", 1.8));
        jupiter.addMoon(new HeavenlyBody("Europa", 3.5));
        jupiter.addMoon(new HeavenlyBody("Ganymede", 7.1));
        jupiter.addMoon(new HeavenlyBody("Ganymede", 1.5));
        jupiter.addMoon(new HeavenlyBody("Callisto", 16.7));
        planets.add(jupiter);

        HeavenlyBody mars = new HeavenlyBody("Mars", 687);
        mars.addMoon(new HeavenlyBody("Deimos", 1.3));
        mars.addMoon(new HeavenlyBody("Phobos", 0.3));
        planets.add(mars);

        planets.add(new HeavenlyBody("Mars", 690));

        planets.forEach(planet -> System.out.println(planet));

        System.out.println("Some moons of Jupiter: ");
        jupiter.getSatellites().forEach(moon -> System.out.println(moon));



    }
}
